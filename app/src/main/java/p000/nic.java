package p000;

import androidx.media3.common.C1213a;
import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class nic implements vte {

    /* JADX INFO: renamed from: a */
    public C1213a f64676a;

    /* JADX INFO: renamed from: b */
    public h2h f64677b;

    /* JADX INFO: renamed from: c */
    public q6h f64678c;

    public nic(String str, String str2) {
        this.f64676a = new C1213a.b().setContainerMimeType(str2).setSampleMimeType(str).build();
    }

    @z25({"timestampAdjuster", "output"})
    private void assertInitialized() {
        v80.checkStateNotNull(this.f64677b);
        t0i.castNonNull(this.f64678c);
    }

    @Override // p000.vte
    public void consume(jhc jhcVar) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.f64677b.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.f64677b.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == -9223372036854775807L || timestampOffsetUs == -9223372036854775807L) {
            return;
        }
        C1213a c1213a = this.f64676a;
        if (timestampOffsetUs != c1213a.f8296t) {
            C1213a c1213aBuild = c1213a.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.f64676a = c1213aBuild;
            this.f64678c.format(c1213aBuild);
        }
        int iBytesLeft = jhcVar.bytesLeft();
        this.f64678c.sampleData(jhcVar, iBytesLeft);
        this.f64678c.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @Override // p000.vte
    public void init(h2h h2hVar, bk5 bk5Var, ckh.C2372e c2372e) {
        this.f64677b = h2hVar;
        c2372e.generateNewId();
        q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 5);
        this.f64678c = q6hVarTrack;
        q6hVarTrack.format(this.f64676a);
    }
}
