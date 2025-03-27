import java.util.Arrays;
public class PracticeProblem {
	public static int[] compareSearch(int[] array, int number) {
        int sequentialloops = 0;
        for (int i = 0; i < array.length; i++) {
            sequentialloops++;
            if (array[i] == number) {
                break;
            }
        }
		int binaryloops = 0;
        int left = 0, right = array.length - 1;
        while (left <= right) {
            binaryloops++;
            int mid = left + (right - left) / 2;
            if (array[mid] == number) {
				break;
            } else if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
		return new int[]{sequentialloops, binaryloops};
    }
    public static int[] compareStringSearch(String [] array, String word) {
        int sequentialloops = 0;
        for (int i = 0; i < array.length; i++) {
            sequentialloops++;
            if (array[i] == word) {
                break;
            }
        }
		int binaryloops = 0;
        int left = 0, right = array.length - 1;
        while (left <= right) {
            binaryloops++;
            int mid = left + (right - left) / 2;
            if (array[mid] == word) {
				break;
            } else if (array[mid].compareTo(word) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
		return new int[]{sequentialloops, binaryloops};
    }
	// They're villagers ... love crushing loaf. Do you love crushing loaf Mr. Kalisz????????
}
