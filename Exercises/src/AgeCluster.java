public interface AgeCluster {
    int puppy= 1;
    int adult = 5;
    int senior= 15;
    int extraSenior= 50;
    default String getAgeCluster(int eta){
        if (eta<= puppy){
            return "puppy";
        } else if (eta<=adult) {
            return "adult";
        } else if (eta<=senior) {
            return "senior";
        } else {
            return "extra senior";
        }
    }
}
