import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		int[] rotated = rotLeft(nums,2);
		Arrays.stream(rotated).forEach(System.out::println);		
	}
	
public static void sortColors(int[] nums) {
     
	
      
    }

static int[] rotLeft(int[] a, int d) {
     return IntStream.concat(Arrays.stream(Arrays.copyOfRange(a, d, a.length)), Arrays.stream(Arrays.copyOfRange(a, 0, d))).toArray();
}


}