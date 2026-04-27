package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p000.kkg;
import p000.ox7;
import p000.ty7;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tw7(containerOf = {"R", "C", k95.f53074X4})
@tx4
public final class rxf<R, C, V> extends sxd<R, C, V> {

    /* JADX INFO: renamed from: m */
    public static final ty7<Object, Object, Object> f80073m = new rxf(kx7.m15110of(), dy7.m9575of(), dy7.m9575of());

    /* JADX INFO: renamed from: c */
    public final ox7<R, ox7<C, V>> f80074c;

    /* JADX INFO: renamed from: d */
    public final ox7<C, ox7<R, V>> f80075d;

    /* JADX INFO: renamed from: e */
    public final int[] f80076e;

    /* JADX INFO: renamed from: f */
    public final int[] f80077f;

    /* JADX WARN: Multi-variable type inference failed */
    public rxf(kx7<kkg.InterfaceC8439a<R, C, V>> kx7Var, dy7<R> dy7Var, dy7<C> dy7Var2) {
        ox7 ox7VarM22795p = tt9.m22795p(dy7Var);
        LinkedHashMap linkedHashMapNewLinkedHashMap = tt9.newLinkedHashMap();
        quh<R> it = dy7Var.iterator();
        while (it.hasNext()) {
            linkedHashMapNewLinkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = tt9.newLinkedHashMap();
        quh<C> it2 = dy7Var2.iterator();
        while (it2.hasNext()) {
            linkedHashMapNewLinkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[kx7Var.size()];
        int[] iArr2 = new int[kx7Var.size()];
        for (int i = 0; i < kx7Var.size(); i++) {
            kkg.InterfaceC8439a<R, C, V> interfaceC8439a = kx7Var.get(i);
            R rowKey = interfaceC8439a.getRowKey();
            C columnKey = interfaceC8439a.getColumnKey();
            V value = interfaceC8439a.getValue();
            Integer num = (Integer) ox7VarM22795p.get(rowKey);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMapNewLinkedHashMap.get(rowKey);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            m22291l(rowKey, columnKey, map2.put(columnKey, value), value);
            Map map3 = (Map) linkedHashMapNewLinkedHashMap2.get(columnKey);
            Objects.requireNonNull(map3);
            map3.put(rowKey, value);
        }
        this.f80076e = iArr;
        this.f80077f = iArr2;
        ox7.C10705d c10705d = new ox7.C10705d(linkedHashMapNewLinkedHashMap.size());
        for (Map.Entry entry : linkedHashMapNewLinkedHashMap.entrySet()) {
            c10705d.put(entry.getKey(), ox7.copyOf((Map) entry.getValue()));
        }
        this.f80074c = c10705d.buildOrThrow();
        ox7.C10705d c10705d2 = new ox7.C10705d(linkedHashMapNewLinkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMapNewLinkedHashMap2.entrySet()) {
            c10705d2.put(entry2.getKey(), ox7.copyOf((Map) entry2.getValue()));
        }
        this.f80075d = c10705d2.buildOrThrow();
    }

    @Override // p000.sxd
    public kkg.InterfaceC8439a<R, C, V> getCell(int index) {
        Map.Entry<R, ox7<C, V>> entry = this.f80074c.entrySet().asList().get(this.f80076e[index]);
        ox7<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.f80077f[index]);
        return ty7.m22917f(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // p000.sxd
    public V getValue(int index) {
        ox7<C, V> ox7Var = this.f80074c.values().asList().get(this.f80076e[index]);
        return ox7Var.values().asList().get(this.f80077f[index]);
    }

    @Override // p000.ty7
    /* JADX INFO: renamed from: i */
    public ty7.C13287b mo2952i() {
        ox7 ox7VarM22795p = tt9.m22795p(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        quh<kkg.InterfaceC8439a<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) ox7VarM22795p.get(it.next().getColumnKey());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ty7.C13287b.m22923a(this, this.f80076e, iArr);
    }

    @Override // p000.kkg
    public int size() {
        return this.f80076e.length;
    }

    @Override // p000.ty7, p000.kkg
    public ox7<C, Map<R, V>> columnMap() {
        return ox7.copyOf((Map) this.f80075d);
    }

    @Override // p000.ty7, p000.kkg
    public ox7<R, Map<C, V>> rowMap() {
        return ox7.copyOf((Map) this.f80074c);
    }
}
