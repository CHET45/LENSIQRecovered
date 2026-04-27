package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n350#1:354\n350#1:363\n350#1:365\n350#1:367\n350#1:369\n350#1:371\n350#1:373\n26#2:355\n26#2:357\n26#2:358\n26#2:359\n26#2:360\n26#2:361\n26#2:362\n26#2:364\n26#2:366\n26#2:368\n26#2:370\n26#2:372\n26#2:374\n26#2:375\n26#2:376\n26#2:377\n1#3:356\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n40#1:354\n297#1:363\n303#1:365\n309#1:367\n314#1:369\n319#1:371\n324#1:373\n40#1:355\n71#1:357\n86#1:358\n104#1:359\n142#1:360\n176#1:361\n218#1:362\n297#1:364\n303#1:366\n309#1:368\n314#1:370\n319#1:372\n324#1:374\n331#1:375\n341#1:376\n350#1:377\n*E\n"})
@e0g(parameters = 0)
public class np9<K, V> {

    /* JADX INFO: renamed from: k */
    public static final int f65185k = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final cig f65186a = whg.createSynchronizedObject();

    /* JADX INFO: renamed from: b */
    @yfb
    public final HashMap<K, V> f65187b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final LinkedHashSet<K> f65188c;

    /* JADX INFO: renamed from: d */
    public int f65189d;

    /* JADX INFO: renamed from: e */
    public int f65190e;

    /* JADX INFO: renamed from: f */
    public int f65191f;

    /* JADX INFO: renamed from: g */
    public int f65192g;

    /* JADX INFO: renamed from: h */
    public int f65193h;

    /* JADX INFO: renamed from: i */
    public int f65194i;

    /* JADX INFO: renamed from: j */
    public int f65195j;

    public np9(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f65190e = i;
        this.f65187b = new HashMap<>(0, 0.75f);
        this.f65188c = new LinkedHashSet<>();
    }

    private final int safeSizeOf(K k, V v) {
        int iM18054c = m18054c(k, v);
        if (iM18054c >= 0) {
            return iM18054c;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    @gib
    /* JADX INFO: renamed from: a */
    public V m18052a(K k) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m18053b(boolean z, K k, V v, @gib V v2) {
    }

    /* JADX INFO: renamed from: c */
    public int m18054c(K k, V v) {
        return 1;
    }

    public final int createCount() {
        int i;
        synchronized (this.f65186a) {
            i = this.f65192g;
        }
        return i;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.f65186a) {
            i = this.f65193h;
        }
        return i;
    }

    @gib
    public final V get(K k) {
        synchronized (this.f65186a) {
            V v = this.f65187b.get(k);
            if (v != null) {
                this.f65188c.remove(k);
                this.f65188c.add(k);
                this.f65194i++;
                return v;
            }
            this.f65195j++;
            V vM18052a = m18052a(k);
            if (vM18052a == null) {
                return null;
            }
            synchronized (this.f65186a) {
                try {
                    this.f65192g++;
                    V vPut = this.f65187b.put(k, vM18052a);
                    this.f65188c.remove(k);
                    this.f65188c.add(k);
                    if (vPut != null) {
                        this.f65187b.put(k, vPut);
                        v = vPut;
                    } else {
                        this.f65189d = size() + safeSizeOf(k, vM18052a);
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                m18053b(false, k, vM18052a, v);
                return v;
            }
            trimToSize(this.f65190e);
            return vM18052a;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.f65186a) {
            i = this.f65194i;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.f65186a) {
            i = this.f65190e;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.f65186a) {
            i = this.f65195j;
        }
        return i;
    }

    @gib
    public final V put(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw null;
        }
        synchronized (this.f65186a) {
            try {
                this.f65191f++;
                this.f65189d = size() + safeSizeOf(k, v);
                vPut = this.f65187b.put(k, v);
                if (vPut != null) {
                    this.f65189d = size() - safeSizeOf(k, vPut);
                }
                if (this.f65188c.contains(k)) {
                    this.f65188c.remove(k);
                }
                this.f65188c.add(k);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            m18053b(false, k, vPut, v);
        }
        trimToSize(this.f65190e);
        return vPut;
    }

    public final int putCount() {
        int i;
        synchronized (this.f65186a) {
            i = this.f65191f;
        }
        return i;
    }

    @gib
    public final V remove(K k) {
        V vRemove;
        k.getClass();
        synchronized (this.f65186a) {
            try {
                vRemove = this.f65187b.remove(k);
                this.f65188c.remove(k);
                if (vRemove != null) {
                    this.f65189d = size() - safeSizeOf(k, vRemove);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            m18053b(false, k, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.f65186a) {
            this.f65190e = i;
            bth bthVar = bth.f14751a;
        }
        trimToSize(i);
    }

    @xn8(name = MediaInformation.KEY_SIZE)
    public final int size() {
        int i;
        synchronized (this.f65186a) {
            i = this.f65189d;
        }
        return i;
    }

    @yfb
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f65186a) {
            linkedHashMap = new LinkedHashMap();
            for (K k : this.f65188c) {
                V v = this.f65187b.get(k);
                md8.checkNotNull(v);
                linkedHashMap.put(k, v);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(@yfb ny6<? extends R> ny6Var) {
        R rInvoke;
        synchronized (this.f65186a) {
            try {
                rInvoke = ny6Var.invoke();
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        return rInvoke;
    }

    @yfb
    public String toString() {
        String str;
        synchronized (this.f65186a) {
            try {
                int i = this.f65194i;
                int i2 = this.f65195j + i;
                str = "LruCache[maxSize=" + this.f65190e + ",hits=" + this.f65194i + ",misses=" + this.f65195j + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            cig r0 = r7.f65186a
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap<K, V> r1 = r7.f65187b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap<K, V> r1 = r7.f65187b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r2 = r7.f65188c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap<K, V> r1 = r7.f65187b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet<K> r1 = r7.f65188c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = p000.v82.first(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap<K, V> r4 = r7.f65187b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap<K, V> r5 = r7.f65187b     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = p000.qlh.asMutableMap(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r5 = r7.f65188c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = p000.qlh.asMutableCollection(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L18
            p000.md8.checkNotNull(r1)     // Catch: java.lang.Throwable -> L18
            p000.md8.checkNotNull(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.safeSizeOf(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.f65189d = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.f65193h     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.f65193h = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            bth r5 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            p000.md8.checkNotNull(r1)
            p000.md8.checkNotNull(r4)
            r7.m18053b(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.np9.trimToSize(int):void");
    }
}
