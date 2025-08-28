public class Ejercicio6 {
    public static void main(String[] args) {

        int nota = 7;

        switch (nota){
            case 1, 2, 3:
                System.out.println("Insuficiente");
                break;
            case 4:
                System.out.println("Suficiente");
                break;
            case 5:
                System.out.println("Bien");
                break;
            case 6:
                System.out.println("Muy bien");
                break;
            case 7:
                System.out.println("Excelente");
            default:
                System.out.println("Nota no valida");


        }
    }
}
