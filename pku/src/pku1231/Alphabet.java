package pku1231;

import java.util.Arrays;

public class Alphabet {
	class Letter {
		int number;
		int xmin;
		int xmax;
		int ymin;
		int ymax;
	}

	class Event implements Comparable<Event> {
		boolean opening;
		int pos;

		Event(boolean opening, int pos) {
			this.opening = opening;
			this.pos = pos;
		}

		public int compareTo(Event e) {
			return this.pos - e.pos;
		}
	}

	Letter letters[]; // 文字の配列

	// 縦線を引く
	void findVerticalLines() {
		//
		Event events[] = new Event[letters.length * 2];
		int k = 0;
		for (int i = 0; i < letters.length; i++) {
			events[k++] = new Event(true, letters[i].xmin);
			events[k++] = new Event(false, letters[i].xmax);
		}
		Arrays.sort(events);

		int count = 0;
		for (int i = 0; i < events.length; i++) {
			if (events[i].opening) {
				count++;
			} else {
				count--;
				if (count == 0) {
					// events[i].pos の後に縦線が引ける
				}
			}
		}
	}
}
