package p000;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p000.fag;
import p000.hag;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class sp4 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: b */
    public static final int f82507b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final rp4 f82508a;

    public sp4(@yfb rp4 rp4Var) {
        this.f82508a = rp4Var;
    }

    /* JADX INFO: renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    private final Paint.Cap m32313toAndroidCapBeK7IIE(int i) {
        fag.C5708a c5708a = fag.f35949b;
        return fag.m28900equalsimpl0(i, c5708a.m28904getButtKaPHkGw()) ? Paint.Cap.BUTT : fag.m28900equalsimpl0(i, c5708a.m28905getRoundKaPHkGw()) ? Paint.Cap.ROUND : fag.m28900equalsimpl0(i, c5708a.m28906getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* JADX INFO: renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    private final Paint.Join m32314toAndroidJoinWw9F2mQ(int i) {
        hag.C6778a c6778a = hag.f43019b;
        return hag.m29980equalsimpl0(i, c6778a.m29985getMiterLxFBmk8()) ? Paint.Join.MITER : hag.m29980equalsimpl0(i, c6778a.m29986getRoundLxFBmk8()) ? Paint.Join.ROUND : hag.m29980equalsimpl0(i, c6778a.m29984getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @yfb
    public final rp4 getDrawStyle() {
        return this.f82508a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@gib TextPaint textPaint) {
        if (textPaint != null) {
            rp4 rp4Var = this.f82508a;
            if (md8.areEqual(rp4Var, nu5.f65694a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (rp4Var instanceof eag) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((eag) this.f82508a).getWidth());
                textPaint.setStrokeMiter(((eag) this.f82508a).getMiter());
                textPaint.setStrokeJoin(m32314toAndroidJoinWw9F2mQ(((eag) this.f82508a).m28821getJoinLxFBmk8()));
                textPaint.setStrokeCap(m32313toAndroidCapBeK7IIE(((eag) this.f82508a).m28820getCapKaPHkGw()));
                ajc pathEffect = ((eag) this.f82508a).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? C5978fu.asAndroidPathEffect(pathEffect) : null);
            }
        }
    }
}
