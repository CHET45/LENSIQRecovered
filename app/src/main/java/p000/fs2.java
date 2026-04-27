package p000;

/* JADX INFO: loaded from: classes6.dex */
public class fs2 implements es2 {

    /* JADX INFO: renamed from: a */
    public final int f37599a;

    /* JADX INFO: renamed from: b */
    public final int f37600b;

    /* JADX INFO: renamed from: c */
    public final int f37601c;

    public fs2(int i, int i2, int i3) {
        this.f37599a = i;
        this.f37600b = i2;
        this.f37601c = i3;
    }

    @Override // p000.es2
    public int getConnectionInterval() {
        return this.f37599a;
    }

    @Override // p000.es2
    public int getSlaveLatency() {
        return this.f37600b;
    }

    @Override // p000.es2
    public int getSupervisionTimeout() {
        return this.f37601c;
    }
}
