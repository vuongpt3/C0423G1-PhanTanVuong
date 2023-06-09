package bai_4_classes_and_objects_in_java.bai_tap.bai_2_construct_the_stopwatch_class;

public class GetElapsedTime {
    public double startTime;
    public double endTime;

    public GetElapsedTime(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public GetElapsedTime() {

    }

    public double getStartTime() {return startTime = System.currentTimeMillis(); }

    public double getEndTime() {
        return endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
