class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer>arr = new ArrayList<>();
    int l=0;
    int it=0;
	public PeekingIterator(Iterator<Integer> iterator) {
        while(iterator.hasNext())
        {
        arr.add(iterator.next());
        l++;
        }
        
      
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return arr.get(it);
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int x=arr.get(it);
        it++;
        return x;
       
	    
	}
	
	@Override
	public boolean hasNext() {
        if(it<l) return true;
        return false;
	    
	}
}
