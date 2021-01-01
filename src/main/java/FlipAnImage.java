import java.util.List;

public class FlipAnImage {
    public static List<List<Integer>> invertImage(List<List<Integer>> image) {
        // Write your code here
        int n = image.size();
        System.out.println(n);
        int m = image.get(0).size();
        int backIndex = m - 1;
        for(int i = 0; i < n; i++) {
            backIndex = m - 1;
            for(int j = 0; j < m/2; j++) {
                int temp = image.get(i).get(backIndex);
                image.get(i).set(backIndex, image.get(i).get(j));
                image.get(i).set(j, temp);
                backIndex--;
            }
        }

        for(int j = 0; j < m; j ++ ) {
            backIndex = n - 1;
            for(int i = 0; i < n/2; i++) {
                int temp = image.get(backIndex).get(j);
                image.get(backIndex).set(j, image.get(i).get(j));
                image.get(i).set(j, temp);
                backIndex--;
            }
        }
        return image;
    }

}
