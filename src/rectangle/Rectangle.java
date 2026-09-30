public class Rectangle {
    
    double width = 1;
    double height = 1;
    public Rectangle() {}
    
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

   

public double getArea(){
    return width*height;
}
public double getPerimeter(){
    return 2*(height+width);
  }

}
    