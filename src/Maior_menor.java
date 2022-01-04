public class Maior_menor {

	public static void main(String[] args) {
		int um= 500;
		int dois= 200;
		int tres= 100;
		if (um< dois && um< tres) {
			System.out.println("O número " +um+ " é o menor!");
		} else if (dois < um && dois < tres) {
			System.out.println("O número " +dois+ " é o menor! ");
		} else {
			System.out.println("O número " +tres+ " é o menor! ");
		} 
		if (um> dois && um> tres) {
			System.out.println("O número " +um+ " é o maior!");
		} else if (dois> um && dois> tres) {
			System.out.println("O número " +dois+ " é o maior! ");
		} else {
			System.out.println("O número " +tres+ " é o maior! ");
		}
	}	
}
