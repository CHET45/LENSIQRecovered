package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#1,4:1085\n237#1,7:1089\n248#1,3:1097\n251#1,2:1101\n272#1,2:1103\n254#1,6:1105\n274#1:1111\n267#1,4:1112\n237#1,7:1116\n248#1,3:1124\n251#1,2:1128\n272#1,2:1130\n254#1,6:1132\n274#1:1138\n267#1,4:1139\n237#1,7:1143\n248#1,3:1151\n251#1,2:1155\n272#1,2:1157\n254#1,6:1159\n274#1:1165\n237#1,7:1168\n248#1,3:1176\n251#1,9:1180\n267#1,4:1189\n237#1,7:1193\n248#1,3:1201\n251#1,2:1205\n272#1,2:1207\n254#1,6:1209\n274#1:1215\n267#1,4:1216\n237#1,7:1220\n248#1,3:1228\n251#1,2:1232\n272#1,2:1234\n254#1,6:1236\n274#1:1242\n267#1,4:1243\n237#1,7:1247\n248#1,3:1255\n251#1,2:1259\n272#1,2:1261\n254#1,6:1263\n274#1:1269\n433#1:1270\n434#1:1274\n436#1,2:1276\n438#1,3:1279\n441#1:1285\n442#1:1289\n443#1:1291\n444#1,4:1294\n450#1:1299\n451#1,8:1301\n267#1,4:1309\n237#1,7:1313\n248#1,3:1321\n251#1,2:1325\n272#1,2:1327\n254#1,6:1329\n274#1:1335\n267#1,4:1336\n237#1,7:1340\n248#1,3:1348\n251#1,2:1352\n272#1,2:1354\n254#1,6:1356\n274#1:1362\n267#1,4:1363\n237#1,7:1367\n248#1,3:1375\n251#1,2:1379\n272#1,2:1381\n254#1,6:1383\n274#1:1389\n1810#2:1096\n1672#2:1100\n1810#2:1123\n1672#2:1127\n1810#2:1150\n1672#2:1154\n1810#2:1166\n1672#2:1167\n1810#2:1175\n1672#2:1179\n1810#2:1200\n1672#2:1204\n1810#2:1227\n1672#2:1231\n1810#2:1254\n1672#2:1258\n1589#2,3:1271\n1603#2:1275\n1599#2:1278\n1779#2,3:1282\n1793#2,3:1286\n1717#2:1290\n1705#2:1292\n1699#2:1293\n1712#2:1298\n1802#2:1300\n1810#2:1320\n1672#2:1324\n1810#2:1347\n1672#2:1351\n1810#2:1374\n1672#2:1378\n1589#2,3:1390\n1603#2:1393\n1599#2:1394\n1779#2,3:1395\n1793#2,3:1398\n1717#2:1401\n1705#2:1402\n1699#2:1403\n1712#2:1404\n1802#2:1405\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1085,4\n201#1:1089,7\n201#1:1097,3\n201#1:1101,2\n201#1:1103,2\n201#1:1105,6\n201#1:1111\n214#1:1112,4\n214#1:1116,7\n214#1:1124,3\n214#1:1128,2\n214#1:1130,2\n214#1:1132,6\n214#1:1138\n227#1:1139,4\n227#1:1143,7\n227#1:1151,3\n227#1:1155,2\n227#1:1157,2\n227#1:1159,6\n227#1:1165\n270#1:1168,7\n270#1:1176,3\n270#1:1180,9\n284#1:1189,4\n284#1:1193,7\n284#1:1201,3\n284#1:1205,2\n284#1:1207,2\n284#1:1209,6\n284#1:1215\n297#1:1216,4\n297#1:1220,7\n297#1:1228,3\n297#1:1232,2\n297#1:1234,2\n297#1:1236,6\n297#1:1242\n318#1:1243,4\n318#1:1247,7\n318#1:1255,3\n318#1:1259,2\n318#1:1261,2\n318#1:1263,6\n318#1:1269\n329#1:1270\n329#1:1274\n329#1:1276,2\n329#1:1279,3\n329#1:1285\n329#1:1289\n329#1:1291\n329#1:1294,4\n329#1:1299\n329#1:1301,8\n352#1:1309,4\n352#1:1313,7\n352#1:1321,3\n352#1:1325,2\n352#1:1327,2\n352#1:1329,6\n352#1:1335\n378#1:1336,4\n378#1:1340,7\n378#1:1348,3\n378#1:1352,2\n378#1:1354,2\n378#1:1356,6\n378#1:1362\n407#1:1363,4\n407#1:1367,7\n407#1:1375,3\n407#1:1379,2\n407#1:1381,2\n407#1:1383,6\n407#1:1389\n201#1:1096\n201#1:1100\n214#1:1123\n214#1:1127\n227#1:1150\n227#1:1154\n243#1:1166\n250#1:1167\n270#1:1175\n270#1:1179\n284#1:1200\n284#1:1204\n297#1:1227\n297#1:1231\n318#1:1254\n318#1:1258\n329#1:1271,3\n329#1:1275\n329#1:1278\n329#1:1282,3\n329#1:1286,3\n329#1:1290\n329#1:1292\n329#1:1293\n329#1:1298\n329#1:1300\n352#1:1320\n352#1:1324\n378#1:1347\n378#1:1351\n407#1:1374\n407#1:1378\n433#1:1390,3\n434#1:1393\n437#1:1394\n440#1:1395,3\n441#1:1398,3\n442#1:1401\n443#1:1402\n443#1:1403\n447#1:1404\n450#1:1405\n*E\n"})
public abstract class doe<E> {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public long[] f30277a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public Object[] f30278b;

