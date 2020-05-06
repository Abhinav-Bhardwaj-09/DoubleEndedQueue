package DoubleEndedQueue;

import QueueNode.DoubleEndedQueueNode;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 05-05-2020
 * Time: 21:56
 */

public class MyQueue {
    DoubleEndedQueueNode front ;
    DoubleEndedQueueNode rear ;
    int no_of_Element = 0 ;

    public MyQueue() {
        front = null;
        rear = null;
    }
}