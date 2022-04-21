class MyHashSet {
    HashMap<Integer,Integer>m = new HashMap<>();

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        m.put(key,1);
        
    }
    
    public void remove(int key) {
        if(m.get(key)==1)
            m.remove(key);
        
    }
    
    public boolean contains(int key) {
        if(m.get(key)!=null)return true;
        return false;
        
    }
}
