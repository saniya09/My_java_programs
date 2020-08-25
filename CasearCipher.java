import java.util.*;
 public class CasearCipher{

	public static void main(String[] args) {

		int key=17; 
		int key1=26;
		CasearCipher c=new CasearCipher();
		String message="The war is to begin,Let's fight";
		String encrypted=c.encrypt(message,key);
		System.out.println(encrypted);
		String decrypted=c.encrypt(encrypted,26-key);
		System.out.println(decrypted);


		
	}
	public String encrypt(String input,int key)
	{
		char currentChar1,newChar1;
		StringBuilder sb=new StringBuilder(input);
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String shiftedalphabet=alphabet.substring(key)+alphabet.substring(0,key);
		for(int i=0;i<sb.length();i++)
		{
			char currentChar=sb.charAt(i);
			if(Character.isLowerCase(currentChar)){
				currentChar1=Character.toUpperCase(currentChar);
				int index=alphabet.indexOf(currentChar1);
				if(index !=-1){
					char newChar=shiftedalphabet.charAt(index);
					newChar1=Character.toLowerCase(newChar);
					sb.setCharAt(i,newChar1);
				}
			}
			else{
				currentChar1=currentChar;
				int index=alphabet.indexOf(currentChar1);
				if(index !=-1)
				{
					char newChar=shiftedalphabet.charAt(index);
					sb.setCharAt(i,newChar);

				}
			

			}
			
			
		}
		return sb.toString();
	}

	
}