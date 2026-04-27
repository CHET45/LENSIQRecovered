package p000;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class i7c implements eq8 {

    /* JADX INFO: renamed from: c */
    public final x60<v6c<?>, Object> f45926c = new wm1();

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (obj instanceof i7c) {
            return this.f45926c.equals(((i7c) obj).f45926c);
        }
        return false;
    }

    @hib
    public <T> T get(@efb v6c<T> v6cVar) {
        return this.f45926c.containsKey(v6cVar) ? (T) this.f45926c.get(v6cVar) : v6cVar.getDefaultValue();
    }

    @Override // p000.eq8
    public int hashCode() {
        return this.f45926c.hashCode();
    }

    public void putAll(@efb i7c i7cVar) {
        this.f45926c.putAll((scf<? extends v6c<?>, ? extends Object>) i7cVar.f45926c);
    }

    @efb
    public <T> i7c set(@efb v6c<T> v6cVar, @efb T t) {
        this.f45926c.put(v6cVar, t);
        return this;
    }

    public String toString() {
        return "Options{values=" + this.f45926c + '}';
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        for (int i = 0; i < this.f45926c.size(); i++) {
            updateDiskCacheKey(this.f45926c.keyAt(i), this.f45926c.valueAt(i), messageDigest);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void updateDiskCacheKey(@efb v6c<T> v6cVar, @efb Object obj, @efb MessageDigest messageDigest) {
        v6cVar.update(obj, messageDigest);
    }
}
