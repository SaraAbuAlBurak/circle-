
package circle;
public class Circle {

    public static final double PI= 3.14;
    private int rad ;
    
    
    
    

    public Circle(int rad ) {
        this.rad= rad;
        
    }

    Circle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double getRad(){
        double r = 2*PI*rad;
        return r;
    
    }
    
    
     public double getArea(){
        double area= rad*rad*PI;
        return area;
    
    }
   

    
    public void setRad(int rad) {
        this.rad = rad;
        
    }

   
    
    
}
