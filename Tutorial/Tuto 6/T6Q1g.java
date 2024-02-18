
package tutorial6;
public class T6Q1g {
    public static void main(String[] args) {
        //g. Define a static void method that returns the area and the circumference of a
        //circle given the argument is radius. Area = πr2 and Circumference = 2 πr.
        double[] arr = new double[2];
        double r = 5 ;
        circleCalc(r,arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);    
    }
    
    public static void circleCalc(double radius, double[] aAndc){
        double area = Math.PI*radius*radius;
        double circumference = Math.PI*radius*2;
        aAndc[0] = area;
        aAndc[1] = circumference; 
    }
}

//        int radius = 5;
//        System.out.printf("The area of circle is %.2f", getArea(radius));
//        System.out.println("");
//        System.out.printf("The circumference of circle is %.2f",  getCircumference(radius));
//        System.out.println("");
//    }
//
//        public static double getArea (double radius){
//            return (Math.PI*radius*radius);
//        }
//        public static double getCircumference (double radius){
//            return (Math.PI*radius*2);
//        }  
//           
//        }

   
//    System.out.println(getArea(5), getCircumference(5));
//    }
//    public static void getArea(double radius){
//        double area = Math.PI*radius*radius;
//    } return area;
//    public static void getCircumference(double radius){
//        double circumference = Math.PI*radius*2;
//    } return circumference;
//}
    
    

