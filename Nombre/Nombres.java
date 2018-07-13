import java.util.Scanner;

public class Nombres{
	public static void main(String args []){
		
		String nombre_1 = "";                         //Aqui se va a almacenar el nombre_1
		String nombre_2 = "";                         //Aqui se va a almacenar el nombre 2
		
		Scanner entrada = new Scanner(System.in);     //Activamos la entrada del teclado
		
		System.out.print("Por favor ingresa el nombre: ");       //Imprime en la consola "Por favor ingresa el nombre:"
		nombre_1 = entrada.nextLine();                           //Lo que ingrese el usuario sera almacenado en la variable nombre_1
		
		System.out.print("Por favor dame el segundo nombre: ");  //Imprime en la consola "Por favor ingresa el segundo nombre:"
		nombre_2 = entrada.nextLine();                           //Lo que ingrese el usuario sera almacenado en la variable nombre_2  
		
		if( nombre_1.equalsIgnoreCase(nombre_2) ){               //si nombre_1 es similar o igual a el nombre_2
			System.out.println("Los nombres coinciden");         //Imprime en la consola ""Los nombres coinciden""
		}else{                                                   //Sino
			System.out.println("Los nombres no coinciden");      //Imprime en la consola ""Los nombres no coinciden""
		}
		
		
		
	}
	
}