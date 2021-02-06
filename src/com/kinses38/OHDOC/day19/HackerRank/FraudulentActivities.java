package com.kinses38.OHDOC.day19.HackerRank;

import java.util.Collections;
import java.util.PriorityQueue;

public class FraudulentActivities {

	static int activityNotifications(int[] expenditure, int d) {
		int notifs = 0;
		PriorityQueue<Integer> lowers = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> highers = new PriorityQueue<>();

		//add one element each to ensure that balance is kept..
		for (int i = 0; i < expenditure.length - 1; i++) {
			addNumbers(expenditure[i], lowers, highers);
			balance(lowers, highers);
			//we now have enough transactions to start checking.
			if (lowers.size() + highers.size() == d) {
				double median = getMedian(lowers, highers);
				System.out.println(median);
				if (expenditure[i + 1] >= 2 * median) {
					notifs++;
				}
				int lastSlidingValue = expenditure[i - d + 1];
				remove(lastSlidingValue, lowers, highers);
			}
		}
		return notifs;
	}

	private static void remove(int lastSlidingValue, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (lowers.contains(lastSlidingValue))
			lowers.remove(lastSlidingValue);
		else
			highers.remove(lastSlidingValue);
	}

	private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (highers.size() > lowers.size()) {
			return highers.peek();
		} else if (lowers.size() > highers.size()) {
			return lowers.peek();
		} else {
			return (double) (highers.peek() + lowers.peek()) / 2;
		}

	}

	private static void balance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (highers.size() - lowers.size() >= 2) {
			lowers.add(highers.peek());
			highers.remove(highers.peek());
		} else if (lowers.size() - highers.size() >= 2) {
			highers.add(lowers.peek());
			lowers.remove(lowers.peek());
		}
	}

	private static void addNumbers(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (!lowers.isEmpty() && number < lowers.peek()) {
			lowers.add(number);
		} else {
			highers.add(number);
		}
	}

	public static void main(String[] args) {
		int days = 3;
		int[] transactions = {10,20,30,40,50};
		System.out.println(activityNotifications(transactions, days));

		RollingMedianExample.getMedians(transactions);

	}
}

class RollingMedianExample {
	/**
	 * Rather than sorting and keeping track of a median in an array. We can keep two separate heaps/buckets. Lower and higher half.
	 * Then when a new number is processed we need to decide whether it belongs in the lower or higher bucket,
	 * baring in mind we'd like to keep the buckets themselves balanced (no different in size by more than 1).
	 * <p>
	 * To get the median we fetch the appropriate number. So if one of the buckets is bigger,
	 * get the min or max depending on whether its lower/higher. min of higher, max of lower = median.
	 * <p>
	 * If the buckets are the same size, get max of lower and min of higher then average them.
	 * In java, PriorityQueues are implemented using heaps, so we can use them.
	 * For the lowers we can pass a custom comparator or Collections.reverseOrder
	 * in order to keep the max value on top
	 * <p>
	 * lowers = max heap
	 * highers = min heap
	 */

	//TODO overload a method to take the rolling days as a parameter so it only calculates the median for those days.
	public static double[] getMedians(int[] array) {
		PriorityQueue<Integer> lowers = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> highers = new PriorityQueue<>();

		double[] medians = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			addNumber(number, lowers, highers);
			rebalance(lowers, highers);
			medians[i] = getMedian(lowers, highers);
		}

		return medians;
	}

	private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		//check the size, if one is larger, take the element from the top of the larger heap.
		//if the same, then return the average of the top element from both heaps
		//if higher > lower  then....
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

		if (biggerHeap.size() == smallerHeap.size()) {
			return (double) (biggerHeap.peek() + smallerHeap.peek()) / 2;
		} else {
			return biggerHeap.peek();
		}
	}

	private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

		if (biggerHeap.size() - smallerHeap.size() >= 2) {
			smallerHeap.add(biggerHeap.poll());
		}
	}

	private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (lowers.isEmpty() || number < lowers.peek()) {
			lowers.add(number);
		} else {
			highers.add(number);
		}
	}


}