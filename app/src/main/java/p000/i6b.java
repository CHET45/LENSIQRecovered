package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.a77;
import p000.d9d;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,361:1\n1#2:362\n1179#3,2:363\n1253#3,4:365\n13579#4,2:369\n167#5,3:371\n*S KotlinDebug\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n*L\n158#1:363,2\n158#1:365,4\n250#1:369,2\n283#1:371,3\n*E\n"})
public final class i6b extends d9d {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<d9d.C4675a<?>, Object> f45851a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final nb0 f45852b;

    /* JADX INFO: renamed from: i6b$a */
    public static final class C7159a extends tt8 implements qy6<Map.Entry<d9d.C4675a<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: a */
        public static final C7159a f45853a = new C7159a();

        public C7159a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(@yfb Map.Entry<d9d.C4675a<?>, Object> entry) {
            md8.checkNotNullParameter(entry, "entry");
            Object value = entry.getValue();
            return a77.C0077a.f542d + entry.getKey().getName() + " = " + (value instanceof byte[] ? e80.joinToString$default((byte[]) value, (CharSequence) ", ", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (qy6) null, 56, (Object) null) : String.valueOf(entry.getValue()));
        }
    }

    public i6b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // p000.d9d
    @yfb
    public Map<d9d.C4675a<?>, Object> asMap() {
        scc sccVar;
        Set<Map.Entry<d9d.C4675a<?>, Object>> setEntrySet = this.f45851a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                sccVar = new scc(key, bArrCopyOf);
            } else {
                sccVar = new scc(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(sccVar.getFirst(), sccVar.getSecond());
        }
        return C6812he.immutableMap(linkedHashMap);
    }

    public final void checkNotFrozen$datastore_preferences_core_release() {
        if (this.f45852b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core_release();
        this.f45851a.clear();
    }

    @Override // p000.d9d
    public <T> boolean contains(@yfb d9d.C4675a<T> c4675a) {
        md8.checkNotNullParameter(c4675a, "key");
        return this.f45851a.containsKey(c4675a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@p000.gib java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.i6b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            i6b r6 = (p000.i6b) r6
            java.util.Map<d9d$a<?>, java.lang.Object> r0 = r6.f45851a
            java.util.Map<d9d$a<?>, java.lang.Object> r2 = r5.f45851a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map<d9d$a<?>, java.lang.Object> r2 = r5.f45851a
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map<d9d$a<?>, java.lang.Object> r6 = r6.f45851a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L27
        L25:
            r1 = r3
            goto L67
        L27:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map<d9d$a<?>, java.lang.Object> r2 = r5.f45851a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L64
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5f
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L64
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L64
            r0 = r3
            goto L65
        L5f:
            boolean r0 = p000.md8.areEqual(r0, r2)
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 != 0) goto L2f
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i6b.equals(java.lang.Object):boolean");
    }

    public final void freeze$datastore_preferences_core_release() {
        this.f45852b.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.d9d
    @gib
    public <T> T get(@yfb d9d.C4675a<T> c4675a) {
        md8.checkNotNullParameter(c4675a, "key");
        T t = (T) this.f45851a.get(c4675a);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        T t2 = (T) Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(t2, "copyOf(this, size)");
        return t2;
    }

    @yfb
    public final Map<d9d.C4675a<?>, Object> getPreferencesMap$datastore_preferences_core_release() {
        return this.f45851a;
    }

    public int hashCode() {
        Iterator<T> it = this.f45851a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void minusAssign(@yfb d9d.C4675a<?> c4675a) {
        md8.checkNotNullParameter(c4675a, "key");
        checkNotFrozen$datastore_preferences_core_release();
        remove(c4675a);
    }

    public final void plusAssign(@yfb d9d d9dVar) {
        md8.checkNotNullParameter(d9dVar, "prefs");
        checkNotFrozen$datastore_preferences_core_release();
        this.f45851a.putAll(d9dVar.asMap());
    }

    public final void putAll(@yfb d9d.C4676b<?>... c4676bArr) {
        md8.checkNotNullParameter(c4676bArr, "pairs");
        checkNotFrozen$datastore_preferences_core_release();
        for (d9d.C4676b<?> c4676b : c4676bArr) {
            setUnchecked$datastore_preferences_core_release(c4676b.getKey$datastore_preferences_core_release(), c4676b.getValue$datastore_preferences_core_release());
        }
    }

    public final <T> T remove(@yfb d9d.C4675a<T> c4675a) {
        md8.checkNotNullParameter(c4675a, "key");
        checkNotFrozen$datastore_preferences_core_release();
        return (T) this.f45851a.remove(c4675a);
    }

    public final <T> void set(@yfb d9d.C4675a<T> c4675a, T t) {
        md8.checkNotNullParameter(c4675a, "key");
        setUnchecked$datastore_preferences_core_release(c4675a, t);
    }

    public final void setUnchecked$datastore_preferences_core_release(@yfb d9d.C4675a<?> c4675a, @gib Object obj) {
        md8.checkNotNullParameter(c4675a, "key");
        checkNotFrozen$datastore_preferences_core_release();
        if (obj == null) {
            remove(c4675a);
            return;
        }
        if (obj instanceof Set) {
            this.f45851a.put(c4675a, C6812he.immutableCopyOfSet((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f45851a.put(c4675a, obj);
            return;
        }
        Map<d9d.C4675a<?>, Object> map = this.f45851a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        map.put(c4675a, bArrCopyOf);
    }

    @yfb
    public String toString() {
        return v82.joinToString$default(this.f45851a.entrySet(), ",\n", "{\n", "\n}", 0, null, C7159a.f45853a, 24, null);
    }

    public /* synthetic */ i6b(Map map, boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public final void plusAssign(@yfb d9d.C4676b<?> c4676b) {
        md8.checkNotNullParameter(c4676b, "pair");
        checkNotFrozen$datastore_preferences_core_release();
        putAll(c4676b);
    }

    public i6b(@yfb Map<d9d.C4675a<?>, Object> map, boolean z) {
        md8.checkNotNullParameter(map, "preferencesMap");
        this.f45851a = map;
        this.f45852b = new nb0(z);
    }
}
