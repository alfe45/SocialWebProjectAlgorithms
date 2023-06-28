
package Data;

import DataStructures.MyListGraph;
import Utility.ElementsXML;
import Utility.FileRutes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
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
        this.rute = FileRutes.USERSPATH;
        File file = new File(this.rute);
        if (file.exists()) {
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);
            this.jdomDocument = saxBuilder.build(file);
            this.root = this.jdomDocument.getRootElement();
        } else {
            this.root = new Element(ElementsXML.ROOT);
            this.jdomDocument = new Document(this.root);
            saveXML();
        }//if
    }
    
    private void saveXML() throws FileNotFoundException, IOException {
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(this.jdomDocument, new PrintWriter(this.rute));
    }//saveXML
    
    public boolean newFriendship(String user1, String user2){
        MyListGraph graph = loadGraph();
        return true;
    }//newFriendship
    
    public MyListGraph loadGraph(){
        MyListGraph graph = new MyListGraph();
        
        return graph;
    }//loadGraph
    
    public boolean saveGraph(MyListGraph graph){

        return true;
    }//saveGraph
    
}//class
