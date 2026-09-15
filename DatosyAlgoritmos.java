public class DatosyAlgoritmos{

    public static void main(String[] args){
        int[] notas = {12, 15, 19, 9};

        int suma = notas[0] + notas[1] + notas[2] + notas[3];
        double promedio = suma/4;

        boolean aprobado = promedio >= 13;

        System.out.println("Aprobado " + aprobado);
    }


}