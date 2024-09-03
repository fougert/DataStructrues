package cn.fougert.dataStructrues.queue;

/**
 *  环形队列实现
 *  队列尾部空出一个空间作为约定
 */
public class CircleArrayQueue {

    private int[] arr;

    private int maxSize;

    private int front;   //指向队列的第一个元素

    private int rear;   //队列最后一个元素的后一个位置 空出一个空间作为约定

    public CircleArrayQueue(int maxSize){
        arr = new int[maxSize];
        this.front = 0;
        this.rear = 0;
        this.maxSize = maxSize;
    }


    private boolean isEmpty(){
        return front == rear;
    }

    private boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    /**
     *
     * @param n
     */
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
            return 0;
        }
        int i = arr[front];
        front = (front + 1) % maxSize;
        return i;
    }


    /**
     * 显示队列头元素
     * @return
     */
    public int headQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
            return 0;
        }
        return arr[front];
    }

}
