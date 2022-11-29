package Interface;

public interface Number {

    void add(Number otherNumber);
    void subtract(Number otherNumber);
    void multiply(Number otherNumber);
    void divide(Number otherNumber);

    void power(Number exponent);

    boolean isPrime();
    boolean isOdd();
    boolean isEven();

    boolean greaterThan(Number otherNumber);
    boolean lessThan(Number otherNumber);
    boolean equals(Number otherNumber);

    Number toPinguNumber();
    Number toNaturalNumber();

    int intValue();
    String toString();
}