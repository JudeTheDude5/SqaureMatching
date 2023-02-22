import java.util.*;
import java.awt.*;

/**
 * Write a description of class SnakeEye here.
 *
 * @author Jude Reynolds
 * @version January 30th 2023
 */
public class ClosedEye extends BasicEye
{
    public ClosedEye(int x, int y) {
        super(x, y);
    }

    /**
     * 
     */
    public void paint(Graphics canvas)
    {
        canvas.setColor(new Color(230,180,160));
        canvas.fillOval(x,y,diameter,diameter);

        // Draw black line around eye
        canvas.setColor(this.color);
        canvas.drawOval(x, y, diameter, diameter);
        canvas.drawLine(x,y+diameter/2,x+diameter,y+diameter/2);

        for(int i = 1; i < 21; ++i) {
            canvas.drawLine(x+diameter/2, y+diameter/2, x+(int)(diameter/2+
            (diameter/3)*Math.cos(.157*i)),y+(int)(diameter/2+(diameter/3)*
            Math.sin(.157*i)));
        }
    }
}
