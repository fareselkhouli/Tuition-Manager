import java.util.Scanner;

/**
 * this is the interface class that handles the inputs and outputs of the program
 * @FaresElkhouli
 * @ZhiyuFeng
 */
imput java.io.*;
public class TuitionManager {
	/**
	 * To read the command from the file.
	 */
	Scanner stdin;
	StudentList cs213=new StudentList();
	/**
	 * find the command
	 */
	
	 public void run()
	   {
	      stdin = new Scanner(System.in);
	      boolean done = false;
	      while ( !done )
	      {
	         String command = stdin.next();
	         char ccommand=command.charAt(0)
	         switch (ccommand)  
	         {   
	            case 'I': add('I');
			      break; 
	            case 'O': add('O');
	              break;
	            case 'N': add('N');
	              break;
	            case 'R': remove();
	              break;
	            case 'P': print();
	              break;
	            case 'Q': 
	            System.out.println("Program terminated");
	            done = true;
	            break;
	            default: //deal with bad command here 
	            System.out.println("Command"+"'"+command+"'"+"not supported!");		
	         }  
	      }
	public void addcommand(char studenttype) {
	/**
	 * If the command is Instate student
	 * check the fund.
	 */
	String fname = stdin.next();
	String lname = stdin.next();
	int credit = stdin.next();
	if (credit <= 0) {
		System.out.println(credit + " is not a vaild credit!");
		return;
	}
	if (studenttype == 'I') {
		int fund = stdin.next();
		cs213.add(new Instate(fname,lname,credit,fund));
		return;
	}
	/**
	 * if the command is outstate student
	 * check the tristate
	 */
	if (studenttype == 'O') {
		boolean tristate = stdin.next();
		cs213.add(new Outstate(fname,lname,credit,tristate));
		return;
	}
	/**
	 * if the command is a international student
	 * check the exchange
	 * check the credit is smaller than 9
	 */
	if (studenttype == 'N') {
		if (credit < 9) {
			System.out.println(credit+" is not a vaild credit!");
			return;
		}
		boolean exchange = stdin.next();
		cs213.add(new International(fname,lname,credit,tristate));
		return;
	}
	}
	
	public void remove() {
	/**
	 * if the command is remove the student.
	 */
	String fname = stdin.next();
	String lname = stdin.next();
	boolean successfullyRemoved = cs213.remove(new Student(fname,lname));
	if (!succeddfullyRemoved) {
		System.out.println(outMember.toString() + " is not a student!");
		}
		else {
		System.out.println(outMember.toString() + " has been removed!");
		}
		return;
	}
	
	public void print() {
		/**
		 * the command is to print the whold chart out.
		 */
		if (cs213)
			
		}
	}
	   }