package streamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise4 {

	public static void main(String[] args) {
		
		
		List<Int> myNumList = Arrays.asList("1", "2", "3", "4", "5", "6");
		
		Int NumList = myNumList.stream().collect(Collectors.joining("+"));
		
		System.out.println(NumList);

	}

}
}
