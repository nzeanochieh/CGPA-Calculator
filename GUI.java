package guitinz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Gui extends JFrame{
private JTextField nosAwithThree = new JTextField();
private JTextField nosAwithTwo = new JTextField();
private JTextField nosAwithOne = new JTextField();
private JTextField nosBwithThree = new JTextField();
private JTextField nosBwithTwo = new JTextField();
private JTextField nosBwithOne = new JTextField();
private JTextField nosCwithThree = new JTextField();
private JTextField nosCwithTwo = new JTextField();
private JTextField nosCwithOne = new JTextField();
private JTextField nosDwithThree = new JTextField();
private JTextField nosDwithTwo = new JTextField();
private JTextField nosDwithOne = new JTextField();
private JTextField nosFwithThree = new JTextField();
private JTextField nosFwithTwo = new JTextField();
private JTextField nosFwithOne = new JTextField();
private JTextField cgpa = new JTextField();

private JButton jbtCgpaCompute = new JButton("Compute CGPA");

public Gui(){
	
	JPanel p1 = new JPanel(new GridLayout(10,2));
	p1.add(new JLabel("Enter no of A grades with 3 Credit"));
	p1.add(nosAwithThree);
	 nosAwithThree.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of A grades with 2 Credit") );
	p1.add(nosAwithTwo);
	 nosAwithTwo.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of A grades with 1 Credit"));
	p1.add(nosAwithOne);
	 nosAwithOne.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of B grades with 3 Credit"));
	p1.add(nosBwithThree);
	 nosBwithThree.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of B grades with 2 Credit"));
	p1.add(nosBwithTwo);
	 nosBwithTwo.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of B grades with 1 Credit"));
	p1.add(nosBwithOne);
	 nosBwithOne.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of C grades with 3 Credit"));
	p1.add(nosCwithThree);
	 nosCwithThree.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of C grades with 2 Credit"));
	p1.add(nosCwithTwo);
	 nosCwithTwo.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of C grades with 1 Credit"));
	p1.add(nosCwithOne);
	 nosCwithOne.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of D grades with 3 Credit"));
	p1.add(nosDwithThree);
	 nosDwithThree.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of D grades with 2 Credit"));
	p1.add(nosDwithTwo);
	 nosDwithTwo.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of D grades with 1 Credit"));
	p1.add(nosDwithOne);
	 nosDwithOne.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of F grades with 3 Credit"));
	p1.add(nosFwithThree);
	 nosFwithThree.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of F grades with 2 Credit"));
	p1.add(nosFwithTwo);
	 nosFwithTwo.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(new JLabel("Enter no of F grades with 1 Credit"));
	 nosFwithOne.setFont(new Font("Serif", Font.PLAIN,25));
	p1.add(nosFwithOne);
	p1.add(new JLabel("Your CGPA is"));
    cgpa.setFont(new Font("Serif", Font.PLAIN,47));
	p1.add(cgpa);
	p1.setBorder(new TitledBorder("Enter the number of grade you have in each credit load"));
	p1.setBackground(Color.white);
	JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	p2.add(jbtCgpaCompute);
	p2.setBackground(Color.MAGENTA);
	add(p1, BorderLayout.CENTER);
	add(p2, BorderLayout.SOUTH);
	
	
	
	jbtCgpaCompute.addActionListener(new ButtonListener());	
	
	
}
private class ButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
	int Acd3 = Integer.parseInt(nosAwithThree.getText());
	int Acd2 = Integer.parseInt(nosAwithTwo.getText());
	int Acd1 = Integer.parseInt(nosAwithOne.getText());
	int Bcd3 = Integer.parseInt(nosBwithThree.getText());
	int Bcd2 = Integer.parseInt(nosBwithTwo.getText());
	int Bcd1 = Integer.parseInt(nosBwithOne.getText());
	int Ccd3 = Integer.parseInt(nosCwithThree.getText());
	int Ccd2 = Integer.parseInt(nosCwithTwo.getText());
	int Ccd1 = Integer.parseInt(nosCwithOne.getText());
	int Dcd3 = Integer.parseInt(nosDwithThree.getText());
	int Dcd2 = Integer.parseInt(nosDwithTwo.getText());
	int Dcd1 = Integer.parseInt(nosDwithOne.getText());
	int Fcd3 = Integer.parseInt(nosFwithThree.getText());
	int Fcd2 = Integer.parseInt(nosFwithTwo.getText());
	int Fcd1 = Integer.parseInt(nosFwithOne.getText());
	
	Cal cal = new Cal(Acd3,Acd2,Acd1,Bcd3,Bcd2,Bcd1,Ccd3,Ccd2,Ccd1,Dcd3,Dcd2,Dcd1,Fcd3,Fcd2,Fcd1);
	
	cgpa.setText(String.format("%.2f", cal.getCgpa()));
	
	double message=Double.parseDouble(cgpa.getText());
	if(message>=4.50 && message<=5.00)
		JOptionPane.showMessageDialog(null, "YOU ARE A FIRST CLASS STUDENT");
	else if(message>=3.50 && message<=4.50)
		JOptionPane.showMessageDialog(null, "YOU ARE A SECOND CLASS UPPER STUDENT");
	else if(message>=2.50 && message<=3.50)
		JOptionPane.showMessageDialog(null, "YOU ARE A SECOND CLASS LOWER STUDENT");
	else if(message>=1.50 && message<=2.50)
		JOptionPane.showMessageDialog(null, "YOU ARE A THIRD CLASS STUDENT");
	else
		JOptionPane.showMessageDialog(null, "CHAI ! NWA NNE IDAKWARA COURSE A OH");
	}
}
}


