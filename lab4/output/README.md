CRC cards: please see the CRCcards.png in the output folder

Chose Observer Pattern in my design: 

Customer ---- ConcreteObserver(Participant in the Pattern) 
ResevrationSystem ---- ContreteSubject(Participant in the Pattern)

Reason: ResevrationSystem maintains a list of Reseverations, and one Reseveration map to one customer. So one ResevrationSystem map to many customer. When the ResevrationSystem gets an available table and its state changes, it will notify customers about the change. Then the customer will do its action, i.e. reply to ReservationSystem and go to the table or leave. That's the reason why I chose the Observer Pattern.
