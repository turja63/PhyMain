package PhyMain;

import java.util.ArrayList;

public class mpScore {
	ArrayList<Node> A;
	int score;

	long findScorePost(Node root)
	{
		if(root.lFlag==1)
			return 1<<root.spec;
		
		long lScore=findScorePost(root.l);
		long rScore=findScorePost(root.r);
		
		if((lScore & rScore)!=0)
			root.spec=lScore & rScore;
		else{
			root.spec=lScore|rScore;
			score++;
		}
		return root.spec;
	}
	void findScorePre(Node root)
	{
		if(root.lFlag==1)
			return;
		
		if((root.spec & 1<<root.p.spec)!=0)
			root.spec=root.p.spec;
		else
		{
			int count=0;
			while(root.spec%2!=1)
			{
				root.spec/=2;
				count++;
			}
			root.spec=count;
		}
		findScorePre(root.l);
		findScorePre(root.r);
	}
	int findScore(ArrayList<Node> A)
	{
		score=0;
		Node root=A.get(A.size()-1);
		findScorePost(root);
		int count=0;
		while(root.spec%2!=1)
		{
			root.spec/=2;
			count++;
		}
		root.spec=count;
		findScorePre(root.l);
		findScorePre(root.r);
		int i;
		//for(i=0;A.get(i).lFlag==1;i++);
		//for(;i<A.size();i++)A.get(i).spec=0;
		return score;
	}
}
