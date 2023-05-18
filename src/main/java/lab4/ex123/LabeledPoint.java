package ex123;

import java.util.Objects;

public class LabeledPoint extends Point {
    String label;

    LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        LabeledPoint that = (LabeledPoint)obj;
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + "', " +
                "x='" + x + "', " +
                "y='" + y + "'" +
                '}';
    }
}
