package p000;

import p000.dz2;
import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public interface e13 {

    /* JADX INFO: renamed from: e13$a */
    public static final class C5039a {
        @yfb
        public static e13 plus(@yfb e13 e13Var, @yfb e13 e13Var2) {
            md8.checkNotNullParameter(e13Var2, "context");
            return e13Var2 == a05.f2a ? e13Var : (e13) e13Var2.fold(e13Var, new gz6() { // from class: d13
                @Override // p000.gz6
                public final Object invoke(Object obj, Object obj2) {
                    return e13.C5039a.plus$lambda$0((e13) obj, (e13.InterfaceC5040b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e13 plus$lambda$0(e13 e13Var, InterfaceC5040b interfaceC5040b) {
            jb2 jb2Var;
            md8.checkNotNullParameter(e13Var, "acc");
            md8.checkNotNullParameter(interfaceC5040b, "element");
            e13 e13VarMinusKey = e13Var.minusKey(interfaceC5040b.getKey());
            a05 a05Var = a05.f2a;
            if (e13VarMinusKey == a05Var) {
                return interfaceC5040b;
            }
            dz2.C5021b c5021b = dz2.f31343s;
            dz2 dz2Var = (dz2) e13VarMinusKey.get(c5021b);
            if (dz2Var == null) {
                jb2Var = new jb2(e13VarMinusKey, interfaceC5040b);
            } else {
                e13 e13VarMinusKey2 = e13VarMinusKey.minusKey(c5021b);
                if (e13VarMinusKey2 == a05Var) {
                    return new jb2(interfaceC5040b, dz2Var);
                }
                jb2Var = new jb2(new jb2(e13VarMinusKey2, interfaceC5040b), dz2Var);
            }
            return jb2Var;
        }
    }

    /* JADX INFO: renamed from: e13$b */
    public interface InterfaceC5040b extends e13 {

        /* JADX INFO: renamed from: e13$b$a */
        public static final class a {
            public static <R> R fold(@yfb InterfaceC5040b interfaceC5040b, R r, @yfb gz6<? super R, ? super InterfaceC5040b, ? extends R> gz6Var) {
                md8.checkNotNullParameter(gz6Var, "operation");
                return gz6Var.invoke(r, interfaceC5040b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @gib
            public static <E extends InterfaceC5040b> E get(@yfb InterfaceC5040b interfaceC5040b, @yfb InterfaceC5041c<E> interfaceC5041c) {
                md8.checkNotNullParameter(interfaceC5041c, "key");
                if (!md8.areEqual(interfaceC5040b.getKey(), interfaceC5041c)) {
                    return null;
                }
                md8.checkNotNull(interfaceC5040b, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return interfaceC5040b;
            }

            @yfb
            public static e13 minusKey(@yfb InterfaceC5040b interfaceC5040b, @yfb InterfaceC5041c<?> interfaceC5041c) {
                md8.checkNotNullParameter(interfaceC5041c, "key");
                return md8.areEqual(interfaceC5040b.getKey(), interfaceC5041c) ? a05.f2a : interfaceC5040b;
            }

            @yfb
            public static e13 plus(@yfb InterfaceC5040b interfaceC5040b, @yfb e13 e13Var) {
                md8.checkNotNullParameter(e13Var, "context");
                return C5039a.plus(interfaceC5040b, e13Var);
            }
        }

        @Override // p000.e13
        <R> R fold(R r, @yfb gz6<? super R, ? super InterfaceC5040b, ? extends R> gz6Var);

        @Override // p000.e13
        @gib
        <E extends InterfaceC5040b> E get(@yfb InterfaceC5041c<E> interfaceC5041c);

        @yfb
        InterfaceC5041c<?> getKey();

        @Override // p000.e13
        @yfb
        e13 minusKey(@yfb InterfaceC5041c<?> interfaceC5041c);
    }

    /* JADX INFO: renamed from: e13$c */
    public interface InterfaceC5041c<E extends InterfaceC5040b> {
    }

    <R> R fold(R r, @yfb gz6<? super R, ? super InterfaceC5040b, ? extends R> gz6Var);

    @gib
    <E extends InterfaceC5040b> E get(@yfb InterfaceC5041c<E> interfaceC5041c);

    @yfb
    e13 minusKey(@yfb InterfaceC5041c<?> interfaceC5041c);

    @yfb
    e13 plus(@yfb e13 e13Var);
}
