package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,449:1\n89#2:450\n1#3:451\n296#4,2:452\n267#4,4:454\n237#4,7:458\n248#4,3:466\n251#4,2:470\n272#4:472\n298#4,2:473\n273#4:475\n254#4,6:476\n274#4:482\n300#4:483\n1810#5:465\n1672#5:469\n1810#5:494\n1672#5:498\n1810#5:521\n1672#5:525\n401#6,4:484\n373#6,6:488\n383#6,3:495\n386#6,2:499\n406#6,2:501\n389#6,6:503\n408#6:509\n449#6:510\n401#6,4:511\n373#6,6:515\n383#6,3:522\n386#6,2:526\n406#6:528\n450#6,2:529\n407#6:531\n389#6,6:532\n408#6:538\n452#6:539\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n197#1:450\n359#1:452,2\n359#1:454,4\n359#1:458,7\n359#1:466,3\n359#1:470,2\n359#1:472\n359#1:473,2\n359#1:475\n359#1:476,6\n359#1:482\n359#1:483\n359#1:465\n359#1:469\n381#1:494\n381#1:498\n404#1:521\n404#1:525\n381#1:484,4\n381#1:488,6\n381#1:495,3\n381#1:499,2\n381#1:501,2\n381#1:503,6\n381#1:509\n404#1:510\n404#1:511,4\n404#1:515,6\n404#1:522,3\n404#1:526,2\n404#1:528\n404#1:529,2\n404#1:531\n404#1:532,6\n404#1:538\n404#1:539\n*E\n"})
@e0g(parameters = 0)
public final class ssd implements are, rsd {

    /* JADX INFO: renamed from: i */
    @yfb
    public static final C12768a f82774i = new C12768a(null);

    /* JADX INFO: renamed from: j */
    public static final int f82775j = 8;

    /* JADX INFO: renamed from: a */
    public int f82776a;

    /* JADX INFO: renamed from: b */
    @gib
    public vsd f82777b;

    /* JADX INFO: renamed from: c */
    @gib
    public C5897fo f82778c;

    /* JADX INFO: renamed from: d */
    @gib
    public gz6<? super zl2, ? super Integer, bth> f82779d;

    /* JADX INFO: renamed from: e */
    @gib
    public usd f82780e;

    /* JADX INFO: renamed from: f */
    public int f82781f;

    /* JADX INFO: renamed from: g */
    @gib
    public e6b<Object> f82782g;

    /* JADX INFO: renamed from: h */
    @gib
    public s6b<z64<?>, Object> f82783h;

