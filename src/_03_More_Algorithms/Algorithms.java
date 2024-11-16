package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int sum = num1*num2;
 
    	String var = num1 + " x " + num2 + " = " +  sum;
        return var;
    }
    public static boolean isPrime(int num) {
    	for(int i = 2; i < num; i++) {
    		if(num%i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static boolean isSquare(int num) {
    	for(int i = 1; i <= num; i++) {
    		if(Math.sqrt(num) == i) {
    			return true;
    		}
    	}
    	return false;
    }
    public static boolean isCube(int num) {
    	for(int i = 1; i<=num; i++) {
    		if(i*i*i == num) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
