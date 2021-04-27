package ZPO.lab07.zadanie3;

public class Rectangle implements Shape {

    @Override
    public void draw(int startX, int startY, int width, int height) {
        System.out.println("Draw rectangle from P("+startX+","+startY+") with width=" + width + " and height="+height);
    }
}
