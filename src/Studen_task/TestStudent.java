package Studen_task;

public class TestStudent {
    public static void main(String[] args) {

        int[][] marksIvan = {{4, 4, 4, 4}, {8, 8, 8, 8}, {4, 4, 4, 4}, {4, 4, 4, 4}};
        Student ivan = new Student("Ivan",marksIvan);

       double x = ivan.getAverage(2);
        System.out.println(x);

    }
}
