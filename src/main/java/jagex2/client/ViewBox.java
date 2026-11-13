package jagex2.client;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JFrame;

import deob.ObfuscatedName;
import sign.signlink;

public class ViewBox extends JFrame {

	@ObfuscatedName("IEJCKZCR.a")
	public GameShell shell;

	public Insets insets;

	public ViewBox(int height, GameShell shell, int width) {
		this.shell = shell;
		this.setTitle("RS2 user client - release #" + signlink.clientversion);
		this.setResizable(true); // rpi0001 patch: resizable + macOS full screen
		this.getRootPane().putClientProperty("apple.awt.fullscreenable", Boolean.TRUE);

		BorderLayout manager = new BorderLayout();
		this.setLayout(manager);

		this.add(shell, BorderLayout.CENTER);
		this.pack();
		this.setMinimumSize(this.getSize());

		this.setVisible(true);
		this.toFront();
	}

	public void update(Graphics g) {
		this.shell.repaint(); // rpi0001 patch: frame graphics include insets; let the shell present itself
	}

	public void paint(Graphics g) {
		this.shell.repaint(); // rpi0001 patch: frame graphics include insets; let the shell present itself
	}
}
