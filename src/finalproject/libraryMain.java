package finalproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class libraryMain{
	public static int length; //  holds lengths		
	Scanner scan = new Scanner(System.in);
	// Database in the following lines `
	public static String bookNames[];
	public static String author[];
	public static String dateofP [];
	public static Integer copies[];
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Database in the following lines 
		String  [] bookNames= new String [15];
		//List of book names
		bookNames[0]="The Subtle Art of Not Giving a F*ck";
		bookNames[1]="Talking to Strangers";
	  	bookNames[2]="21 Lessons for the 21st Century";
		bookNames[3]="Big Magic";
		bookNames[4]="Maybe You Should Talk to Someone";
		bookNames[5]="What We Carry";
		bookNames[6]="Evonne Goolagong";
		bookNames[7]="Pirate Queen";
		bookNames[8]="Rebel Cinderella";
		bookNames[9]="Born a Crime: Stories From a South African Childhood";
		bookNames[10]="Fundamenetals of electric circuits";
		bookNames[11]="Introduction to electric circuits";
		bookNames[12]="Electric Machinery Fundamenetals";
		bookNames[13]="Signals and systems";
		bookNames[14]="Linear algebra and its applications";
		//List of authors
		String author []= new String [15];
		author[0]="Mark Manson";
		author[1]="Mark Manson";
		author[2]="Mark Manson";
		author[3]="Mark Manson";
		author[4]="Mark Manson";
		author[5]="Mark Manson";
		author[6]="Mark Manson";
		author[7]="Mark Manson";
		author[8]="Mark Manson";
		author[9]="Mark Manson";
		author[10]="Mark Manson";
		author[11]="Mark Manson";
		author[12]="Mark Manson";
		author[13]="Mark Manson";
		author[14]="Mark Manson";
		//List of date of publishing
		String dateofP []= new String [15];
		dateofP[0]="13/09/2016";
		dateofP[1]="10/09/2019";
		dateofP[2]="23/08/2018";
		dateofP[3]="21/08/2015";
		dateofP[4]="02/04/2019";
		dateofP[5]="28/04/2020";
		dateofP[6]="03/03/2020";
		dateofP[7]="03/03/2020";
		dateofP[8]="03/03/2020";
		dateofP[9]="15/11/2016";
		dateofP[10]="28/08/1999";
		dateofP[11]="00/00/1989";
		dateofP[12]="00/00/1984";
		dateofP[13]="00/00/1998";
		dateofP[14]="00/00/1968";
		int copies []= new int[15];	
		//list of copies
		copies[0]=2;
		copies[1]=3;
		copies[2]=1;
		copies[3]=0;
		copies[4]=4;
		copies[5]=10;
		copies[6]=12;
		copies[7]=2;
		copies[8]=3;
		copies[9]=5;
		copies[10]=6;
		copies[11]=8;
		copies[12]=7;
		copies[13]=6;
		copies[14]=0;
		//List of members
		String member []= new String [8];
		member[0]="Ahmed";
	    member[1]="Omar";
	    member[2]="Taha";
	    member[3]="Marry";
	    member[4]="Rawda";
	    member[5]="Mohamed";
	    member[6]="Hager";
	    member[7]="Haidy";
		String borrowedbooks []= new String [20];
		borrowedbooks[0]="What We Carry";
		borrowedbooks[1]="Talking to Strangers";
		borrowedbooks[2]="";
		borrowedbooks[3]="Maybe You Should Talk to Someone";
		borrowedbooks[4]="";
		borrowedbooks[5]="";
		borrowedbooks[6]="";
		borrowedbooks[7]="Rebel Cinderella"; 
		String returns []= new String [20];
		returns[0]="Big Magic";
		returns[1]="Signals and systems";
		returns[2]="Fundamenetals of electric circuits";
		returns[3]="";
		returns[4]="What We Carry";
		returns[5]="";
		returns[6]="";
		returns[7]="";
	//End of database
	
	//what appears to the user
	
	welcome();
	int choice = scan.nextInt();
	// the pick function
	if(choice == 1) {
		System.out.println("Please insert the number of uniqe books you are willing to insert");
		int	choice2 =scan.nextInt();
		int size=bookNames.length+choice2;
		String booknames []= new String [size];
		String authorsname [] = new String [size];
		String dateof[] =new String [size];
		Integer copiess [] = new Integer [size];
		for(int r =0; r<bookNames.length;r++) {
			booknames [r] = bookNames[r];
			authorsname [r] =author[r];
			dateof [r] = dateofP[r];
			copiess [r] = copies[r];
			
		}
		for(int j=0; j<choice2;j++) {//choice2 is the number of books to be inserted
			System.out.println("Please insert the name of your"+(j+1)+ "book");
			int newbook=bookNames.length;
			scan.nextLine();
			String name =scan.nextLine();
			
			int t=0;
			for(int k=0;k<bookNames.length;k++) {	
				if(name.equals(booknames[k])) {
					System.out.println("Book found on the shelves of the library, please insert the number of copies");
					int nucopies = scan.nextInt();
					int num = copiess[k];
					num = nucopies+num;
					System.out.println("Number of copies now is "+num+"copy");
					t=1;// represents wheather the book was found or not
					
				}
			} if(t!=1) {
				System.out.println("Book not found, but you can add it");
				booknames[newbook+j]=name;
				System.out.println("Please insert the name of the author");
				authorsname[newbook+j]=scan.nextLine();
				System.out.println("Please insert the date of publish");
				dateof[newbook+j]=scan.nextLine();
				System.out.println("Please insert the number of copies");
				copiess[newbook+j]=scan.nextInt();
				System.out.println("your book and all its data were succesfully inserted");
			}
					
				}
			}
			
		else if (choice ==2) {
			System.out.println("Please insert user's name");
			scan.nextLine();
			String user=scan.nextLine();
			String check=membercheck(user, member);
			if(check=="T") {
			System.out.println("Please insert for how many days are you willing to borrow the book/s");
			int choice3=scan.nextInt();// choice3 is how many days the user want to borroe a book
			if(choice3<14) {

			System.out.println("Please insert the number of books you want to borrow");
			int	choice4 =scan.nextInt();
			scan.nextLine();
			
			for(int u =0;u<choice4;u++){
				System.out.println("please insert the name the book you want to borrow");
				String bookn =scan.nextLine();
			    System.out.println("Please insert the author of the book you want to borrow incase you dont know the name");
				String authorn=scan.nextLine();
			for(int s=0;s<bookNames.length;s++) {
				if ((bookn.equals(bookNames[s]))||(authorn.equals(author[s]))) {
					int k=copies[s];
					if(k>=1) {
					k--;
					copies[s]=k; 
					System.out.println("the remaining no copies of the book"+"is"+k);
					}else
						System.out.println("Sorry, there are no copies of the book that you want");
				}
			}
			
		}System.exit(0);
		
				}else System.out.println("Sorry, we only allow borrowing for less than 14 days");
			}else System.out.println("Sorry, borrowing is for members only");
			
		
			}else if(choice==3) {
				System.out.println("Please insert the name of the book you want to check on return");
				scan.nextLine();
				String book=scan.nextLine();
				String returnbook = bookcheck(book, returns);
				if(returnbook=="T") {
					System.out.println("Book on return");
				}else 
					System.out.println("Book not returned");
				
			}else if (choice==4) {
				System.out.println("Please insert member's name");
				scan.nextLine();
				String membername=scan.nextLine();
				int memberid=membersearch(membername, member);
				if(memberid>=0) {
					System.out.println("Member's name is "+ member[memberid]);
					System.out.println("book/s borrowed by member is/are "+ borrowedbooks[memberid]);
				
				}else 
					System.out.println("Member not found");
			}else if(choice==5) {
				System.out.println("Please insert the title of the book that you want to delete");
				
				scan.nextLine();
				String name =scan.nextLine();
				int t=0;
				for(int k=0;k<bookNames.length;k++) {	
					if(name.equals(bookNames[k])) {
						bookNames[k]="";
						author[k]="";
						copies[k]=-1;
						dateofP[k]="";
						System.out.println("Book with title "+name+" was succesfully deleted");
						System.out.println("Number of copies in shelf number "+(k+1) + "is equal to "+ copies[k]);
						t=1;
					}
			
				}if(t!=1) {
					System.out.println("Book doesn't exist already");
				}
				}
				else if (choice==6) {
				System.out.println("Please insert the name of the user that you want to delete");
				scan.nextLine();
				String nameofuser =scan.nextLine();
				int b=0;
				for(int a=0; a<member.length;a++) {
					if(nameofuser.equals(member[a])){
						member[a]="";
						System.out.println("User with ID "+a+" was succesfully deleted");
						b=1;
				}
				}
					if (b!=1) {
						System.out.println("User doesn't exist already");
					}
				
				}else 
			System.out.println("Please insert a valid integer");
				
}
		
	
		



public static void welcome () {
	System.out.println("Welcome Mr.Admin");
	System.out.println("Which one of the following operations are you willing to do press: ");
	System.out.println("1 for book insertion");
	System.out.println("2 for book borrowing");
	System.out.println("3 for check on books returned");
	System.out.println("4 for searching on member");
	System.out.println("5 for deleting a copy");
	System.out.println("6 for deleting a user");
	
}

public static String membercheck(String user, String[] member) {
	for(int i=0; i<member.length;i++ ) {
		if(user.equals(member[i])) {
			String result = "T";
			return result;
		}
				
	}
	return "F";
	
}
public static String bookcheck(String book, String[] returns) {
	for(int l=0;l<returns.length;l++) {
		if(book.equals(returns[l])){
		
			return "T";
		}
	}
	
	return "F";
	
	
}
public static int membersearch(String user, String[] member) {
	for(int i=0; i<member.length;i++ ) {
		if(user.equals(member[i])){
			return i ;
		}
				
	}
	return -1 ;
	
}
	
}