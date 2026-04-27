package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class rpg implements fpg {

    /* JADX INFO: renamed from: rpg$a */
    public class C12199a extends f3g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j74 f78999a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f3g f79000b;

        public C12199a(j74 j74Var, f3g f3gVar) throws Exception {
            this.f78999a = j74Var;
            this.f79000b = f3gVar;
        }

        @Override // p000.f3g
        public void evaluate() throws Exception {
            ArrayList arrayList = new ArrayList();
            rpg.this.startingQuietly(this.f78999a, arrayList);
            try {
                try {
                    this.f79000b.evaluate();
                    rpg.this.succeededQuietly(this.f78999a, arrayList);
                } catch (g90 e) {
                    arrayList.add(e);
                    rpg.this.skippedQuietly(e, this.f78999a, arrayList);
                } catch (Throwable th) {
                    arrayList.add(th);
                    rpg.this.failedQuietly(th, this.f78999a, arrayList);
                }
                rpg.this.finishedQuietly(this.f78999a, arrayList);
                b4b.assertEmpty(arrayList);
            } catch (Throwable th2) {
                rpg.this.finishedQuietly(this.f78999a, arrayList);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failedQuietly(Throwable th, j74 j74Var, List<Throwable> list) {
        try {
            mo9709f(th, j74Var);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishedQuietly(j74 j74Var, List<Throwable> list) {
        try {
            mo9710g(j74Var);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skippedQuietly(g90 g90Var, j74 j74Var, List<Throwable> list) {
        try {
            if (g90Var instanceof h90) {
                mo9711i((h90) g90Var, j74Var);
            } else {
                m21481h(g90Var, j74Var);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startingQuietly(j74 j74Var, List<Throwable> list) {
        try {
            mo2529j(j74Var);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void succeededQuietly(j74 j74Var, List<Throwable> list) {
        try {
            mo9712k(j74Var);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    @Override // p000.fpg
    public f3g apply(f3g f3gVar, j74 j74Var) {
        return new C12199a(j74Var, f3gVar);
    }

    /* JADX INFO: renamed from: f */
    public void mo9709f(Throwable th, j74 j74Var) {
    }

    /* JADX INFO: renamed from: g */
    public void mo9710g(j74 j74Var) {
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public void m21481h(g90 g90Var, j74 j74Var) {
    }

    /* JADX INFO: renamed from: i */
    public void mo9711i(h90 h90Var, j74 j74Var) {
        m21481h(h90Var, j74Var);
    }

    /* JADX INFO: renamed from: j */
    public void mo2529j(j74 j74Var) {
    }

    /* JADX INFO: renamed from: k */
    public void mo9712k(j74 j74Var) {
    }
}
