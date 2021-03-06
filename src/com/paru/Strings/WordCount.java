package com.paru.Strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

	public int wordCountInSentence(String sentence, String word) {
		int count = 0;
		String arr[] = sentence.split(" ");
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i].equals(word)) {
				count++;
			} else {
				System.out.println("not");
			}
		}
		return count;
	}

	public void getWordCount() {
		long start = System.currentTimeMillis();
		int count = 0;
		String sentence = "down vote As others have said, currentTimeMillis is clock time, which changes due to daylight saving time, users changing the time settings, leap seconds, and internet time sync. If your app depends on monotonically increasing elapsed time values, you might prefer nanoTime instead. You might think that the players won't be fiddling with the time settings during game play, and maybe you'd be right. But don't underestimate the disruption due to internet time sync, or perhaps remote desktop users. The nanoTime API is immune to this kind of disruption. If you want to use clock time, but avoid discontinuities due to internet time sync, you might consider an NTP client such as Meinberg, which  the clock rate to zero it in, instead of just resetting the clock periodically. I speak from personal experience. In a weather application that I developed, I was getting randomly occurring wind speed spikes. It took a while for me to realize that my timebase was being disrupted by the behavior of clock time on a typical PC. All my problems disappeared when I started using nanoTime. Consistency (monotonicity) was more important to my application than raw precision or absolute accuracy. down vote As other posters already indicated; your system clock is probably not synchronized up to microseconds to actual world time. Nonetheless are microsecond precision timestamps useful as a hybrid for both indicating current wall time, and measuring/profiling the duration of things. I label all events/messages written to a log files using timestamps like These convey both when it happened (wall time), and can also be used to measure the duration between this and the next event in the log file (relative difference in microseconds). To achieve this, you need to link System.currentTimeMillis() with System.nanoTime() and work exclusively with System.nanoTime() from that moment forward. Example code:";
		// Set<String> set = new TreeSet<String>();
		Set<String> set = new LinkedHashSet<String>();
		String arr[] = sentence.split(" ");
		for (int i = 0; i < arr.length; ++i) {
			set.add(arr[i]);
		}
		// System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String word = it.next();
			for (int i = 0; i < arr.length; ++i) {
				if (word.equals(arr[i])) {
					count++;
				}
			}
			System.out.println(set);
			System.out.println("the word \'" + word + "\' presnt " + count
					+ " times.");
			count = 0;

		}
		long end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("total time " + total);
	}

	public void getWordCountForPerformance() {
		long start = System.currentTimeMillis();
		int count = 0;
		String sentence = "down vote As others have said, currentTimeMillis is clock time, which changes due to daylight saving time, users changing the time settings, leap seconds, and internet time sync. If your app depends on monotonically increasing elapsed time values, you might prefer nanoTime instead. You might think that the players won't be fiddling with the time settings during game play, and maybe you'd be right. But don't underestimate the disruption due to internet time sync, or perhaps remote desktop users. The nanoTime API is immune to this kind of disruption. If you want to use clock time, but avoid discontinuities due to internet time sync, you might consider an NTP client such as Meinberg, which  the clock rate to zero it in, instead of just resetting the clock periodically. I speak from personal experience. In a weather application that I developed, I was getting randomly occurring wind speed spikes. It took a while for me to realize that my timebase was being disrupted by the behavior of clock time on a typical PC. All my problems disappeared when I started using nanoTime. Consistency (monotonicity) was more important to my application than raw precision or absolute accuracy. down vote As other posters already indicated; your system clock is probably not synchronized up to microseconds to actual world time. Nonetheless are microsecond precision timestamps useful as a hybrid for both indicating current wall time, and measuring/profiling the duration of things. I label all events/messages written to a log files using timestamps like These convey both when it happened (wall time), and can also be used to measure the duration between this and the next event in the log file (relative difference in microseconds). To achieve this, you need to link System.currentTimeMillis() with System.nanoTime() and work exclusively with System.nanoTime() from that moment forward. Example code:";
		ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<String>();
		String arr[] = sentence.split(" ");
		for (int i = 0; i < arr.length; ++i) {
			concurrentSkipListSet.add(arr[i]);
		}
		Iterator<String> it = concurrentSkipListSet.iterator();
		while (it.hasNext()) {
			String word = it.next();
			for (int i = 0; i < arr.length; ++i) {
				if (word.equals(arr[i])) {
					count++;
					concurrentSkipListSet.remove(word);
				}
			}
			System.out.println(concurrentSkipListSet);
			System.out.println("the word \'" + word + "\' presnt " + count
					+ " times.");
			count = 0;

		}
		long end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("total time " + total);
	}

	/**
	 * O/p: both are equal
	 */
	public void equalTest() {
		String s1 = "length: 10";
		String s2 = "length: " + s1.length();
		if (s1.equals(s2)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
	}
	
	/**
	 * I/P ==> 134, 3 : O/P 129
	 * @param number
	 * @param digit
	 */
	public void lessThanGivenNumberShouldNotContainPassedNumber(int number, int digit) {
		String numDigit = new String(digit+"");
		for(int i = number; i>=0 ; --i){
			String num = new String(i+"");
			if(!num.contains(numDigit)) {
				System.out.println(num);
				break;
			}
		}
	}
	public boolean A(){
		return false;
	}
	public boolean B(){
		return true;
	}
	public boolean C(){
		return true;
	}
	public boolean getBoolean() {
		return A()|B()|C();
	}
	public static final String ALPHA_NUMERIC_SPECIAL = "[A-Za-z_0-9'. ]*";
	public static boolean validateAlphaNumericSpChar(String expression)
    {
        Pattern p = Pattern.compile(ALPHA_NUMERIC_SPECIAL);
        Matcher m = p.matcher(expression);
        return m.matches();
    }

	public void isDigit() {
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('1');
		al.add('a');
		al.add('3');
		al.add('b');
		al.add('4');
		al.add('c');
		for (int i = 0; i < al.size(); ++i) {
			Character ch = al.get(i);
			if (ch.isDigit(ch)) {
				System.out.println(ch);
			}
		}
	}
	
	public void printNumbersFormString(String sentense) {
		int size = sentense.length();
		String chars = "";
		String numbers = "";
		Character ch[] = new Character[size];
		for (int i = 0; i < size; ++i) {
			ch[i] = sentense.charAt(i);
			if (ch[i].isDigit(ch[i])) {
				numbers = numbers + ch[i];
			} else {
				chars = chars + ch[i];
			}
		}
		System.out.println("number are ==" + numbers);
		System.out.println("chars are ===" + chars);
	}
	
	public void getUniqueChar(String str1, String str2) {
		// System.out.println(System.getProperty("user.dir"));
		String result = "";
		for (int i = 0; i < str1.length(); ++i) {
			boolean flag = true;
			for (int j = 0; j < str2.length(); ++j) {
				if (str1.charAt(i) == str2.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result = result + str1.charAt(i);
			}
		}
		System.out.println(result);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wordCount = new WordCount();
		/*String sentence = "java is a programing language. java is simple. java is used for many apllications.";
		String word = "is";
		int count = wordCount.wordCountInSentence(sentence, word);
		System.out.println("The word " + word + " is presnt " + count + " times");
		wordCount.getWordCount();
		wordCount.getWordCountForPerformance();
		wordCount.equalTest();	
		wordCount.lessThanGivenNumberShouldNotContainPassedNumber(1234, 3);
		
		Boolean b = wordCount.getBoolean();
		System.out.println(b);*/
		
		Boolean b1 = validateAlphaNumericSpChar("tester     .");
		System.out.println(b1);
	}
}
