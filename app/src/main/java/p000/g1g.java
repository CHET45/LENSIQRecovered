package p000;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public class g1g<R, C, V> extends i1g<R, C, V> implements ice<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g1g$b */
    public class C6089b extends i1g<R, C, V>.C7108h implements SortedMap<R, Map<C, V>> {
        private C6089b() {
            super();
        }

        @Override // p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> createKeySet() {
            return new tt9.C13201g0(this);
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super R> comparator() {
            return g1g.this.sortedBackingMap().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) g1g.this.sortedBackingMap().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R toKey) {
            v7d.checkNotNull(toKey);
            return new g1g(g1g.this.sortedBackingMap().headMap(toKey), g1g.this.f45451d).rowMap();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) g1g.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R fromKey, R toKey) {
            v7d.checkNotNull(fromKey);
            v7d.checkNotNull(toKey);
            return new g1g(g1g.this.sortedBackingMap().subMap(fromKey, toKey), g1g.this.f45451d).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R fromKey) {
            v7d.checkNotNull(fromKey);
            return new g1g(g1g.this.sortedBackingMap().tailMap(fromKey), g1g.this.f45451d).rowMap();
        }

        @Override // p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    public g1g(SortedMap<R, Map<C, V>> backingMap, lfg<? extends Map<C, V>> factory) {
        super(backingMap, factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.f45450c;
    }

    @Override // p000.i1g
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> mo11306i() {
        return new C6089b();
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // p000.i1g, p000.kkg
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
