package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1084:1\n1002#1,2:1269\n1006#1,5:1277\n1002#1,2:1308\n1006#1,5:1316\n1002#1,2:1333\n1006#1,5:1341\n1#2:1085\n1656#3,6:1086\n1810#3:1109\n1672#3:1113\n1589#3,3:1132\n1603#3:1136\n1599#3:1139\n1779#3,3:1143\n1793#3,3:1147\n1717#3:1151\n1705#3:1153\n1699#3:1154\n1712#3:1159\n1802#3:1161\n1589#3,3:1171\n1603#3:1175\n1599#3:1178\n1779#3,3:1182\n1793#3,3:1186\n1717#3:1190\n1705#3:1192\n1699#3:1193\n1712#3:1198\n1802#3:1200\n1810#3:1226\n1672#3:1230\n1810#3:1255\n1672#3:1259\n1656#3,6:1271\n1656#3,6:1282\n1589#3,3:1288\n1599#3:1291\n1603#3:1292\n1779#3,3:1293\n1793#3,3:1296\n1717#3:1299\n1705#3:1300\n1699#3:1301\n1712#3:1302\n1802#3:1303\n1666#3:1304\n1645#3:1305\n1664#3:1306\n1645#3:1307\n1656#3,6:1310\n1779#3,3:1321\n1810#3:1324\n1699#3:1325\n1669#3:1326\n1645#3:1327\n1589#3,3:1328\n1599#3:1331\n1603#3:1332\n1656#3,6:1335\n1656#3,6:1346\n1656#3,6:1352\n13579#4,2:1092\n13579#4,2:1209\n1855#5,2:1094\n1855#5,2:1213\n1295#6,2:1096\n1295#6,2:1211\n267#7,4:1098\n237#7,7:1102\n248#7,3:1110\n251#7,2:1114\n272#7,2:1116\n254#7,6:1118\n274#7:1124\n433#7:1131\n434#7:1135\n436#7,2:1137\n438#7,3:1140\n441#7:1146\n442#7:1150\n443#7:1152\n444#7,4:1155\n450#7:1160\n451#7,8:1162\n433#7:1170\n434#7:1174\n436#7,2:1176\n438#7,3:1179\n441#7:1185\n442#7:1189\n443#7:1191\n444#7,4:1194\n450#7:1199\n451#7,8:1201\n267#7,4:1215\n237#7,7:1219\n248#7,3:1227\n251#7,2:1231\n272#7,2:1233\n254#7,6:1235\n274#7:1241\n237#7,7:1248\n248#7,3:1256\n251#7,9:1260\n305#8,6:1125\n305#8,6:1242\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1269,2\n857#1:1277,5\n917#1:1308,2\n917#1:1316,5\n990#1:1333,2\n990#1:1341,5\n567#1:1086,6\n692#1:1109\n692#1:1113\n714#1:1132,3\n714#1:1136\n714#1:1139\n714#1:1143,3\n714#1:1147,3\n714#1:1151\n714#1:1153\n714#1:1154\n714#1:1159\n714#1:1161\n727#1:1171,3\n727#1:1175\n727#1:1178\n727#1:1182,3\n727#1:1186,3\n727#1:1190\n727#1:1192\n727#1:1193\n727#1:1198\n727#1:1200\n823#1:1226\n823#1:1230\n843#1:1255\n843#1:1259\n857#1:1271,6\n868#1:1282,6\n882#1:1288,3\n883#1:1291\n884#1:1292\n891#1:1293,3\n892#1:1296,3\n893#1:1299\n894#1:1300\n894#1:1301\n898#1:1302\n901#1:1303\n910#1:1304\n910#1:1305\n916#1:1306\n916#1:1307\n917#1:1310,6\n931#1:1321,3\n932#1:1324\n934#1:1325\n985#1:1326\n985#1:1327\n987#1:1328,3\n988#1:1331\n990#1:1332\n990#1:1335,6\n1003#1:1346,6\n1009#1:1352,6\n662#1:1092,2\n793#1:1209,2\n672#1:1094,2\n813#1:1213,2\n682#1:1096,2\n803#1:1211,2\n692#1:1098,4\n692#1:1102,7\n692#1:1110,3\n692#1:1114,2\n692#1:1116,2\n692#1:1118,6\n692#1:1124\n714#1:1131\n714#1:1135\n714#1:1137,2\n714#1:1140,3\n714#1:1146\n714#1:1150\n714#1:1152\n714#1:1155,4\n714#1:1160\n714#1:1162,8\n727#1:1170\n727#1:1174\n727#1:1176,2\n727#1:1179,3\n727#1:1185\n727#1:1189\n727#1:1191\n727#1:1194,4\n727#1:1199\n727#1:1201,8\n823#1:1215,4\n823#1:1219,7\n823#1:1227,3\n823#1:1231,2\n823#1:1233,2\n823#1:1235,6\n823#1:1241\n843#1:1248,7\n843#1:1256,3\n843#1:1260,9\n702#1:1125,6\n833#1:1242,6\n*E\n"})
public final class u6b<E> extends doe<E> {

