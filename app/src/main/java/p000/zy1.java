package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nChildLayerDependenciesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,117:1\n267#2,4:118\n237#2,7:122\n248#2,3:130\n251#2,2:134\n272#2,2:136\n254#2,6:138\n274#2:144\n267#2,4:152\n237#2,7:156\n248#2,3:164\n251#2,2:168\n272#2,2:170\n254#2,6:172\n274#2:178\n1810#3:129\n1672#3:133\n1810#3:163\n1672#3:167\n33#4,7:145\n*S KotlinDebug\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n*L\n63#1:118,4\n63#1:122,7\n63#1:130,3\n63#1:134,2\n63#1:136,2\n63#1:138,6\n63#1:144\n112#1:152,4\n112#1:156,7\n112#1:164,3\n112#1:168,2\n112#1:170,2\n112#1:172,6\n112#1:178\n63#1:129\n63#1:133\n112#1:163\n112#1:167\n73#1:145,7\n*E\n"})
public final class zy1 {

    /* JADX INFO: renamed from: a */
    @gib
    public u97 f106413a;

    /* JADX INFO: renamed from: b */
    @gib
    public u97 f106414b;

    /* JADX INFO: renamed from: c */
    @gib
    public u6b<u97> f106415c;

    /* JADX INFO: renamed from: d */
    @gib
    public u6b<u97> f106416d;

    /* JADX INFO: renamed from: e */
    public boolean f106417e;

    public final boolean onDependencyAdded(@yfb u97 u97Var) {
        if (!this.f106417e) {
            f28.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        u6b<u97> u6bVar = this.f106415c;
        if (u6bVar != null) {
            md8.checkNotNull(u6bVar);
            u6bVar.add(u97Var);
        } else if (this.f106413a != null) {
            u6b<u97> u6bVarMutableScatterSetOf = eoe.mutableScatterSetOf();
            u97 u97Var2 = this.f106413a;
            md8.checkNotNull(u97Var2);
            u6bVarMutableScatterSetOf.add(u97Var2);
            u6bVarMutableScatterSetOf.add(u97Var);
            this.f106415c = u6bVarMutableScatterSetOf;
            this.f106413a = null;
        } else {
            this.f106413a = u97Var;
        }
        u6b<u97> u6bVar2 = this.f106416d;
        if (u6bVar2 != null) {
            md8.checkNotNull(u6bVar2);
            return !u6bVar2.remove(u97Var);
        }
        if (this.f106414b != u97Var) {
            return true;
        }
        this.f106414b = null;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void removeDependencies(@p000.yfb p000.qy6<? super p000.u97, p000.bth> r18) {
        /*
            r17 = this;
            r0 = r18
            u97 r1 = access$getDependency$p(r17)
            if (r1 == 0) goto L12
            r0.invoke(r1)
            r1 = 0
            r2 = r17
            access$setDependency$p(r2, r1)
            goto L14
        L12:
            r2 = r17
        L14:
            u6b r1 = access$getDependenciesSet$p(r17)
            if (r1 == 0) goto L60
            java.lang.Object[] r3 = r1.f30278b
            long[] r4 = r1.f30277a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5d
            r6 = 0
            r7 = r6
        L25:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L3f:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r0.invoke(r13)
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r5) goto L5d
            int r7 = r7 + 1
            goto L25
        L5d:
            r1.clear()
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zy1.removeDependencies(qy6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void withTracking(@p000.yfb p000.qy6<? super p000.u97, p000.bth> r18, @p000.yfb p000.ny6<p000.bth> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            u97 r2 = access$getDependency$p(r17)
            access$setOldDependency$p(r0, r2)
            u6b r2 = access$getDependenciesSet$p(r17)
            if (r2 == 0) goto L2a
            boolean r3 = r2.isNotEmpty()
            if (r3 == 0) goto L2a
            u6b r3 = access$getOldDependenciesSet$p(r17)
            if (r3 != 0) goto L24
            u6b r3 = p000.eoe.mutableScatterSetOf()
            access$setOldDependenciesSet$p(r0, r3)
        L24:
            r3.addAll(r2)
            r2.clear()
        L2a:
            r2 = 1
            access$setTrackingInProgress$p(r0, r2)
            r19.invoke()
            r2 = 0
            access$setTrackingInProgress$p(r0, r2)
            u97 r3 = access$getOldDependency$p(r17)
            if (r3 == 0) goto L3e
            r1.invoke(r3)
        L3e:
            u6b r3 = access$getOldDependenciesSet$p(r17)
            if (r3 == 0) goto L8f
            boolean r4 = r3.isNotEmpty()
            if (r4 == 0) goto L8f
            java.lang.Object[] r4 = r3.f30278b
            long[] r5 = r3.f30277a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L8c
            r7 = r2
        L54:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L87
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r2
        L6e:
            if (r12 >= r10) goto L85
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L81
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            r1.invoke(r13)
        L81:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L6e
        L85:
            if (r10 != r11) goto L8c
        L87:
            if (r7 == r6) goto L8c
            int r7 = r7 + 1
            goto L54
        L8c:
            r3.clear()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zy1.withTracking(qy6, ny6):void");
    }
}
