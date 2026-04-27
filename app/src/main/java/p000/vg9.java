package p000;

import android.location.LocationRequest;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class vg9 {

    /* JADX INFO: renamed from: h */
    public static final long f91078h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    public static final int f91079i = 100;

    /* JADX INFO: renamed from: j */
    public static final int f91080j = 102;

    /* JADX INFO: renamed from: k */
    public static final int f91081k = 104;

    /* JADX INFO: renamed from: l */
    public static final long f91082l = -1;

    /* JADX INFO: renamed from: a */
    public final int f91083a;

    /* JADX INFO: renamed from: b */
    public final long f91084b;

    /* JADX INFO: renamed from: c */
    public final long f91085c;

    /* JADX INFO: renamed from: d */
    public final long f91086d;

    /* JADX INFO: renamed from: e */
    public final int f91087e;

    /* JADX INFO: renamed from: f */
    public final float f91088f;

    /* JADX INFO: renamed from: g */
    public final long f91089g;

    /* JADX INFO: renamed from: vg9$a */
    public static class C14057a {

        /* JADX INFO: renamed from: a */
        public static Class<?> f91090a;

        /* JADX INFO: renamed from: b */
        public static Method f91091b;

        /* JADX INFO: renamed from: c */
        public static Method f91092c;

        /* JADX INFO: renamed from: d */
        public static Method f91093d;

        /* JADX INFO: renamed from: e */
        public static Method f91094e;

        /* JADX INFO: renamed from: f */
        public static Method f91095f;

        private C14057a() {
        }

        @igg({"BanUncheckedReflection"})
        public static Object toLocationRequest(vg9 vg9Var, String str) {
            try {
                if (f91090a == null) {
                    f91090a = Class.forName("android.location.LocationRequest");
                }
                if (f91091b == null) {
                    Method declaredMethod = f91090a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f91091b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = f91091b.invoke(null, str, Long.valueOf(vg9Var.getIntervalMillis()), Float.valueOf(vg9Var.getMinUpdateDistanceMeters()), Boolean.FALSE);
                if (objInvoke == null) {
                    return null;
                }
                if (f91092c == null) {
                    Method declaredMethod2 = f91090a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f91092c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f91092c.invoke(objInvoke, Integer.valueOf(vg9Var.getQuality()));
                if (f91093d == null) {
                    Method declaredMethod3 = f91090a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f91093d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f91093d.invoke(objInvoke, Long.valueOf(vg9Var.getMinUpdateIntervalMillis()));
                if (vg9Var.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (f91094e == null) {
                        Method declaredMethod4 = f91090a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f91094e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f91094e.invoke(objInvoke, Integer.valueOf(vg9Var.getMaxUpdates()));
                }
                if (vg9Var.getDurationMillis() < Long.MAX_VALUE) {
                    if (f91095f == null) {
                        Method declaredMethod5 = f91090a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f91095f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f91095f.invoke(objInvoke, Long.valueOf(vg9Var.getDurationMillis()));
                }
                return objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: vg9$b */
    @c5e(31)
    public static class C14058b {
        private C14058b() {
        }

        @ih4
        public static LocationRequest toLocationRequest(vg9 vg9Var) {
            return new LocationRequest.Builder(vg9Var.getIntervalMillis()).setQuality(vg9Var.getQuality()).setMinUpdateIntervalMillis(vg9Var.getMinUpdateIntervalMillis()).setDurationMillis(vg9Var.getDurationMillis()).setMaxUpdates(vg9Var.getMaxUpdates()).setMinUpdateDistanceMeters(vg9Var.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(vg9Var.getMaxUpdateDelayMillis()).build();
        }
    }

    /* JADX INFO: renamed from: vg9$d */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC14060d {
    }

    public vg9(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.f91084b = j;
        this.f91083a = i;
        this.f91085c = j3;
        this.f91086d = j2;
        this.f91087e = i2;
        this.f91088f = f;
        this.f91089g = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg9)) {
            return false;
        }
        vg9 vg9Var = (vg9) obj;
        return this.f91083a == vg9Var.f91083a && this.f91084b == vg9Var.f91084b && this.f91085c == vg9Var.f91085c && this.f91086d == vg9Var.f91086d && this.f91087e == vg9Var.f91087e && Float.compare(vg9Var.f91088f, this.f91088f) == 0 && this.f91089g == vg9Var.f91089g;
    }

    @h78(from = 1)
    public long getDurationMillis() {
        return this.f91086d;
    }

    @h78(from = 0)
    public long getIntervalMillis() {
        return this.f91084b;
    }

    @h78(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.f91089g;
    }

    @h78(from = 1, m12174to = 2147483647L)
    public int getMaxUpdates() {
        return this.f91087e;
    }

    @y46(from = 0.0d, m25645to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.f91088f;
    }

    @h78(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j = this.f91085c;
        return j == -1 ? this.f91084b : j;
    }

    public int getQuality() {
        return this.f91083a;
    }

    public int hashCode() {
        int i = this.f91083a * 31;
        long j = this.f91084b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f91085c;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @c5e(31)
    @efb
    public LocationRequest toLocationRequest() {
        return C14058b.toLocationRequest(this);
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f91084b != Long.MAX_VALUE) {
            sb.append("@");
            e1h.formatDuration(this.f91084b, sb);
            int i = this.f91083a;
            if (i == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sb.append(" BALANCED");
            } else if (i == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f91086d != Long.MAX_VALUE) {
            sb.append(", duration=");
            e1h.formatDuration(this.f91086d, sb);
        }
        if (this.f91087e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f91087e);
        }
        long j = this.f91085c;
        if (j != -1 && j < this.f91084b) {
            sb.append(", minUpdateInterval=");
            e1h.formatDuration(this.f91085c, sb);
        }
        if (this.f91088f > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f91088f);
        }
        if (this.f91089g / 2 > this.f91084b) {
            sb.append(", maxUpdateDelay=");
            e1h.formatDuration(this.f91089g, sb);
        }
        sb.append(C4584d2.f28243l);
        return sb.toString();
    }

    @hib
    @igg({"NewApi"})
    public LocationRequest toLocationRequest(@efb String str) {
        return Build.VERSION.SDK_INT >= 31 ? toLocationRequest() : ug9.m23344a(C14057a.toLocationRequest(this, str));
    }

    /* JADX INFO: renamed from: vg9$c */
    public static final class C14059c {

        /* JADX INFO: renamed from: a */
        public long f91096a;

        /* JADX INFO: renamed from: b */
        public int f91097b;

        /* JADX INFO: renamed from: c */
        public long f91098c;

        /* JADX INFO: renamed from: d */
        public int f91099d;

        /* JADX INFO: renamed from: e */
        public long f91100e;

        /* JADX INFO: renamed from: f */
        public float f91101f;

        /* JADX INFO: renamed from: g */
        public long f91102g;

        public C14059c(long j) {
            setIntervalMillis(j);
            this.f91097b = 102;
            this.f91098c = Long.MAX_VALUE;
            this.f91099d = Integer.MAX_VALUE;
            this.f91100e = -1L;
            this.f91101f = 0.0f;
            this.f91102g = 0L;
        }

        @efb
        public vg9 build() {
            z7d.checkState((this.f91096a == Long.MAX_VALUE && this.f91100e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.f91096a;
            return new vg9(j, this.f91097b, this.f91098c, this.f91099d, Math.min(this.f91100e, j), this.f91101f, this.f91102g);
        }

        @efb
        public C14059c clearMinUpdateIntervalMillis() {
            this.f91100e = -1L;
            return this;
        }

        @efb
        public C14059c setDurationMillis(@h78(from = 1) long j) {
            this.f91098c = z7d.checkArgumentInRange(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @efb
        public C14059c setIntervalMillis(@h78(from = 0) long j) {
            this.f91096a = z7d.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @efb
        public C14059c setMaxUpdateDelayMillis(@h78(from = 0) long j) {
            this.f91102g = j;
            this.f91102g = z7d.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @efb
        public C14059c setMaxUpdates(@h78(from = 1, m12174to = 2147483647L) int i) {
            this.f91099d = z7d.checkArgumentInRange(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @efb
        public C14059c setMinUpdateDistanceMeters(@y46(from = 0.0d, m25645to = 3.4028234663852886E38d) float f) {
            this.f91101f = f;
            this.f91101f = z7d.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @efb
        public C14059c setMinUpdateIntervalMillis(@h78(from = 0) long j) {
            this.f91100e = z7d.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @efb
        public C14059c setQuality(int i) {
            z7d.checkArgument(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.f91097b = i;
            return this;
        }

        public C14059c(@efb vg9 vg9Var) {
            this.f91096a = vg9Var.f91084b;
            this.f91097b = vg9Var.f91083a;
            this.f91098c = vg9Var.f91086d;
            this.f91099d = vg9Var.f91087e;
            this.f91100e = vg9Var.f91085c;
            this.f91101f = vg9Var.f91088f;
            this.f91102g = vg9Var.f91089g;
        }
    }
}
