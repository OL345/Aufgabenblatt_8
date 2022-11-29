import Interface.Number;

public class Dezimal extends Number {
    private int number;
    public int value1;

    public Dezimal(int value1) {
        this.value1 = value1;
    }

    public Dezimal(String number) {
        this.number = this.converttoint(number);
    }

    private int converttoint(String number) {
        int at = 0;
        char temp = number.charAt(at);
        int tempNumber = 0;
        for (int i = 0; temp != '\0'; i++) {
            tempNumber*=3;
            if (temp == 'I' || temp == 'i') {
                at += 2;
            } else if (temp == 'G' || temp == 'g') {
                tempNumber++;
                at += 2;
            } else if (temp == 'P' || temp == 'p') {
                tempNumber += 2;
                at+=3;
            }
            temp=number.charAt(at);
        }
        return tempNumber;
    }

    @Override
    public void add(Number otherNumber) {

    }

    @Override
    public void subtract(Number otherNumber) {

    }

    @Override
    public void multiply(Number otherNumber) {

    }

    @Override
    public void divide(Number otherNumber) {

    }

    @Override
    public void power(Number exponent) {

    }

    @Override
    public boolean isPrime() {
        return false;
    }

    @Override
    public boolean isOdd() {
        return false;
    }

    @Override
    public boolean isEven() {
        return false;
    }

    @Override
    public boolean greaterThan(Number otherNumber) {
        return false;
    }

    @Override
    public boolean lessThan(Number otherNumber) {
        return false;
    }

    @Override
    public boolean equals(Number otherNumber) {
        return false;
    }

    @Override
    public Number toPinguNumber() {
        return null;
    }

    @Override
    public Number toNaturalNumber() {
        return null;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}