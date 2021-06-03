package  num;

public class RationalDemo
{
   public static void main(String[] args)
   {
      Rational rational1 = new Rational();
      System.out.println("Number is: " + rational1);

      Rational rational2 = new Rational(5);
      System.out.println("Number is: " + rational2);

      Rational rational3 = new Rational(1, 4);
      System.out.println("Number is: " + rational3);

      System.out.println("Rational1's numerator is: "
       + rational1.getNumerator());
      System.out.println("Rational1's denominator is: "
       + rational1.getDenominator());

      System.out.println("Changing rational1's numerator.");
      rational1.setNumerator(3);
      System.out.println("Rational1 is : " + rational1);

      System.out.println("Changing rational1's denominator.");
      rational1.setDenominator(4);
      System.out.println("Rational1 is: " + rational1);

      System.out.println("rational1 is equal to rational2: "
       + rational1.equals(rational2));

      Rational rational2copy = new Rational(rational2.getNumerator(),
           rational2.getDenominator());
      System.out.println("Rational is equal to a copy of rational2: "
       + rational2.equals(rational2copy));

      Rational nonNormal = new Rational(10, -25);
      System.out.println("A non-normalized number (10, -25),"+" should normalize before printing: " + nonNormal);

      System.out.println("Adding 1/4 and 3/4: "
       + Rational.add(rational1, rational3));
      System.out.println("Adding 3/4 and 5/1: "
       + Rational.add(rational1, rational2));

      System.out.println("Subtracting 3/4 - 1/4: "
       + Rational.subtract(rational1, rational3));
      System.out.println("Subtracting 5/1 - 3/4: "
       + Rational.subtract(rational2, rational1));

      System.out.println("Multiplying 1/4 * 3/4: "
       + Rational.multiply(rational1, rational3));

      System.out.println("Dividing 5/1 by 1/2: "
       + Rational.divide(rational2, new Rational(1,2)));

      System.out.println("Adding 3/4 and 1/4: "
       + rational3.add(rational1)); 
      System.out.println("Adding 5/1 and 3/4: "
       + rational2.add(rational1));
       
      System.out.println("Subtracting 1/4 - 3/4: "
       + rational3.subtract(rational1));
      System.out.println("Subtracting 3/4 - 5/1: "
       + rational1.subtract(rational2));
      
      System.out.println("Multiplying 3/4 * 1/4: "
       + rational3.multiply(rational1));
      
      System.out.println("Dividing 5/1 by 1/3: "
       + rational2.divide(new Rational(1,3)));

   }
} 
