/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC extends CreditCardField {

	private String cvc = "" ;

	public String display() {
		if(cvc.isEmpty())
			return "CVC";
		else
			return cvc;
	}	

	public void key(String ch, int cnt) {
		if (cnt >= 21) {
			if (cnt >= 21 && cnt <= 23) {
				if (ch.equals("X"))
					cvc = cvc.substring(0, cvc.length() - 1);
				else
					cvc += ch;
			} else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
	}

	public void clear() {
		cvc = "";
	}

}