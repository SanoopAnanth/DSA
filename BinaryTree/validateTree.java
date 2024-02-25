package BinaryTree;

public class validateTree {
    private TreeNode root;
    private class TreeNode{
        TreeNode right,left;
        int data;
        TreeNode(int data){
            this.data=data;
        }
    }
    public void OnCreate(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    public void insert(int value){
        root=insert(root, value);
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left=insert(root.left, value);
        }
        if(value>root.data){
            root.right=insert(root.right, value);
        }
        return root;
    }
    public void validate(){
      boolean result=validate(root,Long.MIN_VALUE,Long.MAX_VALUE);  
      System.out.println(result);
    }
    public boolean validate(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data <= min || root.data>=max){
            return false;
        }
        boolean left=validate(root.left,min,root.data);
        if(left){
            boolean right=validate(root.right,root.data,max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
        validateTree obj=new validateTree();
        validateTree obj2=new validateTree();
        obj.insert(6);
        obj.insert(4);
        obj.insert(3);
        obj.insert(5);
        obj.insert(8);
        obj.insert(7);
        obj.insert(9);
        obj.validate();
        obj2.OnCreate();
        obj2.validate();
    }
}
