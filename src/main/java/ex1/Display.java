package ex1;

public class Display {
    private Double size;
    private Integer numberColors;

    public Display(Double size) {
        this.size = size;
        this.numberColors = null;
    }

    public Display(Integer numberColors) {
        this.numberColors = numberColors;
        this.size = null;
    }

    public Display(Double size, Integer numberColors) {
        this.size = size;
        this.numberColors = numberColors;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getNumberColors() {
        return numberColors;
    }

    public void setNumberColors(Integer numberColors) {
        this.numberColors = numberColors;
    }

    @Override
    public String toString() {
        return "Display{" +
                "size=" + size +
                ", number_colors=" + numberColors +
                '}';
    }
}
