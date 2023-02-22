
import java.util.*;
import java.awt.*;

/**
 * <!-- class BasicEye -->
 *
 * This class represents a single, simple eye on the potato at a specific x,y
 * coordinate
 *
 * @aithor Jude Reynolds
 */
public class BasicEye
{
    protected int x; // my x coordinate
    protected int y; // my y coordinate
    protected int diameter = 10; // my diameter
    protected Color color = Color.BLACK;  // my color
    protected Random gen = new Random(); // for generating random numbers
    protected Color iris = irisMaker(); // Color of the Iris

    /**
     * When a BasicEye is created, the creator must specify where it
     * is located.
     */
    public BasicEye(int initX, int initY)
    {
        this.x = initX;
        this.y = initY;
        this.diameter = 20 + gen.nextInt(31);
    }//ctor

    public Color irisMaker() {
        int irisDecider = gen.nextInt(3);
        Color irisColor;
        if(irisDecider == 0) {
            irisColor = new Color(0,130+gen.nextInt(101),0);
        }
        else if(irisDecider == 1) {
            irisColor = new Color(0,0,130+gen.nextInt(101));
        }
        else {
            irisColor = new Color(120+gen.nextInt(51), 60+gen.nextInt(51), 40+gen.nextInt(51));
        }
        return irisColor;
    }

    /**
     * this eye paints itself on a given canvas
     */
    public void paint(Graphics canvas)
    {
        // Draw white eye
        canvas.setColor(Color.WHITE);
        canvas.fillOval(x, y, diameter, diameter);

        //Draw Iris
        canvas.setColor(this.iris);
        canvas.fillOval(x+((int)(diameter*.15)),y+((int)(diameter*.15)),(int)(diameter*.7),(int)(diameter*.7));

        // Draw black pupil
        canvas.setColor(Color.BLACK);
        canvas.fillOval(x+diameter/3,y+diameter/3, diameter/3, diameter/3);

        // Draw black line around eye
        canvas.setColor(this.color);
        canvas.drawOval(x, y, diameter, diameter);
    }//paint

}//class BasicEye
