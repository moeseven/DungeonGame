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

public class GuiRoom extends JPanel{
	private GameWindow gf;
	private HeroComponent hc;
	private MonstersComponent mc;
	private JButton b;
	private JPanel jp_center;
	private JPanel jp_south;
	private JTextField tf;
	private Player player;
	public GuiRoom(GameWindow gf) {
		this.gf=gf;
		setLayout(new BorderLayout());
		jp_center= new JPanel();
		jp_center.setLayout(new BorderLayout());
		this.add(jp_center,BorderLayout.CENTER);
		jp_center.add(new HeroInfoComponent(gf,gf.getGame().getPlayer().getSelectedHero()));
		jp_south= new JPanel();
		jp_south.setLayout(new BorderLayout());
		this.add(jp_south,BorderLayout.SOUTH);
		jp_south.add(new HeroesRoomComponent(gf,gf.getGame().getHeroes()));
		b=new JButton("leave room");
		b.addMouseListener(new ml());
		this.add(b,BorderLayout.SOUTH);
		setVisible(true);
	}
	private class ml extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			// leave room
			gf.revalidate();
			gf.repaint();
		}
	}
	public HeroComponent getHc() {
		return hc;
	}
	public void setHc(HeroComponent hc) {
		this.hc = hc;
	}
	public MonstersComponent getMc() {
		return mc;
	}
	public void setMc(MonstersComponent mc) {
		this.mc = mc;
	}
	
}
