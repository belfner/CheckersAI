public class Board
{
    int[][] tiles;

    Board()
    {
        tiles = new int[8][4];
        int x,y;
        for(y = 0; y<3;y++)
        {
            for(x = 0; x<4;x++)
            {
                tiles[y][x] = 1;
            }
        }

        for(y = 3; y<5;y++)
        {
            for(x = 0; x<4;x++)
            {
                tiles[y][x] = 0;
            }
        }

        for(y = 5; y<8;y++)
        {
            for(x = 0; x<4;x++)
            {
                tiles[y][x] = -1;
            }
        }
    }

    public int get(int x, int y)
    {
        return tiles[y][x];
    }

}
