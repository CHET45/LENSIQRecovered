package p000;

import java.io.Serializable;
import java.util.Map;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
@tw7(containerOf = {"B"})
public final class zw7<B> extends qs6<Class<? extends B>, B> implements m12<B>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final zw7<Object> f106184b = new zw7<>(ox7.m19076of());

    /* JADX INFO: renamed from: a */
    public final ox7<Class<? extends B>, B> f106185a;

    /* JADX INFO: renamed from: zw7$b */
    public static final class C16266b<B> {

        /* JADX INFO: renamed from: a */
        public final ox7.C10705d<Class<? extends B>, B> f106186a = ox7.builder();

        private static <T> T cast(Class<T> cls, Object obj) {
            return (T) tbd.wrap(cls).cast(obj);
        }

        public zw7<B> build() {
            ox7<Class<? extends B>, B> ox7VarBuildOrThrow = this.f106186a.buildOrThrow();
            return ox7VarBuildOrThrow.isEmpty() ? zw7.m27104of() : new zw7<>(ox7VarBuildOrThrow);
        }

        @op1
        public <T extends B> C16266b<B> put(Class<T> key, T value) {
            this.f106186a.put(key, value);
            return this;
        }

        @op1
        public <T extends B> C16266b<B> putAll(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class key = entry.getKey();
                T value = entry.getValue();
                this.f106186a.put((Class<? extends B>) key, (B) cast(key, value));
            }
            return this;
        }
    }

    public static <B> C16266b<B> builder() {
        return new C16266b<>();
    }

    public static <B, S extends B> zw7<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof zw7 ? (zw7) map : new C16266b().putAll(map).build();
    }

    /* JADX INFO: renamed from: of */
    public static <B> zw7<B> m27104of() {
        return (zw7<B>) f106184b;
    }

    @Override // p000.qs6, p000.zs6
    /* JADX INFO: renamed from: a */
    public Map<Class<? extends B>, B> mo8967m() {
        return this.f106185a;
    }

    @Override // p000.m12
    @wx1
    public <T extends B> T getInstance(Class<T> cls) {
        return this.f106185a.get(v7d.checkNotNull(cls));
    }

    @Override // p000.m12
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public <T extends B> T putInstance(Class<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    public Object readResolve() {
        return isEmpty() ? m27104of() : this;
    }

    private zw7(ox7<Class<? extends B>, B> delegate) {
        this.f106185a = delegate;
    }

    /* JADX INFO: renamed from: of */
    public static <B, T extends B> zw7<B> m27105of(Class<T> type, T value) {
        return new zw7<>(ox7.m19077of(type, value));
    }
}
