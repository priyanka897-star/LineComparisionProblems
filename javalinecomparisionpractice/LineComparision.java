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
          Double line1 = Object.distance(1,2,3,4);
          Double line2 = Object.distance(1,2,3,4);
          if (line1.equals(line2)) {
              System.out.println("Line1 and Line2 are equal");
          }
          else {
        	  System.out.println("Line1 and Line2 are not equal");
        	  
           }
    }
}
