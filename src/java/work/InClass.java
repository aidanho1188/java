package java.work;

import java.time.*;

public class InClass {

	public static void main(String[] args) {
		LocalDateTime now;
		int nowSec;
		int prevSec = 0;
		for (;;) {
			now = LocalDateTime.now();
			nowSec = now.getSecond();
			if (nowSec != prevSec) {
				System.out.println(now.getSecond() + ":" + now.getMinute() + ":" + nowSec);
				prevSec = nowSec;
			}
		}
	}

}
