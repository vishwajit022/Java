package Strings;

public class quizshortpath {
    public static float getpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }

        }
        float x2 = x * x;
        float y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] a) {
        String path = "WNEENESENNN";
        System.out.print(getpath(path));
    }

}
