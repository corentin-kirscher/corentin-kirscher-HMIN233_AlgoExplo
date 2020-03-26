import java.util.ArrayList;

public class Tree {
	private Node root;
	private ArrayList<Node> nodes;
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public ArrayList<Node> getNodes() {
		return nodes;
	}
	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	public void constructTree(int a, int b, int c, int d, int e, int f, int g, int h) {
		Node f1 = new Node(a, "leaf 1");
		Node f2 = new Node(b, "leaf 2");
		Node f3 = new Node(c, "leaf 3");
		Node f4 = new Node(d, "leaf 4");
		Node f5 = new Node(e, "leaf 5");
		Node f6 = new Node(f, "leaf 6");
		Node f7 = new Node(g, "leaf 7");
		Node f8 = new Node(h, "leaf 8");	
		
		Node root = new Node("root");
		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node ("D");
		Node AB = new Node("AB");
		Node CD = new Node("CD");
		
		A.setParent(AB);
		B.setParent(AB);
		C.setParent(CD);
		D.setParent(CD);
		AB.setParent(root);
		CD.setParent(root);
		
		
		
		root.setDeepth(0);

		ArrayList<Node> rootChilds = new ArrayList<>();
		rootChilds.add(AB);
		rootChilds.add(CD);
		root.setChilds(rootChilds);
		
		ArrayList<Node> ABChilds = new ArrayList<>();
		ABChilds.add(A);
		ABChilds.add(B);
		AB.setChilds(ABChilds);
		
		ArrayList<Node> CDChilds = new ArrayList<>();
		CDChilds.add(C);
		CDChilds.add(D);
		CD.setChilds(CDChilds);
		
		ArrayList<Node> AChilds = new ArrayList<>();
		AChilds.add(f1);
		AChilds.add(f2);
		A.setChilds(AChilds);

		ArrayList<Node> BChilds = new ArrayList<>();
		BChilds.add(f3);
		BChilds.add(f4);
		B.setChilds(BChilds);
		
		ArrayList<Node> CChilds = new ArrayList<>();
		CChilds.add(f5);
		CChilds.add(f6);
		C.setChilds(CChilds);
		
		ArrayList<Node> DChilds = new ArrayList<>();
		DChilds.add(f7);
		DChilds.add(f8);
		D.setChilds(DChilds);
		
		this.root = root;
		
		nodes = rootChilds;
		nodes.addAll(ABChilds);
		nodes.addAll(CDChilds);
		nodes.addAll(AChilds);
		nodes.addAll(BChilds);
		nodes.addAll(CChilds);
		nodes.addAll(DChilds);
		
		
		System.out.println(root.toString());
	}

	
	public void minMax(Node n) {
		
		// set the proper value in the node if both of his childs have data.
		if(n.getChilds().get(0).getData() != 0 && n.getChilds().get(1).getData() != 0) {
			
			
			if (n.getDeepth()%2 == 0) {
				// min here
				if(n.getChilds().get(0).getData() > n.getChilds().get(1).getData()) {
					n.setData(n.getChilds().get(1).getData());
				}
				else {
					n.setData(n.getChilds().get(0).getData());
				}
			}
			else {
				// max here
				if(n.getChilds().get(0).getData() < n.getChilds().get(1).getData()) {
					n.setData(n.getChilds().get(1).getData());
				}
				else {
					n.setData(n.getChilds().get(0).getData());
				}
			}
			if(n.getParent() != null) {
				minMax(n.getParent());
			}
		}
		
		// Case where children have no data
		else if(n.getChilds().get(0).getData() == 0) {
			minMax(n.getChilds().get(0));
		}
		else if(n.getChilds().get(1).getData() == 0) {
			minMax(n.getChilds().get(1));
		}
		
		//System.out.println(root.toString());
	}
	
}
