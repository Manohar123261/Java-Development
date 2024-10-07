/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    // Creating objects for single thread environment- Easy solution
		singleton obj1=singleton.getinstance();
		singleton obj2=singleton.getinstance();
		System.out.println("objects of lazy solution is created");
		System.out.println(singleton.obj_count);
		// Creating objects for multiple threads singleton class- Eager solution
		singleton_multiple_threads obj3=singleton_multiple_threads.getinstance();
		singleton_multiple_threads obj4=singleton_multiple_threads.getinstance();
		System.out.println("object for Eager solution is created");
		System.out.println(singleton_multiple_threads.obj_count);
	}
}
