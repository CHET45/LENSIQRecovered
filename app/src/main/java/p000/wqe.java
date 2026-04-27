package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,194:1\n77#1,5:240\n85#1,4:272\n874#2,18:195\n1047#2:276\n1049#2:290\n1050#2,3:318\n1053#2:327\n1047#2:328\n1049#2,4:342\n1053#2:352\n267#3,4:213\n237#3,7:217\n248#3,3:225\n251#3,2:229\n272#3,2:231\n254#3,6:233\n274#3:239\n267#3,4:245\n237#3,7:249\n248#3,3:257\n251#3,2:261\n272#3,2:263\n254#3,6:265\n274#3:271\n237#3,7:293\n248#3,3:301\n251#3,2:305\n254#3,6:311\n1810#4:224\n1672#4:228\n1810#4:256\n1672#4:260\n1810#4:283\n1672#4:287\n1810#4:300\n1672#4:304\n1810#4:335\n1672#4:339\n1810#4:363\n1672#4:367\n363#5,6:277\n373#5,3:284\n376#5,2:288\n379#5,6:321\n363#5,6:329\n373#5,3:336\n376#5,2:340\n379#5,6:346\n391#5,4:353\n363#5,6:357\n373#5,3:364\n376#5,2:368\n396#5,2:370\n379#5,6:372\n398#5:378\n842#6,2:291\n845#6,4:307\n849#6:317\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n91#1:240,5\n91#1:272,4\n37#1:195,18\n138#1:276\n138#1:290\n138#1:318,3\n138#1:327\n159#1:328\n159#1:342,4\n159#1:352\n81#1:213,4\n81#1:217,7\n81#1:225,3\n81#1:229,2\n81#1:231,2\n81#1:233,6\n81#1:239\n91#1:245,4\n91#1:249,7\n91#1:257,3\n91#1:261,2\n91#1:263,2\n91#1:265,6\n91#1:271\n143#1:293,7\n143#1:301,3\n143#1:305,2\n143#1:311,6\n81#1:224\n81#1:228\n91#1:256\n91#1:260\n138#1:283\n138#1:287\n143#1:300\n143#1:304\n159#1:335\n159#1:339\n180#1:363\n180#1:367\n138#1:277,6\n138#1:284,3\n138#1:288,2\n138#1:321,6\n159#1:329,6\n159#1:336,3\n159#1:340,2\n159#1:346,6\n180#1:353,4\n180#1:357,6\n180#1:364,3\n180#1:368,2\n180#1:370,2\n180#1:372,6\n180#1:378\n143#1:291,2\n143#1:307,4\n143#1:317\n*E\n"})
@e0g(parameters = 0)
public final class wqe<Key, Scope> {

    /* JADX INFO: renamed from: b */
    public static final int f95171b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final s6b<Object, Object> f95172a = coe.mutableScatterMapOf();

