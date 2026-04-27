package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:916\n10#2,9:925\n61#3,7:909\n84#4:934\n1#5:935\n26#6:936\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:916,9\n652#1:925,9\n640#1:909,7\n700#1:934\n700#1:935\n897#1:936\n*E\n"})
@e0g(parameters = 0)
public final class nih<K, V> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C9897a f64689e = new C9897a(null);

    /* JADX INFO: renamed from: f */
    public static final int f64690f = 8;

    /* JADX INFO: renamed from: g */
    @yfb
    public static final nih f64691g = new nih(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a */
    public int f64692a;

    /* JADX INFO: renamed from: b */
    public int f64693b;

    /* JADX INFO: renamed from: c */
    @gib
    public final q4b f64694c;

    /* JADX INFO: renamed from: d */
    @yfb
    public Object[] f64695d;

    /* JADX INFO: renamed from: nih$a */
    public static final class C9897a {
        public /* synthetic */ C9897a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final nih getEMPTY$runtime_release() {
            return nih.f64691g;
        }

        private C9897a() {
        }
    }

    /* JADX INFO: renamed from: nih$b */
    @dwf({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    @e0g(parameters = 0)
    public static final class C9898b<K, V> {

        /* JADX INFO: renamed from: c */
        public static final int f64696c = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public nih<K, V> f64697a;

        /* JADX INFO: renamed from: b */
        public final int f64698b;

        public C9898b(@yfb nih<K, V> nihVar, int i) {
            this.f64697a = nihVar;
            this.f64698b = i;
        }

        @yfb
        public final nih<K, V> getNode() {
            return this.f64697a;
        }

        public final int getSizeDelta() {
            return this.f64698b;
        }

        @yfb
        public final C9898b<K, V> replaceNode(@yfb qy6<? super nih<K, V>, nih<K, V>> qy6Var) {
            setNode(qy6Var.invoke(getNode()));
            return this;
        }

        public final void setNode(@yfb nih<K, V> nihVar) {
            this.f64697a = nihVar;
        }
    }

    public nih(int i, int i2, @yfb Object[] objArr, @gib q4b q4bVar) {
        this.f64692a = i;
        this.f64693b = i2;
        this.f64694c = q4bVar;
        this.f64695d = objArr;
    }

    private final void accept(rz6<? super nih<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, bth> rz6Var, int i, int i2) {
        rz6Var.invoke(this, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f64692a), Integer.valueOf(this.f64693b));
        int i3 = this.f64693b;
        while (i3 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i3);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(iLowestOneBit)).accept(rz6Var, (Integer.numberOfTrailingZeros(iLowestOneBit) << i2) + i, i2 + 5);
            i3 -= iLowestOneBit;
        }
    }

    private final C9898b<K, V> asInsertResult() {
        return new C9898b<>(this, 1);
    }

    private final C9898b<K, V> asUpdateResult() {
        return new C9898b<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, q4b q4bVar) {
        K kKeyAtIndex = keyAtIndex(i);
        return uih.replaceEntryWithNode(this.f64695d, i, nodeIndex$runtime_release(i2) + 1, makeNode(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, valueAtKeyIndex(i), i3, k, v, i4 + 5, q4bVar));
    }

    private final int calculateSize() {
        if (this.f64693b == 0) {
            return this.f64695d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f64692a);
        int length = this.f64695d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += nodeAtIndex$runtime_release(i).calculateSize();
        }
        return iBitCount;
    }

    private final boolean collisionContainsKey(K k) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!md8.areEqual(k, this.f64695d[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!md8.areEqual(k, keyAtIndex(first))) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return valueAtKeyIndex(first);
    }

    private final C9898b<K, V> collisionPut(K k, V v) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!md8.areEqual(k, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            if (v == valueAtKeyIndex(first)) {
                return null;
            }
            Object[] objArr = this.f64695d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[first + 1] = v;
            return new nih(0, 0, objArrCopyOf).asUpdateResult();
        }
        return new nih(0, 0, uih.insertEntryAtIndex(this.f64695d, 0, k, v)).asInsertResult();
    }

    private final nih<K, V> collisionRemove(K k) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!md8.areEqual(k, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return collisionRemoveEntryAtIndex(first);
        }
        return this;
    }

    private final nih<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] objArr = this.f64695d;
        if (objArr.length == 2) {
            return null;
        }
        return new nih<>(0, 0, uih.removeEntryAtIndex(objArr, i));
    }

    private final boolean elementsIdentityEquals(nih<K, V> nihVar) {
        if (this == nihVar) {
            return true;
        }
        if (this.f64693b != nihVar.f64693b || this.f64692a != nihVar.f64692a) {
            return false;
        }
        int length = this.f64695d.length;
        for (int i = 0; i < length; i++) {
            if (this.f64695d[i] != nihVar.f64695d[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNodeAt(int i) {
        return (i & this.f64693b) != 0;
    }

    private final nih<K, V> insertEntryAt(int i, K k, V v) {
        return new nih<>(i | this.f64692a, this.f64693b, uih.insertEntryAtIndex(this.f64695d, entryKeyIndex$runtime_release(i), k, v));
    }

    private final K keyAtIndex(int i) {
        return (K) this.f64695d[i];
    }

    private final nih<K, V> makeNode(int i, K k, V v, int i2, K k2, V v2, int i3, q4b q4bVar) {
        if (i3 > 30) {
            return new nih<>(0, 0, new Object[]{k, v, k2, v2}, q4bVar);
        }
        int iIndexSegment = uih.indexSegment(i, i3);
        int iIndexSegment2 = uih.indexSegment(i2, i3);
        if (iIndexSegment != iIndexSegment2) {
            return new nih<>((1 << iIndexSegment) | (1 << iIndexSegment2), 0, iIndexSegment < iIndexSegment2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, q4bVar);
        }
        return new nih<>(0, 1 << iIndexSegment, new Object[]{makeNode(i, k, v, i2, k2, v2, i3 + 5, q4bVar)}, q4bVar);
    }

    private final nih<K, V> moveEntryToNode(int i, int i2, int i3, K k, V v, int i4) {
        return new nih<>(this.f64692a ^ i2, i2 | this.f64693b, bufferMoveEntryToNode(i, i2, i3, k, v, i4, null));
    }

    private final nih<K, V> mutableCollisionPut(K k, V v, wqc<K, V> wqcVar) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!md8.areEqual(k, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            wqcVar.setOperationResult$runtime_release(valueAtKeyIndex(first));
            if (this.f64694c == wqcVar.getOwnership()) {
                this.f64695d[first + 1] = v;
                return this;
            }
            wqcVar.setModCount$runtime_release(wqcVar.getModCount$runtime_release() + 1);
            Object[] objArr = this.f64695d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[first + 1] = v;
            return new nih<>(0, 0, objArrCopyOf, wqcVar.getOwnership());
        }
        wqcVar.setSize(wqcVar.size() + 1);
        return new nih<>(0, 0, uih.insertEntryAtIndex(this.f64695d, 0, k, v), wqcVar.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final nih<K, V> mutableCollisionPutAll(nih<K, V> nihVar, a64 a64Var, q4b q4bVar) {
        ec2.m28824assert(this.f64693b == 0);
        ec2.m28824assert(this.f64692a == 0);
        ec2.m28824assert(nihVar.f64693b == 0);
        ec2.m28824assert(nihVar.f64692a == 0);
        Object[] objArr = this.f64695d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + nihVar.f64695d.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.f64695d.length;
        d78 d78VarStep = kpd.step(kpd.until(0, nihVar.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (collisionContainsKey(nihVar.f64695d[first])) {
                    a64Var.setCount(a64Var.getCount() + 1);
                } else {
                    Object[] objArr2 = nihVar.f64695d;
                    objArrCopyOf[length] = objArr2[first];
                    objArrCopyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        if (length == this.f64695d.length) {
            return this;
        }
        if (length == nihVar.f64695d.length) {
            return nihVar;
        }
        if (length == objArrCopyOf.length) {
            return new nih<>(0, 0, objArrCopyOf, q4bVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        md8.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        return new nih<>(0, 0, objArrCopyOf2, q4bVar);
    }

    private final nih<K, V> mutableCollisionRemove(K k, wqc<K, V> wqcVar) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!md8.areEqual(k, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(first, wqcVar);
        }
        return this;
    }

    private final nih<K, V> mutableCollisionRemoveEntryAtIndex(int i, wqc<K, V> wqcVar) {
        wqcVar.setSize(wqcVar.size() - 1);
        wqcVar.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.f64695d.length == 2) {
            return null;
        }
        if (this.f64694c != wqcVar.getOwnership()) {
            return new nih<>(0, 0, uih.removeEntryAtIndex(this.f64695d, i), wqcVar.getOwnership());
        }
        this.f64695d = uih.removeEntryAtIndex(this.f64695d, i);
        return this;
    }

    private final nih<K, V> mutableInsertEntryAt(int i, K k, V v, q4b q4bVar) {
        int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i);
        if (this.f64694c != q4bVar) {
            return new nih<>(i | this.f64692a, this.f64693b, uih.insertEntryAtIndex(this.f64695d, iEntryKeyIndex$runtime_release, k, v), q4bVar);
        }
        this.f64695d = uih.insertEntryAtIndex(this.f64695d, iEntryKeyIndex$runtime_release, k, v);
        this.f64692a = i | this.f64692a;
        return this;
    }

    private final nih<K, V> mutableMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, q4b q4bVar) {
        if (this.f64694c != q4bVar) {
            return new nih<>(this.f64692a ^ i2, i2 | this.f64693b, bufferMoveEntryToNode(i, i2, i3, k, v, i4, q4bVar), q4bVar);
        }
        this.f64695d = bufferMoveEntryToNode(i, i2, i3, k, v, i4, q4bVar);
        this.f64692a ^= i2;
        this.f64693b |= i2;
        return this;
    }

    private final nih<K, V> mutablePutAllFromOtherNodeCell(nih<K, V> nihVar, int i, int i2, a64 a64Var, wqc<K, V> wqcVar) {
        if (hasNodeAt(i)) {
            nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i));
            if (nihVar.hasNodeAt(i)) {
                return nihVarNodeAtIndex$runtime_release.mutablePutAll(nihVar.nodeAtIndex$runtime_release(nihVar.nodeIndex$runtime_release(i)), i2 + 5, a64Var, wqcVar);
            }
            if (!nihVar.hasEntryAt$runtime_release(i)) {
                return nihVarNodeAtIndex$runtime_release;
            }
            int iEntryKeyIndex$runtime_release = nihVar.entryKeyIndex$runtime_release(i);
            K kKeyAtIndex = nihVar.keyAtIndex(iEntryKeyIndex$runtime_release);
            V vValueAtKeyIndex = nihVar.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            int size = wqcVar.size();
            nih<K, V> nihVarMutablePut = nihVarNodeAtIndex$runtime_release.mutablePut(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, vValueAtKeyIndex, i2 + 5, wqcVar);
            if (wqcVar.size() != size) {
                return nihVarMutablePut;
            }
            a64Var.setCount(a64Var.getCount() + 1);
            return nihVarMutablePut;
        }
        if (!nihVar.hasNodeAt(i)) {
            int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i);
            K kKeyAtIndex2 = keyAtIndex(iEntryKeyIndex$runtime_release2);
            V vValueAtKeyIndex2 = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            int iEntryKeyIndex$runtime_release3 = nihVar.entryKeyIndex$runtime_release(i);
            K kKeyAtIndex3 = nihVar.keyAtIndex(iEntryKeyIndex$runtime_release3);
            return makeNode(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, vValueAtKeyIndex2, kKeyAtIndex3 != null ? kKeyAtIndex3.hashCode() : 0, kKeyAtIndex3, nihVar.valueAtKeyIndex(iEntryKeyIndex$runtime_release3), i2 + 5, wqcVar.getOwnership());
        }
        nih<K, V> nihVarNodeAtIndex$runtime_release2 = nihVar.nodeAtIndex$runtime_release(nihVar.nodeIndex$runtime_release(i));
        if (hasEntryAt$runtime_release(i)) {
            int iEntryKeyIndex$runtime_release4 = entryKeyIndex$runtime_release(i);
            K kKeyAtIndex4 = keyAtIndex(iEntryKeyIndex$runtime_release4);
            int i3 = i2 + 5;
            if (!nihVarNodeAtIndex$runtime_release2.containsKey(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, i3)) {
                return nihVarNodeAtIndex$runtime_release2.mutablePut(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, valueAtKeyIndex(iEntryKeyIndex$runtime_release4), i3, wqcVar);
            }
            a64Var.setCount(a64Var.getCount() + 1);
        }
        return nihVarNodeAtIndex$runtime_release2;
    }

    private final nih<K, V> mutableRemoveEntryAtIndex(int i, int i2, wqc<K, V> wqcVar) {
        wqcVar.setSize(wqcVar.size() - 1);
        wqcVar.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.f64695d.length == 2) {
            return null;
        }
        if (this.f64694c != wqcVar.getOwnership()) {
            return new nih<>(i2 ^ this.f64692a, this.f64693b, uih.removeEntryAtIndex(this.f64695d, i), wqcVar.getOwnership());
        }
        this.f64695d = uih.removeEntryAtIndex(this.f64695d, i);
        this.f64692a ^= i2;
        return this;
    }

    private final nih<K, V> mutableRemoveNodeAtIndex(int i, int i2, q4b q4bVar) {
        Object[] objArr = this.f64695d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f64694c != q4bVar) {
            return new nih<>(this.f64692a, i2 ^ this.f64693b, uih.removeNodeAtIndex(objArr, i), q4bVar);
        }
        this.f64695d = uih.removeNodeAtIndex(objArr, i);
        this.f64693b ^= i2;
        return this;
    }

    private final nih<K, V> mutableReplaceNode(nih<K, V> nihVar, nih<K, V> nihVar2, int i, int i2, q4b q4bVar) {
        return nihVar2 == null ? mutableRemoveNodeAtIndex(i, i2, q4bVar) : (this.f64694c == q4bVar || nihVar != nihVar2) ? mutableUpdateNodeAtIndex(i, nihVar2, q4bVar) : this;
    }

    private final nih<K, V> mutableUpdateNodeAtIndex(int i, nih<K, V> nihVar, q4b q4bVar) {
        Object[] objArr = this.f64695d;
        if (objArr.length == 1 && nihVar.f64695d.length == 2 && nihVar.f64693b == 0) {
            nihVar.f64692a = this.f64693b;
            return nihVar;
        }
        if (this.f64694c == q4bVar) {
            objArr[i] = nihVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = nihVar;
        return new nih<>(this.f64692a, this.f64693b, objArrCopyOf, q4bVar);
    }

    private final nih<K, V> mutableUpdateValueAtIndex(int i, V v, wqc<K, V> wqcVar) {
        if (this.f64694c == wqcVar.getOwnership()) {
            this.f64695d[i + 1] = v;
            return this;
        }
        wqcVar.setModCount$runtime_release(wqcVar.getModCount$runtime_release() + 1);
        Object[] objArr = this.f64695d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i + 1] = v;
        return new nih<>(this.f64692a, this.f64693b, objArrCopyOf, wqcVar.getOwnership());
    }

    private final nih<K, V> removeEntryAtIndex(int i, int i2) {
        Object[] objArr = this.f64695d;
        if (objArr.length == 2) {
            return null;
        }
        return new nih<>(i2 ^ this.f64692a, this.f64693b, uih.removeEntryAtIndex(objArr, i));
    }

    private final nih<K, V> removeNodeAtIndex(int i, int i2) {
        Object[] objArr = this.f64695d;
        if (objArr.length == 1) {
            return null;
        }
        return new nih<>(this.f64692a, i2 ^ this.f64693b, uih.removeNodeAtIndex(objArr, i));
    }

    private final nih<K, V> replaceNode(nih<K, V> nihVar, nih<K, V> nihVar2, int i, int i2) {
        return nihVar2 == null ? removeNodeAtIndex(i, i2) : nihVar != nihVar2 ? updateNodeAtIndex(i, i2, nihVar2) : this;
    }

    private final nih<K, V> updateNodeAtIndex(int i, int i2, nih<K, V> nihVar) {
        Object[] objArr = nihVar.f64695d;
        if (objArr.length != 2 || nihVar.f64693b != 0) {
            Object[] objArr2 = this.f64695d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i] = nihVar;
            return new nih<>(this.f64692a, this.f64693b, objArrCopyOf);
        }
        if (this.f64695d.length == 1) {
            nihVar.f64692a = this.f64693b;
            return nihVar;
        }
        return new nih<>(this.f64692a ^ i2, i2 ^ this.f64693b, uih.replaceNodeWithEntry(this.f64695d, i, entryKeyIndex$runtime_release(i2), objArr[0], objArr[1]));
    }

    private final nih<K, V> updateValueAtIndex(int i, V v) {
        Object[] objArr = this.f64695d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i + 1] = v;
        return new nih<>(this.f64692a, this.f64693b, objArrCopyOf);
    }

    private final V valueAtKeyIndex(int i) {
        return (V) this.f64695d[i + 1];
    }

    public final void accept$runtime_release(@yfb rz6<? super nih<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, bth> rz6Var) {
        accept(rz6Var, 0, 0);
    }

    public final boolean containsKey(int i, K k, int i2) {
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            return md8.areEqual(k, keyAtIndex(entryKeyIndex$runtime_release(iIndexSegment)));
        }
        if (!hasNodeAt(iIndexSegment)) {
            return false;
        }
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return i2 == 30 ? nihVarNodeAtIndex$runtime_release.collisionContainsKey(k) : nihVarNodeAtIndex$runtime_release.containsKey(i, k, i2 + 5);
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.f64692a);
    }

    public final int entryKeyIndex$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.f64692a) * 2;
    }

    @gib
    public final V get(int i, K k, int i2) {
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (md8.areEqual(k, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            }
            return null;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return null;
        }
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return i2 == 30 ? nihVarNodeAtIndex$runtime_release.collisionGet(k) : nihVarNodeAtIndex$runtime_release.get(i, k, i2 + 5);
    }

    @yfb
    public final Object[] getBuffer$runtime_release() {
        return this.f64695d;
    }

    public final boolean hasEntryAt$runtime_release(int i) {
        return (i & this.f64692a) != 0;
    }

    @yfb
    public final nih<K, V> mutablePut(int i, K k, V v, int i2, @yfb wqc<K, V> wqcVar) {
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (md8.areEqual(k, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                wqcVar.setOperationResult$runtime_release(valueAtKeyIndex(iEntryKeyIndex$runtime_release));
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release) == v ? this : mutableUpdateValueAtIndex(iEntryKeyIndex$runtime_release, v, wqcVar);
            }
            wqcVar.setSize(wqcVar.size() + 1);
            return mutableMoveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, i, k, v, i2, wqcVar.getOwnership());
        }
        if (!hasNodeAt(iIndexSegment)) {
            wqcVar.setSize(wqcVar.size() + 1);
            return mutableInsertEntryAt(iIndexSegment, k, v, wqcVar.getOwnership());
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        nih<K, V> nihVarMutableCollisionPut = i2 == 30 ? nihVarNodeAtIndex$runtime_release.mutableCollisionPut(k, v, wqcVar) : nihVarNodeAtIndex$runtime_release.mutablePut(i, k, v, i2 + 5, wqcVar);
        return nihVarNodeAtIndex$runtime_release == nihVarMutableCollisionPut ? this : mutableUpdateNodeAtIndex(iNodeIndex$runtime_release, nihVarMutableCollisionPut, wqcVar.getOwnership());
    }

    @yfb
    public final nih<K, V> mutablePutAll(@yfb nih<K, V> nihVar, int i, @yfb a64 a64Var, @yfb wqc<K, V> wqcVar) {
        if (this == nihVar) {
            a64Var.plusAssign(calculateSize());
            return this;
        }
        if (i > 30) {
            return mutableCollisionPutAll(nihVar, a64Var, wqcVar.getOwnership());
        }
        int i2 = this.f64693b | nihVar.f64693b;
        int i3 = this.f64692a;
        int i4 = nihVar.f64692a;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        int i7 = i5;
        while (i6 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i6);
            if (md8.areEqual(keyAtIndex(entryKeyIndex$runtime_release(iLowestOneBit)), nihVar.keyAtIndex(nihVar.entryKeyIndex$runtime_release(iLowestOneBit)))) {
                i7 |= iLowestOneBit;
            } else {
                i2 |= iLowestOneBit;
            }
            i6 ^= iLowestOneBit;
        }
        int i8 = 0;
        if (!((i2 & i7) == 0)) {
            a8d.throwIllegalStateException("Check failed.");
        }
        nih<K, V> nihVar2 = (md8.areEqual(this.f64694c, wqcVar.getOwnership()) && this.f64692a == i7 && this.f64693b == i2) ? this : new nih<>(i7, i2, new Object[(Integer.bitCount(i7) * 2) + Integer.bitCount(i2)]);
        int i9 = i2;
        int i10 = 0;
        while (i9 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i9);
            Object[] objArr = nihVar2.f64695d;
            objArr[(objArr.length - 1) - i10] = mutablePutAllFromOtherNodeCell(nihVar, iLowestOneBit2, i, a64Var, wqcVar);
            i10++;
            i9 ^= iLowestOneBit2;
        }
        while (i7 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i7);
            int i11 = i8 * 2;
            if (nihVar.hasEntryAt$runtime_release(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime_release = nihVar.entryKeyIndex$runtime_release(iLowestOneBit3);
                nihVar2.f64695d[i11] = nihVar.keyAtIndex(iEntryKeyIndex$runtime_release);
                nihVar2.f64695d[i11 + 1] = nihVar.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
                if (hasEntryAt$runtime_release(iLowestOneBit3)) {
                    a64Var.setCount(a64Var.getCount() + 1);
                }
            } else {
                int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(iLowestOneBit3);
                nihVar2.f64695d[i11] = keyAtIndex(iEntryKeyIndex$runtime_release2);
                nihVar2.f64695d[i11 + 1] = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            }
            i8++;
            i7 ^= iLowestOneBit3;
        }
        return elementsIdentityEquals(nihVar2) ? this : nihVar.elementsIdentityEquals(nihVar2) ? nihVar : nihVar2;
    }

    @gib
    public final nih<K, V> mutableRemove(int i, K k, int i2, @yfb wqc<K, V> wqcVar) {
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return md8.areEqual(k, keyAtIndex(iEntryKeyIndex$runtime_release)) ? mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, wqcVar) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        return mutableReplaceNode(nihVarNodeAtIndex$runtime_release, i2 == 30 ? nihVarNodeAtIndex$runtime_release.mutableCollisionRemove(k, wqcVar) : nihVarNodeAtIndex$runtime_release.mutableRemove(i, k, i2 + 5, wqcVar), iNodeIndex$runtime_release, iIndexSegment, wqcVar.getOwnership());
    }

    @yfb
    public final nih<K, V> nodeAtIndex$runtime_release(int i) {
        Object obj = this.f64695d[i];
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (nih) obj;
    }

    public final int nodeIndex$runtime_release(int i) {
        return (this.f64695d.length - 1) - Integer.bitCount((i - 1) & this.f64693b);
    }

    @gib
    public final C9898b<K, V> put(int i, K k, V v, int i2) {
        C9898b<K, V> c9898bPut;
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!md8.areEqual(k, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return moveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, i, k, v, i2).asInsertResult();
            }
            if (valueAtKeyIndex(iEntryKeyIndex$runtime_release) == v) {
                return null;
            }
            return updateValueAtIndex(iEntryKeyIndex$runtime_release, v).asUpdateResult();
        }
        if (!hasNodeAt(iIndexSegment)) {
            return insertEntryAt(iIndexSegment, k, v).asInsertResult();
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (i2 == 30) {
            c9898bPut = nihVarNodeAtIndex$runtime_release.collisionPut(k, v);
            if (c9898bPut == null) {
                return null;
            }
        } else {
            c9898bPut = nihVarNodeAtIndex$runtime_release.put(i, k, v, i2 + 5);
            if (c9898bPut == null) {
                return null;
            }
        }
        c9898bPut.setNode(updateNodeAtIndex(iNodeIndex$runtime_release, iIndexSegment, c9898bPut.getNode()));
        return c9898bPut;
    }

    @gib
    public final nih<K, V> remove(int i, K k, int i2) {
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return md8.areEqual(k, keyAtIndex(iEntryKeyIndex$runtime_release)) ? removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        return replaceNode(nihVarNodeAtIndex$runtime_release, i2 == 30 ? nihVarNodeAtIndex$runtime_release.collisionRemove(k) : nihVarNodeAtIndex$runtime_release.remove(i, k, i2 + 5), iNodeIndex$runtime_release, iIndexSegment);
    }

    private final nih<K, V> collisionRemove(K k, V v) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!md8.areEqual(k, keyAtIndex(first)) || !md8.areEqual(v, valueAtKeyIndex(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step;
                } else {
                    return collisionRemoveEntryAtIndex(first);
                }
            }
        }
        return this;
    }

    private final nih<K, V> mutableCollisionRemove(K k, V v, wqc<K, V> wqcVar) {
        d78 d78VarStep = kpd.step(kpd.until(0, this.f64695d.length), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!md8.areEqual(k, keyAtIndex(first)) || !md8.areEqual(v, valueAtKeyIndex(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(first, wqcVar);
                }
            }
        }
        return this;
    }

    public nih(int i, int i2, @yfb Object[] objArr) {
        this(i, i2, objArr, null);
    }

    @gib
    public final nih<K, V> mutableRemove(int i, K k, V v, int i2, @yfb wqc<K, V> wqcVar) {
        nih<K, V> nihVarMutableRemove;
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return (md8.areEqual(k, keyAtIndex(iEntryKeyIndex$runtime_release)) && md8.areEqual(v, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) ? mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, wqcVar) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (i2 == 30) {
            nihVarMutableRemove = nihVarNodeAtIndex$runtime_release.mutableCollisionRemove(k, v, wqcVar);
        } else {
            nihVarMutableRemove = nihVarNodeAtIndex$runtime_release.mutableRemove(i, k, v, i2 + 5, wqcVar);
        }
        return mutableReplaceNode(nihVarNodeAtIndex$runtime_release, nihVarMutableRemove, iNodeIndex$runtime_release, iIndexSegment, wqcVar.getOwnership());
    }

    @gib
    public final nih<K, V> remove(int i, K k, V v, int i2) {
        nih<K, V> nihVarRemove;
        int iIndexSegment = 1 << uih.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return (md8.areEqual(k, keyAtIndex(iEntryKeyIndex$runtime_release)) && md8.areEqual(v, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) ? removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        nih<K, V> nihVarNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (i2 == 30) {
            nihVarRemove = nihVarNodeAtIndex$runtime_release.collisionRemove(k, v);
        } else {
            nihVarRemove = nihVarNodeAtIndex$runtime_release.remove(i, k, v, i2 + 5);
        }
        return replaceNode(nihVarNodeAtIndex$runtime_release, nihVarRemove, iNodeIndex$runtime_release, iIndexSegment);
    }
}
