package _01_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T04_Date_SimpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		// SimpleDateFormat 클래스 : 날짜에 대한 포맷을 제공 [ yyyy/MM/dd or YY/M/dd/mm/ss/ms ]
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM dd");
		System.out.println(sdf2.format(today));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-M-d");
		System.out.println(sdf3.format(today));
		
		// hh : 시(12시간제 0~11), HH : 24시간제(0~23)
		// mm : 분, ss : 초
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf4.format(today));
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf5.format(today));
		// E : 요일
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy년MM-dd일 (E) E요일 EHHmm ss");
		System.out.println(sdf6.format(today));
		
		// parse
		String str = "20250724";
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyyMMdd");
		
		Date strNow;
		try {
			strNow = sdf7.parse(str);
			System.out.println(sdf7.format(strNow));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// set 메서드 : setDate(), setMonth(), setMinutes()
//		Date d1 = strNow.setMinutes(10);
		Date d2 = new Date(2025, 5, 7);
		
	}

}
