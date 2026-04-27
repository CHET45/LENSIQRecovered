package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public abstract class zhd<T> extends kn2<T> {

    /* JADX INFO: renamed from: c */
    public static final int f105099c = 0;

    public zhd(@yfb ny6<? extends T> ny6Var) {
        super(ny6Var, null);
    }

    private final l2i<T> valueHolderOf(did<T> didVar) {
        if (!didVar.isDynamic$runtime_release()) {
            return didVar.getCompute$runtime_release() != null ? new uo2(didVar.getCompute$runtime_release()) : didVar.getState$runtime_release() != null ? new av4(didVar.getState$runtime_release()) : new b4g(didVar.getEffectiveValue$runtime_release());
        }
        z6b<T> state$runtime_release = didVar.getState$runtime_release();
        if (state$runtime_release == null) {
            T value = didVar.getValue();
            qtf<T> mutationPolicy$runtime_release = didVar.getMutationPolicy$runtime_release();
            if (mutationPolicy$runtime_release == null) {
                mutationPolicy$runtime_release = stf.structuralEqualityPolicy();
            }
            state$runtime_release = stf.mutableStateOf(value, mutationPolicy$runtime_release);
        }
        return new av4(state$runtime_release);
    }

    @yfb
    public abstract did<T> defaultProvidedValue$runtime_release(T t);

    @yfb
    public final did<T> provides(T t) {
        return defaultProvidedValue$runtime_release(t);
    }

    @yfb
    public final did<T> providesComputed(@yfb qy6<? super ln2, ? extends T> qy6Var) {
        return new did<>(this, null, false, null, null, qy6Var, false);
    }

    @yfb
    public final did<T> providesDefault(T t) {
        return defaultProvidedValue$runtime_release(t).ifNotAlreadyProvided$runtime_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 java.lang.Object) = (r5v5 java.lang.Object), (r5v6 java.lang.Object) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.kn2
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.l2i<T> updatedStateOf$runtime_release(@p000.yfb p000.did<T> r4, @p000.gib p000.l2i<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof p000.av4
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.isDynamic$runtime_release()
            if (r0 == 0) goto L47
            r1 = r5
            av4 r1 = (p000.av4) r1
            z6b r5 = r1.getState()
            java.lang.Object r0 = r4.getEffectiveValue$runtime_release()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof p000.b4g
            if (r0 == 0) goto L36
            boolean r0 = r4.isStatic$runtime_release()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.getEffectiveValue$runtime_release()
            b4g r5 = (p000.b4g) r5
            java.lang.Object r2 = r5.getValue()
            boolean r0 = p000.md8.areEqual(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof p000.uo2
            if (r0 == 0) goto L47
            qy6 r0 = r4.getCompute$runtime_release()
            uo2 r5 = (p000.uo2) r5
            qy6 r2 = r5.getCompute()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4d
            l2i r1 = r3.valueHolderOf(r4)
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zhd.updatedStateOf$runtime_release(did, l2i):l2i");
    }
}
