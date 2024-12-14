package _03_More_Algorithms;

import java.util.ArrayList;
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
    	for(int i = 0; i<eggs.size(); i++) {
    		if(eggs.get(i) .equals("cracked")) {
    			return i;
    		}
    	}
        return 0;
    }
    public static int countPearls(List<Boolean> oysters) {
    	int count = 0;
    	for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i)) {
    			count +=1;
    		}
    	}
    	return count;
    }
    public static double findTallest(List<Double> peeps) {
    	double talest = 0; 
    	for(int i = 0; i < peeps.size(); i++) {
    		if(peeps.get(i) > talest) {
    			talest = peeps.get(i);
    		}
    	}
    	return talest;
    }
    public static String findLongestWord(List<String> words) {
    	String longest = " ";
    	for(String i: words) {
    		if(i.length() > longest.length()) {
    			longest = i;
    		}
    	}
    	return longest; 
    }
    public static boolean containsSOS(List<String>message) {
    	for(int i = 0; i < message.size(); i++) {
    		if(message.get(i) .contains("... --- ...")) {
    			return true;
    		}
    	}
    	return false;
    }
    public static double sortScores(List<Double> results) {
    	ArrayList<Double> scores = new ArrayList();
    	for(int i = 0; i < results.size(); i++) {
    		if(results.get(i) > results.get(i+1)) {
    			double s = results.get(i+1);
    			double j = results.get(i);
    			results.set(i+1, s);
    			results.set(i, j);
    			
    			
    		}
    	}
    }
}
