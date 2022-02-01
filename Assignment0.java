/* Bashar Odeh
 * 1/31/22
 * CMSC 203
 * Assignment 0
 */
import javax.swing.JOptionPane;


public class Assignment0 {

	static void sphereVolume(double radius) {
		double volume_sphere = (4.0/3.0)*Math.pow(radius, 3.0)*Math.PI;
		JOptionPane.showMessageDialog(null, "The volume of the Sphere is " + volume_sphere);
	}
	
	static void boxVolume(double width, double height,double length){
		double volume_box = length*width*height;
		JOptionPane.showMessageDialog(null, "The volume of the box is " + volume_box);

	}
	
	
	public static void main(String[] args) {

     double radius,length,width,height;
     String str;
     //input for sphere
     str = JOptionPane.showInputDialog("Enter a number for the radius of the Sphere: ");
     radius =Double.parseDouble(str);
     
     sphereVolume(radius);
     
     // Input for box
     str = JOptionPane.showInputDialog("Enter a number for the length of the box: ");
     length =Double.parseDouble(str);
     
     str = JOptionPane.showInputDialog("Enter a number for the width of the box: ");
     width = Double.parseDouble(str);
	
	
	 str = JOptionPane.showInputDialog("Enter a number for the height of the box: ");
     height = Double.parseDouble(str);
     
     // Call method to calculate volume of box
     boxVolume(height,length,width);
	}
	

}
