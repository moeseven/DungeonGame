package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import game.Player;
import gameEncounter.Fight;

public class GuiFight extends JPanel{
	private Fight fight;
	private GameWindow gf;
	private JButton b;
	private JPanel jp_east;
	private JPanel jpp;
	private JPanel jp_mid;
	private JPanel jp_west;
	private JPanel jp_west_1;
	private JPanel jp_west_1_1;
	private JPanel jp_mid_1;
	private JTextField tf;
	private Player player;
	public GuiFight(GameWindow gf) {
		this.gf=gf;
		if(this.gf.getGame().getRoom().getFight()!=null) {
			this.fight=this.gf.getGame().getRoom().getFight();	
			
			setLayout(new BorderLayout());
//			// Player dialog
//			tf= new CommandLine(gf,player);//new JTextField(player.getMessage());
//			//
			jp_mid_1= new JPanel();
			jp_mid_1.setLayout(new BorderLayout());
			jp_mid_1.add(new MonstersComponent(this.gf),BorderLayout.NORTH);
			jp_mid_1.add(new HandComponent(this.gf),BorderLayout.CENTER);
			this.add(jp_mid_1,BorderLayout.CENTER);
			b=new JButton("done");
			b.addMouseListener(new ml());
			this.add(b,BorderLayout.SOUTH);
			setVisible(true);
		}		
	}
	private class ml extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			gf.getGame().getRoom().getFight().monstersTurn();
			
		}
	}
}
