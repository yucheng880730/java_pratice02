package num;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Rational {

    private int numerator;
    private int denominator;

    @Override
    public String toString(){

        return numerator + "/" + denominator;

    }

    //determine equality (0 false 1 true)
    public boolean equals(Rational r1){

        return (numerator == r1.numerator &&
                denominator == r1.denominator);

    }

    //normalize method
    public void normalize(){

        if( this.denominator < 0 && this.numerator > 0){
            this.numerator = this.numerator * -1;
            this.denominator = this.denominator * -1;
        }

    }

    // return the numerator of this rational number
    public int getNumerator(){

        return this.numerator;

    }

    // return thw denominator of this rational number
    public int getDenominator(){

        return this.denominator;

    }

    // change the numerator
    public int setNumerator(int numerator){

        return this.numerator = numerator;

    }

    //change the denominator
    public int setDenominator(int denominator){

        return this.denominator = denominator;

    }

    // no-argument constructor initializes an object to 0
    public Rational (){

        this.numerator = 0;
        this.denominator = 1;
        normalize();
        //toString(0 ,1);

    }
    // single parameter constructor
    public Rational (int wholeNUmber){

        this.numerator = wholeNUmber;
        this.denominator = 1;
        normalize();

    }
    // constructor with two argument
    public Rational (int numerator, int denominator){

        this.numerator = numerator;
        this.denominator = denominator;
        normalize();

    }

    //greatest common factor
    private static int gcd (int numerator, int denominator){

        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        int temp;
        while ( b != 0){
            temp = a % b ;
            a = b;
            b = temp;
        }
        return a;
    }

    //least common multiple
    private static int lcm(int m, int n){

        if(m < 0) m = -m;
        if(n < 0) n = -n;
        return  m * (n / gcd(m, n));

    }

    //static method
    public static Rational add(Rational r1, Rational r2) {

        Rational r3 = new Rational();
        r3.denominator = lcm(r1.denominator, r2.denominator);
        r3.numerator = r1.numerator * (r3.denominator / r1.denominator) + r2.numerator * (r3.denominator / r2.denominator);
        return r3;

    }

    public static Rational subtract(Rational r1, Rational r2){

        Rational r3 = new Rational();
        r3.denominator = lcm(r1.denominator, r2.denominator);
        r3.numerator = r1.numerator * (r3.denominator / r1.denominator) - r2.numerator * (r3.denominator / r2.denominator);
        return r3;

    }

    public static Rational multiply(Rational r1, Rational r2) {

        Rational r3 = new Rational();
        r3.numerator = r1.numerator * r2.numerator;
        r3.denominator = r1.denominator * r2.denominator;
        return r3;

    }

    public static Rational divide(Rational r1, Rational r2) {

        Rational r3 = new Rational();
        r3.numerator = r1.numerator * r2.denominator;
        r3.denominator = r1.denominator * r2.numerator;
        return r3;

    }

    //general method
    public Rational add(Rational r1){

        Rational r3 = new Rational();
        r3.denominator = lcm(r1.denominator, this.denominator);
        r3.numerator = r1.numerator * (r3.denominator / r1.denominator) + this.numerator * (r3.denominator / this.denominator);
        return r3;

    }

    public Rational subtract(Rational r1){

        Rational r3 = new Rational();
        r3.denominator = lcm(r1.denominator, this.denominator);
        r3.numerator = this.numerator * (r3.denominator / this.denominator) - r1.numerator * (r3.denominator / r1.denominator);
        return r3;

    }

    public Rational multiply(Rational r1){

        Rational r3 = new Rational();
        r3.numerator = r1.numerator * this.numerator;
        r3.denominator = r1.denominator * this.denominator;
        return r3;

    }

    public Rational divide(Rational r1){

        Rational r3 = new Rational();
        r3.numerator = this.numerator * r1.denominator;
        r3.denominator = this.denominator * r1.numerator;
        return r3;

    }

}
