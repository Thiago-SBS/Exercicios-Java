package ExerciciosDeClasses.Ex009;

public class Rectangle {
    private double width;
    private double height;
    private Point bottomLeftVertex; // starting point

    public Rectangle(double width, double height, Point bottomLeftVertex) {
        this.width = width;
        this.height = height;
        this.bottomLeftVertex = bottomLeftVertex;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public Point getBottomLeftVertex() { return bottomLeftVertex; }

    public Point findCenter() {
        double centerX = bottomLeftVertex.getX() + width / 2.0;
        double centerY = bottomLeftVertex.getY() + height / 2.0;
        return new Point(centerX, centerY);
    }

    public void print() {
        System.out.println("Retângulo: Largura = " + width + ", Altura = " + height);
        System.out.print("Vértice inferior esquerdo: ");
        bottomLeftVertex.print();
        System.out.print("Centro: ");
        findCenter().print();
    }
}