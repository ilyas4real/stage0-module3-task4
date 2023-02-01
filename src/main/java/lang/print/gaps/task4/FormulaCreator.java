package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        byte a = 2;
        byte b = 3;
        double res = (9*(a*a) - 5*b + 2 + a - 7)*((a+b-4*a*b)/2);
        System.out.println(res);
    }
}
