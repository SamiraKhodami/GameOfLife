import java.util.Objects;

public class CellCoordinate {
    private int column;
    private int row;

    public CellCoordinate(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CellCoordinate)) {
            return false;
        }
        CellCoordinate cellCoordinate = (CellCoordinate) o;
        return column == cellCoordinate.column &&
                row == cellCoordinate.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row);
    }

    @Override
    public String toString() {
        return "{" + column +
                "," + row +
                "}";
    }
}
