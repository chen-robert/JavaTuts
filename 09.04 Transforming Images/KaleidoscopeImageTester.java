
/**
 * The purpose of this program is to test the KaleidoscopeImage class
 *
 * @author (Andrew Xia)
 * @version (07/27/2017)
 */
public class KaleidoscopeImageTester
{
    public static void main(String[] args)
    {
        //create a blank canvas
        Picture canvas = new Picture(500, 500);
        Picture image = new Picture("flower.jpg");
        Picture canvas2 = new Picture(500,500);
        
        KaleidoscopeImage kI = new KaleidoscopeImage(canvas, image, canvas2);
        
        kI.firstPanel();
        kI.secondPanel();
        kI.thirdPanel();
        canvas = kI.fourthPanel();
        canvas.show();
    }
}
