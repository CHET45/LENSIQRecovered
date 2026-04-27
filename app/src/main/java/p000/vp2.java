package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vp2<T> {

    /* JADX INFO: renamed from: a */
    public static final C14200c<Object> f91902a = new C14200c<>();

    /* JADX INFO: renamed from: vp2$b */
    public static final class C14199b<T> extends vp2<T> {

        /* JADX INFO: renamed from: b */
        public final T f91903b;

        /* JADX INFO: renamed from: c */
        public final i74 f91904c;

        @Override // p000.vp2
        public <U> vp2<U> and(InterfaceC14201d<? super T, U> interfaceC14201d) {
            return interfaceC14201d.apply(this.f91903b, this.f91904c);
        }

        @Override // p000.vp2
        public boolean matching(yv9<T> yv9Var, String str) {
            if (yv9Var.matches(this.f91903b)) {
                return true;
            }
            this.f91904c.appendText(str);
            yv9Var.describeMismatch(this.f91903b, this.f91904c);
            return false;
        }

        private C14199b(T t, i74 i74Var) {
            super();
            this.f91903b = t;
            this.f91904c = i74Var;
        }
    }

    /* JADX INFO: renamed from: vp2$c */
    public static final class C14200c<T> extends vp2<T> {
        private C14200c() {
            super();
        }

        @Override // p000.vp2
        public <U> vp2<U> and(InterfaceC14201d<? super T, U> interfaceC14201d) {
            return vp2.notMatched();
        }

        @Override // p000.vp2
        public boolean matching(yv9<T> yv9Var, String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: vp2$d */
    public interface InterfaceC14201d<I, O> {
        vp2<O> apply(I i, i74 i74Var);
    }

    public static <T> vp2<T> matched(T t, i74 i74Var) {
        return new C14199b(t, i74Var);
    }

    public static <T> vp2<T> notMatched() {
        return f91902a;
    }

    public abstract <U> vp2<U> and(InterfaceC14201d<? super T, U> interfaceC14201d);

    public final boolean matching(yv9<T> yv9Var) {
        return matching(yv9Var, "");
    }

    public abstract boolean matching(yv9<T> yv9Var, String str);

    public final <U> vp2<U> then(InterfaceC14201d<? super T, U> interfaceC14201d) {
        return and(interfaceC14201d);
    }

    private vp2() {
    }
}
