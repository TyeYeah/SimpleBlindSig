import java.lang.reflect.Array;


public class Transform {

	public static void main(String[] args) {
		
			System.out.println("the original string is : hahawaka");
			System.out.println("to num [] is :"+atonum("hahawaka"));
			System.out.println("then to string is:"+ numtoa(atonum("hahawaka")));

			System.out.println("then to numstring is:"+ numtonumstr(atonum("hahawaka")));
//			// print array's elements			
//			int[] a=atonum("hahawaka");
//			for(int aa:a)
//			    System.out.println(aa);
			
	}
	public static String numtoa(int[] num){
		char c[]=new char[num.length];
		int i;
		String a="";
		for(i=0;i<num.length;i++)
		{
			c[i]=(char)num[i];
			//System.out.println(c[i]);
		}
		a=new String(c);
		//System.out.println(a);
		return a;
	}
	public static String numtonumstr(int[] num){
		String a="";
		int i;
		for(i=0;i<num.length;i++)
		{
			a+=num[i];
		}
		return a;
	}
	public static int[] atonum(String a){
		int[] num =new int[a.length()];
		int i;
		for(i=0;i<a.length();i++)
		{
			char c=a.substring(i, i+1).toCharArray()[0];
			num[i]=(int)c;
		}
		return num  ;
	}
	

}
