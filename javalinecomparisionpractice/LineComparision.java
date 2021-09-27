package javalinecomparisionpractice;

public class LineComparision {
		double distance (int x1,int x2,int y1, int y2)
		{
			double distance;
			distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			return distance;
		}
       public static void main(String[] args) {
              LineComparision Object = new LineComparision();
              double computeDistance = Object.distance(1,2,3,4);
	          System.out.println("Distance between two point is :" +computeDistance);
   }
}
