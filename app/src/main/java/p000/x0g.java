package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class x0g implements cda {

    /* JADX INFO: renamed from: a */
    public final j52 f95973a;

    /* JADX INFO: renamed from: b */
    public boolean f95974b;

    /* JADX INFO: renamed from: c */
    public long f95975c;

    /* JADX INFO: renamed from: d */
    public long f95976d;

    /* JADX INFO: renamed from: e */
    public ryc f95977e = ryc.f80104d;

    public x0g(j52 j52Var) {
        this.f95973a = j52Var;
    }

    @Override // p000.cda
    public ryc getPlaybackParameters() {
        return this.f95977e;
    }

    @Override // p000.cda
    public long getPositionUs() {
        long j = this.f95975c;
        if (!this.f95974b) {
            return j;
        }
        long jElapsedRealtime = this.f95973a.elapsedRealtime() - this.f95976d;
        ryc rycVar = this.f95977e;
        return j + (rycVar.f80107a == 1.0f ? t0i.msToUs(jElapsedRealtime) : rycVar.getMediaTimeUsForPlayoutTimeMs(jElapsedRealtime));
    }

    public void resetPosition(long j) {
        this.f95975c = j;
        if (this.f95974b) {
            this.f95976d = this.f95973a.elapsedRealtime();
        }
    }

    @Override // p000.cda
    public void setPlaybackParameters(ryc rycVar) {
        if (this.f95974b) {
            resetPosition(getPositionUs());
        }
        this.f95977e = rycVar;
    }

    public void start() {
        if (this.f95974b) {
            return;
        }
        this.f95976d = this.f95973a.elapsedRealtime();
        this.f95974b = true;
    }

    public void stop() {
        if (this.f95974b) {
            resetPosition(getPositionUs());
            this.f95974b = false;
        }
    }
}
