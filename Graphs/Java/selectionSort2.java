import java.util.*;
public class selectionSort2{
	
	int min_index;
	public void sort(int[] arr){
		for(int i =0; i< arr.length - 1; i++){

			min_index = i;
			for (int j = i; j < arr.length - 1 ; j++ ) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
				
			}

			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}

	}
	public void Display(int[] arrray){
		for(int i : arrray){
			System.out.println(arrray[i]);
		}
	}

	public static void main(String[] args){
		int[] array = [64, 25, 12, 22, 11];
		selectionSort2 obj = new selectionSort2();
		obj.sort(arrray);
		obj.Display();
	}
}