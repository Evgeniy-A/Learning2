//import java.util.Arrays;
//import java.util.Scanner;
//
//import static java.lang.Integer.MAX_VALUE;
//
//
//public class Main {
//    public static void (String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] arr = new int[n][m];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        int[] maxColumnNums = new int[m];
//
//        for (int i = 0; i < m; i++) {
//            int max = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[j][i] > max) {
//                    max = arr[j][i];
//                    maxColumnNums[i] = arr[j][i];
//                }
//            }
//        }
//
//        int[] minRowNums = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int min = MAX_VALUE;
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] < min) {
//                    min = arr[i][j];
//                    minRowNums[i] = arr[i][j];
//                }
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            boolean hasPoint = false;
//            int pointJ = 0;
//            int pointI = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[j][i] == maxColumnNums[i] && arr[j][i] == minRowNums[j]) {
//                    hasPoint = true;
//                    pointJ = j + 1;
//                    pointI = i + 1;
//                }
//            }
//            if (hasPoint) {
//                System.out.println(pointJ + " " + pointI);
//            }
//        }
//    }
//}