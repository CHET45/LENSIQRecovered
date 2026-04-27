package p000;

import androidx.compose.foundation.layout.C0648y;

/* JADX INFO: loaded from: classes.dex */
@f0g
@ah5
public final class u9c {

    /* JADX INFO: renamed from: c */
    public static final int f87201c = 0;

    /* JADX INFO: renamed from: a */
    public final long f87202a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final vac f87203b;

    public /* synthetic */ u9c(long j, vac vacVar, jt3 jt3Var) {
        this(j, vacVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!md8.areEqual(u9c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        u9c u9cVar = (u9c) obj;
        return w82.m32952equalsimpl0(this.f87202a, u9cVar.f87202a) && md8.areEqual(this.f87203b, u9cVar.f87203b);
    }

    @yfb
    public final vac getDrawPadding() {
        return this.f87203b;
    }

    /* JADX INFO: renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m32582getGlowColor0d7_KjU() {
        return this.f87202a;
    }

    public int hashCode() {
        return (w82.m32958hashCodeimpl(this.f87202a) * 31) + this.f87203b.hashCode();
    }

    @yfb
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) w82.m32959toStringimpl(this.f87202a)) + ", drawPadding=" + this.f87203b + ')';
    }

    private u9c(long j, vac vacVar) {
        this.f87202a = j;
        this.f87203b = vacVar;
    }

    public /* synthetic */ u9c(long j, vac vacVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? j92.Color(4284900966L) : j, (i & 2) != 0 ? C0648y.m27461PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : vacVar, null);
    }
}
