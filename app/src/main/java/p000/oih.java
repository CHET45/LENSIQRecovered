package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
@e0g(parameters = 0)
public final class oih<E> {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C10388a f67755d = new C10388a(null);

    /* JADX INFO: renamed from: e */
    public static final int f67756e = 8;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final oih f67757f = new oih(0, new Object[0]);

    /* JADX INFO: renamed from: a */
    public int f67758a;

    /* JADX INFO: renamed from: b */
    @yfb
    public Object[] f67759b;

    /* JADX INFO: renamed from: c */
    @gib
    public q4b f67760c;

    /* JADX INFO: renamed from: oih$a */
    public static final class C10388a {
        public /* synthetic */ C10388a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final oih getEMPTY$runtime_release() {
            return oih.f67757f;
        }

        private C10388a() {
        }
    }

    public oih(int i, @yfb Object[] objArr, @gib q4b q4bVar) {
        this.f67758a = i;
        this.f67759b = objArr;
        this.f67760c = q4bVar;
    }

    private final oih<E> addElementAt(int i, E e) {
        return new oih<>(i | this.f67758a, tih.addElementAtIndex(this.f67759b, indexOfCellAt$runtime_release(i), e));
    }

    private final int calculateSize() {
        if (this.f67758a == 0) {
            return this.f67759b.length;
        }
        int iCalculateSize = 0;
        for (Object obj : this.f67759b) {
            iCalculateSize += obj instanceof oih ? ((oih) obj).calculateSize() : 1;
        }
        return iCalculateSize;
    }

    private final oih<E> collisionAdd(E e) {
        return collisionContainsElement(e) ? this : new oih<>(0, tih.addElementAtIndex(this.f67759b, 0, e));
    }

    private final boolean collisionContainsElement(E e) {
        return e80.contains((E[]) this.f67759b, e);
    }

    private final oih<E> collisionRemove(E e) {
        int iIndexOf = e80.indexOf((E[]) this.f67759b, e);
        return iIndexOf != -1 ? collisionRemoveElementAtIndex(iIndexOf) : this;
    }

    private final oih<E> collisionRemoveElementAtIndex(int i) {
        return new oih<>(0, tih.removeCellAtIndex(this.f67759b, i));
    }

    private final E elementAtIndex(int i) {
        return (E) this.f67759b[i];
    }

