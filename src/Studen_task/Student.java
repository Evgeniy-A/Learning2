package Studen_task;

public class Student {
    String name;
    int[][] marks;

    public Student(String name, int[][] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverage(int quarter){
        double sum = 0;
        int [] quarterMarks = marks [quarter - 1];
        for (int quarterMark : quarterMarks){
            sum += quarterMark;
        }
        return sum / marks.length;
    }

   public double getAverage(){
        double sum = 0;
       for (int i = 1; i < marks.length; i++) {
           sum += getAverage(i);
       }
           return sum / marks.length;
   }
}
