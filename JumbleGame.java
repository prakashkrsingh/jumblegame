import javax.swing.*;
import java.util.Scanner;
class Jumble
{
	public String suffle(String s)
	{
		int c[]=new int[20];
		char a[]=s.toCharArray();
		String s1="";
		
		for(int i=0;i<a.length;)
		{
			int b=0;
			
			int n=(int)(Math.random()*100);
				
			if(n<a.length&&n>=0)
			{
				for(int j=0;j<i;j++)
				{
					if(n==c[j])
						b++;
				}
				if(b==0)
					{
					c[i]=n;
					i++;
					}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{	
			s1=s1+a[c[i]];
		}
		if(s1.equals(s)==true)
		{
			String s2=suffle(s);
			return(s2);
		}
		else
		return(s1);
	}
		
	public static void main(String[]ar)
	{
		String Name="";
		int k=0;
		int score=0;
		int w[]=new int[15];
		Jumble g=new Jumble();
		String s1[]=new String[15];
		String s2[]=new String[15];
		String s3[]=new String[15];
		
		for(int m=0;m<15;)
		{
			int b=0;
			
			int n=(int)(Math.random()*100);
				
			if(n<15&&n>=0)
			{
				for(int j=0;j<m;j++)
				{
					if(n==w[j])
						b++;
				}
				if(b==0)
					{
					w[m]=n;
					m++;
					}
			}
		}
		
		s1[0]="sky";
		s1[1]="girl";
		s1[2]="earth";
		s1[3]="india";
		s1[4]="music";
		s1[5]="mobile";
		s1[6]="apple";
		s1[7]="java";
		s1[8]="catch";
		s1[9]="delhi";
		s1[10]="mango";
		s1[11]="banana";
		s1[12]="heart";
		s1[13]="news";
		s1[14]="goods";
		s2[0]="exercise";
		s2[1]="bedroom";
		s2[2]="telephone";
		s2[3]="kolkata";
		s2[4]="television";
		s2[5]="internet";
		s2[6]="people";
		s2[7]="animal";
		s2[8]="months";
		s2[9]="natural";
		s2[10]="example";
		s2[11]="electric";
		s2[12]="cloths";
		s2[13]="laptop";
		s2[14]="mobile";
		s3[0]="environment";
		s3[1]="advance";
		s3[2]="hyderabad";
		s3[3]="psychology";
		s3[4]="intelligent";
		s3[5]="umbrella";
		s3[6]="newzealand";
		s3[7]="magnitude";
		s3[8]="refrigerator";
		s3[9]="society";
		s3[10]="institute";
		s3[11]="computer";
		s3[12]="vehicle";
		s3[13]="knowledge";
		s3[14]="message";
		System.out.println("connected");
		JOptionPane.showMessageDialog(null,"Welcome to the Jumble game!");
		Name=JOptionPane.showInputDialog(null,"Enter your Name:");
		JOptionPane.showMessageDialog(null,"Instuction of the Jumble Game: \n 1.Enter the original word of the jumble word \n 2.There are 5 questions \n 3.For each correct attempt you will get 2 point \n 4.For each wrong attempt 1 point will be deducted \n 5.Enter the \"pass\" for pass \n 6.for pass 0 point");
		String ch=JOptionPane.showInputDialog("Select your level \n 1.Easy \n 2.Medium \n 3.Hard");
		int ch1=Integer.parseInt(ch);
		if(ch1==1)
		{
			for(int i=0;i<5;i++)
			{
				String r=g.suffle(s1[w[k]]);
				String at=JOptionPane.showInputDialog((i+1)+"."+r+"\nPress \t 1.Attempt \t 2.Pass");
				int at1=Integer.parseInt(at);
				if(at1==1)
				{
					String ans=JOptionPane.showInputDialog("Input correct word");
					if(s1[w[k]].equals(ans)==true)
					{
						JOptionPane.showMessageDialog(null,"Correct answer");
						score=score+2;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect answer");
						score--;
					}
					
				}
				else
				{
				}
				k++;
			}
		}
		else if(ch1==2)
		{
			for(int i=0;i<5;i++)
			{
				String r=g.suffle(s2[w[k]]);
				String at=JOptionPane.showInputDialog((i+1)+"."+r+"\nPress \t 1.Attempt \t 2.Pass");
				int at1=Integer.parseInt(at);
				if(at1==1)
				{
					String ans=JOptionPane.showInputDialog("Input correct word");
					if(s2[w[k]].equals(ans)==true)
					{
						JOptionPane.showMessageDialog(null,"Correct answer");
						score=score+2;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect answer");
						score--;
					}
					
				}
				else
				{
				}
				k++;
			}
		}
		else
		{
			for(int i=0;i<5;i++)
			{
				String r=g.suffle(s3[w[k]]);
				String at=JOptionPane.showInputDialog((i+1)+"."+r+"\nPress \t 1.Attempt \t 2.Pass");
				int at1=Integer.parseInt(at);
				if(at1==1)
				{
					String ans=JOptionPane.showInputDialog("Input correct word");
					if(s3[w[k]].equals(ans)==true)
					{
						JOptionPane.showMessageDialog(null,"Correct answer");
						score=score+2;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect answer");
						score--;
					}
					
				}
				else
				{
				}
				k++;
			}
		}
		JOptionPane.showMessageDialog(null,"\tGame over \nyour score is : "+score + "    out of 10\n");
		JOptionPane.showMessageDialog(null,"Thank you! for playing the game "+ Name);
	}
		
}