import org.junit.runner.JUnitCore;

public class Main{
    public static void main(String[] args) {
        try{
            JUnitCore.runClasses(TestSuite.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
