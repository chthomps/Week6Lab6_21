
public class Exercise3 {

	public static void main(String[] args) {
		
		int bar(int N) {
			int result = 1;
			for (int i=1; i<N; i*=2)
				result +=2;
			
			return result;
		}
		 
		//Here, there is only one loop. The i= i*2 function means that N will grow half as quickly compared to i. 
		//As i grows, the loop has "fewer" times left to cycle (we start approaching i<N more quickly). 
		//This seems like the signature of logarithmic growth, or O(logN) complexity.

	}

}
