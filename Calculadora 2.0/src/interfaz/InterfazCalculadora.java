package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfazCalculadora extends JFrame implements ActionListener
{	
	JPanel panel1 = new JPanel();
	JTextField campoOperaciones = new JTextField();
	JButton botonSumar = new JButton("+");
	JButton botonRestar = new JButton("-");
	JButton botonMultiplicar = new JButton("*");
	JButton botonDivision = new JButton("/");
	JButton num0 = new JButton("0");
	JButton num1 = new JButton("1");
	JButton num2 = new JButton("2");
	JButton num3 = new JButton("3");
	JButton num4 = new JButton("4");
	JButton num5 = new JButton("5");
	JButton num6 = new JButton("6");
	JButton num7 = new JButton("7");
	JButton num8 = new JButton("8");
	JButton num9 = new JButton("9");
	JButton igual = new JButton("=");
	JButton borrar = new JButton("C");
	JButton punto = new JButton(".");
	JButton nya = new JButton("UwU");
	
	public InterfazCalculadora()
	{
		FondoPanel fondo = new FondoPanel();
		this.setContentPane(fondo);
		
		setTitle("Calculadora 2.0");
		setSize(316,400);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);	
		
		campoOperaciones.setBounds(0, 0, 300, 50);
		campoOperaciones.setForeground(Color.WHITE);
		campoOperaciones.setBackground(Color.GRAY);
		campoOperaciones.setFont(new Font("Arial", Font.BOLD, 20));
		add(campoOperaciones);
		
		botonSumar.setBounds(0, 200, 50, 50);
		botonSumar.setForeground(Color.WHITE);
		botonSumar.setBackground(Color.GRAY); 
		botonSumar.setFont(new Font("Arial", Font.BOLD, 20));
		add(botonSumar);
		botonSumar.addActionListener(this);
		
		botonRestar.setBounds(50, 200, 50, 50);
		botonRestar.setForeground(Color.WHITE);
		botonRestar.setBackground(Color.GRAY); 
		botonRestar.setFont(new Font("Arial", Font.BOLD, 20));
		add(botonRestar);
		botonRestar.addActionListener(this);
		
		botonMultiplicar.setBounds(100, 200, 50, 50);
		botonMultiplicar.setForeground(Color.WHITE);
		botonMultiplicar.setBackground(Color.GRAY); 
		botonMultiplicar.setFont(new Font("Arial", Font.BOLD, 20));
		add(botonMultiplicar);
		botonMultiplicar.addActionListener(this);
		
		botonDivision.setBounds(150, 200, 50, 50);
		botonDivision.setForeground(Color.WHITE);
		botonDivision.setBackground(Color.GRAY); 
		botonDivision.setFont(new Font("Arial", Font.BOLD, 20));
		add(botonDivision);
		botonDivision.addActionListener(this);
		
		borrar.setBounds(200, 200, 50, 50);
		borrar.setForeground(Color.WHITE);
		borrar.setBackground(Color.GRAY); 
		borrar.setFont(new Font("Arial", Font.BOLD, 20));
		add(borrar);
		borrar.addActionListener(this);
		
		igual.setBounds(250, 200, 50, 50);
		igual.setForeground(Color.WHITE);
		igual.setBackground(Color.GRAY); 
		igual.setFont(new Font("Arial", Font.BOLD, 20));
		add(igual);
		igual.addActionListener(this);
		
		num0.setBounds(0, 250, 50, 50);
		num0.setForeground(Color.WHITE);
		num0.setBackground(Color.GRAY); 
		num0.setFont(new Font("Arial", Font.BOLD, 20));
		add(num0);
		num0.addActionListener(this);
		
		num1.setBounds(50, 250, 50, 50);
		num1.setForeground(Color.WHITE);
		num1.setBackground(Color.GRAY); 
		num1.setFont(new Font("Arial", Font.BOLD, 20));
		add(num1);
		num1.addActionListener(this);
		
		num2.setBounds(100, 250, 50, 50);
		num2.setForeground(Color.WHITE);
		num2.setBackground(Color.GRAY); 
		num2.setFont(new Font("Arial", Font.BOLD, 20));
		add(num2);
		num2.addActionListener(this);
		
		num3.setBounds(150, 250, 50, 50);
		num3.setForeground(Color.WHITE);
		num3.setBackground(Color.GRAY); 
		num3.setFont(new Font("Arial", Font.BOLD, 20));
		add(num3);
		num3.addActionListener(this);
		
		num4.setBounds(200, 250, 50, 50);
		num4.setForeground(Color.WHITE);
		num4.setBackground(Color.GRAY); 
		num4.setFont(new Font("Arial", Font.BOLD, 20));
		add(num4);
		num4.addActionListener(this);
		
		num5.setBounds(250, 250, 50, 50);
		num5.setForeground(Color.WHITE);
		num5.setBackground(Color.GRAY); 
		num5.setFont(new Font("Arial", Font.BOLD, 20));
		add(num5);
		num5.addActionListener(this);
		
		num6.setBounds(0, 300, 50, 50);
		num6.setForeground(Color.WHITE);
		num6.setBackground(Color.GRAY); 
		num6.setFont(new Font("Arial", Font.BOLD, 20));
		add(num6);
		num6.addActionListener(this);
		
		num7.setBounds(50, 300, 50, 50);
		num7.setForeground(Color.WHITE);
		num7.setBackground(Color.GRAY); 
		num7.setFont(new Font("Arial", Font.BOLD, 20));
		add(num7);
		num7.addActionListener(this);
		
		num8.setBounds(100, 300, 50, 50);
		num8.setForeground(Color.WHITE);
		num8.setBackground(Color.GRAY); 
		num8.setFont(new Font("Arial", Font.BOLD, 20));
		add(num8);
		num8.addActionListener(this);
		
		num9.setBounds(150, 300, 50, 50);
		num9.setForeground(Color.WHITE);
		num9.setBackground(Color.GRAY); 
		num9.setFont(new Font("Arial", Font.BOLD, 20));
		add(num9);
		num9.addActionListener(this);
		
		punto.setBounds(200, 300, 50, 50);
		punto.setForeground(Color.WHITE);
		punto.setBackground(Color.GRAY); 
		punto.setFont(new Font("Arial", Font.BOLD, 20));
		add(punto);
		punto.addActionListener(this);
		
		nya.setBounds(250, 300, 50, 50);
		nya.setForeground(Color.WHITE);
		nya.setBackground(Color.GRAY); 
		nya.setFont(new Font("Arial", Font.BOLD, 20));
		add(nya);
		nya.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent accion) 
	{
		if(accion.getSource() == botonSumar)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("+");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "+");
			}
		}
		
		if(accion.getSource() == botonRestar)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("-");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "-");
			}
		}
		
		if(accion.getSource() == botonMultiplicar)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("*");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "*");
			}
		}
		
		if(accion.getSource() == botonDivision)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("/");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "/");
			}
		}
		
		if(accion.getSource() == num0)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("0");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "0");
			}
		}
		
		if(accion.getSource() == num1)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("1");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "1");
			}
		}
		
		if(accion.getSource() == num2)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("2");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "2");
			}
		}
		
		if(accion.getSource() == num3)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("3");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "3");
			}
		}
		
		if(accion.getSource() == num4)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("4");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "4");
			}
		}
		
		if(accion.getSource() == num5)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("5");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "5");
			}
		}
		
		if(accion.getSource() == num6)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("6");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "6");
			}
		}
		
		if(accion.getSource() == num7)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("7");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "7");
			}
		}
		
		if(accion.getSource() == num8)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("8");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "8");
			}
		}
		
		if(accion.getSource() == num9)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("9");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "9");
			}
		}
		
		if(accion.getSource() == punto)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText(".");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + ".");
			}
		}
		
		if(accion.getSource() == nya)
		{
			if(campoOperaciones.getText() == "")
			{
				campoOperaciones.setText("UwU");
			}
			else 
			{
				campoOperaciones.setText(campoOperaciones.getText() + "UwU");
			}
		}
		
		if(accion.getSource() == borrar)
		{
			campoOperaciones.setText("");
		}
		
		if(accion.getSource() == igual)
		{
			String loquehay = campoOperaciones.getText();
			
			for(int i = 0; i < loquehay.length(); i++)
			{
				char caracter = loquehay.charAt(i);
				
				if (caracter == '+')
				{
					String primeraParte = loquehay.substring(0,i);
					String segundaParte = loquehay.substring(i+1,loquehay.length());
					
					double resultado = Double.parseDouble(primeraParte) + Double.parseDouble(segundaParte);
					
					campoOperaciones.setText(Double.toString(resultado));
				}
				
				if (caracter == '-')
				{
					String primeraParte = loquehay.substring(0,i);
					String segundaParte = loquehay.substring(i+1,loquehay.length());
					
					double resultado = Double.parseDouble(primeraParte) - Double.parseDouble(segundaParte);
					
					campoOperaciones.setText(Double.toString(resultado));
				}
				
				if (caracter == '*')
				{
					String primeraParte = loquehay.substring(0,i);
					String segundaParte = loquehay.substring(i+1,loquehay.length());
					
					double resultado = Double.parseDouble(primeraParte) * Double.parseDouble(segundaParte);
					
					campoOperaciones.setText(Double.toString(resultado));
				}
				
				if (caracter == '/')
				{
					String primeraParte = loquehay.substring(0,i);
					String segundaParte = loquehay.substring(i+1,loquehay.length());

					double cero = Double.parseDouble(segundaParte);
					if(cero == 0)
					{
						campoOperaciones.setText("No se puede nea >:D");
						JOptionPane.showMessageDialog(null, "No se puede dividir entre cero >:D");
					}
					else
					{
						double resultado = Double.parseDouble(primeraParte) / Double.parseDouble(segundaParte);
						
						campoOperaciones.setText(Double.toString(resultado));
					}

				}
			}
		}
	}


	class FondoPanel extends JPanel
	{
		private Image imagen;
		
		@Override
		public void paint(Graphics a)
		{
			imagen = new ImageIcon(getClass().getResource("/data/newfondo.jpg")).getImage();
			
			a.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			
			setOpaque(false);
			
			super.paint(a);
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		InterfazCalculadora pantalla = new InterfazCalculadora();
		pantalla.setVisible(true);

	}

}
