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
    private SketchPad canvas;
    private DrawingTool pencil;
    //constructors
    public IrregularPolygon () 
    {
        canvas = new SketchPad(600,600);
        pencil = new DrawingTool(canvas);
        myPolygon = new ArrayList<Point2D.Double>();
    }
    //public methods
    public void add(Point2D.Double aPoint) 
    {
        myPolygon.add(aPoint);
    }

    public void draw() 
    {
        ArrayList<Point2D.Double>myDraw;
        myDraw = myPolygon;

        double cx = 0;
        double cy = 0;
        for (int i = 1; i< myDraw.size(); i++)
        {
            cx = myDraw.get(i).getX();
            cy = myDraw.get(i).getY();
            pencil.move(cx,cy);
        }
        pencil.move(myDraw.get(0).getX(),myDraw.get(0).getY());

    }

    public double perimeter () 
    {
        int val = 0;
        if (myPolygon.size()<=2)
        {
            return val;
        }
        else 
        {
            for (int i = 0; i< myPolygon.size()-1; i++)
            {
                val += (myPolygon.get(i).distance(myPolygon.get(i+1)));
            }
            val += (myPolygon.get(myPolygon.size()-1).distance(myPolygon.get(0)));

            return val;
        }
    }

    public double area ()
    {
        double val = 0.0;
        if (myPolygon.size()<=2)
        {
            return val;
        }
        else
        {
            double val1 = 0.0;
            for (int i = 0; i < myPolygon.size()-1; i++)
            {
                val1+= myPolygon.get(i).getX()*myPolygon.get(i+1).getY();
            }
            val1 += myPolygon.get(myPolygon.size()-1).getX()*myPolygon.get(0).getY();
            double val2 = 0.0;
            for (int i = 0; i < myPolygon.size()-1; i++)
            {
                val2 += myPolygon.get(i).getY()*myPolygon.get(i+1).getX();
            }
            val2 += myPolygon.get(myPolygon.size()-1).getY()*myPolygon.get(0).getX();
            
            return Math.abs((val1-val2)*.5);
        }
    }

    public String getName()
    {
        return "Krista";
    }
}