    private final boolean elementsIdentityEquals(oih<E> oihVar) {
        if (this == oihVar) {
            return true;
        }
        if (this.f67758a != oihVar.f67758a) {
            return false;
        }
        int length = this.f67759b.length;
        for (int i = 0; i < length; i++) {
            if (this.f67759b[i] != oihVar.f67759b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int i) {
        return (i & this.f67758a) == 0;
    }

    private final oih<E> makeNode(int i, E e, int i2, E e2, int i3, q4b q4bVar) {
        if (i3 > 30) {
            return new oih<>(0, new Object[]{e, e2}, q4bVar);
        }
        int iIndexSegment = tih.indexSegment(i, i3);
        int iIndexSegment2 = tih.indexSegment(i2, i3);
        if (iIndexSegment != iIndexSegment2) {
            return new oih<>((1 << iIndexSegment) | (1 << iIndexSegment2), iIndexSegment < iIndexSegment2 ? new Object[]{e, e2} : new Object[]{e2, e}, q4bVar);
        }
        return new oih<>(1 << iIndexSegment, new Object[]{makeNode(i, e, i2, e2, i3 + 5, q4bVar)}, q4bVar);
    }

    private final oih<E> makeNodeAtIndex(int i, int i2, E e, int i3, q4b q4bVar) {
        E eElementAtIndex = elementAtIndex(i);
        return makeNode(eElementAtIndex != null ? eElementAtIndex.hashCode() : 0, eElementAtIndex, i2, e, i3 + 5, q4bVar);
    }

    private final oih<E> moveElementToNode(int i, int i2, E e, int i3) {
        Object[] objArr = this.f67759b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = makeNodeAtIndex(i, i2, e, i3, null);
        return new oih<>(this.f67758a, objArrCopyOf);
    }

    private final oih<E> mutableAddElementAt(int i, E e, q4b q4bVar) {
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i);
        if (this.f67760c != q4bVar) {
            return new oih<>(i | this.f67758a, tih.addElementAtIndex(this.f67759b, iIndexOfCellAt$runtime_release, e), q4bVar);
        }
        this.f67759b = tih.addElementAtIndex(this.f67759b, iIndexOfCellAt$runtime_release, e);
        this.f67758a = i | this.f67758a;
        return this;
    }

    private final oih<E> mutableCollisionAdd(E e, mrc<?> mrcVar) {
        if (collisionContainsElement(e)) {
            return this;
        }
        mrcVar.setSize(mrcVar.size() + 1);
        if (this.f67760c != mrcVar.getOwnership$runtime_release()) {
            return new oih<>(0, tih.addElementAtIndex(this.f67759b, 0, e), mrcVar.getOwnership$runtime_release());
        }
        this.f67759b = tih.addElementAtIndex(this.f67759b, 0, e);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final oih<E> mutableCollisionAddAll(oih<E> oihVar, a64 a64Var, q4b q4bVar) {
        if (this == oihVar) {
            a64Var.plusAssign(this.f67759b.length);
            return this;
        }
        Object[] objArr = this.f67759b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + oihVar.f67759b.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        Object[] objArr2 = oihVar.f67759b;
        int length = this.f67759b.length;
        int i = 0;
        int i2 = 0;
        while (i < objArr2.length) {
            ec2.m28824assert(i2 <= i);
            if (!collisionContainsElement(objArr2[i])) {
                objArrCopyOf[length + i2] = objArr2[i];
                i2++;
                ec2.m28824assert(length + i2 <= objArrCopyOf.length);
            }
            i++;
        }
        int length2 = i2 + this.f67759b.length;
        a64Var.plusAssign(objArrCopyOf.length - length2);
        if (length2 == this.f67759b.length) {
            return this;
        }
        if (length2 == oihVar.f67759b.length) {
            return oihVar;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        }
        if (!md8.areEqual(this.f67760c, q4bVar)) {
            return new oih<>(0, objArrCopyOf, q4bVar);
        }
        this.f67759b = objArrCopyOf;
        return this;
    }

    private final oih<E> mutableCollisionRemove(E e, mrc<?> mrcVar) {
        int iIndexOf = e80.indexOf((E[]) this.f67759b, e);
        if (iIndexOf == -1) {
            return this;
        }
        mrcVar.setSize(mrcVar.size() - 1);
        return mutableCollisionRemoveElementAtIndex(iIndexOf, mrcVar.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(oih<E> oihVar, a64 a64Var, q4b q4bVar) {
        if (this == oihVar) {
            a64Var.plusAssign(this.f67759b.length);
            return f67757f;
        }
        Object[] objArr = md8.areEqual(q4bVar, this.f67760c) ? this.f67759b : new Object[this.f67759b.length];
        Object[] objArr2 = this.f67759b;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            ec2.m28824assert(i2 <= i);
            if (!oihVar.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                ec2.m28824assert(i2 <= objArr.length);
            }
            i++;
        }
        a64Var.plusAssign(this.f67759b.length - i2);
        if (i2 == 0) {
            return f67757f;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.f67759b.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new oih(0, objArr, q4bVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        return new oih(0, objArrCopyOf, q4bVar);
    }

    private final oih<E> mutableCollisionRemoveElementAtIndex(int i, q4b q4bVar) {
        if (this.f67760c != q4bVar) {
            return new oih<>(0, tih.removeCellAtIndex(this.f67759b, i), q4bVar);
        }
        this.f67759b = tih.removeCellAtIndex(this.f67759b, i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(oih<E> oihVar, a64 a64Var, q4b q4bVar) {
        if (this == oihVar) {
            a64Var.plusAssign(this.f67759b.length);
            return this;
        }
        Object[] objArr = md8.areEqual(q4bVar, this.f67760c) ? this.f67759b : new Object[Math.min(this.f67759b.length, oihVar.f67759b.length)];
        Object[] objArr2 = this.f67759b;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            ec2.m28824assert(i2 <= i);
            if (oihVar.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                ec2.m28824assert(i2 <= objArr.length);
            }
            i++;
        }
        a64Var.plusAssign(i2);
        if (i2 == 0) {
            return f67757f;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.f67759b.length) {
            return this;
        }
        if (i2 == oihVar.f67759b.length) {
            return oihVar;
        }
        if (i2 == objArr.length) {
            return new oih(0, objArr, q4bVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        return new oih(0, objArrCopyOf, q4bVar);
    }

    private final oih<E> mutableMoveElementToNode(int i, int i2, E e, int i3, q4b q4bVar) {
        if (this.f67760c == q4bVar) {
            this.f67759b[i] = makeNodeAtIndex(i, i2, e, i3, q4bVar);
            return this;
        }
        Object[] objArr = this.f67759b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = makeNodeAtIndex(i, i2, e, i3, q4bVar);
        return new oih<>(this.f67758a, objArrCopyOf, q4bVar);
    }

    private final oih<E> mutableRemoveCellAtIndex(int i, int i2, q4b q4bVar) {
        if (this.f67760c != q4bVar) {
            return new oih<>(i2 ^ this.f67758a, tih.removeCellAtIndex(this.f67759b, i), q4bVar);
        }
        this.f67759b = tih.removeCellAtIndex(this.f67759b, i);
        this.f67758a ^= i2;
        return this;
    }

    private final oih<E> mutableUpdateNodeAtIndex(int i, oih<E> oihVar, q4b q4bVar) {
        Object[] objArr = oihVar.f67759b;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof oih)) {
                if (this.f67759b.length == 1) {
                    oihVar.f67758a = this.f67758a;
                    return oihVar;
                }
                oihVar = (oih<E>) obj;
            }
        }
        if (this.f67760c == q4bVar) {
            this.f67759b[i] = oihVar;
            return this;
        }
        Object[] objArr2 = this.f67759b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = oihVar;
        return new oih<>(this.f67758a, objArrCopyOf, q4bVar);
    }

    private final oih<E> nodeAtIndex(int i) {
        Object obj = this.f67759b[i];
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (oih) obj;
    }

    private final oih<E> removeCellAtIndex(int i, int i2) {
        return new oih<>(i2 ^ this.f67758a, tih.removeCellAtIndex(this.f67759b, i));
    }

    private final oih<E> updateNodeAtIndex(int i, oih<E> oihVar) {
        Object[] objArr = oihVar.f67759b;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof oih)) {
                if (this.f67759b.length == 1) {
                    oihVar.f67758a = this.f67758a;
                    return oihVar;
                }
                oihVar = (oih<E>) obj;
            }
        }
        Object[] objArr2 = this.f67759b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = oihVar;
        return new oih<>(this.f67758a, objArrCopyOf);
    }

    @yfb
    public final oih<E> add(int i, E e, int i2) {
        int iIndexSegment = 1 << tih.indexSegment(i, i2);
        if (hasNoCellAt(iIndexSegment)) {
            return addElementAt(iIndexSegment, e);
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.f67759b[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof oih)) {
            return md8.areEqual(e, obj) ? this : moveElementToNode(iIndexOfCellAt$runtime_release, i, e, i2);
        }
        oih<E> oihVarNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
        oih<E> oihVarCollisionAdd = i2 == 30 ? oihVarNodeAtIndex.collisionAdd(e) : oihVarNodeAtIndex.add(i, e, i2 + 5);
        return oihVarNodeAtIndex == oihVarCollisionAdd ? this : updateNodeAtIndex(iIndexOfCellAt$runtime_release, oihVarCollisionAdd);
    }

    public final boolean contains(int i, E e, int i2) {
        int iIndexSegment = 1 << tih.indexSegment(i, i2);
        if (hasNoCellAt(iIndexSegment)) {
            return false;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.f67759b[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof oih)) {
            return md8.areEqual(e, obj);
        }
        oih<E> oihVarNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
        return i2 == 30 ? oihVarNodeAtIndex.collisionContainsElement(e) : oihVarNodeAtIndex.contains(i, e, i2 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@yfb oih<E> oihVar, int i) {
        if (this == oihVar) {
            return true;
        }
        if (i > 30) {
            for (Object obj : oihVar.f67759b) {
                if (!e80.contains(this.f67759b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i2 = this.f67758a;
        int i3 = oihVar.f67758a;
        int i4 = i2 & i3;
        if (i4 != i3) {
            return false;
        }
        while (i4 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i4);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = oihVar.indexOfCellAt$runtime_release(iLowestOneBit);
            Object obj2 = this.f67759b[iIndexOfCellAt$runtime_release];
            Object obj3 = oihVar.f67759b[iIndexOfCellAt$runtime_release2];
            boolean z = obj2 instanceof oih;
            boolean z2 = obj3 instanceof oih;
            if (z && z2) {
                md8.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                md8.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((oih) obj2).containsAll((oih) obj3, i + 5)) {
                    return false;
                }
            } else if (z) {
                md8.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((oih) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i + 5)) {
                    return false;
                }
            } else if (z2 || !md8.areEqual(obj2, obj3)) {
                return false;
            }
            i4 ^= iLowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.f67758a;
    }

    @yfb
    public final Object[] getBuffer() {
        return this.f67759b;
    }

    @gib
    public final q4b getOwnedBy() {
        return this.f67760c;
    }

    public final int indexOfCellAt$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.f67758a);
    }

    @yfb
    public final oih<E> mutableAdd(int i, E e, int i2, @yfb mrc<?> mrcVar) {
        int iIndexSegment = 1 << tih.indexSegment(i, i2);
        if (hasNoCellAt(iIndexSegment)) {
            mrcVar.setSize(mrcVar.size() + 1);
            return mutableAddElementAt(iIndexSegment, e, mrcVar.getOwnership$runtime_release());
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.f67759b[iIndexOfCellAt$runtime_release];
        if (obj instanceof oih) {
            oih<E> oihVarNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            oih<E> oihVarMutableCollisionAdd = i2 == 30 ? oihVarNodeAtIndex.mutableCollisionAdd(e, mrcVar) : oihVarNodeAtIndex.mutableAdd(i, e, i2 + 5, mrcVar);
            return oihVarNodeAtIndex == oihVarMutableCollisionAdd ? this : mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, oihVarMutableCollisionAdd, mrcVar.getOwnership$runtime_release());
        }
        if (md8.areEqual(e, obj)) {
            return this;
        }
        mrcVar.setSize(mrcVar.size() + 1);
        return mutableMoveElementToNode(iIndexOfCellAt$runtime_release, i, e, i2, mrcVar.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final oih<E> mutableAddAll(@yfb oih<E> oihVar, int i, @yfb a64 a64Var, @yfb mrc<?> mrcVar) {
        Object[] objArr;
        int i2;
        Object objMakeNode;
        oih oihVarMutableAdd;
        if (this == oihVar) {
            a64Var.setCount(a64Var.getCount() + calculateSize());
            return this;
        }
        if (i > 30) {
            return mutableCollisionAddAll(oihVar, a64Var, mrcVar.getOwnership$runtime_release());
        }
        int i3 = this.f67758a;
        int i4 = oihVar.f67758a | i3;
        oih<E> oihVar2 = (i4 == i3 && md8.areEqual(this.f67760c, mrcVar.getOwnership$runtime_release())) ? this : new oih<>(i4, new Object[Integer.bitCount(i4)], mrcVar.getOwnership$runtime_release());
        int i5 = i4;
        int i6 = 0;
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = oihVar.indexOfCellAt$runtime_release(iLowestOneBit);
            Object[] objArr2 = oihVar2.f67759b;
            if (hasNoCellAt(iLowestOneBit)) {
                objMakeNode = oihVar.f67759b[iIndexOfCellAt$runtime_release2];
            } else if (oihVar.hasNoCellAt(iLowestOneBit)) {
                objMakeNode = this.f67759b[iIndexOfCellAt$runtime_release];
            } else {
                Object obj = this.f67759b[iIndexOfCellAt$runtime_release];
                Object obj2 = oihVar.f67759b[iIndexOfCellAt$runtime_release2];
                boolean z = obj instanceof oih;
                boolean z2 = obj2 instanceof oih;
                if (z && z2) {
                    md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    md8.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    objMakeNode = ((oih) obj).mutableAddAll((oih) obj2, i + 5, a64Var, mrcVar);
                } else {
                    if (z) {
                        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        oih oihVar3 = (oih) obj;
                        int size = mrcVar.size();
                        oihVarMutableAdd = oihVar3.mutableAdd(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, mrcVar);
                        if (mrcVar.size() == size) {
                            a64Var.setCount(a64Var.getCount() + 1);
                        }
                        bth bthVar = bth.f14751a;
                    } else if (z2) {
                        md8.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        oih oihVar4 = (oih) obj2;
                        int size2 = mrcVar.size();
                        oihVarMutableAdd = oihVar4.mutableAdd(obj != null ? obj.hashCode() : 0, obj, i + 5, mrcVar);
                        if (mrcVar.size() == size2) {
                            a64Var.setCount(a64Var.getCount() + 1);
                        }
                        bth bthVar2 = bth.f14751a;
                    } else if (md8.areEqual(obj, obj2)) {
                        a64Var.setCount(a64Var.getCount() + 1);
                        bth bthVar3 = bth.f14751a;
                        objMakeNode = obj;
                    } else {
                        objArr = objArr2;
                        i2 = iLowestOneBit;
                        objMakeNode = makeNode(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, mrcVar.getOwnership$runtime_release());
                        objArr[i6] = objMakeNode;
                        i6++;
                        i5 ^= i2;
                    }
                    objMakeNode = oihVarMutableAdd;
                }
            }
            objArr = objArr2;
            i2 = iLowestOneBit;
            objArr[i6] = objMakeNode;
            i6++;
            i5 ^= i2;
        }
        return elementsIdentityEquals(oihVar2) ? this : oihVar.elementsIdentityEquals(oihVar2) ? oihVar : oihVar2;
    }

    @yfb
    public final oih<E> mutableRemove(int i, E e, int i2, @yfb mrc<?> mrcVar) {
        int iIndexSegment = 1 << tih.indexSegment(i, i2);
        if (hasNoCellAt(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.f67759b[iIndexOfCellAt$runtime_release];
        if (obj instanceof oih) {
            oih<E> oihVarNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            oih<E> oihVarMutableCollisionRemove = i2 == 30 ? oihVarNodeAtIndex.mutableCollisionRemove(e, mrcVar) : oihVarNodeAtIndex.mutableRemove(i, e, i2 + 5, mrcVar);
            return (this.f67760c == mrcVar.getOwnership$runtime_release() || oihVarNodeAtIndex != oihVarMutableCollisionRemove) ? mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, oihVarMutableCollisionRemove, mrcVar.getOwnership$runtime_release()) : this;
        }
        if (!md8.areEqual(e, obj)) {
            return this;
        }
        mrcVar.setSize(mrcVar.size() - 1);
        return mutableRemoveCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment, mrcVar.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mutableRemoveAll(@p000.yfb p000.oih<E> r17, int r18, @p000.yfb p000.a64 r19, @p000.yfb p000.mrc<?> r20) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oih.mutableRemoveAll(oih, int, a64, mrc):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final Object mutableRetainAll(@yfb oih<E> oihVar, int i, @yfb a64 a64Var, @yfb mrc<?> mrcVar) {
        oih oihVar2;
        if (this == oihVar) {
            a64Var.plusAssign(calculateSize());
            return this;
        }
        if (i > 30) {
            return mutableCollisionRetainAll(oihVar, a64Var, mrcVar.getOwnership$runtime_release());
        }
        int i2 = this.f67758a & oihVar.f67758a;
        if (i2 == 0) {
            return f67757f;
        }
        oih<E> oihVar3 = (md8.areEqual(this.f67760c, mrcVar.getOwnership$runtime_release()) && i2 == this.f67758a) ? this : new oih<>(i2, new Object[Integer.bitCount(i2)], mrcVar.getOwnership$runtime_release());
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i3 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i3);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = oihVar.indexOfCellAt$runtime_release(iLowestOneBit);
            Object objMutableRetainAll = this.f67759b[iIndexOfCellAt$runtime_release];
            Object obj = oihVar.f67759b[iIndexOfCellAt$runtime_release2];
            boolean z = objMutableRetainAll instanceof oih;
            boolean z2 = obj instanceof oih;
            if (z && z2) {
                md8.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                objMutableRetainAll = ((oih) objMutableRetainAll).mutableRetainAll((oih) obj, i + 5, a64Var, mrcVar);
            } else if (z) {
                md8.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((oih) objMutableRetainAll).contains(obj != null ? obj.hashCode() : 0, obj, i + 5)) {
                    a64Var.plusAssign(1);
                    objMutableRetainAll = obj;
                } else {
                    objMutableRetainAll = f67757f;
                }
            } else if (z2) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((oih) obj).contains(objMutableRetainAll != null ? objMutableRetainAll.hashCode() : 0, objMutableRetainAll, i + 5)) {
                    a64Var.plusAssign(1);
                } else {
                    objMutableRetainAll = f67757f;
                }
            } else if (md8.areEqual(objMutableRetainAll, obj)) {
                a64Var.plusAssign(1);
            } else {
                objMutableRetainAll = f67757f;
            }
            if (objMutableRetainAll != f67757f) {
                i4 |= iLowestOneBit;
            }
            oihVar3.f67759b[i5] = objMutableRetainAll;
            i5++;
            i3 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i4);
        if (i4 == 0) {
            return f67757f;
        }
        if (i4 == i2) {
            return oihVar3.elementsIdentityEquals(this) ? this : oihVar3.elementsIdentityEquals(oihVar) ? oihVar : oihVar3;
        }
        if (iBitCount != 1 || i == 0) {
            Object[] objArr = new Object[iBitCount];
            Object[] objArr2 = oihVar3.f67759b;
            int i6 = 0;
            int i7 = 0;
            while (i6 < objArr2.length) {
                ec2.m28824assert(i7 <= i6);
                if (objArr2[i6] != f67755d.getEMPTY$runtime_release()) {
                    objArr[i7] = objArr2[i6];
                    i7++;
                    ec2.m28824assert(i7 <= iBitCount);
                }
                i6++;
            }
            oihVar2 = new oih(i4, objArr, mrcVar.getOwnership$runtime_release());
        } else {
            Object obj2 = oihVar3.f67759b[oihVar3.indexOfCellAt$runtime_release(i4)];
            if (!(obj2 instanceof oih)) {
                return obj2;
            }
            oihVar2 = new oih(i4, new Object[]{obj2}, mrcVar.getOwnership$runtime_release());
        }
        return oihVar2;
    }

    @yfb
    public final oih<E> remove(int i, E e, int i2) {
        int iIndexSegment = 1 << tih.indexSegment(i, i2);
        if (hasNoCellAt(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.f67759b[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof oih)) {
            return md8.areEqual(e, obj) ? removeCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment) : this;
        }
        oih<E> oihVarNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
        oih<E> oihVarCollisionRemove = i2 == 30 ? oihVarNodeAtIndex.collisionRemove(e) : oihVarNodeAtIndex.remove(i, e, i2 + 5);
        return oihVarNodeAtIndex == oihVarCollisionRemove ? this : updateNodeAtIndex(iIndexOfCellAt$runtime_release, oihVarCollisionRemove);
    }

    public final void setBitmap(int i) {
        this.f67758a = i;
    }

    public final void setBuffer(@yfb Object[] objArr) {
        this.f67759b = objArr;
    }

    public final void setOwnedBy(@gib q4b q4bVar) {
        this.f67760c = q4bVar;
    }

    public oih(int i, @yfb Object[] objArr) {
        this(i, objArr, null);
    }
}
