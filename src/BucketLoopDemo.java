public class BucketLoopDemo {
    /*
     * Loops:
     *
     * for(start ; condition ; action) {}
     * while() {}
     * do{
     *
     * } while()
     * foreach() {}
     *
     * */


    // bigBucketVolume = bigBucketVolume + smallBucketVolume;

    public static void main(String[] args) {
        double bigBucketVolume = 4.5;
        double smallBucketVolume = 1;
        double maxBigBucketVolume = 5;
        String action = "1 step. Fill in big bucket.\nBig bucket volume: " + bigBucketVolume;

//        // action 1
//        bigBucketVolume += smallBucketVolume;
//        System.out.println("1 step. Fill in big bucket.\nBig bucket volume: " + bigBucketVolume);
//        // action 2
//        bigBucketVolume += smallBucketVolume;
//        System.out.println("1 step. Fill in big bucket.\nBig bucket volume: " + bigBucketVolume);
//        // action 3
//        bigBucketVolume += smallBucketVolume;
//        System.out.println("1 step. Fill in big bucket.\nBig bucket volume: " + bigBucketVolume);
//        // action 4
//        bigBucketVolume += smallBucketVolume;
//        System.out.println("1 step. Fill in big bucket.\nBig bucket volume: " + bigBucketVolume);
//        // action 5
//        bigBucketVolume += smallBucketVolume;
//        System.out.println("1 step. Fill in big bucket.\nBig bucket volume: " + bigBucketVolume);

//        for(int counter = 1; counter <= maxBigBucketVolume; counter++) {
//            // code
//            bigBucketVolume += smallBucketVolume;
//            System.out.println("counter: " + counter);
//            System.out.println("1 step. Fill in big bucket.\nBig bucket volume: " + bigBucketVolume);
//
//        }

//        for (int i = 20; i >= 0; i -= 2) {
//            System.out.printf("i: %s; ", i);
//        }


//        for (int i = 20; i >= 0; i -= 2) {
//            System.out.printf("i: %s; ", i);
//        }

//        for (int i = 0, j = 0, c = 100; i <= 20 && j <= 40; i += 2, j += 4, c -= 10) {
//            System.out.printf("i: %s; j: %s; c: %s\n ", i, j, c);
//        }

//        for(int i = 0; i <= 10; i++) {
//            // outer loop
//
//
//            for(int j = 0; j <= 10; j++) {
//                // inner loop
//            }
//            // end of iteration of outer loop
//        }
//        int c = 0;
//        boolean cond = c < 10;
//        for( ; cond; ) {
//            int i = 0;
//            System.out.println(i++);
//        }

        do {
            bigBucketVolume += smallBucketVolume;
            // code
        } while (false);

        System.out.println("1 step. Fill in big bucket.\nBig bucket volume: " + (int)bigBucketVolume);
        System.out.println("End");

    }
}
