package Data;

import DataStructures.MyListGraph;
import Utility.ElementsXML;
import Utility.FileRutes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class GraphData {

    private Document jdomDocument;
    private Element root;
    private String rute;

    public GraphData() throws JDOMException, IOException {
        this.rute = FileRutes.FRIENDSHIPS_GRAPH_PATH;
        File file = new File(this.rute);
        if (file.exists()) {
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);
            this.jdomDocument = saxBuilder.build(file);
            this.root = this.jdomDocument.getRootElement();
            if (this.root.getChild(ElementsXML.VERTEXES) == null) {
                this.root.addContent(new Element(ElementsXML.VERTEXES));
            }//if
            saveXML();
        } else {
            this.root = new Element(ElementsXML.ROOT_GRAPH);
            this.root.addContent(new Element(ElementsXML.VERTEXES));
            this.jdomDocument = new Document(this.root);
            saveXML();
        }//if
    }

    private void saveXML() throws FileNotFoundException, IOException {
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(this.jdomDocument, new PrintWriter(this.rute));
    }//saveXML

    public boolean addNewFriendshipToGraph(String user1, String user2) throws IOException {
//        MyListGraph graph = loadGraph();
//        if (!graph.existEdge(user1, user2)) {
//            System.out.println("No existe");
//            graph.addEdge(user1, user2);
//            saveGraph(graph);
//            JFWindow.socialWebCore.refresh();
//            return true;
//        }//if
        return false;
    }//newFriendship

    public MyListGraph loadGraph() {
        MyListGraph graph = new MyListGraph();
        List<Element> vertexesList = this.root.getChild(ElementsXML.VERTEXES).getContent();
        for (Element currentVertex : vertexesList) {
            graph.addVertex(currentVertex.getAttribute("from").getValue());
        }//for
        for (Element currentVertex : vertexesList) {
            List<Element> edgesList = currentVertex.getContent();
            for (Element currentEdge : edgesList) {
                graph.addEdge(currentVertex.getAttribute("from").getValue(),
                        currentEdge.getAttribute("to").getValue());
            }//for
        }//for
        return graph;
    }//loadGraph

    public boolean saveGraph(MyListGraph graph) throws IOException {
        this.root.removeChildren(ElementsXML.VERTEXES);
        saveXML();
        this.root.addContent(new Element(ElementsXML.VERTEXES));

        for (int i = 0; i < graph.getSize(); i++) {
            Element eVertex = new Element(ElementsXML.VERTEX);
            eVertex.setAttribute("from", (String) graph.getVertexElement(i));
            int edgesSize = graph.getVertexEdgeSize(i);
            for (int j = 1; j <= edgesSize; j++) {
                Element eEdge = new Element(ElementsXML.EDGE);
                eEdge.setAttribute("to", (String) graph.getVertexEdgeValue(i, j));
                if (!existsEdgeInVertex(eEdge, eVertex)) {
                    eVertex.addContent(eEdge);
                }//if
            }//for
            this.root.getChild(ElementsXML.VERTEXES).addContent(eVertex);
        }//for
        saveXML();
        return true;
    }//saveGraph

    private boolean existsEdgeInVertex(Element eEdge, Element eVertex) {
        String usernameEdge = eEdge.getAttributeValue(eEdge.getAttributeValue("to"));
        List<Element> edgesList = eVertex.getContent();
        for (Element currentEdge : edgesList) {
            String currentValue = currentEdge.getAttributeValue("to");
            if (currentValue.equals(usernameEdge)) {
                return true;
            }//if
        }//for
        return false;
    }//existsEdgeInVertex

}//class
