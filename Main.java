package PhyMain;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static final int NUM=40;
	public static void main(String[] args)
	{
		Random r=new Random();
		ArrayList<Node> L=new ArrayList<Node>();
		for(int i=0;i<NUM;i++)
		{
			Node a=new Node(r.nextInt(NUM)+1);
			L.add(a);
		}
		ConstructRandomTree T=new ConstructRandomTree(L);
		L=T.getArray();
		mpScore mScore=new mpScore();
		//mScore.findScore(L);
		//new PrintTree(L.get(L.size()-1));
		System.out.println("Score: "+mScore.findScore(L));
		
		HillClimber hc=new HillClimber();
		L=hc.Climb(L, 100);
		//new PrintTree(L.get(L.size()-1));
		
		System.out.println("Score: "+mScore.findScore(L));
	}
}
