import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TheCal {
	
	static JLabel LabelMonth, LabelYear;
	static JButton buttonPrev, buttonNext;
	static JTable tabelCal;
	static JComboBox comboYear;
	static JFrame mainFrame;
	static Container pane;
	static JScrollPane theScrollPane;
	static JPanel panelCal;
	static int Year, Month, Day, currentYear, currentMonth;
	

public static void main (String args[]){
	

	mainFrame = new JFrame ("Yuuugee"); 
	mainFrame.setSize(330, 375); 
	pane = mainFrame.getContentPane();
	pane.setLayout(null); 
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	labelMonth = new JLabel ("January");
	labelYear = new JLabel ("Change year:");
	comboYear = new JComboBox();
	buttonPrev = new JButton ("<<");
	buttonNext = new JButton (">>");
	theScrollPane = new JScrollPane(tabelCalendar);
	panelCal = new JPanel(null);
	
	panelCal.setBorder(BorderFactory.createTitledBorder("Calendar"));
	
	buttonPrev.addActionListener(new buttonPrev_Action());
	buttonNext.addActionListener(new buttonNext_Action());
	comboYear.addActionListener(new comboYear_Action());
	
	pane.add(panelCal);
	panelCal.add(LabelMonth);
	panelCal.add(LabelYear);
	panelCal.add(comboYear);
	panelCal.add(buttonPrev);
	panelCal.add(buttonNext);
	panelCal.add(theScrollPane);
	
	panelCal.setBounds(0, 0, 1920, 1920);
	LabelMonth.setBounds(500, 50, 200, 50);
	LabelYear.setBounds(30, 575, 150, 50);
	comboYear.setBounds(30, 600, 100, 30);
	buttonPrev.setBounds(10, 25, 150, 40);
	buttonNext.setBounds(1090, 25, 150, 40);
	theScrollPane.setBounds(10, 100, 1240, 525);
	
	mainFrame.setResizable(true);
	mainFrame.setVisible(true);
	
	GregorianCalendar cal = new GregorianCalendar(); //Create calendar
	Day = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
	Month = cal.get(GregorianCalendar.MONTH); //Get month
	Year = cal.get(GregorianCalendar.YEAR); //Get year
	currentMonth = Month; //Match month and year
	currentYear = Year;
		
		
	}

}
