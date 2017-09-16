import java.util.Scanner;
import java.io.FileNotFoundException;
public class Driver{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an option:");
		System.out.println("1. Run a program");
		System.out.println("2. Run Tests");
		String option = in.nextLine();
		if (option.equals("1")){
			System.out.println("Enter file name:");
			String filename = in.nextLine();
			Pikachu pikachu = new Pikachu(filename);
			System.out.println("Enter input (Simply press enter for no input):");
			String input = in.nextLine();
			Scanner inParse = new Scanner(input);
			while (inParse.hasNext()){
				pikachu.pushPi(Integer.parseInt(inParse.next()));
			}
			pikachu.run();
		} else if (option.equals("2")){
			System.out.println("Running Test 1");
			System.out.println("Test 1: " + Test.test1());
			System.out.println("Running Test 2");
			System.out.println("Test 2: " + Test.test2());
			System.out.println("Running Test 3");
			System.out.println("Test 3: " + Test.test3());
			System.out.println("Running Test 4");
			System.out.println("Test 4: " + Test.test4());
			System.out.println("Running Test 5");
			System.out.println("Test 5: " + Test.test5());
		}
	}
}