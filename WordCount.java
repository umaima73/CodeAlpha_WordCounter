import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WordCount extends JFrame
{
    JLabel label;
    JTextArea textArea;
    JButton button;
    WordCount()
    {
        //frame set up
        setTitle("Word Counter");
        setSize(600,600); 
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        //heading
        JLabel heading=new JLabel("WORD COUNTER",SwingConstants.CENTER);
        heading.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,24));
        heading.setBounds(150,20,300,30);
        add(heading);

        //textArea
        textArea=new JTextArea();
        JScrollPane scrollPane=new JScrollPane(textArea);
        scrollPane.setBounds(50,70,450,400);
        add(scrollPane);

       //button
        button=new JButton("Submit");
        button.setBounds(50,480,100,30);
        add(button);

        //label
        label=new JLabel("WORDS= 0");
        label.setBounds(350,480,200,30);
        label.setFont(new Font("Serif",Font.PLAIN,18));
        add(label);

        button.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String text=textArea.getText();
                    String words[]=text.split("\\ "); 
                    label.setText("Words="+words.length);
                }
            }
        );

    setVisible(true);

}

public static void main(String[] args)
{
    new WordCount().setVisible(true);
}
}