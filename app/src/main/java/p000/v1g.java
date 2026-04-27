package p000;

import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v1g implements ck5 {

    /* JADX INFO: renamed from: a */
    public final long f89698a;

    /* JADX INFO: renamed from: b */
    public final ck5 f89699b;

    /* JADX INFO: renamed from: v1g$a */
    public class C13815a implements hue {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ hue f89700d;

        public C13815a(hue hueVar) {
            this.f89700d = hueVar;
        }

        @Override // p000.hue
        public long getDurationUs() {
            return this.f89700d.getDurationUs();
        }

        @Override // p000.hue
        public hue.C7023a getSeekPoints(long j) {
            hue.C7023a seekPoints = this.f89700d.getSeekPoints(j);
            kue kueVar = seekPoints.f44907a;
            kue kueVar2 = new kue(kueVar.f55384a, kueVar.f55385b + v1g.this.f89698a);
            kue kueVar3 = seekPoints.f44908b;
            return new hue.C7023a(kueVar2, new kue(kueVar3.f55384a, kueVar3.f55385b + v1g.this.f89698a));
        }

        @Override // p000.hue
        public boolean isSeekable() {
            return this.f89700d.isSeekable();
        }
    }

    public v1g(long j, ck5 ck5Var) {
        this.f89698a = j;
        this.f89699b = ck5Var;
    }

    @Override // p000.ck5
    public void endTracks() {
        this.f89699b.endTracks();
    }

    @Override // p000.ck5
    public void seekMap(hue hueVar) {
        this.f89699b.seekMap(new C13815a(hueVar));
    }

    @Override // p000.ck5
    public r6h track(int i, int i2) {
        return this.f89699b.track(i, i2);
    }
}
