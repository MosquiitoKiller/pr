package pr12;

public enum Planet {
    Mercury(3.33*Math.pow(10, 23),2439000,"Mercury"),
    Venus(4.87*Math.pow(10,24),6051000,"Venus"),
    Earth(5.97*Math.pow(10,24),6371000,"Earth"),
    Mars(6.42*Math.pow(10,23),3396000,"Mars"),
    Jupiter(1.8986*Math.pow(10,27),69911000,"Jupiter"),
    Saturn(5.68*Math.pow(10,26),60268000,"Saturn"),
    Uranus(8.68*Math.pow(10,25),25360000,"Uranus"),
    Neptune(1.02*Math.pow(10,26),24622000,"Neptune");

    private final double m,r;
    private final String name;

    Planet(double m, double r, String name) {
        this.m = m;
        this.r = r;
        this.name = name;
    }

    public double getM() {
        return m;
    }

    public String getName() {
        return name;
    }

    public double getR() {
        return r;
    }

    public double getGravity(){
        return 6.67430*this.getM()*1/(this.getR()*this.getR())*Math.pow(10,-11);
    }
}
