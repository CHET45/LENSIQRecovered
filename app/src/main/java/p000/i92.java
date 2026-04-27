package p000;

import android.graphics.Color;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public final class i92 {
    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component1(@yfb Color color) {
        return color.getComponent(0);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component2(@yfb Color color) {
        return color.getComponent(1);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component3(@yfb Color color) {
        return color.getComponent(2);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component4(@yfb Color color) {
        return color.getComponent(3);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final long convertTo(@g92 int i, @yfb ColorSpace.Named named) {
        return Color.convert(i, ColorSpace.get(named));
    }

    public static final int getAlpha(@g92 int i) {
        return (i >> 24) & 255;
    }

    public static final int getBlue(@g92 int i) {
        return i & 255;
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final ColorSpace getColorSpace(long j) {
        return Color.colorSpace(j);
    }

    public static final int getGreen(@g92 int i) {
        return (i >> 8) & 255;
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float getLuminance(@g92 int i) {
        return Color.luminance(i);
    }

    public static final int getRed(@g92 int i) {
        return (i >> 16) & 255;
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final boolean isSrgb(long j) {
        return Color.isSrgb(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final boolean isWideGamut(long j) {
        return Color.isWideGamut(j);
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final Color plus(@yfb Color color, @yfb Color color2) {
        return ua2.compositeColors(color2, color);
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final Color toColor(@g92 int i) {
        return Color.valueOf(i);
    }

    @c5e(26)
    @g92
    @igg({"ClassVerificationFailure"})
    public static final int toColorInt(long j) {
        return Color.toArgb(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final long toColorLong(@g92 int i) {
        return Color.pack(i);
    }

    public static final int component1(@g92 int i) {
        return (i >> 24) & 255;
    }

    public static final int component2(@g92 int i) {
        return (i >> 16) & 255;
    }

    public static final int component3(@g92 int i) {
        return (i >> 8) & 255;
    }

    public static final int component4(@g92 int i) {
        return i & 255;
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final long convertTo(@g92 int i, @yfb ColorSpace colorSpace) {
        return Color.convert(i, colorSpace);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float getAlpha(long j) {
        return Color.alpha(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float getBlue(long j) {
        return Color.blue(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float getGreen(long j) {
        return Color.green(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float getLuminance(long j) {
        return Color.luminance(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float getRed(long j) {
        return Color.red(j);
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final Color toColor(long j) {
        return Color.valueOf(j);
    }

    @g92
    public static final int toColorInt(@yfb String str) {
        return Color.parseColor(str);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component1(long j) {
        return Color.red(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component2(long j) {
        return Color.green(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component3(long j) {
        return Color.blue(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final float component4(long j) {
        return Color.alpha(j);
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final long convertTo(long j, @yfb ColorSpace.Named named) {
        return Color.convert(j, ColorSpace.get(named));
    }

    @c5e(26)
    @igg({"ClassVerificationFailure"})
    public static final long convertTo(long j, @yfb ColorSpace colorSpace) {
        return Color.convert(j, colorSpace);
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final Color convertTo(@yfb Color color, @yfb ColorSpace.Named named) {
        return color.convert(ColorSpace.get(named));
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final Color convertTo(@yfb Color color, @yfb ColorSpace colorSpace) {
        return color.convert(colorSpace);
    }
}
