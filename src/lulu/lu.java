package lulu;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JFrame;

public class lu extends JFrame{
	
	JButton btn1;
		
	public lu() {
		
					super("Título da nossa Janela");
					
					
					Container c = getContentPane();
					
				
					GridLayout grid = new GridLayout(2, 3, 4); 
					c.setLayout(null);
					
					btn1 = new JButton("Botao 1");
					btn1.setBounds(20,40,100,20);
					c.add(btn1);
					
					
					
					
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setSize(300, 300);
					setLocationRelativeTo(null);
				
					setVisible(true); 
	}

	public static void main(String[] args) {
		new janela();

	}

}
