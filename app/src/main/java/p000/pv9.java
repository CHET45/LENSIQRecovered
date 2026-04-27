package p000;

import java.io.IOException;
import p000.nja;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pv9 implements nja, nja.InterfaceC9906a {

    /* JADX INFO: renamed from: C */
    public boolean f72214C;

    /* JADX INFO: renamed from: F */
    public long f72215F = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final vna.C14175b f72216a;

    /* JADX INFO: renamed from: b */
    public final long f72217b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6430gn f72218c;

    /* JADX INFO: renamed from: d */
    public vna f72219d;

    /* JADX INFO: renamed from: e */
    public nja f72220e;

    /* JADX INFO: renamed from: f */
    @hib
    public nja.InterfaceC9906a f72221f;

    /* JADX INFO: renamed from: m */
    @hib
    public InterfaceC11144a f72222m;

    /* JADX INFO: renamed from: pv9$a */
    public interface InterfaceC11144a {
        void onPrepareComplete(vna.C14175b c14175b);

        void onPrepareError(vna.C14175b c14175b, IOException iOException);
    }

    public pv9(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        this.f72216a = c14175b;
        this.f72218c = interfaceC6430gn;
        this.f72217b = j;
    }

    private long getPreparePositionWithOverride(long j) {
        long j2 = this.f72215F;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // p000.nja, p000.zye
    public boolean continueLoading(long j) {
        nja njaVar = this.f72220e;
        return njaVar != null && njaVar.continueLoading(j);
    }

    public void createPeriod(vna.C14175b c14175b) {
        long preparePositionWithOverride = getPreparePositionWithOverride(this.f72217b);
        nja njaVarCreatePeriod = ((vna) u80.checkNotNull(this.f72219d)).createPeriod(c14175b, this.f72218c, preparePositionWithOverride);
        this.f72220e = njaVarCreatePeriod;
        if (this.f72221f != null) {
            njaVarCreatePeriod.prepare(this, preparePositionWithOverride);
        }
    }

    @Override // p000.nja
    public void discardBuffer(long j, boolean z) {
        ((nja) x0i.castNonNull(this.f72220e)).discardBuffer(j, z);
    }

    @Override // p000.nja
    public long getAdjustedSeekPositionUs(long j, iue iueVar) {
        return ((nja) x0i.castNonNull(this.f72220e)).getAdjustedSeekPositionUs(j, iueVar);
    }

    @Override // p000.nja, p000.zye
    public long getBufferedPositionUs() {
        return ((nja) x0i.castNonNull(this.f72220e)).getBufferedPositionUs();
    }

    @Override // p000.nja, p000.zye
    public long getNextLoadPositionUs() {
        return ((nja) x0i.castNonNull(this.f72220e)).getNextLoadPositionUs();
    }

    public long getPreparePositionOverrideUs() {
        return this.f72215F;
    }

    public long getPreparePositionUs() {
        return this.f72217b;
    }

    @Override // p000.nja
    public m6h getTrackGroups() {
        return ((nja) x0i.castNonNull(this.f72220e)).getTrackGroups();
    }

    @Override // p000.nja, p000.zye
    public boolean isLoading() {
        nja njaVar = this.f72220e;
        return njaVar != null && njaVar.isLoading();
    }

    @Override // p000.nja
    public void maybeThrowPrepareError() throws IOException {
        try {
            nja njaVar = this.f72220e;
            if (njaVar != null) {
                njaVar.maybeThrowPrepareError();
            } else {
                vna vnaVar = this.f72219d;
                if (vnaVar != null) {
                    vnaVar.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (IOException e) {
            InterfaceC11144a interfaceC11144a = this.f72222m;
            if (interfaceC11144a == null) {
                throw e;
            }
            if (this.f72214C) {
                return;
            }
            this.f72214C = true;
            interfaceC11144a.onPrepareError(this.f72216a, e);
        }
    }

    @Override // p000.nja.InterfaceC9906a
    public void onPrepared(nja njaVar) {
        ((nja.InterfaceC9906a) x0i.castNonNull(this.f72221f)).onPrepared(this);
        InterfaceC11144a interfaceC11144a = this.f72222m;
        if (interfaceC11144a != null) {
            interfaceC11144a.onPrepareComplete(this.f72216a);
        }
    }

    public void overridePreparePositionUs(long j) {
        this.f72215F = j;
    }

    @Override // p000.nja
    public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
        this.f72221f = interfaceC9906a;
        nja njaVar = this.f72220e;
        if (njaVar != null) {
            njaVar.prepare(this, getPreparePositionWithOverride(this.f72217b));
        }
    }

    @Override // p000.nja
    public long readDiscontinuity() {
        return ((nja) x0i.castNonNull(this.f72220e)).readDiscontinuity();
    }

    @Override // p000.nja, p000.zye
    public void reevaluateBuffer(long j) {
        ((nja) x0i.castNonNull(this.f72220e)).reevaluateBuffer(j);
    }

    public void releasePeriod() {
        if (this.f72220e != null) {
            ((vna) u80.checkNotNull(this.f72219d)).releasePeriod(this.f72220e);
        }
    }

    @Override // p000.nja
    public long seekToUs(long j) {
        return ((nja) x0i.castNonNull(this.f72220e)).seekToUs(j);
    }

    @Override // p000.nja
    public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f72215F;
        if (j3 == -9223372036854775807L || j != this.f72217b) {
            j2 = j;
        } else {
            this.f72215F = -9223372036854775807L;
            j2 = j3;
        }
        return ((nja) x0i.castNonNull(this.f72220e)).selectTracks(pf5VarArr, zArr, nleVarArr, zArr2, j2);
    }

    public void setMediaSource(vna vnaVar) {
        u80.checkState(this.f72219d == null);
        this.f72219d = vnaVar;
    }

    public void setPrepareListener(InterfaceC11144a interfaceC11144a) {
        this.f72222m = interfaceC11144a;
    }

    @Override // p000.zye.InterfaceC16321a
    public void onContinueLoadingRequested(nja njaVar) {
        ((nja.InterfaceC9906a) x0i.castNonNull(this.f72221f)).onContinueLoadingRequested(this);
    }
}
