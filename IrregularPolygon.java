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

    public void draw() 
    {
        SketchPad myPaper= new SketchPad (500,500);
        DrawingTool myPencil = new DrawingTool (myPaper);
        for (int i = 0; i < myPolygon.size(); i++)
        {
            myPencil.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
    }

    public double perimter () 
    {
        int val = 0;
        for (int i = 0; i< myPolygon.size(); i++)
        {
            val += (myPolygon.get(i).distance(myPolygon.get(i++)));
        }
        val += (myPolygon.get(myPolygon.size()).distance(myPolygon.get(0)));

        return val;
    }

    public double area ()
    {
        int val1 = 0;
        for (int i = 0; i < myPolygon.size(); i++)
        {
            val1+= myPolygon.get(i).getX()*myPolygon.get(i++).getY();
        }
        val1 += myPolygon.get(myPolygon.size()).getX()*myPolygon.get(0).getY();
        int val2 = 0;
        for (int i = 0; i < myPolygon.size(); i++)
        {
            val2 += myPolygon.get(i).getY()*myPolygon.get(i++).getX();
        }
        val2 += myPolygon.get(myPolygon.size()).getY()*myPolygon.get(0).getX();

        return val1 - val2;
    }

}
