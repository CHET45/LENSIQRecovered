package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class p6d {

    /* JADX INFO: renamed from: e */
    @fdi
    public static final Bitmap.Config f69846e = Bitmap.Config.RGB_565;

    /* JADX INFO: renamed from: a */
    public final int f69847a;

    /* JADX INFO: renamed from: b */
    public final int f69848b;

    /* JADX INFO: renamed from: c */
    public final Bitmap.Config f69849c;

    /* JADX INFO: renamed from: d */
    public final int f69850d;

    /* JADX INFO: renamed from: p6d$a */
    public static class C10808a {

        /* JADX INFO: renamed from: a */
        public final int f69851a;

        /* JADX INFO: renamed from: b */
        public final int f69852b;

        /* JADX INFO: renamed from: c */
        public Bitmap.Config f69853c;

        /* JADX INFO: renamed from: d */
        public int f69854d;

        public C10808a(int i) {
            this(i, i);
        }

        /* JADX INFO: renamed from: a */
        public p6d m19284a() {
            return new p6d(this.f69851a, this.f69852b, this.f69853c, this.f69854d);
        }

        /* JADX INFO: renamed from: b */
        public Bitmap.Config m19285b() {
            return this.f69853c;
        }

        public C10808a setConfig(@hib Bitmap.Config config) {
            this.f69853c = config;
            return this;
        }

        public C10808a setWeight(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f69854d = i;
            return this;
        }

        public C10808a(int i, int i2) {
            this.f69854d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i2 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.f69851a = i;
            this.f69852b = i2;
        }
    }

    public p6d(int i, int i2, Bitmap.Config config, int i3) {
        this.f69849c = (Bitmap.Config) t7d.checkNotNull(config, "Config must not be null");
        this.f69847a = i;
        this.f69848b = i2;
        this.f69850d = i3;
    }

    /* JADX INFO: renamed from: a */
    public Bitmap.Config m19280a() {
        return this.f69849c;
    }

    /* JADX INFO: renamed from: b */
    public int m19281b() {
        return this.f69848b;
    }

    /* JADX INFO: renamed from: c */
    public int m19282c() {
        return this.f69850d;
    }

    /* JADX INFO: renamed from: d */
    public int m19283d() {
        return this.f69847a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p6d)) {
            return false;
        }
        p6d p6dVar = (p6d) obj;
        return this.f69848b == p6dVar.f69848b && this.f69847a == p6dVar.f69847a && this.f69850d == p6dVar.f69850d && this.f69849c == p6dVar.f69849c;
    }

    public int hashCode() {
        return (((((this.f69847a * 31) + this.f69848b) * 31) + this.f69849c.hashCode()) * 31) + this.f69850d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f69847a + ", height=" + this.f69848b + ", config=" + this.f69849c + ", weight=" + this.f69850d + '}';
    }
}
