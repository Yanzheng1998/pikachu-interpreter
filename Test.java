import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Test{
	public static boolean test1() throws FileNotFoundException{ //push 3, 5, then 7 to both stacks
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

	public static boolean test2() throws FileNotFoundException{ //push 3 to pi pikachu, pi pika, then push 1 to pika pikachu, pika pi
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

	public static boolean test3() throws FileNotFoundException{ //test pika pika
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

	public static boolean test4() throws FileNotFoundException{ //test pika pika and pikachu pikachu
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
}