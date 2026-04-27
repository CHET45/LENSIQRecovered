package p000;

import java.io.Serializable;
import p000.e13;
import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@dwf({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class jb2 implements e13, Serializable {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f50211a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final e13.InterfaceC5040b f50212b;

    /* JADX INFO: renamed from: jb2$a */
    @dwf({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12813#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    public static final class C7840a implements Serializable {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f50213b = new a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final e13[] f50214a;

        /* JADX INFO: renamed from: jb2$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private a() {
            }
        }

        public C7840a(@yfb e13[] e13VarArr) {
            md8.checkNotNullParameter(e13VarArr, "elements");
            this.f50214a = e13VarArr;
        }

        private final Object readResolve() {
            e13[] e13VarArr = this.f50214a;
            e13 e13VarPlus = a05.f2a;
            for (e13 e13Var : e13VarArr) {
                e13VarPlus = e13VarPlus.plus(e13Var);
            }
            return e13VarPlus;
        }

        @yfb
        public final e13[] getElements() {
            return this.f50214a;
        }
    }

    public jb2(@yfb e13 e13Var, @yfb e13.InterfaceC5040b interfaceC5040b) {
        md8.checkNotNullParameter(e13Var, "left");
        md8.checkNotNullParameter(interfaceC5040b, "element");
        this.f50211a = e13Var;
        this.f50212b = interfaceC5040b;
    }

    private final boolean contains(e13.InterfaceC5040b interfaceC5040b) {
        return md8.areEqual(get(interfaceC5040b.getKey()), interfaceC5040b);
    }

    private final boolean containsAll(jb2 jb2Var) {
        while (contains(jb2Var.f50212b)) {
            e13 e13Var = jb2Var.f50211a;
            if (!(e13Var instanceof jb2)) {
                md8.checkNotNull(e13Var, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((e13.InterfaceC5040b) e13Var);
            }
            jb2Var = (jb2) e13Var;
        }
        return false;
    }

    private final int size() {
        int i = 2;
        jb2 jb2Var = this;
        while (true) {
            e13 e13Var = jb2Var.f50211a;
            jb2Var = e13Var instanceof jb2 ? (jb2) e13Var : null;
            if (jb2Var == null) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toString$lambda$2(String str, e13.InterfaceC5040b interfaceC5040b) {
        md8.checkNotNullParameter(str, "acc");
        md8.checkNotNullParameter(interfaceC5040b, "element");
        if (str.length() == 0) {
            return interfaceC5040b.toString();
        }
        return str + ", " + interfaceC5040b;
    }

    private final Object writeReplace() {
        int size = size();
        final e13[] e13VarArr = new e13[size];
        final jvd.C8119f c8119f = new jvd.C8119f();
        fold(bth.f14751a, new gz6() { // from class: hb2
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return jb2.writeReplace$lambda$3(e13VarArr, c8119f, (bth) obj, (e13.InterfaceC5040b) obj2);
            }
        });
        if (c8119f.f52108a == size) {
            return new C7840a(e13VarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth writeReplace$lambda$3(e13[] e13VarArr, jvd.C8119f c8119f, bth bthVar, e13.InterfaceC5040b interfaceC5040b) {
        md8.checkNotNullParameter(bthVar, "<unused var>");
        md8.checkNotNullParameter(interfaceC5040b, "element");
        int i = c8119f.f52108a;
        c8119f.f52108a = i + 1;
        e13VarArr[i] = interfaceC5040b;
        return bth.f14751a;
    }

    public boolean equals(@gib Object obj) {
        if (this != obj) {
            if (obj instanceof jb2) {
                jb2 jb2Var = (jb2) obj;
                if (jb2Var.size() != size() || !jb2Var.containsAll(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        return gz6Var.invoke((Object) this.f50211a.fold(r, gz6Var), this.f50212b);
    }

    @Override // p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        md8.checkNotNullParameter(interfaceC5041c, "key");
        jb2 jb2Var = this;
        while (true) {
            E e = (E) jb2Var.f50212b.get(interfaceC5041c);
            if (e != null) {
                return e;
            }
            e13 e13Var = jb2Var.f50211a;
            if (!(e13Var instanceof jb2)) {
                return (E) e13Var.get(interfaceC5041c);
            }
            jb2Var = (jb2) e13Var;
        }
    }

    public int hashCode() {
        return this.f50211a.hashCode() + this.f50212b.hashCode();
    }

    @Override // p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        md8.checkNotNullParameter(interfaceC5041c, "key");
        if (this.f50212b.get(interfaceC5041c) != null) {
            return this.f50211a;
        }
        e13 e13VarMinusKey = this.f50211a.minusKey(interfaceC5041c);
        return e13VarMinusKey == this.f50211a ? this : e13VarMinusKey == a05.f2a ? this.f50212b : new jb2(e13VarMinusKey, this.f50212b);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return e13.C5039a.plus(this, e13Var);
    }

    @yfb
    public String toString() {
        return C4584d2.f28242k + ((String) fold("", new gz6() { // from class: ib2
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return jb2.toString$lambda$2((String) obj, (e13.InterfaceC5040b) obj2);
            }
        })) + C4584d2.f28243l;
    }
}
