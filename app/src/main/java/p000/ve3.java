package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import p000.ohh;

/* JADX INFO: loaded from: classes4.dex */
@se3
public final class ve3 {

    /* JADX INFO: renamed from: ve3$b */
    public static final class C14015b implements ohh.InterfaceC10382a {

        /* JADX INFO: renamed from: a */
        public Context f90765a;

        private C14015b() {
        }

        @Override // p000.ohh.InterfaceC10382a
        public ohh build() {
            u7d.checkBuilderRequirement(this.f90765a, Context.class);
            return new C14016c(this.f90765a);
        }

        @Override // p000.ohh.InterfaceC10382a
        public C14015b setApplicationContext(Context context) {
            this.f90765a = (Context) u7d.checkNotNull(context);
            return this;
        }
    }

    /* JADX INFO: renamed from: ve3$c */
    public static final class C14016c extends ohh {

        /* JADX INFO: renamed from: C */
        public gid<ohe> f90766C;

        /* JADX INFO: renamed from: F */
        public gid<yoe> f90767F;

        /* JADX INFO: renamed from: H */
        public gid<nqi> f90768H;

        /* JADX INFO: renamed from: L */
        public gid<hz3> f90769L;

        /* JADX INFO: renamed from: M */
        public gid<nxh> f90770M;

        /* JADX INFO: renamed from: N */
        public gid<wpi> f90771N;

        /* JADX INFO: renamed from: Q */
        public gid<nhh> f90772Q;

        /* JADX INFO: renamed from: a */
        public final C14016c f90773a;

        /* JADX INFO: renamed from: b */
        public gid<Executor> f90774b;

        /* JADX INFO: renamed from: c */
        public gid<Context> f90775c;

        /* JADX INFO: renamed from: d */
        public gid f90776d;

        /* JADX INFO: renamed from: e */
        public gid f90777e;

        /* JADX INFO: renamed from: f */
        public gid f90778f;

        /* JADX INFO: renamed from: m */
        public gid<String> f90779m;

        private void initialize(Context context) {
            this.f90774b = xj4.provider(o85.create());
            go5 go5VarCreate = n58.create(context);
            this.f90775c = go5VarCreate;
            j63 j63VarCreate = j63.create(go5VarCreate, g0h.create(), h0h.create());
            this.f90776d = j63VarCreate;
            this.f90777e = xj4.provider(jta.create(this.f90775c, j63VarCreate));
            this.f90778f = gqe.create(this.f90775c, w65.create(), y65.create());
            this.f90779m = xj4.provider(x65.create(this.f90775c));
            this.f90766C = xj4.provider(phe.create(g0h.create(), h0h.create(), z65.create(), this.f90778f, this.f90779m));
            qpe qpeVarCreate = qpe.create(g0h.create());
            this.f90767F = qpeVarCreate;
            spe speVarCreate = spe.create(this.f90775c, this.f90766C, qpeVarCreate, h0h.create());
            this.f90768H = speVarCreate;
            gid<Executor> gidVar = this.f90774b;
            gid gidVar2 = this.f90777e;
            gid<ohe> gidVar3 = this.f90766C;
            this.f90769L = iz3.create(gidVar, gidVar2, speVarCreate, gidVar3, gidVar3);
            gid<Context> gidVar4 = this.f90775c;
            gid gidVar5 = this.f90777e;
            gid<ohe> gidVar6 = this.f90766C;
            this.f90770M = oxh.create(gidVar4, gidVar5, gidVar6, this.f90768H, this.f90774b, gidVar6, g0h.create(), h0h.create(), this.f90766C);
            gid<Executor> gidVar7 = this.f90774b;
            gid<ohe> gidVar8 = this.f90766C;
            this.f90771N = xpi.create(gidVar7, gidVar8, this.f90768H, gidVar8);
            this.f90772Q = xj4.provider(phh.create(g0h.create(), h0h.create(), this.f90769L, this.f90770M, this.f90771N));
        }

        @Override // p000.ohh
        /* JADX INFO: renamed from: a */
        public t65 mo18709a() {
            return this.f90766C.get();
        }

        @Override // p000.ohh
        /* JADX INFO: renamed from: b */
        public nhh mo18710b() {
            return this.f90772Q.get();
        }

        private C14016c(Context context) {
            this.f90773a = this;
            initialize(context);
        }
    }

    private ve3() {
    }

    public static ohh.InterfaceC10382a builder() {
        return new C14015b();
    }
}
