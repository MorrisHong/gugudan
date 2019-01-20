import java.util.Scanner;

public class GugudanMethod {
	public static void main(String args[]) {
		//반복되는 부분을 메소드로 만들어 호출합시다!
		System.out.println("구구단 단을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int[] result = calculate(num);
		print(result, num);
		
	}
	public static void print(int[] result, int times) {
		for(int i =0; i < result.length; i++) {
			System.out.printf("%d * %d = %d\n",times, i+1, result[i]);
		}
	}
	
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
}
