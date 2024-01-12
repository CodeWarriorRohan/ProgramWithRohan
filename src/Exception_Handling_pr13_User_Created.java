class CanNotDivideByZeroException extends Exception
{
    public String toString()
    {
        return  "Can't divide by zero!";
    }

    public String getMassage()
    {
        return  "I am getMassage()";
    }
}

class InvalidInputException extends Exception
{
    public String toString()
    {
        return  "Can't add 8 and 9";
    }

    public String getMassage()
    {
        return  "I am getMassage()";
    }
}

class MaxInputException extends Exception
{
    public String toString()
    {
        return  "Input can't be greater than 1000";
    }

    public String getMassage()
    {
        return  "I am getMassage()";
    }
}

class MaxMultiplyInputException extends Exception
{
    public String toString()
    {
        return  "Input can't be greater than 7000 while multiplying";
    }

    public String getMassage()
    {
        return  "I am getMassage()";
    }
}
class CustomCalculator {

    double addition(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        else if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    double subtraction(double a, double b) throws MaxInputException{
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiplication(double a, double b) throws MaxInputException, MaxMultiplyInputException{
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double division(double a, double b) throws CanNotDivideByZeroException {
        if (b == 0)
        {
            throw new CanNotDivideByZeroException();
        }
        return a / b;
    }


}

public class Exception_Handling_pr13_User_Created {
    public static void main(String[] args) throws InvalidInputException, MaxInputException, MaxMultiplyInputException, CanNotDivideByZeroException
    {
        CustomCalculator cc = new CustomCalculator();
//        cc.addition(8, 9);
//        cc.division(4,0);
//        cc.subtraction(1000000, 1000000);
        cc.multiplication(8000,8000);
    }
}