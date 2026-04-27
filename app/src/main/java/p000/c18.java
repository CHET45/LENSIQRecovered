package p000;

import p000.e13;

/* JADX INFO: loaded from: classes.dex */
public interface c18 extends e13.InterfaceC5040b {

    /* JADX INFO: renamed from: z */
    @yfb
    public static final C2150b f15459z = C2150b.f15460a;

    /* JADX INFO: renamed from: c18$a */
    public static final class C2149a {
        public static <R> R fold(@yfb c18 c18Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) e13.InterfaceC5040b.a.fold(c18Var, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb c18 c18Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) e13.InterfaceC5040b.a.get(c18Var, interfaceC5041c);
        }

        @yfb
        @Deprecated
        public static e13.InterfaceC5041c<?> getKey(@yfb c18 c18Var) {
            return c18.super.getKey();
        }

        @yfb
        public static e13 minusKey(@yfb c18 c18Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return e13.InterfaceC5040b.a.minusKey(c18Var, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb c18 c18Var, @yfb e13 e13Var) {
            return e13.InterfaceC5040b.a.plus(c18Var, e13Var);
        }
    }

    /* JADX INFO: renamed from: c18$b */
    public static final class C2150b implements e13.InterfaceC5041c<c18> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C2150b f15460a = new C2150b();

        private C2150b() {
        }
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    default e13.InterfaceC5041c<?> getKey() {
        return f15459z;
    }

    @gib
    <R> Object onInfiniteOperation(@yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var, @yfb zy2<? super R> zy2Var);
}
