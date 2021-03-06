import package.java.awt;//.Frame;  // Using Frame class in package java.awt

// A GUI program is written as a subclass of Frame - the top-level container
// This subclass inherits all properties from Frame, e.g., title, icon, buttons, content-pane
public class First extends Frame {
 
   // Constructor to setup the GUI components
   public First() {
	    Panel panel = new Panel();        // Panel is a Container
		Button btn = new Button("Press"); // Button is a Component
		panel.add(btn);                   // The Panel Container adds a Button Component
   }

   // Other methods

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor (to setup the GUI) by allocating an instance
      First a = new First();
   }
}