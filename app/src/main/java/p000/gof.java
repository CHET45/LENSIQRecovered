package p000;

import android.net.Uri;
import androidx.media3.common.C1213a;
import java.util.concurrent.Executor;
import p000.gh3;
import p000.gof;
import p000.joa;
import p000.nfa;
import p000.una;
import p000.xh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public final class gof extends fs0 {

    /* JADX INFO: renamed from: C */
    public final xh3 f40667C;

    /* JADX INFO: renamed from: F */
    public final gh3.InterfaceC6313a f40668F;

    /* JADX INFO: renamed from: H */
    public final C1213a f40669H;

    /* JADX INFO: renamed from: L */
    public final long f40670L;

    /* JADX INFO: renamed from: M */
    public final hc9 f40671M;

    /* JADX INFO: renamed from: N */
    public final boolean f40672N;

    /* JADX INFO: renamed from: Q */
    public final q1h f40673Q;

    /* JADX INFO: renamed from: X */
    public final nfa f40674X;

    /* JADX INFO: renamed from: Y */
    @hib
    public final lfg<yxd> f40675Y;

    /* JADX INFO: renamed from: Z */
    @hib
    public qdh f40676Z;

    /* JADX INFO: renamed from: gof$b */
    public static final class C6450b {

        /* JADX INFO: renamed from: a */
        public final gh3.InterfaceC6313a f40677a;

        /* JADX INFO: renamed from: b */
        public hc9 f40678b = new ow3();

        /* JADX INFO: renamed from: c */
        public boolean f40679c = true;

        /* JADX INFO: renamed from: d */
        @hib
        public Object f40680d;

        /* JADX INFO: renamed from: e */
        @hib
        public String f40681e;

        /* JADX INFO: renamed from: f */
        @hib
        public lfg<yxd> f40682f;

        public C6450b(gh3.InterfaceC6313a interfaceC6313a) {
            this.f40677a = (gh3.InterfaceC6313a) v80.checkNotNull(interfaceC6313a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ yxd lambda$setDownloadExecutor$0(lfg lfgVar, qu2 qu2Var) {
            return yxd.from((Executor) lfgVar.get(), qu2Var);
        }

        public gof createMediaSource(nfa.C9859k c9859k, long j) {
            return new gof(this.f40681e, c9859k, this.f40677a, j, this.f40678b, this.f40679c, this.f40680d, this.f40682f);
        }

        @op1
        public <T extends Executor> C6450b setDownloadExecutor(final lfg<T> lfgVar, final qu2<T> qu2Var) {
            this.f40682f = new lfg() { // from class: hof
                @Override // p000.lfg
                public final Object get() {
                    return gof.C6450b.lambda$setDownloadExecutor$0(lfgVar, qu2Var);
                }
            };
            return this;
        }

        @op1
        public C6450b setLoadErrorHandlingPolicy(@hib hc9 hc9Var) {
            if (hc9Var == null) {
                hc9Var = new ow3();
            }
            this.f40678b = hc9Var;
            return this;
        }

        @op1
        public C6450b setTag(@hib Object obj) {
            this.f40680d = obj;
            return this;
        }

        @op1
        @Deprecated
        public C6450b setTrackId(@hib String str) {
            this.f40681e = str;
            return this;
        }

        @op1
        public C6450b setTreatLoadErrorsAsEndOfStream(boolean z) {
            this.f40679c = z;
            return this;
        }
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        xh3 xh3Var = this.f40667C;
        gh3.InterfaceC6313a interfaceC6313a = this.f40668F;
        qdh qdhVar = this.f40676Z;
        C1213a c1213a = this.f40669H;
        long j2 = this.f40670L;
        hc9 hc9Var = this.f40671M;
        joa.C7994a c7994aM11118e = m11118e(c13612b);
        boolean z = this.f40672N;
        lfg<yxd> lfgVar = this.f40675Y;
        return new eof(xh3Var, interfaceC6313a, qdhVar, c1213a, j2, hc9Var, c7994aM11118e, z, lfgVar != null ? lfgVar.get() : null);
    }

    @Override // p000.una
    public nfa getMediaItem() {
        return this.f40674X;
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        this.f40676Z = qdhVar;
        m11123m(this.f40673Q);
    }

    @Override // p000.una
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        ((eof) mjaVar).release();
    }

    @Override // p000.fs0
    public void releaseSourceInternal() {
    }

    private gof(@hib String str, nfa.C9859k c9859k, gh3.InterfaceC6313a interfaceC6313a, long j, hc9 hc9Var, boolean z, @hib Object obj, @hib lfg<yxd> lfgVar) {
        this.f40668F = interfaceC6313a;
        this.f40670L = j;
        this.f40671M = hc9Var;
        this.f40672N = z;
        nfa nfaVarBuild = new nfa.C9851c().setUri(Uri.EMPTY).setMediaId(c9859k.f64433a.toString()).setSubtitleConfigurations(kx7.m15111of(c9859k)).setTag(obj).build();
        this.f40674X = nfaVarBuild;
        C1213a.b label = new C1213a.b().setSampleMimeType((String) yya.firstNonNull(c9859k.f64434b, "text/x-unknown")).setLanguage(c9859k.f64435c).setSelectionFlags(c9859k.f64436d).setRoleFlags(c9859k.f64437e).setLabel(c9859k.f64438f);
        String str2 = c9859k.f64439g;
        this.f40669H = label.setId(str2 == null ? str : str2).build();
        this.f40667C = new xh3.C15067b().setUri(c9859k.f64433a).setFlags(1).build();
        this.f40673Q = new tnf(j, true, false, false, (Object) null, nfaVarBuild);
        this.f40675Y = lfgVar;
    }
}
