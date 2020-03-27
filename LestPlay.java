package Trees;

import java.util.Scanner;

public class LestPlay {

	public static void main(String args[]){
		TreeOps top = new TreeOps();
		Node root = top.constructTree();
		int order;
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please ender Order you want 1.PreOrder 2.PostOrder 3.Inorder");
		order = sc.nextInt();
		while(order>0){
			
		top.printTree(root, order);
		System.out.println("Please ender -1 to stop the execution");
		order = sc.nextInt();
		}
		
	}
}
