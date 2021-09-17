
public class App {

	public static void main(String[] args) {
        int numVeces = 10, num1 = 0, num2 = 1, total = 1;
        System.out.println(num1);         
        System.out.println(num2);
        for (int i = 1; i < numVeces; i++) {
            total = num1 + num2;
            num1 = num2;
            num2 = total;
            System.out.println(total);
        }
	}

}
