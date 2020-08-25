import java.util.*;
public class ReplaceWords2{

	public static void main(String[] args) {
		
		ReplaceWords r=new ReplaceWords();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		char phar=sc.next().charAt(0);
		Boolean ans=r.isVowel(phar);
		System.out.println(ans);
		//System.out.println("Enter phrase");
		//String str=sc.nextLine();
	//	String ans=r.replace(str,phar);
		//System.out.println(ans);
	
	}
	public Boolean isVowel(char ch)
	{
		if((ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') || (ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' )) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}