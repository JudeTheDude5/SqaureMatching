import java.util.*;
import java.awt.*;

/**
 * Draws eye with eyelash
 *
 * @author Jude Reynolds
 * @version January 30th 2023
 */
public class LashedEye extends BasicEye
{
    public LashedEye(int x, int y) {
        super(x, y);
    }

    /**
     * 
     */
    public void paint(Graphics canvas)
    {
        // Draws eyelashes
        canvas.setColor(Color.BLACK);

        for(int i = 1; i < 41; ++i) {
            canvas.drawLine(x+diameter/2, y+diameter/2, x+(int)(diameter/2+
            (diameter*.6)*Math.cos(-.0785*i)),y+(int)(diameter/2+(diameter*.6)*
            Math.sin(-.0785*i)));
        }

        super.paint(canvas);
    }
}
