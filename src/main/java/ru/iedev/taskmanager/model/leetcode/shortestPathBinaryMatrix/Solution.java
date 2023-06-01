package ru.iedev.taskmanager.model.leetcode.shortestPathBinaryMatrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    private final Set<Point> pointSet = new HashSet<>();
    private final HashMap<String,Point> pointMap = new HashMap<>();
    private final Set<Point> traversedPaths = new HashSet<>();
    private int result = -1;
    private Point startPoint;
    private Point endPoint;

    public int shortestPathBinaryMatrix(int[][] grid) {
        try {

            int length = grid.length;

            if (length == 1) return 1;

            if (grid[0][0] == 1 || grid[length - 1][length - 1] == 1 ) {
                return -1;
            }


            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (grid[i][j] == 1) continue;
                    Point point = new Point(j, i, grid[i][j]);
                    pointSet.add(point);
                    pointMap.put(String.valueOf(j) + String.valueOf(i), point);

                    if (i == 0 && j == 0) startPoint = point;
                    else if (i == length - 1 && j == length - 1) endPoint = point;
                }
            }

            for (Point point : pointSet) {
                if (point.val == 1) continue;
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        Point point1 = pointMap.get(String.valueOf(point.x + j) + String.valueOf(point.y + i));
                        if (point1 == null || point.equals(point1) || point1.val == 1) continue;
                        point.ways.add(point1);
                    }
                }
            }

            HashSet<Point> ways = new HashSet<Point>();
            ways.add(startPoint);

            traversedPaths.add(startPoint);
            for (Point way : startPoint.ways) {
                recursiveTreeTraversal(way, 1, ways);
            }

            return endPoint.weight==Integer.MAX_VALUE?-1:endPoint.weight;
        }catch (Exception e){
            return -1;
        }

    }

    private void recursiveTreeTraversal(Point point,int weight,Set<Point> ways){
        if (ways.contains(point)) return;

        Set<Point> ways1 = new HashSet<>(ways);
        ways1.add(point);
        point.weight = Math.min(weight+1,point.weight);

        for (Point way : point.ways) {
            if (ways1.contains(way)) continue;
            way.weight = Math.min(point.weight+1,way.weight);
        }

        for (Point way : point.ways) {
            recursiveTreeTraversal(way,weight+1,ways1);
        }
    }

}

class Point{
    int x;
    int y;
    int val;
    int weight = Integer.MAX_VALUE;
    final Set<Point> ways = new HashSet<>();

    public Point(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }
}
