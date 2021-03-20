package LeetCode;

public class LeetCode1603 {

    public static void main(String[] args) {

    }
}

class ParkingSystem {

    private int arr[];

    public ParkingSystem(int big, int medium, int small) {
        arr = new int[3];
        arr[0] = big;
        arr[1] = medium;
        arr[2] = small;
    }

    public boolean addCar(int carType) {
        if (arr[carType] >= 1) {
            arr[carType]--;
            return true;
        }
        return false;
    }
}