    public final void add(@yfb Key key, @yfb Scope scope) {
        s6b<Object, Object> s6bVar = this.f95172a;
        int iFindInsertIndex = s6bVar.findInsertIndex(key);
        boolean z = iFindInsertIndex < 0;
        Object obj = z ? null : s6bVar.f14266c[iFindInsertIndex];
        if (obj != null) {
            if (obj instanceof u6b) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((u6b) obj).add(scope);
            } else if (obj != scope) {
                u6b u6bVar = new u6b(0, 1, null);
                md8.checkNotNull(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                u6bVar.add(obj);
                u6bVar.add(scope);
                scope = (Scope) u6bVar;
            }
            scope = (Scope) obj;
        }
        if (!z) {
            s6bVar.f14266c[iFindInsertIndex] = scope;
            return;
        }
        int i = ~iFindInsertIndex;
        s6bVar.f14265b[i] = key;
        s6bVar.f14266c[i] = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean anyScopeOf(@p000.yfb Key r17, @p000.yfb p000.qy6<? super Scope, java.lang.Boolean> r18) {
        /*
            r16 = this;
            r0 = r18
            s6b r1 = r16.getMap()
            r2 = r17
            java.lang.Object r1 = r1.get(r2)
            r2 = 0
            if (r1 == 0) goto L6f
            boolean r3 = r1 instanceof p000.u6b
            r4 = 1
            if (r3 == 0) goto L62
            u6b r1 = (p000.u6b) r1
            java.lang.Object[] r3 = r1.f30278b
            long[] r1 = r1.f30277a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = r2
        L20:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r2
        L3a:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            java.lang.Object r12 = r0.invoke(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L57
            return r4
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L3a
        L5b:
            if (r9 != r10) goto L6f
        L5d:
            if (r6 == r5) goto L6f
            int r6 = r6 + 1
            goto L20
        L62:
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6f
            return r4
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wqe.anyScopeOf(java.lang.Object, qy6):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<Key, java.util.Set<Scope>> asMap() {
        /*
            r17 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r17
            s6b<java.lang.Object, java.lang.Object> r2 = r1.f95172a
            java.lang.Object[] r3 = r2.f14265b
            java.lang.Object[] r4 = r2.f14266c
            long[] r2 = r2.f14264a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L72
            r6 = 0
            r7 = r6
        L16:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L6b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L67
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r15 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4"
            p000.md8.checkNotNull(r14, r15)
            boolean r15 = r13 instanceof p000.u6b
            if (r15 == 0) goto L57
            java.lang.String r15 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4>"
            p000.md8.checkNotNull(r13, r15)
            u6b r13 = (p000.u6b) r13
            java.util.Set r13 = r13.asSet()
            goto L64
        L57:
            java.lang.String r15 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4"
            p000.md8.checkNotNull(r13, r15)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.util.Set r13 = p000.w6f.mutableSetOf(r13)
        L64:
            r0.put(r14, r13)
        L67:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L6b:
            if (r10 != r11) goto L72
        L6d:
            if (r7 == r5) goto L72
            int r7 = r7 + 1
            goto L16
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wqe.asMap():java.util.Map");
    }

    public final void clear() {
        this.f95172a.clear();
    }

    public final boolean contains(@yfb Key key) {
        return this.f95172a.containsKey(key);
    }

    public final void forEachScopeOf(@yfb Key key, @yfb qy6<? super Scope, bth> qy6Var) {
        Object obj = getMap().get(key);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof u6b)) {
            qy6Var.invoke(obj);
            return;
        }
        u6b u6bVar = (u6b) obj;
        Object[] objArr = u6bVar.f30278b;
        long[] jArr = u6bVar.f30277a;
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

    @yfb
    public final s6b<Object, Object> getMap() {
        return this.f95172a;
    }

    public final int getSize() {
        return this.f95172a.getSize();
    }

    public final boolean remove(@yfb Key key, @yfb Scope scope) {
        Object obj = this.f95172a.get(key);
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof u6b)) {
            if (!md8.areEqual(obj, scope)) {
                return false;
            }
            this.f95172a.remove(key);
            return true;
        }
        u6b u6bVar = (u6b) obj;
        boolean zRemove = u6bVar.remove(scope);
        if (zRemove && u6bVar.isEmpty()) {
            this.f95172a.remove(key);
        }
        return zRemove;
    }

    public final void removeScope(@yfb Scope scope) {
        boolean zIsEmpty;
        s6b<Object, Object> s6bVar = this.f95172a;
        long[] jArr = s6bVar.f14264a;
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
                        Object obj = s6bVar.f14265b[i4];
                        Object obj2 = s6bVar.f14266c[i4];
                        if (obj2 instanceof u6b) {
                            md8.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            u6b u6bVar = (u6b) obj2;
                            u6bVar.remove(scope);
                            zIsEmpty = u6bVar.isEmpty();
                        } else {
                            zIsEmpty = obj2 == scope;
                        }
                        if (zIsEmpty) {
                            s6bVar.removeValueAt(i4);
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

    public final void removeScopeIf(@yfb qy6<? super Scope, Boolean> qy6Var) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        boolean zBooleanValue;
        int i6;
        s6b<Object, Object> map = getMap();
        long[] jArr3 = map.f14264a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j2 = jArr3[i7];
            char c = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j2 & 255) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = map.f14265b[i11];
                        Object obj2 = map.f14266c[i11];
                        if (obj2 instanceof u6b) {
                            md8.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                            u6b u6bVar = (u6b) obj2;
                            Object[] objArr = u6bVar.f30278b;
                            long[] jArr4 = u6bVar.f30277a;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i2 = length;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j4 = jArr4[i12];
                                    i4 = i9;
                                    long[] jArr5 = jArr4;
                                    j = -9187201950435737472L;
                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j4 & 255) < 128) {
                                                int i15 = (i12 << 3) + i14;
                                                i6 = i7;
                                                if (qy6Var.invoke(objArr[i15]).booleanValue()) {
                                                    u6bVar.removeElementAt(i15);
                                                }
                                            } else {
                                                i6 = i7;
                                            }
                                            j4 >>= 8;
                                            i14++;
                                            i7 = i6;
                                        }
                                        i3 = i7;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        i3 = i7;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    i9 = i4;
                                    jArr4 = jArr5;
                                    i7 = i3;
                                    c = 7;
                                }
                            } else {
                                i3 = i7;
                                i4 = i9;
                                j = -9187201950435737472L;
                            }
                            zBooleanValue = u6bVar.isEmpty();
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i7;
                            i4 = i9;
                            j = j3;
                            md8.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                            zBooleanValue = qy6Var.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            map.removeValueAt(i11);
                        }
                        i5 = 8;
                    } else {
                        jArr2 = jArr3;
                        i2 = length;
                        i3 = i7;
                        i4 = i9;
                        j = j3;
                        i5 = i8;
                    }
                    j2 >>= i5;
                    i10++;
                    i8 = i5;
                    j3 = j;
                    jArr3 = jArr2;
                    length = i2;
                    i9 = i4;
                    i7 = i3;
                    c = 7;
                }
                jArr = jArr3;
                int i16 = length;
                int i17 = i7;
                if (i9 != i8) {
                    return;
                }
                length = i16;
                i = i17;
            } else {
                jArr = jArr3;
                i = i7;
            }
            if (i == length) {
                return;
            }
            i7 = i + 1;
            jArr3 = jArr;
        }
    }

    public final void set(@yfb Key key, @yfb Scope scope) {
        this.f95172a.set(key, scope);
    }
}
