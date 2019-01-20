import java.util.Scanner;

public class GugudanIf {
	public static void main(String[] args) {
		/*요구사항
		 * 2미만, 9초과 입력시 "2단부터 9단까지만 출력할 수 있습니다" 메세지 출력
		 */
		
		System.out.println("구구단을 출력할 단을 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("구구단은 2단부터 출력가능합니다.");
		} else if(num > 9) {
			System.out.println("구구단은 9단까지 출력가능합니다.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n",num,i,num*i);
			}
		}
		
	}

}
