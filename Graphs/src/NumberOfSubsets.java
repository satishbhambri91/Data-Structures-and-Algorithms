
public class NumberOfSubsets {
	
	public static int countSets(int[] arr, int total){
		return rec(arr, total, arr.length - 1);
	}
	
	public static int rec(int[] arr, int total, int i){
		
		if(total == 0){
			return 1;
		}
		
		else if(total < 0){
			return 0;
		}
		
		else if( i < 0){
			return 0;
		}
		
		else if(total < arr[i]){
			return rec(arr, total, i -1);
		}
		
		return rec(arr, total - arr[i], i - 1) + rec(arr, total, i - 1);
	}
	
	
	public static void main(String[] args){
		int[] arr = {2, 4, 6, 10};
		
		int sets = countSets(arr, 16);
		
		System.out.println("The number of sets calculated by recursive solution is " +sets);
		
	}
}
