package p000;

import p000.e13;
import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
public final class j13 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f49326a = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final e13 foldCopies(e13 e13Var, e13 e13Var2, final boolean z) {
        boolean zHasCopyableElements = hasCopyableElements(e13Var);
        boolean zHasCopyableElements2 = hasCopyableElements(e13Var2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return e13Var.plus(e13Var2);
        }
        final jvd.C8121h c8121h = new jvd.C8121h();
        c8121h.f52110a = e13Var2;
        a05 a05Var = a05.f2a;
        e13 e13Var3 = (e13) e13Var.fold(a05Var, new gz6() { // from class: h13
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return j13.foldCopies$lambda$1(c8121h, z, (e13) obj, (e13.InterfaceC5040b) obj2);
            }
        });
        if (zHasCopyableElements2) {
            c8121h.f52110a = ((e13) c8121h.f52110a).fold(a05Var, new gz6() { // from class: i13
                @Override // p000.gz6
                public final Object invoke(Object obj, Object obj2) {
                    return j13.foldCopies$lambda$2((e13) obj, (e13.InterfaceC5040b) obj2);
                }
            });
        }
        return e13Var3.plus((e13) c8121h.f52110a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, e13] */
    public static final e13 foldCopies$lambda$1(jvd.C8121h c8121h, boolean z, e13 e13Var, e13.InterfaceC5040b interfaceC5040b) {
        if (!(interfaceC5040b instanceof g03)) {
            return e13Var.plus(interfaceC5040b);
        }
        e13.InterfaceC5040b interfaceC5040b2 = ((e13) c8121h.f52110a).get(interfaceC5040b.getKey());
        if (interfaceC5040b2 == null) {
            return e13Var.plus(z ? ((g03) interfaceC5040b).copyForChild() : (g03) interfaceC5040b);
        }
        c8121h.f52110a = ((e13) c8121h.f52110a).minusKey(interfaceC5040b.getKey());
        return e13Var.plus(((g03) interfaceC5040b).mergeForChild(interfaceC5040b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e13 foldCopies$lambda$2(e13 e13Var, e13.InterfaceC5040b interfaceC5040b) {
        return interfaceC5040b instanceof g03 ? e13Var.plus(((g03) interfaceC5040b).copyForChild()) : e13Var.plus(interfaceC5040b);
    }

    @gib
    public static final String getCoroutineName(@yfb e13 e13Var) {
        return null;
    }

    private static final boolean hasCopyableElements(e13 e13Var) {
        return ((Boolean) e13Var.fold(Boolean.FALSE, new gz6() { // from class: g13
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(j13.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (e13.InterfaceC5040b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z, e13.InterfaceC5040b interfaceC5040b) {
        return z || (interfaceC5040b instanceof g03);
    }

    @wg5
    @yfb
    public static final e13 newCoroutineContext(@yfb x13 x13Var, @yfb e13 e13Var) {
        e13 e13VarFoldCopies = foldCopies(x13Var.getCoroutineContext(), e13Var, true);
        return (e13VarFoldCopies == df4.getDefault() || e13VarFoldCopies.get(dz2.f31343s) != null) ? e13VarFoldCopies : e13VarFoldCopies.plus(df4.getDefault());
    }

    @gib
    public static final esh<?> undispatchedCompletion(@yfb a23 a23Var) {
        while (!(a23Var instanceof xe4) && (a23Var = a23Var.getCallerFrame()) != null) {
            if (a23Var instanceof esh) {
                return (esh) a23Var;
            }
        }
        return null;
    }

    @gib
    public static final esh<?> updateUndispatchedCompletion(@yfb zy2<?> zy2Var, @yfb e13 e13Var, @gib Object obj) {
        if (!(zy2Var instanceof a23) || e13Var.get(gsh.f40953a) == null) {
            return null;
        }
        esh<?> eshVarUndispatchedCompletion = undispatchedCompletion((a23) zy2Var);
        if (eshVarUndispatchedCompletion != null) {
            eshVarUndispatchedCompletion.saveThreadContext(e13Var, obj);
        }
        return eshVarUndispatchedCompletion;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T withContinuationContext(@p000.yfb p000.zy2<?> r2, @p000.gib java.lang.Object r3, @p000.yfb p000.ny6<? extends T> r4) {
        /*
            e13 r0 = r2.getContext()
            java.lang.Object r3 = p000.sxg.updateThreadContext(r0, r3)
            qhg r1 = p000.sxg.f83208a
            if (r3 == r1) goto L11
            esh r2 = updateUndispatchedCompletion(r2, r0, r3)
            goto L12
        L11:
            r2 = 0
        L12:
            r1 = 1
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L29
            p000.o28.finallyStart(r1)
            if (r2 == 0) goto L22
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L25
        L22:
            p000.sxg.restoreThreadContext(r0, r3)
        L25:
            p000.o28.finallyEnd(r1)
            return r4
        L29:
            r4 = move-exception
            p000.o28.finallyStart(r1)
            if (r2 == 0) goto L35
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L38
        L35:
            p000.sxg.restoreThreadContext(r0, r3)
        L38:
            p000.o28.finallyEnd(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j13.withContinuationContext(zy2, java.lang.Object, ny6):java.lang.Object");
    }

    public static final <T> T withCoroutineContext(@yfb e13 e13Var, @gib Object obj, @yfb ny6<? extends T> ny6Var) {
        Object objUpdateThreadContext = sxg.updateThreadContext(e13Var, obj);
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            sxg.restoreThreadContext(e13Var, objUpdateThreadContext);
            o28.finallyEnd(1);
        }
    }

    @la8
    @yfb
    public static final e13 newCoroutineContext(@yfb e13 e13Var, @yfb e13 e13Var2) {
        return !hasCopyableElements(e13Var2) ? e13Var.plus(e13Var2) : foldCopies(e13Var, e13Var2, false);
    }
}
