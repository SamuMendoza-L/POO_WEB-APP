package RoundersComponents;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class ButtonRound extends JButton {

    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;

    public ButtonRound() {
        setOpaque(false);
        setContentAreaFilled(false); // no pintar el fondo por defecto
        setFocusPainted(false);      // sin borde azul de enfoque
        setBorderPainted(false);
    }

    // Getters & Setters
    public int getRoundTopLeft() { return roundTopLeft; }
    public void setRoundTopLeft(int r) { roundTopLeft = r; repaint(); }

    public int getRoundTopRight() { return roundTopRight; }
    public void setRoundTopRight(int r) { roundTopRight = r; repaint(); }

    public int getRoundBottomLeft() { return roundBottomLeft; }
    public void setRoundBottomLeft(int r) { roundBottomLeft = r; repaint(); }

    public int getRoundBottomRight() { return roundBottomRight; }
    public void setRoundBottomRight(int r) { roundBottomRight = r; repaint(); }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Dibujar el fondo
        g2.setColor(getBackground());
        Area area = new Area(createRoundShape(width, height));
        g2.fill(area);

        // Dibujar el texto
        super.paintComponent(g);

        g2.dispose();
    }

    private Shape createRoundShape(int width, int height) {
        int tlx = Math.min(width, roundTopLeft);
        int tly = Math.min(height, roundTopLeft);
        int trx = Math.min(width, roundTopRight);
        int try_ = Math.min(height, roundTopRight);
        int blx = Math.min(width, roundBottomLeft);
        int bly = Math.min(height, roundBottomLeft);
        int brx = Math.min(width, roundBottomRight);
        int bry = Math.min(height, roundBottomRight);

        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, tlx, tly));

        if (roundTopRight > 0)
            area.intersect(new Area(new RoundRectangle2D.Double(0, 0, width, height, trx, try_)));
        if (roundBottomLeft > 0)
            area.intersect(new Area(new RoundRectangle2D.Double(0, 0, width, height, blx, bly)));
        if (roundBottomRight > 0)
            area.intersect(new Area(new RoundRectangle2D.Double(0, 0, width, height, brx, bry)));

        return area;
    }
}
