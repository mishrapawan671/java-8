package Learning.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
	
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
	   System.out.println("printing List of numbers ");
	   
		numbers.stream()
				.forEach(System.out::print);
		System.out.println("\nprinting List of numbers seperatedBy Space ");
		numbers.stream()
				.map(number->number+" ")
				.forEach(System.out::print);
		
		System.out.println("\nprinting all even numbers seperatedBy Space ");
		numbers.stream()
				.filter(number->number%2==0)
				.map(number->number+" ")
				.forEach(System.out::print);
		System.out.println("\nprinting all odd numbers seperatedBy Space ");
		numbers.stream()
				.filter(number->number%2!=0)
				.map(number->number+" ")
				.forEach(System.out::print);
		
		System.out.println("\nprinting sum numbers Space ");
		System.out.println(numbers.stream()
				.reduce(0,(a,b)->a+b));
		
		System.out.println("\nprinting sum of even numbers Space ");
		System.out.println(numbers.stream()
				.filter(number->number%2==0)
				.reduce(0,(a,b)->a+b));
		
		System.out.println("\nprinting sum of Odd numbers Space ");
		System.out.println(numbers.stream()
				.filter(number->number%2!=0)
				.reduce(0,(a,b)->a+b));
		
		System.out.println("\nprinting all number in sorted order numbers Space ");
		numbers.stream()
				.sorted()
				.map(number->number+" ")
				.forEach(System.out::print);
		System.out.println("\nprinting all number in reverse sorted order numbers Space ");
		numbers.stream()
				.sorted((a,b)->b-a)
				 .map(number->number+" ")
				.forEach(System.out::print);
		
		System.out.println("\nprinting sorted Odd numbers Space ");
		numbers.stream()
				.filter(number->number%2!=0)
				.sorted((a,b)->a-b)
				.map(number->number+" ")
				.forEach(System.out::print);
		
		System.out.println("\nprinting reversely sorted even  numbers Space ");
		numbers.stream()
				.filter(number->number%2==0)
				.sorted((a,b)->b-a)
				.map(number->number+" ")
				.forEach(System.out::print);
		
		System.out.println("\nprinting reversely sorted prime  numbers Space ");
		numbers.stream()
				.filter(number->{
					
					for(var i=2;i<=Math.sqrt(number);i++)
					{
						if(number%i==0)
							return false;
					}
					return true;
					
				})
				.sorted((a,b)->b-a)
				.map(number->number+" ")
				.forEach(System.out::print);
         
	

		System.out.println("\nCreating new List of reversely sorted prime  numbers Space ");
		List<Integer> prime=numbers.stream()
				.filter(number->{
					
					for(var i=2;i<=Math.sqrt(number);i++)
					{
						if(number%i==0)
							return false;
					}
					return true;
					
				})
				.sorted((a,b)->b-a)
				.collect(Collectors.toList());
		System.out.println(prime);
		
		

		System.out.println("\nprinting List of reversely sorted prime  numbers withing range ");
		IntStream.rangeClosed(0, 100)
				.filter(number->number!=0)
				.filter(number->{
					
					for(var i=2;i<=Math.sqrt(number);i++)
					{
						if(number%i==0)
							return false;
					}
					return true;
					
				})
				.boxed()
				.sorted((a,b)->b-a)
				.map(number->number+" ")
				.forEach(System.out::print);
		
		
		System.out.println("\nCreating List of reversely sorted prime  numbers withing range ");
		 List<String> p=IntStream.rangeClosed(0, 100)
				.filter(number->number!=0)
				.filter(number->{
					
					for(var i=2;i<=Math.sqrt(number);i++)
					{
						if(number%i==0)
							return false;
					}
					return true;
					
				})
				.boxed()
				.sorted((a,b)->b-a)
				.map(number->number+" ")
				.collect(Collectors.toList());
		 System.out.println(p);
		
		
		
		
	}
}
