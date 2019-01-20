import java.util.Scanner;
public class GugudanScann {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	//System.out.println();은 out이므로 출력 System.in은 in이므로 입력
		System.out.println("구구단을 출력할 단을 입력해주세요. : ");
		int num = scanner.nextInt();	//int형으로 값을 입력받는다.
		
		System.out.println(num+"단");
		System.out.println(num +" * 1 = " + num * 1);
		System.out.println(num +" * 2 = " + num * 2);
		System.out.println(num +" * 3 = " + num * 3);
		System.out.println(num +" * 4 = " + num * 4);
		System.out.println(num +" * 5 = " + num * 5);
		System.out.println(num +" * 6 = " + num * 6);
		System.out.println(num +" * 7 = " + num * 7);
		System.out.println(num +" * 8 = " + num * 8);
		System.out.println(num +" * 9 = " + num * 9);
	}
}
