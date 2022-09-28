public class Main {
    public static void main(String[] args) {
        //ДЗ 1
        //Задание 1
        System.out.println("  Задание 1");
        int [] array1 = new int []{1, 2, 3};
        double [] array2 = {1.57, 7.654, 9.986};
        boolean [] array3 = new boolean[]{true, true, false};

        //Задание 2
        System.out.println("  Задание 2");
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            if (i < 2){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i]);
            if (i < 2){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i]);
            if (i < 2){
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3
        System.out.println("  Задание 3");
        for (int i = array1.length - 1; i >= 0; i--){
            System.out.print(array1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array2.length - 1; i >= 0; i--){
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array3.length - 1; i >= 0; i--){
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 4
        System.out.println("  Задание 4");
        for (int i = 0; i < array1.length; i++){
            if (array1[i] % 2 != 0){
                array1[i] = array1[i] + 1;
            }
            System.out.println(array1[i]);
        }
    }
}