public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
     double getDiscriminant(){
        double delta = Math.pow(b,2) - 4* a*c;
        return delta;
     }
     double getRoot1(){
        double delta = this.getDiscriminant();
        double x1 = (- b + Math.sqrt(delta))/(2*a);
        return x1;
     }
    double getRoot2(){
        double delta = this.getDiscriminant();
        double x2 = (- b - Math.sqrt(delta))/(2*a);
        return x2;
    }
    void disPlay(){
         double delta = this.getDiscriminant();
         if (delta < 0){
             System.out.println("phương trình vô nghiệm!");
         }else
             if( delta > 0){
                 System.out.println(" phươnng trình có  2 nghiệm phân biệt: x1 =" + getRoot1() + " x2 = " + getRoot2() );
             }else {
                 System.out.println(" phương trình có nghiệm kép  x1 = x2 = "+ getRoot1());
             }
    }
}
