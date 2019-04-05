#USING PATTERNS
* Composite Pattern
* Chain of Responsibility Pattern
* Decorator Pattern

##Composite Pattern
The Screen consists of three components which are 1) CreditCardNum; 2) CreditCardExp; 3) CreditCardCVC.

##Chain of Responsibility Pattern
The chain is created when adding subcomponents to Screen. The chain looks like: CreditCardNum -> CreditCardExp -> CreditCardCVC.
When the program gets customer input, it will call key function in chain's order.

##Decorator Pattern
I created three decorators for CreditCardNum, CreditCardExp and CreditCardCVC.
###CardNumDecorator
It will get raw string from CreditCardNum and fill string with spaces if the length is smaller than 16. And then, it will add space every four characters.
###CardExpDecorator
It will get raw string from CreditCardExp and fill string with spaces if the length is smaller than 4. And then, it will add slash at index 2 of string.
###CardCVCDecorator
It will get raw string from CreditCardCVC and fill string with spaces if the length is smaller than 3.
