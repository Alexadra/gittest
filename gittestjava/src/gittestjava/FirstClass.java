package gittestjava;

public class FirstClass {
    
    public static int first(){
	int a = 1;
	int b = 2;
	int c = a+b;
	return c;
    }

    public static void main(String[] args) {
	System.out.println("hey");
	System.out.print("Change for conflict 1");
	System.out.println(first());
    }

}
