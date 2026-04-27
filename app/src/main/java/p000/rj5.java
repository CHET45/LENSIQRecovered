package p000;

import java.util.Objects;
import p000.nfa;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rj5 extends fs0 {

    /* JADX INFO: renamed from: C */
    public final jj5 f78428C;

    /* JADX INFO: renamed from: F */
    public final long f78429F;

    /* JADX INFO: renamed from: H */
    @xc7("this")
    public nfa f78430H;

    /* JADX INFO: renamed from: rj5$b */
    public static final class C12117b implements una.InterfaceC13611a {

        /* JADX INFO: renamed from: c */
        public final long f78431c;

        /* JADX INFO: renamed from: d */
        public final jj5 f78432d;

        public C12117b(long j, jj5 jj5Var) {
            this.f78431c = j;
            this.f78432d = jj5Var;
        }

        @Override // p000.una.InterfaceC13611a
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @Override // p000.una.InterfaceC13611a
        public una.InterfaceC13611a setDrmSessionManagerProvider(sr4 sr4Var) {
            return this;
        }

        @Override // p000.una.InterfaceC13611a
        public una.InterfaceC13611a setLoadErrorHandlingPolicy(hc9 hc9Var) {
            return this;
        }

        @Override // p000.una.InterfaceC13611a
        public rj5 createMediaSource(nfa nfaVar) {
            return new rj5(nfaVar, this.f78431c, this.f78432d);
        }
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        nfa.C9856h c9856h = nfaVar.f64305b;
        nfa.C9856h c9856h2 = (nfa.C9856h) v80.checkNotNull(getMediaItem().f64305b);
        if (c9856h != null && c9856h.f64406a.equals(c9856h2.f64406a) && Objects.equals(c9856h.f64407b, c9856h2.f64407b)) {
            long j = c9856h.f64415j;
            if (j == -9223372036854775807L || t0i.msToUs(j) == this.f78429F) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        nfa mediaItem = getMediaItem();
        v80.checkNotNull(mediaItem.f64305b);
        v80.checkNotNull(mediaItem.f64305b.f64407b, "Externally loaded mediaItems require a MIME type.");
        nfa.C9856h c9856h = mediaItem.f64305b;
        return new qj5(c9856h.f64406a, c9856h.f64407b, this.f78428C);
    }

    @Override // p000.una
    public synchronized nfa getMediaItem() {
        return this.f78430H;
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        m11123m(new tnf(this.f78429F, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // p000.una
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        ((qj5) mjaVar).releasePeriod();
    }

    @Override // p000.fs0
    public void releaseSourceInternal() {
    }

    @Override // p000.una
    public synchronized void updateMediaItem(nfa nfaVar) {
        this.f78430H = nfaVar;
    }

    private rj5(nfa nfaVar, long j, jj5 jj5Var) {
        this.f78430H = nfaVar;
        this.f78429F = j;
        this.f78428C = jj5Var;
    }
}
