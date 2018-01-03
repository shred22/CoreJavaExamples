package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParseDemo {

	public static void main(String[] args) throws ParseException {


		Date date = new Date();
		String str = "18/12/2017";
		date = new SimpleDateFormat("dd/MM/YYYY").parse(str);
		System.out.println(date);

	}

}
