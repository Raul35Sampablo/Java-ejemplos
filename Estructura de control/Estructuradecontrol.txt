public class Estructuradecontrol {
  public static void main(String args[]){
   
  int numero_uno = 5;
  int numero_dos = 3;
  int resultado = 0;
  int parametro = 2;
  
  switch(parametro){
    
    case 1: resultado = numero_uno + numero_dos;
            System.out.println("El resultado de la sumas es: " + resultado);
            break;
      
    case 2: resultado = numero_uno - numero_dos;
            System.out.println("El resultado de la resta es: " + resultado);
            break;

    case 3: resultado = numero_uno * numero_dos;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
            break;

    case 4: resultado = numero_uno / numero_dos;
            System.out.println("El resultado de la division es: " + resultado);
            break;

    default: System.out.println("Error 404");
             break;  
          
   }
  

 }
}