package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k25 implements eq8 {

    /* JADX INFO: renamed from: c */
    public final Object f52441c;

    /* JADX INFO: renamed from: d */
    public final int f52442d;

    /* JADX INFO: renamed from: e */
    public final int f52443e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f52444f;

    /* JADX INFO: renamed from: g */
    public final Class<?> f52445g;

    /* JADX INFO: renamed from: h */
    public final eq8 f52446h;

    /* JADX INFO: renamed from: i */
    public final Map<Class<?>, ceh<?>> f52447i;

    /* JADX INFO: renamed from: j */
    public final i7c f52448j;

    /* JADX INFO: renamed from: k */
    public int f52449k;

    public k25(Object obj, eq8 eq8Var, int i, int i2, Map<Class<?>, ceh<?>> map, Class<?> cls, Class<?> cls2, i7c i7cVar) {
        this.f52441c = t7d.checkNotNull(obj);
        this.f52446h = (eq8) t7d.checkNotNull(eq8Var, "Signature must not be null");
        this.f52442d = i;
        this.f52443e = i2;
        this.f52447i = (Map) t7d.checkNotNull(map);
        this.f52444f = (Class) t7d.checkNotNull(cls, "Resource class must not be null");
        this.f52445g = (Class) t7d.checkNotNull(cls2, "Transcode class must not be null");
        this.f52448j = (i7c) t7d.checkNotNull(i7cVar);
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (!(obj instanceof k25)) {
            return false;
        }
        k25 k25Var = (k25) obj;
        return this.f52441c.equals(k25Var.f52441c) && this.f52446h.equals(k25Var.f52446h) && this.f52443e == k25Var.f52443e && this.f52442d == k25Var.f52442d && this.f52447i.equals(k25Var.f52447i) && this.f52444f.equals(k25Var.f52444f) && this.f52445g.equals(k25Var.f52445g) && this.f52448j.equals(k25Var.f52448j);
    }

    @Override // p000.eq8
    public int hashCode() {
        if (this.f52449k == 0) {
            int iHashCode = this.f52441c.hashCode();
            this.f52449k = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f52446h.hashCode()) * 31) + this.f52442d) * 31) + this.f52443e;
            this.f52449k = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f52447i.hashCode();
            this.f52449k = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f52444f.hashCode();
            this.f52449k = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f52445g.hashCode();
            this.f52449k = iHashCode5;
            this.f52449k = (iHashCode5 * 31) + this.f52448j.hashCode();
        }
        return this.f52449k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f52441c + ", width=" + this.f52442d + ", height=" + this.f52443e + ", resourceClass=" + this.f52444f + ", transcodeClass=" + this.f52445g + ", signature=" + this.f52446h + ", hashCode=" + this.f52449k + ", transformations=" + this.f52447i + ", options=" + this.f52448j + '}';
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
