
public class GugudanArray {
	public static void main(String args[]) {
		//구구단 결과를 배열에 저장한 후 배열의 결과를 출력한다.
		int[] result = new int[9];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = 2 * (i + 1);
		}
		
		for(int i = 0; i < result.length; i++) {
			//System.out.println(2 + " * " + i+1 + " = " + result[i]);
			//문자열 + 숫자는 문자열이 되기 때문에 i+1은 01 , 02, 03, ... 등으로 표기되게된다.
			System.out.printf("%d * %d = %d\n", 2, i+1, result[i]);
		}
		
		System.out.println("--------2중for문으로 구현.--------");
		for(int i = 1; i < result.length; i++) {
			System.out.printf("%d단\n",i+1);
			for(int j = 0; j < result.length; j++) {
				result[j] = (i+1) * (j+1);
				System.out.printf("%d * %d = %d\n",i+1 ,j+1,result[j]);
			}
			System.out.println();
		}
	}

}
