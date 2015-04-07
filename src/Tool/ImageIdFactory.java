package Tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImageIdFactory {

	public String getRandomLast4Num() {
		int random = 0;
		random = (int) (Math.random() * 10000);
		String str_last4num = new Integer(random).toString();
		if (str_last4num.length() < 4 && str_last4num.length() >= 3) {
			str_last4num = "0" + str_last4num;
		} else if (str_last4num.length() < 3 && str_last4num.length() >= 2) {
			str_last4num = "00" + str_last4num;
		} else if (str_last4num.length() < 2 && str_last4num.length() >= 1) {
			str_last4num = "000" + str_last4num;
		} else if (str_last4num.length() == 0) {
			str_last4num = "0000";
		}
		return str_last4num;
	}

	public String getCurrentTime() {
		Date uploadDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmm");
		String uploadDateStr = dateFormat.format(uploadDate);
		return uploadDateStr;
	}

	public String getImageIdForData(String userId) {
		return this.getCurrentTime() + userId + this.getRandomLast4Num();
	}
}
