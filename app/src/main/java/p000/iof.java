package p000;

import android.net.Uri;
import p000.aga;
import p000.ih3;
import p000.kq6;
import p000.vna;
import p000.yh3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class iof extends es0 {

    /* JADX INFO: renamed from: C */
    public final yh3 f47795C;

    /* JADX INFO: renamed from: F */
    public final ih3.InterfaceC7283a f47796F;

    /* JADX INFO: renamed from: H */
    public final kq6 f47797H;

    /* JADX INFO: renamed from: L */
    public final long f47798L;

    /* JADX INFO: renamed from: M */
    public final ic9 f47799M;

    /* JADX INFO: renamed from: N */
    public final boolean f47800N;

    /* JADX INFO: renamed from: Q */
    public final t1h f47801Q;

    /* JADX INFO: renamed from: X */
    public final aga f47802X;

    /* JADX INFO: renamed from: Y */
    @hib
    public pdh f47803Y;

    /* JADX INFO: renamed from: iof$b */
    public static final class C7546b {

        /* JADX INFO: renamed from: a */
        public final ih3.InterfaceC7283a f47804a;

        /* JADX INFO: renamed from: b */
        public ic9 f47805b = new nw3();

        /* JADX INFO: renamed from: c */
        public boolean f47806c = true;

        /* JADX INFO: renamed from: d */
        @hib
        public Object f47807d;

        /* JADX INFO: renamed from: e */
        @hib
        public String f47808e;

        public C7546b(ih3.InterfaceC7283a interfaceC7283a) {
            this.f47804a = (ih3.InterfaceC7283a) u80.checkNotNull(interfaceC7283a);
        }

        public iof createMediaSource(aga.C0243k c0243k, long j) {
            return new iof(this.f47808e, c0243k, this.f47804a, j, this.f47805b, this.f47806c, this.f47807d);
        }

        @op1
        public C7546b setLoadErrorHandlingPolicy(@hib ic9 ic9Var) {
            if (ic9Var == null) {
                ic9Var = new nw3();
            }
            this.f47805b = ic9Var;
            return this;
        }

        @op1
        public C7546b setTag(@hib Object obj) {
            this.f47807d = obj;
            return this;
        }

        @op1
        @Deprecated
        public C7546b setTrackId(@hib String str) {
            this.f47808e = str;
            return this;
        }

        @op1
        public C7546b setTreatLoadErrorsAsEndOfStream(boolean z) {
            this.f47806c = z;
            return this;
        }
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        return new fof(this.f47795C, this.f47796F, this.f47803Y, this.f47797H, this.f47798L, this.f47799M, m10216e(c14175b), this.f47800N);
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return this.f47802X;
    }

    @Override // p000.es0
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        this.f47803Y = pdhVar;
        m10220l(this.f47801Q);
    }

    @Override // p000.vna
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        ((fof) njaVar).release();
    }

    @Override // p000.es0
    public void releaseSourceInternal() {
    }

    private iof(@hib String str, aga.C0243k c0243k, ih3.InterfaceC7283a interfaceC7283a, long j, ic9 ic9Var, boolean z, @hib Object obj) {
        this.f47796F = interfaceC7283a;
        this.f47798L = j;
        this.f47799M = ic9Var;
        this.f47800N = z;
        aga agaVarBuild = new aga.C0235c().setUri(Uri.EMPTY).setMediaId(c0243k.f1570a.toString()).setSubtitleConfigurations(kx7.m15111of(c0243k)).setTag(obj).build();
        this.f47802X = agaVarBuild;
        kq6.C8497b label = new kq6.C8497b().setSampleMimeType((String) yya.firstNonNull(c0243k.f1571b, "text/x-unknown")).setLanguage(c0243k.f1572c).setSelectionFlags(c0243k.f1573d).setRoleFlags(c0243k.f1574e).setLabel(c0243k.f1575f);
        String str2 = c0243k.f1576m;
        this.f47797H = label.setId(str2 == null ? str : str2).build();
        this.f47795C = new yh3.C15662b().setUri(c0243k.f1570a).setFlags(1).build();
        this.f47801Q = new snf(j, true, false, false, (Object) null, agaVarBuild);
    }
}
