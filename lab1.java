import static java.lang.Math.*;

public class lab1
{
	public static void main(String[] args)
	{
		if(args.length!=3){
			System.out.println("Zła liczba argumentów.");
		}
		else
		{
			int[] wsp=new int[3];
			for(int i=0;i<args.length;i++)
			{
				try
				{
					wsp[i]=Integer.parseInt(args[i]);
				}
				catch(Exception e)
				{
					int j=i+1;
					System.out.println("Error argument "+j);
				}
			}
			if(wsp[0]!=0)//kwadratowa
			{
				double delta;
				delta=wsp[1]*wsp[1]-4*wsp[0]*wsp[2];
				if(delta>0)//2 rozw
				{
					double sqrtDelta=Math.sqrt(delta);
					double x1,x2;
					x1=(-wsp[1]-sqrtDelta)/(2*wsp[0]);
					x2=(-wsp[1]+sqrtDelta)/(2*wsp[0]);
					System.out.println("x1= "+x1+" x2= "+x2);
				}
				else if(delta==0)//1 rozw
				{
					double x=-wsp[1]/(2*wsp[0]);
					System.out.println("x= "+x);
				}
				else//brak rozw w dziedzinie liczb rzecz
				{
					delta *=(-1);
					double sqrtDelta=Math.sqrt(delta);
					double x1,x2,imag;
					x1=(-wsp[1])/(2.0*wsp[0]);
					imag=sqrtDelta/(2.0*wsp[0]);
					x2=(-wsp[1])/(2.0*wsp[0]);
					System.out.println("x1= "+x1+"-"+imag+"i"+" x2= "+x2+"+"+imag+"i");
				}
			}
			else if(wsp[1]!=0)//liniowa
			{
				double x=(wsp[2]/wsp[1])*(-1.0);
				System.out.println("x="+x);
			}
			else
			{
				System.out.println("To jest linia prosta.");
			}
		}
		
	}	
}
