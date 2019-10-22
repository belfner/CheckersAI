import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Board start = new Board();
        Interface drawing = new Interface(start);
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                drawing.init();
            }
        });



    }
}
