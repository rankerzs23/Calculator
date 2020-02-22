import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener{
   
   JTextField tres;
   JButton bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bZero,
           bPlus, bMinus, bTimes, bDiv, bEqual, bPoint;
   JPanel p1;
   Container c = getContentPane();
   
   Calculator(){
      super("Calculator v1");
      
      tres = new JTextField("0"); tres.setEditable(false);
      bOne = new JButton("1"); bOne.addActionListener(this);
      bTwo = new JButton("2"); bTwo.addActionListener(this);
      bThree = new JButton("3"); bThree.addActionListener(this);
      bFour = new JButton("4"); bFour.addActionListener(this);
      bFive = new JButton("5"); bFive.addActionListener(this);
      bSix = new JButton("6"); bSix.addActionListener(this);
      bSeven = new JButton("7"); bSeven.addActionListener(this);
      bEight = new JButton("8"); bEight.addActionListener(this);
      bNine = new JButton("9"); bNine.addActionListener(this);
      bZero = new JButton("0"); bZero.addActionListener(this);
      bPlus = new JButton("+"); bPlus.addActionListener(this);
      bMinus = new JButton("-"); bMinus.addActionListener(this);
      bTimes = new JButton("*"); bTimes.addActionListener(this);
      bDiv = new JButton("/"); bDiv.addActionListener(this);
      bEqual = new JButton("="); bEqual.addActionListener(this);
      bPoint = new JButton("."); bPoint.addActionListener(this);
      
      p1 = new JPanel(); p1.setLayout(new GridLayout(4,4));
      p1.add(bSeven); p1.add(bEight); p1.add(bNine); p1.add(bDiv);
      p1.add(bFour); p1.add(bFive); p1.add(bSix); p1.add(bTimes);
      p1.add(bOne); p1.add(bTwo); p1.add(bThree); p1.add(bMinus);
      p1.add(bZero); p1.add(bPoint); p1.add(bEqual); p1.add(bPlus);
      
      c.setLayout(new BorderLayout());
      c.add(tres, BorderLayout.NORTH);
      c.add(p1, BorderLayout.CENTER);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 200);
      setResizable(false);
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e){
      StringBuffer sb = new StringBuffer();
      String num1="", num2, res;
      String display = tres.getText();
      if(e.getActionCommand().equals("1")){
          tres.setText(display + "1");
          num1 = tres.getText();
      }
      else if(e.getSource()==bTwo)
      sb.append("2");
      
   }
   
   public static void main(String[]args){
      new Calculator();
   }
}

   