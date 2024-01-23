package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalcutorView;

public class MiniCalcutorController implements ActionListener{
	private MiniCalcutorView miniCalcutorView;
	
	public MiniCalcutorController(MiniCalcutorView miniCalcutorView) {
		this.miniCalcutorView = miniCalcutorView;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Button = e.getActionCommand();
		
		if(Button.equals("Exit")) {
			System.exit(0);
			
		}
		
	}

}
