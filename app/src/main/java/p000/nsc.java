package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p000.prc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,992:1\n33#2,7:993\n33#2,7:1000\n33#2,7:1008\n33#2,7:1016\n33#2,7:1023\n1#3:1007\n26#4:1015\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n242#1:993,7\n243#1:1000,7\n480#1:1008,7\n746#1:1016,7\n769#1:1023,7\n623#1:1015\n*E\n"})
@e0g(parameters = 0)
public final class nsc<E> extends AbstractC5568f3<E> implements prc.InterfaceC11080a<E> {

    /* JADX INFO: renamed from: F */
    public static final int f65510F = 8;

    /* JADX INFO: renamed from: C */
    public int f65511C;

    /* JADX INFO: renamed from: a */
    @yfb
    public prc<? extends E> f65512a;

    /* JADX INFO: renamed from: b */
    @gib
    public Object[] f65513b;

    /* JADX INFO: renamed from: c */
    @yfb
    public Object[] f65514c;

    /* JADX INFO: renamed from: d */
    public int f65515d;

    /* JADX INFO: renamed from: e */
    @yfb
    public q4b f65516e = new q4b();

    /* JADX INFO: renamed from: f */
    @gib
    public Object[] f65517f;

    /* JADX INFO: renamed from: m */
    @yfb
    public Object[] f65518m;

    /* JADX INFO: renamed from: nsc$a */
    public static final class C10043a extends tt8 implements qy6<E, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection<E> f65519a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10043a(Collection<? extends E> collection) {
            super(1);
            this.f65519a = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(E e) {
            return Boolean.valueOf(this.f65519a.contains(e));
        }
    }

