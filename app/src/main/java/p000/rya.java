package p000;

import p000.e13;

/* JADX INFO: loaded from: classes.dex */
public interface rya extends e13.InterfaceC5040b {

    /* JADX INFO: renamed from: P */
    @yfb
    public static final C12369b f80099P = C12369b.f80100a;

    /* JADX INFO: renamed from: rya$a */
    public static final class C12368a {
        public static <R> R fold(@yfb rya ryaVar, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) e13.InterfaceC5040b.a.fold(ryaVar, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb rya ryaVar, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) e13.InterfaceC5040b.a.get(ryaVar, interfaceC5041c);
        }

        @yfb
        @Deprecated
        public static e13.InterfaceC5041c<?> getKey(@yfb rya ryaVar) {
            return rya.super.getKey();
        }

        @yfb
        public static e13 minusKey(@yfb rya ryaVar, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return e13.InterfaceC5040b.a.minusKey(ryaVar, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb rya ryaVar, @yfb e13 e13Var) {
            return e13.InterfaceC5040b.a.plus(ryaVar, e13Var);
        }
    }

    /* JADX INFO: renamed from: rya$b */
    public static final class C12369b implements e13.InterfaceC5041c<rya> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C12369b f80100a = new C12369b();

        private C12369b() {
        }
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    default e13.InterfaceC5041c<?> getKey() {
        return f80099P;
    }

    @gib
    <R> Object withFrameNanos(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var);
}
