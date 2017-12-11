import java.awt.geom.*;         // for Point2D.Double
import java.util.ArrayList;     // for ArrayList
import gpdraw.*;                // for DrawingTool
/**
 * Write a description of class IrregularPolygon here.
 *
 * @author (kwest)
 * @version (12/10/17)
 */
public class IrregularPolygon
{
    private ArrayList <Point2D.Double> myPolygon;

    //constructors
    public IrregularPolygon () {}
    //public methods
    public void add(Point2D.Double aPoint) 
    {
        
        
    }

    public void draw() {}

    public double perimter () 
    {
        for (Point2D.Double p : myPolygon)
        {
             
        }
    }

    public double area ()
    {
        int val = 0;
        int n = 0;
        int w = 1;
        for (Point2D.Double p : myPolygon)
        {
            val += Math.abs(pn.getx()+pw.gety());
            n++;
            w++;
        }
        int val2 = 0;
        for (Point2D.Double p : myPolygon)
        {
            val2 += Math.abs(pn.gety()-pw.getx());
            n++;
            w++;
        }
        return (val-val2);
    }

}
