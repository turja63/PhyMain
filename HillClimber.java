package PhyMain;

import java.util.ArrayList;
import java.util.Random;

public class HillClimber {
	
	public ArrayList<Node> Climb(ArrayList<Node> A,int iter)
	{
		Tweak twk=new Tweak();
		ArrayList<Node> A_t=getCopy(A);
		mpScore msp=new mpScore();
		int score=msp.findScore(A);
		ArrayList<Node> best=null;
		while(iter>0)
		{
			twk.smallTweak(A_t);
			int newScore=msp.findScore(A_t);
			if(newScore<score)
			{
				System.out.println("Got something "+newScore);
				best=getCopy(A_t);
				score=newScore;
			}
			//else A_t=getCopy(best);
			iter--;
		}
		if(best!=null)A=best;
		return A;
	}
	public ArrayList<Node> getCopy(ArrayList<Node> A)
	{
		ArrayList<Node> B=new ArrayList<Node>();
		int i;
		for(i=0;A.get(i).lFlag==1;i++)
		{
			Node t=new Node(A.get(i).spec);
			B.add(t);
		}
		for(;i<A.size();i++)
		{
			Node t=new Node(B.get(A.indexOf(A.get(i).l)),B.get(A.indexOf(A.get(i).r)),A.get(i).spec,A.get(i).lFlag);
			B.add(t);
		}
		for(i=0;i<A.size()-1;i++)
		{
			B.get(i).p=B.get(A.indexOf(A.get(i).p));
		}
		return B;
	}
}
