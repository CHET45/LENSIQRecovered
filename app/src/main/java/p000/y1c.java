package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y1c {

    /* JADX INFO: renamed from: y1c$a */
    public static final class C15394a extends v1c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<v1c, bth> f100088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15394a(boolean z, qy6<? super v1c, bth> qy6Var) {
            super(z);
            this.f100088a = qy6Var;
        }

        @Override // p000.v1c
        public void handleOnBackPressed() {
            this.f100088a.invoke(this);
        }
    }

    @yfb
    public static final v1c addCallback(@yfb w1c w1cVar, @gib g59 g59Var, boolean z, @yfb qy6<? super v1c, bth> qy6Var) {
        md8.checkNotNullParameter(w1cVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "onBackPressed");
        C15394a c15394a = new C15394a(z, qy6Var);
        if (g59Var != null) {
            w1cVar.addCallback(g59Var, c15394a);
        } else {
            w1cVar.addCallback(c15394a);
        }
        return c15394a;
    }

    public static /* synthetic */ v1c addCallback$default(w1c w1cVar, g59 g59Var, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            g59Var = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return addCallback(w1cVar, g59Var, z, qy6Var);
    }
}
