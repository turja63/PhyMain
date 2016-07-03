package PhyMain;

public class PrintTree {
	public PrintTree(Node root)
	{
		printTree(root,0);
	}
	public void printTree(Node root,int depth)
	{
		System.out.println(root.spec);
		for(int i=0;i<depth*5;i++)System.out.print(" ");
		System.out.print("----");
		if(root.l.lFlag!=1)printTree(root.l,depth+1);
		else System.out.println(root.l.spec);
		
		for(int i=0;i<depth*5;i++)System.out.print(" ");
		System.out.print("----");
		if(root.r.lFlag!=1)printTree(root.r,depth+1);
		else System.out.println(root.r.spec);
	}

}
