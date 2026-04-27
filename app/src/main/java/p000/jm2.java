package p000;

import java.util.concurrent.Executor;
import p000.pn1;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1914")
public final class jm2 extends pn1 {

    /* JADX INFO: renamed from: a */
    public final pn1 f51136a;

    /* JADX INFO: renamed from: b */
    public final pn1 f51137b;

    /* JADX INFO: renamed from: jm2$a */
    public static final class C7979a extends pn1.AbstractC11034a {

        /* JADX INFO: renamed from: a */
        public final pn1.AbstractC11034a f51138a;

        /* JADX INFO: renamed from: b */
        public final fta f51139b;

        public C7979a(pn1.AbstractC11034a abstractC11034a, fta ftaVar) {
            this.f51138a = abstractC11034a;
            this.f51139b = ftaVar;
        }

        @Override // p000.pn1.AbstractC11034a
        public void apply(fta ftaVar) {
            v7d.checkNotNull(ftaVar, "headers");
            fta ftaVar2 = new fta();
            ftaVar2.merge(this.f51139b);
            ftaVar2.merge(ftaVar);
            this.f51138a.apply(ftaVar2);
        }

        @Override // p000.pn1.AbstractC11034a
        public void fail(n4g n4gVar) {
            this.f51138a.fail(n4gVar);
        }
    }

    /* JADX INFO: renamed from: jm2$b */
    public final class C7980b extends pn1.AbstractC11034a {

        /* JADX INFO: renamed from: a */
        public final pn1.AbstractC11035b f51140a;

        /* JADX INFO: renamed from: b */
        public final Executor f51141b;

        /* JADX INFO: renamed from: c */
        public final pn1.AbstractC11034a f51142c;

        /* JADX INFO: renamed from: d */
        public final fx2 f51143d;

        public C7980b(pn1.AbstractC11035b abstractC11035b, Executor executor, pn1.AbstractC11034a abstractC11034a, fx2 fx2Var) {
            this.f51140a = abstractC11035b;
            this.f51141b = executor;
            this.f51142c = (pn1.AbstractC11034a) v7d.checkNotNull(abstractC11034a, "delegate");
            this.f51143d = (fx2) v7d.checkNotNull(fx2Var, "context");
        }

        @Override // p000.pn1.AbstractC11034a
        public void apply(fta ftaVar) {
            v7d.checkNotNull(ftaVar, "headers");
            fx2 fx2VarAttach = this.f51143d.attach();
            try {
                jm2.this.f51137b.applyRequestMetadata(this.f51140a, this.f51141b, new C7979a(this.f51142c, ftaVar));
            } finally {
                this.f51143d.detach(fx2VarAttach);
            }
        }

        @Override // p000.pn1.AbstractC11034a
        public void fail(n4g n4gVar) {
            this.f51142c.fail(n4gVar);
        }
    }

    public jm2(pn1 pn1Var, pn1 pn1Var2) {
        this.f51136a = (pn1) v7d.checkNotNull(pn1Var, "creds1");
        this.f51137b = (pn1) v7d.checkNotNull(pn1Var2, "creds2");
    }

    @Override // p000.pn1
    public void applyRequestMetadata(pn1.AbstractC11035b abstractC11035b, Executor executor, pn1.AbstractC11034a abstractC11034a) {
        this.f51136a.applyRequestMetadata(abstractC11035b, executor, new C7980b(abstractC11035b, executor, abstractC11034a, fx2.current()));
    }
}
