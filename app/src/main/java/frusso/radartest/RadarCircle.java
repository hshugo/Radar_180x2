package frusso.radartest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by jfabrix101 on 16/07/14.
 */
public class RadarCircle {
    private double angle=0;
    private float distance=0;
    private int sensor=0;

    public RadarCircle(double angle, float distance, int sensor) {
        this.angle=angle;
        this.distance=distance;
        this.sensor=sensor;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }
}
