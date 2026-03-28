package generic_utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class RandomUtility {
	
	public int getRandomNumber(int range) {
		Random random =new Random();
		int randomInRange=random.nextInt(range);
		return randomInRange;
		
	}
	
	public String getCurrentdate(String format) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.format(date);
		
	}
	
	public String getRequiredDate(int days) {
		Date date=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
		sdf.format(date);
		Calendar cal=sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredDate=sdf.format(cal.getTime());
		return requiredDate;
	}
	
	public String getRandomValue() {
		UUID randomData=UUID.randomUUID();
		String value=randomData.toString().replaceAll("[^a-zA-Z","");
		return value;
	}

}
