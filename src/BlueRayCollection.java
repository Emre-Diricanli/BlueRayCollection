public class BlueRayCollection {
    private Node head = null;

    public void add(String title, String director, int yearOfRelease, double cost){
        Node newNode = new Node(new BlueRayDisk(title, director, yearOfRelease, cost));
        if(head == null){
            head = newNode;
        }else {
            newNode.next = null;
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void showAll(){
        Node thisNode = head;
        while(thisNode != null){
            System.out.println(thisNode.data.toString());
            thisNode = thisNode.next;
        }

    }
}
