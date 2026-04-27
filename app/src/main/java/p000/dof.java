package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public final class dof extends yr0 {

    /* JADX INFO: renamed from: o */
    public final int f30293o;

    /* JADX INFO: renamed from: p */
    public final C1213a f30294p;

    /* JADX INFO: renamed from: q */
    public long f30295q;

    /* JADX INFO: renamed from: r */
    public boolean f30296r;

    public dof(gh3 gh3Var, xh3 xh3Var, C1213a c1213a, int i, @hib Object obj, long j, long j2, long j3, int i2, C1213a c1213a2) {
        super(gh3Var, xh3Var, c1213a, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f30293o = i2;
        this.f30294p = c1213a2;
    }

    @Override // p000.uc9.InterfaceC13493e
    public void cancelLoad() {
    }

    @Override // p000.yca
    public boolean isLoadCompleted() {
        return this.f30296r;
    }

    @Override // p000.uc9.InterfaceC13493e
    public void load() throws IOException {
        cs0 cs0VarM26305a = m26305a();
        cs0VarM26305a.setSampleOffsetUs(0L);
        q6h q6hVarTrack = cs0VarM26305a.track(0, this.f30293o);
        q6hVarTrack.format(this.f30294p);
        try {
            long jOpen = this.f41850i.open(this.f41843b.subrange(this.f30295q));
            if (jOpen != -1) {
                jOpen += this.f30295q;
            }
            xu3 xu3Var = new xu3(this.f41850i, this.f30295q, jOpen);
            for (int iSampleData = 0; iSampleData != -1; iSampleData = q6hVarTrack.sampleData((bh3) xu3Var, Integer.MAX_VALUE, true)) {
                this.f30295q += (long) iSampleData;
            }
            q6hVarTrack.sampleMetadata(this.f41848g, 1, (int) this.f30295q, 0, null);
            wh3.closeQuietly(this.f41850i);
            this.f30296r = true;
        } catch (Throwable th) {
            wh3.closeQuietly(this.f41850i);
            throw th;
        }
    }
}
