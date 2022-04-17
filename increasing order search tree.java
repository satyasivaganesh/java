class Solution {
    void inorder(TreeNode root,ArrayList<TreeNode>arr)
    {
        if(root!=null)
        {
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
        }
        
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode>arr=new ArrayList<>();
        inorder(root,arr);
        int i;
        for(i=0;i<arr.size()-1;i++)
        {
            arr.get(i).left=null;
            arr.get(i).right=arr.get(i+1);
        }
        arr.get(i).left=null;
        return arr.get(0);
    }
}
