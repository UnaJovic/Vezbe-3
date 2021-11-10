package vezbe3;

public class BookTest {

	public static void main(String[] args) {
			
		Book bookOne = new Book();
			
		Book bookTwo = new Book("Digital Fortress", "Dan Brown", 445, 900);
			
		bookOne.setName("Inferno");
		bookOne.setAuthor("Dan Brown");
		bookOne.setNumberOfPages(445);
		bookOne.setPrice(950);
			
		System.out.println(bookOne.calculateDiscountPrice(15));
			
		if(bookOne.calculateDiscountPrice(15) < bookTwo.calculateDiscountPrice(20)) {
			System.out.println(bookOne.getName());
			}
		else {
			System.out.println(bookTwo.getName());
		}
			
	}
	
}