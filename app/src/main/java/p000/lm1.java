package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lm1 implements il1 {

    /* JADX INFO: renamed from: g */
    public static final int f58203g = 256;

    /* JADX INFO: renamed from: h */
    public static final Map<String, lm1> f58204h = new HashMap();

    /* JADX INFO: renamed from: e */
    public final String f58205e;

    /* JADX INFO: renamed from: f */
    public final pp9<String, C8894a> f58206f;

    /* JADX INFO: renamed from: lm1$a */
    public static final class C8894a {

        /* JADX INFO: renamed from: a */
        public long f58207a;

        /* JADX INFO: renamed from: b */
        public Object f58208b;

        public C8894a(long j, Object obj) {
            this.f58207a = j;
            this.f58208b = obj;
        }
    }

    private lm1(String str, pp9<String, C8894a> pp9Var) {
        this.f58205e = str;
        this.f58206f = pp9Var;
    }

    public static lm1 getInstance() {
        return getInstance(256);
    }

    public void clear() {
        this.f58206f.evictAll();
    }

    public <T> T get(@efb String str) {
        if (str != null) {
            return (T) get(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public int getCacheCount() {
        return this.f58206f.size();
    }

    public void put(@efb String str, Object obj) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, obj, -1);
    }

    public Object remove(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        C8894a c8894aRemove = this.f58206f.remove(str);
        if (c8894aRemove == null) {
            return null;
        }
        return c8894aRemove.f58208b;
    }

    public String toString() {
        return this.f58205e + "@" + Integer.toHexString(hashCode());
    }

    public static lm1 getInstance(int i) {
        return getInstance(String.valueOf(i), i);
    }

    public static lm1 getInstance(String str, int i) {
        Map<String, lm1> map = f58204h;
        lm1 lm1Var = map.get(str);
        if (lm1Var == null) {
            synchronized (lm1.class) {
                try {
                    lm1Var = map.get(str);
                    if (lm1Var == null) {
                        lm1Var = new lm1(str, new pp9(i));
                        map.put(str, lm1Var);
                    }
                } finally {
                }
            }
        }
        return lm1Var;
    }

    public <T> T get(@efb String str, T t) {
        if (str != null) {
            C8894a c8894a = this.f58206f.get(str);
            if (c8894a == null) {
                return t;
            }
            long j = c8894a.f58207a;
            if (j != -1 && j < System.currentTimeMillis()) {
                this.f58206f.remove(str);
                return t;
            }
            return (T) c8894a.f58208b;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Object obj, int i) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (obj == null) {
            return;
        }
        this.f58206f.put(str, new C8894a(i < 0 ? -1L : System.currentTimeMillis() + ((long) (i * 1000)), obj));
    }
}
