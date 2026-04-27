package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ej2<T> {

    /* JADX INFO: renamed from: a */
    public final String f33175a;

    /* JADX INFO: renamed from: b */
    public final Set<pkd<? super T>> f33176b;

    /* JADX INFO: renamed from: c */
    public final Set<i64> f33177c;

    /* JADX INFO: renamed from: d */
    public final int f33178d;

    /* JADX INFO: renamed from: e */
    public final int f33179e;

    /* JADX INFO: renamed from: f */
    public final tj2<T> f33180f;

    /* JADX INFO: renamed from: g */
    public final Set<Class<?>> f33181g;

    public static <T> C5340b<T> builder(Class<T> cls) {
        return new C5340b<>(cls, new Class[0]);
    }

    public static <T> ej2<T> intoSet(final T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(new tj2() { // from class: zi2
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return ej2.lambda$intoSet$3(t, mj2Var);
            }
        }).build();
    }

    public static <T> C5340b<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).intoSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$intoSet$3(Object obj, mj2 mj2Var) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$intoSet$4(Object obj, mj2 mj2Var) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$0(Object obj, mj2 mj2Var) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$1(Object obj, mj2 mj2Var) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$2(Object obj, mj2 mj2Var) {
        return obj;
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <T> ej2<T> m10035of(Class<T> cls, final T t) {
        return builder(cls).factory(new tj2() { // from class: aj2
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return ej2.lambda$of$0(t, mj2Var);
            }
        }).build();
    }

    public Set<i64> getDependencies() {
        return this.f33177c;
    }

    public tj2<T> getFactory() {
        return this.f33180f;
    }

    @hib
    public String getName() {
        return this.f33175a;
    }

    public Set<pkd<? super T>> getProvidedInterfaces() {
        return this.f33176b;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f33181g;
    }

    public boolean isAlwaysEager() {
        return this.f33178d == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.f33178d == 2;
    }

    public boolean isLazy() {
        return this.f33178d == 0;
    }

    public boolean isValue() {
        return this.f33179e == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f33176b.toArray()) + ">{" + this.f33178d + ", type=" + this.f33179e + ", deps=" + Arrays.toString(this.f33177c.toArray()) + "}";
    }

    public ej2<T> withFactory(tj2<T> tj2Var) {
        return new ej2<>(this.f33175a, this.f33176b, this.f33177c, this.f33178d, this.f33179e, tj2Var, this.f33181g);
    }

    /* JADX INFO: renamed from: ej2$b */
    public static class C5340b<T> {

        /* JADX INFO: renamed from: a */
        public String f33182a;

        /* JADX INFO: renamed from: b */
        public final Set<pkd<? super T>> f33183b;

        /* JADX INFO: renamed from: c */
        public final Set<i64> f33184c;

        /* JADX INFO: renamed from: d */
        public int f33185d;

        /* JADX INFO: renamed from: e */
        public int f33186e;

        /* JADX INFO: renamed from: f */
        public tj2<T> f33187f;

        /* JADX INFO: renamed from: g */
        public final Set<Class<?>> f33188g;

        /* JADX INFO: Access modifiers changed from: private */
        @op1
        public C5340b<T> intoSet() {
            this.f33186e = 1;
            return this;
        }

        @op1
        private C5340b<T> setInstantiation(int i) {
            w7d.checkState(this.f33185d == 0, "Instantiation type has already been set.");
            this.f33185d = i;
            return this;
        }

        private void validateInterface(pkd<?> pkdVar) {
            w7d.checkArgument(!this.f33183b.contains(pkdVar), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @op1
        public C5340b<T> add(i64 i64Var) {
            w7d.checkNotNull(i64Var, "Null dependency");
            validateInterface(i64Var.getInterface());
            this.f33184c.add(i64Var);
            return this;
        }

        @op1
        public C5340b<T> alwaysEager() {
            return setInstantiation(1);
        }

        public ej2<T> build() {
            w7d.checkState(this.f33187f != null, "Missing required property: factory.");
            return new ej2<>(this.f33182a, new HashSet(this.f33183b), new HashSet(this.f33184c), this.f33185d, this.f33186e, this.f33187f, this.f33188g);
        }

        @op1
        public C5340b<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        @op1
        public C5340b<T> factory(tj2<T> tj2Var) {
            this.f33187f = (tj2) w7d.checkNotNull(tj2Var, "Null factory");
            return this;
        }

        public C5340b<T> name(@efb String str) {
            this.f33182a = str;
            return this;
        }

        @op1
        public C5340b<T> publishes(Class<?> cls) {
            this.f33188g.add(cls);
            return this;
        }

        @SafeVarargs
        private C5340b(Class<T> cls, Class<? super T>... clsArr) {
            this.f33182a = null;
            HashSet hashSet = new HashSet();
            this.f33183b = hashSet;
            this.f33184c = new HashSet();
            this.f33185d = 0;
            this.f33186e = 0;
            this.f33188g = new HashSet();
            w7d.checkNotNull(cls, "Null interface");
            hashSet.add(pkd.unqualified(cls));
            for (Class<? super T> cls2 : clsArr) {
                w7d.checkNotNull(cls2, "Null interface");
                this.f33183b.add(pkd.unqualified(cls2));
            }
        }

        @SafeVarargs
        private C5340b(pkd<T> pkdVar, pkd<? super T>... pkdVarArr) {
            this.f33182a = null;
            HashSet hashSet = new HashSet();
            this.f33183b = hashSet;
            this.f33184c = new HashSet();
            this.f33185d = 0;
            this.f33186e = 0;
            this.f33188g = new HashSet();
            w7d.checkNotNull(pkdVar, "Null interface");
            hashSet.add(pkdVar);
            for (pkd<? super T> pkdVar2 : pkdVarArr) {
                w7d.checkNotNull(pkdVar2, "Null interface");
            }
            Collections.addAll(this.f33183b, pkdVarArr);
        }
    }

    private ej2(@hib String str, Set<pkd<? super T>> set, Set<i64> set2, int i, int i2, tj2<T> tj2Var, Set<Class<?>> set3) {
        this.f33175a = str;
        this.f33176b = Collections.unmodifiableSet(set);
        this.f33177c = Collections.unmodifiableSet(set2);
        this.f33178d = i;
        this.f33179e = i2;
        this.f33180f = tj2Var;
        this.f33181g = Collections.unmodifiableSet(set3);
    }

    @SafeVarargs
    public static <T> C5340b<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new C5340b<>(cls, clsArr);
    }

    public static <T> ej2<T> intoSet(final T t, pkd<T> pkdVar) {
        return intoSetBuilder(pkdVar).factory(new tj2() { // from class: yi2
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return ej2.lambda$intoSet$4(t, mj2Var);
            }
        }).build();
    }

    public static <T> C5340b<T> intoSetBuilder(pkd<T> pkdVar) {
        return builder(pkdVar).intoSet();
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <T> ej2<T> m10036of(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new tj2() { // from class: bj2
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return ej2.lambda$of$1(t, mj2Var);
            }
        }).build();
    }

    public static <T> C5340b<T> builder(pkd<T> pkdVar) {
        return new C5340b<>(pkdVar, new pkd[0]);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <T> ej2<T> m10037of(final T t, pkd<T> pkdVar, pkd<? super T>... pkdVarArr) {
        return builder(pkdVar, pkdVarArr).factory(new tj2() { // from class: xi2
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return ej2.lambda$of$2(t, mj2Var);
            }
        }).build();
    }

    @SafeVarargs
    public static <T> C5340b<T> builder(pkd<T> pkdVar, pkd<? super T>... pkdVarArr) {
        return new C5340b<>(pkdVar, pkdVarArr);
    }
}
