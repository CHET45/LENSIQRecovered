package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,382:1\n317#1,28:385\n317#1,28:413\n317#1,28:441\n317#1,28:469\n317#1,28:497\n325#1,20:525\n13600#2,2:383\n1549#3:545\n1620#3,3:546\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n236#1:385,28\n257#1:413,28\n261#1:441,28\n283#1:469,28\n286#1:497,28\n318#1:525,20\n107#1:383,2\n354#1:545\n354#1:546,3\n*E\n"})
@vw7
public final class ctf implements Iterable<Integer>, uo8 {

    /* JADX INFO: renamed from: f */
    public static final int f27528f = 0;

    /* JADX INFO: renamed from: a */
    public final long f27530a;

    /* JADX INFO: renamed from: b */
    public final long f27531b;

    /* JADX INFO: renamed from: c */
    public final int f27532c;

    /* JADX INFO: renamed from: d */
    @gib
    public final int[] f27533d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C4495a f27527e = new C4495a(null);

    /* JADX INFO: renamed from: m */
    @yfb
    public static final ctf f27529m = new ctf(0, 0, 0, null);

    /* JADX INFO: renamed from: ctf$a */
    public static final class C4495a {
        public /* synthetic */ C4495a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final ctf getEMPTY() {
            return ctf.f27529m;
        }

        private C4495a() {
        }
    }

    /* JADX INFO: renamed from: ctf$b */
    @ck3(m4009c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m4010f = "SnapshotIdSet.kt", m4011i = {0, 0, 1, 1, 2, 2}, m4012l = {295, 300, 307}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, m4015s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    public static final class C4496b extends t7e implements gz6<xye<? super Integer>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f27534a;

        /* JADX INFO: renamed from: b */
        public int f27535b;

        /* JADX INFO: renamed from: c */
        public int f27536c;

        /* JADX INFO: renamed from: d */
        public int f27537d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27538e;

        public C4496b(zy2<? super C4496b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C4496b c4496b = ctf.this.new C4496b(zy2Var);
            c4496b.f27538e = obj;
            return c4496b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb xye<? super Integer> xyeVar, @gib zy2<? super bth> zy2Var) {
            return ((C4496b) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:43:0x00ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:42:0x00e9). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ctf.C4496b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private ctf(long j, long j2, int i, int[] iArr) {
        this.f27530a = j;
        this.f27531b = j2;
        this.f27532c = i;
        this.f27533d = iArr;
    }

    @yfb
    public final ctf and(@yfb ctf ctfVar) {
        ctf ctfVar2 = f27529m;
        if (md8.areEqual(ctfVar, ctfVar2) || md8.areEqual(this, ctfVar2)) {
            return ctfVar2;
        }
        int i = ctfVar.f27532c;
        int i2 = this.f27532c;
        if (i == i2) {
            int[] iArr = ctfVar.f27533d;
            int[] iArr2 = this.f27533d;
            if (iArr == iArr2) {
                long j = this.f27530a;
                long j2 = ctfVar.f27530a;
                long j3 = j & j2;
                long j4 = this.f27531b;
                ctf ctfVar3 = ctfVar2;
                long j5 = ctfVar.f27531b;
                long j6 = j4 & j5;
                if (j3 != 0 || j6 != 0 || iArr2 != null) {
                    ctfVar3 = new ctf(j & j2, j5 & j4, i2, iArr2);
                }
                return ctfVar3;
            }
        }
        ctf ctfVar4 = ctfVar2;
        int i3 = 0;
        if (this.f27533d != null) {
            int[] iArr3 = ctfVar.f27533d;
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    if (get(i4)) {
                        ctfVar4 = ctfVar4.set(i4);
                    }
                }
            }
            ctf ctfVar5 = ctfVar4;
            long j7 = 0;
            if (ctfVar.f27531b != 0) {
                int i5 = 0;
                while (i5 < 64) {
                    if ((ctfVar.f27531b & (1 << i5)) != j7) {
                        int i6 = ctfVar.f27532c + i5;
                        if (get(i6)) {
                            ctfVar5 = ctfVar5.set(i6);
                        }
                    }
                    i5++;
                    j7 = 0;
                }
            }
            if (ctfVar.f27530a == 0) {
                return ctfVar5;
            }
            while (i3 < 64) {
                if ((ctfVar.f27530a & (1 << i3)) != 0) {
                    int i7 = i3 + 64 + ctfVar.f27532c;
                    if (get(i7)) {
                        ctfVar5 = ctfVar5.set(i7);
                    }
                }
                i3++;
            }
            return ctfVar5;
        }
        int[] iArr4 = this.f27533d;
        if (iArr4 != null) {
            for (int i8 : iArr4) {
                if (ctfVar.get(i8)) {
                    ctfVar4 = ctfVar4.set(i8);
                }
            }
        }
        ctf ctfVar6 = ctfVar4;
        long j8 = 0;
        if (this.f27531b != 0) {
            int i9 = 0;
            while (i9 < 64) {
                if ((this.f27531b & (1 << i9)) != j8) {
                    int i10 = this.f27532c + i9;
                    if (ctfVar.get(i10)) {
                        ctfVar6 = ctfVar6.set(i10);
                    }
                }
                i9++;
                j8 = 0;
            }
        }
        long j9 = 0;
        if (this.f27530a == 0) {
            return ctfVar6;
        }
        while (i3 < 64) {
            if ((this.f27530a & (1 << i3)) != j9) {
                int i11 = i3 + 64 + this.f27532c;
                if (ctfVar.get(i11)) {
                    ctfVar6 = ctfVar6.set(i11);
                }
            }
            i3++;
            j9 = 0;
        }
        return ctfVar6;
    }

