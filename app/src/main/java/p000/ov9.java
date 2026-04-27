package p000;

import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import p000.mja;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ov9 implements mja, mja.InterfaceC9368a {

    /* JADX INFO: renamed from: C */
    public boolean f68939C;

    /* JADX INFO: renamed from: F */
    public long f68940F = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final una.C13612b f68941a;

    /* JADX INFO: renamed from: b */
    public final long f68942b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5892fn f68943c;

    /* JADX INFO: renamed from: d */
    public una f68944d;

    /* JADX INFO: renamed from: e */
    public mja f68945e;

    /* JADX INFO: renamed from: f */
    @hib
    public mja.InterfaceC9368a f68946f;

    /* JADX INFO: renamed from: m */
    @hib
    public InterfaceC10666a f68947m;

    /* JADX INFO: renamed from: ov9$a */
    public interface InterfaceC10666a {
        void onPrepareComplete(una.C13612b c13612b);

        void onPrepareError(una.C13612b c13612b, IOException iOException);
    }

    public ov9(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        this.f68941a = c13612b;
        this.f68943c = interfaceC5892fn;
        this.f68942b = j;
    }

    private long getPreparePositionWithOverride(long j) {
        long j2 = this.f68940F;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        mja mjaVar = this.f68945e;
        return mjaVar != null && mjaVar.continueLoading(c1233k);
    }

    public void createPeriod(una.C13612b c13612b) {
        long preparePositionWithOverride = getPreparePositionWithOverride(this.f68942b);
        mja mjaVarCreatePeriod = ((una) v80.checkNotNull(this.f68944d)).createPeriod(c13612b, this.f68943c, preparePositionWithOverride);
        this.f68945e = mjaVarCreatePeriod;
        if (this.f68946f != null) {
            mjaVarCreatePeriod.prepare(this, preparePositionWithOverride);
        }
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
        ((mja) t0i.castNonNull(this.f68945e)).discardBuffer(j, z);
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        return ((mja) t0i.castNonNull(this.f68945e)).getAdjustedSeekPositionUs(j, jueVar);
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        return ((mja) t0i.castNonNull(this.f68945e)).getBufferedPositionUs();
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        return ((mja) t0i.castNonNull(this.f68945e)).getNextLoadPositionUs();
    }

    public long getPreparePositionOverrideUs() {
        return this.f68940F;
    }

    public long getPreparePositionUs() {
        return this.f68942b;
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        return ((mja) t0i.castNonNull(this.f68945e)).getTrackGroups();
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        mja mjaVar = this.f68945e;
        return mjaVar != null && mjaVar.isLoading();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() throws IOException {
        try {
            mja mjaVar = this.f68945e;
            if (mjaVar != null) {
                mjaVar.maybeThrowPrepareError();
            } else {
                una unaVar = this.f68944d;
                if (unaVar != null) {
                    unaVar.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (IOException e) {
            InterfaceC10666a interfaceC10666a = this.f68947m;
            if (interfaceC10666a == null) {
                throw e;
            }
            if (this.f68939C) {
                return;
            }
            this.f68939C = true;
            interfaceC10666a.onPrepareError(this.f68941a, e);
        }
    }

    @Override // p000.mja.InterfaceC9368a
    public void onPrepared(mja mjaVar) {
        ((mja.InterfaceC9368a) t0i.castNonNull(this.f68946f)).onPrepared(this);
        InterfaceC10666a interfaceC10666a = this.f68947m;
        if (interfaceC10666a != null) {
            interfaceC10666a.onPrepareComplete(this.f68941a);
        }
    }

    public void overridePreparePositionUs(long j) {
        this.f68940F = j;
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        this.f68946f = interfaceC9368a;
        mja mjaVar = this.f68945e;
        if (mjaVar != null) {
            mjaVar.prepare(this, getPreparePositionWithOverride(this.f68942b));
        }
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        return ((mja) t0i.castNonNull(this.f68945e)).readDiscontinuity();
    }

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
        ((mja) t0i.castNonNull(this.f68945e)).reevaluateBuffer(j);
    }

    public void releasePeriod() {
        if (this.f68945e != null) {
            ((una) v80.checkNotNull(this.f68944d)).releasePeriod(this.f68945e);
        }
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        return ((mja) t0i.castNonNull(this.f68945e)).seekToUs(j);
    }

    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        long j2 = this.f68940F;
        long j3 = (j2 == -9223372036854775807L || j != this.f68942b) ? j : j2;
        this.f68940F = -9223372036854775807L;
        return ((mja) t0i.castNonNull(this.f68945e)).selectTracks(of5VarArr, zArr, mleVarArr, zArr2, j3);
    }

    public void setMediaSource(una unaVar) {
        v80.checkState(this.f68944d == null);
        this.f68944d = unaVar;
    }

    public void setPrepareListener(InterfaceC10666a interfaceC10666a) {
        this.f68947m = interfaceC10666a;
    }

    @Override // p000.yye.InterfaceC15893a
    public void onContinueLoadingRequested(mja mjaVar) {
        ((mja.InterfaceC9368a) t0i.castNonNull(this.f68946f)).onContinueLoadingRequested(this);
    }
}
