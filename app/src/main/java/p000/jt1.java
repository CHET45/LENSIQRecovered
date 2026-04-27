package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jt1 implements ydg {

    /* JADX INFO: renamed from: a */
    public final List<n93> f51766a;

    public jt1(List<n93> list) {
        this.f51766a = list;
    }

    @Override // p000.ydg
    public List<n93> getCues(long j) {
        return j >= 0 ? this.f51766a : Collections.emptyList();
    }

    @Override // p000.ydg
    public long getEventTime(int i) {
        v80.checkArgument(i == 0);
        return 0L;
    }

    @Override // p000.ydg
    public int getEventTimeCount() {
        return 1;
    }

    @Override // p000.ydg
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }
}
