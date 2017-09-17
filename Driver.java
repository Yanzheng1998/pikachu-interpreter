import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

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
			ArrayList<Integer> inputs = new ArrayList<Integer>();
			while (inParse.hasNext()){
				inputs.add(Integer.parseInt(inParse.next()));
			}
			pikachu.pushInputs(inputs);
			System.out.println(pikachu.run());
		} else if (option.equals("2")){
			ArrayList<Boolean> testResults = new ArrayList<Boolean>();
			System.out.println("Running Test 1");
			testResults.add(Test.test1());
			System.out.println("Running Test 2");
			testResults.add(Test.test2());
			System.out.println("Running Test 3");
			testResults.add(Test.test3());
			System.out.println("Running Test 4");
			testResults.add(Test.test4());
			System.out.println("Running Test 5");
			testResults.add(Test.test5());
			System.out.println("Running Test 6");
			testResults.add(Test.test6());
			System.out.println("Running Test 7");
			testResults.add(Test.test7());
			System.out.println("Running Test 8");
			testResults.add(Test.test8());
			System.out.println("Running Test 9");
			testResults.add(Test.test9());
			System.out.println("Running Test 10");
			testResults.add(Test.test10());
			System.out.println("Running Test 11");
			testResults.add(Test.test11());
			
			for (int i = 0; i < testResults.size(); i++){
				System.out.println("Test " + (i + 1) + " result was " + testResults.get(i));
			}
		}
	}
}
