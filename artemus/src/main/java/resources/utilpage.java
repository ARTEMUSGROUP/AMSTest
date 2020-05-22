package resources;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class utilpage {

	public ArrayList<String> dates() {
		ArrayList<String> dates = new ArrayList<String>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		// System.out.println(dtf.format(now));

		String date1 = dtf.format(now);
		dates.add(date1);
		// Print the Date
		// System.out.println("Current date and time is " +date1);

		LocalDateTime now2 = LocalDateTime.now().plusDays(2);

		String date2 = dtf.format(now2);
		dates.add(date2);
		// System.out.println("Current+2 date and time is " +date2);

		LocalDateTime now3 = LocalDateTime.now().plusDays(4);

		String date3 = dtf.format(now3);
		dates.add(date3);
		// System.out.println("Current+4 date and time is " +date3);

		return dates;

	}

}
