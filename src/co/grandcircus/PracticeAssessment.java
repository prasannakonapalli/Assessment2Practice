package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeAssessment {
	public static void main(String[] args) {

		System.out.println("espanol : " + espanol());
		List<String> list = new ArrayList<>();
		list.add("sam");
		list.add("ram");
		list.add("dam");
		list.add("mam");
		System.out.println();
		System.out.println("lift : " + lift(list));
		System.out.println();
		Map<String, String> map = new HashMap<>();
		map.put("1", "sun");
		map.put("2", "moon");
		map.put("3", "rain");
		map.put("4", "cloud");
		System.out.println();
		System.out.println("takeItAway : " + takeItAway(map, "xxxx"));
		System.out.println();
		System.out.println("listToSet : " + listToSet(list));
		System.out.println();
		System.out.println("howFarApart : " + howFarApart(list, "dam", "sam"));
		double[] diff = { 10.0, 3.0, 4.5, 2.0 };
		System.out.println("MakeADifference : " + makeADifference(diff, 8, 1));
		System.out.println(neverTellMeTheOdds(new int[] { 1, 2, 3, 4, 5 }));
		int[] pos = new int[] { 2, -1, 4, -2, 0 };
		System.out.println("fleeZero : " + fleeZero(pos));
	}

	public static Map<Integer, String> espanol() {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Uno");
		m.put(2, "Dos");
		m.put(3, "Tres");
		// m.put(4, "Mexico");
		// for (Map.Entry<Integer, String> entry : m.entrySet()) {
		// System.out.println(entry.getKey() + " " + entry.getValue());

		return m;
	}

	public static int lift(List<String> list) {

		// for(String modifiedList:list) {
		// modifiedList.toUpperCase();

		// System.out.println(list);
		// }
		String s = "";
		List<String> up = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			s = list.get(i).toUpperCase();
			up.add(s);

		}
		// System.out.print(up);

		return up.size();
	}

	public static boolean takeItAway(Map<String, String> map, String s) {

		for (Map.Entry<String, String> entry : map.entrySet()) {
			// System.out.println(entry.getKey() + " " + entry.getValue());
			if (s.equalsIgnoreCase(entry.getValue())) {
				map.remove(entry.getKey());
				System.out.println(map);
				return true;

			}

		}
		System.out.println(map);
		return false;
	}

	public static Set<String> listToSet(List<String> list) {
		Set<String> set1 = new HashSet<>();
		for (String s : list) {
			set1.add(s);
		}

		return set1;

	}

	public static int howFarApart(List<String> s, String a, String b) {

		int ind1 = 0;

		if (s.contains(a) && s.contains(b)) {

			ind1 = s.indexOf(b) - s.indexOf(a);
			// return ind1;
		} else {
			throw new IllegalArgumentException();
		}

		return ind1;
	}

	public static double makeADifference(double[] diff, int a, int b) {
		try {
			double sub;
			sub = (diff[a] - diff[b]);

			return (sub);
		} catch (Exception e) {
			return 0.0;
		}
	}

	public static Set<Integer> neverTellMeTheOdds(int[] odd) {
		Set<Integer> even = new HashSet<>();

		for (int i = 0; i < odd.length; i++) {
			if (odd[i] % 2 == 0) {
				even.add(odd[i]);
			}

		}
		return even;

	}

	public static int fleeZero(int[] zero) {
		int count = 0;
		for (int i = 0; i < zero.length; i++) {
			if (zero[i] > 0) {
				zero[i] += 1;
				count++;
			} else if (zero[i] < 0) {
				zero[i] -= 1;
			}

		}
		return count;
	}

}
