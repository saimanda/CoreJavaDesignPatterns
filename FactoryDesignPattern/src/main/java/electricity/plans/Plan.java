package electricity.plans;

public abstract class Plan {
    public double rate;
    abstract public void getRate();

    public void calculateBill(int units){
        System.out.println(" Bill is "+units*rate);
    }
}
