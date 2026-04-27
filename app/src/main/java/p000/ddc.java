package p000;

import p000.jvg;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ddc {

    /* JADX INFO: renamed from: h */
    public static final int f29429h = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final bdc f29430a;

    /* JADX INFO: renamed from: b */
    public final int f29431b;

    /* JADX INFO: renamed from: c */
    public final int f29432c;

    /* JADX INFO: renamed from: d */
    public int f29433d;

    /* JADX INFO: renamed from: e */
    public int f29434e;

    /* JADX INFO: renamed from: f */
    public float f29435f;

    /* JADX INFO: renamed from: g */
    public float f29436g;

    public ddc(@yfb bdc bdcVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.f29430a = bdcVar;
        this.f29431b = i;
        this.f29432c = i2;
        this.f29433d = i3;
        this.f29434e = i4;
        this.f29435f = f;
        this.f29436g = f2;
    }

    public static /* synthetic */ ddc copy$default(ddc ddcVar, bdc bdcVar, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bdcVar = ddcVar.f29430a;
        }
        if ((i5 & 2) != 0) {
            i = ddcVar.f29431b;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = ddcVar.f29432c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = ddcVar.f29433d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = ddcVar.f29434e;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            f = ddcVar.f29435f;
        }
        float f3 = f;
        if ((i5 & 64) != 0) {
            f2 = ddcVar.f29436g;
        }
        return ddcVar.copy(bdcVar, i6, i7, i8, i9, f3, f2);
    }

    /* JADX INFO: renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m28643toGlobalxdX6G0$default(ddc ddcVar, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return ddcVar.m28644toGlobalxdX6G0(j, z);
    }

    @yfb
    public final bdc component1() {
        return this.f29430a;
    }

    public final int component2() {
        return this.f29431b;
    }

    public final int component3() {
        return this.f29432c;
    }

    public final int component4() {
        return this.f29433d;
    }

    public final int component5() {
        return this.f29434e;
    }

    public final float component6() {
        return this.f29435f;
    }

    public final float component7() {
        return this.f29436g;
    }

    @yfb
    public final ddc copy(@yfb bdc bdcVar, int i, int i2, int i3, int i4, float f, float f2) {
        return new ddc(bdcVar, i, i2, i3, i4, f, f2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddc)) {
            return false;
        }
        ddc ddcVar = (ddc) obj;
        return md8.areEqual(this.f29430a, ddcVar.f29430a) && this.f29431b == ddcVar.f29431b && this.f29432c == ddcVar.f29432c && this.f29433d == ddcVar.f29433d && this.f29434e == ddcVar.f29434e && Float.compare(this.f29435f, ddcVar.f29435f) == 0 && Float.compare(this.f29436g, ddcVar.f29436g) == 0;
    }

    public final float getBottom() {
        return this.f29436g;
    }

    public final int getEndIndex() {
        return this.f29432c;
    }

    public final int getEndLineIndex() {
        return this.f29434e;
    }

    public final int getLength() {
        return this.f29432c - this.f29431b;
    }

    @yfb
    public final bdc getParagraph() {
        return this.f29430a;
    }

    public final int getStartIndex() {
        return this.f29431b;
    }

    public final int getStartLineIndex() {
        return this.f29433d;
    }

    public final float getTop() {
        return this.f29435f;
    }

    public int hashCode() {
        return (((((((((((this.f29430a.hashCode() * 31) + Integer.hashCode(this.f29431b)) * 31) + Integer.hashCode(this.f29432c)) * 31) + Integer.hashCode(this.f29433d)) * 31) + Integer.hashCode(this.f29434e)) * 31) + Float.hashCode(this.f29435f)) * 31) + Float.hashCode(this.f29436g);
    }

    public final void setBottom(float f) {
        this.f29436g = f;
    }

    public final void setEndLineIndex(int i) {
        this.f29434e = i;
    }

    public final void setStartLineIndex(int i) {
        this.f29433d = i;
    }

    public final void setTop(float f) {
        this.f29435f = f;
    }

    @yfb
    public final rud toGlobal(@yfb rud rudVar) {
        return rudVar.m32210translatek4lQ0M(mzb.Offset(0.0f, this.f29435f));
    }

    /* JADX INFO: renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m28644toGlobalxdX6G0(long j, boolean z) {
        if (z) {
            jvg.C8123a c8123a = jvg.f52112b;
            if (jvg.m30586equalsimpl0(j, c8123a.m30598getZerod9O1mEE())) {
                return c8123a.m30598getZerod9O1mEE();
            }
        }
        return kvg.TextRange(toGlobalIndex(jvg.m30593getStartimpl(j)), toGlobalIndex(jvg.m30588getEndimpl(j)));
    }

    public final int toGlobalIndex(int i) {
        return i + this.f29431b;
    }

    public final int toGlobalLineIndex(int i) {
        return i + this.f29433d;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.f29435f;
    }

    @yfb
    public final rud toLocal(@yfb rud rudVar) {
        return rudVar.m32210translatek4lQ0M(mzb.Offset(0.0f, -this.f29435f));
    }

    /* JADX INFO: renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m28645toLocalMKHz9U(long j) {
        return mzb.Offset(izb.m30429getXimpl(j), izb.m30430getYimpl(j) - this.f29435f);
    }

    public final int toLocalIndex(int i) {
        return kpd.coerceIn(i, this.f29431b, this.f29432c) - this.f29431b;
    }

    public final int toLocalLineIndex(int i) {
        return i - this.f29433d;
    }

    public final float toLocalYPosition(float f) {
        return f - this.f29435f;
    }

    @yfb
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f29430a + ", startIndex=" + this.f29431b + ", endIndex=" + this.f29432c + ", startLineIndex=" + this.f29433d + ", endLineIndex=" + this.f29434e + ", top=" + this.f29435f + ", bottom=" + this.f29436g + ')';
    }

    @yfb
    public final vic toGlobal(@yfb vic vicVar) {
        vicVar.mo28702translatek4lQ0M(mzb.Offset(0.0f, this.f29435f));
        return vicVar;
    }

    public /* synthetic */ ddc(bdc bdcVar, int i, int i2, int i3, int i4, float f, float f2, int i5, jt3 jt3Var) {
        this(bdcVar, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }
}
