public class SWITCH {
	public static void main(String args []){
		
		int numero_1 = 5, numero_2 = 3, resultado = 0;  //La variable numero_1 es 5, la variable numero_2 es 3, y la variable resultado es 0
		int parametro =  1;
		
		switch(parametro){
			
			case 1: resultado =numero_1 + numero_2;
			        System.out.println("El resultado de la suma es " + resultado);
			        break;
			
			case 2: resultado =numero_1 - numero_2;
			        System.out.println("El resultado de la resta es " + resultado);
			        break;
			
			case 3: resultado =numero_1 * numero_2;
			        System.out.println("El resultado de la multiplicacion es " + resultado);
			        break;
			
			case 4: resultado =numero_1 / numero_2;
			        System.out.println("El resultado de la divison es " + resultado);
			        break;
			
			default: System.out.println("Error la opcion no existe");
			
		}
		
		
		
	}	

}