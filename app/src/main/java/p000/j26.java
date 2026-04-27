package p000;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j26 extends ou0 {

    /* JADX INFO: renamed from: j */
    public final int f49413j;

    /* JADX INFO: renamed from: k */
    @hib
    public final Object f49414k;

    public j26(g6h g6hVar, int i) {
        this(g6hVar, i, 0);
    }

    @Override // p000.pf5
    public int getSelectedIndex() {
        return 0;
    }

    @Override // p000.pf5
    @hib
    public Object getSelectionData() {
        return this.f49414k;
    }

    @Override // p000.pf5
    public int getSelectionReason() {
        return this.f49413j;
    }

    @Override // p000.pf5
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends xca> list, ada[] adaVarArr) {
    }

    public j26(g6h g6hVar, int i, int i2) {
        this(g6hVar, i, i2, 0, null);
    }

    public j26(g6h g6hVar, int i, int i2, int i3, @hib Object obj) {
        super(g6hVar, new int[]{i}, i2);
        this.f49413j = i3;
        this.f49414k = obj;
    }
}
