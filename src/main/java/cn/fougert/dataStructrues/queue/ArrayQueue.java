package cn.fougert.dataStructrues.queue;

/**
 * @author luhuan
 * @date 2024/7/30
 * @description
 *    队列只能使用一次,无法复用
 **/
public class ArrayQueue {

    private int[] array;
    private int maxSize; //最大容量
    private int front;   //队列头元素位置
    private int rear;    //队列尾元素位置

    public ArrayQueue(int capacity){
        this.array = new int[capacity];
        this.maxSize = capacity ;
        this.front = -1;            //队列头
        this.rear = - 1;            //队列尾
    }


    private boolean empty(){
        return front == rear ;
    }

    //队列是否满
    private boolean isFull(){
        return rear == maxSize - 1;
    }

    /**
     * 队列添加元素
     * @param
     */
    private void addQuene(int n){
        if (isFull()){
            System.out.println("队列已满");
        }
        rear ++ ;
        array[rear] = n;

    }

    /**
     * 队列删除元素
     * @return
     */
    private int removeQuene(){
        if (empty()){
            System.out.println("队列为空");
            return 0 ;
        }
        front ++ ;
        return array[front];
    }

}
