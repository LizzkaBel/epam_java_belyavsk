package main.java.by.bsu.tasks.triangle;

public class TriangleCheck {
    public static boolean isTriangle(double s1, double s2, double s3) {
        if ((Double.compare(s1, 0) > 0) && (Double.compare(s2, 0) > 0) && (Double.compare(s3, 0) > 0)) {
            return (Double.compare(s1 + s2, s3) > 0) && (Double.compare(s1 + s3, s2) > 0) && (Double.compare(s2 + s3, s1) > 0);
        }
        return false;
    }
}