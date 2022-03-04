package implementation;

public class Ex4_2 {
	public static void main(String[] args) {
		int N = 5;
		int answer = 0;
		
		for (int h = 0; h <= N; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					
					if (check(h, m, s)) {
						answer++;
					}
				}
			}
		}
		
		System.out.println(answer);
	}
	
	public static boolean check(int h, int m, int s) {
		String hour = h + "";
		String min = m + "";
		String sec = s + "";
		
		if (hour.contains("3") || min.contains("3") || sec.contains("3")) 
			return true;
		
		return false;
	}
	
	//완전탐색 >> 데이터가 100만건 이하인 경우
}
