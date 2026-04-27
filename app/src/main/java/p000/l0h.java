package p000;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.List;
import p000.mja;

/* JADX INFO: loaded from: classes3.dex */
public final class l0h implements mja, mja.InterfaceC9368a {

    /* JADX INFO: renamed from: a */
    public final mja f55893a;

    /* JADX INFO: renamed from: b */
    public final long f55894b;

    /* JADX INFO: renamed from: c */
    public mja.InterfaceC9368a f55895c;

    /* JADX INFO: renamed from: l0h$a */
    public static final class C8572a implements mle {

        /* JADX INFO: renamed from: a */
        public final mle f55896a;

        /* JADX INFO: renamed from: b */
        public final long f55897b;

        public C8572a(mle mleVar, long j) {
            this.f55896a = mleVar;
            this.f55897b = j;
        }

        public mle getChildStream() {
            return this.f55896a;
        }

        @Override // p000.mle
        public boolean isReady() {
            return this.f55896a.isReady();
        }

        @Override // p000.mle
        public void maybeThrowError() throws IOException {
            this.f55896a.maybeThrowError();
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            int data = this.f55896a.readData(oq6Var, rl3Var, i);
            if (data == -4) {
                rl3Var.f78610f += this.f55897b;
            }
            return data;
        }

        @Override // p000.mle
        public int skipData(long j) {
            return this.f55896a.skipData(j - this.f55897b);
        }
    }

    public l0h(mja mjaVar, long j) {
        this.f55893a = mjaVar;
        this.f55894b = j;
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        return this.f55893a.continueLoading(c1233k.buildUpon().setPlaybackPositionUs(c1233k.f8755a - this.f55894b).build());
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
        this.f55893a.discardBuffer(j - this.f55894b, z);
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        return this.f55893a.getAdjustedSeekPositionUs(j - this.f55894b, jueVar) + this.f55894b;
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f55893a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f55894b + bufferedPositionUs;
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f55893a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f55894b + nextLoadPositionUs;
    }

    @Override // p000.mja
    public List<StreamKey> getStreamKeys(List<of5> list) {
        return this.f55893a.getStreamKeys(list);
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        return this.f55893a.getTrackGroups();
    }

    public mja getWrappedMediaPeriod() {
        return this.f55893a;
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        return this.f55893a.isLoading();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() throws IOException {
        this.f55893a.maybeThrowPrepareError();
    }

    @Override // p000.mja.InterfaceC9368a
    public void onPrepared(mja mjaVar) {
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f55895c)).onPrepared(this);
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        this.f55895c = interfaceC9368a;
        this.f55893a.prepare(this, j - this.f55894b);
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        long discontinuity = this.f55893a.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f55894b + discontinuity;
    }

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
        this.f55893a.reevaluateBuffer(j - this.f55894b);
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        return this.f55893a.seekToUs(j - this.f55894b) + this.f55894b;
    }

    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        mle[] mleVarArr2 = new mle[mleVarArr.length];
        int i = 0;
        while (true) {
            mle childStream = null;
            if (i >= mleVarArr.length) {
                break;
            }
            C8572a c8572a = (C8572a) mleVarArr[i];
            if (c8572a != null) {
                childStream = c8572a.getChildStream();
            }
            mleVarArr2[i] = childStream;
            i++;
        }
        long jSelectTracks = this.f55893a.selectTracks(of5VarArr, zArr, mleVarArr2, zArr2, j - this.f55894b);
        for (int i2 = 0; i2 < mleVarArr.length; i2++) {
            mle mleVar = mleVarArr2[i2];
            if (mleVar == null) {
                mleVarArr[i2] = null;
            } else {
                mle mleVar2 = mleVarArr[i2];
                if (mleVar2 == null || ((C8572a) mleVar2).getChildStream() != mleVar) {
                    mleVarArr[i2] = new C8572a(mleVar, this.f55894b);
                }
            }
        }
        return jSelectTracks + this.f55894b;
    }

    @Override // p000.yye.InterfaceC15893a
    public void onContinueLoadingRequested(mja mjaVar) {
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f55895c)).onContinueLoadingRequested(this);
    }
}
