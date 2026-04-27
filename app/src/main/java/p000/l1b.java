package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l1b implements xdg {

    /* JADX INFO: renamed from: a */
    public final List<o93> f55938a;

    public l1b(List<o93> list) {
        this.f55938a = Collections.unmodifiableList(list);
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        return j >= 0 ? this.f55938a : Collections.emptyList();
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        u80.checkArgument(i == 0);
        return 0L;
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return 1;
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }
}
