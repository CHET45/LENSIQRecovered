package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MutableScatterMultiMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1#1,4582:1\n874#2,18:4583\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MutableScatterMultiMap\n*L\n4252#1:4583,18\n*E\n"})
public final class t6b<K, V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final s6b<K, Object> f83807a;

    private /* synthetic */ t6b(s6b s6bVar) {
        this.f83807a = s6bVar;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ t6b m32374boximpl(s6b s6bVar) {
        return new t6b(s6bVar);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> s6b<K, Object> m32375constructorimpl(@yfb s6b<K, Object> s6bVar) {
        return s6bVar;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32376equalsimpl(s6b<K, Object> s6bVar, Object obj) {
        return (obj instanceof t6b) && md8.areEqual(s6bVar, ((t6b) obj).m32382unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32377equalsimpl0(s6b<K, Object> s6bVar, s6b<K, Object> s6bVar2) {
        return md8.areEqual(s6bVar, s6bVar2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32378hashCodeimpl(s6b<K, Object> s6bVar) {
        return s6bVar.hashCode();
    }

    @gib
    /* JADX INFO: renamed from: pop-impl, reason: not valid java name */
    public static final V m32379popimpl(s6b<K, Object> s6bVar, K k) {
        V v = (V) s6bVar.get(k);
        if (v == null) {
            return null;
        }
        if (qlh.isMutableList(v)) {
            List listAsMutableList = qlh.asMutableList(v);
            Object objRemove = listAsMutableList.remove(0);
            if (listAsMutableList.isEmpty()) {
                s6bVar.remove(k);
            }
            v = (V) objRemove;
        } else {
            s6bVar.remove(k);
        }
        md8.checkNotNull(v, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return v;
    }

    /* JADX INFO: renamed from: put-impl, reason: not valid java name */
    public static final void m32380putimpl(s6b<K, Object> s6bVar, K k, @yfb V v) {
        int iFindInsertIndex = s6bVar.findInsertIndex(k);
        boolean z = iFindInsertIndex < 0;
        Object obj = z ? null : s6bVar.f14266c[iFindInsertIndex];
        if (obj != null) {
            if (qlh.isMutableList(obj)) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                List listAsMutableList = qlh.asMutableList(obj);
                listAsMutableList.add(v);
                v = (V) listAsMutableList;
            } else {
                v = (V) l82.mutableListOf(obj, v);
            }
        }
        if (!z) {
            s6bVar.f14266c[iFindInsertIndex] = v;
            return;
        }
        int i = ~iFindInsertIndex;
        s6bVar.f14265b[i] = k;
        s6bVar.f14266c[i] = v;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32381toStringimpl(s6b<K, Object> s6bVar) {
        return "MutableScatterMultiMap(map=" + s6bVar + ')';
    }

    public boolean equals(Object obj) {
        return m32376equalsimpl(this.f83807a, obj);
    }

    @yfb
    public final s6b<K, Object> getMap() {
        return this.f83807a;
    }

    public int hashCode() {
        return m32378hashCodeimpl(this.f83807a);
    }

    public String toString() {
        return m32381toStringimpl(this.f83807a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ s6b m32382unboximpl() {
        return this.f83807a;
    }
}
