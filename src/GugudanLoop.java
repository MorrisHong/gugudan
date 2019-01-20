
public class GugudanLoop {
	public static void main(String[] args) {
		//반복문을 이용해서 구구단을 출력한다. 
		
		int i = 1;
		//6단
		System.out.println("6단");
		
		while(i <= 9) {
			System.out.println(6 * i);
			i = i + 1;		// i++;
		}
		System.out.println();
		//7단
		System.out.println("7단");
		for(i = 1; i < 10; i++) {
			System.out.println(7 * i);
		}
		System.out.println();
	}
}
