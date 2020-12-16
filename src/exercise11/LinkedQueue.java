package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        // Check if queue has no elements

        return frontNode == null;
    }

    public void offer(String data) {
        // Offer element to queue
        Node newNode = new Node(data);
        if (isEmpry()) {
          frontNode = newNode;
          backNode = newNode;
        }
        else {
          backNode.setNextNode(newNode);
          backNode = newNode;
        }
    }

    public String poll() {
        // Poll element from queue
        if (!isEmpry()) {
        String data = frontNode.getData();
        frontNode = frontNode.getNextNode();
        return data;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalStrinг(frontNode);
    }
}
