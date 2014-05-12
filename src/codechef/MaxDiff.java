package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxDiff {
	private static int[] numbers;
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		for (int i = 0; i < n; i++) {
			String[] inps = in.readLine().split(" ");
			int nums = Integer.parseInt(inps[0]);
			int div = Integer.parseInt(inps[1]);
			String[] StringnumArray = in.readLine().split(" ");
			numbers = new int[nums];
			int cnt = 0;
			for (String sk : StringnumArray) {
				numbers[cnt++] = Integer.parseInt(sk);
			}
			new MaxDiff().sort(numbers);
			
			int smallSum = 0;
			int largeSum = 0;
			for (int jk = 0; jk < numbers.length; jk++) {
				if (jk < div) {
					smallSum += numbers[jk];
				} else {
					largeSum += numbers[jk];
				}
			}
			// System.out.println(smallSum);
			// System.out.println(largeSum);
			System.out.println(largeSum - smallSum);
		}
	}

	public void sort(int[] values) {

		int number;
		if (values == null || values.length == 0) {
			return;
		}
		number = values.length;
		quicksort(0 , number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high - low) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i,j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
