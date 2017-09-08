package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int total = 0;
		for (String s: eggs) {
			if (s.equals("cracked")) {
				return total;
			}
			total++;
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
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).length() > wordLength.length()) {
					wordLength = words.get(i);
					
				}
			}
		}
		return wordLength;

	}

	public static boolean containsSOS(List<String> message) {
		for (String s : message) {
			if (message.contains(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {
		for (int i = 0; i < scores.size(); i++) {
			for (int j = i + 1; j < scores.size(); j++) {
				if (scores.get(i) > scores.get(j)) {
					double temp = scores.get(j);
					scores.set(j, scores.get(i));
					scores.set(i, temp);
				}
			}
		}
		return scores;
	}

	public static List<String> sortDNA(List<String> dna) {
		int swaps = 0;
		int tracker = 0;
		while (swaps > 0) {
			System.out.println(swaps);
			swaps = 0;
			tracker++;

			if (dna.get(tracker).length() > dna.get(tracker++).length()) {
				System.out.println("1");
				String temp = dna.get(tracker);
				String temp2 = dna.get(tracker++);
				dna.remove(tracker);
				dna.remove(tracker++);
				dna.add(tracker, temp);
				dna.add(tracker++, temp2);
				swaps++;

			}
		}
		return dna;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).compareTo(words.get(j)) > 0) {
					String temp = words.get(j);
					words.set(j, words.get(i));
					words.set(i, temp);
				}
			}
		}
		return words;
	}

	// Add other methods here
}