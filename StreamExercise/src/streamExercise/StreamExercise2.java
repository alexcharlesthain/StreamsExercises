package streamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExercise2 {

	public static void main(String[] args) {
		List<Integer> primeNumbers = Arrays.asList(10, 7, 3, 9, 11, 17, 19, 22);
		List<Integer> Output = primeNumbers.stream().filter(toFilter -> {
			for (int i = 2; i <= toFilter/2; ++i) {
				if(toFilter % i == 0)
				{
					return false;
				}
			}
			return true;
		}).sorted().collect(Collectors.toList());
		System.out.print(Output);
	}
	}			

		
	//include an if statement that says IF number in array is divisible by itself and 1 then include it in the print line.


