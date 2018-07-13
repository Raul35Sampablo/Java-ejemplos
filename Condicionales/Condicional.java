public class Condicional{
  public static void main(String args[]){
  
    int Matematicas = 5;
    int Quimica = 4;
    int Biologia = 3;
    int promedio = 0;

    promedio = (Matematicas + Quimica + Biologia) / 3;
   
    if(promedio >=6){
      System.out.println("El alumno aprobo con " + promedio); 
    } else {
      System.out.println("El alumno reprobo con " + promedio);
    }

 }
}