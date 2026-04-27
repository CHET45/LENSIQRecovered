package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qcg implements xdg {

    /* JADX INFO: renamed from: a */
    public final o93[] f73987a;

    /* JADX INFO: renamed from: b */
    public final long[] f73988b;

    public qcg(o93[] o93VarArr, long[] jArr) {
        this.f73987a = o93VarArr;
        this.f73988b = jArr;
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        o93 o93Var;
        int iBinarySearchFloor = x0i.binarySearchFloor(this.f73988b, j, true, false);
        return (iBinarySearchFloor == -1 || (o93Var = this.f73987a[iBinarySearchFloor]) == o93.f66835M1) ? Collections.emptyList() : Collections.singletonList(o93Var);
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        u80.checkArgument(i >= 0);
        u80.checkArgument(i < this.f73988b.length);
        return this.f73988b[i];
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return this.f73988b.length;
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = x0i.binarySearchCeil(this.f73988b, j, false, false);
        if (iBinarySearchCeil < this.f73988b.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
