public class Point {
    public static class Equal extends Exception{
        public Equal() {
            System.out.println("Equal values");
        }
    }
    private final float x;
    private final float y;
    private final float z;
    Point(float x,float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static Boolean comparison(Point p1, Point p2) throws Equal{
        if (p1.z == p2.z){
            if (p1.y == p2.y){
                if (p1.x == p2.x){
                    throw new Equal();
                }
                return (p1.x > p2.x);
            }
            return (p1.y > p2.y);
        }
        return (p1.z > p2.z);

    }
    public static void main(String[] args){
        Point hi = new Point(1,2,3);
        Point hi2 = new Point(1,2,3);
        try {
            System.out.println(Point.comparison(hi2, hi));
        } catch (Equal e){}
    }
}
