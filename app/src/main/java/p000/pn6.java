package p000;

import androidx.compose.p002ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,102:1\n1208#2:103\n1187#2,2:104\n1#3:106\n728#4,2:107\n728#4,2:109\n460#4,11:145\n66#5,9:111\n405#6,3:120\n363#6,6:123\n373#6,3:130\n376#6,2:134\n409#6,2:136\n379#6,6:138\n411#6:144\n1810#7:129\n1672#7:133\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n31#1:103\n31#1:104,2\n46#1:107,2\n63#1:109,2\n98#1:145,11\n79#1:111,9\n87#1:120,3\n87#1:123,6\n87#1:130,3\n87#1:134,2\n87#1:136,2\n87#1:138,6\n87#1:144\n87#1:129\n87#1:133\n*E\n"})
@e0g(parameters = 0)
public final class pn6 {

    /* JADX INFO: renamed from: d */
    public static final int f71485d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final s6b<FocusTargetNode, jn6> f71486a = coe.mutableScatterMapOf();

    /* JADX INFO: renamed from: b */
    @yfb
    public final f7b<ny6<bth>> f71487b = new f7b<>(new ny6[16], 0);

    /* JADX INFO: renamed from: c */
    public boolean f71488c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.f71488c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        this.f71486a.clear();
        int i = 0;
        this.f71488c = false;
        f7b<ny6<bth>> f7bVar = this.f71487b;
        int size = f7bVar.getSize();
        if (size > 0) {
            ny6<bth>[] content = f7bVar.getContent();
            do {
                content[i].invoke();
                i++;
            } while (i < size);
        }
        this.f71487b.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void commitTransaction() {
        /*
            r14 = this;
            s6b<androidx.compose.ui.focus.FocusTargetNode, jn6> r0 = r14.f71486a
            java.lang.Object[] r1 = r0.f14265b
            long[] r0 = r0.f14264a
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L47
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.p002ui.focus.FocusTargetNode) r10
            r10.commitFocusState$ui_release()
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            s6b<androidx.compose.ui.focus.FocusTargetNode, jn6> r0 = r14.f71486a
            r0.clear()
            r14.f71488c = r3
            f7b<ny6<bth>> r0 = r14.f71487b
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pn6.commitTransaction():void");
    }

    public static /* synthetic */ Object withExistingTransaction$default(pn6 pn6Var, ny6 ny6Var, ny6 ny6Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ny6Var = null;
        }
        if (ny6Var != null) {
            pn6Var.f71487b.add(ny6Var);
        }
        if (pn6Var.f71488c) {
            return ny6Var2.invoke();
        }
        try {
            pn6Var.beginTransaction();
            return ny6Var2.invoke();
        } finally {
            o28.finallyStart(1);
            pn6Var.commitTransaction();
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withNewTransaction$default(pn6 pn6Var, ny6 ny6Var, ny6 ny6Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ny6Var = null;
        }
        try {
            if (pn6Var.f71488c) {
                pn6Var.cancelTransaction();
            }
            pn6Var.beginTransaction();
            if (ny6Var != null) {
                pn6Var.f71487b.add(ny6Var);
            }
            Object objInvoke = ny6Var2.invoke();
            o28.finallyStart(1);
            pn6Var.commitTransaction();
            o28.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            o28.finallyStart(1);
            pn6Var.commitTransaction();
            o28.finallyEnd(1);
            throw th;
        }
    }

    @gib
    public final jn6 getUncommittedFocusState(@yfb FocusTargetNode focusTargetNode) {
        return this.f71486a.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(@yfb FocusTargetNode focusTargetNode, @gib jn6 jn6Var) {
        s6b<FocusTargetNode, jn6> s6bVar = this.f71486a;
        if (jn6Var != null) {
            s6bVar.set(focusTargetNode, jn6Var);
        } else {
            g28.throwIllegalStateExceptionForNullCheck("requires a non-null focus state");
            throw new us8();
        }
    }

    public final <T> T withExistingTransaction(@gib ny6<bth> ny6Var, @yfb ny6<? extends T> ny6Var2) {
        if (ny6Var != null) {
            this.f71487b.add(ny6Var);
        }
        if (this.f71488c) {
            return ny6Var2.invoke();
        }
        try {
            beginTransaction();
            return ny6Var2.invoke();
        } finally {
            o28.finallyStart(1);
            commitTransaction();
            o28.finallyEnd(1);
        }
    }

    public final <T> T withNewTransaction(@gib ny6<bth> ny6Var, @yfb ny6<? extends T> ny6Var2) {
        try {
            if (this.f71488c) {
                cancelTransaction();
            }
            beginTransaction();
            if (ny6Var != null) {
                this.f71487b.add(ny6Var);
            }
            T tInvoke = ny6Var2.invoke();
            o28.finallyStart(1);
            commitTransaction();
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            o28.finallyStart(1);
            commitTransaction();
            o28.finallyEnd(1);
            throw th;
        }
    }
}
