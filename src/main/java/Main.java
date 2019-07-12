import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        System.out.println(Main.popLastElment(null));
    }
    public static int popLastElment(int[] array) {
        List<Integer> list = new ArrayList<>();
        return array[array.length - 1];
        //return list.get(list.size() -1);

    }
}
