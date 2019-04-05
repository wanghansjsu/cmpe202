/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum extends CreditCardField {

	private String number = "" ;

	public String display() {
		return number;
	}	

	public void key(String ch, int cnt) {
		if(cnt <= 16) {
			if(ch.equals("X")) {
				if(cnt == 16)
					nextHandler.clear();
				else
					number = number.substring(0, number.length() - 1);
			} else
				number += ch;
		} else if (nextHandler != null)
			nextHandler.key(ch, cnt) ;
	}

}