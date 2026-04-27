package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,488:1\n1223#2,6:489\n1223#2,6:495\n1223#2,6:501\n1223#2,6:507\n1223#2,6:513\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:489,6\n37#1:495,6\n51#1:501,6\n69#1:507,6\n89#1:513,6\n*E\n"})
public final class dl2 {
    @hk2
    public static final /* synthetic */ <T, E extends p40<?>> void ComposeNode(ny6<? extends T> ny6Var, qy6<? super twh<T>, bth> qy6Var, zl2 zl2Var, int i) {
        p40<?> applier = zl2Var.getApplier();
        md8.reifiedOperationMarker(3, k95.f53029S4);
        if (applier == null) {
            invalidApplier();
        }
        zl2Var.startNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(ny6Var);
        } else {
            zl2Var.useNode();
        }
        qy6Var.invoke(twh.m32448boximpl(twh.m32449constructorimpl(zl2Var)));
        zl2Var.endNode();
    }

    @hk2
    public static final /* synthetic */ <T, E extends p40<?>> void ReusableComposeNode(ny6<? extends T> ny6Var, qy6<? super twh<T>, bth> qy6Var, zl2 zl2Var, int i) {
        p40<?> applier = zl2Var.getApplier();
        md8.reifiedOperationMarker(3, k95.f53029S4);
        if (applier == null) {
            invalidApplier();
        }
        zl2Var.startReusableNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(ny6Var);
        } else {
            zl2Var.useNode();
        }
        qy6Var.invoke(twh.m32448boximpl(twh.m32449constructorimpl(zl2Var)));
        zl2Var.endNode();
    }

    @hk2
    public static final void ReusableContent(@gib Object obj, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        zl2Var.startReusableGroup(gm2.f40180q, obj);
        gz6Var.invoke(zl2Var, Integer.valueOf((i >> 3) & 14));
        zl2Var.endReusableGroup();
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        zl2Var.startReusableGroup(gm2.f40180q, Boolean.valueOf(z));
        boolean zChanged = zl2Var.changed(z);
        zl2Var.startReplaceGroup(-869707859);
        if (z) {
            gz6Var.invoke(zl2Var, Integer.valueOf((i >> 3) & 14));
        } else {
            zl2Var.deactivateToEndGroup(zChanged);
        }
        zl2Var.endReplaceGroup();
        zl2Var.endReusableGroup();
    }

    @xn8(name = "getCurrentComposer")
    @wqd
    @yfb
    @hk2
    public static final zl2 getCurrentComposer(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:187)");
        }
        throw new wfb("Implemented as an intrinsic");
    }

    @xn8(name = "getCurrentCompositeKeyHash")
    @hk2
    public static final int getCurrentCompositeKeyHash(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int compoundKeyHash = zl2Var.getCompoundKeyHash();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @yfb
    @xn8(name = "getCurrentCompositionLocalContext")
    @hk2
    public static final on2 getCurrentCompositionLocalContext(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:211)");
        }
        on2 on2Var = new on2(zl2Var.buildContext().getCompositionLocalScope$runtime_release());
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return on2Var;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @xn8(name = "getCurrentRecomposeScope")
    @wqd
    @yfb
    @hk2
    public static final rsd getCurrentRecomposeScope(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        rsd recomposeScope = zl2Var.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        zl2Var.recordUsed(recomposeScope);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return recomposeScope;
    }

    @yjd
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final <T> T key(@yfb Object[] objArr, @yfb gz6<? super zl2, ? super Integer, ? extends T> gz6Var, @gib zl2 zl2Var, int i) {
        return gz6Var.invoke(zl2Var, Integer.valueOf((i >> 3) & 14));
    }

    @hk2
    public static final <T> T remember(@gib Object obj, @yfb ny6<? extends T> ny6Var, @gib zl2 zl2Var, int i) {
        boolean zChanged = zl2Var.changed(obj);
        T t = (T) zl2Var.rememberedValue();
        if (!zChanged && t != zl2.f105372a.getEmpty()) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        zl2Var.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    @yfb
    @hk2
    public static final dn2 rememberCompositionContext(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        dn2 dn2VarBuildContext = zl2Var.buildContext();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return dn2VarBuildContext;
    }

    @hk2
    public static final <T> T remember(@gib Object obj, @gib Object obj2, @yfb ny6<? extends T> ny6Var, @gib zl2 zl2Var, int i) {
        boolean zChanged = zl2Var.changed(obj) | zl2Var.changed(obj2);
        T t = (T) zl2Var.rememberedValue();
        if (!zChanged && t != zl2.f105372a.getEmpty()) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        zl2Var.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends p40<?>> void ComposeNode(ny6<? extends T> ny6Var, qy6<? super twh<T>, bth> qy6Var, gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i) {
        p40<?> applier = zl2Var.getApplier();
        md8.reifiedOperationMarker(3, k95.f53029S4);
        if (applier == null) {
            invalidApplier();
        }
        zl2Var.startNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(ny6Var);
        } else {
            zl2Var.useNode();
        }
        qy6Var.invoke(twh.m32448boximpl(twh.m32449constructorimpl(zl2Var)));
        gz6Var.invoke(zl2Var, Integer.valueOf((i >> 6) & 14));
        zl2Var.endNode();
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends p40<?>> void ReusableComposeNode(ny6<? extends T> ny6Var, qy6<? super twh<T>, bth> qy6Var, gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i) {
        p40<?> applier = zl2Var.getApplier();
        md8.reifiedOperationMarker(3, k95.f53029S4);
        if (applier == null) {
            invalidApplier();
        }
        zl2Var.startReusableNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(ny6Var);
        } else {
            zl2Var.useNode();
        }
        qy6Var.invoke(twh.m32448boximpl(twh.m32449constructorimpl(zl2Var)));
        gz6Var.invoke(zl2Var, Integer.valueOf((i >> 6) & 14));
        zl2Var.endNode();
    }

    @hk2
    public static final <T> T remember(@gib Object obj, @gib Object obj2, @gib Object obj3, @yfb ny6<? extends T> ny6Var, @gib zl2 zl2Var, int i) {
        boolean zChanged = zl2Var.changed(obj) | zl2Var.changed(obj2) | zl2Var.changed(obj3);
        T t = (T) zl2Var.rememberedValue();
        if (!zChanged && t != zl2.f105372a.getEmpty()) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        zl2Var.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends p40<?>> void ComposeNode(ny6<? extends T> ny6Var, qy6<? super twh<T>, bth> qy6Var, kz6<? super pqf<T>, ? super zl2, ? super Integer, bth> kz6Var, gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i) {
        p40<?> applier = zl2Var.getApplier();
        md8.reifiedOperationMarker(3, k95.f53029S4);
        if (applier == null) {
            invalidApplier();
        }
        zl2Var.startNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(ny6Var);
        } else {
            zl2Var.useNode();
        }
        qy6Var.invoke(twh.m32448boximpl(twh.m32449constructorimpl(zl2Var)));
        kz6Var.invoke(pqf.m31854boximpl(pqf.m31855constructorimpl(zl2Var)), zl2Var, Integer.valueOf((i >> 3) & 112));
        zl2Var.startReplaceableGroup(2058660585);
        gz6Var.invoke(zl2Var, Integer.valueOf((i >> 9) & 14));
        zl2Var.endReplaceableGroup();
        zl2Var.endNode();
    }

    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends p40<?>> void ReusableComposeNode(ny6<? extends T> ny6Var, qy6<? super twh<T>, bth> qy6Var, kz6<? super pqf<T>, ? super zl2, ? super Integer, bth> kz6Var, gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i) {
        p40<?> applier = zl2Var.getApplier();
        md8.reifiedOperationMarker(3, k95.f53029S4);
        if (applier == null) {
            invalidApplier();
        }
        zl2Var.startReusableNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(ny6Var);
        } else {
            zl2Var.useNode();
        }
        qy6Var.invoke(twh.m32448boximpl(twh.m32449constructorimpl(zl2Var)));
        kz6Var.invoke(pqf.m31854boximpl(pqf.m31855constructorimpl(zl2Var)), zl2Var, Integer.valueOf((i >> 3) & 112));
        zl2Var.startReplaceableGroup(2058660585);
        gz6Var.invoke(zl2Var, Integer.valueOf((i >> 9) & 14));
        zl2Var.endReplaceableGroup();
        zl2Var.endNode();
    }

    @hk2
    public static final <T> T remember(@yfb Object[] objArr, @yfb ny6<? extends T> ny6Var, @gib zl2 zl2Var, int i) {
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= zl2Var.changed(obj);
        }
        T t = (T) zl2Var.rememberedValue();
        if (!zChanged && t != zl2.f105372a.getEmpty()) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        zl2Var.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    @hk2
    public static final <T> T remember(@yfb ny6<? extends T> ny6Var, @gib zl2 zl2Var, int i) {
        T t = (T) zl2Var.rememberedValue();
        if (t != zl2.f105372a.getEmpty()) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        zl2Var.updateRememberedValue(tInvoke);
        return tInvoke;
    }
}
