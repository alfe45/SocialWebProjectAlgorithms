package Data;

import DataStructures.MyListGraph;
import GUI.JFWindow;
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

//    public boolean addNewFriendshipToGraph(String user1, String user2) throws IOException {
//        MyListGraph graph = loadGraph();
//        if (!graph.existEdge(user1, user2)) {
//            System.out.println("No existe, entonces creado");
//            graph.addEdge(user1, user2);
//            saveGraph(graph);
//            JFWindow.socialWebCore.setUsersGraph(graph);
//            JFWindow.socialWebCore.refresh();
//            return true;
//        }//if
//        return false;
//    }//newFriendship

    public MyListGraph loadGraph() {
        return JFWindow.socialWebCore.getUserBusiness().loadGraph();
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

    public boolean existsEdgeInVertex(Element eEdge, Element eVertex) {
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

    public int getNumberOfFriendsInCommon(String user1, String user2) {
        int friendsInCommon = 0;
//        MyListGraph graph = loadGraph();
//        MySimpleLinkedList mylist = new MySimpleLinkedList();
//        mylist.exists(mylist);
//     
//        int a1 = graph.getElementPosition(user1);
//        int b1 = graph.getElementPosition(user2);
//        System.out.println("a: "+a1);
//        System.out.println("a: "+b1);
//        for (int i = 0; i < graph.getVertexEdgeSize(a1); i++) {
////            String tempFriendUser1 = (String)graph.getVertexEdgeValue(a1, i);
////            for (int j = 0; j < graph.getVertexEdgeSize(b1); j++) {
////                String tempFriendUser2 = (String)graph.getVertexEdgeValue(b1, j);
////                if (!mylist.exists(tempFriendUser1)) {
////                    if (tempFriendUser1.equals(tempFriendUser2)) {
////                        friendsInCommon++;
////                        mylist.insert(tempFriendUser1);
////                    }//if
////                }//if
////            }//for
//        }//for
        return friendsInCommon;
    }//existsEdgeInVertex

}//class
