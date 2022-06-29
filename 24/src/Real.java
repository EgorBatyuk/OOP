public class Real extends Number {
    double diluted;
    double divider;

    public Real(){
        this.diluted = diluted;
        this.divider = divider;
    }

    public double create(double diluted, double divider){
        double real_number = diluted / divider;
        return real_number;
    }

}