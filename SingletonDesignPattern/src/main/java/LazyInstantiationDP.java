public class LazyInstantiationDP {

    private static LazyInstantiationDP lazyInstantiationDP;


    private LazyInstantiationDP(){

    }

    public static LazyInstantiationDP getInstance(){
        if(lazyInstantiationDP == null){
            synchronized(LazyInstantiationDP.class){
                if(lazyInstantiationDP == null){
                    lazyInstantiationDP = new LazyInstantiationDP();
                }
            }
        }
        return lazyInstantiationDP;
    }


}
