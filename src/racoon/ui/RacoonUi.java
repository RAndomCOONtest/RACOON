package racoon.ui;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import racoon.controler.ContestGenerator;

public class RacoonUi extends JFrame implements ActionListener
{
	private ContestGenerator generator ;
	private JPanel panel ;
	private JLabel  question;
	private JButton butItem1;
	private JButton butItem2;
	private JButton butGenerer;
	
	public RacoonUi()
	{
		this.setTitle("RACOON");
	    this.setSize(1000, 500);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    generator = new ContestGenerator();
		generator.run();
		
		panel = new JPanel ();
		BoxLayout    bl=new BoxLayout(panel,BoxLayout.Y_AXIS);   //layoutManager
		panel.setLayout(bl); 
        
		question=new JLabel(generator.getGenerator().getDrawnQuestion().toString());  //créé un label
		panel.add(question);
		panel.add(Box.createRigidArea(new Dimension(0,10)));
		butItem1=new JButton(generator.getGenerator().getDrawnItem1().toString());
		panel.add(butItem1);
		panel.add(Box.createRigidArea(new Dimension(0,10)));
	    butItem2=new JButton(generator.getGenerator().getDrawnItem2().toString());
	    panel.add(butItem2);
	    panel.add(Box.createRigidArea(new Dimension(0,100)));
	    butGenerer = new JButton("Générer nouveau contest");
	    butGenerer.addActionListener(this);
	    panel.add(butGenerer);
	    this.setContentPane(panel);
	    this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		generator.run();
		question.setText(generator.getGenerator().getDrawnQuestion().toString());
		butItem1.setText(generator.getGenerator().getDrawnItem1().toString());
		butItem2.setText(generator.getGenerator().getDrawnItem2().toString());
		
	}

}
