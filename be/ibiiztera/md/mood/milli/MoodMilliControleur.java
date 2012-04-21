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
    public void grid(int pppx, int pppy);
    public void showGrid(boolean show);
    public void ligne(Point p1, Point p2);
    public void point(Point p);
    public void bezier(Point p1, Point p2, Point p3, Point p4);
    public BufferedImage image();
    
}
