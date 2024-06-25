public class Sensor {
    Point defaultPoint = new Point(0, 0);


    public DetectInfo detect(Point curr) {
        double deg = defaultPoint.calDegree(curr);
        double distance = defaultPoint.calDistance(curr);
        return new DetectInfo(deg, distance);
    }


}

