public class Fibonacci{
	public static void main(String args[]){

		int i = 0;
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("Sucesion con for");
		
		for(i = 0; i <= 10; i++){
			System.out.print(a + ",");
		    c = a + b;
		    a = b;
		    b = c;
		}
		
		
		i = 0;
		a = 0;
		b = 1;
		c = 0;
		
		System.out.println("Sucesion con while");
		while (i <= 10){
			System.out.print(a + ",");
		    c = a + b;
		    a = b;
		    b = c;
			i++;
		}
		
		
		
		i = 0;
		a = 0;
		b = 1;
		c = 0;
		
		System.out.println("Sucesion con do while");
		do{
			System.out.print(a + ",");
			c = a + b;
		    a = b;
		    b = c;
			i++;
		}while(i <= 10);
		
		






	}

}