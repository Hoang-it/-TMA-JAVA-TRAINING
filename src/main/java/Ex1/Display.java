package Ex1;

public class Display {
    private Double size;
    private Integer number_colors;

    public Display(Double size) {
        this.size = size;
        this.number_colors = null;
    }

    public Display(Integer number_colors) {
        this.number_colors = number_colors;
        this.size = null;
    }

    public Display(Double size, Integer number_colors) {
        this.size = size;
        this.number_colors = number_colors;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getNumber_colors() {
        return number_colors;
    }

    public void setNumber_colors(Integer number_colors) {
        this.number_colors = number_colors;
    }

    @Override
    public String toString() {
        return "Display{" +
                "size=" + size +
                ", number_colors=" + number_colors +
                '}';
    }
}
