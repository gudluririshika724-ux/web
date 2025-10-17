@FunctionalInterface
 interface AreaInterface {
    double compute(int a,int b);

    
}
class FuncIntArea{
    public static void main(String args[]){
        AreaInterface rectangle =(a,b)->a*b;
        System.out.println("area of rectangle :"+rectangle.compute(6, 5));

         AreaInterface triangle  =(a,b)->0.5*a*b;
        System.out.println("area of triangle :"+triangle.compute(6, 5));

         AreaInterface square =(a,b)->a*b;
        System.out.println("area of aquare :"+square.compute(6, 5));
    }
}