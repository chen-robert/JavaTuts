
/**
 * The purpose of this program is to test the MirrorinImages class
 *
 * @author (Andrew Xia)
 * @version (07/26/2017)
 */
import java.awt.*;

public class MirroringImagesTester
{
    public static void main(String[] args)
    {
        Picture canvas = new Picture(200, 200);
        Picture canvas2 = new Picture(400, 400);
        Picture canvas3 = new Picture(1600, 1600);
        
        MirroringImages mirror = new MirroringImages(canvas, canvas2, canvas3);
        
        canvas = mirror.drawPanel();
        canvas2 = mirror.mirrorImage1();
        canvas3 = mirror.mirrorImage2();

        canvas2.show();
    }
}
