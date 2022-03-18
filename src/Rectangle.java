public class Rectangle extends Quad{

    public Rectangle(Point startingPoint, double length, double width){
        super(startingPoint,
                new Point(startingPoint.getX() + length, startingPoint.getY()),
                new Point(startingPoint.getX(), startingPoint.getY() + width),
                new Point(startingPoint.getX() + length, startingPoint.getY() + width));
    }
}