package FlyWeightDesignPattern;
public class Main {
    private static final String colors[] = {"Red", "Blue", "Pink", "Brown"};
    public static void main(String[] args) {
          for (int i = 0; i < 20; i++) {
              Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
              circle.setX(getRandomX());
              circle.setY(getRandomY());
              circle.setRadius(400);
              circle.draw();
          }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100);
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
//Making circle of color: Pink
//Circle drawing... Color: Pink x:26y: 16 radius: 400
//Circle drawing... Color: Pink x:47y: 68 radius: 400
//Circle drawing... Color: Pink x:17y: 40 radius: 400
//Circle drawing... Color: Pink x:13y: 50 radius: 400
//Making circle of color: Brown
//Circle drawing... Color: Brown x:94y: 89 radius: 400
//Making circle of color: Red
//Circle drawing... Color: Red x:93y: 29 radius: 400
//Circle drawing... Color: Brown x:84y: 61 radius: 400
//Circle drawing... Color: Pink x:6y: 59 radius: 400
//Making circle of color: Blue
//Circle drawing... Color: Blue x:17y: 41 radius: 400
//Circle drawing... Color: Blue x:45y: 97 radius: 400
//Circle drawing... Color: Red x:82y: 76 radius: 400
//Circle drawing... Color: Blue x:57y: 44 radius: 400
//Circle drawing... Color: Pink x:86y: 77 radius: 400
//Circle drawing... Color: Red x:90y: 66 radius: 400
//Circle drawing... Color: Blue x:6y: 26 radius: 400
//Circle drawing... Color: Brown x:67y: 47 radius: 400
//Circle drawing... Color: Brown x:15y: 29 radius: 400
//Circle drawing... Color: Pink x:88y: 22 radius: 400
//Circle drawing... Color: Blue x:14y: 6 radius: 400
//Circle drawing... Color: Brown x:65y: 63 radius: 400