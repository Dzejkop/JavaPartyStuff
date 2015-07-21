package com.invisi.snake.InvisiSnake3;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class App extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7480605814792718028L;

	public App() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            public void run() {
                App ex = new App();
                ex.setVisible(true);
            }
        });
    }
}