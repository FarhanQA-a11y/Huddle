
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
        String abc[] = {"apple", "banana", "cherry", "apple", "banana", "date"};
        System.out.println("reverse of array");
        for(int iss=abc.length-1; iss>=0; iss--) {
        	System.out.print(abc[iss]);
        }

        System.out.println();
        System.out.println("Duplicate value");
        for(int i=0; i<abc.length; i++) {
        	for (int j = i + 1; j < abc.length; j++) {
        		if(abc[i]==abc[j]) {
        			System.out.println(abc[i]);
        		}
        	}
        }
        
        System.out.println("palindrom number");
        int a = 131; 
        int original = a;
        int reversed = 0;
        while (a > 0) {
        	
            int digits = a % 10;  // Get last digit
            reversed = reversed * 10 + digits; // Build reversed number
            a = a / 10; // Remove last digit
        }
        
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        
        
        
        String s = "1215";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
        	reverse += s.charAt(i);
        	
        }
        System.out.println("Reversed String: " + reverse);
        if (s.equals(reverse)) {
            System.out.println(s + " is as palindrome.");
        } else {
            System.out.println(s + " is not aa palindrome.");
        }
        
         String text = "my name"; 
         String[] words = text.split("\\s+");
         int wordCount = words.length;
         int lastIndex = 0;
         System.out.println(text.length());
         
         for (int i = 0; i < text.length(); i++) {
        	  lastIndex = i; 
        	  lastIndex =lastIndex+1;
         }
         System.out.println("Last index: " +lastIndex);
         
         for(int star=0;star<5; star++) {
        	 for(int sky=0;sky<=star;sky++) {
        		 System.out.print("*");	 
        	 }
        	 System.out.println();
         }
         
         int first=0;
         int second =1;
         System.out.print(first);
     	 System.out.print(" "+second);
         for(int fib=0;fib<11;fib++) {
        	int result = first +second;
        	System.out.print(" "+result);
        	first = second;        	
        	second = result;
        	
         }
         
         //Prime Number
         System.out.println("Prime Number");
         
         for(int prime=1; prime<=100;prime++) {
        	 int count =0;
        	 for (int i = 1; i <= prime; i++) { 
                 if (prime % i == 0) {
                     count++;
                 }
             }
        	 if (count == 2) {
                 System.out.print(prime + " ");
             }
        	
         }
         
         String address= "Total address";
         System.out.println("address: "+address.length());
         
         String texting = "farhan is in good java. farhan likes java java. farhan is learning java.";

         // Splitting based on "farhan"
         int count = texting.split("java", -1).length - 1;

         System.out.println("Occurrences of 'farhan': " + count);
         
         String[] wordss = texting.split("\\s+");
         int wordCounts = wordss.length;

         System.out.println("Total number of words: " + wordCounts);
	}

}
