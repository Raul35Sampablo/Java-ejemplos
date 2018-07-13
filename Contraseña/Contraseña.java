import java.util.Scanner;

public class Contraseña{
	public static void main(Strig args[]){
		
		String usuario = "";         //Aqui se almacena el nombre del usuario
		String password = "";        //Aqui se almacena la contraseña
		
		Scanner entrada = new.Scanner(System.in);
		
		System.out.print("Ingresa el nombre del usuario");   //Imprime en la consola "Ingresa el nombre del usuario"
		usuario = entrada.nextLine();                        //Lo que sea ingresado se almacena en la variable usuario
		
		System.out.print("Ingresa el password");            //Imprime en la consola "Ingresa el password"           
		password = entrada.nextLine();                      //Lo que sea ingresado se almacena en la variable password
		
		
		if(usuario.equals("Raul") && password.equals("123456789") ){   /*Si el nombre del usuario ingresado coincide con Raul y el pasword ingresado tambien coincide con 123456789*/
			System.out.print("Inicio de sesion correcto");
		}else{
			System.out.print("Nombre de usuario o contraseña incorrectos");
		}
		
		
		
		
		
	}
	
}