package basic.library;

public class BasicLibrary {
        public int[] roll(int n) {
            int[] rollResults = new int[n];
            for (int i = 0; i < rollResults.length; i++) {
                ///random number generator
                int dieRoll = (int) (Math.random() * 6 + 1);
                rollResults[i] = dieRoll;
                System.out.println(dieRoll);
            }
            System.out.println(rollResults);
            return rollResults;
        }
}
