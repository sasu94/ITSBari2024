public class Prova{
	
	
	public static void stampaPrimi(int n){
		for (int i = 3; i < n; i++) {
			if(isPrimo(i)){
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrimo(int n) {
		for (int j = 2; j < n; j++) {
			if(n%j==0){return false;}
		}
		return true;
	}

	public static boolean isPalindroma(String s){
		for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}

	private static void sottostringhe(String s){
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j >i + 2; j--) {
				var sub = s.substring(i, j);
				if(isPalindroma(sub))
					System.out.println(sub);
			}
		}
	}

	public static void main(String[] args){	
		int n=15;
		stampaPrimi(n);

		String s = "sottosotto";
		sottostringhe(s);

	}
}