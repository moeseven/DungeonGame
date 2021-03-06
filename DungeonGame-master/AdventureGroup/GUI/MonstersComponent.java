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
import gameEncounter.Hero;

public class MonstersComponent extends JComponent{
	private LinkedList<Hero> monsters;
	private JPanel jp;
	private JScrollPane sp;
	private GameWindow gf;
	public MonstersComponent(GameWindow gf){
		this.gf=gf;
		setBorder(new LineBorder(Color.RED));
		setLayout(new GridLayout());
		this.monsters= gf.getGame().getRoom().getFight().getMonsters();
		jp=new JPanel();
		for (int i=0;i<monsters.size();i++){
			jp.add(new MonsterComponent(gf,monsters.get(i)));
		}
		sp= new JScrollPane(jp);
		add(sp,BorderLayout.CENTER);
	}
}

