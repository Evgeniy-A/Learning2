public class Rose {
    int amount;
    static int sumAmount = 0;
    static int max = 0;

    public Rose (int amount){
        this.amount = amount;
        sumAmount += amount;
        if(amount > max){
            max = amount;
        }
    }
}