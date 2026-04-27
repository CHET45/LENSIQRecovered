package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wx3 extends dcc {

    /* JADX INFO: renamed from: M */
    @yfb
    public static final C14822c f95661M = new C14822c(null);

    /* JADX INFO: renamed from: N */
    @yfb
    public static final dme<wx3, ?> f95662N = q99.listSaver(C14820a.f95664a, C14821b.f95665a);

    /* JADX INFO: renamed from: L */
    @yfb
    public z6b<ny6<Integer>> f95663L;

    /* JADX INFO: renamed from: wx3$a */
    public static final class C14820a extends tt8 implements gz6<fme, wx3, List<? extends Object>> {

        /* JADX INFO: renamed from: a */
        public static final C14820a f95664a = new C14820a();

        public C14820a() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final List<Object> invoke(@yfb fme fmeVar, @yfb wx3 wx3Var) {
            return l82.listOf(Integer.valueOf(wx3Var.getCurrentPage()), Float.valueOf(kpd.coerceIn(wx3Var.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), Integer.valueOf(wx3Var.getPageCount()));
        }
    }

    /* JADX INFO: renamed from: wx3$b */
    public static final class C14821b extends tt8 implements qy6<List, wx3> {

        /* JADX INFO: renamed from: a */
        public static final C14821b f95665a = new C14821b();

        /* JADX INFO: renamed from: wx3$b$a */
        public static final class a extends tt8 implements ny6<Integer> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List<Object> f95666a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<? extends Object> list) {
                super(0);
                this.f95666a = list;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Integer invoke() {
                Object obj = this.f95666a.get(2);
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        public C14821b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ wx3 invoke(List list) {
            return invoke2((List<? extends Object>) list);
        }

        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final wx3 invoke2(@yfb List<? extends Object> list) {
            Object obj = list.get(0);
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new wx3(iIntValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    /* JADX INFO: renamed from: wx3$c */
    public static final class C14822c {
        public /* synthetic */ C14822c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<wx3, ?> getSaver() {
            return wx3.f95662N;
        }

        private C14822c() {
        }
    }

    public wx3(int i, float f, @yfb ny6<Integer> ny6Var) {
        super(i, f);
        this.f95663L = xtf.mutableStateOf$default(ny6Var, null, 2, null);
    }

    @Override // p000.dcc
    public int getPageCount() {
        return this.f95663L.getValue().invoke().intValue();
    }

    @yfb
    public final z6b<ny6<Integer>> getPageCountState() {
        return this.f95663L;
    }

    public final void setPageCountState(@yfb z6b<ny6<Integer>> z6bVar) {
        this.f95663L = z6bVar;
    }
}
