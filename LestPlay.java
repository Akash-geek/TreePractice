package Trees;

import java.util.Scanner;

public class LestPlay {

	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//System.out.println("Hi Please enter number of threes you want to crate");
			TreeOps top = new TreeOps();
			Node root = top.constructTree();	

			System.out.println("Hi Please enter option for operations 1.print inorder "
					+ "2. BFS 3.Compare "
					+ "4.get Height "
					+ "5. exit");
			int cond = sc.nextInt();
			while(true){
				switch(cond){
					case 1:top.traverseInOrder(root);
						break;
					case 2:top.printTreeBFS(root);
						break;
					case 3:
						Node root2 = top.constructTree();
						if(top.compareTwoBinaryTrees(root, root2)){
							System.out.println("both are same");
							System.out.println("Tree 1");
							top.printTreeBFS(root);
							System.out.println("Tree 2");
							top.printTreeBFS(root2);
						}
						else{ 
							System.out.println("both are different");
							System.out.println("Tree 1");
							top.printTreeBFS(root);
							System.out.println("\nTree 2");
							top.printTreeBFS(root2);
						}
						break;
					case 4: System.out.println(top.getHeight(root));
						break;
					case 5: System.exit(0);
				}
			}
		}
}