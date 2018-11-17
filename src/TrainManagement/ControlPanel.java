/**
 * 
 */
package TrainManagement;

import java.util.ArrayList;

/**
 * @author Ahmed
 *
 */
public class ControlPanel {
	private ArrayList<Train> trains;
	
	public ControlPanel() {
		trains = new ArrayList<Train>();
	}
	
	public ControlPanel(ArrayList<Train> trains)
	{
		this.trains = trains;
	}
	
}
