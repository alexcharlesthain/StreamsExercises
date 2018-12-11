package streamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise1 {

	public static void main(String[] args) {
	
		List<String> myList = Arrays.asList("hello", "its", "alex");
		List<String> collect = myList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}


}
