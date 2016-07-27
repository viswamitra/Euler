package algorithms.patternmatching;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by abhiramk on 28/06/16.
 */
public class Node {

    private int id;
    private int countReportees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountReportees() {
        return countReportees;
    }

    public void setCountReportees(int countReportees) {
        this.countReportees = countReportees;
    }

    private Set<Node> childNodes;

    public Node(int id) {
        this.id = id;
        childNodes = new HashSet<>();
    }
    

    public int childCount() {
        return childNodes.size();
    }

    public Set<Node> children() {
        return childNodes;
    }

    public void addNode(Node node) {
        childNodes.add(node);
    }



}
