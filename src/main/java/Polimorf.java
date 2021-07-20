import java.util.Arrays;
import java.util.List;

public class Polimorf {
    public static void main(String[] args) {
        Figure figure = new Figure("Квадрат", 4);
        Figure figure1 = new Figure("Треугольник", 3);
        Figure figure2 = new Figure("Круг", 0);



        List<Figure> discotheque = Arrays.asList(figure, figure1, figure2);
        for (Figure f : discotheque) {
            f.Figure();
        }
    }
}
