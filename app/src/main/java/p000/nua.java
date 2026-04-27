package p000;

import java.util.concurrent.atomic.AtomicReference;
import p000.fr6;
import p000.gr6;
import p000.w22;

/* JADX INFO: loaded from: classes7.dex */
public final class nua {

    /* JADX INFO: renamed from: nua$a */
    public static final class C10062a implements d42 {

        /* JADX INFO: renamed from: a */
        public final fta f65710a;

        /* JADX INFO: renamed from: nua$a$a */
        public final class a<ReqT, RespT> extends fr6.AbstractC5940a<ReqT, RespT> {
            public a(w22<ReqT, RespT> w22Var) {
                super(w22Var);
            }

            @Override // p000.fr6, p000.w22
            public void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
                ftaVar.merge(C10062a.this.f65710a);
                super.start(abstractC14364a, ftaVar);
            }
        }

        public C10062a(fta ftaVar) {
            this.f65710a = (fta) v7d.checkNotNull(ftaVar, "extraHeaders");
        }

        @Override // p000.d42
        public <ReqT, RespT> w22<ReqT, RespT> interceptCall(rua<ReqT, RespT> ruaVar, rn1 rn1Var, bu1 bu1Var) {
            return new a(bu1Var.newCall(ruaVar, rn1Var));
        }
    }

    /* JADX INFO: renamed from: nua$b */
    public static final class C10063b implements d42 {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<fta> f65712a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fta> f65713b;

        /* JADX INFO: renamed from: nua$b$a */
        public final class a<ReqT, RespT> extends fr6.AbstractC5940a<ReqT, RespT> {

            /* JADX INFO: renamed from: nua$b$a$a, reason: collision with other inner class name */
            public final class C16494a extends gr6.AbstractC6471a<RespT> {
                public C16494a(w22.AbstractC14364a<RespT> abstractC14364a) {
                    super(abstractC14364a);
                }

                @Override // p000.gr6.AbstractC6471a, p000.gr6, p000.fic, p000.w22.AbstractC14364a
                public void onClose(n4g n4gVar, fta ftaVar) {
                    C10063b.this.f65713b.set(ftaVar);
                    super.onClose(n4gVar, ftaVar);
                }

                @Override // p000.gr6.AbstractC6471a, p000.gr6, p000.fic, p000.w22.AbstractC14364a
                public void onHeaders(fta ftaVar) {
                    C10063b.this.f65712a.set(ftaVar);
                    super.onHeaders(ftaVar);
                }
            }

            public a(w22<ReqT, RespT> w22Var) {
                super(w22Var);
            }

            @Override // p000.fr6, p000.w22
            public void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
                C10063b.this.f65712a.set(null);
                C10063b.this.f65713b.set(null);
                super.start(new C16494a(abstractC14364a), ftaVar);
            }
        }

        public C10063b(AtomicReference<fta> atomicReference, AtomicReference<fta> atomicReference2) {
            this.f65712a = (AtomicReference) v7d.checkNotNull(atomicReference, "headersCapture");
            this.f65713b = (AtomicReference) v7d.checkNotNull(atomicReference2, "trailersCapture");
        }

        @Override // p000.d42
        public <ReqT, RespT> w22<ReqT, RespT> interceptCall(rua<ReqT, RespT> ruaVar, rn1 rn1Var, bu1 bu1Var) {
            return new a(bu1Var.newCall(ruaVar, rn1Var));
        }
    }

    private nua() {
    }

    public static d42 newAttachHeadersInterceptor(fta ftaVar) {
        return new C10062a(ftaVar);
    }

    public static d42 newCaptureMetadataInterceptor(AtomicReference<fta> atomicReference, AtomicReference<fta> atomicReference2) {
        return new C10063b(atomicReference, atomicReference2);
    }
}
