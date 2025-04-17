package ex10_lamda;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};

		int[] answer = {};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		String test = "hello";
		
		
		
		
		
		for (int i = 0 ; i < strlist.length; i++) {
			arr.add(strlist[i].length());
		}
		
		System.out.println(arr);
		
		
        // 방법 1
//        return answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        // 방법 2
        // return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
        
        // 방법 3
        // int[] answer = Arrays.stream(numbers, num1, num2+1).toArray();
        // return answer;
        
        // 방법 4
        // for(int i = num1, j = 0; i < num2+1; i++) {
        //      answer[j] = numbers[i];
        //      j++;
        // }
		
       
	}
}