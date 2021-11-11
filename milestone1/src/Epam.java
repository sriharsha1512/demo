import java.util.Scanner;

public class Epam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int charcount=0;
		int sum=0;
		
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				
				sum=sum+Integer.parseInt(input.charAt(i)+"");
				
			}
			else if(Character.isAlphabetic(input.charAt(i)))
			{
				charcount++;
			}
			else
			{
				
			}
		
			
		}
		int result=java.lang.Math.round(sum/charcount);
		System.out.println(result);

	}

}
