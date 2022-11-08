public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1");
        //Объявите три массива:
        //
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
        //3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
        // массива: с помощью ключевого слова или сразу заполненный элементами.

        int [] integer = new int[3];
        integer [0] = 1;
        integer [1] = 2;
        integer [2] = 3;

        double [] fraction = {1.57, 7.654, 9.986};

        int [] freeArrey = {6, 126, 17, 28};

        System.out.println("\n");

        System.out.println("Exercise 2");
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        //начиная с первого элемента, через запятую. Запятая между последним элементом одного
        //массива и первым элементом следующего не нужна.
        for (int i = 0; i < integer.length; i++) {
            if (i == integer.length - 1) {
                System.out.print(integer[i]);
            } else {
                System.out.print(integer[i] + ", ");
            }
        }

        System.out.println(" ");

        for (int i = 0; i < fraction.length; i++) {
            if (i == fraction.length - 1) {
                System.out.print(fraction[i]);
            } else {
                System.out.print(fraction[i] + ", ");
            }

        }

        System.out.println(" ");

        for (int i = 0; i < freeArrey.length; i++) {
            if (i == freeArrey.length - 1) {
                System.out.print(freeArrey[i]);
            } else {
                System.out.print(freeArrey[i] + ", ");
            }
        }

        System.out.println("\n");

        System.out.println("Exercise 3");
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с
        // первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую,
        // при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        for (int i = integer.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(integer[i]);
            } else {
                System.out.print(integer[i] + ", ");
            }
        }

        System.out.println(" ");

        for (int i = fraction.length-1; i >= 0; i--) {
           if (i == 0) {
               System.out.print(fraction[i]);
           } else {
               System.out.print(fraction[i] +", ");
           }
        }

        System.out.println(" ");

        for (int i = freeArrey.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(freeArrey[i]);
            } else {
                System.out.print(freeArrey[i] + ", ");
            }
        }

        System.out.println("\n");

        System.out.println("Exercise 4");
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                integer[i] = integer[i] + 1;}
                if (i == integer.length - 1) {
                    System.out.print(integer[i]);
                } else {
                    System.out.print(integer[i] + ", ");
                }
            }
        }
    }
