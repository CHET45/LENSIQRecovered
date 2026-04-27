package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w0g implements bda {

    /* JADX INFO: renamed from: a */
    public final h52 f93049a;

    /* JADX INFO: renamed from: b */
    public boolean f93050b;

    /* JADX INFO: renamed from: c */
    public long f93051c;

    /* JADX INFO: renamed from: d */
    public long f93052d;

    /* JADX INFO: renamed from: e */
    public qyc f93053e = qyc.f76311d;

    public w0g(h52 h52Var) {
        this.f93049a = h52Var;
    }

    @Override // p000.bda
    public qyc getPlaybackParameters() {
        return this.f93053e;
    }

    @Override // p000.bda
    public long getPositionUs() {
        long j = this.f93051c;
        if (!this.f93050b) {
            return j;
        }
        long jElapsedRealtime = this.f93049a.elapsedRealtime() - this.f93052d;
        qyc qycVar = this.f93053e;
        return j + (qycVar.f76315a == 1.0f ? x0i.msToUs(jElapsedRealtime) : qycVar.getMediaTimeUsForPlayoutTimeMs(jElapsedRealtime));
    }

    public void resetPosition(long j) {
        this.f93051c = j;
        if (this.f93050b) {
            this.f93052d = this.f93049a.elapsedRealtime();
        }
    }

    @Override // p000.bda
    public void setPlaybackParameters(qyc qycVar) {
        if (this.f93050b) {
            resetPosition(getPositionUs());
        }
        this.f93053e = qycVar;
    }

    public void start() {
        if (this.f93050b) {
            return;
        }
        this.f93052d = this.f93049a.elapsedRealtime();
        this.f93050b = true;
    }

    public void stop() {
        if (this.f93050b) {
            resetPosition(getPositionUs());
            this.f93050b = false;
        }
    }
}
