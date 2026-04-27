package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class wcc<K, V> extends or8<K, V, scc<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c */
    @yfb
    public final f0f f93944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcc(@yfb final lp8<K> lp8Var, @yfb final lp8<V> lp8Var2) {
        super(lp8Var, lp8Var2, null);
        md8.checkNotNullParameter(lp8Var, "keySerializer");
        md8.checkNotNullParameter(lp8Var2, "valueSerializer");
        this.f93944c = n0f.buildClassSerialDescriptor("kotlin.Pair", new f0f[0], new qy6() { // from class: vcc
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return wcc.descriptor$lambda$0(lp8Var, lp8Var2, (l12) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor$lambda$0(lp8 lp8Var, lp8 lp8Var2, l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildClassSerialDescriptor");
        l12.element$default(l12Var, "first", lp8Var.getDescriptor(), null, false, 12, null);
        l12.element$default(l12Var, "second", lp8Var2.getDescriptor(), null, false, 12, null);
        return bth.f14751a;
    }

    @Override // p000.or8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public K getKey(@yfb scc<? extends K, ? extends V> sccVar) {
        md8.checkNotNullParameter(sccVar, "<this>");
        return sccVar.getFirst();
    }

    @Override // p000.or8
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public V getValue(@yfb scc<? extends K, ? extends V> sccVar) {
        md8.checkNotNullParameter(sccVar, "<this>");
        return sccVar.getSecond();
    }

    @Override // p000.or8
    @yfb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public scc<K, V> toResult(K k, V v) {
        return vkh.m24050to(k, v);
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f93944c;
    }
}
