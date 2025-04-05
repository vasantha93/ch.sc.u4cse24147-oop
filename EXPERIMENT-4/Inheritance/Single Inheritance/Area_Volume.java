class Area {
   	 double length;
	double width;
	double area;

   
    public void Area(double length, double width) {
 System.out.println("Length: " + length);
        System.out.println("Width: " + width);

		area=length*width;
                System.out.println("Area: " + area);
    }
}

class Volume extends Area {     
 double height;
  double v;
    

public void Volume(double height) {
                  
                System.out.println("Height: " + height);
		v=length*width*height;
        	System.out.println("Volume: " + v);
    }
}

public class Area_Volume {
    public static void main(String[] args) {
         Volume obj = new Volume();
         obj.Area(2,3);
	 obj.Volume(4);   
	 }
}
