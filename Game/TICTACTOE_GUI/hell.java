package TICTACTOE_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class hell extends JFrame {

	private JPanel contentPane;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSTART,btnEXIT;
	private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl40,lbl41,lbl42,lbl50 ;
	private int x=0,p1=0,p2=0;
	private JLabel lbl11,lbl12,lbl13,lbl14,lbl15,lbl16,lbl17,lbl18,lbl19;
	private JLabel lbl51;
	private JLabel lbl52;
	//
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hell frame = new hell();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hell() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btn2 = new JButton("");
		 btn2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		if(x%2==0){
					lbl2.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
		 		
				else{
					lbl12.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
		 		p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
		 		if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				
				btn2.setVisible(false);
				x++;
		 	}
		 });
		 btn2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		 btn2.setVisible(false);
		 btn2.setBounds(187, 55, 61, 56);
		contentPane.setLayout(null);
		contentPane.add(btn2);
		
		btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn8.setVisible(false);
		
		btn8.setBounds(187, 189, 61, 56);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x%2==0){
					lbl8.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
				
				else{
					lbl18.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				btn8.setVisible(false);
				x++;
				
			}
		});
		contentPane.add(btn8);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x%2==0){
					lbl7.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
				
		 		
				else{
					lbl17.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
					
				
				
				btn7.setVisible(false);
				x++;
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn7.setVisible(false);
		btn7.setBounds(116, 189, 61, 56);
		contentPane.add(btn7);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x%2==0){
					lbl9.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
				
				else{
					lbl19.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				
				btn9.setVisible(false);
				x++;
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn9.setVisible(false);
		btn9.setBounds(258, 189, 61, 56);
		contentPane.add(btn9);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x%2==0){
					lbl6.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
			
				else{
					lbl16.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				
				btn6.setVisible(false);
				x++;
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn6.setVisible(false);
		btn6.setBounds(258, 122, 61, 56);
		contentPane.add(btn6);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x%2==0){
					lbl3.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
				
				else{
					lbl13.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				
				
				btn3.setVisible(false);
				x++;
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn3.setVisible(false);
		btn3.setBounds(258, 55, 61, 56);
		contentPane.add(btn3);
		
		btn4 = new JButton("\r\n");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x%2==0){
					lbl4.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
				
				else{
					lbl14.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				
				btn4.setVisible(false);
				x++;
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn4.setVisible(false);
		btn4.setBounds(116, 122, 61, 56);
		contentPane.add(btn4);
		
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(x%2==0){
					lbl1.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
				
				
				else{
					lbl11.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				btn1.setVisible(false);
				x++;
			}
		});
		btn1.setVisible(false);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn1.setBounds(116, 55, 61, 56);
		contentPane.add(btn1);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x%2==0){
					lbl5.setVisible(true);
					lbl42.setVisible(true);
					lbl41.setVisible(false);
				}
				
				else{
					lbl15.setVisible(true);
					lbl41.setVisible(true);
					lbl42.setVisible(false);
				}
				p1=check1();
				p2=check2();
				if(p1==1){
					player1win();
				}
				else if(p2==1){
					player2win();
				}
				else if(p1==0&&p2==0&&x==8){
					matchdrawn();
				}
				if(x==8){
					lbl42.setVisible(false);
					lbl41.setVisible(false);
				}
				
				btn5.setVisible(false);
				x++;
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn5.setVisible(false);
		btn5.setBounds(187, 122, 61, 56);
		contentPane.add(btn5);
		
		btnSTART = new JButton("NEW GAME\r\n");
		btnSTART.setForeground(Color.MAGENTA);
		btnSTART.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1=0;
				p2=0;
				x=0;
				btn1.setVisible(true);
				btn2.setVisible(true);
				btn3.setVisible(true);
				btn4.setVisible(true);
				btn5.setVisible(true);
				btn6.setVisible(true);
				btn7.setVisible(true);
				btn8.setVisible(true);
				btn9.setVisible(true);
				btnSTART.setVisible(false);
				lbl40.setVisible(false);
				lbl41.setVisible(true);
				lbl42.setVisible(false);
				lbl52.setVisible(false);
				lbl50.setVisible(false);
				lbl51.setVisible(false);
				
				
				
				
			}
		});
		btnSTART.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSTART.setBounds(142, 255, 143, 33);
		contentPane.add(btnSTART);
		
		lbl40 = new JLabel("TICTACTOE");
		lbl40.setFont(new Font("Tahoma", Font.BOLD, 40));
		lbl40.setBounds(95, 11, 242, 40);
		contentPane.add(lbl40);
		
		lbl41 = new JLabel("PLAYER 1 TURN\r\n");
		lbl41.setVisible(false);
		lbl41.setForeground(Color.ORANGE);
		lbl41.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl41.setBounds(21, 11, 170, 24);
		contentPane.add(lbl41);
		
		lbl42 = new JLabel("PLAYER 2 TURN");
		lbl42.setVisible(false);
		lbl42.setForeground(Color.GREEN);
		lbl42.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl42.setBounds(21, 11, 170, 24);
		contentPane.add(lbl42);
		
		lbl1 = new JLabel("1");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setVisible(false);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl1.setBounds(116, 55, 61, 56);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("1");
		lbl2.setForeground(Color.ORANGE);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl2.setVisible(false);
		lbl2.setBounds(187, 55, 61, 56);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("1");
		lbl3.setForeground(Color.ORANGE);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl3.setVisible(false);
		lbl3.setBounds(258, 55, 61, 56);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("1");
		lbl4.setForeground(Color.ORANGE);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl4.setVisible(false);
		lbl4.setBounds(116, 122, 61, 56);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("1");
		lbl5.setForeground(Color.ORANGE);
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl5.setVisible(false);
		lbl5.setBounds(187, 122, 61, 56);
		contentPane.add(lbl5);
		
		lbl6 = new JLabel("1");
		lbl6.setForeground(Color.ORANGE);
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl6.setVisible(false);
		lbl6.setBounds(258, 122, 61, 56);
		contentPane.add(lbl6);
		
		lbl7 = new JLabel("1");
		lbl7.setForeground(Color.ORANGE);
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl7.setVisible(false);
		lbl7.setBounds(116, 189, 61, 56);
		contentPane.add(lbl7);
		
		lbl8 = new JLabel("1");
		lbl8.setForeground(Color.ORANGE);
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl8.setVisible(false);
		lbl8.setBounds(187, 189, 61, 56);
		contentPane.add(lbl8);
		
		lbl9 = new JLabel("1");
		lbl9.setForeground(Color.ORANGE);
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl9.setVisible(false);
		lbl9.setBounds(258, 189, 61, 56);
		contentPane.add(lbl9);
		
		lbl11 = new JLabel("0");
		lbl11.setForeground(Color.GREEN);
		lbl11.setVisible(false);
		lbl11.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setBounds(116, 55, 61, 56);
		contentPane.add(lbl11);
		
		lbl12 = new JLabel("0");
		lbl12.setForeground(Color.GREEN);
		lbl12.setVisible(false);
		lbl12.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setBounds(187, 55, 61, 56);
		contentPane.add(lbl12);
		
		lbl13 = new JLabel("0");
		lbl13.setForeground(Color.GREEN);
		lbl13.setVisible(false);
		lbl13.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setBounds(258, 55, 61, 56);
		contentPane.add(lbl13);
		
		lbl14 = new JLabel("0");
		lbl14.setForeground(Color.GREEN);
		lbl14.setVisible(false);
		lbl14.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setBounds(116, 122, 61, 56);
		contentPane.add(lbl14);
		
		lbl15 = new JLabel("0");
		lbl15.setForeground(Color.GREEN);
		lbl15.setVisible(false);
		lbl15.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setBounds(187, 122, 61, 56);
		contentPane.add(lbl15);
		
		lbl16 = new JLabel("0");
		lbl16.setForeground(Color.GREEN);
		lbl16.setVisible(false);
		lbl16.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setBounds(258, 122, 61, 56);
		contentPane.add(lbl16);
		
		lbl17 = new JLabel("0");
		lbl17.setForeground(Color.GREEN);
		lbl17.setVisible(false);
		lbl17.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setBounds(116, 189, 61, 56);
		contentPane.add(lbl17);
		
		lbl18 = new JLabel("0");
		lbl18.setForeground(Color.GREEN);
		lbl18.setVisible(false);
		lbl18.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl18.setBounds(187, 189, 61, 56);
		contentPane.add(lbl18);
		
		lbl19 = new JLabel("0");
		lbl19.setForeground(Color.GREEN);
		lbl19.setVisible(false);
		lbl19.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl19.setBounds(258, 189, 61, 56);
		contentPane.add(lbl19);
		
		 lbl50 = new JLabel("PLAYER 1 WINS");
		 lbl50.setForeground(Color.ORANGE);
		 lbl50.setVisible(false);
		lbl50.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl50.setHorizontalAlignment(SwingConstants.CENTER);
		lbl50.setBounds(21, 62, 391, 78);
		contentPane.add(lbl50);
		
		lbl51 = new JLabel("PLAYER 2 WINS\r\n");
		lbl51.setForeground(Color.GREEN);
		lbl51.setVisible(false);
		lbl51.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl51.setHorizontalAlignment(SwingConstants.CENTER);
		lbl51.setBounds(21, 62, 391, 78);
		contentPane.add(lbl51);
		
		btnEXIT = new JButton("EXIT");
		btnEXIT.setVisible(false);
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEXIT.setForeground(Color.RED);
		btnEXIT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEXIT.setBounds(323, 255, 89, 30);
		contentPane.add(btnEXIT);
		
		lbl52 = new JLabel("MATCH DRAWN");
		lbl52.setVisible(false);
		lbl52.setForeground(Color.RED);
		lbl52.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl52.setHorizontalAlignment(SwingConstants.CENTER);
		lbl52.setBounds(21, 62, 391, 78);
		contentPane.add(lbl52);
	}
	public int check1(){
		if((lbl1.isVisible()&&lbl4.isVisible()&&lbl7.isVisible())||(lbl1.isVisible()&&lbl2.isVisible()
		&&lbl3.isVisible())||(lbl4.isVisible()&&lbl5.isVisible()&&lbl6.isVisible())||(lbl7.isVisible()
		&&lbl8.isVisible()&&lbl9.isVisible())||(lbl2.isVisible()&&lbl5.isVisible()&&lbl8.isVisible())
		||(lbl3.isVisible()&&lbl6.isVisible()&&lbl9.isVisible())||(lbl1.isVisible()&&lbl5.isVisible()
		&&lbl9.isVisible())||(lbl3.isVisible()&&lbl5.isVisible()&&lbl7.isVisible()))
		{
			return 1;
		}
		else{
			return 0;
		}
		
	}
	public int check2(){
		if((lbl11.isVisible()&&lbl14.isVisible()&&lbl17.isVisible())||(lbl11.isVisible()&&lbl12.isVisible()
		&&lbl13.isVisible())||(lbl14.isVisible()&&lbl15.isVisible()&&lbl16.isVisible())||(lbl17.isVisible()
		&&lbl18.isVisible()&&lbl19.isVisible())||(lbl12.isVisible()&&lbl15.isVisible()&&lbl18.isVisible())
		||(lbl13.isVisible()&&lbl16.isVisible()&&lbl19.isVisible())||(lbl11.isVisible()&&lbl15.isVisible()
		&&lbl19.isVisible())||(lbl13.isVisible()&&lbl15.isVisible()&&lbl17.isVisible()))
		{
			return 1;
		}
		else{
			return 0;
		}
	}
	public void player1win(){
		lbl1.setVisible(false);
		lbl2.setVisible(false);
		lbl3.setVisible(false);
		lbl4.setVisible(false);
		lbl5.setVisible(false);
		lbl6.setVisible(false);
		lbl7.setVisible(false);
		lbl8.setVisible(false);
		lbl9.setVisible(false);
		lbl11.setVisible(false);
		lbl12.setVisible(false);
		lbl13.setVisible(false);
		lbl14.setVisible(false);
		lbl15.setVisible(false);
		lbl16.setVisible(false);
		lbl17.setVisible(false);
		lbl18.setVisible(false);
		lbl19.setVisible(false);
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		btn4.setVisible(false);
		btn5.setVisible(false);
		btn6.setVisible(false);
		btn7.setVisible(false);
		btn8.setVisible(false);
		btn9.setVisible(false);
		btnEXIT.setVisible(true);
		btnSTART.setVisible(true);
		lbl50.setVisible(true);
		lbl42.setVisible(false);
		lbl41.setVisible(false);
	}
	public void player2win(){
		lbl1.setVisible(false);
		lbl2.setVisible(false);
		lbl3.setVisible(false);
		lbl4.setVisible(false);
		lbl5.setVisible(false);
		lbl6.setVisible(false);
		lbl7.setVisible(false);
		lbl8.setVisible(false);
		lbl9.setVisible(false);
		lbl11.setVisible(false);
		lbl12.setVisible(false);
		lbl13.setVisible(false);
		lbl14.setVisible(false);
		lbl15.setVisible(false);
		lbl16.setVisible(false);
		lbl17.setVisible(false);
		lbl18.setVisible(false);
		lbl19.setVisible(false);
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		btn4.setVisible(false);
		btn5.setVisible(false);
		btn6.setVisible(false);
		btn7.setVisible(false);
		btn8.setVisible(false);
		btn9.setVisible(false);
		btnEXIT.setVisible(true);
		btnSTART.setVisible(true);
		lbl51.setVisible(true);
		lbl42.setVisible(false);
		lbl41.setVisible(false);
	}
	public void matchdrawn(){
		lbl1.setVisible(false);
		lbl2.setVisible(false);
		lbl3.setVisible(false);
		lbl4.setVisible(false);
		lbl5.setVisible(false);
		lbl6.setVisible(false);
		lbl7.setVisible(false);
		lbl8.setVisible(false);
		lbl9.setVisible(false);
		lbl11.setVisible(false);
		lbl12.setVisible(false);
		lbl13.setVisible(false);
		lbl14.setVisible(false);
		lbl15.setVisible(false);
		lbl16.setVisible(false);
		lbl17.setVisible(false);
		lbl18.setVisible(false);
		lbl19.setVisible(false);
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		btn4.setVisible(false);
		btn5.setVisible(false);
		btn6.setVisible(false);
		btn7.setVisible(false);
		btn8.setVisible(false);
		btn9.setVisible(false);
		btnEXIT.setVisible(true);
		btnSTART.setVisible(true);
		lbl52.setVisible(true);
		lbl42.setVisible(false);
		lbl41.setVisible(false);
	}
		
	}
