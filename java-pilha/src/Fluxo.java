
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main"); // no modo Debug fluxo pressione "F6" para continuar a execução do código(linha por linha)
        try {
        	metodo1(); // no modo Debug fluxo pressione "F5" para entrar no método(entrando no método)
        } catch (ArithmeticException | NullPointerException e)  {
        	String msg = e.getMessage();
        	System.out.println("ArithmeticException " + msg);
        	e.printStackTrace();
        } 
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0; 
//            Conta c = null;
//            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}