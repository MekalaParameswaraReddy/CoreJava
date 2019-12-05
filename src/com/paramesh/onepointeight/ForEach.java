package com.paramesh.onepointeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.paru.system.SysoutChange;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class ForEach {

	List<String> list = null;
	Map<String, String> map = null;
	List<Person> personList = null;

	ForEach() {
		list = new ArrayList<String>();
		map = new HashMap<String, String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		map.put("A.P", "Amaravathi");
		map.put("T.G", "Hyd");
		map.put("Karnataka", "Bengalur");
		map.put("Tamilnadu", "Chennai");
		map.put("kerala", "Trivendram");

		personList = Arrays.asList(
				new Person(101, "KCR", "Hyd"), 
				new Person(102, "JMR", "AP"),
				new Person(103, "yeddi", "Bengalore"));
	}

	public void forEach_basic_List() {
		for (String item : list) {
			System.out.println(item);
		}
	}

	public void forEach_dot8_List() {
		System.out.println(" -- lambda -- ");
		list.forEach(var -> System.out.println(var));

		System.out.println(" -- lambda with condition -- ");
		list.forEach(var -> {
			if ("two".equals(var)) {
				System.out.println(var);
			}
		});

		// method reference
		System.out.println("-- method reference -- ");
		list.forEach(System.out::println);

		// Stream and filter
		System.out.println("-- Stream and filter --");
		list.stream().filter(var -> var.contains("two"))
				.forEach(System.out::println);
		
		// stream.filter() to filter a List, and collect() to convert a stream into a List.
		System.out.println("-- Excluded two ----");
		List<String> excludedTwo = list.stream() // convert list to stream
				.filter(var -> !"two".equals(var)) // we dont like two
				.collect(Collectors.toList()); // collect the output and convert streams to a List
		excludedTwo.forEach(System.out::println); //output : one three four five
	}

	public void forEach_basic_map() {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getKey();
			System.out.println(key + " == " + value);
		}
	}

	public void forEach_dot8_map() {
		// Map with forEach + lambda expression.
		System.out.println(" -- Map with forEach + lambda expression. --");
		map.forEach((k, v) -> System.out.println(k + " = " + v));

		// forEach + lambda expression + condition.
		System.out.println(" -- forEach + lambda  + condition  --");
		map.forEach((k, v) -> {
			if ("A.P".equals(k)) {
				System.out.println(k + " = " + v);
			}
		});		
	}

	
	public void displyPersonObject(String name) {	
		Person befor8 = getPersonObj_befor8(personList, name);
		System.out.println("before java 8 " + befor8);
		/*System.out.println(befor8.getId());
		System.out.println(befor8.getName());
		System.out.println(befor8.getAddress());*/
		
		Person injava8 = getPersonObj_injava8(personList, name);
		
		System.out.println("in java 8 " + injava8);
		/*System.out.println(injava8.getId());
		System.out.println(injava8.getName());
		System.out.println(injava8.getAddress());*/
		
		displayUsingMap(personList);		
	}
	
	Person getPersonObj_befor8(List<Person> personList, String name) {
		Person person = null;
		for(Person persons : personList) {
			if(persons.getName().equals(name)){
				person = persons;
			}			
		}
		return person;		
	}
	
	Person getPersonObj_injava8(List<Person> personList, String name) {
		Person person = null;
		person = personList.stream().filter(personName -> name.equals(personName.getName())).findAny().orElse(null);
		return person;		
	}
	
	/**
	 * 
	 * Using map
	 */
	public void displayUsingMap(List<Person> personList) {
		List<String> names1 = personList.stream().map(Person::getName).collect(Collectors.toList());
		List<String> names2 = personList.stream().map(x ->x.getName()).collect(Collectors.toList());
		System.out.println(names1);
		System.out.println(names2);
	}

	public void printCase() {
		printCase_before8(list);
		printCase_inJava8(list);
		printNumberMultipliedBy(2);
	}

	public void printCase_before8(List<String> list) {
		System.out.println(" ===== upper case before java 8");
		List<String> upperCse = new ArrayList<String>();
		for (String num : list) {
			upperCse.add(num.toUpperCase());
		}
		System.out.println(upperCse);
	}

	public void printCase_inJava8(List<String> list ) {
		List<String>  upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(" ===== upper case in java 8");
		System.out.println(upperCase);
	}
	
	public void printNumberMultipliedBy(int n){
		System.out.println(" ===== number are multiplied by * " + n);
		List <Integer> numbers = Arrays.asList(1,2,3,4);
		List <Integer> numbersX2 = numbers.stream().map(num -> num * n ).collect(Collectors.toList());
		System.out.println(numbersX2);
	}
	
	public String testNormalMethod(){
		return "normal method test.........";
	}
	
	public static void testStaticMethod(){
		System.out.println( "normal method test.........");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ForEach forEach = new ForEach();
		// forEach.forEach_basic_List();
		// forEach.forEach_dot8_List();
		// forEach.forEach_basic_map();
		//forEach.forEach_dot8_map();
		String name = "raja";
		//forEach.displyPersonObject(name);
		//forEach.printCase();
		
	}

}
