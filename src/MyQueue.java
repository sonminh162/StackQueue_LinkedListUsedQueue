public class MyQueue {
    private Node head;
    private Node tail;
    public MyQueue(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        public Node next;
        public int key;
        public Node(int key){
            this.key = key;
            this.next = null;
        }
    }

    public Node dequeue(){
        if(this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null)
            this.tail= null;
        return temp;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
        //giải thích: dòng thứ nhất tạo 1 một mối nối mới và gán cho nó giá trị temp-vừa khởi tạo để gán cho giá trị mới
        //            dòng thứ hai muốn nói đến là đuôi mới hiện tại là giá trị mới (cập nhật thông tin mới cho đuôi)
    }
}
