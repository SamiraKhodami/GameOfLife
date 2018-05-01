import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameOfLife {
    public static final int ROWS = 200;
    public static final int COLUMNS = 200;
    public static List<CellCoordinate> liveCellCoordinateList;

    static {
        liveCellCoordinateList = List.of(new CellCoordinate(5, 5)
                , new CellCoordinate(6, 5)
                , new CellCoordinate(7, 5)
                , new CellCoordinate(5, 6)
                , new CellCoordinate(6, 6)
                , new CellCoordinate(7, 6));
    }

    public static void main(String[] args) {
        System.out.println("Input : " + toString(liveCellCoordinateList));
        System.out.println("Output of the next 100 state :");
        IntStream.rangeClosed(1, 100).forEach(i -> System.out.println(i + " : " + toString(generateNextGeneration())));
    }

    private static String toString(List<CellCoordinate> cellCoordinates) {
        return cellCoordinates.stream().map(CellCoordinate::toString)
                .collect(Collectors.joining(",", "{", "}"));
    }

    private static List<CellCoordinate> generateNextGeneration() {

        List<CellCoordinate> nextGenerationList = new ArrayList<>();

        // Loop through every cell
        for (int column = 1; column < COLUMNS - 1; column++) {
            for (int row = 1; row < ROWS - 1; row++) {

                CellCoordinate currentCellCoordinate = new CellCoordinate(column, row);

                int noOfAliveNeighbours = findNoOfAliveNeighbours(column, row);

                // Implementing the Rules of Life
                boolean isAlive = liveCellCoordinateList.contains(currentCellCoordinate);

                // Cell dies due to under population
                if (isAlive && noOfAliveNeighbours < 2)
                    isAlive = false;

                    // Cell dies due to over population
                else if (isAlive && noOfAliveNeighbours > 3)
                    isAlive = false;

                    // A new cell is born by reproduction
                else if (!isAlive && noOfAliveNeighbours == 3)
                    isAlive = true;

                if (isAlive)
                    nextGenerationList.add(currentCellCoordinate);
            }
        }

        return nextGenerationList;

    }

    private static int findNoOfAliveNeighbours(int column, int row) {
        int aliveNeighbours = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (liveCellCoordinateList.contains(new CellCoordinate(column + i, row + j)))
                    aliveNeighbours += 1;
            }
        }
        return aliveNeighbours;
    }
}
