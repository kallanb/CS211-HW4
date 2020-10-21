package hw06;
/*
Kallan Brainard 
CS 211
August 2, 2020
 */
public class ListClient {
    public static void main(String[] args) {
    	//Exercise 8 switchPairs demo
    	//switches the order of values in a pairwise fashion
    	int [] array1 = {10, 25, 31, 47, 52, 68, 77};
    	LinkedIntList list1 = new LinkedIntList();
    	for (int n : array1) {
    		list1.add(n);
    	}
    	
    	//invoke method and display output
    	System.out.println("Switch Pairs Demo");
    	System.out.println("Original List: " + list1);
    	list1.switchPairs();
    	System.out.println("SwitchPairs:   " + list1);
    	
    	//Exercise 12 split method demo
    	//rearranges the elements of a list so that all of the 
    	//negative values appear before all of the non negatives
    	int [] array2 = {8, 7, -4, 19, 0, 43, -8, -7, 2};
    	LinkedIntList list2 = new LinkedIntList();
    	for (int i : array2) {
    		list2.add(i);
    	}
    	
    	//invoke method and display output
    	System.out.println("\nSplit List Demo");
    	System.out.println("Original List: " + list2);
    	list2.split();
    	System.out.println("Split List:    " + list2);
    }
}
