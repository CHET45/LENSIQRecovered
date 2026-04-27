package p000;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class bvd implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f14949a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9576mx<PointF, PointF> f14950b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9576mx<PointF, PointF> f14951c;

    /* JADX INFO: renamed from: d */
    public final C15326xw f14952d;

    /* JADX INFO: renamed from: e */
    public final boolean f14953e;

    public bvd(String str, InterfaceC9576mx<PointF, PointF> interfaceC9576mx, InterfaceC9576mx<PointF, PointF> interfaceC9576mx2, C15326xw c15326xw, boolean z) {
        this.f14949a = str;
        this.f14950b = interfaceC9576mx;
        this.f14951c = interfaceC9576mx2;
        this.f14952d = c15326xw;
        this.f14953e = z;
    }

    public C15326xw getCornerRadius() {
        return this.f14952d;
    }

    public String getName() {
        return this.f14949a;
    }

    public InterfaceC9576mx<PointF, PointF> getPosition() {
        return this.f14950b;
    }

    public InterfaceC9576mx<PointF, PointF> getSize() {
        return this.f14951c;
    }

    public boolean isHidden() {
        return this.f14953e;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new avd(go9Var, pr0Var, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.f14950b + ", size=" + this.f14951c + '}';
    }
}
