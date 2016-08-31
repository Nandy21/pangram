import java.util.Scanner;


public class pangram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=' ';
		String str=s.toUpperCase();
		int count,ana=0;
		
		for(int i=0;i<26;i++)
		{
			
			count=0;
			c='A';
			for(int j=0;j<str.length();j++)
			{
				if(c==str.charAt(j))
				{
				count++;
				ana++;
				
				}
			
			}
			if(count!=1)
			{
				System.out.println("String is not a pangram");
				break;
			}
			c++;
		}
		if(ana==26)
		{
			System.out.println("String is a Pangram");
		
		}

	}

}