    @yfb
    public final ctf andNot(@yfb ctf ctfVar) {
        ctf ctfVarClear;
        ctf ctfVar2 = f27529m;
        if (ctfVar == ctfVar2) {
            return this;
        }
        if (this == ctfVar2) {
            return ctfVar2;
        }
        int i = ctfVar.f27532c;
        int i2 = this.f27532c;
        if (i == i2) {
            int[] iArr = ctfVar.f27533d;
            int[] iArr2 = this.f27533d;
            if (iArr == iArr2) {
                return new ctf(this.f27530a & (~ctfVar.f27530a), this.f27531b & (~ctfVar.f27531b), i2, iArr2);
            }
        }
        int[] iArr3 = ctfVar.f27533d;
        if (iArr3 != null) {
            ctfVarClear = this;
            for (int i3 : iArr3) {
                ctfVarClear = ctfVarClear.clear(i3);
            }
        } else {
            ctfVarClear = this;
        }
        if (ctfVar.f27531b != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((ctfVar.f27531b & (1 << i4)) != 0) {
                    ctfVarClear = ctfVarClear.clear(ctfVar.f27532c + i4);
                }
            }
        }
        if (ctfVar.f27530a != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((ctfVar.f27530a & (1 << i5)) != 0) {
                    ctfVarClear = ctfVarClear.clear(i5 + 64 + ctfVar.f27532c);
                }
            }
        }
        return ctfVarClear;
    }

    @yfb
    public final ctf clear(int i) {
        int[] iArr;
        int iBinarySearch;
        int i2 = this.f27532c;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.f27531b;
            if ((j2 & j) != 0) {
                return new ctf(this.f27530a, j2 & (~j), i2, this.f27533d);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f27530a;
            if ((j4 & j3) != 0) {
                return new ctf(j4 & (~j3), this.f27531b, i2, this.f27533d);
            }
        } else if (i3 < 0 && (iArr = this.f27533d) != null && (iBinarySearch = dtf.binarySearch(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new ctf(this.f27530a, this.f27531b, this.f27532c, null);
            }
            int[] iArr2 = new int[i4];
            if (iBinarySearch > 0) {
                u70.copyInto(iArr, iArr2, 0, 0, iBinarySearch);
            }
            if (iBinarySearch < i4) {
                u70.copyInto(iArr, iArr2, iBinarySearch, iBinarySearch + 1, length);
            }
            return new ctf(this.f27530a, this.f27531b, this.f27532c, iArr2);
        }
        return this;
    }

    @yfb
    public final ctf fastFold(@yfb ctf ctfVar, @yfb gz6<? super ctf, ? super Integer, ctf> gz6Var) {
        int[] iArr = this.f27533d;
        if (iArr != null) {
            for (int i : iArr) {
                ctfVar = gz6Var.invoke(ctfVar, Integer.valueOf(i));
            }
        }
        if (this.f27531b != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.f27531b & (1 << i2)) != 0) {
                    ctfVar = gz6Var.invoke(ctfVar, Integer.valueOf(this.f27532c + i2));
                }
            }
        }
        if (this.f27530a != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.f27530a & (1 << i3)) != 0) {
                    ctfVar = gz6Var.invoke(ctfVar, Integer.valueOf(i3 + 64 + this.f27532c));
                }
            }
        }
        return ctfVar;
    }

    public final void fastForEach(@yfb qy6<? super Integer, bth> qy6Var) {
        int[] iArr = this.f27533d;
        if (iArr != null) {
            for (int i : iArr) {
                qy6Var.invoke(Integer.valueOf(i));
            }
        }
        if (this.f27531b != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.f27531b & (1 << i2)) != 0) {
                    qy6Var.invoke(Integer.valueOf(this.f27532c + i2));
                }
            }
        }
        if (this.f27530a != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.f27530a & (1 << i3)) != 0) {
                    qy6Var.invoke(Integer.valueOf(i3 + 64 + this.f27532c));
                }
            }
        }
    }

    public final boolean get(int i) {
        int[] iArr;
        int i2 = i - this.f27532c;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.f27531b) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.f27530a) != 0;
        }
        if (i2 <= 0 && (iArr = this.f27533d) != null) {
            return dtf.binarySearch(iArr, i) >= 0;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<Integer> iterator() {
        return bze.sequence(new C4496b(null)).iterator();
    }

    public final int lowest(int i) {
        int[] iArr = this.f27533d;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f27531b;
        if (j != 0) {
            return this.f27532c + Long.numberOfTrailingZeros(j);
        }
        long j2 = this.f27530a;
        return j2 != 0 ? this.f27532c + 64 + Long.numberOfTrailingZeros(j2) : i;
    }

    @yfb
    /* JADX INFO: renamed from: or */
    public final ctf m8686or(@yfb ctf ctfVar) {
        ctf ctfVar2;
        ctf ctfVar3 = f27529m;
        if (ctfVar == ctfVar3) {
            return this;
        }
        if (this == ctfVar3) {
            return ctfVar;
        }
        int i = ctfVar.f27532c;
        int i2 = this.f27532c;
        if (i == i2) {
            int[] iArr = ctfVar.f27533d;
            int[] iArr2 = this.f27533d;
            if (iArr == iArr2) {
                return new ctf(this.f27530a | ctfVar.f27530a, this.f27531b | ctfVar.f27531b, i2, iArr2);
            }
        }
        int i3 = 0;
        if (this.f27533d == null) {
            int[] iArr3 = this.f27533d;
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    ctfVar = ctfVar.set(i4);
                }
            }
            if (this.f27531b != 0) {
                for (int i5 = 0; i5 < 64; i5++) {
                    if ((this.f27531b & (1 << i5)) != 0) {
                        ctfVar = ctfVar.set(this.f27532c + i5);
                    }
                }
            }
            if (this.f27530a != 0) {
                while (i3 < 64) {
                    if ((this.f27530a & (1 << i3)) != 0) {
                        ctfVar = ctfVar.set(i3 + 64 + this.f27532c);
                    }
                    i3++;
                }
            }
            return ctfVar;
        }
        int[] iArr4 = ctfVar.f27533d;
        if (iArr4 != null) {
            ctfVar2 = this;
            for (int i6 : iArr4) {
                ctfVar2 = ctfVar2.set(i6);
            }
        } else {
            ctfVar2 = this;
        }
        if (ctfVar.f27531b != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if ((ctfVar.f27531b & (1 << i7)) != 0) {
                    ctfVar2 = ctfVar2.set(ctfVar.f27532c + i7);
                }
            }
        }
        if (ctfVar.f27530a != 0) {
            while (i3 < 64) {
                if ((ctfVar.f27530a & (1 << i3)) != 0) {
                    ctfVar2 = ctfVar2.set(i3 + 64 + ctfVar.f27532c);
                }
                i3++;
            }
        }
        return ctfVar2;
    }

    @yfb
    public final ctf set(int i) {
        int i2;
        int[] intArray;
        int i3 = this.f27532c;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.f27531b;
            if ((j3 & j2) == 0) {
                return new ctf(this.f27530a, j3 | j2, i3, this.f27533d);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.f27530a;
            if ((j5 & j4) == 0) {
                return new ctf(j5 | j4, this.f27531b, i3, this.f27533d);
            }
        } else if (i4 < 128) {
            int[] iArr = this.f27533d;
            if (iArr == null) {
                return new ctf(this.f27530a, this.f27531b, i3, new int[]{i});
            }
            int iBinarySearch = dtf.binarySearch(iArr, i);
            if (iBinarySearch < 0) {
                int i5 = -(iBinarySearch + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                u70.copyInto(iArr, iArr2, 0, 0, i5);
                u70.copyInto(iArr, iArr2, i5 + 1, i5, length);
                iArr2[i5] = i;
                return new ctf(this.f27530a, this.f27531b, this.f27532c, iArr2);
            }
        } else if (!get(i)) {
            long j6 = this.f27530a;
            long j7 = this.f27531b;
            int i6 = this.f27532c;
            int i7 = ((i + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i6 >= i7) {
                    i2 = i6;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f27533d;
                        if (iArr3 != null) {
                            for (int i8 : iArr3) {
                                arrayList.add(Integer.valueOf(i8));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i6));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    i2 = i7;
                    j8 = j;
                    break;
                }
                i6 += 64;
                j8 = j9;
                j9 = j;
            }
            if (arrayList == null || (intArray = v82.toIntArray(arrayList)) == null) {
                intArray = this.f27533d;
            }
            return new ctf(j9, j8, i2, intArray).set(i);
        }
        return this;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(v99.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(C4584d2.f28243l);
        return sb.toString();
    }
}
