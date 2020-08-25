import java.util.*;
public class ReplaceWords{

	public static void main(String[] args) {
		
		ReplaceWords r=new ReplaceWords();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phrase");
		String str=sc.nextLine();
		System.out.println("Enter Character");
		char phar=sc.next().charAt(0);
		String ans=r.replace(str,phar);
		System.out.println(ans);
	
	}
	public String replace(String str,char phar)
	{

		StringBuilder sb=new StringBuilder(str);
		//char q='*';
		for(int i=0;i<sb.length();i++)
		{

			char ch=str.charAt(i);
			if(((ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') || (ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' )) && (ch==phar))
			{
				if(i % 2 == 0){
					sb.setCharAt(i,'*');		//Even

				}
				else if(i % 2 !=0){
					sb.setCharAt(i,'+');		//Odd
				}
				

			}
		}
		return sb.toString();

	}

}