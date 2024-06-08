package arrays;

public class arraysNum {
    public void arrayInt (){
         int[] numeros = new int[11];
         for(int i= 0; i <= 10; i++){
             numeros[i] = i+1;
         }
        System.out.println(numeros.length);

    }
    public void arrayString(){
        String[] datos = {"Jose", "Juan", "Miguel", "Lorena", "Felix"};

        for (String dato : datos) {
            System.out.println(dato);
        }
    }
}
