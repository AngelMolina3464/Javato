package annunced;

public class annuncedText {
    public void textoSinRetorno() {
        System.out.println("Esto es una Funcion sin Retorno ");
    }

    public String textoConRetorno(){
        return "Esto es una Funcion con Retorno";
    }
    public String textoConRetorno(String message){
        return  message;
    }
}
