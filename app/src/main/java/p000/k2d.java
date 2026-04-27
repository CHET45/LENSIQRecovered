package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class k2d {

    /* JADX INFO: renamed from: l */
    public static final int f52476l = 8;

    /* JADX INFO: renamed from: a */
    public final long f52477a;

    /* JADX INFO: renamed from: b */
    public final long f52478b;

    /* JADX INFO: renamed from: c */
    public final long f52479c;

    /* JADX INFO: renamed from: d */
    public final long f52480d;

    /* JADX INFO: renamed from: e */
    public final boolean f52481e;

    /* JADX INFO: renamed from: f */
    public final float f52482f;

    /* JADX INFO: renamed from: g */
    public final int f52483g;

    /* JADX INFO: renamed from: h */
    public final boolean f52484h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final List<ak7> f52485i;

    /* JADX INFO: renamed from: j */
    public final long f52486j;

    /* JADX INFO: renamed from: k */
    public final long f52487k;

    public /* synthetic */ k2d(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6, jt3 jt3Var) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, j6);
    }

    /* JADX INFO: renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m30638component1J3iCeTQ() {
        return this.f52477a;
    }

    /* JADX INFO: renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m30639component10F1C5BW0() {
        return this.f52486j;
    }

    /* JADX INFO: renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m30640component11F1C5BW0() {
        return this.f52487k;
    }

    public final long component2() {
        return this.f52478b;
    }

    /* JADX INFO: renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m30641component3F1C5BW0() {
        return this.f52479c;
    }

    /* JADX INFO: renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m30642component4F1C5BW0() {
        return this.f52480d;
    }

    public final boolean component5() {
        return this.f52481e;
    }

    public final float component6() {
        return this.f52482f;
    }

    /* JADX INFO: renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m30643component7T8wyACA() {
        return this.f52483g;
    }

    public final boolean component8() {
        return this.f52484h;
    }

    @yfb
    public final List<ak7> component9() {
        return this.f52485i;
    }

    @yfb
    /* JADX INFO: renamed from: copy-rc8HELY, reason: not valid java name */
    public final k2d m30644copyrc8HELY(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, @yfb List<ak7> list, long j5, long j6) {
        return new k2d(j, j2, j3, j4, z, f, i, z2, list, j5, j6, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2d)) {
            return false;
        }
        k2d k2dVar = (k2d) obj;
        return f2d.m28883equalsimpl0(this.f52477a, k2dVar.f52477a) && this.f52478b == k2dVar.f52478b && izb.m30426equalsimpl0(this.f52479c, k2dVar.f52479c) && izb.m30426equalsimpl0(this.f52480d, k2dVar.f52480d) && this.f52481e == k2dVar.f52481e && Float.compare(this.f52482f, k2dVar.f52482f) == 0 && z2d.m33469equalsimpl0(this.f52483g, k2dVar.f52483g) && this.f52484h == k2dVar.f52484h && md8.areEqual(this.f52485i, k2dVar.f52485i) && izb.m30426equalsimpl0(this.f52486j, k2dVar.f52486j) && izb.m30426equalsimpl0(this.f52487k, k2dVar.f52487k);
    }

    public final boolean getActiveHover() {
        return this.f52484h;
    }

    public final boolean getDown() {
        return this.f52481e;
    }

    @yfb
    public final List<ak7> getHistorical() {
        return this.f52485i;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m30645getIdJ3iCeTQ() {
        return this.f52477a;
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m30646getOriginalEventPositionF1C5BW0() {
        return this.f52487k;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m30647getPositionF1C5BW0() {
        return this.f52480d;
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m30648getPositionOnScreenF1C5BW0() {
        return this.f52479c;
    }

    public final float getPressure() {
        return this.f52482f;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m30649getScrollDeltaF1C5BW0() {
        return this.f52486j;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m30650getTypeT8wyACA() {
        return this.f52483g;
    }

    public final long getUptime() {
        return this.f52478b;
    }

    public int hashCode() {
        return (((((((((((((((((((f2d.m28884hashCodeimpl(this.f52477a) * 31) + Long.hashCode(this.f52478b)) * 31) + izb.m30431hashCodeimpl(this.f52479c)) * 31) + izb.m30431hashCodeimpl(this.f52480d)) * 31) + Boolean.hashCode(this.f52481e)) * 31) + Float.hashCode(this.f52482f)) * 31) + z2d.m33470hashCodeimpl(this.f52483g)) * 31) + Boolean.hashCode(this.f52484h)) * 31) + this.f52485i.hashCode()) * 31) + izb.m30431hashCodeimpl(this.f52486j)) * 31) + izb.m30431hashCodeimpl(this.f52487k);
    }

    @yfb
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) f2d.m28885toStringimpl(this.f52477a)) + ", uptime=" + this.f52478b + ", positionOnScreen=" + ((Object) izb.m30437toStringimpl(this.f52479c)) + ", position=" + ((Object) izb.m30437toStringimpl(this.f52480d)) + ", down=" + this.f52481e + ", pressure=" + this.f52482f + ", type=" + ((Object) z2d.m33471toStringimpl(this.f52483g)) + ", activeHover=" + this.f52484h + ", historical=" + this.f52485i + ", scrollDelta=" + ((Object) izb.m30437toStringimpl(this.f52486j)) + ", originalEventPosition=" + ((Object) izb.m30437toStringimpl(this.f52487k)) + ')';
    }

    private k2d(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<ak7> list, long j5, long j6) {
        this.f52477a = j;
        this.f52478b = j2;
        this.f52479c = j3;
        this.f52480d = j4;
        this.f52481e = z;
        this.f52482f = f;
        this.f52483g = i;
        this.f52484h = z2;
        this.f52485i = list;
        this.f52486j = j5;
        this.f52487k = j6;
    }

    public /* synthetic */ k2d(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6, int i2, jt3 jt3Var) {
        this(j, j2, j3, j4, z, f, i, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? new ArrayList() : list, (i2 & 512) != 0 ? izb.f49009b.m30445getZeroF1C5BW0() : j5, (i2 & 1024) != 0 ? izb.f49009b.m30445getZeroF1C5BW0() : j6, null);
    }
}
