package Trees;

import java.util.Scanner;

public class LestPlay {

	public static void main(String args[]){
		Scanner sc = new Scanner(system.in);
		//System.out.println("Hi Please enter number of threes you want to crate");
		
	
			TreeOps top = new TreeOps();
			Node root = top.constructTree();	

			System.out.println("Hi Please enter option for operations 1.print inorder 2. BFS 3.Compare ");
			int cond = sc.nextInt();
			switch(cond){
			case 1:top.traverseInOrder(root);
			case 2:top.printTreeBFS(root);
			case 3:Node root2 = top.constructTree();
			if(compareTwoBinaryTrees(root, root2)){
				System.out.println("both are same");
			}
			else System.out.println("both are different");
			
			}

		
		System.out.println(" \n BFS");
		
	 top.printTreeBFS(root);
		}

}