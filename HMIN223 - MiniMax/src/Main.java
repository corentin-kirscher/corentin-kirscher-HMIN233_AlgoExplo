import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		// binaryTree of 8 leafs, set 8 int as parameters (leaf's data). Working with Integer so do not put 0 as value please
		tree.constructTree(5,2,3,4,5,6,8,7);
		tree.minMax(tree.getRoot());
		
		System.out.println("\n\nAlgorithme MinMax resultats : \n\n");
		System.out.print(tree.getRoot().toString());
		
	}

}
