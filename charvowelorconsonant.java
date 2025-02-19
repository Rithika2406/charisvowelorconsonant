import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    char ch=S.next().charAt(0);
	    ch=Character.toLowerCase(ch);
	    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    {
	        System.out.println(ch+" "+"is a vowel");
	    }
	    else{
		System.out.println(ch +" "+ "is a consonant");
	    }
	}
}