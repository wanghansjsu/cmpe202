##Strategy pattern
Using a functional interface BinaryOperator<T> to represents an operation upon two operands of the same type, producing a result of the same type as the operands.
This can replace original class Add, class Sub, class Mul, so the number of class decrease to three.
Modify the original interface Strategy to StrategyEnum, using enum function to include three strategies and  provide method get() for Context to get different strategies.
Compare to original Java Design Pattern version, the code is more simplification, but also implemented strategy pattern. 
