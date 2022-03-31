import java.util.Scanner;

public class GeneralLoopDemo {
    /*
     * Loops:
     *
     *  1) for(counter; conditional; action) {
     *  //code
     *
     * } - используется при заранее известном колличестве итераций
     *
     *
     *  while (condition) {
     *  // code
     * }
     *
     *  do {
     *  // code
     * } while(condition) - блок do  выполняется минимум 1 раз
     *
     *
     * */

    public static void main(String[] args) {

//        for(int counter = 0; counter <= 10; counter++) {
//            //code
//            System.out.println("Hello World " + counter);
//        }

//        for(int counter = 0; counter <= 10; counter += 2) {
//            System.out.println("counter = " + counter);
//        }

//        for(int counter = 9; counter > 0; counter -= 2) {
//            System.out.println("counter = " + counter);
//        }

//        for(int i = 0, j = 0, c = 100; i <= 10 && j <= 8; i += 1, j += 2, c -= 10) {
//            System.out.printf("i = %s; j = %s; c = %s\n", i, j, c);
//        }

//        for( ; 5 < 10; ) {
//            System.out.println("Infinity");
//        }

//        for (int i = 0; true; i++) {
//            System.out.println("i = " + i);
//            if( i == 10) {
//                System.out.println("Condition of breaking");
//                break;
//            }
//        }
//        for(int i = 0; i < 10; i++) {
//            if(i == 5) {
//                continue;
//            }
//            System.out.println("i = " + i);
//        }

//        for(int i = 0; i < 5; i++) {
//            // body of outer loop
//            for(int j = 0; j < 10; j++) {
//                // body of inner loop
//            }
//
//        }

        int counter = 0;

//        while (counter <= 10) {
//            System.out.println("counter " + counter);
//            counter++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String s = scanner.next();
//            if(s.equals("exit")) {
//                break;
//            }
//            System.out.println(s);
//        }

//        do {
//            System.out.println("In block do");
//            counter++;
//        } while (counter <= 5);

//        do {
//            System.out.println("In block do");
//            counter++;
//        } while (false);

        // Вывести сумму числе арифм прогрессии от 0 до 20 с шагом

        int sum = 0;
        for (int i = 0; i <= 20; i += 2) {
            sum += i;
        }
        System.out.println("Sum of arithmetic progression with step 2 is: " + sum);

    }
}
