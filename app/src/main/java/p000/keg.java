package p000;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class keg extends ul3 implements xdg {

    /* JADX INFO: renamed from: d */
    @hib
    public xdg f53812d;

    /* JADX INFO: renamed from: e */
    public long f53813e;

    @Override // p000.bf1
    public void clear() {
        super.clear();
        this.f53812d = null;
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        return ((xdg) u80.checkNotNull(this.f53812d)).getCues(j - this.f53813e);
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        return ((xdg) u80.checkNotNull(this.f53812d)).getEventTime(i) + this.f53813e;
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return ((xdg) u80.checkNotNull(this.f53812d)).getEventTimeCount();
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        return ((xdg) u80.checkNotNull(this.f53812d)).getNextEventTimeIndex(j - this.f53813e);
    }

    public void setContent(long j, xdg xdgVar, long j2) {
        this.f88311b = j;
        this.f53812d = xdgVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f53813e = j;
    }
}
