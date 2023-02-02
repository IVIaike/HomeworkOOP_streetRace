package streetrace;

public enum Size {
    VERYSMALL (1,10),
    SMALL (11, 25),
    MIDDLE (26, 50),
    BIG (51, 80),
    VERYBIG (81, 120);

    private Integer min;
    private Integer max;

    Size(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }
    Size() {

    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public static Size getValue (Integer value){
        for (Size e: Size.values()){
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }

//    @Override
//    public String toString() {
//        return "Вместимость автобуса: от "+ min + " и до " + max;
//    }


}
