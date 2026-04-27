package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p000.kx7;
import p000.mvf;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public class by7<K extends Comparable<?>, V> implements fpd<K, V>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final by7<Comparable<?>, Object> f15191c = new by7<>(kx7.m15110of(), kx7.m15110of());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final transient kx7<bpd<K>> f15192a;

    /* JADX INFO: renamed from: b */
    public final transient kx7<V> f15193b;

    /* JADX INFO: renamed from: by7$a */
    public class C2099a extends kx7<bpd<K>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f15194c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f15195d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bpd f15196e;

        public C2099a(final int val$len, final int val$off, final bpd val$range) {
            this.f15194c = val$len;
            this.f15195d = val$off;
            this.f15196e = val$range;
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f15194c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public bpd<K> get(int index) {
            v7d.checkElementIndex(index, this.f15194c);
            return (index == 0 || index == this.f15194c + (-1)) ? ((bpd) by7.this.f15192a.get(index + this.f15195d)).intersection(this.f15196e) : (bpd) by7.this.f15192a.get(index + this.f15195d);
        }
    }

    /* JADX INFO: renamed from: by7$b */
    public class C2100b extends by7<K, V> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bpd f15198d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ by7 f15199e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2100b(final by7 this$0, kx7 ranges, kx7 values, final bpd val$range, final by7 val$outer) {
            super(ranges, values);
            this.f15198d = val$range;
            this.f15199e = val$outer;
        }

        @Override // p000.by7, p000.fpd
        public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
            return super.asDescendingMapOfRanges();
        }

        @Override // p000.by7, p000.fpd
        public /* bridge */ /* synthetic */ Map asMapOfRanges() {
            return super.asMapOfRanges();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.by7, p000.fpd
        public by7<K, V> subRangeMap(bpd<K> subRange) {
            return this.f15198d.isConnected(subRange) ? this.f15199e.subRangeMap((bpd) subRange.intersection(this.f15198d)) : by7.m3491of();
        }
    }

    /* JADX INFO: renamed from: by7$c */
    @jh4
    public static final class C2101c<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a */
        public final List<Map.Entry<bpd<K>, V>> f15200a = eb9.newArrayList();

        @op1
        /* JADX INFO: renamed from: a */
        public C2101c<K, V> m3493a(C2101c<K, V> builder) {
            this.f15200a.addAll(builder.f15200a);
            return this;
        }

        public by7<K, V> build() {
            Collections.sort(this.f15200a, bpd.m3331d().m21770a());
            kx7.C8541a c8541a = new kx7.C8541a(this.f15200a.size());
            kx7.C8541a c8541a2 = new kx7.C8541a(this.f15200a.size());
            for (int i = 0; i < this.f15200a.size(); i++) {
                bpd<K> key = this.f15200a.get(i).getKey();
                if (i > 0) {
                    bpd<K> key2 = this.f15200a.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + key2 + " overlaps with entry " + key);
                    }
                }
                c8541a.add(key);
                c8541a2.add(this.f15200a.get(i).getValue());
            }
            return new by7<>(c8541a.build(), c8541a2.build());
        }

        @op1
        public C2101c<K, V> put(bpd<K> range, V value) {
            v7d.checkNotNull(range);
            v7d.checkNotNull(value);
            v7d.checkArgument(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.f15200a.add(tt9.immutableEntry(range, value));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @op1
        public C2101c<K, V> putAll(fpd<K, ? extends V> rangeMap) {
            for (Map.Entry entry : rangeMap.asMapOfRanges().entrySet()) {
                put((bpd) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: by7$d */
    public static class C2102d<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final ox7<bpd<K>, V> f15201a;

        public C2102d(ox7<bpd<K>, V> mapOfRanges) {
            this.f15201a = mapOfRanges;
        }

        /* JADX INFO: renamed from: a */
        public Object m3494a() {
            C2101c c2101c = new C2101c();
            quh<Map.Entry<bpd<K>, V>> it = this.f15201a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<bpd<K>, V> next = it.next();
                c2101c.put(next.getKey(), next.getValue());
            }
            return c2101c.build();
        }

        public Object readResolve() {
            return this.f15201a.isEmpty() ? by7.m3491of() : m3494a();
        }
    }

    public by7(kx7<bpd<K>> ranges, kx7<V> values) {
        this.f15192a = ranges;
        this.f15193b = values;
    }

    public static <K extends Comparable<?>, V> C2101c<K, V> builder() {
        return new C2101c<>();
    }

    public static <K extends Comparable<?>, V> by7<K, V> copyOf(fpd<K, ? extends V> rangeMap) {
        if (rangeMap instanceof by7) {
            return (by7) rangeMap;
        }
        Map<bpd<K>, ? extends V> mapAsMapOfRanges = rangeMap.asMapOfRanges();
        kx7.C8541a c8541a = new kx7.C8541a(mapAsMapOfRanges.size());
        kx7.C8541a c8541a2 = new kx7.C8541a(mapAsMapOfRanges.size());
        for (Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            c8541a.add((bpd) entry.getKey());
            c8541a2.add(entry.getValue());
        }
        return new by7<>(c8541a.build(), c8541a2.build());
    }

    /* JADX INFO: renamed from: of */
    public static <K extends Comparable<?>, V> by7<K, V> m3491of() {
        return (by7<K, V>) f15191c;
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.fpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.fpd
    public boolean equals(@wx1 Object o) {
        if (o instanceof fpd) {
            return asMapOfRanges().equals(((fpd) o).asMapOfRanges());
        }
        return false;
    }

    @Override // p000.fpd
    @wx1
    public V get(K key) {
        int iBinarySearch = mvf.binarySearch(this.f15192a, (lz6<? super E, ie3>) bpd.m3330c(), ie3.m12917d(key), mvf.EnumC9554c.f62399a, mvf.EnumC9553b.f62395a);
        if (iBinarySearch != -1 && this.f15192a.get(iBinarySearch).contains(key)) {
            return this.f15193b.get(iBinarySearch);
        }
        return null;
    }

    @Override // p000.fpd
    @wx1
    public Map.Entry<bpd<K>, V> getEntry(K key) {
        int iBinarySearch = mvf.binarySearch(this.f15192a, (lz6<? super E, ie3>) bpd.m3330c(), ie3.m12917d(key), mvf.EnumC9554c.f62399a, mvf.EnumC9553b.f62395a);
        if (iBinarySearch == -1) {
            return null;
        }
        bpd<K> bpdVar = this.f15192a.get(iBinarySearch);
        if (bpdVar.contains(key)) {
            return tt9.immutableEntry(bpdVar, this.f15193b.get(iBinarySearch));
        }
        return null;
    }

    @Override // p000.fpd
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // p000.fpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void put(bpd<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.fpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(fpd<K, ? extends V> rangeMap) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.fpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putCoalescing(bpd<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.fpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove(bpd<K> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.fpd
    public bpd<K> span() {
        if (this.f15192a.isEmpty()) {
            throw new NoSuchElementException();
        }
        return bpd.m3329b(this.f15192a.get(0).f14409a, this.f15192a.get(r1.size() - 1).f14410b);
    }

    @Override // p000.fpd
    public String toString() {
        return asMapOfRanges().toString();
    }

    public Object writeReplace() {
        return new C2102d(asMapOfRanges());
    }

    /* JADX INFO: renamed from: of */
    public static <K extends Comparable<?>, V> by7<K, V> m3492of(bpd<K> range, V value) {
        return new by7<>(kx7.m15111of(range), kx7.m15111of(value));
    }

    @Override // p000.fpd
    public ox7<bpd<K>, V> asDescendingMapOfRanges() {
        return this.f15192a.isEmpty() ? ox7.m19076of() : new iy7(new qxd(this.f15192a.reverse(), bpd.m3331d().reverse()), this.f15193b.reverse());
    }

    @Override // p000.fpd
    public ox7<bpd<K>, V> asMapOfRanges() {
        return this.f15192a.isEmpty() ? ox7.m19076of() : new iy7(new qxd(this.f15192a, bpd.m3331d()), this.f15193b);
    }

    @Override // p000.fpd
    public by7<K, V> subRangeMap(final bpd<K> range) {
        if (((bpd) v7d.checkNotNull(range)).isEmpty()) {
            return m3491of();
        }
        if (this.f15192a.isEmpty() || range.encloses(span())) {
            return this;
        }
        kx7<bpd<K>> kx7Var = this.f15192a;
        lz6 lz6VarM3332e = bpd.m3332e();
        Comparable comparable = range.f14409a;
        mvf.EnumC9554c enumC9554c = mvf.EnumC9554c.f62402d;
        mvf.EnumC9553b enumC9553b = mvf.EnumC9553b.f62396b;
        int iBinarySearch = mvf.binarySearch(kx7Var, (lz6<? super E, Comparable>) lz6VarM3332e, comparable, enumC9554c, enumC9553b);
        int iBinarySearch2 = mvf.binarySearch(this.f15192a, (lz6<? super E, Comparable>) bpd.m3330c(), range.f14410b, mvf.EnumC9554c.f62399a, enumC9553b);
        return iBinarySearch >= iBinarySearch2 ? m3491of() : new C2100b(this, new C2099a(iBinarySearch2 - iBinarySearch, iBinarySearch, range), this.f15193b.subList(iBinarySearch, iBinarySearch2), range, this);
    }
}
