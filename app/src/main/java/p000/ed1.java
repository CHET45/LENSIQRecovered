package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class ed1 {

    /* JADX INFO: renamed from: a */
    public boolean f32662a;

    /* JADX INFO: renamed from: b */
    public boolean f32663b;

    /* JADX INFO: renamed from: c */
    public c8e f32664c;

    /* JADX INFO: renamed from: d */
    public long f32665d;

    /* JADX INFO: renamed from: e */
    @efb
    public final cn4 f32666e;

    /* JADX INFO: renamed from: f */
    @efb
    public final bd1 f32667f;

    public ed1(@efb cn4 cn4Var, @efb bd1 bd1Var) {
        this.f32666e = cn4Var;
        this.f32667f = bd1Var;
    }

    /* JADX INFO: renamed from: a */
    public lr2 m9886a() {
        return new lr2(this.f32666e, this.f32667f);
    }

    /* JADX INFO: renamed from: b */
    public boolean m9887b(int i, long j, boolean z) {
        return i == 416 && j >= 0 && z;
    }

    public void check() throws IOException {
        bn4 bn4VarDownloadStrategy = e0c.with().downloadStrategy();
        lr2 lr2VarM9886a = m9886a();
        lr2VarM9886a.executeTrial();
        boolean zIsAcceptRange = lr2VarM9886a.isAcceptRange();
        boolean zIsChunked = lr2VarM9886a.isChunked();
        long instanceLength = lr2VarM9886a.getInstanceLength();
        String responseEtag = lr2VarM9886a.getResponseEtag();
        String responseFilename = lr2VarM9886a.getResponseFilename();
        int responseCode = lr2VarM9886a.getResponseCode();
        bn4VarDownloadStrategy.validFilenameFromResponse(responseFilename, this.f32666e, this.f32667f);
        this.f32667f.setChunked(zIsChunked);
        this.f32667f.setEtag(responseEtag);
        if (e0c.with().downloadDispatcher().isFileConflictAfterRun(this.f32666e)) {
            throw ls5.f58606a;
        }
        c8e preconditionFailedCause = bn4VarDownloadStrategy.getPreconditionFailedCause(responseCode, this.f32667f.getTotalOffset() != 0, this.f32667f, responseEtag);
        boolean z = preconditionFailedCause == null;
        this.f32663b = z;
        this.f32664c = preconditionFailedCause;
        this.f32665d = instanceLength;
        this.f32662a = zIsAcceptRange;
        if (m9887b(responseCode, instanceLength, z)) {
            return;
        }
        if (bn4VarDownloadStrategy.isServerCanceled(responseCode, this.f32667f.getTotalOffset() != 0)) {
            throw new d3f(responseCode, this.f32667f.getTotalOffset());
        }
    }

    @hib
    public c8e getCause() {
        return this.f32664c;
    }

    @efb
    public c8e getCauseOrThrow() {
        c8e c8eVar = this.f32664c;
        if (c8eVar != null) {
            return c8eVar;
        }
        throw new IllegalStateException("No cause find with resumable: " + this.f32663b);
    }

    public long getInstanceLength() {
        return this.f32665d;
    }

    public boolean isAcceptRange() {
        return this.f32662a;
    }

    public boolean isResumable() {
        return this.f32663b;
    }

    public String toString() {
        return "acceptRange[" + this.f32662a + "] resumable[" + this.f32663b + "] failedCause[" + this.f32664c + "] instanceLength[" + this.f32665d + "] " + super.toString();
    }
}