    /* JADX INFO: renamed from: e */
    public int f86883e;

    /* JADX INFO: renamed from: u6b$a */
    @dwf({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n237#2,7:1085\n248#2,3:1093\n251#2,9:1097\n1810#3:1092\n1672#3:1096\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n*L\n1064#1:1085,7\n1064#1:1093,3\n1064#1:1097,9\n1064#1:1092\n1064#1:1096\n*E\n"})
    public final class C13376a extends doe<E>.C4892a implements Set<E>, fp8 {

        /* JADX INFO: renamed from: u6b$a$a */
        public static final class a implements Iterator<E>, xo8 {

            /* JADX INFO: renamed from: a */
            public int f86885a = -1;

            /* JADX INFO: renamed from: b */
            @yfb
            public final Iterator<E> f86886b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ u6b<E> f86887c;

            /* JADX INFO: renamed from: u6b$a$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", m4010f = "ScatterSet.kt", m4011i = {0, 0, 0, 0, 0, 0, 0}, m4012l = {1044}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m4015s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @dwf({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n237#2,7:1085\n248#2,3:1093\n251#2,9:1097\n1810#3:1092\n1672#3:1096\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1041#1:1085,7\n1041#1:1093,3\n1041#1:1097,9\n1041#1:1092\n1041#1:1096\n*E\n"})
            public static final class C16537a extends t7e implements gz6<xye<? super E>, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: C */
                public long f86888C;

                /* JADX INFO: renamed from: F */
                public int f86889F;

                /* JADX INFO: renamed from: H */
                public /* synthetic */ Object f86890H;

                /* JADX INFO: renamed from: L */
                public final /* synthetic */ u6b<E> f86891L;

                /* JADX INFO: renamed from: M */
                public final /* synthetic */ a f86892M;

                /* JADX INFO: renamed from: a */
                public Object f86893a;

                /* JADX INFO: renamed from: b */
                public Object f86894b;

                /* JADX INFO: renamed from: c */
                public Object f86895c;

                /* JADX INFO: renamed from: d */
                public int f86896d;

                /* JADX INFO: renamed from: e */
                public int f86897e;

                /* JADX INFO: renamed from: f */
                public int f86898f;

                /* JADX INFO: renamed from: m */
                public int f86899m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16537a(u6b<E> u6bVar, a aVar, zy2<? super C16537a> zy2Var) {
                    super(2, zy2Var);
                    this.f86891L = u6bVar;
                    this.f86892M = aVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    C16537a c16537a = new C16537a(this.f86891L, this.f86892M, zy2Var);
                    c16537a.f86890H = obj;
                    return c16537a;
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb xye<? super E> xyeVar, @gib zy2<? super bth> zy2Var) {
                    return ((C16537a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x00ad). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:20:0x009f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009c -> B:20:0x009f). Please report as a decompilation issue!!! */
                @Override // p000.tq0
                @p000.gib
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r23) {
                    /*
                        r22 = this;
                        r0 = r22
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f86889F
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L36
                        if (r2 != r5) goto L2e
                        int r2 = r0.f86899m
                        int r6 = r0.f86898f
                        long r7 = r0.f86888C
                        int r9 = r0.f86897e
                        int r10 = r0.f86896d
                        java.lang.Object r11 = r0.f86895c
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f86894b
                        u6b r12 = (p000.u6b) r12
                        java.lang.Object r13 = r0.f86893a
                        u6b$a$a r13 = (p000.u6b.C13376a.a) r13
                        java.lang.Object r14 = r0.f86890H
                        xye r14 = (p000.xye) r14
                        p000.y7e.throwOnFailure(r23)
                        goto L9f
                    L2e:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L36:
                        p000.y7e.throwOnFailure(r23)
                        java.lang.Object r2 = r0.f86890H
                        xye r2 = (p000.xye) r2
                        u6b<E> r6 = r0.f86891L
                        u6b$a$a r7 = r0.f86892M
                        long[] r8 = r6.f30277a
                        int r9 = r8.length
                        int r9 = r9 + (-2)
                        if (r9 < 0) goto Lb2
                        r10 = 0
                    L49:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto Lad
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                        r21 = r10
                        r10 = r9
                        r9 = r21
                    L6f:
                        if (r2 >= r6) goto La2
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.3E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L9f
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.setCurrent(r15)
                        java.lang.Object[] r3 = r12.f30278b
                        r3 = r3[r15]
                        r0.f86890H = r14
                        r0.f86893a = r13
                        r0.f86894b = r12
                        r0.f86895c = r11
                        r0.f86896d = r10
                        r0.f86897e = r9
                        r0.f86888C = r7
                        r0.f86898f = r6
                        r0.f86899m = r2
                        r0.f86889F = r5
                        java.lang.Object r3 = r14.yield(r3, r0)
                        if (r3 != r1) goto L9f
                        return r1
                    L9f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L6f
                    La2:
                        if (r6 != r4) goto Lb2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                        r19 = r10
                        r10 = r9
                        r9 = r19
                    Lad:
                        if (r10 == r9) goto Lb2
                        int r10 = r10 + 1
                        goto L49
                    Lb2:
                        bth r1 = p000.bth.f14751a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.u6b.C13376a.a.C16537a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public a(u6b<E> u6bVar) {
                this.f86887c = u6bVar;
                this.f86886b = bze.iterator(new C16537a(u6bVar, this, null));
            }

            public final int getCurrent() {
                return this.f86885a;
            }

            @yfb
            public final Iterator<E> getIterator() {
                return this.f86886b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f86886b.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.f86886b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i = this.f86885a;
                if (i != -1) {
                    this.f86887c.removeElementAt(i);
                    this.f86885a = -1;
                }
            }

            public final void setCurrent(int i) {
                this.f86885a = i;
            }
        }

        public C13376a() {
            super();
        }

        @Override // p000.doe.C4892a, java.util.Set, java.util.Collection
        public boolean add(E e) {
            return u6b.this.add(e);
        }

        @Override // p000.doe.C4892a, java.util.Set, java.util.Collection
        public boolean addAll(@yfb Collection<? extends E> collection) {
            md8.checkNotNullParameter(collection, "elements");
            return u6b.this.addAll(collection);
        }

        @Override // p000.doe.C4892a, java.util.Set, java.util.Collection
        public void clear() {
            u6b.this.clear();
        }

        @Override // p000.doe.C4892a, java.util.Set, java.util.Collection, java.lang.Iterable
        @yfb
        public Iterator<E> iterator() {
            return new a(u6b.this);
        }

        @Override // p000.doe.C4892a, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return u6b.this.remove(obj);
        }

        @Override // p000.doe.C4892a, java.util.Set, java.util.Collection
        public boolean removeAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            int size = u6b.this.getSize();
            Iterator<? extends Object> it = collection.iterator();
            while (it.hasNext()) {
                u6b.this.minusAssign((E) it.next());
            }
            return size != u6b.this.getSize();
        }

        @Override // p000.doe.C4892a, java.util.Set, java.util.Collection
        public boolean retainAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            u6b<E> u6bVar = u6b.this;
            long[] jArr = u6bVar.f30277a;
            int length = jArr.length - 2;
            boolean z = false;
            if (length >= 0) {
                int i = 0;
                boolean z2 = false;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                if (!collection.contains(u6bVar.f30278b[i4])) {
                                    u6bVar.removeElementAt(i4);
                                    z2 = true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return z2;
                        }
                    }
                    if (i == length) {
                        z = z2;
                        break;
                    }
                    i++;
                }
            }
            return z;
        }
    }

    public u6b() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        if (this.f30279c <= 8 || Long.compareUnsigned(oph.m31533constructorimpl(oph.m31533constructorimpl(this.f30280d) * 32), oph.m31533constructorimpl(oph.m31533constructorimpl(this.f30279c) * 25)) > 0) {
            resizeStorage(coe.nextCapacity(this.f30279c));
        } else {
            resizeStorage(coe.nextCapacity(this.f30279c));
        }
    }

    private final int findAbsoluteInsertIndex(E e) {
        int iHashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.f30279c;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f30277a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * coe.f17281k);
            for (long j4 = (~j3) & (j3 - coe.f17281k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (md8.areEqual(this.f30278b[iNumberOfTrailingZeros], e)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.f86883e == 0 && ((this.f30277a[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this.f30280d++;
                int i10 = this.f86883e;
                long[] jArr2 = this.f30277a;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.f86883e = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = (j5 & (~(255 << i12))) | (j2 << i12);
                int i13 = this.f30279c;
                int i14 = ((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j2 << i16);
                return iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this.f30279c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f30277a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void initializeGrowth() {
        this.f86883e = coe.loadedCapacity(getCapacity()) - this.f30280d;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = coe.f17275e;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f30277a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, coe.normalizeCapacity(i)) : 0;
        this.f30279c = iMax;
        initializeMetadata(iMax);
        this.f30278b = new Object[iMax];
    }

    private final void resizeStorage(int i) {
        int i2;
        long[] jArr = this.f30277a;
        Object[] objArr = this.f30278b;
        int i3 = this.f30279c;
        initializeStorage(i);
        Object[] objArr2 = this.f30278b;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr2 = this.f30277a;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                i2 = i4;
                jArr2[i6] = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this.f30279c;
                int i9 = ((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr2[i10] = ((~(255 << i11)) & jArr2[i10]) | (j << i11);
                objArr2[iFindFirstAvailableSlot] = obj;
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    private final void writeMetadata(int i, long j) {
        long[] jArr = this.f30277a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.f30279c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public final boolean add(E e) {
        int size = getSize();
        this.f30278b[findAbsoluteInsertIndex(e)] = e;
        return getSize() != size;
    }

    public final boolean addAll(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        int size = getSize();
        plusAssign((Object[]) eArr);
        return size != getSize();
    }

    @yfb
    public final Set<E> asMutableSet() {
        return new C13376a();
    }

    public final void clear() {
        this.f30280d = 0;
        long[] jArr = this.f30277a;
        if (jArr != coe.f17275e) {
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f30277a;
            int i = this.f30279c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        u70.fill(this.f30278b, (Object) null, 0, this.f30279c);
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f30279c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f30277a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f30278b
            r11 = r11[r10]
            boolean r11 = p000.md8.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.removeElementAt(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u6b.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E e) {
        this.f30278b[findAbsoluteInsertIndex(e)] = e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(E r18) {
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
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.removeElementAt(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u6b.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        int size = getSize();
        minusAssign((Object[]) eArr);
        return size != getSize();
    }

    @yjd
    public final void removeElementAt(int i) {
        this.f30280d--;
        long[] jArr = this.f30277a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.f30279c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.f30278b[i] = null;
    }

    public final void removeIf(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
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
                        int i4 = (i << 3) + i3;
                        if (qy6Var.invoke(objArr[i4]).booleanValue()) {
                            removeElementAt(i4);
                        }
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
    public final int trim() {
        int i = this.f30279c;
        int iNormalizeCapacity = coe.normalizeCapacity(coe.unloadedCapacity(this.f30280d));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this.f30279c;
    }

    public /* synthetic */ u6b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public u6b(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(coe.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final void plusAssign(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        for (E e : eArr) {
            plusAssign(e);
        }
    }

    public final boolean addAll(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        int size = getSize();
        plusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final boolean removeAll(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        int size = getSize();
        minusAssign((vye) vyeVar);
        return size != getSize();
    }

    public final void plusAssign(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public final boolean addAll(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        int size = getSize();
        plusAssign((vye) vyeVar);
        return size != getSize();
    }

    public final void plusAssign(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        Iterator<? extends E> it = vyeVar.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public final boolean removeAll(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        int size = getSize();
        minusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final void minusAssign(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        for (E e : eArr) {
            minusAssign(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        Object[] objArr = doeVar.f30278b;
        long[] jArr = doeVar.f30277a;
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
                        plusAssign(objArr[(i << 3) + i3]);
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

    public final boolean addAll(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        int size = getSize();
        plusAssign((doe) doeVar);
        return size != getSize();
    }

    public final void minusAssign(@yfb vye<? extends E> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "elements");
        Iterator<? extends E> it = vyeVar.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final boolean removeAll(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        int size = getSize();
        minusAssign((doe) doeVar);
        return size != getSize();
    }

    public final void minusAssign(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final boolean addAll(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        int size = getSize();
        plusAssign((ckb) ckbVar);
        return size != getSize();
    }

    public final boolean removeAll(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        int size = getSize();
        minusAssign((ckb) ckbVar);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@yfb doe<E> doeVar) {
        md8.checkNotNullParameter(doeVar, "elements");
        Object[] objArr = doeVar.f30278b;
        long[] jArr = doeVar.f30277a;
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
                        minusAssign(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        Object[] objArr = ckbVar.f16823a;
        int i = ckbVar.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            plusAssign(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        Object[] objArr = ckbVar.f16823a;
        int i = ckbVar.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            minusAssign(objArr[i2]);
        }
    }
}
