package p000;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n33#2,7:329\n1#3:336\n*S KotlinDebug\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n*L\n30#1:329,7\n*E\n"})
@e0g(parameters = 0)
public final class msc<E> extends AbstractC11854r3<E> implements prc<E> {

    /* JADX INFO: renamed from: f */
    public static final int f61950f = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object[] f61951b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object[] f61952c;

    /* JADX INFO: renamed from: d */
    public final int f61953d;

    /* JADX INFO: renamed from: e */
    public final int f61954e;

    public msc(@yfb Object[] objArr, @yfb Object[] objArr2, int i, int i2) {
        this.f61951b = objArr;
        this.f61952c = objArr2;
        this.f61953d = i;
        this.f61954e = i2;
        if (!(size() > 32)) {
            a8d.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        ec2.m28824assert(size() - j1i.rootSize(size()) <= kpd.coerceAtMost(objArr2.length, 32));
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.f61952c;
        }
        Object[] objArr = this.f61951b;
        for (int i2 = this.f61954e; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[j1i.indexSegment(i, i2)];
            md8.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, hkb hkbVar) {
        Object[] objArrCopyOf;
        int iIndexSegment = j1i.indexSegment(i2, i);
        if (i == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            }
            u70.copyInto(objArr, objArrCopyOf, iIndexSegment + 1, iIndexSegment, 31);
            hkbVar.setValue(objArr[31]);
            objArrCopyOf[iIndexSegment] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        Object obj2 = objArr[iIndexSegment];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = insertIntoRoot((Object[]) obj2, i3, i2, obj, hkbVar);
        int i4 = iIndexSegment + 1;
        while (i4 < 32 && objArrCopyOf2[i4] != null) {
            Object obj3 = objArr[i4];
            md8.checkNotNull(obj3, str);
            Object[] objArr2 = objArrCopyOf2;
            objArr2[i4] = insertIntoRoot((Object[]) obj3, i3, 0, hkbVar.getValue(), hkbVar);
            i4++;
            objArrCopyOf2 = objArr2;
            str = str;
        }
        return objArrCopyOf2;
    }

    private final msc<E> insertIntoTail(Object[] objArr, int i, Object obj) {
        int size = size() - rootSize();
        Object[] objArrCopyOf = Arrays.copyOf(this.f61952c, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            u70.copyInto(this.f61952c, objArrCopyOf, i + 1, i, size);
            objArrCopyOf[i] = obj;
            return new msc<>(objArr, objArrCopyOf, size() + 1, this.f61954e);
        }
        Object[] objArr2 = this.f61952c;
        Object obj2 = objArr2[31];
        u70.copyInto(objArr2, objArrCopyOf, i + 1, i, size - 1);
        objArrCopyOf[i] = obj;
        return pushFilledTail(objArr, objArrCopyOf, j1i.presizedBufferWith(obj2));
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, hkb hkbVar) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = j1i.indexSegment(i2, i);
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
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iIndexSegment] = objArrPullLastBuffer;
        return objArrCopyOf;
    }

    private final prc<E> pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                md8.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new urf(objArr);
        }
        hkb hkbVar = new hkb(null);
        Object[] objArrPullLastBuffer = pullLastBuffer(objArr, i2, i - 1, hkbVar);
        md8.checkNotNull(objArrPullLastBuffer);
        Object value = hkbVar.getValue();
        md8.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        if (objArrPullLastBuffer[1] != null) {
            return new msc(objArrPullLastBuffer, objArr2, i, i2);
        }
        Object obj = objArrPullLastBuffer[0];
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new msc((Object[]) obj, objArr2, i, i2 - 5);
    }

    private final msc<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f61954e;
        if (size <= (1 << i)) {
            return new msc<>(pushTail(objArr, i, objArr2), objArr3, size() + 1, this.f61954e);
        }
        Object[] objArrPresizedBufferWith = j1i.presizedBufferWith(objArr);
        int i2 = this.f61954e + 5;
        return new msc<>(pushTail(objArrPresizedBufferWith, i2, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = p000.j1i.indexSegment(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            p000.md8.checkNotNullExpressionValue(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.pushTail(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.msc.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, hkb hkbVar) {
        Object[] objArrCopyOf;
        int iIndexSegment = j1i.indexSegment(i2, i);
        if (i == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            }
            u70.copyInto(objArr, objArrCopyOf, iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyOf[31] = hkbVar.getValue();
            hkbVar.setValue(objArr[iIndexSegment]);
            return objArrCopyOf;
        }
        int iIndexSegment2 = objArr[31] == null ? j1i.indexSegment(rootSize() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        int i4 = iIndexSegment + 1;
        if (i4 <= iIndexSegment2) {
            while (true) {
                Object obj = objArrCopyOf2[iIndexSegment2];
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iIndexSegment2] = removeFromRootAt((Object[]) obj, i3, 0, hkbVar);
                if (iIndexSegment2 == i4) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj2 = objArrCopyOf2[iIndexSegment];
        md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = removeFromRootAt((Object[]) obj2, i3, i2, hkbVar);
        return objArrCopyOf2;
    }

    private final prc<E> removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        ec2.m28824assert(i3 < size);
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i, i2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f61952c, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int i4 = size - 1;
        if (i3 < i4) {
            u70.copyInto(this.f61952c, objArrCopyOf, i3, i3 + 1, size);
        }
        objArrCopyOf[i4] = null;
        return new msc(objArr, objArrCopyOf, (i + size) - 1, i2);
    }

    private final int rootSize() {
        return j1i.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, Object obj) {
        int iIndexSegment = j1i.indexSegment(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (i == 0) {
            objArrCopyOf[iIndexSegment] = obj;
        } else {
            Object obj2 = objArrCopyOf[iIndexSegment];
            md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iIndexSegment] = setInRoot((Object[]) obj2, i - 5, i2, obj);
        }
        return objArrCopyOf;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public E get(int i) {
        e99.checkElementIndex$runtime_release(i, size());
        return (E) bufferFor(i)[i & 31];
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
    public int getSize() {
        return this.f61953d;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public ListIterator<E> listIterator(int i) {
        e99.checkPositionIndex$runtime_release(i, size());
        return new osc(this.f61951b, this.f61952c, i, size(), (this.f61954e / 5) + 1);
    }

    @Override // p000.prc
    @yfb
    public prc<E> removeAt(int i) {
        e99.checkElementIndex$runtime_release(i, size());
        int iRootSize = rootSize();
        return i >= iRootSize ? removeFromTailAt(this.f61951b, iRootSize, this.f61954e, i - iRootSize) : removeFromTailAt(removeFromRootAt(this.f61951b, this.f61954e, i, new hkb(this.f61952c[0])), iRootSize, this.f61954e, 0);
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public prc<E> set(int i, E e) {
        e99.checkElementIndex$runtime_release(i, size());
        if (rootSize() > i) {
            return new msc(setInRoot(this.f61951b, this.f61954e, i, e), this.f61952c, size(), this.f61954e);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f61952c, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i & 31] = e;
        return new msc(this.f61951b, objArrCopyOf, size(), this.f61954e);
    }

    @Override // java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> add(E e) {
        int size = size() - rootSize();
        if (size >= 32) {
            return pushFilledTail(this.f61951b, this.f61952c, j1i.presizedBufferWith(e));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f61952c, 32);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = e;
        return new msc(this.f61951b, objArrCopyOf, size() + 1, this.f61954e);
    }

    @Override // p000.oqc
    @yfb
    public prc<E> removeAll(@yfb qy6<? super E, Boolean> qy6Var) {
        nsc<E> nscVarBuilder = builder();
        nscVarBuilder.removeAllWithPredicate(qy6Var);
        return nscVarBuilder.build();
    }

    @Override // p000.prc, p000.oqc
    @yfb
    public nsc<E> builder() {
        return new nsc<>(this, this.f61951b, this.f61952c, this.f61954e);
    }

    @Override // java.util.List, p000.prc
    @yfb
    public prc<E> add(int i, E e) {
        e99.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        int iRootSize = rootSize();
        if (i >= iRootSize) {
            return insertIntoTail(this.f61951b, i - iRootSize, e);
        }
        hkb hkbVar = new hkb(null);
        return insertIntoTail(insertIntoRoot(this.f61951b, this.f61954e, i, e, hkbVar), 0, hkbVar.getValue());
    }
}
