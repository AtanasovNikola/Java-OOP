package abstraction.figure;

public class Figure {
    private int n;

    public Figure(int n) {
        this.n = n;
    }

    public String getFigure() {
        return top() + middle() + bottom();
    }


    private String top() {
        StringBuilder sb = new StringBuilder();
        for (int row = 1; row < n; row++) {
            sb.append(repeatString(n - row, " "))
                    .append(repeatString(row, "* "))
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }

    private String middle() {

        return repeatString(n, "* ") +  System.lineSeparator();
    }

    private String bottom() {
        StringBuilder sb = new StringBuilder();
        for (int row = 1; row < n; row++) {
            sb.append(repeatString(row, " "))
                    .append(repeatString(n - row, "* "))
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }

    private String repeatString(int count, String str) {
        return str.repeat(count);
    }
}
