public class ContohThrows {

    public static void lemparKesalahan() throws ArithmeticException {
        System.out.println(17/0);
    }

    public static void showInfo(){
        System.out.println("Halo!!");
    }

    public static void main(String[] args) {
        lemparKesalahan();
        showInfo();
    }
    
}
