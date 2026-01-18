public class Elicopter extends Aeronava implements Comparable {
    private Double autonomieZbor;
    public Elicopter(String marca, String model, Double autonomieZbor) {
        super(marca, model);
        this.autonomieZbor = autonomieZbor;
    }

    public Double getAutonomieZbor() {
        return autonomieZbor;
    }

    @Override
    public String toString() {
        return super.toString() + " autonomieZbor=" + autonomieZbor;
    }
    @Override
    public int compareTo(Object o) {
        Elicopter elicopter = (Elicopter) o;
        return elicopter.getAutonomieZbor().compareTo(this.autonomieZbor);
    }
}
