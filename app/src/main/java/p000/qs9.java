package p000;

import java.util.Map;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class qs9<K, V> extends or8<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c */
    @yfb
    public final f0f f75489c;

    /* JADX INFO: renamed from: qs9$a */
    public static final class C11667a<K, V> implements Map.Entry<K, V>, uo8 {

        /* JADX INFO: renamed from: a */
        public final K f75490a;

        /* JADX INFO: renamed from: b */
        public final V f75491b;

        public C11667a(K k, V v) {
            this.f75490a = k;
            this.f75491b = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C11667a copy$default(C11667a c11667a, Object obj, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = c11667a.f75490a;
            }
            if ((i & 2) != 0) {
                obj2 = c11667a.f75491b;
            }
            return c11667a.copy(obj, obj2);
        }

        public final K component1() {
            return this.f75490a;
        }

        public final V component2() {
            return this.f75491b;
        }

        @yfb
        public final C11667a<K, V> copy(K k, V v) {
            return new C11667a<>(k, v);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11667a)) {
                return false;
            }
            C11667a c11667a = (C11667a) obj;
            return md8.areEqual(this.f75490a, c11667a.f75490a) && md8.areEqual(this.f75491b, c11667a.f75491b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f75490a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f75491b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f75490a;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.f75491b;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @yfb
        public String toString() {
            return "MapEntry(key=" + this.f75490a + ", value=" + this.f75491b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs9(@yfb final lp8<K> lp8Var, @yfb final lp8<V> lp8Var2) {
        super(lp8Var, lp8Var2, null);
        md8.checkNotNullParameter(lp8Var, "keySerializer");
        md8.checkNotNullParameter(lp8Var2, "valueSerializer");
        this.f75489c = n0f.buildSerialDescriptor("kotlin.collections.Map.Entry", xag.C15019c.f97389a, new f0f[0], new qy6() { // from class: ps9
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return qs9.descriptor$lambda$0(lp8Var, lp8Var2, (l12) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor$lambda$0(lp8 lp8Var, lp8 lp8Var2, l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildSerialDescriptor");
        l12.element$default(l12Var, "key", lp8Var.getDescriptor(), null, false, 12, null);
        l12.element$default(l12Var, "value", lp8Var2.getDescriptor(), null, false, 12, null);
        return bth.f14751a;
    }

    @Override // p000.or8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public K getKey(@yfb Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // p000.or8
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public V getValue(@yfb Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // p000.or8
    @yfb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> toResult(K k, V v) {
        return new C11667a(k, v);
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f75489c;
    }
}
