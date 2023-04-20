
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class GridStringChallenge {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(Collectors.toList());

                String result = gridChallenge(grid, n);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static String gridChallenge(List<String> grid, int n) {
        String result = "NO";
//
//       var sortedGrid = grid.stream().map(g -> {
//           var gridRow = g.toCharArray();
//            Arrays.sort(gridRow);
//            return gridRow;
//       }).collect(Collectors.toList());
//
//       sortedGrid.forEach(System.out::println);

        char[][] sortedGrid = new char[n][n];

        //Read in rows of grid and sort
        for(int i = 0; i < grid.size(); i++){
            sortedGrid[i] = grid.get(i).toCharArray();
            Arrays.sort(sortedGrid[i]);
        }

        if (checkColumsAreSorted(sortedGrid)) {
            result = "YES";
        }

        return result;
    }

    private static boolean checkColumsAreSorted(char[][] sortedGrid) {
        for(int i = 0; i < sortedGrid.length -1 ; i++) {//column
            for(int j = 1; j < sortedGrid.length - 1; j++) {//row
                if(sortedGrid[j][i] < sortedGrid [j-1][i])
                    return false;
            }
        }
        return true;
    }

//    private static boolean checkColumsAreSorted(char[][] grid){
//        for(int i = 0; i < grid.length; i++){//column
//            for(int j = 1; j < grid.length; j++){//row
//                if(grid[j][i] < grid[j-1][i])
//                    return false;
//            }
//        }
//        return true;
//    }
}
