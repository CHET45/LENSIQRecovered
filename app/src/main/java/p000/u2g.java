package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n317#1,4:373\n1#2:377\n1#2:378\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n298#1:373,4\n298#1:377\n*E\n"})
public abstract class u2g<K, V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final auf<K, V> f86683a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Iterator<Map.Entry<K, V>> f86684b;

    /* JADX INFO: renamed from: c */
    public int f86685c;

    /* JADX INFO: renamed from: d */
    @gib
    public Map.Entry<? extends K, ? extends V> f86686d;

    /* JADX INFO: renamed from: e */
    @gib
    public Map.Entry<? extends K, ? extends V> f86687e;

    /* JADX WARN: Multi-variable type inference failed */
    public u2g(@yfb auf<K, V> aufVar, @yfb Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f86683a = aufVar;
        this.f86684b = it;
        this.f86685c = aufVar.getModification$runtime_release();
        m23076a();
    }

    /* JADX INFO: renamed from: a */
    public final void m23076a() {
        this.f86686d = this.f86687e;
        this.f86687e = this.f86684b.hasNext() ? this.f86684b.next() : null;
    }

    @gib
    /* JADX INFO: renamed from: b */
    public final Map.Entry<K, V> m23077b() {
        return this.f86686d;
    }

    /* JADX INFO: renamed from: c */
    public final int m23078c() {
        return this.f86685c;
    }

    @gib
    /* JADX INFO: renamed from: d */
    public final Map.Entry<K, V> m23079d() {
        return this.f86687e;
    }

    /* JADX INFO: renamed from: e */
    public final <T> T m23080e(@yfb ny6<? extends T> ny6Var) {
        if (getMap().getModification$runtime_release() != this.f86685c) {
            throw new ConcurrentModificationException();
        }
        T tInvoke = ny6Var.invoke();
        this.f86685c = getMap().getModification$runtime_release();
        return tInvoke;
    }

    /* JADX INFO: renamed from: f */
    public final void m23081f(@gib Map.Entry<? extends K, ? extends V> entry) {
        this.f86686d = entry;
    }

    /* JADX INFO: renamed from: g */
    public final void m23082g(int i) {
        this.f86685c = i;
    }

    @yfb
    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.f86684b;
    }

    @yfb
    public final auf<K, V> getMap() {
        return this.f86683a;
    }

    /* JADX INFO: renamed from: h */
    public final void m23083h(@gib Map.Entry<? extends K, ? extends V> entry) {
        this.f86687e = entry;
    }

    public final boolean hasNext() {
        return this.f86687e != null;
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() != this.f86685c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f86686d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f86683a.remove(entry.getKey());
        this.f86686d = null;
        bth bthVar = bth.f14751a;
        this.f86685c = getMap().getModification$runtime_release();
    }
}
