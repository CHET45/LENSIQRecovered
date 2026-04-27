package p000;

import p000.e13;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface fza extends e13.InterfaceC5040b {

    /* JADX INFO: renamed from: R */
    @yfb
    public static final C6040b f38062R = C6040b.f38063a;

    /* JADX INFO: renamed from: fza$a */
    public static final class C6039a {
        public static <R> R fold(@yfb fza fzaVar, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) e13.InterfaceC5040b.a.fold(fzaVar, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb fza fzaVar, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) e13.InterfaceC5040b.a.get(fzaVar, interfaceC5041c);
        }

        @yfb
        public static e13 minusKey(@yfb fza fzaVar, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return e13.InterfaceC5040b.a.minusKey(fzaVar, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb fza fzaVar, @yfb e13 e13Var) {
            return e13.InterfaceC5040b.a.plus(fzaVar, e13Var);
        }
    }

    /* JADX INFO: renamed from: fza$b */
    public static final class C6040b implements e13.InterfaceC5041c<fza> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C6040b f38063a = new C6040b();

        private C6040b() {
        }
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    default e13.InterfaceC5041c<?> getKey() {
        return f38062R;
    }

    float getScaleFactor();
}
