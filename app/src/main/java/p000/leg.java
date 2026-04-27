package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class leg extends tl3 implements ydg {

    /* JADX INFO: renamed from: e */
    @hib
    public ydg f57409e;

    /* JADX INFO: renamed from: f */
    public long f57410f;

    @Override // p000.tl3, p000.cf1
    public void clear() {
        super.clear();
        this.f57409e = null;
    }

    @Override // p000.ydg
    public List<n93> getCues(long j) {
        return ((ydg) v80.checkNotNull(this.f57409e)).getCues(j - this.f57410f);
    }

    @Override // p000.ydg
    public long getEventTime(int i) {
        return ((ydg) v80.checkNotNull(this.f57409e)).getEventTime(i) + this.f57410f;
    }

    @Override // p000.ydg
    public int getEventTimeCount() {
        return ((ydg) v80.checkNotNull(this.f57409e)).getEventTimeCount();
    }

    @Override // p000.ydg
    public int getNextEventTimeIndex(long j) {
        return ((ydg) v80.checkNotNull(this.f57409e)).getNextEventTimeIndex(j - this.f57410f);
    }

    public void setContent(long j, ydg ydgVar, long j2) {
        this.f85177b = j;
        this.f57409e = ydgVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f57410f = j;
    }
}
