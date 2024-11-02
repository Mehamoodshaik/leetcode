class LRUCache{

    private Node head = new Node(-1,-1);
    private Node tail = new Node(-1,-1);
    private Map<Integer,Node> map = new HashMap<>();
    int capacity;

    public LRUCache(int capacity){
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            delete(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            delete(map.get(key));
        }
        if(map.size()==capacity){
            delete(tail.prev);
        }
        insert(new Node(key,value));
    }

    public void insert(Node node){
        map.put(node.key,node);
        Node headNext = head.next;
        head.next = node;
        node.next = headNext;
        node.prev = head;
        headNext.prev = node;
    }

    public void delete(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    class Node{
        Node prev,next;
        int key, value;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
