package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class w5e implements eq8 {

    /* JADX INFO: renamed from: k */
    public static final op9<Class<?>, byte[]> f93370k = new op9<>(50);

    /* JADX INFO: renamed from: c */
    public final z60 f93371c;

    /* JADX INFO: renamed from: d */
    public final eq8 f93372d;

    /* JADX INFO: renamed from: e */
    public final eq8 f93373e;

    /* JADX INFO: renamed from: f */
    public final int f93374f;

    /* JADX INFO: renamed from: g */
    public final int f93375g;

    /* JADX INFO: renamed from: h */
    public final Class<?> f93376h;

    /* JADX INFO: renamed from: i */
    public final i7c f93377i;

    /* JADX INFO: renamed from: j */
    public final ceh<?> f93378j;

    public w5e(z60 z60Var, eq8 eq8Var, eq8 eq8Var2, int i, int i2, ceh<?> cehVar, Class<?> cls, i7c i7cVar) {
        this.f93371c = z60Var;
        this.f93372d = eq8Var;
        this.f93373e = eq8Var2;
        this.f93374f = i;
        this.f93375g = i2;
        this.f93378j = cehVar;
        this.f93376h = cls;
        this.f93377i = i7cVar;
    }

    private byte[] getResourceClassBytes() {
        op9<Class<?>, byte[]> op9Var = f93370k;
        byte[] bArr = op9Var.get(this.f93376h);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f93376h.getName().getBytes(eq8.f33838b);
        op9Var.put(this.f93376h, bytes);
        return bytes;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (!(obj instanceof w5e)) {
            return false;
        }
        w5e w5eVar = (w5e) obj;
        return this.f93375g == w5eVar.f93375g && this.f93374f == w5eVar.f93374f && v0i.bothNullOrEqual(this.f93378j, w5eVar.f93378j) && this.f93376h.equals(w5eVar.f93376h) && this.f93372d.equals(w5eVar.f93372d) && this.f93373e.equals(w5eVar.f93373e) && this.f93377i.equals(w5eVar.f93377i);
    }

    @Override // p000.eq8
    public int hashCode() {
        int iHashCode = (((((this.f93372d.hashCode() * 31) + this.f93373e.hashCode()) * 31) + this.f93374f) * 31) + this.f93375g;
        ceh<?> cehVar = this.f93378j;
        if (cehVar != null) {
            iHashCode = (iHashCode * 31) + cehVar.hashCode();
        }
        return (((iHashCode * 31) + this.f93376h.hashCode()) * 31) + this.f93377i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f93372d + ", signature=" + this.f93373e + ", width=" + this.f93374f + ", height=" + this.f93375g + ", decodedResourceClass=" + this.f93376h + ", transformation='" + this.f93378j + "', options=" + this.f93377i + '}';
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f93371c.getExact(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f93374f).putInt(this.f93375g).array();
        this.f93373e.updateDiskCacheKey(messageDigest);
        this.f93372d.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        ceh<?> cehVar = this.f93378j;
        if (cehVar != null) {
            cehVar.updateDiskCacheKey(messageDigest);
        }
        this.f93377i.updateDiskCacheKey(messageDigest);
        messageDigest.update(getResourceClassBytes());
        this.f93371c.put(bArr);
    }
}
