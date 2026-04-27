package p000;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import p000.pfg;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class pfg {

    /* JADX INFO: renamed from: pfg$a */
    @gdi
    public static class C10944a<T> implements lfg<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lfg<T> f70649a;

        /* JADX INFO: renamed from: b */
        public final long f70650b;

        /* JADX INFO: renamed from: c */
        @wx1
        public volatile transient T f70651c;

        /* JADX INFO: renamed from: d */
        public volatile transient long f70652d;

        public C10944a(lfg<T> delegate, long duration, TimeUnit unit) {
            this.f70649a = (lfg) v7d.checkNotNull(delegate);
            this.f70650b = unit.toNanos(duration);
            v7d.checkArgument(duration > 0, "duration (%s %s) must be > 0", duration, unit);
        }

        @Override // p000.lfg
        @lgc
        public T get() {
            long j = this.f70652d;
            long jNanoTime = System.nanoTime();
            if (j == 0 || jNanoTime - j >= 0) {
                synchronized (this) {
                    try {
                        if (j == this.f70652d) {
                            T t = this.f70649a.get();
                            this.f70651c = t;
                            long j2 = jNanoTime + this.f70650b;
                            if (j2 == 0) {
                                j2 = 1;
                            }
                            this.f70652d = j2;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) uib.m23370a(this.f70651c);
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.f70649a + ", " + this.f70650b + ", NANOS)";
        }
    }

    /* JADX INFO: renamed from: pfg$b */
    @gdi
    public static class C10945b<T> implements lfg<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lfg<T> f70653a;

        /* JADX INFO: renamed from: b */
        public volatile transient boolean f70654b;

        /* JADX INFO: renamed from: c */
        @wx1
        public transient T f70655c;

        public C10945b(lfg<T> delegate) {
            this.f70653a = (lfg) v7d.checkNotNull(delegate);
        }

        @Override // p000.lfg
        @lgc
        public T get() {
            if (!this.f70654b) {
                synchronized (this) {
                    try {
                        if (!this.f70654b) {
                            T t = this.f70653a.get();
                            this.f70655c = t;
                            this.f70654b = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) uib.m23370a(this.f70655c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.f70654b) {
                obj = "<supplier that returned " + this.f70655c + ">";
            } else {
                obj = this.f70653a;
            }
            sb.append(obj);
            sb.append(c0b.f15434d);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: pfg$c */
    @gdi
    public static class C10946c<T> implements lfg<T> {

        /* JADX INFO: renamed from: c */
        public static final lfg<Void> f70656c = new lfg() { // from class: qfg
            @Override // p000.lfg
            public final Object get() {
                return pfg.C10946c.lambda$static$0();
            }
        };

        /* JADX INFO: renamed from: a */
        public volatile lfg<T> f70657a;

        /* JADX INFO: renamed from: b */
        @wx1
        public T f70658b;

        public C10946c(lfg<T> delegate) {
            this.f70657a = (lfg) v7d.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void lambda$static$0() {
            throw new IllegalStateException();
        }

        @Override // p000.lfg
        @lgc
        public T get() {
            lfg<T> lfgVar = this.f70657a;
            lfg<T> lfgVar2 = (lfg<T>) f70656c;
            if (lfgVar != lfgVar2) {
                synchronized (this) {
                    try {
                        if (this.f70657a != lfgVar2) {
                            T t = this.f70657a.get();
                            this.f70658b = t;
                            this.f70657a = lfgVar2;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) uib.m23370a(this.f70658b);
        }

        public String toString() {
            Object obj = this.f70657a;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == f70656c) {
                obj = "<supplier that returned " + this.f70658b + ">";
            }
            sb.append(obj);
            sb.append(c0b.f15434d);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: pfg$d */
    public static class C10947d<F, T> implements lfg<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lz6<? super F, T> f70659a;

        /* JADX INFO: renamed from: b */
        public final lfg<F> f70660b;

        public C10947d(lz6<? super F, T> function, lfg<F> supplier) {
            this.f70659a = (lz6) v7d.checkNotNull(function);
            this.f70660b = (lfg) v7d.checkNotNull(supplier);
        }

        public boolean equals(@wx1 Object obj) {
            if (!(obj instanceof C10947d)) {
                return false;
            }
            C10947d c10947d = (C10947d) obj;
            return this.f70659a.equals(c10947d.f70659a) && this.f70660b.equals(c10947d.f70660b);
        }

        @Override // p000.lfg
        @lgc
        public T get() {
            return this.f70659a.apply(this.f70660b.get());
        }

        public int hashCode() {
            return okb.hashCode(this.f70659a, this.f70660b);
        }

        public String toString() {
            return "Suppliers.compose(" + this.f70659a + ", " + this.f70660b + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: pfg$e */
    public interface InterfaceC10948e<T> extends lz6<lfg<T>, T> {
    }

    /* JADX INFO: renamed from: pfg$f */
    public enum EnumC10949f implements InterfaceC10948e<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // p000.lz6
        @wx1
        public Object apply(lfg<Object> input) {
            return input.get();
        }
    }

    /* JADX INFO: renamed from: pfg$g */
    public static class C10950g<T> implements lfg<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @lgc
        public final T f70663a;

        public C10950g(@lgc T instance) {
            this.f70663a = instance;
        }

        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10950g) {
                return okb.equal(this.f70663a, ((C10950g) obj).f70663a);
            }
            return false;
        }

        @Override // p000.lfg
        @lgc
        public T get() {
            return this.f70663a;
        }

        public int hashCode() {
            return okb.hashCode(this.f70663a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f70663a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: pfg$h */
    public static class C10951h<T> implements lfg<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lfg<T> f70664a;

        public C10951h(lfg<T> delegate) {
            this.f70664a = (lfg) v7d.checkNotNull(delegate);
        }

        @Override // p000.lfg
        @lgc
        public T get() {
            T t;
            synchronized (this.f70664a) {
                t = this.f70664a.get();
            }
            return t;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.f70664a + c0b.f15434d;
        }
    }

    private pfg() {
    }

    public static <F, T> lfg<T> compose(lz6<? super F, T> function, lfg<F> supplier) {
        return new C10947d(function, supplier);
    }

    public static <T> lfg<T> memoize(lfg<T> delegate) {
        return ((delegate instanceof C10946c) || (delegate instanceof C10945b)) ? delegate : delegate instanceof Serializable ? new C10945b(delegate) : new C10946c(delegate);
    }

    public static <T> lfg<T> memoizeWithExpiration(lfg<T> delegate, long duration, TimeUnit unit) {
        return new C10944a(delegate, duration, unit);
    }

    public static <T> lfg<T> ofInstance(@lgc T instance) {
        return new C10950g(instance);
    }

    public static <T> lz6<lfg<T>, T> supplierFunction() {
        return EnumC10949f.INSTANCE;
    }

    public static <T> lfg<T> synchronizedSupplier(lfg<T> delegate) {
        return new C10951h(delegate);
    }
}
