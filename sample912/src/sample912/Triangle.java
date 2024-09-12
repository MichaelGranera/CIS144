package sample912;

public class Triangle {
    double height;
    double base;
    private double area;

public void Triangle(double height, double base)
{
    this.height=height;
    this.base=base;
    
    
}
   public void CalcArea()
   {
       this.area=(this.height*this.base)/2;
   }
   
   public double getArea()
   {
       return this.area;
   }
   
   
}
