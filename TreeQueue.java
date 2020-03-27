package Trees;

import java.util.LinkedList;
import java.util.List;

public class TreeQueue {
List <Node> que= new LinkedList<Node>();
public void enQue(Node node){
que.add(node);
}
public Node deQue(){
	if(!que.isEmpty()){
		Node n = que.get(0);	
		que.remove(0);
		return n;
	}
	return null;
}
}
