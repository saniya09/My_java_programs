import java.util.*;
class ReverseString{
	 public static void main(String[] args) {

	 	ReverseString r=new ReverseString();
	 	Scanner s=new Scanner(System.in);
	 	System.out.println("Enter String");
	 	String str1=s.next();
	 	String rev=r.reverse1(str1);
	 	System.out.println("Reverse String is "+rev);

	}
	public String reverse1(String str1){
		String str2="";
		for(int i=0;i<str1.length();i++){
			str2=str1.charAt(i)+str2;
		}
		return str2;
	}

}