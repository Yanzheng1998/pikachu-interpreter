import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Test{
	public static boolean test1() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test1.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 7 5 3 Pika Pikachu contains: 7 5 3 ")){
			return true;
		} else{
			return false;
		}
	}

	public static boolean test2() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test2.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 1 3 Pika Pikachu contains: 1 3 ")){
			return true;
		} else{
			return false;
		}
	}

	public static boolean test3() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test3.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 3 1 Pika Pikachu contains: 3 ")){
			return true;
		} else{
			return false;
		}
	}

	public static boolean test4() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test4.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 1 4 4 1 Pika Pikachu contains: 1 1 3 ")){
			return true;
		} else{
			return false;
		}
	}

	public static boolean test5() throws FileNotFoundException{ //test pika pika and pikachu pikachu
		Pikachu pikachu = new Pikachu("test5.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 1 Pika Pikachu contains: 1 ")){
			return true;
		} else{
			return false;
		}
	}
	
	public static boolean test6() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test6.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 2 Pika Pikachu contains: 2 ")){
			return true;
		} else{
			return false;
		}
	}
	
	public static boolean test7() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test7.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 3 2 1 Pika Pikachu contains: 4 3 1 ")){
			return true;
		} else{
			return false;
		}
	}
	
	public static boolean test8() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test8.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 1 1 2 Pika Pikachu contains: 3 5 2 ")){
			return true;
		} else{
			return false;
		}
	}
	
	public static boolean test9() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test9.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 3 3 1 Pika Pikachu contains: 12 4 3 ")){
			return true;
		} else{
			return false;
		}
	}
	
	public static boolean test10() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test10.pik");
		pikachu.run();
		String test = "";
		ArrayList<String> results = pikachu.debugVomitPikachus();
		for (String string : results){
			test += (string + " ");
			System.out.println(string);
		}
		if (test.equals("Pi Pikachu contains: 3 3 9 1 1 1 Pika Pikachu contains: 2 2 1 ")){
			return true;
		} else{
			return false;
		}
	}
	
	public static boolean test11() throws FileNotFoundException{
		Pikachu pikachu = new Pikachu("test11.pik");
		String results = pikachu.run();
		
		if (results.equals("HELLO WORLD4321")){
			return true;
		} else{
			return false;
		}
	}
}
