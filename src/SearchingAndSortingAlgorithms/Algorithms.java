package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return Integer.parseInt(eggs.get(i));
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> pearls) {
		int counter = 0;
		for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i) == true) {
				counter++;
			}
		}
		return counter;

	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String wordLength = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() >= wordLength.length()) {
				wordLength = words.get(i);
			}
		}
		return wordLength;

	}

	public static String containsSOS(List<String> morse) {
		String sos = "";
		for (int i = 0; i < morse.size(); i++) {
			sos = sos + morse.get(i);
			if (sos.contentEquals("... --- ...")) {
				return "Contains sos message";
			}
		}
		return null;

	}

	public static Double sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			double track;
			for (int j = 1; j < results.size() - i; j++) {
				if (results.get(j) < results.get(j + 1)) {
					results.add(results.get(j));
					results.remove(j);
				}
				System.out.println(results.get(i));

			}
		}
		return 0.0;
	}

	public static String sortDNA(List<String> dna) {
		int swaps = 0;
		while (swaps > 0) {
			int tracker = 0;
			swaps = 0;
			if (dna.get(tracker).length() > dna.get(tracker++).length()) {
				String temp = dna.get(tracker);
				dna.remove(tracker);
				dna.add(tracker++, temp);
				swaps++;

			}
			
		}
		for (int i = 0; i < dna.size(); i++) {
			return dna.get(i);
		
		}
		return null;
	}

	public static String sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).compareTo(words.get(i++)) < 0) {
				words.add(words.get(i));
				words.remove(i);
			}
			if (words.get(i).compareTo(words.get(i++)) > 0) {
				words.add(words.get(i++));
				words.remove(i);
			}
		}
		return "";
	}

	// Add other methods here
}