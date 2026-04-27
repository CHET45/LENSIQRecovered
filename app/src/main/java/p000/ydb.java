package p000;

import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.InterfaceC1254q;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.io.IOException;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class ydb implements InterfaceC1254q, InterfaceC1255s {

    /* JADX INFO: renamed from: a */
    public s1e f101241a;

    /* JADX INFO: renamed from: b */
    public int f101242b;

    /* JADX INFO: renamed from: c */
    public int f101243c;

    /* JADX INFO: renamed from: d */
    @hib
    public mle f101244d;

    /* JADX INFO: renamed from: e */
    public boolean f101245e;

    @hib
    /* JADX INFO: renamed from: a */
    public final s1e m25870a() {
        return this.f101241a;
    }

    /* JADX INFO: renamed from: b */
    public final int m25871b() {
        return this.f101242b;
    }

    /* JADX INFO: renamed from: c */
    public void m25872c() {
    }

    /* JADX INFO: renamed from: d */
    public void m25873d(boolean z) throws aa5 {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void disable() {
        v80.checkState(this.f101243c == 1);
        this.f101243c = 0;
        this.f101244d = null;
        this.f101245e = false;
        m25872c();
    }

    /* JADX INFO: renamed from: e */
    public void m25874e(long j, boolean z) throws aa5 {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void enable(s1e s1eVar, C1213a[] c1213aArr, mle mleVar, long j, boolean z, boolean z2, long j2, long j3, una.C13612b c13612b) throws aa5 {
        v80.checkState(this.f101243c == 0);
        this.f101241a = s1eVar;
        this.f101243c = 1;
        m25873d(z);
        replaceStream(c1213aArr, mleVar, j2, j3, c13612b);
        m25874e(j, z);
    }

    /* JADX INFO: renamed from: f */
    public void m25875f(long j) throws aa5 {
    }

    /* JADX INFO: renamed from: g */
    public void m25876g() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final InterfaceC1255s getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    @hib
    public cda getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final int getState() {
        return this.f101243c;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    @hib
    public final mle getStream() {
        return this.f101244d;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q, androidx.media3.exoplayer.InterfaceC1255s
    public final int getTrackType() {
        return -2;
    }

    /* JADX INFO: renamed from: h */
    public void m25877h() throws aa5 {
    }

    @Override // androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m25878i() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void init(int i, j0d j0dVar, j52 j52Var) {
        this.f101242b = i;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final boolean isCurrentStreamFinal() {
        return this.f101245e;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void maybeThrowStreamError() throws IOException {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void replaceStream(C1213a[] c1213aArr, mle mleVar, long j, long j2, una.C13612b c13612b) throws aa5 {
        v80.checkState(!this.f101245e);
        this.f101244d = mleVar;
        m25875f(j2);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void reset() {
        v80.checkState(this.f101243c == 0);
        m25876g();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void resetPosition(long j) throws aa5 {
        this.f101245e = false;
        m25874e(j, false);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void setCurrentStreamFinal() {
        this.f101245e = true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void setTimeline(q1h q1hVar) {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void start() throws aa5 {
        v80.checkState(this.f101243c == 1);
        this.f101243c = 2;
        m25877h();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final void stop() {
        v80.checkState(this.f101243c == 2);
        this.f101243c = 1;
        m25878i();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public int supportsFormat(C1213a c1213a) throws aa5 {
        return InterfaceC1255s.create(0);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public int supportsMixedMimeTypeAdaptation() throws aa5 {
        return 0;
    }
}