    /* JADX INFO: renamed from: ssd$a */
    @dwf({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,449:1\n33#2,6:450\n93#2,2:456\n33#2,4:458\n95#2,2:462\n38#2:464\n97#2:465\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n434#1:450,6\n444#1:456,2\n444#1:458,4\n444#1:462,2\n444#1:464\n444#1:465\n*E\n"})
    public static final class C12768a {
        public /* synthetic */ C12768a(jt3 jt3Var) {
            this();
        }

        public final void adoptAnchoredScopes$runtime_release(@yfb prf prfVar, @yfb List<C5897fo> list, @yfb vsd vsdVar) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object objSlot = prfVar.slot(list.get(i), 0);
                ssd ssdVar = objSlot instanceof ssd ? (ssd) objSlot : null;
                if (ssdVar != null) {
                    ssdVar.adoptedBy(vsdVar);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(@yfb mrf mrfVar, @yfb List<C5897fo> list) {
            if (list.isEmpty()) {
                return false;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C5897fo c5897fo = list.get(i);
                if (mrfVar.ownsAnchor(c5897fo) && (mrfVar.slot$runtime_release(mrfVar.anchorIndex(c5897fo), 0) instanceof ssd)) {
                    return true;
                }
            }
            return false;
        }

        private C12768a() {
        }
    }

    /* JADX INFO: renamed from: ssd$b */
    @dwf({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,449:1\n843#2:450\n845#2,4:464\n849#2:474\n373#3,6:451\n383#3,3:458\n386#3,2:462\n389#3,6:468\n1810#4:457\n1672#4:461\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n411#1:450\n411#1:464,4\n411#1:474\n411#1:451,6\n411#1:458,3\n411#1:462,2\n411#1:468,6\n411#1:457\n411#1:461\n*E\n"})
    public static final class C12769b extends tt8 implements qy6<cn2, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f82785b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e6b<Object> f82786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12769b(int i, e6b<Object> e6bVar) {
            super(1);
            this.f82785b = i;
            this.f82786c = e6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(cn2 cn2Var) {
            invoke2(cn2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb cn2 cn2Var) {
            int i;
            if (ssd.this.f82781f != this.f82785b || !md8.areEqual(this.f82786c, ssd.this.f82782g) || !(cn2Var instanceof hn2)) {
                return;
            }
            e6b<Object> e6bVar = this.f82786c;
            int i2 = this.f82785b;
            ssd ssdVar = ssd.this;
            long[] jArr = e6bVar.f105298a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = e6bVar.f105299b[i7];
                            boolean z = e6bVar.f105300c[i7] != i2;
                            if (z) {
                                hn2 hn2Var = (hn2) cn2Var;
                                hn2Var.removeObservation$runtime_release(obj, ssdVar);
                                if (obj instanceof z64) {
                                    hn2Var.removeDerivedStateObservation$runtime_release((z64) obj);
                                    s6b s6bVar = ssdVar.f82783h;
                                    if (s6bVar != null) {
                                        s6bVar.remove(obj);
                                    }
                                }
                            }
                            if (z) {
                                e6bVar.removeValueAt(i7);
                            }
                            i = 8;
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                } else {
                    i3++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ssd$c */
    @dwf({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,449:1\n89#2:450\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n*L\n202#1:450\n*E\n"})
    public static final class C12770c implements un2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ usd f82788b;

        public C12770c(usd usdVar) {
            this.f82788b = usdVar;
        }

        @Override // p000.un2
        public void dispose() {
            Object obj = tsd.f85748k;
            ssd ssdVar = ssd.this;
            usd usdVar = this.f82788b;
            synchronized (obj) {
                try {
                    if (md8.areEqual(ssdVar.f82780e, usdVar)) {
                        ssdVar.f82780e = null;
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ssd(@gib vsd vsdVar) {
        this.f82777b = vsdVar;
    }

    private final boolean checkDerivedStateChanged(z64<?> z64Var, s6b<z64<?>, Object> s6bVar) {
        md8.checkNotNull(z64Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        qtf<?> policy = z64Var.getPolicy();
        if (policy == null) {
            policy = stf.structuralEqualityPolicy();
        }
        return !policy.equivalent(z64Var.getCurrentRecord().getCurrentValue(), s6bVar.get(z64Var));
    }

    @tg5
    private static /* synthetic */ void getObserver$annotations() {
    }

    private final boolean getRereading() {
        return (this.f82776a & 32) != 0;
    }

    private final void setRereading(boolean z) {
        if (z) {
            this.f82776a |= 32;
        } else {
            this.f82776a &= -33;
        }
    }

    private final void setSkipped(boolean z) {
        if (z) {
            this.f82776a |= 16;
        } else {
            this.f82776a &= -17;
        }
    }

    public final void adoptedBy(@yfb vsd vsdVar) {
        this.f82777b = vsdVar;
    }

    public final void compose(@yfb zl2 zl2Var) {
        bth bthVar;
        gz6<? super zl2, ? super Integer, bth> gz6Var = this.f82779d;
        usd usdVar = this.f82780e;
        if (usdVar != null && gz6Var != null) {
            usdVar.onBeginScopeComposition(this);
            try {
                gz6Var.invoke(zl2Var, 1);
                return;
            } finally {
                usdVar.onEndScopeComposition(this);
            }
        }
        if (gz6Var != null) {
            gz6Var.invoke(zl2Var, 1);
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        if (bthVar == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    @gib
    public final qy6<cn2, bth> end(int i) {
        e6b<Object> e6bVar = this.f82782g;
        if (e6bVar == null || getSkipped$runtime_release()) {
            return null;
        }
        Object[] objArr = e6bVar.f105299b;
        int[] iArr = e6bVar.f105300c;
        long[] jArr = e6bVar.f105298a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        if (iArr[i5] != i) {
                            return new C12769b(i, e6bVar);
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return null;
                }
            }
            if (i2 == length) {
                return null;
            }
            i2++;
        }
    }

    @gib
    public final C5897fo getAnchor() {
        return this.f82778c;
    }

    public final boolean getCanRecompose() {
        return this.f82779d != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.f82776a & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.f82776a & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.f82776a & 64) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.f82776a & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.f82776a & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.f82776a & 1) != 0;
    }

    public final boolean getValid() {
        if (this.f82777b == null) {
            return false;
        }
        C5897fo c5897fo = this.f82778c;
        return c5897fo != null ? c5897fo.getValid() : false;
    }

    @Override // p000.rsd
    public void invalidate() {
        vsd vsdVar = this.f82777b;
        if (vsdVar != null) {
            vsdVar.invalidate(this, null);
        }
    }

    @yfb
    public final ie8 invalidateForResult(@gib Object obj) {
        ie8 ie8VarInvalidate;
        vsd vsdVar = this.f82777b;
        return (vsdVar == null || (ie8VarInvalidate = vsdVar.invalidate(this, obj)) == null) ? ie8.IGNORED : ie8VarInvalidate;
    }

    public final boolean isConditional() {
        return this.f82783h != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInvalidFor(@p000.gib java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            s6b<z64<?>, java.lang.Object> r3 = r0.f82783h
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof p000.z64
            if (r4 == 0) goto L18
            z64 r1 = (p000.z64) r1
            boolean r2 = r0.checkDerivedStateChanged(r1, r3)
            goto L72
        L18:
            boolean r4 = r1 instanceof p000.doe
            if (r4 == 0) goto L72
            doe r1 = (p000.doe) r1
            boolean r4 = r1.isNotEmpty()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.f30278b
            long[] r1 = r1.f30277a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof p000.z64
            if (r14 == 0) goto L72
            z64 r13 = (p000.z64) r13
            boolean r13 = r0.checkDerivedStateChanged(r13, r3)
            if (r13 == 0) goto L66
            goto L72
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            r2 = r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ssd.isInvalidFor(java.lang.Object):boolean");
    }

    @tg5
    @yfb
    public final un2 observe$runtime_release(@yfb usd usdVar) {
        synchronized (tsd.f85748k) {
            this.f82780e = usdVar;
            bth bthVar = bth.f14751a;
        }
        return new C12770c(usdVar);
    }

    public final void recordDerivedStateValue(@yfb z64<?> z64Var, @gib Object obj) {
        s6b<z64<?>, Object> s6bVar = this.f82783h;
        if (s6bVar == null) {
            s6bVar = new s6b<>(0, 1, null);
            this.f82783h = s6bVar;
        }
        s6bVar.set(z64Var, obj);
    }

    public final boolean recordRead(@yfb Object obj) {
        if (getRereading()) {
            return false;
        }
        e6b<Object> e6bVar = this.f82782g;
        if (e6bVar == null) {
            e6bVar = new e6b<>(0, 1, null);
            this.f82782g = e6bVar;
        }
        return e6bVar.put(obj, this.f82781f, -1) == this.f82781f;
    }

    public final void release() {
        vsd vsdVar = this.f82777b;
        if (vsdVar != null) {
            vsdVar.recomposeScopeReleased(this);
        }
        this.f82777b = null;
        this.f82782g = null;
        this.f82783h = null;
        usd usdVar = this.f82780e;
        if (usdVar != null) {
            usdVar.onScopeDisposed(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void rereadTrackedInstances() {
        /*
            r17 = this;
            r1 = r17
            vsd r0 = r1.f82777b
            if (r0 == 0) goto L60
            e6b<java.lang.Object> r2 = r1.f82782g
            if (r2 == 0) goto L60
            r3 = 1
            r1.setRereading(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.f105299b     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.f105300c     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.f105298a     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.recordReadOf(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.setRereading(r3)
            goto L60
        L5c:
            r1.setRereading(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ssd.rereadTrackedInstances():void");
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(@gib C5897fo c5897fo) {
        this.f82778c = c5897fo;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.f82776a |= 2;
        } else {
            this.f82776a &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.f82776a |= 4;
        } else {
            this.f82776a &= -5;
        }
    }

    public final void setForcedRecompose(boolean z) {
        if (z) {
            this.f82776a |= 64;
        } else {
            this.f82776a &= -65;
        }
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.f82776a |= 8;
        } else {
            this.f82776a &= -9;
        }
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.f82776a |= 1;
        } else {
            this.f82776a &= -2;
        }
    }

    public final void start(int i) {
        this.f82781f = i;
        setSkipped(false);
    }

    @Override // p000.are
    public void updateScope(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        this.f82779d = gz6Var;
    }
}
