public class Number implements Interface.Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public Number(String number) {
        this.number = this.converttoint(number);
    }

    private int converttoint(String number) {
        int at = 0;
        char temp;
        int tempNumber = 0;
        for (int i = 0; at < number.length(); i++) {
            tempNumber *= 3;
            temp = number.charAt(at);
            if (temp == 'I' || temp == 'i') {
                at += 2;
            } else if (temp == 'G' || temp == 'g') {
                tempNumber++;
                at += 2;
            } else if (temp == 'P' || temp == 'p') {
                tempNumber += 2;
                at += 3;
            }

        }
        return tempNumber;
    }

    @Override
    public void add(Interface.Number otherNumber) {
        this.number += otherNumber.intValue();
        System.out.println("Result: " + number);

    }

    @Override
    public void subtract(Interface.Number otherNumber) {
        this.number -= otherNumber.intValue();
        System.out.println("Result: " + number);
    }

    @Override
    public void multiply(Interface.Number otherNumber) {
        this.number *= otherNumber.intValue();
        System.out.println("Result: " + number);
    }
    @Override
    public void divide(Interface.Number otherNumber) {
        this.number /= otherNumber.intValue();
        System.out.println("Result: " + number);

    }

    @Override
    public void power(Interface.Number exponent) {
        this.number = (int) Math.pow(number, exponent.intValue());
        System.out.println("Result: " + number);

    }

    @Override
    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isOdd() {
        if (this.number % 2 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEven() {
        if (this.number % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean greaterThan(Interface.Number otherNumber) {
        if (this.number > otherNumber.intValue()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean lessThan(Interface.Number otherNumber) {
        if (this.number < otherNumber.intValue()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Interface.Number otherNumber) {
        if (this.number == otherNumber.intValue()) {
            return true;
        }
        return false;
    }
// Due to implententation this won´t be used. Pingu and Dezimal are handled in the same class
    @Override
    public Interface.Number toPinguNumber() {

        return new Number(number);
    }

    @Override
    public Interface.Number toNaturalNumber() {

        return new Number(number);
    }
    // ----------------------------------------------------------------------------------------
    @Override
    public int intValue() {
        return number;
    }

    @Override
    public String toString() {
        String pingustring = "";
        if (number == 0) {
            pingustring = "In";
        } else {
            int temp = number;
            while (temp > 0) {
                if (temp % 3 == 0) {
                    pingustring = "in" + pingustring;
                } else if (temp % 3 == 1) {
                    pingustring = "gu" + pingustring;
                } else {
                    pingustring = "pin" + pingustring;

                }
                temp /= 3;
            }
            pingustring = Character.toString(pingustring.charAt(0) - 32) + pingustring.substring(1);

        }
        return "intvalue() = " + number + "   pingunumber = " + pingustring;
    }
}