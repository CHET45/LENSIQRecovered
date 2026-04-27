package p000;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class st4 implements xdg {

    /* JADX INFO: renamed from: a */
    public final List<o93> f82812a;

    public st4(List<o93> list) {
        this.f82812a = list;
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        return this.f82812a;
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        return 0L;
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return 1;
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        return -1;
    }
}
