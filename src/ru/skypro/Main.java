package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        float[] b = {1.57f, 7.654f, 9.986f};
        byte[] c = {4, 5, 6, 11, 12};

        //задание 2
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

            if (i < a.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }

        }
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j]);

            if (j < b.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }

        }
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k]);

            if (k < c.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }

        }

        //задание 3

        for (int q = a.length - 1; q >= 0; q--) {
            System.out.print(a[q]);

            if (q > 0) {
                System.out.print(",");
            } else {
                System.out.println();
            }

        }
        for (int z = b.length - 1; z >= 0; z--) {
            System.out.print(b[z]);

            if (z > 0) {
                System.out.print(",");
            } else {
                System.out.println();
            }

        }
        for (int k = c.length - 1; k >= 0; k--) {
            System.out.print(c[k]);

            if (k > 0) {
                System.out.print(",");
            } else {
                System.out.println();
            }

        }
        // задание 4
        for (int y = 0; y < a.length; y++)

            if (a[y] % 2 != 0) {
                a[y] += 1;
                System.out.println(a[y]);

            } else {
                System.out.println(a[y]);

            }


    }


}
