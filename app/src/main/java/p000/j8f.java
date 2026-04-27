package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class j8f extends CharacterStyle {

    /* JADX INFO: renamed from: e */
    public static final int f49936e = 0;

    /* JADX INFO: renamed from: a */
    public final int f49937a;

    /* JADX INFO: renamed from: b */
    public final float f49938b;

    /* JADX INFO: renamed from: c */
    public final float f49939c;

    /* JADX INFO: renamed from: d */
    public final float f49940d;

    public j8f(int i, float f, float f2, float f3) {
        this.f49937a = i;
        this.f49938b = f;
        this.f49939c = f2;
        this.f49940d = f3;
    }

    public final int getColor() {
        return this.f49937a;
    }

    public final float getOffsetX() {
        return this.f49938b;
    }

    public final float getOffsetY() {
        return this.f49939c;
    }

    public final float getRadius() {
        return this.f49940d;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        textPaint.setShadowLayer(this.f49940d, this.f49938b, this.f49939c, this.f49937a);
    }
}
