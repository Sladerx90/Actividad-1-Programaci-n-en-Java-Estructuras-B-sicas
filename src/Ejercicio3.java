public class Ejercicio3 {
    public static void main(String[] args) {

                int num1 = 15;
                int num2 = 25;
                int num3 = 10;

                // Compara para encontrar el número mayor
                if (num1 >= num2 && num1 >= num3) {
                    System.out.println("El número mayor es: " + num1);
                } else if (num2 >= num1 && num2 >= num3) {
                    System.out.println("El número mayor es: " + num2);
                } else {
                    System.out.println("El número mayor es: " + num3);
                }

        System.out.println(" Ejemplo con números iguales ");
        int a = 30;
        int b = 30;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("El número mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El número mayor es: " + b);
        } else {
            System.out.println("El número mayor es: " + c);
        }
    }
}

