import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.*;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;

public class GUI {
	
	public static void main(String[] args) {
		 

		SummaryTool summary = new SummaryTool();
		JFrame frame = new JFrame("AUTO SUMMARISATION TOOL");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(300,300);
		
		JButton button1 = new JButton("Add File");
		panel.add(button1);
	     button1.addActionListener(new ActionListener() {
	    	   public void actionPerformed(ActionEvent e)
	            {
	    			JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

	    			int returnValue = jfc.showOpenDialog(null);
	    			// int returnValue = jfc.showSaveDialog(null);

	    			if (returnValue == JFileChooser.APPROVE_OPTION) {
	    				File selectedFile = jfc.getSelectedFile();
	    				summary.path=selectedFile.getAbsolutePath();
	    				System.out.println(selectedFile.getAbsolutePath());
	    			}
	            }
	    	 
	      
	        });
	     JButton button2 = new JButton("Extract Sentence");
			panel.add(button2);
	        button2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e)
	            {
	        		summary.printsentence();
	            }
	        	 
	         
	        });
	    	JButton button3 = new JButton("Stats");
			panel.add(button3);
	        button3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e)
	            {
	        		summary.printstat();
	            }
	        	 
	         
	        });
			
		
		JButton button4 = new JButton("Summarise");
		panel.add(button4);
        button4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
            {
        		summary.printsummary();
            }
        	 
         
        });
	
	}
}
		