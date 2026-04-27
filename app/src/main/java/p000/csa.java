package p000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class csa<T> {

    /* JADX INFO: renamed from: csa$a */
    public static final class C4486a<T> extends csa<T> {

        /* JADX INFO: renamed from: a */
        @gib
        public final g2g<T> f27297a;

        public C4486a(@gib g2g<T> g2gVar) {
            super(null);
            this.f27297a = g2gVar;
        }

        @Override // p000.csa
        @gib
        public g2g<T> getLastState() {
            return this.f27297a;
        }
    }

    /* JADX INFO: renamed from: csa$b */
    public static final class C4487b<T> extends csa<T> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final gz6<T, zy2<? super T>, Object> f27298a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final ve2<T> f27299b;

        /* JADX INFO: renamed from: c */
        @gib
        public final g2g<T> f27300c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final e13 f27301d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4487b(@yfb gz6<? super T, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb ve2<T> ve2Var, @gib g2g<T> g2gVar, @yfb e13 e13Var) {
            super(null);
            md8.checkNotNullParameter(gz6Var, "transform");
            md8.checkNotNullParameter(ve2Var, "ack");
            md8.checkNotNullParameter(e13Var, "callerContext");
            this.f27298a = gz6Var;
            this.f27299b = ve2Var;
            this.f27300c = g2gVar;
            this.f27301d = e13Var;
        }

        @yfb
        public final ve2<T> getAck() {
            return this.f27299b;
        }

        @yfb
        public final e13 getCallerContext() {
            return this.f27301d;
        }

        @Override // p000.csa
        @gib
        public g2g<T> getLastState() {
            return this.f27300c;
        }

        @yfb
        public final gz6<T, zy2<? super T>, Object> getTransform() {
            return this.f27298a;
        }
    }

    public /* synthetic */ csa(jt3 jt3Var) {
        this();
    }

    @gib
    public abstract g2g<T> getLastState();

    private csa() {
    }
}
