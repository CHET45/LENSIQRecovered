package p000;

import java.util.Map;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@px4
public final class uy7<B> extends qs6<nmh<? extends B>, B> implements mmh<B> {

    /* JADX INFO: renamed from: a */
    public final ox7<nmh<? extends B>, B> f89436a;

    /* JADX INFO: renamed from: uy7$b */
    public static final class C13791b<B> {

        /* JADX INFO: renamed from: a */
        public final ox7.C10705d<nmh<? extends B>, B> f89437a;

        public uy7<B> build() {
            return new uy7<>(this.f89437a.buildOrThrow());
        }

        @op1
        public <T extends B> C13791b<B> put(Class<T> key, T value) {
            this.f89437a.put(nmh.m18018of((Class) key), value);
            return this;
        }

        private C13791b() {
            this.f89437a = ox7.builder();
        }

        @op1
        public <T extends B> C13791b<B> put(nmh<T> key, T value) {
            this.f89437a.put(key.m18022h(), value);
            return this;
        }
    }

    public static <B> C13791b<B> builder() {
        return new C13791b<>();
    }

    /* JADX INFO: renamed from: of */
    public static <B> uy7<B> m23638of() {
        return new uy7<>(ox7.m19076of());
    }

    @wx1
    private <T extends B> T trustedGet(nmh<T> nmhVar) {
        return this.f89436a.get(nmhVar);
    }

    @Override // p000.qs6, p000.zs6
    /* JADX INFO: renamed from: a */
    public Map<nmh<? extends B>, B> mo8967m() {
        return this.f89436a;
    }

    @Override // p000.mmh
    @wx1
    public <T extends B> T getInstance(nmh<T> nmhVar) {
        return (T) trustedGet(nmhVar.m18022h());
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends nmh<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mmh
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public <T extends B> T putInstance(nmh<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    private uy7(ox7<nmh<? extends B>, B> delegate) {
        this.f89436a = delegate;
    }

    @Override // p000.mmh
    @wx1
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) trustedGet(nmh.m18018of((Class) cls));
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public B put(nmh<? extends B> key, B value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mmh
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public <T extends B> T putInstance(Class<T> type, T value) {
        throw new UnsupportedOperationException();
    }
}
