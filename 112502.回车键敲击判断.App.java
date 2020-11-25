import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if(textArea_A.getText().equals("诗诗")){
                        textArea_B.append("对，诗诗是最漂亮的！！\n");
                    }
                       else  {
                            textArea_B.append("诗诗！！\n");
                        }
                    }

                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    textArea_A.setText("");
                    textArea_B.setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_A.setText("");
                    textArea_B.setText("");
                }


            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(100,100,200,100);
        textArea_B.setBounds(100,300,200,100);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        textArea_A.setBackground(Color.ORANGE);
        textArea_B.setBackground(Color.ORANGE);

        textArea_A.setText("魔镜,魔镜谁是这世上最漂亮的人！！");

        JFrame frame = new JFrame("键盘事件");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
