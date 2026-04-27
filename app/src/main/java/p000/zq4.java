package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import p000.kt0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zq4<S extends kt0> {

    /* JADX INFO: renamed from: a */
    public S f105741a;

    /* JADX INFO: renamed from: b */
    public uq4 f105742b;

    public zq4(S s) {
        this.f105741a = s;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12680a(@efb Canvas canvas, @efb Paint paint);

    public abstract void adjustCanvas(@efb Canvas canvas, @efb Rect rect, @y46(from = 0.0d, m25645to = 1.0d) float f);

    /* JADX INFO: renamed from: b */
    public void m26953b(@efb uq4 uq4Var) {
        this.f105742b = uq4Var;
    }

    /* JADX INFO: renamed from: c */
    public void m26954c(@efb Canvas canvas, @efb Rect rect, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f105741a.mo6309a();
        adjustCanvas(canvas, rect, f);
    }

    public abstract void fillIndicator(@efb Canvas canvas, @efb Paint paint, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2, @g92 int i);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();
}
