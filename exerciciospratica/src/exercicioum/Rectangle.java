package exercicioum;

public class Rectangle {

    //attributes

    public double width;
    public double height;



    //methods
    public double Area() {
        return (width * height);
    }

   public double Perimeter() {
        return 2 * (width + height);
   }

   public double Diagonal() {
        return Math.sqrt(width * width + height * height);
   }

}
