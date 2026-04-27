package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b0g implements xdg {

    /* JADX INFO: renamed from: a */
    public final List<List<o93>> f12349a;

    /* JADX INFO: renamed from: b */
    public final List<Long> f12350b;

    public b0g(List<List<o93>> list, List<Long> list2) {
        this.f12349a = list;
        this.f12350b = list2;
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        int iBinarySearchFloor = x0i.binarySearchFloor((List<? extends Comparable<? super Long>>) this.f12350b, Long.valueOf(j), true, false);
        return iBinarySearchFloor == -1 ? Collections.emptyList() : this.f12349a.get(iBinarySearchFloor);
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        u80.checkArgument(i >= 0);
        u80.checkArgument(i < this.f12350b.size());
        return this.f12350b.get(i).longValue();
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return this.f12350b.size();
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = x0i.binarySearchCeil((List<? extends Comparable<? super Long>>) this.f12350b, Long.valueOf(j), false, false);
        if (iBinarySearchCeil < this.f12350b.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
