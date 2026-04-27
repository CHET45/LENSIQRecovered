package p000;

import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mic implements ute {

    /* JADX INFO: renamed from: a */
    public kq6 f61076a;

    /* JADX INFO: renamed from: b */
    public g2h f61077b;

    /* JADX INFO: renamed from: c */
    public r6h f61078c;

    public mic(String str) {
        this.f61076a = new kq6.C8497b().setSampleMimeType(str).build();
    }

    @z25({"timestampAdjuster", "output"})
    private void assertInitialized() {
        u80.checkStateNotNull(this.f61077b);
        x0i.castNonNull(this.f61078c);
    }

    @Override // p000.ute
    public void consume(ihc ihcVar) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.f61077b.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.f61077b.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == -9223372036854775807L || timestampOffsetUs == -9223372036854775807L) {
            return;
        }
        kq6 kq6Var = this.f61076a;
        if (timestampOffsetUs != kq6Var.f54995Y) {
            kq6 kq6VarBuild = kq6Var.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.f61076a = kq6VarBuild;
            this.f61078c.format(kq6VarBuild);
        }
        int iBytesLeft = ihcVar.bytesLeft();
        this.f61078c.sampleData(ihcVar, iBytesLeft);
        this.f61078c.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @Override // p000.ute
    public void init(g2h g2hVar, ck5 ck5Var, dkh.C4838e c4838e) {
        this.f61077b = g2hVar;
        c4838e.generateNewId();
        r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 5);
        this.f61078c = r6hVarTrack;
        r6hVarTrack.format(this.f61076a);
    }
}
