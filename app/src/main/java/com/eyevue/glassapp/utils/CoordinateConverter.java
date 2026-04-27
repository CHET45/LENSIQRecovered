package com.eyevue.glassapp.utils;

/* JADX INFO: loaded from: classes4.dex */
public class CoordinateConverter {

    /* JADX INFO: renamed from: A */
    private static final double f18332A = 6378245.0d;

    /* JADX INFO: renamed from: EE */
    private static final double f18333EE = 0.006693421622965943d;

    /* JADX INFO: renamed from: PI */
    private static final double f18334PI = 3.141592653589793d;

    private static boolean isOutOfChina(double lon, double lat) {
        return lon < 72.004d || lon > 137.8347d || lat < 0.8293d || lat > 55.8271d;
    }

    private static double transformLat(double x, double y) {
        double d = x * 2.0d;
        double dSqrt = (-100.0d) + d + (y * 3.0d) + (y * 0.2d * y) + (0.1d * x * y) + (Math.sqrt(Math.abs(x)) * 0.2d) + ((((Math.sin((6.0d * x) * 3.141592653589793d) * 20.0d) + (Math.sin(d * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d2 = y * 3.141592653589793d;
        return dSqrt + ((((Math.sin(d2) * 20.0d) + (Math.sin((y / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((y / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d2 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private static double transformLon(double x, double y) {
        double d = x * 0.1d;
        return x + 300.0d + (y * 2.0d) + (d * x) + (d * y) + (Math.sqrt(Math.abs(x)) * 0.1d) + ((((Math.sin((6.0d * x) * 3.141592653589793d) * 20.0d) + (Math.sin((x * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(x * 3.141592653589793d) * 20.0d) + (Math.sin((x / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((x / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((x / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static double[] wgs84ToGcj02(double longitude, double latitude) {
        if (isOutOfChina(longitude, latitude)) {
            return new double[]{longitude, latitude};
        }
        double d = longitude - 105.0d;
        double d2 = latitude - 35.0d;
        double dTransformLat = transformLat(d, d2);
        double dTransformLon = transformLon(d, d2);
        double d3 = (latitude / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d3);
        double d4 = 1.0d - ((f18333EE * dSin) * dSin);
        double dSqrt = Math.sqrt(d4);
        return new double[]{longitude + ((dTransformLon * 180.0d) / (((f18332A / dSqrt) * Math.cos(d3)) * 3.141592653589793d)), latitude + ((dTransformLat * 180.0d) / ((6335552.717000426d / (d4 * dSqrt)) * 3.141592653589793d))};
    }
}
