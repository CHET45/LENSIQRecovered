package p000;

import android.graphics.Color;
import com.blankj.utilcode.util.C2479l;

/* JADX INFO: loaded from: classes3.dex */
public final class va2 {
    private va2() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getColor(@w92 int i) {
        return lx2.getColor(C2479l.getApp(), i);
    }

    public static int getRandomColor() {
        return getRandomColor(true);
    }

    public static String int2ArgbString(@g92 int i) {
        String hexString = Integer.toHexString(i);
        while (hexString.length() < 6) {
            hexString = a43.f347l + hexString;
        }
        while (hexString.length() < 8) {
            hexString = "f" + hexString;
        }
        return "#" + hexString;
    }

    public static String int2RgbString(@g92 int i) {
        String hexString = Integer.toHexString(i & 16777215);
        while (hexString.length() < 6) {
            hexString = a43.f347l + hexString;
        }
        return "#" + hexString;
    }

    public static boolean isLightColor(@g92 int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) >= 127.5d;
    }

    public static int setAlphaComponent(@g92 int i, @h78(from = 0, m12174to = coe.f17274d) int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public static int setBlueComponent(@g92 int i, @h78(from = 0, m12174to = coe.f17274d) int i2) {
        return (i & (-256)) | i2;
    }

    public static int setGreenComponent(@g92 int i, @h78(from = 0, m12174to = coe.f17274d) int i2) {
        return (i & (-65281)) | (i2 << 8);
    }

    public static int setRedComponent(@g92 int i, @h78(from = 0, m12174to = coe.f17274d) int i2) {
        return (i & (-16711681)) | (i2 << 16);
    }

    public static int string2Int(@efb String str) {
        if (str != null) {
            return Color.parseColor(str);
        }
        throw new NullPointerException("Argument 'colorString' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getRandomColor(boolean z) {
        return (z ? ((int) (Math.random() * 256.0d)) << 24 : -16777216) | ((int) (Math.random() * 1.6777216E7d));
    }

    public static int setAlphaComponent(@g92 int i, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (i & 16777215) | (((int) ((f * 255.0f) + 0.5f)) << 24);
    }

    public static int setBlueComponent(@g92 int i, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (i & (-256)) | ((int) ((f * 255.0f) + 0.5f));
    }

    public static int setGreenComponent(@g92 int i, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (i & (-65281)) | (((int) ((f * 255.0f) + 0.5f)) << 8);
    }

    public static int setRedComponent(@g92 int i, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (i & (-16711681)) | (((int) ((f * 255.0f) + 0.5f)) << 16);
    }
}
