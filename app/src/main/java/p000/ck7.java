package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n1855#2,2:348\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n200#1:348,2\n*E\n"})
@e0g(parameters = 0)
public final class ck7 implements List<InterfaceC0701e.d>, uo8 {

    /* JADX INFO: renamed from: f */
    public static final int f16809f = 8;

    /* JADX INFO: renamed from: d */
    public int f16813d;

    /* JADX INFO: renamed from: a */
    @yfb
    public Object[] f16810a = new Object[16];

    /* JADX INFO: renamed from: b */
    @yfb
    public long[] f16811b = new long[16];

    /* JADX INFO: renamed from: c */
    public int f16812c = -1;

    /* JADX INFO: renamed from: e */
    public boolean f16814e = true;

    /* JADX INFO: renamed from: ck7$a */
    public final class C2343a implements ListIterator<InterfaceC0701e.d>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f16815a;

        /* JADX INFO: renamed from: b */
        public final int f16816b;

        /* JADX INFO: renamed from: c */
        public final int f16817c;

        public C2343a(int i, int i2, int i3) {
            this.f16815a = i;
            this.f16816b = i2;
            this.f16817c = i3;
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.f16815a;
        }

        public final int getMaxIndex() {
            return this.f16817c;
        }

        public final int getMinIndex() {
            return this.f16816b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f16815a < this.f16817c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f16815a > this.f16816b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f16815a - this.f16816b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f16815a - this.f16816b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.f16815a = i;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @yfb
        public InterfaceC0701e.d next() {
            Object[] objArr = ck7.this.f16810a;
            int i = this.f16815a;
            this.f16815a = i + 1;
            Object obj = objArr[i];
            md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (InterfaceC0701e.d) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        @yfb
        public InterfaceC0701e.d previous() {
            Object[] objArr = ck7.this.f16810a;
            int i = this.f16815a - 1;
            this.f16815a = i;
            Object obj = objArr[i];
            md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (InterfaceC0701e.d) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ C2343a(ck7 ck7Var, int i, int i2, int i3, int i4, jt3 jt3Var) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? ck7Var.size() : i3);
        }
    }

