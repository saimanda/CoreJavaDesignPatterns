public class EarlyInstatiationDP {

    private static EarlyInstatiationDP earlyInstatiationDP = new EarlyInstatiationDP();

    private EarlyInstatiationDP(){

    }

    public static EarlyInstatiationDP getInstance(){
        return earlyInstatiationDP;
    }
}
