package Learning;

public class Calculator {
   int current;

    public Calculator(int current) {
        this.current = current;
    }

    public void plus(int number){
        current += number;
    }
    public void minus(int number){
        current -= number;
    }
}
