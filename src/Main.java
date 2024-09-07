import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int m = 3;


        System.out.println(RemoveElement.removeElement(nums, m));
        System.out.println(Arrays.toString(nums));

    }
}