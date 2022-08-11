import java.util.ArrayList;
/**
 * Polygon is a collection of points, logically
 * connected to each other. In this representation
 * of the Polygon, we assume that the first point
 * in the collection is connected to the last point
 * Note, that we do not explicitly model the connections
 * between the points.
 */
public class Polygon
{
   /**
    * The collection of points is stored as an ArrayList,
    * adjacent points in the array list are assumed to be
    * connected to each other. The last point in the array list
    * is assumed to be connected to the first.
    */
   private ArrayList<Point2D> points;

   /**
    * Adds a point to the polygon object,
    * appending it to the end of the collection
    */
   public void addPoint Point2D nextPoint)
   {
      points.add(nextPoint);
   }
}
