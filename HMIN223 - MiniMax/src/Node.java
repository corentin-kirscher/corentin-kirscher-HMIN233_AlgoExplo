import java.util.ArrayList;

public class Node {
	
	private int data;
	private Node parent;
	private ArrayList<Node> childs;
	private String name;
	private int deepth;
	
	
	
	public int getDeepth() {
		return deepth;
	}
	public void setDeepth(int deepth) {
		this.deepth = deepth;
	}
	public Node (String name) {
		this.name = name;
	}
	public Node (int data, String name) {
		this.data = data;
		this.name = name;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public ArrayList<Node> getChilds() {
		return childs;
	}
	public void setChilds(ArrayList<Node> childs) {
		this.childs = childs;
		childs.get(0).setDeepth(this.deepth + 1);
		childs.get(1).setDeepth(this.deepth + 1);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {

		if(this.childs == null) {
			return "\n" + name + " = " + data;
		}
		else {
			return "\nname = " + name + ", data =" + data + ", childs=" + childs + ", deepth =" + deepth;
		}
		
	}
	

	
}
