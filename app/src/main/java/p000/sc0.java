package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1764")
@uw7
public final class sc0 {

    /* JADX INFO: renamed from: b */
    public static final IdentityHashMap<C12516c<?>, Object> f81179b;

    /* JADX INFO: renamed from: c */
    public static final sc0 f81180c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f81181d = false;

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap<C12516c<?>, Object> f81182a;

    /* JADX INFO: renamed from: sc0$b */
    public static final class C12515b {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ boolean f81183c = false;

        /* JADX INFO: renamed from: a */
        public sc0 f81184a;

        /* JADX INFO: renamed from: b */
        public IdentityHashMap<C12516c<?>, Object> f81185b;

        private IdentityHashMap<C12516c<?>, Object> data(int i) {
            if (this.f81185b == null) {
                this.f81185b = new IdentityHashMap<>(i);
            }
            return this.f81185b;
        }

        public sc0 build() {
            if (this.f81185b != null) {
                for (Map.Entry entry : this.f81184a.f81182a.entrySet()) {
                    if (!this.f81185b.containsKey(entry.getKey())) {
                        this.f81185b.put((C12516c) entry.getKey(), entry.getValue());
                    }
                }
                this.f81184a = new sc0(this.f81185b);
                this.f81185b = null;
            }
            return this.f81184a;
        }

        @lg5("https://github.com/grpc/grpc-java/issues/5777")
        public <T> C12515b discard(C12516c<T> c12516c) {
            if (this.f81184a.f81182a.containsKey(c12516c)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f81184a.f81182a);
                identityHashMap.remove(c12516c);
                this.f81184a = new sc0(identityHashMap);
            }
            IdentityHashMap<C12516c<?>, Object> identityHashMap2 = this.f81185b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(c12516c);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T> C12515b set(C12516c<T> c12516c, T t) {
            data(1).put(c12516c, t);
            return this;
        }

        public C12515b setAll(sc0 sc0Var) {
            data(sc0Var.f81182a.size()).putAll(sc0Var.f81182a);
            return this;
        }

        private C12515b(sc0 sc0Var) {
            this.f81184a = sc0Var;
        }
    }

    /* JADX INFO: renamed from: sc0$c */
    @uw7
    public static final class C12516c<T> {

        /* JADX INFO: renamed from: a */
        public final String f81186a;

        private C12516c(String str) {
            this.f81186a = str;
        }

        public static <T> C12516c<T> create(String str) {
            return new C12516c<>(str);
        }

        @Deprecated
        /* JADX INFO: renamed from: of */
        public static <T> C12516c<T> m21817of(String str) {
            return new C12516c<>(str);
        }

        public String toString() {
            return this.f81186a;
        }
    }

    static {
        IdentityHashMap<C12516c<?>, Object> identityHashMap = new IdentityHashMap<>();
        f81179b = identityHashMap;
        f81180c = new sc0(identityHashMap);
    }

    @Deprecated
    public static C12515b newBuilder(sc0 sc0Var) {
        v7d.checkNotNull(sc0Var, "base");
        return new C12515b();
    }

    /* JADX INFO: renamed from: b */
    public Set<C12516c<?>> m21816b() {
        return Collections.unmodifiableSet(this.f81182a.keySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sc0.class != obj.getClass()) {
            return false;
        }
        sc0 sc0Var = (sc0) obj;
        if (this.f81182a.size() != sc0Var.f81182a.size()) {
            return false;
        }
        for (Map.Entry<C12516c<?>, Object> entry : this.f81182a.entrySet()) {
            if (!sc0Var.f81182a.containsKey(entry.getKey()) || !okb.equal(entry.getValue(), sc0Var.f81182a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @eib
    public <T> T get(C12516c<T> c12516c) {
        return (T) this.f81182a.get(c12516c);
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<C12516c<?>, Object> entry : this.f81182a.entrySet()) {
            iHashCode += okb.hashCode(entry.getKey(), entry.getValue());
        }
        return iHashCode;
    }

    @Deprecated
    public Set<C12516c<?>> keys() {
        return Collections.unmodifiableSet(this.f81182a.keySet());
    }

    public C12515b toBuilder() {
        return new C12515b();
    }

    public String toString() {
        return this.f81182a.toString();
    }

    private sc0(IdentityHashMap<C12516c<?>, Object> identityHashMap) {
        this.f81182a = identityHashMap;
    }

    public static C12515b newBuilder() {
        return new C12515b();
    }
}
