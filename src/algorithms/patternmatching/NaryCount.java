package algorithms.patternmatching;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhiramk on 28/06/16.
 */

public class NaryCount {

    public static Map<Integer, Node> nodeMap = new HashMap<>();

    public static int count(Node node) {

        if(node.getCountReportees() == 0) {
            int count = 0;
            if(node.childCount() == 0) {
                node.setCountReportees(0);
                return 1;
            }


//        int count = 0;
            for(Node n: node.children()) {
                count  += count(n);
            }
            node.setCountReportees(count);

            return count +1;
        } else {
            return node.getCountReportees();
        }


    }

    public static int sumRoot(Node root) {
        int s = 0;
        for(Node n : root.children()) {
            s += count(n);
        }
        return s;
    }

    public static void main(String[] args) {


//        nodeMap.put(1, new Node(1));
//        nodeMap.put(2, new Node(2));
//        nodeMap.put(3, new Node(3));
//        nodeMap.put(4, new Node(4));
//        nodeMap.put(5, new Node(5));
//        nodeMap.put(6, new Node(6));
//        nodeMap.put(7, new Node(7));
//        nodeMap.put(8, new Node(8));
//        nodeMap.put(9, new Node(9));
//        nodeMap.put(10, new Node(10));

        String csvFile = "/Users/abhiramk/Documents/original_file.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] emp = line.split(cvsSplitBy);
                constructTree(emp);


            }
            System.out.println(nodeMap.size());
             //return;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Node root = nodeMap.get(10510306);
        int count = count(root);

        for(Integer i : nodeMap.keySet()) {
            if(nodeMap.get(i).getCountReportees() == 0) {
                int res = count(nodeMap.get(i));
            }
        }

        for(Integer i: nodeMap.keySet()) {
            System.out.println(i+","+nodeMap.get(i).getCountReportees());
        }

        System.out.println("Done");
    }



    private static void constructTree(String[] emp) {
        //creating all the necessary nodes first
        for(String s : emp) {
            int id = Integer.valueOf(s);
            if(nodeMap.get(id) == null) {
                nodeMap.put(id, new Node(id));
            }
        }
        //creating the tree structure
        Node root = nodeMap.get(Integer.valueOf(emp[0]));
        for(int i = 1; i< emp.length; i++) {
            root.addNode(nodeMap.get(Integer.valueOf(emp[i])));
        }

    }


//        Node root = nodeMap.get(1);
//        root.addNode(nodeMap.get(2));
//        root.addNode(nodeMap.get(3));
//        root.addNode(nodeMap.get(4));
//
//        Node two = nodeMap.get(2);
//        two.addNode(nodeMap.get(5));
//        two.addNode(nodeMap.get(6));
//
////        Node three = nodeMap.get(3);
////        three.addNode(nodeMap.get(7));
////        three.addNode(nodeMap.get(8));
//
//        Node four = nodeMap.get(4);
//        four.addNode(nodeMap.get(7));
//
////        Node five = nodeMap.get(5);
////        five.addNode(nodeMap.get(10));
//
//        int c = count(root);
//        System.out.println(c);










}
