package ru.job4j.board;
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        //высота доски
            for (int indexw = 1; indexw <= width; indexw++) {
            for (int indexh = 1; indexh <= height; indexh++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((indexw+indexh) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            System.getProperty("line.separator");
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
