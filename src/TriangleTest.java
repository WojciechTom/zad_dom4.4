import java.util.concurrent.TransferQueue;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle trojkat1 = new Triangle(4,4,5);
        TriangleChecker maszyna = new TriangleChecker();
        System.out.println(maszyna.isRightTriangle(trojkat1));
    }
}
