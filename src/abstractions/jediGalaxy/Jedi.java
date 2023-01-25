package abstractions.jediGalaxy;

public class Jedi {
    private int row;
    private int col;

    public Jedi(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
