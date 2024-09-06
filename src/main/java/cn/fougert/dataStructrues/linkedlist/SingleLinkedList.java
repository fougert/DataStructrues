package cn.fougert.dataStructrues.linkedlist;

/**
 * @Author luhuan
 * @Date 2024/9/3
 * @Description 单链表实现
 **/
public class SingleLinkedList {

    //默认初始头结点
    private Node headNode = new Node(0, "");


    /**
     * 添加节点
     * @param node
     */
    public void add(Node node){
        Node temp = headNode;
        while (true){
            if (temp.nextNode == null){
                temp.nextNode = node;
                break;
            }
        }
    }


    public void list(){
        if (headNode.nextNode == null){
            System.out.println("链表为空");
            return;
        }
        Node temp = headNode.nextNode;
        while (true){
            if (temp == null){  //到达链表尾部
                break;
            }
            temp = temp.nextNode;
            System.out.println(temp);
        }
    }


    public void deleteByNo(int no){
        if (headNode.nextNode == null){
            System.out.println("链表为空");
            return;
        }
        Node temp = headNode.nextNode;
        boolean canRemoveFlag = false;
        while (true){
            if (temp.nextNode == null){
                break;
            }
            if (temp.nextNode.no == no){
                canRemoveFlag = true;
                break;
            }
            temp = temp.nextNode;
        }
        if (!canRemoveFlag){
            System.out.println("要删除的节点不存在");
            return;
        }else {
            temp.nextNode = temp.nextNode.nextNode;
        }
    }



    /**
     * 指定位置添加节点
     * @param node
     */
    public void addByOrder(Node node){



    }


    public void reverseList(){
    }


}


/**
 * 节点定义
 */
class Node{
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

