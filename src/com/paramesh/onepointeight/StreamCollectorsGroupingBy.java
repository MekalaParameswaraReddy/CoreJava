package com.paramesh.onepointeight;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class StreamCollectorsGroupingBy {

	public void Stream_Collectors_GroupingBy() {
		List<String> items = Arrays.asList("apple", "banana", "graphes",
				"apple", "banana", "graphes", "apple", "banana", "cocomber",
				"apple");

		Map<String, Long> result = items.stream().collect(
				Collectors.groupingBy(Function.identity(),
						Collectors.counting()));

		System.out.println(result);

		Map<String, Long> valueSort = new LinkedHashMap<>();
		Map<String, Long> KeySort = new LinkedHashMap<>();
		
		result.entrySet().stream()
				.sorted(Map.Entry.<String, Long> comparingByValue())
				.forEachOrdered(e -> valueSort.put(e.getKey(), e.getValue()));
		// comparingByValue().reversed() // for reverser order
		System.out.println(valueSort);
		
		result.entrySet().stream()
				.sorted(Map.Entry.<String, Long> comparingByKey())
				.forEachOrdered(e -> KeySort.put(e.getKey(), e.getValue()));
		// comparingByKey().reversed() // for reverser order
		System.out.println(KeySort);
	}
	
	public void  Collectors_nameCount() {
		List<Item> list = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99")));
		
		Map<String, Long> counting = list.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(counting);
		
		Map<String, Integer> sum = list.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		System.out.println(sum);
		
		Map<String, Set<BigDecimal>> nameSum = list.stream().collect(Collectors.groupingBy(Item::getName, Collectors.mapping(Item::getPrice, Collectors.toSet())));
		System.out.println(nameSum);
	}
	
	
	public void filterNullvalueFromStream (){
		Stream<String> lang = Stream.of("Java", null, "Python", "Ruby", null, "react", "Redx", null);
		
		//Convert a Stream to List
		List<String> result = lang.collect(Collectors.toList());		
		System.out.println(result);
		//result.forEach(System.out::println);
		// Following line will throw : stream has already been operated upon or closed
		//List<String> result_notNull = lang.filter(x -> x != null).collect(Collectors.toList());
		List<String> result_notNull = result.stream().filter(x -> x != null).collect(Collectors.toList());
		System.out.println(result_notNull);
		List<String> result_notNull_obj = result.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(result_notNull_obj);
	}
	
	public void convertingStreamToList() {
		Stream<Integer> lang = Stream.of(1,2,3,4,5,6,7,8,9);
		List<Integer> numbers = lang.filter(x -> x !=4).collect(Collectors.toList());
		numbers.forEach(System.out::print);
		System.out.println();
		numbers.forEach(x -> System.out.print(x +" "));
	}

	/**
	 * convert Array to Stream
	 */
	public void convertArrayToStream() {
		String[] array = {"a", "b", "c", "d", "e"};
		Stream<String> streamArr = Arrays.stream(array);
		streamArr.forEach(x -> System.out.print(x));
		
		Stream<String> streamArr1 = Stream.of(array);
		streamArr1.forEach(System.out::println);
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intArray_stream = Arrays.stream(intArray);
		intArray_stream.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		Stream<int[]> intArray_stream1 = Stream.of(intArray);
		IntStream intStream2 = intArray_stream1.flatMapToInt(x -> Arrays.stream(x));
		intStream2 .forEach(x -> System.out.print(x + " "));
		
		
	}
	
	public void ReuseStream() {
		String[] array = {"Java", null, "Python", "Ruby", null, "react", "Redx", null};
		Stream<String> lang = Stream.of(array);		
		StreamUsingOnlyOnce(lang);
		StreamUsingManyTimes(array);
		 
	}
	
	public void StreamUsingOnlyOnce(Stream<String> lang){
		List<String> result = lang.collect(Collectors.toList());		
		System.out.println(result);
		// stream has already been operated upon or closed
		/*List<String> result_notNull = lang.filter(x -> x != null).collect(Collectors.toList());		
		System.out.println(result_notNull);*/
	}

	public void StreamUsingManyTimes(String[] array) {

		Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);
		streamSupplier.get().forEach(x -> System.out.println(x));
		long count = streamSupplier.get().filter(x -> "Java".equals(x)).count();
		System.out.println(count);

		List<String> result_notNull = streamSupplier.get().filter(x -> x != null).collect(Collectors.toList());
		result_notNull.forEach(System.out::println);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StreamCollectorsGroupingBy by = new StreamCollectorsGroupingBy();
		//by.Stream_Collectors_GroupingBy();
		//by.Collectors_nameCount();
		//by.filterNullvalueFromStream();
		//by.convertingStreamToList();
		//by.convertArrayToStream();
		by.ReuseStream();
	}

}