    /* JADX INFO: renamed from: c */
    @un8
    public int f30279c;

    /* JADX INFO: renamed from: d */
    @un8
    public int f30280d;

    /* JADX INFO: renamed from: doe$a */
    @dwf({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1084:1\n1855#2,2:1085\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1085,2\n*E\n"})
    public class C4892a implements Set<E>, uo8 {

        /* JADX INFO: renamed from: doe$a$a */
        @ck3(m4009c = "androidx.collection.ScatterSet$SetWrapper$iterator$1", m4010f = "ScatterSet.kt", m4011i = {0, 0, 0, 0, 0, 0, 0, 0}, m4012l = {Videoio.CAP_PROP_XI_DEFAULT_CC_MATRIX}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, m4015s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @dwf({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#2,4:1085\n237#2,7:1089\n248#2,3:1097\n251#2,2:1101\n272#2,2:1103\n254#2,6:1105\n274#2:1111\n1810#3:1096\n1672#3:1100\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n*L\n494#1:1085,4\n494#1:1089,7\n494#1:1097,3\n494#1:1101,2\n494#1:1103,2\n494#1:1105,6\n494#1:1111\n494#1:1096\n494#1:1100\n*E\n"})
        public static final class a extends t7e implements gz6<xye<? super E>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: C */
            public int f30282C;

            /* JADX INFO: renamed from: F */
            public /* synthetic */ Object f30283F;

            /* JADX INFO: renamed from: H */
            public final /* synthetic */ doe<E> f30284H;

            /* JADX INFO: renamed from: a */
            public Object f30285a;

            /* JADX INFO: renamed from: b */
            public Object f30286b;

            /* JADX INFO: renamed from: c */
            public int f30287c;

            /* JADX INFO: renamed from: d */
            public int f30288d;

            /* JADX INFO: renamed from: e */
            public int f30289e;

            /* JADX INFO: renamed from: f */
            public int f30290f;

            /* JADX INFO: renamed from: m */
            public long f30291m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(doe<E> doeVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f30284H = doeVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f30284H, zy2Var);
                aVar.f30283F = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb xye<? super E> xyeVar, @gib zy2<? super bth> zy2Var) {
                return ((a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:23:0x0098). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:14:0x0066). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please report as a decompilation issue!!! */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f30282C
                    r3 = 0
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r5) goto L2a
                    int r2 = r0.f30290f
                    int r6 = r0.f30289e
                    long r7 = r0.f30291m
                    int r9 = r0.f30288d
                    int r10 = r0.f30287c
                    java.lang.Object r11 = r0.f30286b
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f30285a
                    java.lang.Object[] r12 = (java.lang.Object[]) r12
                    java.lang.Object r13 = r0.f30283F
                    xye r13 = (p000.xye) r13
                    p000.y7e.throwOnFailure(r21)
                    goto L8f
                L2a:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L32:
                    p000.y7e.throwOnFailure(r21)
                    java.lang.Object r2 = r0.f30283F
                    xye r2 = (p000.xye) r2
                    doe<E> r6 = r0.f30284H
                    java.lang.Object[] r7 = r6.f30278b
                    long[] r6 = r6.f30277a
                    int r8 = r6.length
                    int r8 = r8 + (-2)
                    if (r8 < 0) goto L9d
                    r9 = r3
                L45:
                    r10 = r6[r9]
                    long r12 = ~r10
                    r14 = 7
                    long r12 = r12 << r14
                    long r12 = r12 & r10
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r12 = r12 & r14
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 == 0) goto L98
                    int r12 = r9 - r8
                    int r12 = ~r12
                    int r12 = r12 >>> 31
                    int r12 = 8 - r12
                    r13 = r2
                    r2 = r3
                    r18 = r10
                    r11 = r6
                    r10 = r8
                    r6 = r12
                    r12 = r7
                    r7 = r18
                L66:
                    if (r2 >= r6) goto L92
                    r14 = 255(0xff, double:1.26E-321)
                    long r14 = r14 & r7
                    r16 = 128(0x80, double:6.3E-322)
                    int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                    if (r14 >= 0) goto L8f
                    int r14 = r9 << 3
                    int r14 = r14 + r2
                    r14 = r12[r14]
                    r0.f30283F = r13
                    r0.f30285a = r12
                    r0.f30286b = r11
                    r0.f30287c = r10
                    r0.f30288d = r9
                    r0.f30291m = r7
                    r0.f30289e = r6
                    r0.f30290f = r2
                    r0.f30282C = r5
                    java.lang.Object r14 = r13.yield(r14, r0)
                    if (r14 != r1) goto L8f
                    return r1
                L8f:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L66
                L92:
                    if (r6 != r4) goto L9d
                    r8 = r10
                    r6 = r11
                    r7 = r12
                    r2 = r13
                L98:
                    if (r9 == r8) goto L9d
                    int r9 = r9 + 1
                    goto L45
                L9d:
                    bth r1 = p000.bth.f14751a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.doe.C4892a.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C4892a() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return doe.this.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            doe<E> doeVar = doe.this;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!doeVar.contains((E) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int getSize() {
            return doe.this.f30280d;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return doe.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @yfb
        public Iterator<E> iterator() {
            return bze.iterator(new a(doe.this, null));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return f82.toArray(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            md8.checkNotNullParameter(tArr, "array");
            return (T[]) f82.toArray(this, tArr);
        }
    }

    /* JADX INFO: renamed from: doe$b */
    public static final class C4893b extends tt8 implements qy6<E, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ doe<E> f30292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4893b(doe<E> doeVar) {
            super(1);
            this.f30292a = doeVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(E e) {
            return e == this.f30292a ? "(this)" : String.valueOf(e);
        }
    }

    public /* synthetic */ doe(jt3 jt3Var) {
        this();
    }

    @yjd
    public static /* synthetic */ void getElements$annotations() {
    }

    @yjd
    public static /* synthetic */ void getMetadata$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(doe doeVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return doeVar.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, qy6Var);
    }

    public final boolean all(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f30278b;
        long[] jArr = this.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && !qy6Var.invoke(objArr[(i << 3) + i3]).booleanValue()) {
                        return false;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this.f30280d != 0;
    }

    @yfb
    public final Set<E> asSet() {
        return new C4892a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f30279c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f30277a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f30278b
            r15 = r15[r11]
            boolean r15 = p000.md8.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.doe.contains(java.lang.Object):boolean");
    }

    @h78(from = 0)
    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@p000.gib java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p000.doe
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            doe r1 = (p000.doe) r1
            int r3 = r1.getSize()
            int r5 = r17.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f30278b
            long[] r5 = r0.f30277a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L61
            r7 = r4
        L25:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3f:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L56
            return r4
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L5a:
            if (r10 != r11) goto L61
        L5c:
            if (r7 == r6) goto L61
            int r7 = r7 + 1
            goto L25
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.doe.equals(java.lang.Object):boolean");
    }

    public final int findElementIndex$collection(E e) {
        int i = 0;
        int iHashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f30279c;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f30277a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * coe.f17281k) ^ j;
            for (long j3 = (~j2) & (j2 - coe.f17281k) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (md8.areEqual(this.f30278b[iNumberOfTrailingZeros], e)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E first() {
        /*
            r14 = this;
            java.lang.Object[] r0 = r14.f30278b
            long[] r1 = r14.f30277a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L41
            r3 = 0
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L3c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L36
            int r1 = r4 << 3
            int r1 = r1 + r9
            r0 = r0[r1]
            return r0
        L36:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3a:
            if (r7 != r8) goto L41
        L3c:
            if (r4 == r2) goto L41
            int r4 = r4 + 1
            goto Lb
        L41:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The ScatterSet is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.doe.first():java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    @gib
    public final E firstOrNull(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f30278b;
        long[] jArr = this.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ?? r10 = (Object) objArr[(i << 3) + i3];
                        if (qy6Var.invoke(r10).booleanValue()) {
                            return r10;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return null;
                }
            }
            if (i == length) {
                return null;
            }
            i++;
        }
    }

    public final void forEach(@yfb qy6<? super E, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        Object[] objArr = this.f30278b;
        long[] jArr = this.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        qy6Var.invoke(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @yjd
    public final void forEachIndex(@yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        long[] jArr = this.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        qy6Var.invoke(Integer.valueOf((i << 3) + i3));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @h78(from = 0)
    public final int getCapacity() {
        return this.f30279c;
    }

    @h78(from = 0)
    public final int getSize() {
        return this.f30280d;
    }

    public int hashCode() {
        Object[] objArr = this.f30278b;
        long[] jArr = this.f30277a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            iHashCode += obj != null ? obj.hashCode() : 0;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    i = iHashCode;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f30280d == 0;
    }

    public final boolean isNotEmpty() {
        return this.f30280d != 0;
    }

    @yfb
    @yn8
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final boolean none() {
        return this.f30280d == 0;
    }

    @yfb
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new C4893b(this), 25, null);
    }

    private doe() {
        this.f30277a = coe.f17275e;
        this.f30278b = cv2.f27725c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@p000.yfb p000.qy6<? super E, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            p000.md8.checkNotNullParameter(r15, r0)
            java.lang.Object[] r0 = r14.f30278b
            long[] r1 = r14.f30277a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L53
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4c
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L48
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L48
            r15 = 1
            return r15
        L48:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4c:
            if (r7 != r8) goto L53
        L4e:
            if (r4 == r2) goto L53
            int r4 = r4 + 1
            goto L10
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.doe.any(qy6):boolean");
    }

    @h78(from = 0)
    public final int count(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f30278b;
        long[] jArr = this.f30277a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && qy6Var.invoke(objArr[(i2 << 3) + i5]).booleanValue()) {
                            i3++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E first(@p000.yfb p000.qy6<? super E, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            p000.md8.checkNotNullParameter(r15, r0)
            java.lang.Object[] r0 = r14.f30278b
            long[] r1 = r14.f30277a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L52
            r3 = 0
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L47
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r11 = r15.invoke(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L47
            return r10
        L47:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4b:
            if (r7 != r8) goto L52
        L4d:
            if (r4 == r2) goto L52
            int r4 = r4 + 1
            goto L10
        L52:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.doe.first(qy6):java.lang.Object");
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super E, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.f30278b;
        long[] jArr = this.f30277a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j & 255) < 128) {
                            Object obj = objArr[(i2 << 3) + i6];
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            if (qy6Var == null) {
                                sb.append(obj);
                            } else {
                                sb.append(qy6Var.invoke(obj));
                            }
                            i3++;
                            i4 = 8;
                        }
                        j >>= i4;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            sb.append(charSequence3);
        } else {
            sb.append(charSequence3);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
