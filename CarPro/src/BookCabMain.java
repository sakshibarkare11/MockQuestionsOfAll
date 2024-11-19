import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookCabMain {

	private Map<String, Date> bookingMap = new HashMap<String, Date>();

	public Map<String, Date> getBookingMap() {
		return bookingMap;
	}

	public void setBookingMap(Map<String, Date> bookingMap) {
		this.bookingMap = bookingMap;
	}

	public List<String> findCabBookingIdsForTheBookingDate(Date date) {
		List<String> one = new ArrayList<String>();
		// Fill the code here
		for(Map.Entry<String, Date> e : bookingMap.entrySet()){
			if(e.getValue().equals(date)) {
				one.add(e.getKey());
			}	
		}
		return one;

	}

}
