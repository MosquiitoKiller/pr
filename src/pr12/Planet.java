package pr12;

public enum Planet {
    Mercury(3.33,23,2439),
    Venus(4.87,24,6051),
    Earth(5.97,24,6371),
    Mars(6.42,23,3396),
    Jupiter(1.8986,27,69911),
    Saturn(5.68,26,60268),
    Uranus(8.68,25,25360),
    Neptune(1.02,26,24622);

    private final double m,r;
    private final int pow;

    Planet(double m, int pow, double r) {
        this.m = m;
        this.pow = pow;
        this.r = r;
    }

    public double getM() {
        return m;
    }

    public double getR() {
        return r;
    }
    public double getGravity(){
        return 6.67430*this.getM()*1/(this.getR()*this.getR()*1000*1000)*Math.pow(10,this.pow-11);
    }
}
