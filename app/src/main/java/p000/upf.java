package p000;

import java.util.Map;
import p000.kkg;
import p000.ty7;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public class upf<R, C, V> extends ty7<R, C, V> {

    /* JADX INFO: renamed from: c */
    public final R f88729c;

    /* JADX INFO: renamed from: d */
    public final C f88730d;

    /* JADX INFO: renamed from: e */
    public final V f88731e;

    public upf(R r, C c, V v) {
        this.f88729c = (R) v7d.checkNotNull(r);
        this.f88730d = (C) v7d.checkNotNull(c);
        this.f88731e = (V) v7d.checkNotNull(v);
    }

    @Override // p000.ty7, p000.AbstractC1739b5
    /* JADX INFO: renamed from: h */
    public dy7<kkg.InterfaceC8439a<R, C, V>> mo2932b() {
        return dy7.m9576of(ty7.m22917f(this.f88729c, this.f88730d, this.f88731e));
    }

    @Override // p000.ty7
    /* JADX INFO: renamed from: i */
    public ty7.C13287b mo2952i() {
        return ty7.C13287b.m22923a(this, new int[]{0}, new int[]{0});
    }

    @Override // p000.ty7, p000.AbstractC1739b5
    /* JADX INFO: renamed from: j */
    public ax7<V> mo2933c() {
        return dy7.m9576of(this.f88731e);
    }

    @Override // p000.kkg
    public int size() {
        return 1;
    }

    @Override // p000.ty7, p000.kkg
    public ox7<R, V> column(C columnKey) {
        v7d.checkNotNull(columnKey);
        return containsColumn(columnKey) ? ox7.m19077of(this.f88729c, (Object) this.f88731e) : ox7.m19076of();
    }

    @Override // p000.ty7, p000.kkg
    public ox7<C, Map<R, V>> columnMap() {
        return ox7.m19077of(this.f88730d, ox7.m19077of(this.f88729c, (Object) this.f88731e));
    }

    @Override // p000.ty7, p000.kkg
    public ox7<R, Map<C, V>> rowMap() {
        return ox7.m19077of(this.f88729c, ox7.m19077of(this.f88730d, (Object) this.f88731e));
    }

    public upf(kkg.InterfaceC8439a<R, C, V> cell) {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }
}
