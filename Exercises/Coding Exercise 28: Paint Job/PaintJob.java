public class PaintJob {
     public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }

        double area = width * height;
        int bucketsNeeds = (int) Math.ceil(area / areaPerBucket);

        return bucketsNeeds - extraBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}
