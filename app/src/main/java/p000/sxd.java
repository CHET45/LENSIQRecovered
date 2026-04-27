package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import p000.kkg;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class sxd<R, C, V> extends ty7<R, C, V> {

    /* JADX INFO: renamed from: sxd$b */
    public final class C12823b extends p08<kkg.InterfaceC8439a<R, C, V>> {
        private C12823b() {
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            if (!(object instanceof kkg.InterfaceC8439a)) {
                return false;
            }
            kkg.InterfaceC8439a interfaceC8439a = (kkg.InterfaceC8439a) object;
            Object obj = sxd.this.get(interfaceC8439a.getRowKey(), interfaceC8439a.getColumnKey());
            return obj != null && obj.equals(interfaceC8439a.getValue());
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return false;
        }

        @Override // p000.p08
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public kkg.InterfaceC8439a<R, C, V> get(int index) {
            return sxd.this.getCell(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return sxd.this.size();
        }
    }

    /* JADX INFO: renamed from: sxd$c */
    public final class C12824c extends kx7<V> {
        private C12824c() {
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) sxd.this.getValue(i);
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return sxd.this.size();
        }
    }

    private static <R, C, V> sxd<R, C, V> forCellsInternal(Iterable<kkg.InterfaceC8439a<R, C, V>> cells, @wx1 Comparator<? super R> rowComparator, @wx1 Comparator<? super C> columnComparator) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        kx7 kx7VarCopyOf = kx7.copyOf(cells);
        for (kkg.InterfaceC8439a<R, C, V> interfaceC8439a : cells) {
            linkedHashSet.add(interfaceC8439a.getRowKey());
            linkedHashSet2.add(interfaceC8439a.getColumnKey());
        }
        return m22288o(kx7VarCopyOf, rowComparator == null ? dy7.copyOf((Collection) linkedHashSet) : dy7.copyOf((Collection) kx7.sortedCopyOf(rowComparator, linkedHashSet)), columnComparator == null ? dy7.copyOf((Collection) linkedHashSet2) : dy7.copyOf((Collection) kx7.sortedCopyOf(columnComparator, linkedHashSet2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$forCells$0(Comparator comparator, Comparator comparator2, kkg.InterfaceC8439a interfaceC8439a, kkg.InterfaceC8439a interfaceC8439a2) {
        int iCompare = comparator == null ? 0 : comparator.compare(interfaceC8439a.getRowKey(), interfaceC8439a2.getRowKey());
        if (iCompare != 0) {
            return iCompare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(interfaceC8439a.getColumnKey(), interfaceC8439a2.getColumnKey());
    }

    /* JADX INFO: renamed from: m */
    public static <R, C, V> sxd<R, C, V> m22286m(Iterable<kkg.InterfaceC8439a<R, C, V>> cells) {
        return forCellsInternal(cells, null, null);
    }

    /* JADX INFO: renamed from: n */
    public static <R, C, V> sxd<R, C, V> m22287n(List<kkg.InterfaceC8439a<R, C, V>> cells, @wx1 final Comparator<? super R> rowComparator, @wx1 final Comparator<? super C> columnComparator) {
        v7d.checkNotNull(cells);
        if (rowComparator != null || columnComparator != null) {
            Collections.sort(cells, new Comparator() { // from class: rxd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return sxd.lambda$forCells$0(rowComparator, columnComparator, (kkg.InterfaceC8439a) obj, (kkg.InterfaceC8439a) obj2);
                }
            });
        }
        return forCellsInternal(cells, rowComparator, columnComparator);
    }

    /* JADX INFO: renamed from: o */
    public static <R, C, V> sxd<R, C, V> m22288o(kx7<kkg.InterfaceC8439a<R, C, V>> cellList, dy7<R> rowSpace, dy7<C> columnSpace) {
        return ((long) cellList.size()) > (((long) rowSpace.size()) * ((long) columnSpace.size())) / 2 ? new b64(cellList, rowSpace, columnSpace) : new rxf(cellList, rowSpace, columnSpace);
    }

    public abstract kkg.InterfaceC8439a<R, C, V> getCell(int iterationIndex);

    public abstract V getValue(int iterationIndex);

    @Override // p000.ty7, p000.AbstractC1739b5
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final dy7<kkg.InterfaceC8439a<R, C, V>> mo2932b() {
        return isEmpty() ? dy7.m9575of() : new C12823b();
    }

    @Override // p000.ty7, p000.AbstractC1739b5
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ax7<V> mo2933c() {
        return isEmpty() ? kx7.m15110of() : new C12824c();
    }

    /* JADX INFO: renamed from: l */
    public final void m22291l(R rowKey, C columnKey, @wx1 V existingValue, V newValue) {
        v7d.checkArgument(existingValue == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", rowKey, columnKey, newValue, existingValue);
    }
}
