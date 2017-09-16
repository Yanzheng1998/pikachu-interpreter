import java.util.Stack;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Pikachu{
	Stack<Integer> pi;
	Stack<Integer> pika;
	File input;
	Scanner fileScan;
	int lineNum;
	String last;
	String lastLast;

	public Pikachu(String filename) throws FileNotFoundException{
		pi = new Stack<Integer>();
		pika = new Stack<Integer>();
		input = new File(filename);
		lineNum = 0;
		last = "";
		lastLast = "";
	} //Pikachu()

	public void run() throws FileNotFoundException{
		int go = 1; //start program at line 1
		while (go > 0){
			fileScan = new Scanner(input);
			lineNum = 0;
			for (int i = 1; i < go; i++){ //go to line "go"
				// System.out.println("daboog go is " + go);
				fileScan.nextLine();
				lineNum++;
			}
			go = 0; //if we get to end of while loop without setting "go" to a value greater than 0, exit while loop.
			while (fileScan.hasNext()){
				lineNum++;
				Scanner lineScan = new Scanner(fileScan.nextLine());
				ArrayList<String> thisLine = new ArrayList<String>();
				while (lineScan.hasNext()){
					String next = lineScan.next();
					// if (lastLast.equals(last) && next.equals(last)){
					// 	System.err.println("Error: Three of the same term in a row found on line " + lineNum);
					// } else{
					// 	lastLast = last;
					// 	last = next;
					// }
					// System.out.println("daboog Next is " + next);
					thisLine.add(next);
				}
				// System.out.println("daboog line num is " + lineNum);
				if (thisLine.size() < 2){
					System.err.println("Error: Line " + lineNum + " found with less than 2 terms.");
				} else if (thisLine.size() == 2){
					// System.out.println("daboog 0 is " + thisLine.get(0) + " 1 is " + thisLine.get(1));
					switch (thisLine.get(0)){
						case "pi":
							switch (thisLine.get(1)){
								case "pi": //"pi pi" is not valid
									System.err.println("Error: \"pi pi\" is not valid on line " + lineNum);
									System.exit(0);
								case "pika": //"pi pika" copies the top of pi pikachu to pika pikachu
									pika.push(pi.peek());
									break;
								case "pikachu": //"pi pikachu" pops the top element of pi pikachu
									pi.pop();
									break;								
								default:
									System.err.println("Error: Non-pikachu language found on line " + lineNum);
									System.exit(0);
							} //switch (thisLine.get(1))
							break;
						case "pika":
							switch (thisLine.get(1)){
								case "pi": //"pika pi" copies top of pika pikachu to pi pikachu
									pi.push(pika.peek());
									break;
								case "pika": //if the tops of the two stacks are inequal, go to line n where n is the number of terms in the next line
									if (!fileScan.hasNext()){
										System.err.println("Error: \"pika pika\" found on last line of input file");
										System.exit(0);
									} else{
										if (!pi.peek().equals(pika.peek())){
											Scanner counter = new Scanner(fileScan.nextLine());
											while (counter.hasNext()){
												counter.next();
												go++;
											} //while (counter.hasNext())
										} else{
											fileScan.nextLine();
											lineNum++;
										}
									} //else
									break;
								case "pikachu": //"pika pikachu" pops the top element of pika pikachu
									pika.pop();
									break;
								default:
									System.err.println("Error: Non-pikachu language found on line " + lineNum);
									System.exit(0);
							} //switch(thisLine.get(1))
							break;
						case "pikachu":
							switch (thisLine.get(1)){
								case "pi": 
									System.err.println("Error: \"pikachu pi\" is not valid on line " + lineNum);
									System.exit(0);
								case "pika": 
									System.err.println("Error: \"pikachu pika\" is not valid on line " + lineNum);
									System.exit(0);
								case "pikachu": 
									if (!fileScan.hasNext()){
										System.err.println("Error: \"pikachu pikachu\" found on last line of input file");
										System.exit(0);
									} else{
										if (pi.peek().equals(pika.peek())){
											Scanner counter = new Scanner(fileScan.nextLine());
											while (counter.hasNext()){
												counter.next();
												go++;
											} //while (counter.hasNext())
										} else{
											fileScan.nextLine();
											lineNum++;
										}
									} //else
									break;
								default:
									System.err.println("Error: Non-pikachu language found on line " + lineNum);
									System.exit(0);
							} //switch(thisLine.get(1))
							break;
						default:
							System.err.println("Error: Non-pikachu language found on line " + lineNum);
							System.exit(0);
					} //switch (thisLine.get(0))
					if (go > 0){
						break;
					}
				} else if (thisLine.size() == 4){
					if (!thisLine.get(3).equals("pikachu") || thisLine.get(2).equals("pikachu")){ //4 terms that don't end in "pikachu" or where the third term is "pikachu" doesn't exist
						System.err.println("Error: Found line with no meaning on line " + lineNum);
						System.exit(0);
					} else{
						switch (thisLine.get(0)){
							case "pi":
								switch(thisLine.get(1)){
									case "pi":
										fourTermsPushTwo(thisLine.get(2));
										break;
									case "pika":
										if (thisLine.get(2).equals("pi")){
										if (pi.size() < 2){
											System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pi pikachu");
											System.exit(0);
										}
											int temp = pi.pop().intValue();
											int sum = temp + pi.peek().intValue();
											pi.push(new Integer(temp));
											pi.push(new Integer(sum));
										} else if (thisLine.get(2).equals("pika")){
											if (pika.size() < 2){
												System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pika pikachu");
												System.exit(0);
											}
											int temp = pika.pop().intValue();
											int sum = temp + pika.peek().intValue();
											pika.push(new Integer(temp));
											pika.push(new Integer(sum));
										}
										break;
									case "pikachu":
										if (thisLine.get(2).equals("pi")){
										if (pi.size() < 2){
											System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pi pikachu");
											System.exit(0);
										}
											int temp = pi.pop().intValue();
											int prod = temp * pi.peek().intValue();
											pi.push(new Integer(temp));
											pi.push(new Integer(prod));
										} else if (thisLine.get(2).equals("pika")){
											if (pika.size() < 2){
												System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pika pikachu");
												System.exit(0);
											}
											int temp = pika.pop().intValue();
											int prod = temp * pika.peek().intValue();
											pika.push(new Integer(temp));
											pika.push(new Integer(prod));
										}
										break;
								}
								break;
							case "pika":
								switch(thisLine.get(1)){
									case "pi":
										if (thisLine.get(2).equals("pi")){
										if (pi.size() < 2){
											System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pi pikachu");
											System.exit(0);
										}
											int temp = pi.pop().intValue();
											int diff = temp - pi.peek().intValue();
											pi.push(new Integer(temp));
											pi.push(new Integer(diff));
										} else if (thisLine.get(2).equals("pika")){
											if (pika.size() < 2){
												System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pika pikachu");
												System.exit(0);
											}
											int temp = pika.pop().intValue();
											int diff = temp - pika.peek().intValue();
											pika.push(new Integer(temp));
											pika.push(new Integer(diff));
										}
										break;
									case "pika":
										fourTermsPushTwo(thisLine.get(2));
										break;
									case "pikachu":
										if (thisLine.get(2).equals("pi")){
											System.out.print(pi.pop());
										} else{
											System.out.print(pika.pop());
										}
										break;
								}
								break;
							case "pikachu":
								switch(thisLine.get(1)){
									case "pi":
										if (thisLine.get(2).equals("pi")){
										if (pi.size() < 2){
											System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pi pikachu");
											System.exit(0);
										}
											int temp = pi.pop().intValue();
											int quot = temp / pi.peek().intValue();
											pi.push(new Integer(temp));
											pi.push(new Integer(quot));
										} else if (thisLine.get(2).equals("pika")){
											if (pika.size() < 2){
												System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pika pikachu");
												System.exit(0);
											}
											int temp = pika.pop().intValue();
											int quot = temp / pika.peek().intValue();
											pika.push(new Integer(temp));
											pika.push(new Integer(quot));
										}
										break;
									case "pika":
										fourTermsPushTwo(thisLine.get(2));
										break;
									case "pikachu":
										if (thisLine.get(2).equals("pi")){
											char print = (char)pi.pop().intValue();
											System.out.print(print);
										} else{
											char print = (char)pika.pop().intValue();
											System.out.print(print);
										}
										break;
								}
								break;
							default:
						}
					}
				} else{
					if (!thisLine.get(thisLine.size() - 2).equals("pikachu") && thisLine.get(thisLine.size() - 1).equals("pikachu")){
						if (thisLine.get(thisLine.size() - 2).equals("pi")){ //push to pi pikachu
							pi.push(new Integer(thisLine.size() - 2));
						} else if (thisLine.get(thisLine.size() - 2).equals("pika")){ //push to pika pikachu
							pika.push(new Integer(thisLine.size() - 2));
						} else{
							System.err.println("Error: Found line with no meaning on line " + lineNum);
							System.exit(0);
						}
					}
					else{
						System.err.println("Error: Unrecognized string on line " + lineNum);
						System.exit(0);
					}
				} //else
			} //while (pikachu.fileScan.hasNext())
		} //while (go > 0)
		System.out.println();
	} //run()

	public void fourTermsPushTwo(String third){
		if (third.equals("pi")){
			pi.push(new Integer(2));
		} else if (third.equals("pika")){
			pika.push(new Integer(2));
		} else{
			System.err.println("Error: Found line with no meaning on line " + lineNum);
			System.exit(0);
		}
	}

	public void addTopTwo(String third){
		if (third.equals("pi")){
			if (pi.size() < 2){
				System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pi pikachu");
				System.exit(0);
			}
			int temp = pi.pop().intValue();
			int sum = temp + pi.peek().intValue();
			pi.push(new Integer(temp));
			pi.push(new Integer(sum));
		}
		if (third.equals("pika")){
			if (pika.size() < 2){
				System.err.println("Error: Line " + lineNum + ", there are less than 2 elements in pika pikachu");
				System.exit(0);
			}
			int temp = pika.pop().intValue();
			int sum = temp + pika.peek().intValue();
			pika.push(new Integer(temp));
			pika.push(new Integer(sum));
		}
	}

	public void pushPi(int number){
		pi.push(new Integer(number));
	}

	public ArrayList<String> debugVomitPikachus(){
		ArrayList<String> contents = new ArrayList<String>();
		contents.add("Pi Pikachu contains:");
		while (!pi.empty()){
			contents.add(pi.pop().toString());
		}
		contents.add("Pika Pikachu contains:");
		while (!pika.empty()){
			contents.add(pika.pop().toString());
		}
		return contents;
	} //debugVomitPikachus()
} //Pikachu class