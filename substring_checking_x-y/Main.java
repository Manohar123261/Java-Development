/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static boolean fun(String x,String y){
		    int m=x.length(),n=y.length();
		    if(m==0 || n==0)
		        return true;
		    String tmp="";
		    if(n>m)
		        return false;
		    if(x==y)
		        return true;
		    for(int i=0;i<=m-n;i++){
		        if(x.charAt(i)==y.charAt(0)){
		            for(int j=i;j<i+n;j++)
		                tmp+=x.charAt(j);
		            if(tmp.equals(y))
		                return true;
		            tmp="";
		        }
		    }
		    return false;
		}
		
	public static void main(String[] args) {
		String x="manohar",y="";
		if(fun(x,y) || fun(y,x))
		    System.out.println("yes");
		else
		    System.out.println("No");

	}
}
