package streamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise3 {

	public static void main(String[] args) {
		
		
		List<String> myNameList = Arrays.asList("Hello", "It's", "Alex");
		
		String NameList = myNameList.stream().collect(Collectors.joining(" "));
		
		System.out.println(NameList);

	}

}
