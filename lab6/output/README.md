Pattern Used:
* Composite Pattern
  * Burgers, Fries and Toppings are all implementing the same interface (IItem). In the meanwhile, Burger is composite of many toppings.
    I enabled Burger object to add Topping objects.

Here is output:
RECEIPT:
```
               FIVE GUYS
           BURGERS AND FRIES
            STORE # CA-1294
         5353 ALMADEN EXPY N60
           SAN JOSE, CA 95118
            (P) 408-264-9300



         03/16/2019 08:21:42 下午

               FIVE GUYS
Order Number: 45
1  LBB                              5.59
      {{{ BACON }}}
      LETTUCE
      TOMATO
      ->|G ONION
      ->|JALA GRILLED
1  LTL CAJ                          2.79

   Sub. Total:                     $8.38
   Tax:                            $0.75
   Total:                          $9.13


   Cash                           $20.00
   Change                         $10.87
Register:1          Tran Seq No:   57845
Cashier:Sakda* S.
  ************************************
    Don't throw away your receipt!!!

   Help Five Guys and you could win!
```

PACKAGING SLIP:
```
Order Number: 45
         03/16/2019 08:21:42 下午

               FIVE GUYS
1  LBB                            
      {{{ BACON }}}
      LETTUCE
      TOMATO
      ->|G ONION
      ->|JALA GRILLED
1  LTL CAJ                        

Register:1          Tran Seq No:   57845
Cashier:Sakda* S.
```
