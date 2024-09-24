package cn.fougert.dataStructrues.linkedlist;

/**
 * @Author luhuan
 * @Date 2024/9/3
 * @Description 单链表实现
 **/
public class SingleLinkedListDemo {

    public static void main(String[] args) {


    }


    /**
     * 倒置list
     * @param headNode
     */
    public static void reverseList(Node headNode) {
        //思路
        //1、定义一个节点 reverseHead =  new Node
        //2、从头到尾遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表的最前端
        //3、将原来链表的头结点的next域 指向 reverseHead.next head.next = reverseHead.next

    }


    public static void reversePrint(Node headNode) {

    }


    /**
     * 查找链表中倒数第 [i]个节点
     *
     * @param headNode
     */
    public static Node getLastIndexNode(Node headNode, int index) {
        // 1. 获取链表长度
        int length = getLength(headNode);
        if (index <= 0 || index > length) {
            System.out.println("链表长度为：" + length + "，输入的索引不合法");
            return null;
        }
        //定义辅助变量， for循环定位到倒数的index
        Node cur = headNode.nextNode;
        for (int i = 0; i < length - index; i++) {
            cur = cur.nextNode;
        }
        return cur;

    }

    /**
     * 获取链表长度 除去头结点
     *
     * @param headNode
     * @return
     */
    public static int getLength(Node headNode) {
        int length = 0;
        if (headNode.nextNode == null) {
            return length;
        }
        Node nextNode = headNode.nextNode;
        while (nextNode != null) {
            length++;
            nextNode = nextNode.nextNode;
        }
        return length;
    }
}

class SingleLinkedList {

    //默认初始头结点
    private Node headNode = new Node(0, "");


    /**
     * 添加节点
     *
     * @param node
     */
    public void add(Node node) {
        Node temp = headNode;
        while (true) {
            if (temp.nextNode == null) {
                temp.nextNode = node;
                break;
            }
        }
    }

    /**
     * 遍历链表节点
     */
    public void list() {
        if (headNode.nextNode == null) {
            System.out.println("链表为空");
            return;
        }
        Node temp = headNode.nextNode;
        while (true) {
            if (temp == null) {  //到达链表尾部
                break;
            }
            temp = temp.nextNode;
            System.out.println(temp);
        }
    }


    /**
     * 删除指定节点
     *
     * @param no
     */
    public void deleteByNo(int no) {
        if (headNode.nextNode == null) {
            System.out.println("链表为空");
            return;
        }
        Node temp = headNode.nextNode;
        boolean canRemoveFlag = false;
        while (true) {
            if (temp.nextNode == null) {
                break;
            }
            if (temp.nextNode.no == no) {
                canRemoveFlag = true;
                break;
            }
            temp = temp.nextNode;
        }
        if (!canRemoveFlag) {
            System.out.println("要删除的节点不存在");
            return;
        } else {
            temp.nextNode = temp.nextNode.nextNode;
        }
    }


    /**
     * 指定位置添加节点
     *
     * @param node
     */
    public void addByNo(Node node) {


    }


}


/**
 * 节点定义
 */
class Node {
    public int no;
    public String name;
    //下一节点
    public Node nextNode;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

