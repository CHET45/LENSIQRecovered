package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class it1 implements xdg {

    /* JADX INFO: renamed from: a */
    public final List<o93> f48181a;

    public it1(List<o93> list) {
        this.f48181a = list;
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        return j >= 0 ? this.f48181a : Collections.emptyList();
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
