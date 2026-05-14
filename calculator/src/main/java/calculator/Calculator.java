package calculator;

public class Calculator {
	
	public int add(int a, int b)
    {
        int result = a + b;
        System.out.println("Addition : " + result);
        return result;
    }
    public int sub(int a, int b)
    {
        int result = a - b;
        System.out.println("Subtract : " + result);
        return result;
    }
    public int mul(int a, int b)
    {
        int result = a * b;
        System.out.println("Multiply : " + result);
        return result;
    }
}
