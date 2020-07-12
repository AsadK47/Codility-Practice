public class FrogJmp {
    public static int jump(int x, int y, int z) {
        double myDouble = (double) (y - x) / z;
        double roundedUp = Math.ceil(myDouble);
        return (int) roundedUp;
    }
}
