package p000;

import java.util.Map;
import p000.nih;
import p000.qqc;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class pqc extends uqc<kn2<Object>, l2i<Object>> implements qqc {

    /* JADX INFO: renamed from: F */
    @yfb
    public static final C11074b f71652F = new C11074b(null);

    /* JADX INFO: renamed from: H */
    public static final int f71653H = 0;

    /* JADX INFO: renamed from: L */
    @yfb
    public static final pqc f71654L;

    /* JADX INFO: renamed from: pqc$a */
    @e0g(parameters = 0)
    public static final class C11073a extends wqc<kn2<Object>, l2i<Object>> implements qqc.InterfaceC11587a {

        /* JADX INFO: renamed from: F */
        public static final int f71655F = 8;

        /* JADX INFO: renamed from: C */
        @yfb
        public pqc f71656C;

        public C11073a(@yfb pqc pqcVar) {
            super(pqcVar);
            this.f71656C = pqcVar;
        }

        public /* bridge */ boolean containsKey(kn2<Object> kn2Var) {
            return super.containsKey(kn2Var);
        }

        public /* bridge */ boolean containsValue(l2i<Object> l2iVar) {
            return super.containsValue((Object) l2iVar);
        }

        public /* bridge */ l2i<Object> get(kn2<Object> kn2Var) {
            return (l2i) super.get(kn2Var);
        }

        @yfb
        public final pqc getMap$runtime_release() {
            return this.f71656C;
        }

        public /* bridge */ l2i<Object> getOrDefault(kn2<Object> kn2Var, l2i<Object> l2iVar) {
            return (l2i) super.getOrDefault((Object) kn2Var, l2iVar);
        }

        public /* bridge */ l2i<Object> remove(kn2<Object> kn2Var) {
            return (l2i) super.remove(kn2Var);
        }

        public final void setMap$runtime_release(@yfb pqc pqcVar) {
            this.f71656C = pqcVar;
        }

        @Override // p000.wqc, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof kn2) {
                return containsKey((kn2<Object>) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof l2i) {
                return containsValue((l2i<Object>) obj);
            }
            return false;
        }

        @Override // p000.wqc, java.util.AbstractMap, java.util.Map
        public final /* bridge */ l2i<Object> get(Object obj) {
            if (obj instanceof kn2) {
                return get((kn2<Object>) obj);
            }
            return null;
        }

        public final /* bridge */ l2i getOrDefault(Object obj, l2i l2iVar) {
            return !(obj instanceof kn2) ? l2iVar : getOrDefault((kn2<Object>) obj, (l2i<Object>) l2iVar);
        }

        @Override // p000.wqc, java.util.AbstractMap, java.util.Map
        public final /* bridge */ l2i<Object> remove(Object obj) {
            if (obj instanceof kn2) {
                return remove((kn2<Object>) obj);
            }
            return null;
        }

        @Override // p000.wqc, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof kn2) {
                return get((kn2<Object>) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof kn2) ? obj2 : getOrDefault((kn2<Object>) obj, (l2i<Object>) obj2);
        }

        @Override // p000.wqc, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof kn2) {
                return remove((kn2<Object>) obj);
            }
            return null;
        }

        @Override // p000.wqc, p000.qrc.InterfaceC11636a, p000.qqc.InterfaceC11587a
        @yfb
        public pqc build() {
            pqc pqcVar;
            if (getNode$runtime_release() == this.f71656C.getNode$runtime_release()) {
                pqcVar = this.f71656C;
            } else {
                m24752a(new q4b());
                pqcVar = new pqc(getNode$runtime_release(), size());
            }
            this.f71656C = pqcVar;
            return pqcVar;
        }
    }

    /* JADX INFO: renamed from: pqc$b */
    public static final class C11074b {
        public /* synthetic */ C11074b(jt3 jt3Var) {
            this();
        }

        public static /* synthetic */ void getEmpty$annotations() {
        }

        @yfb
        public final pqc getEmpty() {
            return pqc.f71654L;
        }

        private C11074b() {
        }
    }

    static {
        nih eMPTY$runtime_release = nih.f64689e.getEMPTY$runtime_release();
        md8.checkNotNull(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f71654L = new pqc(eMPTY$runtime_release, 0);
    }

    public pqc(@yfb nih<kn2<Object>, l2i<Object>> nihVar, int i) {
        super(nihVar, i);
    }

    public /* bridge */ boolean containsKey(kn2<Object> kn2Var) {
        return super.containsKey(kn2Var);
    }

    public /* bridge */ boolean containsValue(l2i<Object> l2iVar) {
        return super.containsValue((Object) l2iVar);
    }

    @Override // p000.qn2
    public /* bridge */ l2i<Object> get(kn2<Object> kn2Var) {
        return (l2i) super.get(kn2Var);
    }

    @Override // p000.uqc, p000.AbstractC11273q2, p000.px7
    @yfb
    public ey7<Map.Entry<kn2<Object>, l2i<Object>>> getEntries() {
        return super.getEntries();
    }

    public /* bridge */ l2i<Object> getOrDefault(kn2<Object> kn2Var, l2i<Object> l2iVar) {
        return (l2i) super.getOrDefault((Object) kn2Var, l2iVar);
    }

    @Override // p000.qqc
    @yfb
    public qqc putValue(@yfb kn2<Object> kn2Var, @yfb l2i<Object> l2iVar) {
        nih.C9898b<kn2<Object>, l2i<Object>> c9898bPut = getNode$runtime_release().put(kn2Var.hashCode(), kn2Var, l2iVar, 0);
        return c9898bPut == null ? this : new pqc(c9898bPut.getNode(), size() + c9898bPut.getSizeDelta());
    }

    @Override // p000.uqc, p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof kn2) {
            return containsKey((kn2<Object>) obj);
        }
        return false;
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof l2i) {
            return containsValue((l2i<Object>) obj);
        }
        return false;
    }

    @Override // p000.uqc, p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ l2i<Object> get(Object obj) {
        if (obj instanceof kn2) {
            return get((kn2<Object>) obj);
        }
        return null;
    }

    public final /* bridge */ l2i getOrDefault(Object obj, l2i l2iVar) {
        return !(obj instanceof kn2) ? l2iVar : getOrDefault((kn2<Object>) obj, (l2i<Object>) l2iVar);
    }

    @Override // p000.uqc, p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof kn2) {
            return get((kn2<Object>) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof kn2) ? obj2 : getOrDefault((kn2<Object>) obj, (l2i<Object>) obj2);
    }

    @Override // p000.uqc, p000.qrc, p000.qqc
    @yfb
    public C11073a builder() {
        return new C11073a(this);
    }

    @Override // p000.qn2
    public <T> T get(@yfb kn2<T> kn2Var) {
        return (T) rn2.read(this, kn2Var);
    }
}
