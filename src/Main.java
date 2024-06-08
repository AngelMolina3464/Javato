import handle.tools;
import firstApp.scanner;
import annunced.annuncedText;
import  arrays.arraysNum;
import advance.timer;

import javax.swing.undo.CannotUndoException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Codigo para la Obtencion de Datos en Consola
                scanner formatScanner = new scanner();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la  Tienda !");
        System.out.println("Elije una Opcion de las Siguientes ");

             // Opciones
         System.out.println("Numero 1 : 🥤 (Soda) ");
        System.out.println("Numero 2: 🥛(Cafe) ");
        System.out.println("Numero 3 : 🍜 (Sopa) ");

        int opcion = scanner.nextInt();
        String texto;

        formatScanner.scannerHeader();

        switch (opcion) {
            case 1:
                System.out.println("Con la Soda, Tienes una buena Eleccion ");
                texto = "Tiene un Costo de 150 Yemes";
                System.out.println(texto);
                break;
            case 2:
                System.out.println("Con el Cafe, Tienes una buena Eleccion ");
                texto = "Tiene un Costo de 200 Yemes";
                System.out.println(texto);
                break;
            case 3:
                System.out.println("Con La Sopa, Tienes una buena Eleccion ");
                texto = "Tiene un Costo de 400 Yemes";
                System.out.println(texto);
                break;
            default:
                System.out.println("No fue una Opcion Valida, Favor de verificar su Compra  !");
                break;

        }

        formatScanner.scannerFooter();

         */

        /*
         annuncedText textProvider = new annuncedText();
        textProvider.textoSinRetorno();
        System.out.println(textProvider.textoConRetorno());
        System.out.println(textProvider.textoConRetorno("Con Retorno pero con el mensaje Implicito"));
         */

        /*
           int numeroCo0ndicion = 2;

   for (int j= 1;j <= numeroCo0ndicion; j++){
       System.out.println(j);
       if (j >= 5 && j<=8) {
           continue;
       }
       System.out.println("Sale el Numero con la : "+ j);
   }


  * */

        /*
        *         arraysNum arraysFunc = new arraysNum();
        arraysFunc.arrayInt();
        arraysFunc.arrayString();
        *
        * */

        timer advanceStatic = new timer();
        System.out.println(advanceStatic.timerResolve(3,25));

       }
    }