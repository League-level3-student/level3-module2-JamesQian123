package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
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
    public static ArrayList<Double> sortScores(List<Double> results) {
    	Double smallest;
    	ArrayList<Double> scores = new ArrayList();
    	for(int k =0; k < results.size();k++) {
    		smallest = 100.0;
	    	for(int i = 0; i < results.size(); i++) {
	    		if(!(scores.contains(results.get(i)))&& results.get(i) < smallest) {
	    			smallest = results.get(i);
	    		}
	    		
	    	}
	    	scores.add(smallest);
    	}
    	return scores;
    }
    public static List<String> sortDNA(List<String> unsortedSequences){
    	/*ArrayList<String> sortedSequences = new ArrayList();
    	String longest = " ";
    	for(String i:unsortedSequences) {
    		if(!(sortedSequences.get((unsortedSequences(i)).length()) > longest.length())) {
    			longest = i;
    			
    		}sortedSequences.add(i);
    	}
    	return sortedSequences;
    }
    */
    	unsortedSequences.sort((s1,s2) -> {
    		if(s1.length()>s2.length()) {
    			return 1;
    		}else if (s2.length() > s1.length()){
    			return -1;
    		}else {
    			return 0;
    		}
    	});
    	
    	for(String s : unsortedSequences) {
    		return unsortedSequences;
    	}
    	return null;
}
	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		Collections.sort((words));
		return words;
	}
    
}
