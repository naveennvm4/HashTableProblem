public abstract class MyNode<K>{
    private MyNode next;
    private K key;
    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }
    public MyNode getNext() {
        return next;
    }
    public K getKey() {
        return key;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
