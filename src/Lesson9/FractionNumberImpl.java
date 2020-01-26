package Lesson9;

public class FractionNumberImpl implements FractionNumber {

    int dividend;
    int divisor;

    public FractionNumberImpl() {
        this.divisor = FractionNumber.DEFAULT_DIVISOR_VALUE;
    }

    public FractionNumberImpl(int dividend, int divisor) {

        this.dividend = dividend;

        if (divisor == 0) {
            this.divisor = FractionNumber.DEFAULT_DIVISOR_VALUE;
        } else {
            this.divisor = divisor;
        }
    }

    @Override
    public void setDividend(int dividend) {

        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {

        this.divisor = divisor;

    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return (double) this.dividend / this.divisor;
    }

    @Override
    public String toString() {
        return  this.dividend + "/" + this.divisor;
    }
}
