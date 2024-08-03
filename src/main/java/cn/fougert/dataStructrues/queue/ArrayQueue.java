package cn.fougert.dataStructrues.queue;

/**
 * @author luhuan
 * @date 2024/7/30
 * @description
 **/
public class ArrayQueue {

    private int[] array;
    private int maxSize; //最大容量
    private int front;   //队列头元素位置
    private int rear;    //队列尾元素位置

    public ArrayQueue(int capacity){
        this.array = new int[capacity];
        this.maxSize = capacity ;
        this.front = -1;
        this.rear = - 1;
    }

    private boolean empty(){
        return front == rear ;
    }



}
