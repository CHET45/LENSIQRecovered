package p000;

/* JADX INFO: loaded from: classes7.dex */
public class yfd<T> {

    /* JADX INFO: renamed from: a */
    public final String f101406a;

    public yfd(@efb String str) {
        this.f101406a = str;
    }

    @efb
    /* JADX INFO: renamed from: of */
    public static <T> yfd<T> m25892of(@efb Class<T> cls, @efb String str) {
        return new yfd<>(str);
    }

    public void clear(@efb l1e l1eVar) {
        l1eVar.clear(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f101406a.equals(((yfd) obj).f101406a);
    }

    @hib
    public T get(@efb l1e l1eVar) {
        return (T) l1eVar.get(this);
    }

    public int hashCode() {
        return this.f101406a.hashCode();
    }

    @efb
    public String name() {
        return this.f101406a;
    }

    @efb
    public T require(@efb l1e l1eVar) {
        T t = get(l1eVar);
        if (t != null) {
            return t;
        }
        throw new NullPointerException(this.f101406a);
    }

    public void set(@efb l1e l1eVar, @hib T t) {
        l1eVar.set(this, t);
    }

    public String toString() {
        return "Prop{name='" + this.f101406a + "'}";
    }

    @efb
    /* JADX INFO: renamed from: of */
    public static <T> yfd<T> m25893of(@efb String str) {
        return new yfd<>(str);
    }

    @efb
    public T get(@efb l1e l1eVar, @efb T t) {
        return (T) l1eVar.get(this, t);
    }
}
