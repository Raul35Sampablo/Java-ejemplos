public class Serie1{
	public static void main(String args[]){
		
		System.out.println("La serie for es la siguiente");
		for(int i = 1; i<=10; i++){
			if( i < 10 ){
				System.out.print(i + ",");
			}else{
				System.out.print(i);
			}
		}
		
		i = 0;
		
		System.out.println("La serie while es la siguiente");
		while( i < 10){
			i++;
			if( i < 10 ){
				System.out.print(i + ",");
			}else{
				System.out.print(i);
			}
			
		}
		
		
		j = 0;
		
		System.out.println("La serie do while es la siguiente");
		
		do{
			j++;
			if(j < 10){
				System.out.print(j + ",");
			}else{
				System.out.print(j);
			}
			
		}while(j < 10);
		
		
		
		
		
		
	}  
}