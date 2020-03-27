package Trees;

import java.util.Scanner;

public class TreeOps {
	
public Node constructTree(){
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Plese enter elements");
	System.out.println("Plese enter root element");
	int ele =sc.nextInt();
	Node root  = new Node(ele);
	TreeQueue q = new TreeQueue();
	q.enQue(root);
	while(!q.que.isEmpty()){
		Node node = q.deQue();
		System.out.println("Plese enter left child, press -1 if no left child"+ node.data );
		ele =sc.nextInt();
		if(ele != -1){
			 Node lnode= new Node(ele);
			 node.left  = lnode;
			q.enQue(lnode);
		}
		System.out.println("Plese enter right child, press -1 if no right child"+ node.data );
		ele = sc.nextInt();
		if(ele != -1){
			Node rnode =  new Node(ele);
			node.right = rnode;
			q.enQue(rnode);
		}
	}
	return root;
	}
public void printTree(Node root,int order){
if(root !=null)
switch (order){
case 1: printInOrder(root);
case 2: printPostOrder(root);
case 3: printPreOrder(root);
}


	
}
private Node printPreOrder(Node node) {
	if(node == null)
		return null;
	System.out.println(node.data);
	if(node.right != null)
	return printPreOrder(node.right);
	if(node.left != null)
		return printPreOrder(node.left);
	return null;
	
}
private Node printPostOrder(Node node) {
	if(node == null)
		return null;
	if(node.left != null)
	return printPostOrder(node.left);
	if(node.right != null)
	return printPreOrder(node.right);
	System.out.println(node.data);
	return null;
	
}
private Node printInOrder(Node node) {
	if(node == null)
		return null;
	System.out.println(node.data);
	if(node.right != null)
	return printInOrder(node.right);
	if(node.left != null)
	return printInOrder(node.left);
	return null;
}


}
