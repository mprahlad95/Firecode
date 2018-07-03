package level2;

public class MergeTwoSortedArrays {
	public static int[] merge(int[] arrLeft, int[] arrRight) {
		int lenA = arrLeft.length, lenB = arrRight.length;
		int[] arr = new int[lenA + lenB];
		int i, j, k;
		for (i = 0, j = 0, k = 0; i < lenA && j < lenB; k++) {
			if (arrLeft[i] < arrRight[j])
				arr[k] = arrLeft[i++];
			else
				arr[k] = arrRight[j++];
		}
		while (i < lenA)
			arr[k++] = arrLeft[i++];
		while (j < lenB)
			arr[k++] = arrRight[j++];
		return arr;
	}
}
