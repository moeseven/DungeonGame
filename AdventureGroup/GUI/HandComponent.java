package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import gameEncounter.Card;

public class HandComponent extends JComponent{
//	private LinkedList<Card> hand;
	private JPanel jp;
	private JScrollPane sp;
	private GameWindow gf;
	public HandComponent(GameWindow gf){
		this.gf=gf;
		setBorder(new LineBorder(Color.YELLOW));		
		//hand= this.gf.getGame().getPlayer().getSelectedHero().getHand();
		jp=new JPanel();
		jp.setLayout(new GridLayout());
		for (int i=0;i<this.gf.getGame().getPlayer().getSelectedHero().getHand().size();i++){
			jp.add(new CardComponent(this.gf,this.gf.getGame().getPlayer().getSelectedHero().getHand().get(i)));
		}
		sp= new JScrollPane(jp);
		add(sp);
		this.setVisible(true);
	}
}

