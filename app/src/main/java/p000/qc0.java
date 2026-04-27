package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class qc0 implements zp9 {

    /* JADX INFO: renamed from: a */
    public final C11418b f73884a = new C11418b();

    /* JADX INFO: renamed from: b */
    public final tb7<C11417a, Bitmap> f73885b = new tb7<>();

    /* JADX INFO: renamed from: qc0$a */
    @fdi
    public static class C11417a implements k4d {

        /* JADX INFO: renamed from: a */
        public final C11418b f73886a;

        /* JADX INFO: renamed from: b */
        public int f73887b;

        /* JADX INFO: renamed from: c */
        public int f73888c;

        /* JADX INFO: renamed from: d */
        public Bitmap.Config f73889d;

        public C11417a(C11418b c11418b) {
            this.f73886a = c11418b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11417a)) {
                return false;
            }
            C11417a c11417a = (C11417a) obj;
            return this.f73887b == c11417a.f73887b && this.f73888c == c11417a.f73888c && this.f73889d == c11417a.f73889d;
        }

        public int hashCode() {
            int i = ((this.f73887b * 31) + this.f73888c) * 31;
            Bitmap.Config config = this.f73889d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public void init(int i, int i2, Bitmap.Config config) {
            this.f73887b = i;
            this.f73888c = i2;
            this.f73889d = config;
        }

        @Override // p000.k4d
        public void offer() {
            this.f73886a.offer(this);
        }

        public String toString() {
            return qc0.m20218a(this.f73887b, this.f73888c, this.f73889d);
        }
    }

    /* JADX INFO: renamed from: qc0$b */
    @fdi
    public static class C11418b extends mr0<C11417a> {
        @Override // p000.mr0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C11417a mo3348a() {
            return new C11417a(this);
        }

        /* JADX INFO: renamed from: d */
        public C11417a m20220d(int i, int i2, Bitmap.Config config) {
            C11417a c11417aM17523b = m17523b();
            c11417aM17523b.init(i, i2, config);
            return c11417aM17523b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m20218a(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    private static String getBitmapString(Bitmap bitmap) {
        return m20218a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // p000.zp9
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return this.f73885b.get(this.f73884a.m20220d(i, i2, config));
    }

    @Override // p000.zp9
    public int getSize(Bitmap bitmap) {
        return v0i.getBitmapByteSize(bitmap);
    }

    @Override // p000.zp9
    public String logBitmap(Bitmap bitmap) {
        return getBitmapString(bitmap);
    }

    @Override // p000.zp9
    public void put(Bitmap bitmap) {
        this.f73885b.put(this.f73884a.m20220d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // p000.zp9
    public Bitmap removeLast() {
        return this.f73885b.removeLast();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f73885b;
    }

    @Override // p000.zp9
    public String logBitmap(int i, int i2, Bitmap.Config config) {
        return m20218a(i, i2, config);
    }
}
