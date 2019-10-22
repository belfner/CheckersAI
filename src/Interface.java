import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;

public class Interface extends Canvas
{
    int boardX;
    int boardY;
    int cellSize;
    int pieceSize;
    Board currentBoard;


    public Interface(Board b)
    {
        currentBoard = b;
        boardX = 40;
        boardY = 40;
        cellSize = 40;
        pieceSize = cellSize-2;
    }

    public void init()
    {
        JFrame frame = new JFrame("Checkers");
        setSize(800, 800);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        drawBoard(g2);
    }

    public void updateBoard(Board b)
    {
        currentBoard = b;
    }

    private void drawBoard(Graphics2D g2)
    {
        g2.setStroke(new BasicStroke(5));
        g2.setPaint(Color.BLACK);
        g2.draw(new Rectangle2D.Double(boardX, boardY, cellSize * 8, cellSize * 8));

        Rectangle2D r;
        boolean color = true; //true for dark false for light
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 8; y++)
            {
                r = new Rectangle2D.Double(boardX+x*cellSize,boardY+y*cellSize,cellSize,cellSize);
                if(color)
                {
                    g2.setPaint(Color.DARK_GRAY);

                }
                else
                {
                    g2.setPaint(Color.LIGHT_GRAY);
                }
                color = !color;
                g2.draw(r);
                g2.fill(r);

                b.get
            }
            color = !color;
        }
    }
}
