package p000;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class usc implements xdg {

    /* JADX INFO: renamed from: a */
    public final List<o93> f89043a;

    public usc(List<o93> list) {
        this.f89043a = list;
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        return this.f89043a;
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
