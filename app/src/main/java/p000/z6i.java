package p000;

import p000.t6i;

/* JADX INFO: loaded from: classes3.dex */
public final class z6i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16021a f104301a;

    /* JADX INFO: renamed from: b */
    public final t6i f104302b;

    /* JADX INFO: renamed from: k */
    public long f104311k;

    /* JADX INFO: renamed from: c */
    public final t6i.C12940b f104303c = new t6i.C12940b();

    /* JADX INFO: renamed from: d */
    public final m1h<a8i> f104304d = new m1h<>();

    /* JADX INFO: renamed from: e */
    public final m1h<Long> f104305e = new m1h<>();

    /* JADX INFO: renamed from: f */
    public final tk9 f104306f = new tk9();

    /* JADX INFO: renamed from: g */
    public long f104307g = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public a8i f104310j = a8i.f643h;

    /* JADX INFO: renamed from: h */
    public long f104308h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f104309i = -9223372036854775807L;

    /* JADX INFO: renamed from: z6i$a */
    public interface InterfaceC16021a {
        void dropFrame();

        void onVideoSizeChanged(a8i a8iVar);

        void renderFrame(long j, long j2, boolean z);
    }

    public z6i(InterfaceC16021a interfaceC16021a, t6i t6iVar) {
        this.f104301a = interfaceC16021a;
        this.f104302b = t6iVar;
    }

    private void dropFrame() {
        this.f104306f.remove();
        this.f104301a.dropFrame();
    }

    private static <T> T getLastAndClear(m1h<T> m1hVar) {
        v80.checkArgument(m1hVar.size() > 0);
        while (m1hVar.size() > 1) {
            m1hVar.pollFirst();
        }
        return (T) v80.checkNotNull(m1hVar.pollFirst());
    }

    private boolean maybeUpdateOutputStream(long j) {
        Long lPollFloor = this.f104305e.pollFloor(j);
        if (lPollFloor == null || lPollFloor.longValue() == this.f104311k) {
            return false;
        }
        this.f104311k = lPollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateOutputVideoSize(long j) {
        a8i a8iVarPollFloor = this.f104304d.pollFloor(j);
        if (a8iVarPollFloor == null || a8iVarPollFloor.equals(a8i.f643h) || a8iVarPollFloor.equals(this.f104310j)) {
            return false;
        }
        this.f104310j = a8iVarPollFloor;
        return true;
    }

    private void renderFrame(boolean z) {
        long jRemove = this.f104306f.remove();
        if (maybeUpdateOutputVideoSize(jRemove)) {
            this.f104301a.onVideoSizeChanged(this.f104310j);
        }
        this.f104301a.renderFrame(z ? j52.f49539a.nanoTime() : this.f104303c.getReleaseTimeNs(), jRemove, this.f104302b.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        this.f104306f.clear();
        this.f104307g = -9223372036854775807L;
        this.f104308h = -9223372036854775807L;
        this.f104309i = -9223372036854775807L;
        if (this.f104305e.size() > 0) {
            this.f104311k = ((Long) getLastAndClear(this.f104305e)).longValue();
        }
        if (this.f104304d.size() > 0) {
            this.f104304d.add(0L, (a8i) getLastAndClear(this.f104304d));
        }
    }

    public boolean isEnded() {
        long j = this.f104309i;
        return j != -9223372036854775807L && this.f104308h == j;
    }

    public void onFrameAvailableForRendering(long j) {
        this.f104306f.add(j);
        this.f104307g = j;
        this.f104309i = -9223372036854775807L;
    }

    public void onStreamChanged(int i, long j) {
        if (this.f104306f.isEmpty()) {
            this.f104302b.onStreamChanged(i);
            this.f104311k = j;
        } else {
            m1h<Long> m1hVar = this.f104305e;
            long j2 = this.f104307g;
            m1hVar.add(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public void onVideoSizeChanged(int i, int i2) {
        m1h<a8i> m1hVar = this.f104304d;
        long j = this.f104307g;
        m1hVar.add(j == -9223372036854775807L ? 0L : j + 1, new a8i(i, i2));
    }

    public void render(long j, long j2) throws aa5 {
        z6i z6iVar = this;
        while (!z6iVar.f104306f.isEmpty()) {
            long jElement = z6iVar.f104306f.element();
            if (z6iVar.maybeUpdateOutputStream(jElement)) {
                z6iVar.f104302b.onStreamChanged(2);
            }
            int frameReleaseAction = z6iVar.f104302b.getFrameReleaseAction(jElement, j, j2, z6iVar.f104311k, false, false, z6iVar.f104303c);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                z6iVar = this;
                z6iVar.f104308h = jElement;
                z6iVar.renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction == 2 || frameReleaseAction == 3) {
                z6iVar = this;
                z6iVar.f104308h = jElement;
                dropFrame();
            } else if (frameReleaseAction != 4) {
                if (frameReleaseAction != 5) {
                    throw new IllegalStateException(String.valueOf(frameReleaseAction));
                }
                return;
            } else {
                z6iVar = this;
                z6iVar.f104308h = jElement;
            }
        }
    }

    public void signalEndOfInput() {
        if (this.f104307g == -9223372036854775807L) {
            this.f104307g = Long.MIN_VALUE;
            this.f104308h = Long.MIN_VALUE;
        }
        this.f104309i = this.f104307g;
    }
}
