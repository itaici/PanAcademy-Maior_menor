public class Maior_menor {

	public static void main(String[] args) {
		int um= 500;
		int dois= 200;
		int tres= 100;
		if (um< dois && um< tres) {
			System.out.println("O n�mero " +um+ " � o menor!");
		} else if (dois < um && dois < tres) {
			System.out.println("O n�mero " +dois+ " � o menor! ");
		} else {
			System.out.println("O n�mero " +tres+ " � o menor! ");
		} 
		if (um> dois && um> tres) {
			System.out.println("O n�mero " +um+ " � o maior!");
		} else if (dois> um && dois> tres) {
			System.out.println("O n�mero " +dois+ " � o maior! ");
		} else {
			System.out.println("O n�mero " +tres+ " � o maior! ");
		}
	}	
}
