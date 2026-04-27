package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class rqg extends CharacterStyle {

    /* JADX INFO: renamed from: c */
    public static final int f79057c = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f79058a;

    /* JADX INFO: renamed from: b */
    public final boolean f79059b;

    public rqg(boolean z, boolean z2) {
        this.f79058a = z;
        this.f79059b = z2;
    }

    public final boolean isStrikethroughText() {
        return this.f79059b;
    }

    public final boolean isUnderlineText() {
        return this.f79058a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        textPaint.setUnderlineText(this.f79058a);
        textPaint.setStrikeThruText(this.f79059b);
    }
}
