package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class sw3 implements bda {

    /* JADX INFO: renamed from: a */
    public final w0g f83119a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12811a f83120b;

    /* JADX INFO: renamed from: c */
    @hib
    public n1e f83121c;

    /* JADX INFO: renamed from: d */
    @hib
    public bda f83122d;

    /* JADX INFO: renamed from: e */
    public boolean f83123e = true;

    /* JADX INFO: renamed from: f */
    public boolean f83124f;

    /* JADX INFO: renamed from: sw3$a */
    public interface InterfaceC12811a {
        void onPlaybackParametersChanged(qyc qycVar);
    }

    public sw3(InterfaceC12811a interfaceC12811a, h52 h52Var) {
        this.f83120b = interfaceC12811a;
        this.f83119a = new w0g(h52Var);
    }

    private boolean shouldUseStandaloneClock(boolean z) {
        n1e n1eVar = this.f83121c;
        return n1eVar == null || n1eVar.isEnded() || (!this.f83121c.isReady() && (z || this.f83121c.hasReadStreamToEnd()));
    }

    private void syncClocks(boolean z) {
        if (shouldUseStandaloneClock(z)) {
            this.f83123e = true;
            if (this.f83124f) {
                this.f83119a.start();
                return;
            }
            return;
        }
        bda bdaVar = (bda) u80.checkNotNull(this.f83122d);
        long positionUs = bdaVar.getPositionUs();
        if (this.f83123e) {
            if (positionUs < this.f83119a.getPositionUs()) {
                this.f83119a.stop();
                return;
            } else {
                this.f83123e = false;
                if (this.f83124f) {
                    this.f83119a.start();
                }
            }
        }
        this.f83119a.resetPosition(positionUs);
        qyc playbackParameters = bdaVar.getPlaybackParameters();
        if (playbackParameters.equals(this.f83119a.getPlaybackParameters())) {
            return;
        }
        this.f83119a.setPlaybackParameters(playbackParameters);
        this.f83120b.onPlaybackParametersChanged(playbackParameters);
    }

    @Override // p000.bda
    public qyc getPlaybackParameters() {
        bda bdaVar = this.f83122d;
        return bdaVar != null ? bdaVar.getPlaybackParameters() : this.f83119a.getPlaybackParameters();
    }

    @Override // p000.bda
    public long getPositionUs() {
        return this.f83123e ? this.f83119a.getPositionUs() : ((bda) u80.checkNotNull(this.f83122d)).getPositionUs();
    }

    public void onRendererDisabled(n1e n1eVar) {
        if (n1eVar == this.f83121c) {
            this.f83122d = null;
            this.f83121c = null;
            this.f83123e = true;
        }
    }

    public void onRendererEnabled(n1e n1eVar) throws ba5 {
        bda bdaVar;
        bda mediaClock = n1eVar.getMediaClock();
        if (mediaClock == null || mediaClock == (bdaVar = this.f83122d)) {
            return;
        }
        if (bdaVar != null) {
            throw ba5.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f83122d = mediaClock;
        this.f83121c = n1eVar;
        mediaClock.setPlaybackParameters(this.f83119a.getPlaybackParameters());
    }

    public void resetPosition(long j) {
        this.f83119a.resetPosition(j);
    }

    @Override // p000.bda
    public void setPlaybackParameters(qyc qycVar) {
        bda bdaVar = this.f83122d;
        if (bdaVar != null) {
            bdaVar.setPlaybackParameters(qycVar);
            qycVar = this.f83122d.getPlaybackParameters();
        }
        this.f83119a.setPlaybackParameters(qycVar);
    }

    public void start() {
        this.f83124f = true;
        this.f83119a.start();
    }

    public void stop() {
        this.f83124f = false;
        this.f83119a.stop();
    }

    public long syncAndGetPositionUs(boolean z) {
        syncClocks(z);
        return getPositionUs();
    }
}
