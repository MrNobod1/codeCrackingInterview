public class Main {

    //           0 1 2 3 4
    // notas = { 4 5 6 7 7 }
    // notas[1] == 4
    // notas[2] == 5
    public static void main(final String... args) {

        //IndexOutOfBoundException.
        int[] notas = new int[9]; // guardamos 9 cajitas en las que dejar enteros.
        int[] notas_1 = new int[] {1, 2, 3, 4}; // ya le decimos que tenemos 4 cajitas de enteros con valor.

        // rellenamos las cajitas.
        for (int i = 0; i < notas.length; i++) {
            notas[i] = i;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

    }

}