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

        while (flag) {
            System.out.println("Press 1 : To enter one more element.");
            System.out.println("Press 2 : To display the queue from beginning / front.");
            System.out.println("Press 3 : To display the queue from end / rear.");
            System.out.println("Press 4 : To perform dequeue on queue from beginning / front.");
            System.out.println("Press 5 : To perform dequeue on queue from end / rear.");
            System.out.println("Press 6 : To exit.");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter the data  :  ");
                val = sc.nextInt();
                node = new DoubleEndedQueueNode(val);
                MQ.insertAtFront(node);
            }
            else if (choice == 2 ) MQ.deleteFromFront();
            else if (choice == 3 ) MQ.displayFromEnd();
            else if (choice == 4) MQ.deleteFromFront();
            }


        }
}