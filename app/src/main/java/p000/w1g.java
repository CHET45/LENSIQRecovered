package p000;

import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class w1g implements bk5 {

    /* JADX INFO: renamed from: a */
    public final long f93116a;

    /* JADX INFO: renamed from: b */
    public final bk5 f93117b;

    /* JADX INFO: renamed from: w1g$a */
    public class C14362a extends ft6 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gue f93118e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14362a(gue gueVar, gue gueVar2) {
            super(gueVar);
            this.f93118e = gueVar2;
        }

        @Override // p000.ft6, p000.gue
        public gue.C6548a getSeekPoints(long j) {
            gue.C6548a seekPoints = this.f93118e.getSeekPoints(j);
            lue lueVar = seekPoints.f41218a;
            lue lueVar2 = new lue(lueVar.f58833a, lueVar.f58834b + w1g.this.f93116a);
            lue lueVar3 = seekPoints.f41219b;
            return new gue.C6548a(lueVar2, new lue(lueVar3.f58833a, lueVar3.f58834b + w1g.this.f93116a));
        }
    }

    public w1g(long j, bk5 bk5Var) {
        this.f93116a = j;
        this.f93117b = bk5Var;
    }

    @Override // p000.bk5
    public void endTracks() {
        this.f93117b.endTracks();
    }

    @Override // p000.bk5
    public void seekMap(gue gueVar) {
        this.f93117b.seekMap(new C14362a(gueVar, gueVar));
    }

    @Override // p000.bk5
    public q6h track(int i, int i2) {
        return this.f93117b.track(i, i2);
    }
}
