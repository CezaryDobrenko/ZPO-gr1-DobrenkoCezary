package ZPO.lab07.zadanie3;

public class ShapeFacade {
    private Shape rectangle;
    private Shape line;

    public ShapeFacade() {
        rectangle = new Rectangle();
        line = new Line();
    }

    public void drawRectangle(int startX, int startY, int width, int height){
        rectangle.draw(startX,startY,width,height);
    }
    public void drawLine(int startX, int startY, int endX, int endY){
        line.draw(startX,startY,endX,endY);
    }
}
