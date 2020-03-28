package BinaryTree;

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
	Node n =null;
	while(!q.que.isEmpty()){
		n= q.deQue();
		System.out.println("Plese enter left child, press -1 if no left child"+ n.data );
		ele =sc.nextInt();
		if(ele != -1){
			 Node lnode= new Node(ele);
			 n.left  = lnode;
			q.enQue(lnode);
		}
		System.out.println("Plese enter right child, press -1 if no right child"+ n.data );
		ele = sc.nextInt();
		if(ele != -1){
			Node rnode =  new Node(ele);
			n.right = rnode;
			q.enQue(rnode);
		}
		
		
	}
	return root;
	}
public void printTree(Node root,int order){
if(root !=null)
switch (order){
case 1: traverseInOrder(root);
case 2: printPostOrder(root);
case 3: printPreOrder(root);
}	
}

public boolean compareTwoBinaryTrees (Node t1, Node t2){
	TreeQueue t1q = new TreeQueue();
	TreeQueue t2q = new TreeQueue();
	
	t1q.enQue(t1);
	t2q.enQue(t2);

	
	while(!t1q.que.isEmpty() && !t2q.que.isEmpty()){
		Node node1 = t1q.deQue();
		Node node2 = t2q.deQue();
		if(node1.data == node2.data){
			t1q.enQue(node1.left);
			t2q.enQue(node2.left);
			t1q.enQue(node1.right);
			t2q.enQue(node2.right);
			
			
		}
		else
			return false;
		
	}
	if(t1q.que.size() == t2q.que.size() &&  t2q.que.size()== 0) 
		return true;
	else
		return false;
	
	
}

public void printTreeBFS(Node root){
	TreeQueue q1 = new TreeQueue();
	q1.enQue(root);
	Node node  = null;
	while(!q1.que.isEmpty()){
		node = q1.deQue();
		System.out.print(" "+node.data);
			q1.enQue(node.left);
			q1.enQue(node.right);
		
	}
}




public void printPreOrder(Node node) {
	if(node != null){
	System.out.println(node.data);
	printPreOrder(node.right);
	printPreOrder(node.left);
	}
	
	
}
public void printPostOrder(Node node) {
	if(node != null){
	 printPostOrder(node.left);
	 printPreOrder(node.right);
	System.out.println(node.data);
	}
	
}
public void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" " + node.data);
        traverseInOrder(node.right);
    }
}
public int getHeight(Node node) {
	// TODO Auto-generated method stub
	int rh = 0;
	int rl =0;
	if(node != null){
		rh = getHeight(node.right);
		rl =getHeight(node.left);
	 return rh > rl ? rh+1 : rl+1;
	}
	return rh > rl ? rh: rl;
	
}


}