    public nsc(@yfb prc<? extends E> prcVar, @gib Object[] objArr, @yfb Object[] objArr2, int i) {
        this.f65512a = prcVar;
        this.f65513b = objArr;
        this.f65514c = objArr2;
        this.f65515d = i;
        this.f65517f = this.f65513b;
        this.f65518m = this.f65514c;
        this.f65511C = this.f65512a.size();
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.f65518m;
        }
        Object[] objArr = this.f65517f;
        md8.checkNotNull(objArr);
        for (int i2 = this.f65515d; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[j1i.indexSegment(i, i2)];
            md8.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, hkb hkbVar) {
        Object obj2;
        int iIndexSegment = j1i.indexSegment(i2, i);
        if (i == 0) {
            hkbVar.setValue(objArr[31]);
            Object[] objArrCopyInto = u70.copyInto(objArr, makeMutable(objArr), iIndexSegment + 1, iIndexSegment, 31);
            objArrCopyInto[iIndexSegment] = obj;
            return objArrCopyInto;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        int i3 = i - 5;
        Object obj3 = objArrMakeMutable[iIndexSegment];
        md8.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj3, i3, i2, obj, hkbVar);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || (obj2 = objArrMakeMutable[iIndexSegment]) == null) {
                break;
            }
            md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj2, i3, 0, hkbVar.getValue(), hkbVar);
        }
        return objArrMakeMutable;
    }

    private final void insertIntoTail(Object[] objArr, int i, E e) {
        int iTailSize = tailSize();
        Object[] objArrMakeMutable = makeMutable(this.f65518m);
        if (iTailSize < 32) {
            u70.copyInto(this.f65518m, objArrMakeMutable, i + 1, i, iTailSize);
            objArrMakeMutable[i] = e;
            this.f65517f = objArr;
            this.f65518m = objArrMakeMutable;
            this.f65511C = size() + 1;
            return;
        }
        Object[] objArr2 = this.f65518m;
        Object obj = objArr2[31];
        u70.copyInto(objArr2, objArrMakeMutable, i + 1, i, 31);
        objArrMakeMutable[i] = e;
        pushFilledTail(objArr, objArrMakeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f65516e;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i) {
        Object[] objArr = this.f65517f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iRootSize = rootSize() >> 5;
        e99.checkPositionIndex$runtime_release(i, iRootSize);
        int i2 = this.f65515d;
        return i2 == 0 ? new hlf(objArr, i) : new mih(objArr, i, iRootSize, i2 / 5);
    }

    private final Object[] makeMutable(Object[] objArr) {
        return objArr == null ? mutableBuffer() : isMutable(objArr) ? objArr : u70.copyInto$default(objArr, mutableBuffer(), 0, 0, kpd.coerceAtMost(objArr.length, 32), 6, (Object) null);
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i) {
        return isMutable(objArr) ? u70.copyInto(objArr, objArr, i, 0, 32 - i) : u70.copyInto(objArr, mutableBuffer(), i, 0, 32 - i);
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f65516e;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f65516e;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            a8d.throwIllegalArgumentException("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iIndexSegment = j1i.indexSegment(i, i2);
        Object obj = objArr[iIndexSegment];
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objNullifyAfter = nullifyAfter((Object[]) obj, i, i2 - 5);
        if (iIndexSegment < 31) {
            int i3 = iIndexSegment + 1;
            if (objArr[i3] != null) {
                if (isMutable(objArr)) {
                    u70.fill(objArr, (Object) null, i3, 32);
                }
                objArr = u70.copyInto(objArr, mutableBuffer(), 0, 0, i3);
            }
        }
        if (objNullifyAfter == objArr[iIndexSegment]) {
            return objArr;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objNullifyAfter;
        return objArrMakeMutable;
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, hkb hkbVar) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = j1i.indexSegment(i2 - 1, i);
        if (i == 5) {
            hkbVar.setValue(objArr[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = objArr[iIndexSegment];
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, i - 5, i2, hkbVar);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objArrPullLastBuffer;
        return objArrMakeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f65517f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f65518m = objArr;
            this.f65511C = i;
            this.f65515d = i2;
            return;
        }
        hkb hkbVar = new hkb(null);
        md8.checkNotNull(objArr);
        Object[] objArrPullLastBuffer = pullLastBuffer(objArr, i2, i, hkbVar);
        md8.checkNotNull(objArrPullLastBuffer);
        Object value = hkbVar.getValue();
        md8.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f65518m = (Object[]) value;
        this.f65511C = i;
        if (objArrPullLastBuffer[1] == null) {
            this.f65517f = (Object[]) objArrPullLastBuffer[0];
            this.f65515d = i2 - 5;
        } else {
            this.f65517f = objArrPullLastBuffer;
            this.f65515d = i2;
        }
    }

    private final Object[] pushBuffers(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            a8d.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            a8d.throwIllegalArgumentException("negative shift");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        int iIndexSegment = j1i.indexSegment(i, i2);
        int i3 = i2 - 5;
        objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], i, i3, it);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !it.hasNext()) {
                break;
            }
            objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], 0, i3, it);
        }
        return objArrMakeMutable;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i, Object[][] objArr2) {
        Iterator<Object[]> it = l60.iterator(objArr2);
        int i2 = i >> 5;
        int i3 = this.f65515d;
        Object[] objArrPushBuffers = i2 < (1 << i3) ? pushBuffers(objArr, i, i3, it) : makeMutable(objArr);
        while (it.hasNext()) {
            this.f65515d += 5;
            objArrPushBuffers = mutableBufferWith(objArrPushBuffers);
            int i4 = this.f65515d;
            pushBuffers(objArrPushBuffers, 1 << i4, i4, it);
        }
        return objArrPushBuffers;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f65515d;
        if (size > (1 << i)) {
            this.f65517f = pushTail(mutableBufferWith(objArr), objArr2, this.f65515d + 5);
            this.f65518m = objArr3;
            this.f65515d += 5;
            this.f65511C = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f65517f = objArr2;
            this.f65518m = objArr3;
            this.f65511C = size() + 1;
        } else {
            this.f65517f = pushTail(objArr, objArr2, i);
            this.f65518m = objArr3;
            this.f65511C = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i) {
        int iIndexSegment = j1i.indexSegment(size() - 1, i);
        Object[] objArrMakeMutable = makeMutable(objArr);
        if (i == 5) {
            objArrMakeMutable[iIndexSegment] = objArr2;
        } else {
            objArrMakeMutable[iIndexSegment] = pushTail((Object[]) objArrMakeMutable[iIndexSegment], objArr2, i - 5);
        }
        return objArrMakeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(qy6<? super E, Boolean> qy6Var, Object[] objArr, int i, int i2, hkb hkbVar, List<Object[]> list, List<Object[]> list2) {
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = hkbVar.getValue();
        md8.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArrRemove = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!qy6Var.invoke(obj).booleanValue()) {
                if (i2 == 32) {
                    objArrRemove = !list.isEmpty() ? list.remove(list.size() - 1) : mutableBuffer();
                    i2 = 0;
                }
                objArrRemove[i2] = obj;
                i2++;
            }
        }
        hkbVar.setValue(objArrRemove);
        if (objArr2 != hkbVar.getValue()) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final int removeAllFromTail(qy6<? super E, Boolean> qy6Var, int i, hkb hkbVar) {
        int iRemoveAll = removeAll(qy6Var, this.f65518m, i, hkbVar);
        if (iRemoveAll == i) {
            ec2.m28824assert(hkbVar.getValue() == this.f65518m);
            return i;
        }
        Object value = hkbVar.getValue();
        md8.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        u70.fill(objArr, (Object) null, iRemoveAll, i);
        this.f65518m = objArr;
        this.f65511C = size() - (i - iRemoveAll);
        return iRemoveAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, hkb hkbVar) {
        int iIndexSegment = j1i.indexSegment(i2, i);
        if (i == 0) {
            Object obj = objArr[iIndexSegment];
            Object[] objArrCopyInto = u70.copyInto(objArr, makeMutable(objArr), iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyInto[31] = hkbVar.getValue();
            hkbVar.setValue(obj);
            return objArrCopyInto;
        }
        int iIndexSegment2 = objArr[31] == null ? j1i.indexSegment(rootSize() - 1, i) : 31;
        Object[] objArrMakeMutable = makeMutable(objArr);
        int i3 = i - 5;
        int i4 = iIndexSegment + 1;
        if (i4 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrMakeMutable[iIndexSegment2];
                md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrMakeMutable[iIndexSegment2] = removeFromRootAt((Object[]) obj2, i3, 0, hkbVar);
                if (iIndexSegment2 == i4) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrMakeMutable[iIndexSegment];
        md8.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable[iIndexSegment] = removeFromRootAt((Object[]) obj3, i3, i2, hkbVar);
        return objArrMakeMutable;
    }

    private final Object removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        ec2.m28824assert(i3 < size);
        if (size == 1) {
            Object obj = this.f65518m[0];
            pullLastBufferFromRoot(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f65518m;
        Object obj2 = objArr2[i3];
        Object[] objArrCopyInto = u70.copyInto(objArr2, makeMutable(objArr2), i3, i3 + 1, size);
        objArrCopyInto[size - 1] = null;
        this.f65517f = objArr;
        this.f65518m = objArrCopyInto;
        this.f65511C = (i + size) - 1;
        this.f65515d = i2;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i) {
        if (!((i & 31) == 0)) {
            a8d.throwIllegalArgumentException("invalid size");
        }
        if (i == 0) {
            this.f65515d = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.f65515d;
            if ((i2 >> i3) != 0) {
                return nullifyAfter(objArr, i2, i3);
            }
            this.f65515d = i3 - 5;
            Object[] objArr2 = objArr[0];
            md8.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return j1i.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, E e, hkb hkbVar) {
        int iIndexSegment = j1i.indexSegment(i2, i);
        Object[] objArrMakeMutable = makeMutable(objArr);
        if (i != 0) {
            Object obj = objArrMakeMutable[iIndexSegment];
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMakeMutable[iIndexSegment] = setInRoot((Object[]) obj, i - 5, i2, e, hkbVar);
            return objArrMakeMutable;
        }
        if (objArrMakeMutable != objArr) {
            ((AbstractList) this).modCount++;
        }
        hkbVar.setValue(objArrMakeMutable[iIndexSegment]);
        objArrMakeMutable[iIndexSegment] = e;
        return objArrMakeMutable;
    }

    private final Object[] shiftLeafBuffers(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f65517f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (listIteratorLeafBufferIterator.previousIndex() != i) {
            Object[] objArrPrevious = listIteratorLeafBufferIterator.previous();
            u70.copyInto(objArrPrevious, objArr2, 0, 32 - i2, 32);
            objArr2 = makeMutableShiftingRight(objArrPrevious, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return listIteratorLeafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrMutableBuffer;
        if (!(i3 >= 1)) {
            a8d.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArr2[0] = objArrMakeMutable;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            u70.copyInto(objArrMakeMutable, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrMutableBuffer = objArrMakeMutable;
            } else {
                objArrMutableBuffer = mutableBuffer();
                i3--;
                objArr2[i3] = objArrMutableBuffer;
            }
            int i7 = i2 - i6;
            u70.copyInto(objArrMakeMutable, objArr3, 0, i7, i2);
            u70.copyInto(objArrMakeMutable, objArrMutableBuffer, size + 1, i4, i7);
            objArr3 = objArrMutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(objArrMakeMutable, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            objArr2[i8] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(objArr3, 0, it);
    }

    private final int tailSize(int i) {
        return i <= 32 ? i : i - j1i.rootSize(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        if (iTailSize < 32) {
            Object[] objArrMakeMutable = makeMutable(this.f65518m);
            objArrMakeMutable[iTailSize] = e;
            this.f65518m = objArrMakeMutable;
            this.f65511C = size() + 1;
        } else {
            pushFilledTail(this.f65517f, this.f65518m, mutableBufferWith(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@yfb Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iTailSize >= collection.size()) {
            this.f65518m = copyToBuffer(makeMutable(this.f65518m), iTailSize, it);
            this.f65511C = size() + collection.size();
        } else {
            int size = ((collection.size() + iTailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.f65518m), iTailSize, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.f65517f = pushBuffersIncreasingHeightIfNeeded(this.f65517f, rootSize(), objArr);
            this.f65518m = copyToBuffer(mutableBuffer(), 0, it);
            this.f65511C = size() + collection.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        e99.checkElementIndex$runtime_release(i, size());
        return (E) bufferFor(i)[i & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @gib
    public final Object[] getRoot$runtime_release() {
        return this.f65517f;
    }

    public final int getRootShift$runtime_release() {
        return this.f65515d;
    }

    @Override // p000.AbstractC5568f3
    public int getSize() {
        return this.f65511C;
    }

    @yfb
    public final Object[] getTail$runtime_release() {
        return this.f65518m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @yfb
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    @yfb
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        return removeAllWithPredicate(new C10043a(collection));
    }

    public final boolean removeAllWithPredicate(@yfb qy6<? super E, Boolean> qy6Var) {
        boolean zRemoveAll = removeAll(qy6Var);
        if (zRemoveAll) {
            ((AbstractList) this).modCount++;
        }
        return zRemoveAll;
    }

    @Override // p000.AbstractC5568f3
    public E removeAt(int i) {
        e99.checkElementIndex$runtime_release(i, size());
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (i >= iRootSize) {
            return (E) removeFromTailAt(this.f65517f, iRootSize, this.f65515d, i - iRootSize);
        }
        hkb hkbVar = new hkb(this.f65518m[0]);
        Object[] objArr = this.f65517f;
        md8.checkNotNull(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.f65515d, i, hkbVar), iRootSize, this.f65515d, 0);
        return (E) hkbVar.getValue();
    }

    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        e99.checkElementIndex$runtime_release(i, size());
        if (rootSize() > i) {
            hkb hkbVar = new hkb(null);
            Object[] objArr = this.f65517f;
            md8.checkNotNull(objArr);
            this.f65517f = setInRoot(objArr, this.f65515d, i, e, hkbVar);
            return (E) hkbVar.getValue();
        }
        Object[] objArrMakeMutable = makeMutable(this.f65518m);
        if (objArrMakeMutable != this.f65518m) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrMakeMutable[i2];
        objArrMakeMutable[i2] = e;
        this.f65518m = objArrMakeMutable;
        return e2;
    }

    public final void setRootShift$runtime_release(int i) {
        this.f65515d = i;
    }

    private final boolean removeAll(qy6<? super E, Boolean> qy6Var) {
        Object[] objArrPushBuffers;
        int iTailSize = tailSize();
        hkb hkbVar = new hkb(null);
        if (this.f65517f == null) {
            return removeAllFromTail(qy6Var, iTailSize, hkbVar) != iTailSize;
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(0);
        int iRemoveAll = 32;
        while (iRemoveAll == 32 && listIteratorLeafBufferIterator.hasNext()) {
            iRemoveAll = removeAll(qy6Var, listIteratorLeafBufferIterator.next(), 32, hkbVar);
        }
        if (iRemoveAll == 32) {
            ec2.m28824assert(!listIteratorLeafBufferIterator.hasNext());
            int iRemoveAllFromTail = removeAllFromTail(qy6Var, iTailSize, hkbVar);
            if (iRemoveAllFromTail == 0) {
                pullLastBufferFromRoot(this.f65517f, size(), this.f65515d);
            }
            return iRemoveAllFromTail != iTailSize;
        }
        int iPreviousIndex = listIteratorLeafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iRecyclableRemoveAll = iRemoveAll;
        while (listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = recyclableRemoveAll(qy6Var, listIteratorLeafBufferIterator.next(), 32, iRecyclableRemoveAll, hkbVar, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i = iPreviousIndex;
        int iRecyclableRemoveAll2 = recyclableRemoveAll(qy6Var, this.f65518m, iTailSize, iRecyclableRemoveAll, hkbVar, arrayList2, arrayList);
        Object value = hkbVar.getValue();
        md8.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        u70.fill(objArr, (Object) null, iRecyclableRemoveAll2, 32);
        if (arrayList.isEmpty()) {
            objArrPushBuffers = this.f65517f;
            md8.checkNotNull(objArrPushBuffers);
        } else {
            objArrPushBuffers = pushBuffers(this.f65517f, i, this.f65515d, arrayList.iterator());
        }
        int size = i + (arrayList.size() << 5);
        this.f65517f = retainFirst(objArrPushBuffers, size);
        this.f65518m = objArr;
        this.f65511C = size + iRecyclableRemoveAll2;
        return true;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // p000.oqc.InterfaceC10501a
    @yfb
    public prc<E> build() {
        msc mscVar;
        if (this.f65517f == this.f65513b && this.f65518m == this.f65514c) {
            mscVar = this.f65512a;
        } else {
            this.f65516e = new q4b();
            Object[] objArr = this.f65517f;
            this.f65513b = objArr;
            Object[] objArr2 = this.f65518m;
            this.f65514c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f65517f;
                md8.checkNotNull(objArr3);
                mscVar = new msc(objArr3, this.f65518m, size(), this.f65515d);
            } else if (objArr2.length == 0) {
                mscVar = j1i.persistentVectorOf();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f65518m, size());
                md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                mscVar = new urf(objArrCopyOf);
            }
        }
        this.f65512a = mscVar;
        return (prc<E>) mscVar;
    }

    @Override // java.util.AbstractList, java.util.List
    @yfb
    public ListIterator<E> listIterator(int i) {
        e99.checkPositionIndex$runtime_release(i, size());
        return new psc(this, i);
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f65517f != null) {
            int i4 = i >> 5;
            Object[] objArrShiftLeafBuffers = shiftLeafBuffers(i4, i2, objArr, i3, objArr2);
            int iRootSize = i3 - (((rootSize() >> 5) - 1) - i4);
            if (iRootSize < i3) {
                objArr2 = objArr[iRootSize];
                md8.checkNotNull(objArr2);
            }
            splitToBuffers(collection, i, objArrShiftLeafBuffers, 32, objArr, iRootSize, objArr2);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        e99.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (i >= iRootSize) {
            insertIntoTail(this.f65517f, i - iRootSize, e);
            return;
        }
        hkb hkbVar = new hkb(null);
        Object[] objArr = this.f65517f;
        md8.checkNotNull(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.f65515d, i, e, hkbVar), 0, hkbVar.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @yfb Collection<? extends E> collection) {
        Object[] objArrCopyInto;
        e99.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            ec2.m28824assert(i >= rootSize());
            int i3 = i & 31;
            int size2 = ((i + collection.size()) - 1) & 31;
            Object[] objArr = this.f65518m;
            Object[] objArrCopyInto2 = u70.copyInto(objArr, makeMutable(objArr), size2 + 1, i3, tailSize());
            copyToBuffer(objArrCopyInto2, i3, collection.iterator());
            this.f65518m = objArrCopyInto2;
            this.f65511C = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iTailSize = tailSize();
        int iTailSize2 = tailSize(size() + collection.size());
        if (i >= rootSize()) {
            objArrCopyInto = mutableBuffer();
            splitToBuffers(collection, i, this.f65518m, iTailSize, objArr2, size, objArrCopyInto);
        } else if (iTailSize2 > iTailSize) {
            int i4 = iTailSize2 - iTailSize;
            objArrCopyInto = makeMutableShiftingRight(this.f65518m, i4);
            insertIntoRoot(collection, i, i4, objArr2, size, objArrCopyInto);
        } else {
            int i5 = iTailSize - iTailSize2;
            objArrCopyInto = u70.copyInto(this.f65518m, mutableBuffer(), 0, i5, iTailSize);
            int i6 = 32 - i5;
            Object[] objArrMakeMutableShiftingRight = makeMutableShiftingRight(this.f65518m, i6);
            int i7 = size - 1;
            objArr2[i7] = objArrMakeMutableShiftingRight;
            insertIntoRoot(collection, i, i6, objArr2, i7, objArrMakeMutableShiftingRight);
        }
        this.f65517f = pushBuffersIncreasingHeightIfNeeded(this.f65517f, i2, objArr2);
        this.f65518m = objArrCopyInto;
        this.f65511C = size() + collection.size();
        return true;
    }

    private final int removeAll(qy6<? super E, Boolean> qy6Var, Object[] objArr, int i, hkb hkbVar) {
        Object[] objArrMakeMutable = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (qy6Var.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrMakeMutable = makeMutable(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrMakeMutable[i2] = obj;
                i2++;
            }
        }
        hkbVar.setValue(objArrMakeMutable);
        return i2;
    }
}
