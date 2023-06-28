package tests;

import Domain.SocialWebCore;
import GUI.JFWindow;
import java.io.IOException;
import org.jdom.JDOMException;

public class GraphTest {

    public static void main(String[] args) throws IOException, JDOMException, CloneNotSupportedException {
        SocialWebCore socialWebCore = new SocialWebCore();
        JFWindow.socialWebCore = socialWebCore;
        System.out.println("/GraphTest.java");

        System.out.println(socialWebCore.getUsersGraph().toStringVertices());
        System.out.println(socialWebCore.getUsersGraph().toStringAristas());

        String user1 = "Alex";
        String user2 = "Ana";
        String user3 = "Kenneth";
        String user4 = "Kevin";
        String user5 = "Nelson";

        socialWebCore.getUsersGraph().addVertex(user1);
        socialWebCore.getUsersGraph().addVertex(user2);
        socialWebCore.getUsersGraph().addVertex(user3);
        socialWebCore.getUsersGraph().addVertex(user4);
        socialWebCore.getUsersGraph().addVertex(user5);

        socialWebCore.refresh();
        
        socialWebCore.getGraphData().addNewFriendshipToGraph(user1, user2);
        
        socialWebCore.refresh();
////        socialWebCore.getGraphData().addNewFriendshipToGraph(user1, user4);
////        socialWebCore.getGraphData().addNewFriendshipToGraph(user4, user3);
////        socialWebCore.getGraphData().addNewFriendshipToGraph(user1, user2);
////
//        socialWebCore.getGraphData().saveGraph(socialWebCore.getUsersGraph());
//        System.out.println("Graph saved!\n");
//
//        MyListGraph loadedGraph = socialWebCore.getGraphData().loadGraph();
//        System.out.println("Graph loaded from XML!");

    }//main

}//class
