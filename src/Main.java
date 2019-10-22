import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Interface drawing = new Interface();
        Board start = new Board();
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                drawing.init(start);
            }
        });



    }
}
