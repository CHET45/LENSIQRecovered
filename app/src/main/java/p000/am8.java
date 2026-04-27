package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
@x0f(with = cm8.class)
public final class am8 extends sk8 implements Map<String, sk8>, uo8 {

    @yfb
    public static final C0324a Companion = new C0324a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<String, sk8> f2072a;

    /* JADX INFO: renamed from: am8$a */
    public static final class C0324a {
        private C0324a() {
        }

        @yfb
        public final lp8<am8> serializer() {
            return cm8.f16946a;
        }

        public /* synthetic */ C0324a(jt3 jt3Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public am8(@yfb Map<String, ? extends sk8> map) {
        super(null);
        md8.checkNotNullParameter(map, "content");
        this.f2072a = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(Map.Entry entry) {
        md8.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        sk8 sk8Var = (sk8) entry.getValue();
        StringBuilder sb = new StringBuilder();
        e8g.printQuoted(sb, str);
        sb.append(':');
        sb.append(sk8Var);
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: compute, reason: avoid collision after fix types in other method */
    public sk8 compute2(String str, BiFunction<? super String, ? super sk8, ? extends sk8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public sk8 computeIfAbsent2(String str, Function<? super String, ? extends sk8> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public sk8 computeIfPresent2(String str, BiFunction<? super String, ? super sk8, ? extends sk8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        return this.f2072a.containsKey(str);
    }

    public boolean containsValue(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "value");
        return this.f2072a.containsValue(sk8Var);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, sk8>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@gib Object obj) {
        return md8.areEqual(this.f2072a, obj);
    }

    @gib
    public sk8 get(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        return this.f2072a.get(str);
    }

    @yfb
    public Set<Map.Entry<String, sk8>> getEntries() {
        return this.f2072a.entrySet();
    }

    @yfb
    public Set<String> getKeys() {
        return this.f2072a.keySet();
    }

    public int getSize() {
        return this.f2072a.size();
    }

    @yfb
    public Collection<sk8> getValues() {
        return this.f2072a.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f2072a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f2072a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    /* JADX INFO: renamed from: merge, reason: avoid collision after fix types in other method */
    public sk8 merge2(String str, sk8 sk8Var, BiFunction<? super sk8, ? super sk8, ? extends sk8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public sk8 put2(String str, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends sk8> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public sk8 putIfAbsent2(String str, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public sk8 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public sk8 replace2(String str, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super sk8, ? extends sk8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @yfb
    public String toString() {
        return v82.joinToString$default(this.f2072a.entrySet(), ",", "{", "}", 0, null, new qy6() { // from class: zl8
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return am8.toString$lambda$1((Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<sk8> values() {
        return getValues();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ sk8 compute(String str, BiFunction<? super String, ? super sk8, ? extends sk8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ sk8 computeIfAbsent(String str, Function<? super String, ? extends sk8> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ sk8 computeIfPresent(String str, BiFunction<? super String, ? super sk8, ? extends sk8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof sk8) {
            return containsValue((sk8) obj);
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public final /* bridge */ sk8 get2(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ sk8 merge(String str, sk8 sk8Var, BiFunction<? super sk8, ? super sk8, ? extends sk8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ sk8 put(String str, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ sk8 putIfAbsent(String str, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ sk8 replace(String str, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ sk8 get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, sk8 sk8Var, sk8 sk8Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(String str, sk8 sk8Var, sk8 sk8Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
