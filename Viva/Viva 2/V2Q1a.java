package viva2;

public class V2Q1a {
    public static void main(String[] args) {
        //modify q2 to find mode 
        
        double[] array1 = {5.2, 2.1, 17.2};
        double[] array2 = {1.3, 2.2, 11.1};
        System.out.printf("\nThe mode is: %.3f", findMode(array1, array2));
        System.out.println("");
    }

    public static double findMode(double[] a, double[] b) {
        // Merge arrays
        int n3 = a.length + b.length;
        double[] merge = new double[n3];
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merge[a.length + i] = b[i];
        }

        System.out.println("\nThe merge array: ");
        for (int i = 0; i < n3; i++) {
            System.out.print(merge[i] + " ");
        }

        // Bubble sort
        for (int pass = 0; pass < merge.length - 1; pass++) {
            for (int i = 0; i < merge.length - 1; i++) {
                if (merge[i] > merge[i + 1]) {
                    double hold = merge[i];
                    merge[i] = merge[i + 1];
                    merge[i + 1] = hold;
                }
            }
        }

        System.out.println("\nThe sorted array: ");
        for (double value : merge) {
            System.out.print(value + " ");
        }

        int count = 1;
        int maxCount = 1;
        double maxValue = merge[0];

        for (int i = 1; i < merge.length; i++) {
            if (merge[i] == merge[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = merge[i];
            }
        }

        return -1;
    }
}
