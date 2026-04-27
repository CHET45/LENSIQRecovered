package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class cof extends xr0 {

    /* JADX INFO: renamed from: o */
    public final int f17283o;

    /* JADX INFO: renamed from: p */
    public final kq6 f17284p;

    /* JADX INFO: renamed from: q */
    public long f17285q;

    /* JADX INFO: renamed from: r */
    public boolean f17286r;

    public cof(ih3 ih3Var, yh3 yh3Var, kq6 kq6Var, int i, @hib Object obj, long j, long j2, long j3, int i2, kq6 kq6Var2) {
        super(ih3Var, yh3Var, kq6Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f17283o = i2;
        this.f17284p = kq6Var2;
    }

    @Override // p000.vc9.InterfaceC13997e
    public void cancelLoad() {
    }

    @Override // p000.xca
    public boolean isLoadCompleted() {
        return this.f17286r;
    }

    @Override // p000.vc9.InterfaceC13997e
    public void load() throws IOException {
        bs0 bs0VarM25420a = m25420a();
        bs0VarM25420a.setSampleOffsetUs(0L);
        r6h r6hVarTrack = bs0VarM25420a.track(0, this.f17283o);
        r6hVarTrack.format(this.f17284p);
        try {
            long jOpen = this.f38051i.open(this.f38044b.subrange(this.f17285q));
            if (jOpen != -1) {
                jOpen += this.f17285q;
            }
            wu3 wu3Var = new wu3(this.f38051i, this.f17285q, jOpen);
            for (int iSampleData = 0; iSampleData != -1; iSampleData = r6hVarTrack.sampleData((ah3) wu3Var, Integer.MAX_VALUE, true)) {
                this.f17285q += (long) iSampleData;
            }
            r6hVarTrack.sampleMetadata(this.f38049g, 1, (int) this.f17285q, 0, null);
            vh3.closeQuietly(this.f38051i);
            this.f17286r = true;
        } catch (Throwable th) {
            vh3.closeQuietly(this.f38051i);
            throw th;
        }
    }
}
