import Medium.JumpGame;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 0, 0, 0, 7};

        System.out.println(JumpGame.canJump(nums));
        System.out.println(Arrays.toString(nums));

    }
}