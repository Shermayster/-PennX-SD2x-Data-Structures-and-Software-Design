
import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {

	public static void insertSorted(LinkedList<Integer> list, int value) {
		/* IMPLEMENT THIS METHOD! */
		if (list == null)
			return;
		if (list.isEmpty() == true) {
			list.addFirst(value);
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			int currentValue = list.get(i);
			if (currentValue >= value) {
				list.add(i, value);
				return;
			}
		}
		list.addLast(value);
	}

	public static void removeMaximumValues(LinkedList<String> list, int N) {
			/* IMPLEMENT THIS METHOD! */
		 if (list == null || N < 0 || list.size() == 0)
	            return;
	        int compareIndex = N > list.size() - 1 ? list.size() - 1 : N;
	        String compareString = list.get(compareIndex);
	        for (int i = 0; i < list.size(); i++) {
	            int currentValue = list.get(i).compareTo(compareString);
	            if (currentValue >= 0) {
	                list.remove(i);
	                if(i < list.size()) {
	                    i--;
	                }
	            }
	        }
    }

	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
		/* IMPLEMENT THIS METHOD! */
		  if (one == null || two == null || one.size() == 0 || two.size() == 0 || one.size() < two.size())
				return false;
		boolean returnValue = true;
		int oneIndex = one.indexOf(two.getFirst());
		  if (oneIndex > -1) {
			  for (int i = 0; i < two.size(); i++) {
				if(oneIndex > one.size() - 1) {
					return false;
				}
				if(two.get(i) != one.get(oneIndex)) {
					returnValue = false;
				}
				oneIndex++;
			  }
		  } else {
			returnValue = false;
		  }

		return returnValue; 
	}
}
