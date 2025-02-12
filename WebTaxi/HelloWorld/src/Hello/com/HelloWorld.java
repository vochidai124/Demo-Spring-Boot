package Hello.com;

import java.util.Scanner;

public class HelloWorld {
	
    public static void main(String[] args) {
    	
    	System.out.println(exponential(2,32));
    	System.out.println(test(1234543211));
    	System.out.println(factorial(10));
    	System.out.println(prime(6));
    	System.out.println(findMax(5,10,4));
    	System.out.println(reverse(1234567891));
    	
    	
    	
    	
    }
    
    public static boolean test(long i) {
    	long j = i;
    	long result = 0;
    	while(i!=0) {
    		long digit = i%10;
    		result = result * 10 +digit;
    		i /= 10;
    	}
    	if (result == j) {
    		return true;
    	}
    	return false;
    }
    
    //Viết chương trình Java để đảo ngược một chuỗi nhập từ bàn phím.
    public static long reverse(long n) {
    	long result = 0;
    	while(n != 0) {
    		long digit = n % 10;
    		result = result * 10 + digit;
    		n /= 10;
    	}
    	
    	return result;
    }
    
    //Viết chương trình Java để kiểm tra xem một số nguyên có phải là số nguyên tố hay không và in kết quả ra màn hình.
    public static boolean prime(int n) {
    	if(n <= 1) {
    		return false;
    	}
    	for(int i = 2; i <= n/2; i++) {
    		if(n % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    //Viết chương trình Java để tính giai thừa của một số nguyên dương và in kết quả ra màn hình.
    public static int factorial(int n) {
    	if(n == 0 || n == 1) {
    		return 1;
    	}else {
    		return n * factorial(n-1);
    	}
    }
    
    //Viết chương trình Java để tính giai thừa của một số nguyên dương và in kết quả ra màn hình.
    public static long exponential(int n, int expo) {
    	if(expo == 0) {
    		return 1;
    	}else {
    		return n * exponential(n, expo-1);
    	}
    }
    
    //Viết chương trình Java để tìm số lớn nhất trong ba số nguyên và in kết quả ra màn hình.
    public static Integer findMax(int a, int b, int c) {
    	int max = a;
    	if(max < b) {
    		max = b;
    	}
    	if(max < c) {
    		max = c;
    	}
    	return max;
    }
    
    public static Integer SumTwoNum(int a, int b) {
    	return a+b;
    }
   
}