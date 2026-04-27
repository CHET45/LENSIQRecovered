package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class xdb implements n1e, p1e {

    /* JADX INFO: renamed from: a */
    public r1e f97556a;

    /* JADX INFO: renamed from: b */
    public int f97557b;

    /* JADX INFO: renamed from: c */
    public int f97558c;

    /* JADX INFO: renamed from: d */
    @hib
    public nle f97559d;

    /* JADX INFO: renamed from: e */
    public boolean f97560e;

    @hib
    /* JADX INFO: renamed from: a */
    public final r1e m25100a() {
        return this.f97556a;
    }

    /* JADX INFO: renamed from: b */
    public final int m25101b() {
        return this.f97557b;
    }

    /* JADX INFO: renamed from: c */
    public void m25102c() {
    }

    /* JADX INFO: renamed from: d */
    public void m25103d(boolean z) throws ba5 {
    }

    @Override // p000.n1e
    public final void disable() {
        u80.checkState(this.f97558c == 1);
        this.f97558c = 0;
        this.f97559d = null;
        this.f97560e = false;
        m25102c();
    }

    /* JADX INFO: renamed from: e */
    public void m25104e(long j, boolean z) throws ba5 {
    }

    @Override // p000.n1e
    public final void enable(r1e r1eVar, kq6[] kq6VarArr, nle nleVar, long j, boolean z, boolean z2, long j2, long j3) throws ba5 {
        u80.checkState(this.f97558c == 0);
        this.f97556a = r1eVar;
        this.f97558c = 1;
        m25103d(z);
        replaceStream(kq6VarArr, nleVar, j2, j3);
        m25104e(j, z);
    }

    /* JADX INFO: renamed from: f */
    public void m25105f(long j) throws ba5 {
    }

    /* JADX INFO: renamed from: g */
    public void m25106g() {
    }

    @Override // p000.n1e
    public final p1e getCapabilities() {
        return this;
    }

    @Override // p000.n1e
    @hib
    public bda getMediaClock() {
        return null;
    }

    @Override // p000.n1e
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // p000.n1e
    public final int getState() {
        return this.f97558c;
    }

    @Override // p000.n1e
    @hib
    public final nle getStream() {
        return this.f97559d;
    }

    @Override // p000.n1e, p000.p1e
    public final int getTrackType() {
        return -2;
    }

    /* JADX INFO: renamed from: h */
    public void m25107h() throws ba5 {
    }

    @Override // p000.l0d.InterfaceC8571b
    public void handleMessage(int i, @hib Object obj) throws ba5 {
    }

    @Override // p000.n1e
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m25108i() {
    }

    @Override // p000.n1e
    public final void init(int i, k0d k0dVar) {
        this.f97557b = i;
    }

    @Override // p000.n1e
    public final boolean isCurrentStreamFinal() {
        return this.f97560e;
    }

    @Override // p000.n1e
    public boolean isEnded() {
        return true;
    }

    @Override // p000.n1e
    public boolean isReady() {
        return true;
    }

    @Override // p000.n1e
    public final void maybeThrowStreamError() throws IOException {
    }

    @Override // p000.n1e
    public final void replaceStream(kq6[] kq6VarArr, nle nleVar, long j, long j2) throws ba5 {
        u80.checkState(!this.f97560e);
        this.f97559d = nleVar;
        m25105f(j2);
    }

    @Override // p000.n1e
    public final void reset() {
        u80.checkState(this.f97558c == 0);
        m25106g();
    }

    @Override // p000.n1e
    public final void resetPosition(long j) throws ba5 {
        this.f97560e = false;
        m25104e(j, false);
    }

    @Override // p000.n1e
    public final void setCurrentStreamFinal() {
        this.f97560e = true;
    }

    @Override // p000.n1e
    public final void start() throws ba5 {
        u80.checkState(this.f97558c == 1);
        this.f97558c = 2;
        m25107h();
    }

    @Override // p000.n1e
    public final void stop() {
        u80.checkState(this.f97558c == 2);
        this.f97558c = 1;
        m25108i();
    }

    @Override // p000.p1e
    public int supportsFormat(kq6 kq6Var) throws ba5 {
        return p1e.create(0);
    }

    @Override // p000.p1e
    public int supportsMixedMimeTypeAdaptation() throws ba5 {
        return 0;
    }
}
