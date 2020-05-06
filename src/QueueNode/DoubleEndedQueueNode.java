package QueueNode;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 05-05-2020
 * Time: 21:55
 */

public class DoubleEndedQueueNode {
    private int data;
    private DoubleEndedQueueNode next ;


    public DoubleEndedQueueNode(int data) {
        this.data = data;
        next = null;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}