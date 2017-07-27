
/**
 * The purpose of this program is to test the MirrorinImages class
 *
 * @author (Andrew Xia)
 * @version (07/26/2017)
 */
import java.awt.*;

public class MirroringImagesTester
{//start of class
    public static void main(String[] args)
    {//start if main method
        //create the canvases for the art
        Picture canvas = new Picture(200, 200);
        Picture canvas2 = new Picture(400, 400);
        Picture canvas3 = new Picture(800, 800);
        
        //create object of type MirroringImages
        MirroringImages mirror = new MirroringImages(canvas, canvas2, canvas3);
        
        //run the methods
        canvas = mirror.drawPanel();
        canvas2 = mirror.mirrorImage1();
        canvas3 = mirror.mirrorImage2();
        
        //show the process of the mirroring
        canvas.show();
        canvas2.show();
        canvas3.show();
        
    }//end of main method
}//end of class
