package abstraction.jediGalaxy;

public class Field {
    private int[][] matrix;

    public Field(int[][] matrix) {
        this.matrix = matrix;
    }

    private int[][] fillMatrix() {
        int number = 0;
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix[1].length; col++) {
                matrix[row][col] = number;
                number++;
            }
        }
        return this.matrix;
    }
    public void printStars(Evil evil,Jedi jedi){
        this.matrix = fillMatrix();
        this.matrix = evilMatrix(evil);
        System.out.println(jediStars(jedi));
    }

    private int[][] evilMatrix(Evil evil) {

        int row = evil.getRow();
        int col = evil.getCol();
        while (row-- > 0 && col-- > 0) {
            matrix[row][col] = 0;
        }
        return matrix;
    }

    private int jediStars(Jedi jedi) {
        int stars = 0;
        int row = jedi.getRow();
        int col = jedi.getCol();
        while (row-- > 0 && col++ < matrix[1].length) {
            stars += matrix[row][col];
        }
        return stars;
    }
}
