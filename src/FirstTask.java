
@TestClass(param = "string")
public class FirstTask {
    private int k = 1;
    private int k2 = 2;

    FirstTask(){
    }

    @Test(a = 2, b = 5)
    public void test(int a, int b){
        System.out.println("OPTIONS  a = "+ a + ", b = "+ b);
    }
}
