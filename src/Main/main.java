package Main;

import DoubleEndedQueue.MyQueue;
import QueueNode.DoubleEndedQueueNode;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 05-05-2020
 * Time: 21:56
 */

public class main {
    public static void main(String[] args) {
        MyQueue MQ = new MyQueue();
        Scanner sc = new Scanner(System.in);
        int val, choice;
        boolean flag = true;
        System.out.print("Enter the data  :  ");
        val = sc.nextInt();
        DoubleEndedQueueNode node = new DoubleEndedQueueNode(val);
        MQ.insertAtFront(node);
    }
}