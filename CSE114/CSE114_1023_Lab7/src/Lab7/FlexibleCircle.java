package Lab7;

public class FlexibleCircle {
    double radius;
  
     /** Construct a circle with radius 1 */
    FlexibleCircle() {
        radius = 1.0;
   }
    FlexibleCircle(double measure) {
    	radius = measure;
   }
   /** Construct a circle with a specified radius */
   FlexibleCircle(double measure, char measureType) {
	   if(measureType == 'A' || measureType == 'a') {
		   radius = Math.sqrt(measure / Math.PI);
	   }else if(measureType == 'P' || measureType == 'p') {
		   radius = measure / (2 * Math.PI);
	   }else {
		   radius = measure;
	   }
    }
    /** Return radius of circle */
    double getRadius() {
    	return radius;
    }
     /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
    /** Return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /** Set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
    void setArea(double newArea) {
    	radius = Math.sqrt(newArea / Math.PI);
    }
    void setPerimeter(double newPerimeter) {
    	radius = newPerimeter / (2 * Math.PI);
    }
    
}
