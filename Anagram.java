public class Anagram{
	public static void main(String[] args) 
	{
		
		String a="aab";
		String b="abc";

		boolean isAnagram=false;
		boolean visited[]=new boolean[b.length()];	

				//aaa
				//abc 
				//visited{       }		initially false for each letter
				//after line 25 it checks the status and if its false then only it will consider.

		if(a.length()==b.length())
		{

			for(int i=0;i<a.length();i++)
			{
				char c=a.charAt(i);
				isAnagram=false;
				for(int j=0;j<b.length();j++)
				{
					if(b.charAt(j)==c && !visited[j])
					{
						visited[j]=true;
						isAnagram=true;
						break;
					}

				}
				if(! isAnagram)
				{
					break;
				}
			}

		}

		if(isAnagram){
			System.out.println("Anargram");
		}
		else{
			System.out.println("Not Anargram");
		}


	}
}