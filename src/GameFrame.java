import javax.swing.*;

public class GameFrame extends JFrame {
        GameFrame(){
                //constructor
                this.add(new GamePanel());
                this.setTitle("Snake");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                this.pack();
                this.setVisible(true);
                //appear in middle of computer
                this.setLocationRelativeTo(null);

        }
        }
