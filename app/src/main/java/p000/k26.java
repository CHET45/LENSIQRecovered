package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class k26 extends pu0 {

    /* JADX INFO: renamed from: k */
    public final int f52450k;

    /* JADX INFO: renamed from: l */
    @hib
    public final Object f52451l;

    public k26(h6h h6hVar, int i) {
        this(h6hVar, i, 0);
    }

    @Override // p000.of5
    public int getSelectedIndex() {
        return 0;
    }

    @Override // p000.of5
    @hib
    public Object getSelectionData() {
        return this.f52451l;
    }

    @Override // p000.of5
    public int getSelectionReason() {
        return this.f52450k;
    }

    @Override // p000.of5
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends yca> list, zca[] zcaVarArr) {
    }

    public k26(h6h h6hVar, int i, int i2) {
        this(h6hVar, i, i2, 0, null);
    }

    public k26(h6h h6hVar, int i, int i2, int i3, @hib Object obj) {
        super(h6hVar, new int[]{i}, i2);
        this.f52450k = i3;
        this.f52451l = obj;
    }
}
