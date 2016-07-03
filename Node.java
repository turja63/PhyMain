package PhyMain;

public class Node {
	Node p;
	long spec;
	Node l;
	Node r;
	int lFlag;
	public Node(Node p,Node l,Node r,long val,int flag)
	{
		this.p=p;
		spec=val;
		this.l=l;
		this.r=r;
		lFlag=flag;
	}
	public Node(Node l,Node r,long val,int flag)
	{
		spec=val;
		this.l=l;
		this.r=r;
		lFlag=flag;
	}
	public Node(long spec2)
	{
		spec=spec2;
		lFlag=1;
	}
}
