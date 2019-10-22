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
        boardX = 5;
        boardY = 5;
        cellSize = 50;
        pieceSize = cellSize-4;
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
        g2.setStroke(new BasicStroke(20));
        g2.setPaint(Color.BLACK);
        g2.draw(new Rectangle2D.Double(0, 0, cellSize * 8+40, cellSize * 8+40));

//        Rectangle2D r;
//        Ellipse2D c;
//        boolean color = true; //true for dark false for light
//        for (int x = 0; x < 8; x++)
//        {
//            for (int y = 0; y < 8; y++)
//            {
//                r = new Rectangle2D.Double(boardX+x*cellSize+5,boardY+y*cellSize+5,cellSize-5,cellSize-5);
//                if(color)
//                {
//                    g2.setPaint(Color.DARK_GRAY);
//
//                }
//                else
//                {
//                    g2.setPaint(Color.LIGHT_GRAY);
//                }
//                g2.draw(r);
//                g2.fill(r);
//
//
////                if(color)
////                {
////                    c = new Ellipse2D.Double(boardX+x*cellSize+5,boardY+y*cellSize+5,pieceSize,pieceSize);
////                    switch (currentBoard.get(x/2,y))
////                    {
////                        case 1:
////                            g2.setPaint(Color.BLACK);
////                            break;
////                        case -1:
////                            g2.setPaint(Color.WHITE);
////                            break;
////                        case 0:
////                            color = false;
////                            continue;
////                    }
////                    g2.draw(c);
////                    g2.fill(c);
////                }
//                color = !color;
//            }
//            color = !color;
//        }
    }
}
