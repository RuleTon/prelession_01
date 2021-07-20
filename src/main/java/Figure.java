public class Figure {
    String Name;
    int corner;

    public Figure(String Name, int corner) {
        this.Name = Name;
        this.corner = corner;
    }

    public void Figure() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Фигура: " + Name + ". Количество углов: " + corner;
    }
}
