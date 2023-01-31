/**
 * @Class: SpeedLight
 * @Author: Michaela Haney
 * @Course: ITEC2140 - 05, Spring 2023
 * @Version: 1.0
 * @Date: 31 January 2023
 * Description: This program will write SpeedLight that calculates the
 * distance of a lightning strike based on the time elapsed between the flash
 * and the sound of thunder.
 * In this program, I will declare variables: speedOfSound, timeElapsed,
 * distance
 */




public class SpeedLight {
    public static void main (String[]args){
    int SPEED_OF_SOUND = 340; //this value will never change. constant
        // variable with a fixed value.
        int timeElapsed = 5;
        int distance = SPEED_OF_SOUND + timeElapsed;
        System.out.println("Speed of sound: " + SPEED_OF_SOUND);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance: " + distance);
    }
}
