import java.util.Scanner; //Importamos la libreria "Scanner"

public class Teclado{ //Creamos la clase Teclado
  public static void main(String args[]){
  
  Scanner in = new Scanner(System.in);  //Le decimos al sistema que "se usara el teclado
  String nombre = "";   //Creamos la variable nombre, aqui el usuario ingresara su nombre
  int numero_Uno = 0;
  int numero_Dos = 0;
  int resultado = 0;

  System.out.println("¿Cual es tu nombre?"); //La pantalla nuestra el mensaje "¿Cual es tu nombre?"
  nombre = in.nextLine();                    //La computadora almacena el "nombre" que ingrese el usuario

  System.out.println("Dame el primer valor para tu suma");  //La pantalla nuestra el mensaje "Dame el primer valor para tu suma"
  numero_Uno = in.nextInt();                                //La computadora almacena ese valor en la variable "numero_Uno"

  
  System.out.println("Dame el segundo valor para tu suma"); //La pantalla muestra el mensaje "Dame el segundo valor para tu suma"
  numero_Dos = in.nextInt();                                //La computadora almacena ese valor en la variable "numero_Dos"

  resultado = numero_Uno + numero_Dos;                        //Suma las variables "numero_Uno" y "numero_Dos" y las almacena en la
                                                             //variable "resultado".
  
  System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado); //Muestra tu "nomre almacenado" y con la frase "tu
                                                                                     //resultado es" y se anexa el valor del resultado 
                                                                                     //de la suma
  
   
  }
}

