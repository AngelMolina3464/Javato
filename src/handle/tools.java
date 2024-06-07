package handle;

public class tools {
    public void message() {
        System.out.println("Mensaje desde el Helper");
    }

    public void typeOf() {
        double valorUno = 15.2;
        int valorDos = 12;
        boolean reject = false;
        String anunnced = "Este es una prueba";
        String subAnnunced = anunnced.substring(0, 18);
        // char letraUno = ´a´;
        String annuncedReplace = anunnced.replace("Este", "Solo");
        double valueOne = 10.75;
        double valueTwo = 85.15;
        int otro = 10;
        double result = valueOne + valueTwo + otro;
        String key = "Clave12";
        System.out.println("Decimal " + valorUno);
        System.out.println("Entero " + valorDos);
        System.out.println("Bool " + reject);
        System.out.println(anunnced.length());
        System.out.println(subAnnunced);
        System.out.println("Todo en Minuscula: " + subAnnunced.toUpperCase());
        System.out.println("Ya Reemplazado " + annuncedReplace);
        System.out.println("Resultado: " + result);

        if (key.equals("Clave133")) {
            System.out.println("Clave " + key + " Aceptada");

        } else if (key.equals("Clave13")) {
            System.out.println("Clave " + key + " Casi Casi ...pero no");
        } else {
            System.out.println("Clave " + key + " No es Correcta");
        }
    }
}
