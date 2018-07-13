import java.util.Scanner;

public class CocaCola {
   public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String Nombre= "";    //Declaramos la variable Nombre que sera ingresada por el Usuario
   int Clave = 0;         //Declaramos la variable "Clave"
   int Antiguedad = 0;    //Declaramos la variable "Antiguedad"
   
   System.out.println("");
   System.out.println("");
   System.out.println("********************************************************************************"); //Enmarca
   System.out.println("Bienvenido al sistema vacacional de Coca Cola"); //La bienvenida del sistema
   System.out.println("********************************************************************************"); //Enmarca
   System.out.println("");
   System.out.println("");
   System.out.println("********************************************************************************"); //Enmarca
   System.out.println("¿Cual es su nombre?");                           //Se pide ingresar el nombre
   System.out.println("********************************************************************************"); //Enmarca
   Nombre = in.nextLine();                                              //Se guarda lo escrito en la variable nombre
   System.out.println("");
   System.out.println("");
   
   System.out.println("");
   System.out.println("");
   System.out.println("********************************************************************************");  //Enmarca
   System.out.println("¿Cuantos años de antiguedad tiene?");            //Se pide al usuario ingresar los años laborales de antiguedad
   System.out.println("********************************************************************************");  //Enmarca
   Antiguedad = in.nextInt();                                           //Ingresa los años de antiguedad laborales
   System.out.println("");
   System.out.println("");

   System.out.println("");
   System.out.println("");
   System.out.println("********************************************************************************");  //Enmarca
   System.out.println("¿Cual es su clave?");                            //Se pide al usuario ingresar la clave del departamento
   System.out.println("********************************************************************************");  //Enmarca
   Clave = in.nextInt();                                                //Ingresa la clave del departamento
   System.out.println("");
   System.out.println("");  

 
   if(Clave==1){                                                                   //Si la clave es 1
    if(Antiguedad==1){                                                             //Y su antiguedad es de 1 año
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println(Nombre + ", usted tiene derecho a 6 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 6 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else if(Antiguedad >=2 && Antiguedad <=6){
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println(Nombre + ", usted tiene derecho a 14 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 14 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else if(Antiguedad ==7){
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println(Nombre + ", usted tiene derecho a 20 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 6 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else {
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println(Nombre + ", usted no tiene derecho a dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted no tiene derecho a dias de vacaciones" 
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    }
        
   } else if(Clave==2){                                                            //Si la clave es 2
   if(Antiguedad==1){                                                             //Y su antiguedad es de 1 año
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println(Nombre + ", usted tiene derecho a 7 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 7 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println("");
    } else if(Antiguedad >=2 && Antiguedad <=6){
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println(Nombre + ", usted tiene derecho a 15 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 15 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else if(Antiguedad ==7){
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca   
    System.out.println(Nombre + ", usted tiene derecho a 22 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 22 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else {
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println(Nombre + ", usted no tiene derecho a dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted no tiene derecho a dias de vacaciones" 
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    }

   } else if(Clave==3){                                                            //Si la clave es 3
   if(Antiguedad==1){                                                             //Y su antiguedad es de 1 año
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println(Nombre + ", usted tiene derecho a 10 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 10 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else if(Antiguedad >=2 && Antiguedad <=6){
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println(Nombre + ", usted tiene derecho a 20 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 20 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else if(Antiguedad ==7){
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca    
    System.out.println(Nombre + ", usted tiene derecho a 30 dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted tiene derecho a 30 dias de vacaciones"
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    } else {
    System.out.println("");
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println(Nombre + ", usted no tiene derecho a dias de vacaciones");   // Muestra el siguiente mensaje "Nombre + ", usted no tiene derecho a dias de vacaciones" 
    System.out.println("********************************************************************************");  //Enmarca
    System.out.println("");
    }
   } else {                                                             //Si ninguna de las claves fueron ingresadas . . . 
     System.out.println("");
     System.out.println("*******************************************************************************");  //Enmarca
     System.out.println("Error en la clave no existe");                 //El sistema muestra el siguiente mensaje "Error en la clave no existe"
     System.out.println("*******************************************************************************");  //Enmarca
     System.out.println("");
   }



 }
}