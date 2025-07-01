package genericUtility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author usha
 */
public class JavaUtility {
	/**
	 * This method is used to capture current system date and time
	 * @return syatem date and time
	 */
	public String getSystemTime()
	{
		 return LocalDateTime.now().toString().replace(":", "-");
	}
 
	
	/**
	 * This method will return random numbers within 1000
	 * @return int
	 */
	public int getRandomNumber()
	{
		Random ran=new Random();
	return	ran.nextInt(1000);
	}
}
