package tests;

import Business.UserBusiness;
import Data.GraphData;
import DataStructures.MyListGraph;

import java.io.IOException;
import org.jdom.JDOMException;

public class GraphTest {

    public static void main(String[] args) throws IOException, JDOMException, CloneNotSupportedException {
        test();
    }//main
    
    public static void test() throws JDOMException, IOException{
        
        UserBusiness userBusiness = new UserBusiness();
        GraphData graphData = new GraphData();
        MyListGraph graph = userBusiness.loadGraph();
  
        System.out.println(graph.toStringAristas());
        System.out.println(graph.toStringVertices());

    }//test

}//class
