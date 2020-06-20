/**
 * @name        Simple Java Calculator
 * @file        UI.java
 * @author      SORIA Pierre-Henry
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;


import java.io.*;

public class UI implements ActionListener {
   /**This is a frame.*/
   private final JFrame frame;
   /**This is a panel.*/
   private final JPanel panel;
   /**This is a sub-panel #1.*/
   private final JPanel panelSub1;
   /**This is a sub-panel #2.*/
   private final JPanel panelSub2;
   /**This is a sub-panel #3.*/
   private final JPanel panelSub3;
   /**This is a sub-panel #4.*/
   private final JPanel panelSub4;
   /**This is a sub-panel #5.*/
   private final JPanel panelSub5;
   /**This is a sub-panel #6.*/
   private final JPanel panelSub6;
   /**This is a sub-panel #7.*/
   private final JPanel panelSub7;
   /**This is a sub-panel #8.*/
   private final JPanel panelSub8;
   /**This is text area.*/
   private final JTextArea text;
   /**This is a list of buttons.*/
   private final JButton[] but;
   /**This is an add button.*/
   private final JButton butAdd;
   /**This is a minus button.*/
   private final JButton butMinus;
   /**This is a multiply button.*/
   private final JButton butMultiply;
   /**This is a divide button.*/
   private final JButton butDivide;
   /**This is an equal button.*/
   private final JButton butEqual;
   /**This is a cancel button.*/
   private final JButton butCancel;
   /**This is a square root button.*/
   private final JButton butSquareRoot;
   /**This is a square button.*/
   private final JButton butSquare;
   /**This is an inverse button.*/
   private final JButton butOneDevidedBy;
   /**This is a cosine button.*/
   private final JButton butCos;
   /**This is a sine button.*/
   private final JButton butSin;
   /**This is a tan button.*/
   private final JButton butTan;
   /**This is a to the power of button.*/
   private final JButton butxpowerofy;
   /**This is a log button.*/
   private final JButton butlog;
   /**This is a rate button.*/
   private final JButton butrate;
   /**This is an absolute value button.*/
   private final JButton butabs;
   /**This is a binary button.*/
   private final JButton butBinary;
   /**This is a calculator.*/
   private final Calculator calc;
   /**This is a list of button values.*/
   private final String[] buttonValue = {"0", "1", "2",
           "3", "4", "5", "6",
           "7", "8", "9"};
   /**This is a font.*/
   private final Font font;
   /**This is a font of text.*/
   private final Font textFont;
   /**This is a size of font.*/
   private final int fontSize = 18;
   /**This is a size of font of text.*/
   private final int textFontSize = 24;
   /**This is a size of a button.*/
   private final int jButtonSize = 10;
   /**This is a frame size.*/
   private final int frameSize = 450;
   /**This is a border of text area.*/
   private final int borderText = 30;


   public UI() throws IOException {
      frame = new JFrame("Calculator PH");

      panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panelSub1 = new JPanel(new FlowLayout());
      panelSub2 = new JPanel(new FlowLayout());
      panelSub3 = new JPanel(new FlowLayout());
      panelSub4 = new JPanel(new FlowLayout());
      panelSub5 = new JPanel(new FlowLayout());
      panelSub6 = new JPanel(new FlowLayout());
      panelSub7 = new JPanel(new FlowLayout());
      panelSub8 = new JPanel(new FlowLayout());

      font = new Font("Consolas", Font.PLAIN, fontSize);
      text = new JTextArea(1, borderText);

      textFont = new Font("Consolas", Font.BOLD, textFontSize);

      but = new JButton[jButtonSize];
      for (int i = 0; i < jButtonSize; i++) {
         but[i] = new JButton(String.valueOf(i)); }

      butAdd = new JButton("+");
      butMinus = new JButton("-");
      butMultiply = new JButton("*");
      butDivide = new JButton("/");
      butEqual = new JButton("=");
      butSquareRoot = new JButton("sqrt");
      butSquare = new JButton("x*x");
      butOneDevidedBy = new JButton("1/x");
      butCos = new JButton("Cos");
      butSin = new JButton("Sin");
      butTan = new JButton("Tan");
      butxpowerofy = new JButton("x^y");
      butlog = new JButton("log10(x)");
      butrate = new JButton("x%");
      butabs = new JButton("abs(x)");
      butCancel = new JButton("C");
      butBinary = new JButton("Bin");
      calc = new Calculator();
   }
   public void init() {
      frame.setSize(frameSize, frameSize);
      frame.setVisible(true);

      frame.setLocationRelativeTo(null);
      frame.setResizable(false);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      text.setFont(textFont);
      text.setEditable(false);

      for (int i = 0; i < jButtonSize; i++) {
         but[i].setFont(font);
      }
      butAdd.setFont(font);
      butMinus.setFont(font);
      butMultiply.setFont(font);
      butDivide.setFont(font);
      butEqual.setFont(font);
      butSquareRoot.setFont(font);
      butSquare.setFont(font);
      butOneDevidedBy.setFont(font);
      butCos.setFont(font);
      butSin.setFont(font);
      butTan.setFont(font);
      butxpowerofy.setFont(font);
      butlog.setFont(font);
      butrate.setFont(font);
      butabs.setFont(font);
      butCancel.setFont(font);
      butBinary.setFont(font);

      final int panelSub1Size = 100;
      panel.add(Box.createHorizontalStrut(panelSub1Size));
      panelSub1.add(text);
      panel.add(panelSub1);

      final int panelSub234Size = 15;
      final int one = 1;
      final int two = 2;
      final int three = 3;
      final int four = 4;
      final int five = 5;
      final int six = 6;
      final int seven = 7;
      final int eight = 8;
      final int nine = 9;


      panelSub2.add(but[one]);
      panelSub2.add(but[two]);
      panelSub2.add(but[three]);
      panelSub2.add(Box.createHorizontalStrut(panelSub234Size));
      panelSub2.add(butAdd);
      panelSub2.add(butMinus);
      panel.add(panelSub2);

      panelSub3.add(but[four]);
      panelSub3.add(but[five]);
      panelSub3.add(but[six]);
      panelSub3.add(Box.createHorizontalStrut(panelSub234Size));
      panelSub3.add(butMultiply);

      panelSub3.add(butDivide);
      panel.add(panelSub3);
      panelSub4.add(but[seven]);
      panelSub4.add(but[eight]);
      panelSub4.add(but[nine]);
      panelSub4.add(Box.createHorizontalStrut(panelSub234Size));
      panelSub4.add(butEqual);
      panelSub4.add(butCancel);
      panel.add(panelSub4);

      final int panelSub5Size = 210;
      panelSub5.add(but[0]);
      panelSub5.add(Box.createHorizontalStrut(panelSub5Size));
      panel.add(panelSub5);
      panelSub6.add(butSquare);
      panelSub6.add(butSquareRoot);
      panelSub6.add(butOneDevidedBy);
      panelSub6.add(butxpowerofy);
      panel.add(panelSub6);
      panelSub7.add(butCos);
      panelSub7.add(butSin);
      panelSub7.add(butTan);
      panel.add(panelSub7);
      panelSub8.add(butlog);
      panelSub8.add(butrate);
      panelSub8.add(butabs);
      panelSub8.add(butBinary);
      panel.add(panelSub8);
      for (int i = 0; i < jButtonSize; i++) {
         but[i].addActionListener(this); }
      butAdd.addActionListener(this);
      butMinus.addActionListener(this);
      butMultiply.addActionListener(this);
      butDivide.addActionListener(this);
      butSquare.addActionListener(this);
      butSquareRoot.addActionListener(this);
      butOneDevidedBy.addActionListener(this);
      butCos.addActionListener(this);
      butSin.addActionListener(this);
      butTan.addActionListener(this);
      butxpowerofy.addActionListener(this);
      butlog.addActionListener(this);
      butrate.addActionListener(this);
      butabs.addActionListener(this);
      butBinary.addActionListener(this);
      butEqual.addActionListener(this);
      butCancel.addActionListener(this);
      frame.add(panel);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      final Object source = e.getSource();
      for (int i = 0; i < jButtonSize; i++) {
         if (source == but[i]) {
            text.replaceSelection(buttonValue[i]);
            return;
         }
      }
      if (source == butAdd) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.ADD, reader()));
      }
      if (source == butMinus) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.MINUS, reader()));
      }
      if (source == butMultiply) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.MULTIPLY,
                                 reader()));
      }
      if (source == butDivide) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.DIVIDE, reader()));
      }
      if (source == butxpowerofy) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.XPOWEROFY, reader()));
      }
      if (source == butSquare) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.SQUARE,
                                   reader()));
      }
      if (source == butSquareRoot) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.SQUAREROOT,
                                   reader()));
      }
      if (source == butOneDevidedBy) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.ONEDEVIDEDBY, reader()));
      }
      if (source == butCos) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.COS,
                                   reader()));
      }
      if (source == butSin) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.SIN,
                                   reader()));
      }
      if (source == butTan) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.TAN,
                                   reader()));
      }
      if (source == butlog) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.LOG,
                                   reader()));
      }
      if (source == butrate) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.RATE,
                                   reader()));
      }
      if (source == butabs) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.ABS, reader()));
      }
      if (source == butEqual) {
         writer(calc.calculateEqual(reader()));
      }
      if (source == butCancel) {
         writer(calc.reset());
      }
      if (source == butBinary) {
         parsetoBinary();
      }
      text.selectAll();
   }
   private void parsetoBinary() {
      try {
         text.setText("" + Long.toBinaryString(Long.parseLong(text.getText())));
      } catch (NumberFormatException ex) {
         System.err.println("Error while parse to binary." + ex.toString());
      }
   }
   public Double reader() {
      Double num;
      String str;
      str = text.getText();
      num = Double.valueOf(str);
      return num;
   }
   public void writer(final Double num) {
      if (Double.isNaN(num)) {
         text.setText("");
      } else {
         text.setText(Double.toString(num));
      }
   }
}
