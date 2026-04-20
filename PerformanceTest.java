package Strings;

public class PerformanceTest {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        // StringBuffer (Thread-safe, slower)
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("Tpoint");
        }

        System.out.println("Time taken by StringBuffer: " +
                (System.currentTimeMillis() - startTime) + " ms");

        // Reset time
        startTime = System.currentTimeMillis();

        // StringBuilder (Not thread-safe, faster)
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb2.append("Tpoint");
        }

        System.out.println("Time taken by StringBuilder: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }
}