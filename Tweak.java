package PhyMain;

import java.util.ArrayList;
import java.util.Random;

public class Tweak {
	void smallTweak(ArrayList<Node> A)
	{
		Random r=new Random();
		int l=0,i=0;
		while(A.get(i).lFlag==1)
		{
			l++;
			i++;
		}
		int r_1=r.nextInt(l);
		int r_2=r.nextInt(l);
		while(r_1==r_2 || A.get(r_1).p==A.get(r_2).p)
			r_2=r.nextInt(l);
		
		Node c_1=A.get(r_1);
		Node c_2=A.get(r_2);
		//System.out.println("Swapping "+c_1.spec+" and "+c_2.spec);
		Node p_1=c_1.p;
		Node p_2=c_2.p;
		c_1.p=p_2;
		c_2.p=p_1;
		
		if(p_1.l==c_1)
			p_1.l=c_2;
		else 
			p_1.r=c_2;
		
		if(p_2.l==c_2)
			p_2.l=c_1;
		else 
			p_2.r=c_1;
	}
}