    /* JADX INFO: renamed from: ck7$b */
    @dwf({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n1855#2,2:348\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n279#1:348,2\n*E\n"})
    public final class C2344b implements List<InterfaceC0701e.d>, uo8 {

        /* JADX INFO: renamed from: a */
        public final int f16819a;

        /* JADX INFO: renamed from: b */
        public final int f16820b;

        public C2344b(int i, int i2) {
            this.f16819a = i;
            this.f16820b = i2;
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i, InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends InterfaceC0701e.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof InterfaceC0701e.d) {
                return contains((InterfaceC0701e.d) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@yfb Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int getMaxIndex() {
            return this.f16820b;
        }

        public final int getMinIndex() {
            return this.f16819a;
        }

        public int getSize() {
            return this.f16820b - this.f16819a;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof InterfaceC0701e.d) {
                return indexOf((InterfaceC0701e.d) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @yfb
        public Iterator<InterfaceC0701e.d> iterator() {
            ck7 ck7Var = ck7.this;
            int i = this.f16819a;
            return ck7Var.new C2343a(i, i, this.f16820b);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof InterfaceC0701e.d) {
                return lastIndexOf((InterfaceC0701e.d) obj);
            }
            return -1;
        }

        @Override // java.util.List
        @yfb
        public ListIterator<InterfaceC0701e.d> listIterator() {
            ck7 ck7Var = ck7.this;
            int i = this.f16819a;
            return ck7Var.new C2343a(i, i, this.f16820b);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public InterfaceC0701e.d remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<InterfaceC0701e.d> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public InterfaceC0701e.d set2(int i, InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<? super InterfaceC0701e.d> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @yfb
        public List<InterfaceC0701e.d> subList(int i, int i2) {
            ck7 ck7Var = ck7.this;
            int i3 = this.f16819a;
            return ck7Var.new C2344b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return f82.toArray(this);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends InterfaceC0701e.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(@yfb InterfaceC0701e.d dVar) {
            return indexOf((Object) dVar) != -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        @yfb
        public InterfaceC0701e.d get(int i) {
            Object obj = ck7.this.f16810a[i + this.f16819a];
            md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (InterfaceC0701e.d) obj;
        }

        public int indexOf(@yfb InterfaceC0701e.d dVar) {
            int i = this.f16819a;
            int i2 = this.f16820b;
            if (i > i2) {
                return -1;
            }
            while (!md8.areEqual(ck7.this.f16810a[i], dVar)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.f16819a;
        }

        public int lastIndexOf(@yfb InterfaceC0701e.d dVar) {
            int i = this.f16820b;
            int i2 = this.f16819a;
            if (i2 > i) {
                return -1;
            }
            while (!md8.areEqual(ck7.this.f16810a[i], dVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f16819a;
        }

        @Override // java.util.List
        @yfb
        public ListIterator<InterfaceC0701e.d> listIterator(int i) {
            ck7 ck7Var = ck7.this;
            int i2 = this.f16819a;
            return ck7Var.new C2343a(i + i2, i2, this.f16820b);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ InterfaceC0701e.d remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ InterfaceC0701e.d set(int i, InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f82.toArray(this, tArr);
        }

        public boolean add(InterfaceC0701e.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final void ensureContainerSize() {
        int i = this.f16812c;
        Object[] objArr = this.f16810a;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f16810a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f16811b, length);
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f16811b = jArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: findBestHitDistance-ptXAw2c, reason: not valid java name */
    private final long m28227findBestHitDistanceptXAw2c() {
        long jDistanceAndInLayer = dk7.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i = this.f16812c + 1;
        int lastIndex = l82.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                long jM32603constructorimpl = ug4.m32603constructorimpl(this.f16811b[i]);
                if (ug4.m32602compareToS_HNhKs(jM32603constructorimpl, jDistanceAndInLayer) < 0) {
                    jDistanceAndInLayer = jM32603constructorimpl;
                }
                if (ug4.m32606getDistanceimpl(jDistanceAndInLayer) < 0.0f && ug4.m32608isInLayerimpl(jDistanceAndInLayer)) {
                    return jDistanceAndInLayer;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return jDistanceAndInLayer;
    }

    private final void resizeToHitDepth() {
        int i = this.f16812c + 1;
        int lastIndex = l82.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                this.f16810a[i] = null;
                if (i == lastIndex) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f16813d = this.f16812c + 1;
    }

    public final void acceptHits() {
        this.f16812c = size() - 1;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, InterfaceC0701e.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends InterfaceC0701e.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f16812c = -1;
        resizeToHitDepth();
        this.f16814e = true;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC0701e.d) {
            return contains((InterfaceC0701e.d) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean getShouldSharePointerInputWithSibling() {
        return this.f16814e;
    }

    public int getSize() {
        return this.f16813d;
    }

    public final boolean hasHit() {
        long jM28227findBestHitDistanceptXAw2c = m28227findBestHitDistanceptXAw2c();
        return ug4.m32606getDistanceimpl(jM28227findBestHitDistanceptXAw2c) < 0.0f && ug4.m32608isInLayerimpl(jM28227findBestHitDistanceptXAw2c);
    }

    public final void hit(@yfb InterfaceC0701e.d dVar, boolean z, @yfb ny6<bth> ny6Var) {
        hitInMinimumTouchTarget(dVar, -1.0f, z, ny6Var);
        heb coordinator$ui_release = dVar.getCoordinator$ui_release();
        if (coordinator$ui_release == null || coordinator$ui_release.shouldSharePointerInputWithSiblings()) {
            return;
        }
        this.f16814e = false;
    }

    public final void hitInMinimumTouchTarget(@yfb InterfaceC0701e.d dVar, float f, boolean z, @yfb ny6<bth> ny6Var) {
        int i = this.f16812c;
        this.f16812c = i + 1;
        ensureContainerSize();
        Object[] objArr = this.f16810a;
        int i2 = this.f16812c;
        objArr[i2] = dVar;
        this.f16811b[i2] = dk7.DistanceAndInLayer(f, z);
        resizeToHitDepth();
        ny6Var.invoke();
        this.f16812c = i;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC0701e.d) {
            return indexOf((InterfaceC0701e.d) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        if (this.f16812c == l82.getLastIndex(this)) {
            return true;
        }
        return ug4.m32602compareToS_HNhKs(m28227findBestHitDistanceptXAw2c(), dk7.DistanceAndInLayer(f, z)) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<InterfaceC0701e.d> iterator() {
        return new C2343a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC0701e.d) {
            return lastIndexOf((InterfaceC0701e.d) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<InterfaceC0701e.d> listIterator() {
        return new C2343a(this, 0, 0, 0, 7, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public InterfaceC0701e.d remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<InterfaceC0701e.d> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public InterfaceC0701e.d set2(int i, InterfaceC0701e.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setShouldSharePointerInputWithSibling(boolean z) {
        this.f16814e = z;
    }

    public final void siblingHits(@yfb ny6<bth> ny6Var) {
        int i = this.f16812c;
        ny6Var.invoke();
        this.f16812c = i;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super InterfaceC0701e.d> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(@yfb InterfaceC0701e.d dVar, float f, boolean z, @yfb ny6<bth> ny6Var) {
        if (this.f16812c == l82.getLastIndex(this)) {
            hitInMinimumTouchTarget(dVar, f, z, ny6Var);
            if (this.f16812c + 1 == l82.getLastIndex(this)) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long jM28227findBestHitDistanceptXAw2c = m28227findBestHitDistanceptXAw2c();
        int i = this.f16812c;
        this.f16812c = l82.getLastIndex(this);
        hitInMinimumTouchTarget(dVar, f, z, ny6Var);
        if (this.f16812c + 1 < l82.getLastIndex(this) && ug4.m32602compareToS_HNhKs(jM28227findBestHitDistanceptXAw2c, m28227findBestHitDistanceptXAw2c()) > 0) {
            int i2 = this.f16812c + 1;
            int i3 = i + 1;
            Object[] objArr = this.f16810a;
            u70.copyInto(objArr, objArr, i3, i2, size());
            long[] jArr = this.f16811b;
            u70.copyInto(jArr, jArr, i3, i2, size());
            this.f16812c = ((size() + i) - this.f16812c) - 1;
        }
        resizeToHitDepth();
        this.f16812c = i;
    }

    @Override // java.util.List
    @yfb
    public List<InterfaceC0701e.d> subList(int i, int i2) {
        return new C2344b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, InterfaceC0701e.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC0701e.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@yfb InterfaceC0701e.d dVar) {
        return indexOf((Object) dVar) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @yfb
    public InterfaceC0701e.d get(int i) {
        Object obj = this.f16810a[i];
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (InterfaceC0701e.d) obj;
    }

    public int indexOf(@yfb InterfaceC0701e.d dVar) {
        int lastIndex = l82.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i = 0;
        while (!md8.areEqual(this.f16810a[i], dVar)) {
            if (i == lastIndex) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public int lastIndexOf(@yfb InterfaceC0701e.d dVar) {
        for (int lastIndex = l82.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (md8.areEqual(this.f16810a[lastIndex], dVar)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<InterfaceC0701e.d> listIterator(int i) {
        return new C2343a(this, i, 0, 0, 6, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC0701e.d remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC0701e.d set(int i, InterfaceC0701e.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }

    public boolean add(InterfaceC0701e.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
