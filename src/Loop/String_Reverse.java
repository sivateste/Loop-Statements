package Loop;

public class String_Reverse {

	public static void main(String[] args) {

		//Example-1 :
		String str ="Siva Reddy";
		char [] s =str.toCharArray();
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}
		
		//Example-2 :
		String name= "Jagan";
		 String rev =" ";
		 int n=name.length();
		 for(int i=n-1;i>=0;i--)
		 {
			 rev = rev+name.charAt(i);
		 }
		 System.out.println("print Reverse Value :"+rev);
		 
	}

}
