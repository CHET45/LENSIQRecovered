package p000;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class qr7<V> {

    /* JADX INFO: renamed from: a */
    public final C11607a<V>[] f75193a;

    /* JADX INFO: renamed from: b */
    public final int f75194b;

    /* JADX INFO: renamed from: qr7$a */
    public static final class C11607a<V> {

        /* JADX INFO: renamed from: a */
        public final int f75195a;

        /* JADX INFO: renamed from: b */
        public final Type f75196b;

        /* JADX INFO: renamed from: c */
        public V f75197c;

        /* JADX INFO: renamed from: d */
        public final C11607a<V> f75198d;

        public C11607a(Type type, V v, int i, C11607a<V> c11607a) {
            this.f75196b = type;
            this.f75197c = v;
            this.f75198d = c11607a;
            this.f75195a = i;
        }
    }

    public qr7(int i) {
        this.f75194b = i - 1;
        this.f75193a = new C11607a[i];
    }

    public final V get(Type type) {
        for (C11607a<V> c11607a = this.f75193a[System.identityHashCode(type) & this.f75194b]; c11607a != null; c11607a = c11607a.f75198d) {
            if (type == c11607a.f75196b) {
                return c11607a.f75197c;
            }
        }
        return null;
    }

    public boolean put(Type type, V v) {
        int iIdentityHashCode = System.identityHashCode(type);
        int i = this.f75194b & iIdentityHashCode;
        for (C11607a<V> c11607a = this.f75193a[i]; c11607a != null; c11607a = c11607a.f75198d) {
            if (type == c11607a.f75196b) {
                c11607a.f75197c = v;
                return true;
            }
        }
        this.f75193a[i] = new C11607a<>(type, v, iIdentityHashCode, this.f75193a[i]);
        return false;
    }
}
