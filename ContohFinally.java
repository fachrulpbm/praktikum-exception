public class ContohFinally {
    public static void main(String[] args) {
        
        try {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println(7/0);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                System.out.println("Statement 4");
                System.out.println(13/0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Statement 6");
            }
        }
        System.out.println("Statement 7");
    }    
}
