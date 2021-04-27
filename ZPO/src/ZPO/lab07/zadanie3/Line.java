package ZPO.lab07.zadanie3;

public class Line implements Shape {

    @Override
    public void draw(int startX, int startY, int endX, int endY) {
        System.out.println("Draw line from P("+startX+","+startY+") to Q("+endX+","+endY+")");
    }
}