package p000;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class f02 implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f34620a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9576mx<PointF, PointF> f34621b;

    /* JADX INFO: renamed from: c */
    public final C4992dx f34622c;

    /* JADX INFO: renamed from: d */
    public final boolean f34623d;

    /* JADX INFO: renamed from: e */
    public final boolean f34624e;

    public f02(String str, InterfaceC9576mx<PointF, PointF> interfaceC9576mx, C4992dx c4992dx, boolean z, boolean z2) {
        this.f34620a = str;
        this.f34621b = interfaceC9576mx;
        this.f34622c = c4992dx;
        this.f34623d = z;
        this.f34624e = z2;
    }

    public String getName() {
        return this.f34620a;
    }

    public InterfaceC9576mx<PointF, PointF> getPosition() {
        return this.f34621b;
    }

    public C4992dx getSize() {
        return this.f34622c;
    }

    public boolean isHidden() {
        return this.f34624e;
    }

    public boolean isReversed() {
        return this.f34623d;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new ky4(go9Var, pr0Var, this);
    }
}
