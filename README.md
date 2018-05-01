# Rule of Conway's Game of Life.
Given a grid of square cells, each of the cells is in one of two possible states, alive or dead, or "populated" or "unpopulated". Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, the following transitions occur:

Any live cell with fewer than two live neighbours dies as if caused by underpopulation.

Any live cell with two or three live neighbours lives on to the next generation.

Any live cell with more than three live neighbours dies, as if by overpopulation.

Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

# GamOfLife class
according to the coordinates of initial live cells which is set in liveCellCoordinateList
, prints the coordinate of live cells of the next 100 state according to Conway's Game of Life.

# 1.Install Java 9
https://docs.oracle.com/javase/9/install/overview-jdk-9-and-jre-9-installation.htm#JSJIG-GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A

# 2.Compile
Change into source directory and compile :

$ javac CellCoordinate.java

$ javac GameOfLife.java

# 3.Run
$ java GameOfLife


Result :

Input : {{5,5},{6,5},{7,5},{5,6},{6,6},{7,6}}

Output of the next 100 state :

1 : {{5,5},{5,6},{6,4},{6,7},{7,5},{7,6}}

2 : {{5,5},{5,6},{6,4},{6,7},{7,5},{7,6}}

3 : {{5,5},{5,6},{6,4},{6,7},{7,5},{7,6}}

4 : {{5,5},{5,6},{6,4},{6,7},{7,5},{7,6}}

…
