package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import game.Game;

public class GameWindow extends JFrame{
	private Game game;
	private GuiFight guiFight;
	public GameWindow(Game game) {
		this.game=game;
		this.setVisible(true);
		this.setSize(1300, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		if(this.game.getRoom().getFight()!=null) {
			add(new GuiFight(this),BorderLayout.CENTER);
		}
		setLocation(10, 10);
		
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
}
