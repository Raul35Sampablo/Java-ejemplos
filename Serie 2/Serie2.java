public class Serie2{
	public static void main(String args[]){
		
		/*La serie 2 debe ser la siguiente    1,99,2,98,3,97,4,96,5,95 */
		
		int i = 1;  //La variable i vale 1.
		int m = 99; //La variable m vale 99.
		
		System.out.println("Serie con for");
		
		for(i = 1; i<=5; i++){                //i inicializa con 1 e incrementa de uno en uno mientras sea menor o igual a 5
			if(i < 5){                        //Si i es menor que 5
				System.out.print(i + ",");    //Imprime el valor de i
				System.out.print(m + ",");    //Y seguido de el imprime el valor de j
			}else{                            //Sino, osea cuando i llegue a 5
				System.out.print(i + ",");      //Imprime i
				System.out.print(m);          //Y al final con una jota
			}
			m--;                              //Mientras la instruccion for se ejecute, la variable j ira decrementando de uno en uno.
			
			
		}
		
		
		i = 0;
		m = 100;
		
		System.out.println("Serie con while");
		
		while(i < 5){                         //Mientras i sea menor que 5
			i++;                              //i incrementa de uno en uno
			m--;                              //m decrementa de uno en uno
			if(i < 5){                        //Si i es menor que 5
				System.out.print(i + ",");    //Imprime el valor de i
				System.out.print(m + ",");    //Y seguido de el imprime el valor de j
			}else{                            //Sino, osea cuando i llegue a 5
				System.out.print(i + ",");    //Imprime i
				System.out.print(m);          //Y al final con una jota
			}
			
		}
		
		
		
		
		i = 0;
		m = 100; 
		
		System.out.println("Serie con do while");
		
		do{                                   //El programa va a . . .
			i++;                              //incrementar de uno en uno
			m--;                              //y j va a decrementar
			if(i < 5){                        //Si i es menor que 5
				System.out.print(i + ",");    //Imprime el valor de i
				System.out.print(m + ",");    //Y seguido de el imprime el valor de j
			}else{                            //Sino, osea cuando i llegue a 5
				System.out.print(i + ",");    //Imprime i
				System.out.print(m);          //Y al final con una jota
			}
			
		}while(i < 5);                         //Todo este trabajo lo va a realizar mientras i sea menor que 5
		
		
		
		
	

	
		
		
		
	}
}


