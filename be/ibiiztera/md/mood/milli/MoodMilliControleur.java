/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ibiiztera.md.mood.milli;

import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author Manuel DAHMEN
 */
public interface MoodMilliControleur {
    public void resolution(int x, int y);
    public void grid(int pixelx, int pixely);
    public void showGrid(boolean show);
    public void ligne(Point p1, Point p2);
    public void point(Point p, ColorO co);
    public void bezier(Point p1, Point p2, Point p3, Point p4, ColorO co);
    public BufferedImage image();
    
}
