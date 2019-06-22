package kata.kyu7.UltimateArrayReverser;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayReverser {
	
	public static String[] reverse(String[] a) {
		
		//String str = String.join(".", a);
		
		//StringBuilder sb = new StringBuilder(str);
		
		//String file = sb.reverse().toString();
		   
		/*StringBuilder builder = new StringBuilder();
		
			for(String s : a) {
				builder.append(s);
			}
			
			builder = builder.reverse();
			
		String str = builder.toString();
		
		String arr[] = str.split(",");
		
		//String[] arr = file.split(".");
		
		//System.out.println(str);
		
		//System.out.println(file);
		
		System.out.println(Arrays.toString(arr));
		   
	return a;*/
		
		String str = String.join("",a);
		
		String sb = new StringBuffer(str).reverse().toString();
	 
			int[] ind = {0};
			
		Stream<Object> arr = Arrays.stream(a).map(A -> sb.substring(ind[0],ind[0] += A.length()));
		
		return arr.toArray(String[]::new);
			
		//return Arrays.stream(a).map(V -> R.substring(S[0],S[0] += V.length())).toArray(String[]::new);
	 
	}
	
	public static void main(String args[]) {
		
		reverse(new String[]{"I", "like", "big", "butts", "and", "I", "cannot", "lie!"});
	}
}
