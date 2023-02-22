
import java.awt.*;
import java.util.*;

/**
 * <!-- class EyeFactory -->
 *
 * This class is used to create eyes.  The eyes it creates are of a random type
 * and color.
 *
 * @author Jude Reynolds
 */
public class EyeFactory
{
    /**
     * createEye
     *
     * creates a new object whose type is BasicEye (though it may be a subclass
     * thereof) and returns it to the caller
     */
    public static BasicEye createEye(int x, int y)
    {
        Random gen = new Random();
        int eyeChose = gen.nextInt(3);
        
        if(eyeChose == 0) {
            return new LashedEye(x,y);
        }
        else if(eyeChose == 1) {
            return new ClosedEye(x,y);
        }
        else {
            return new BasicEye(x,y);
        }
    }//createEye
    
}//class EyeFactory

