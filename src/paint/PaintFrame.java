
package paint;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PaintFrame{
	
	public static void main(String[] args){

		//#region Describe icons Button
		String icons = "icons/";
		Icon iconSave = new ImageIcon(icons + "sa2.png");
		Icon iconClear = new ImageIcon(icons + "clear.png");
		
		Icon iconB = new ImageIcon(icons + "blue.png");
		Icon iconM = new ImageIcon(icons + "magenta.png");
		Icon iconR = new ImageIcon(icons + "red.png");
		Icon iconBl = new ImageIcon(icons + "black.png");
		Icon iconGn = new ImageIcon(icons + "green.png");
		Icon iconC = new ImageIcon(icons + "cyan.png");
		Icon iconP = new ImageIcon(icons + "pink.png");
		Icon iconO = new ImageIcon(icons + "orange.png");
		Icon iconY = new ImageIcon(icons + "yellow.png");
		Icon iconGy = new ImageIcon(icons + "gray.png");
		Icon iconW= new ImageIcon(icons + "white.png");
		
		Icon er= new ImageIcon(icons + "e.png");
		Icon iconLine= new ImageIcon(icons + "line.png");
		Icon iconLine1= new ImageIcon(icons + "1.png");
		Icon iconLine2= new ImageIcon(icons + "2.png");
		Icon iconLine3= new ImageIcon(icons + "3.png");
		Icon iconLine4= new ImageIcon(icons + "4.png");
		
		
		Icon iconPen= new ImageIcon(icons + "pen.png");
		Icon iconRec= new ImageIcon(icons + "rec.png");
		Icon iconTri= new ImageIcon(icons + "tria.png");
		Icon iconCir= new ImageIcon(icons + "cir.png");
		//#endregion

		// Create window of App
		JFrame frame = new JFrame("Paint App");
		
		// Main Holder of tools
		Container content = frame.getContentPane();
		content.setLayout(new BorderLayout());
		
		// operation class
		final PadDrew drawPad = new PadDrew();
		
		content.add(drawPad, BorderLayout.CENTER);
		
		//#region "describe holder"

		// left holder tools box
		JPanel tools = new JPanel();
		tools.setPreferredSize(new Dimension(100, 120));
		tools.setMinimumSize(new Dimension(100, 120));
		tools.setMaximumSize(new Dimension(100, 120));
		
		// right holder for line button
		JPanel right= new JPanel();
		right.setPreferredSize(new Dimension(100, 120));
		right.setMinimumSize(new Dimension(100, 120));
		right.setMaximumSize(new Dimension(100, 120));
		
		// up holder for textBox 
		JPanel up= new JPanel();
		right.setPreferredSize(new Dimension(100, 120));
		right.setMinimumSize(new Dimension(100, 120));
		right.setMaximumSize(new Dimension(100, 120));
		
		// botton holder 
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 120));
		panel.setMinimumSize(new Dimension(100, 120));
		panel.setMaximumSize(new Dimension(100, 120));
		//#endregion

		//#region "Tools button"

		// 1.
		JButton save= new JButton(iconSave);
		save.setPreferredSize(new Dimension(170,60));
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.save();
			}

		});
		
		
		// 2.
		JButton penButton = new JButton(iconPen);
		penButton.setPreferredSize(new Dimension(170,60));
		penButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			drawPad.pen();
			}
		});
		

		// 3.
		JButton lineButton = new JButton(iconLine);
		lineButton.setPreferredSize(new Dimension(170,60));
		lineButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.line();
			}
		});
		
		
		// 4.
		JButton recButton = new JButton(iconRec);
		recButton.setPreferredSize(new Dimension(170,60));
		recButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.rec();
			}

		});
		
		// 5.
		JButton cirButton = new JButton(iconCir);
		cirButton.setPreferredSize(new Dimension(170,60));
		cirButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.oval();
			}

		});
		
		// 6.
		JButton triButton = new JButton(iconTri);
		triButton.setPreferredSize(new Dimension(170,60));
		triButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.triangle();
			}

		});
		
		// 7.
		JButton e = new JButton(er);
		e.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.eraser();
			}
		});
		
		// 8.
		JButton clearButton = new JButton(iconClear);
		clearButton.setPreferredSize(new Dimension(170, 60));
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.clear();
			}
		});
		
		// 9.
		JButton line1Button = new JButton(iconLine1);
		line1Button.setPreferredSize(new Dimension(170,60));
		line1Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.sizeLine(1);
			}
		});

		// 10.
		JButton line2Button = new JButton(iconLine2);
		line2Button.setPreferredSize(new Dimension(170,60));
		line2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.sizeLine(2);
			}
		});

		// 11.
		JButton line3Button = new JButton(iconLine3);
		line3Button.setPreferredSize(new Dimension(170,60));
		line3Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.sizeLine(3);
			}
		});

		// 12.
		JButton line4Button = new JButton(iconLine4);
		line4Button.setPreferredSize(new Dimension(170,60));
		line4Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.sizeLine(4);
			}
		});
		
		// get list of fonts
		String fonts[] = 
				GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		// set fonts to comboBox
		JComboBox<String> texts = new JComboBox<String>(fonts);

		// list of font size
		String sizes[] = { "8", "9", "10", "11", "12", "14", "16", "18","20","22","24","26","28","36","48","72"};

		// set font size
		JComboBox<String> sz = new JComboBox<String>(sizes);
		// text box
		JTextField main=new JTextField();

		texts.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String font=texts.getSelectedItem().toString();
				drawPad.ffont(font);
			}
		});
		
		sz.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=sz.getSelectedItem().toString();
				drawPad.size(Integer.parseInt(s));
			}
		});
		
		main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=main.getText();
				drawPad.text(s);
			}
		});

		//#endregion
		
		//#region color button
		
		// 1.
		JButton redButton = new JButton(iconR);
		redButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.red();
			}
		});
		
		// 2.
		JButton whiteButton = new JButton(iconW);
		whiteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.white();
			}
		});
		
		// 3.
		JButton blackButton = new JButton(iconBl);
		blackButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.black();
			}
		});
		
		// 4.
		JButton magentaButton = new JButton(iconM);
		magentaButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.magenta();
			}
		});
		
		// 5.
		JButton blueButton = new JButton(iconB);
		blueButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.blue();
			}
		});
		
		// 6.
		JButton greenButton = new JButton(iconGn);
		greenButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.green();
			}
		});
		
		// 7.
		JButton grayButton = new JButton(iconGy);
		grayButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.gray();
			}
		});
		
		// 8.
		JButton yellowButton = new JButton(iconY);
		yellowButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.yellow();
			}
		});
		
		// 9.
		JButton orangeButton = new JButton(iconO);
		orangeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.orange();
			}
		});
		
		// 10.
		JButton pinkButton = new JButton(iconP);
		pinkButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.pink();
			}
		});
		
		// 11.
		JButton cyanButton = new JButton(iconC);
		cyanButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.cyan();
			}
		});
		//#endregion

		//#region set size Buttons

		save.setPreferredSize(new Dimension(90, 73));
		
		blackButton.setPreferredSize(new Dimension(50, 60));
		magentaButton.setPreferredSize(new Dimension(50, 60));
		redButton.setPreferredSize(new Dimension(50, 60));
		blueButton.setPreferredSize(new Dimension(50, 60));
		greenButton.setPreferredSize(new Dimension(50,60));
		pinkButton.setPreferredSize(new Dimension(50, 60));
		cyanButton.setPreferredSize(new Dimension(50, 60));
		whiteButton.setPreferredSize(new Dimension(50, 60));
		grayButton.setPreferredSize(new Dimension(50, 60));
		yellowButton.setPreferredSize(new Dimension(50, 60));
		orangeButton.setPreferredSize(new Dimension(50,60));
		
		e.setPreferredSize(new Dimension(80,60));
		penButton.setPreferredSize(new Dimension(80,60));
		lineButton.setPreferredSize(new Dimension(80,60));
		recButton.setPreferredSize(new Dimension(80,60));
		triButton.setPreferredSize(new Dimension(80,60));
		cirButton.setPreferredSize(new Dimension(80,60));
		clearButton.setPreferredSize(new Dimension(80, 60));
		
		line1Button.setPreferredSize(new Dimension(120,60));
		line2Button.setPreferredSize(new Dimension(120,60));
		line3Button.setPreferredSize(new Dimension(120,60));
		line4Button.setPreferredSize(new Dimension(120,60));
		main.setPreferredSize(new Dimension(200,50));
		texts.setPreferredSize(new Dimension(150,30));
		sz.setPreferredSize(new Dimension(100,30));
		//#endregion

		//#region Add buttons to Panels

		up.add(texts);
		up.add(sz);
		up.add(main);
		
		right.add(line1Button);
		right.add(line2Button);
		right.add(line3Button);
		right.add(line4Button);
	
		tools.add(save);	
		tools.add(penButton);
		tools.add(lineButton);
		tools.add(recButton);
		tools.add(cirButton);
		tools.add(triButton);
		tools.add(e);
		tools.add(clearButton);
		
		panel.add(blackButton);
		panel.add(grayButton);
		panel.add(greenButton);
		panel.add(blueButton);
		panel.add(magentaButton);
		panel.add(redButton);
		panel.add(orangeButton);
		panel.add(pinkButton);
		panel.add(cyanButton);
		panel.add(yellowButton);
		panel.add(whiteButton);
		//#endregion

		//#region Add Panel to Main Holder

		content.add(up, BorderLayout.NORTH);
		content.add(right, BorderLayout.EAST);
		content.add(tools, BorderLayout.WEST);
		content.add(panel, BorderLayout.SOUTH);
		//#endregion
		
		frame.setSize(1700, 1700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

