package p000;

import p000.sc0;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public abstract class ja8 {

    /* JADX INFO: renamed from: a */
    public static final sc0.C12516c<ja8> f50100a = sc0.C12516c.create("internal:io.grpc.config-selector");

    /* JADX INFO: renamed from: ja8$b */
    public static final class C7824b {

        /* JADX INFO: renamed from: a */
        public final n4g f50101a;

        /* JADX INFO: renamed from: b */
        public final Object f50102b;

        /* JADX INFO: renamed from: c */
        @eib
        public d42 f50103c;

        /* JADX INFO: renamed from: ja8$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Object f50104a;

            /* JADX INFO: renamed from: b */
            public d42 f50105b;

            public C7824b build() {
                v7d.checkState(this.f50104a != null, "config is not set");
                return new C7824b(n4g.f63258e, this.f50104a, this.f50105b);
            }

            public a setConfig(Object obj) {
                this.f50104a = v7d.checkNotNull(obj, "config");
                return this;
            }

            public a setInterceptor(d42 d42Var) {
                this.f50105b = (d42) v7d.checkNotNull(d42Var, "interceptor");
                return this;
            }

            private a() {
            }
        }

        public static C7824b forError(n4g n4gVar) {
            v7d.checkArgument(!n4gVar.isOk(), "status is OK");
            return new C7824b(n4gVar, null, null);
        }

        public static a newBuilder() {
            return new a();
        }

        public Object getConfig() {
            return this.f50102b;
        }

        @eib
        public d42 getInterceptor() {
            return this.f50103c;
        }

        public n4g getStatus() {
            return this.f50101a;
        }

        private C7824b(n4g n4gVar, Object obj, d42 d42Var) {
            this.f50101a = (n4g) v7d.checkNotNull(n4gVar, "status");
            this.f50102b = obj;
            this.f50103c = d42Var;
        }
    }

    public abstract C7824b selectConfig(zb9.AbstractC16071h abstractC16071h);
}
