import javax.swing.*;
public class Main {
    public static void main(String[] args){
      JFrame fram = new JFrame();
      Login loginPanel = new Login();
      fram.setContentPane(loginPanel.getMainPanel());
      fram.pack();
      fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fram.setVisible(true);
    }
}
