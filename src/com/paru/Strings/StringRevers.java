package com.paru.Strings;

/**
 * @author Parameh
 * @version 1.0
 * @last modified 26/02/2017
 * 
 *       This class is used to reverse the given strings.
 *       break cannot be used out side the loop or switch.
 */
public class StringRevers {
	/**
	 * @param string
	 * @return
	 * @exception This
	 *                Method is used to reverse the given strings using string
	 *                Buffer.
	 */
	public String StringRevUsingSb(String string) {
		StringBuffer sb = new StringBuffer();
		sb.append(string);
		StringBuffer sbRev = sb.reverse();
		String rev = sbRev.toString();
		return rev;
	}

	/**
	 * @param string
	 * 
	 *            This method is used to reverse the given strings using without
	 *            string Buffer.
	 */
	public String stringRevWithoutSb(String string) {
		String rev = "";
		for (int i = string.length() - 1; i >= 0; --i) {
			rev = rev + string.charAt(i);
		}
		return rev;
	}

	public String removeWhiteSpace(String sentence) {
		String newSting = sentence.replace("  ", "");
		return newSting;
	}

	public String revWithRecursive(String name) {
		if ((null == name) || (name.length() <= 1)) {
			return name;
		}
		return revWithRecursive(name.substring(1)) + name.charAt(0);
	}

	public void stringPolyndara(String name) {
		boolean flag = true;
		int mid = name.length() / 2;
		for (int i = 0; i < mid; ++i) {
			char ch1 = name.charAt(i);
			char ch2 = name.charAt((name.length() - i) - 1);
			if (ch1 == ch2) {
				continue;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("give String is polyndrom");
		} else {
			System.out.println("Not polyndrom");
		}
	}

	/**
	 * 
	 * I/p: hyderabad ==> O/p: d
	 */
	public void firstRepeatedChar(String name) {
		char firstRepeateChar = 0;
		boolean flag = true;
		for (int i = 0; i < name.length(); ++i) {
			if (flag) {
				for (int j = i + 1; j < name.length(); ++j) {
					if (name.charAt(i) == name.charAt(j)) {
						firstRepeateChar = name.charAt(i);
						flag = false;
						break;
					} else {
						continue;
					}
				}
			}
		}
		System.out.println("First Repeated Char is " + firstRepeateChar);
	}

	/**
	 * 
	 * I/p: BANANA ==> O/p: B-1 A-3 N-2
	 */
	public void repeatedCharCount(String name) {
		String found = "";
		char repeateChar = 0;
		boolean flag = false;
		for (int i = 0; i < name.length(); ++i) {
			for (int k = 0; k < found.length(); ++k) {
				if (found.charAt(k) == name.charAt(i)) {
					flag = true;
				}
			}
			if (flag) {
				break;
			}

			repeateChar = name.charAt(i);
			int count = 1;
			for (int j = i + 1; j < name.length(); ++j) {
				if (name.charAt(i) == name.charAt(j)) {
					count++;
				}
			}
			System.out.print(repeateChar + " - " + count + " ");
			found = found + name.charAt(i);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRevers stringRevers = new StringRevers();
		/*String forwardString = "paramesh";
		String reverseStrig = "";
		reverseStrig = stringRevers.StringRevUsingSb(forwardString);
		System.out.println(reverseStrig);
		reverseStrig = stringRevers.stringRevWithoutSb(forwardString);
		System.out.println(reverseStrig);
		String sentence = "paramesh  mekala";
		String newsentence = stringRevers.removeWhiteSpace(sentence);
		System.out.println(newsentence);*/
		String kname = stringRevers.revWithRecursive("kumar");
		System.out.println(kname);

		stringRevers.repeatedCharCount("BANANANNN");
	}
}
