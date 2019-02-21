
public class Sort {

	public static int [] bubbleSort(int[] numArray) {

	    int n = numArray.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (numArray[j - 1] > numArray[j]) {
	                temp = numArray[j - 1];
	                numArray[j - 1] = numArray[j];
	                numArray[j] = temp;
	            }

	        }
	    }
	    return numArray;
	}
	
	public static void main(String[] args) {
		int [] numbers = {453, 114, 214, 328, 311, 64, 575, 117, 877, 393, 596, 911, 236, 982, 23, 469, 733, 223, 600, 440, 74, 839, 727, 162, 530, 707, 208, 376, 330, 42, 170, 986, 442, 930, 482, 662, 291, 757, 615, 985, 275, 785, 151, 735, 239, 863, 55, 247, 343, 176, 855, 297, 316, 794, 505, 620, 737, 739, 483, 831, 793, 141, 695, 875, 444, 570, 419, 232, 904, 116, 140, 690, 776, 6, 635, 191, 745, 957, 181, 454, 687, 961, 668, 768, 120, 199, 893, 493, 915, 205, 568, 755, 638, 671, 517, 513, 919, 648, 24, 644};
		numbers = bubbleSort(numbers);
		System.out.print(numbers[16]);
	}
}
