class MyHashMap {
    HashMap<Integer,Integer>m = new HashMap<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
            m.put(key,value);
        
    }
    
    public int get(int key) {
        if(m.get(key)!=null)
        {
        return m.get(key);
        }
        return -1;
        
    }
    
    public void remove(int key) {
        m.remove(key);
        
    }
}
