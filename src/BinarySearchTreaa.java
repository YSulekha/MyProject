
public class BinarySearchTreaa {
	public static void main(String [] args){
		BST b = new BST();
		b.insert(9);
		b.insert(5);
		b.insert(12);
		b.insert(1);
		b.insert(10);
		b.insert(7);
		b.insert(4);
		System.out.println("Is empty "+b.isEmpty());
		System.out.println("No of nodes "+b.count() + b.noofnodes);
		System.out.println("Height "+b.height());
		System.out.println("In Order:");
		b.inOrder();
		System.out.println("\nPreOrder:");
		b.preOrder();
		System.out.println("\nPost Order:");
		b.postOrder();
		
	}
}
class BSTNode{
	 BSTNode left,right;
	int data;
	
	BSTNode(){
		data = 0;
		left = null;
		right = null;
	}
	
	BSTNode(int num){
		data = num;
		left = null;
		right = null;
	}
	
	public void setLeft(BSTNode node){
		left = node;
	}
	
	public void setRight(BSTNode node){
		right = node;
	}
	
	public BSTNode getLeft(){
		return left;
	}
	
	public BSTNode getRight(){
		return right;
	}
	
	public void setData(int n){
		data = n;
	}
}

class BST{
	BSTNode root;
	int noofnodes = 0;
	BST(){
		root = null;
	}
	public void insert(int n){
		noofnodes++;
		root = insert(root,n);
	}
	public BSTNode insert(BSTNode node,int n){
		if(node == null){
			node = new BSTNode(n);
		}
		else{
			if(node.data > n){
				node.left = insert(node.left,n);
			}
			else{
				node.right = insert(node.right,n);
			}
		}
		return node;
	}
	public boolean isEmpty(){
		return root==null;
	}
/*	public void delete(int n){
		BSTNode node = root;
		while(node != null){
			if(node.data)
		}*/
	public int count(){
		return(count(root));
	}
	public int count(BSTNode node){
	//	int count = 0;
	//	BSTNode node = root;
		if(node == null)
			return 0;
		else
			return(count(node.left)+count(node.right)+1);
	}
	
	public int height(){
		return(height(root));
	}
	public int height(BSTNode node){
		if(node == null)
			return -1;
		else
			return(Math.max(height(node.left),height(node.right))+1);
	}
	public void inOrder(){
		inOrder(root);
	}
	public void inOrder(BSTNode node){
		if(node == null)
			return;
		else{
			inOrder(node.getLeft());
			System.out.print(node.data+" ");
			inOrder(node.getRight());
			}
		}
	public void preOrder(){
		preOrder(root);
	}
	public void preOrder(BSTNode node){
		if(node == null)
			return;
		else{
			System.out.print(node.data+" ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
			}
		}
	public void postOrder(){
		postOrder(root);
	}
	public void postOrder(BSTNode node){
		if(node == null)
			return;
		else{
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.data+" ");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
