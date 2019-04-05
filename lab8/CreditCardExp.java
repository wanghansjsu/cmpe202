/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends CreditCardField {

	private String date = "" ;

	public String display() {
		if(date.isEmpty())
			return "MMYY";
		else
			return date;
	}	

	public void key(String ch, int cnt) {
		if(cnt >= 17 && cnt <= 20) {
			if(ch.equals("X")) {
				if(cnt == 20)
					nextHandler.clear();
				else
					date = date.substring(0, date.length() - 1);
			} else
				date += ch;
		} else if (nextHandler != null)
			nextHandler.key(ch, cnt) ;
	}

	public void clear() {
		date = "";
	}

}