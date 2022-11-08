package myPackage;

public class main {

	public static void main(String[] args) {
		
		int[] szamok = {4, 5, 5, 52, 21, 0, 14, 1};
		
		System.out.println(atlag(szamok));
		System.out.println(min(szamok));
		System.out.println(max(szamok));

	} //end main
	
	private static double atlag(int szamok[]) {
		double atlag = 0;
		int temp = 0;
		for (int i = 0; i < szamok.length; i++) {
			temp += szamok[i];
		}
		atlag = (double)temp / szamok.length;
		return atlag;
	} //end atlag
	
	private static int min(int szamok[]) {
		int min = szamok[0];
		for (int i = 1; i < szamok.length; i++) {
			if (szamok[i] < szamok[i-1]) {
				min = szamok[i];
			}
		}
		return min;
	} //end min
	
	private static int max(int szamok[]) {
		int max = szamok[0];
		for (int i = 0; i < szamok.length; i++) {
			if (szamok[i] > max) {
				max = szamok[i];
			}
		}
		return max;
	}

} //end class
