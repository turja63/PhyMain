package PhyMain;

import java.util.ArrayList;
import java.util.Random;

public class ConstructRandomTree {
	Node Root;
	ArrayList<Node> A;
	public ConstructRandomTree(ArrayList<Node> initList)
	{
		A=new ArrayList<Node>(initList);
		while(initList.size()>1)
		{
			Random r_1=new Random();
			int l_index=r_1.nextInt(initList.size());
			int r_index;
			
			do
			{
				r_index=r_1.nextInt(initList.size());
			}
			while(l_index==r_index);
			
			Node a=new Node(initList.get(l_index),initList.get(r_index),0,0);
			A.add(a);
			initList.get(l_index).p=a;
			initList.get(r_index).p=a;
			
			initList.remove(r_index);
			if(r_index<l_index)initList.remove(l_index-1);
			else initList.remove(l_index);
			initList.add(a);
		}
		Root=initList.get(0);
	}
	public Node getRoot()
	{
		return Root;
	}
	public ArrayList<Node> getArray()
	{
		return A;
	}
	
}
