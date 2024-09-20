package com.mycompany.ordenar;

public class ArrayOrdenar {
    int[] array = new int[5];

    public ArrayOrdenar(int num1, int num2, int num3, int num4, int num5) {
        int[] array = { num1, num2, num3, num4, num5 };
        this.array = array;
    }

    public void ordenar() {
            int tmp;
            for (int y = 0; y < array.length - 1; y++) {
                for (int y2 = y ; y2 < array.length; y2++) {
                    if (array[y] > array[y2]) {
                        tmp = array[y];
                        array[y] = array[y2];
                        array[y2] = tmp;
                    }
                }
            }
    }

    public void mostrar() throws ArrayIndexOutOfBoundsException{
        for (int y = 0; y < 6; y++) {
            if (y > array.length){
                throw new ArrayIndexOutOfBoundsException("error");
            }
            System.out.print(array[y] + " ");
        }
        System.out.println(" ");
    }
}
