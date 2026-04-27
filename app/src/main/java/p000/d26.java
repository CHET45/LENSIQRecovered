package p000;

import p000.p99;

/* JADX INFO: loaded from: classes4.dex */
public class d26<T> implements p99.InterfaceC10860b<T> {

    /* JADX INFO: renamed from: a */
    public final int[] f28261a;

    public d26(int i, int i2) {
        this.f28261a = new int[]{i, i2};
    }

    @Override // p000.p99.InterfaceC10860b
    @hib
    public int[] getPreloadSize(@efb T t, int i, int i2) {
        return this.f28261a;
    }
}
