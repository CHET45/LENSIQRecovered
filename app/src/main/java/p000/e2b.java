package p000;

/* JADX INFO: loaded from: classes4.dex */
public class e2b {

    /* JADX INFO: renamed from: a */
    public Class<?> f31601a;

    /* JADX INFO: renamed from: b */
    public Class<?> f31602b;

    /* JADX INFO: renamed from: c */
    public Class<?> f31603c;

    public e2b() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e2b e2bVar = (e2b) obj;
        return this.f31601a.equals(e2bVar.f31601a) && this.f31602b.equals(e2bVar.f31602b) && v0i.bothNullOrEqual(this.f31603c, e2bVar.f31603c);
    }

    public int hashCode() {
        int iHashCode = ((this.f31601a.hashCode() * 31) + this.f31602b.hashCode()) * 31;
        Class<?> cls = this.f31603c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public void set(@efb Class<?> cls, @efb Class<?> cls2) {
        set(cls, cls2, null);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f31601a + ", second=" + this.f31602b + '}';
    }

    public e2b(@efb Class<?> cls, @efb Class<?> cls2) {
        set(cls, cls2);
    }

    public void set(@efb Class<?> cls, @efb Class<?> cls2, @hib Class<?> cls3) {
        this.f31601a = cls;
        this.f31602b = cls2;
        this.f31603c = cls3;
    }

    public e2b(@efb Class<?> cls, @efb Class<?> cls2, @hib Class<?> cls3) {
        set(cls, cls2, cls3);
    }
}
