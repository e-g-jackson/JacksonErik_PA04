/**
 * Description: This program creates a Book class that includes constructors, getters, setters and several other methods.
 * 			One method opens the book but only if it is closed, another closes the book, but only if it is open. There is 
 * 			a method that compares the authors of two books. There is also a method that decides if a book is old or not, 
 * 			depending on the year published.
 * 
 * Inputs: The inputs are handled by the driver main() method.
 * 
 * Outputs: This outputs a stock list of books, with all of their attributes converted to strings. Then it goes on to test 
 * 			the various methods included in the program and output their results.
 * 
 * 
 * @author Erik Jackson
 * @contact erik.jackson@my.century.edu
 * @since 10/06/2024
 * 
 * Institution: Century College
 * Class: CSCI 1082-01 Fa24
 * Professor: Mathew Nyamagwa
 * 
 */

public class Driver {
	
	public static void main(String[] args) {
		
		// The following lines test the constructor with arguments.
		Book ninteenEightyFour = new Book("1984", "George Orwell", 1949, 362, 16.99);
		Book animalFarm = new Book("Animal Farm", "George Orwell", 1945, 250, 19.49);
		Book farenheit451 = new Book("Farenheit 451", "Ray Bradbury",1953, 160, 11.39);
		Book thePeripheral = new Book("The Peripheral", "William Gibson", 2014, 512, 10.29);
		Book endersGame = new Book();
		
		//testing the toString() method
		System.out.println("*****ERIK JACKSON'S BOOK LIST*****");
		System.out.println(ninteenEightyFour.toString());
		System.out.println(animalFarm.toString());
		System.out.println(farenheit451.toString());
		System.out.println(thePeripheral.toString());
		
		// Test all of the methods
		System.out.println("\n\nLet's add a new book.\n");
		System.out.println("New book, Enders Game, before setters are used.");
		
		// This tests the constructor with no arguments
		System.out.printf("\nTitle: %20s\n", endersGame.getTitle());
		System.out.printf("Author: %19s\n", endersGame.getAuthor());
		System.out.printf("Year Published: %11s\n", endersGame.getPublishedYear());
		System.out.printf("Pages: %20s\n", endersGame.getPages());
		System.out.printf("Cost: %21s\n", endersGame.getCost());
		System.out.printf("Is it open? %15s\n", endersGame.getOpenStatus());
		
		// testing the setters
		endersGame.setTitle("Ender's Game");
		endersGame.setAuthor("Orson Scott Card");
		endersGame.setPublishedYear(1985);
		endersGame.setPages(256);
		endersGame.setCost(21.58);
		endersGame.setOpened(true);
		
		// Testing the getters
		System.out.println("\nNow here is ender's game, after the setters are used.");
		System.out.printf("\nTitle: %20s\n", endersGame.getTitle());
		System.out.printf("Author: %19s\n", endersGame.getAuthor());
		System.out.printf("Year Published: %11s\n", endersGame.getPublishedYear());
		System.out.printf("Pages: %20s\n", endersGame.getPages());
		System.out.printf("Cost: %21s\n", endersGame.getCost());
		System.out.printf("Is it open? %15s\n", endersGame.getOpenStatus());
		
		// Testing the isOpen() and isClosed() methods
		System.out.println("\n***Testing the openBook() and closeBook() methods:***");
		System.out.println("\nEnder's Game is currently opened. Can it be opened again? -- It should say \"The book is already opened!\"");
		System.out.println(endersGame.openBook());
		System.out.println("Is it open? -- It should be true \n" + endersGame.getOpenStatus());
		System.out.println("\nEnder's Game is currently opened. Can it be closed? -- It should say \"The book is now closed!\"");
		System.out.println(endersGame.closeBook());
		System.out.println("Is it open? -- it should be false \n" + endersGame.getOpenStatus());
		System.out.println("\nEnder's Game is currently closed. Can it be closed again? -- It should say \"The book is already closed!\"");
		System.out.println(endersGame.closeBook());
		System.out.println("Is it open? -- it should be false\n " + endersGame.getOpenStatus());
		System.out.println("\nEnder's Game is currently closed. Can it be opened? -- It should say \"The book is now opened!\"");
		System.out.println(endersGame.openBook());
		System.out.println("Is it open? -- it should be true \n" + endersGame.getOpenStatus());
		
		// Testing the isOld() method
		System.out.println("\n***Testing the isOld() method***");
		System.out.println("\nHow old is Ender's Game? --It should output \"This book is a little older.\"");
		System.out.println(endersGame.isOld());
		System.out.println("\nHow old is The Peripheral? --It should output \"This book is fairly new!\"");
		System.out.println(thePeripheral.isOld());
		System.out.println("\nHow old is 1984? --It should output \"This book is old!\"");
		System.out.println(ninteenEightyFour.isOld());
		
		// Testing the authorEquals() method
		System.out.println("\n***Testing the authorEquals() method***");
		System.out.println("\nDo 1984 and Animal Farm share the same author? --It should output true.");
		System.out.println(ninteenEightyFour.authorEquals(animalFarm.getAuthor()));
		System.out.println("\nDo 1984 and The Peripheral share the same author? --It should output false");
		System.out.println(ninteenEightyFour.authorEquals(thePeripheral.getAuthor()));

	}

}
