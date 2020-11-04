package  com.company;

import java.awt.*;
import javax.swing.*;


public class two{
    private static int id=2;
    public static void maTable() {
        System.out.println("??有毒");
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
        Frame ff = new Frame();
        ff.setVisible(true);
        ff.setBounds(100, 200, 200, 200);
        //win ww = new win();
        //ww.setBounds(100, 100, 100, 100);
    }
    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }
}

class win extends Frame{
    /**
     * 1.
     * 有点奇怪这个窗口关闭的set怎么用不了 不知道是不是linux上jvm的原因
     * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     *
     * 2.直接报错。。。
     * No X11 DISPLAY variable was set, but this program performed an operation which requires it.
        at java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:204)
        at java.awt.Window.<init>(Window.java:536)
        at java.awt.Frame.<init>(Frame.java:420)
        at java.awt.Frame.<init>(Frame.java:385)
        at com.company.win.<init>(two.java:36)
        at com.company.Main.main(Main.java:11)

        呃 一顿操作 错误更多了
        看来这CloudIDE上是不能写GUI窗口了
     */
    private static final long serialVersionUID = 1L;
    JCheckBox checkBox1, checkBox2;
    JRadioButton radioButton1,radioButton2;
    ButtonGroup group;
    JComboBox<String> comBox;
    public win(){
        init();
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        comBox = new JComboBox<String>();

        checkBox1 = new JCheckBox("喜欢你姐");
        checkBox2 = new JCheckBox("喜欢你妹");
        group = new ButtonGroup();
        radioButton1 = new JRadioButton("男");
        radioButton2 = new JRadioButton("女");
        group.add(radioButton1);
        group.add(radioButton2);
        add(checkBox2);
        add(checkBox1);
        add(radioButton2);
        add(radioButton1);
        comBox.addItem("我爱你");
        comBox.addItem("不喜欢我你就是sb");
        add(comBox);
    }
}