package p000;

import android.graphics.Rect;
import p000.vv7;

/* JADX INFO: loaded from: classes7.dex */
public class yv7 extends xv7 {

    /* JADX INFO: renamed from: a */
    public static final String f103133a = "%";

    /* JADX INFO: renamed from: b */
    public static final String f103134b = "em";

    /* JADX INFO: renamed from: a */
    public int m26367a(@efb vv7.C14273a c14273a, int i, float f) {
        return (int) ((f103134b.equals(c14273a.f92370b) ? c14273a.f92369a * f : c14273a.f92369a) + 0.5f);
    }

    @efb
    /* JADX INFO: renamed from: b */
    public Rect m26368b(@hib vv7 vv7Var, @efb Rect rect, int i, float f) {
        Rect rect2;
        if (vv7Var == null) {
            int iWidth = rect.width();
            if (iWidth > i) {
                return new Rect(0, 0, i, (int) ((rect.height() / (iWidth / i)) + 0.5f));
            }
            return rect;
        }
        vv7.C14273a c14273a = vv7Var.f92367a;
        vv7.C14273a c14273a2 = vv7Var.f92368b;
        int iWidth2 = rect.width();
        int iHeight = rect.height();
        float f2 = iWidth2 / iHeight;
        if (c14273a != null) {
            int iM26367a = f103133a.equals(c14273a.f92370b) ? (int) ((i * (c14273a.f92369a / 100.0f)) + 0.5f) : m26367a(c14273a, iWidth2, f);
            rect2 = new Rect(0, 0, iM26367a, (c14273a2 == null || f103133a.equals(c14273a2.f92370b)) ? (int) ((iM26367a / f2) + 0.5f) : m26367a(c14273a2, iHeight, f));
        } else {
            if (c14273a2 == null || f103133a.equals(c14273a2.f92370b)) {
                return rect;
            }
            int iM26367a2 = m26367a(c14273a2, iHeight, f);
            rect2 = new Rect(0, 0, (int) ((iM26367a2 * f2) + 0.5f), iM26367a2);
        }
        return rect2;
    }

    @Override // p000.xv7
    @efb
    public Rect resolveImageSize(@efb m90 m90Var) {
        return m26368b(m90Var.getImageSize(), m90Var.getResult().getBounds(), m90Var.getLastKnownCanvasWidth(), m90Var.getLastKnowTextSize());
    }
}
