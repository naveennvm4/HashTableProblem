public class MyMapNode<K, V> extends MyNode{
    K key;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        super(key);
        this.key = key;
        this.value = value;
        next = null;
    }

    public K getKey() { return key;}

    @Override
    public void setKey(Object key) {
        this.key = (K) key;
    }

    //public void setKey(K key) {this.key = key;}

    public MyNode getNext() {return next;}

    public void setNext(MyNode next) {this.next = (MyMapNode<K, V>) next;}

    public V getValue() {return this.value;}

    public void setValue(V value) {this.value = value;}

    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{ " + "K=").append(key)
                .append(" V+").append(value).append(" }");
        if(next!=null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}
