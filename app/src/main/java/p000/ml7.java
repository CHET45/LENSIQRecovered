package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ml7 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final cug f61401a;

    /* JADX INFO: renamed from: b */
    public int f61402b = -1;

    /* JADX INFO: renamed from: c */
    public float f61403c;

    public ml7(@yfb cug cugVar) {
        this.f61401a = cugVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float get(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L1f
            cug r2 = r5.f61401a
            android.text.Layout r2 = r2.getLayout()
            int r2 = p000.kv8.getLineForOffset(r2, r6, r7)
            cug r3 = r5.f61401a
            int r3 = r3.getLineStart(r2)
            cug r4 = r5.f61401a
            int r2 = r4.getLineEnd(r2)
            if (r6 == r3) goto L21
            if (r6 != r2) goto L1f
            goto L21
        L1f:
            r2 = r1
            goto L22
        L21:
            r2 = r0
        L22:
            int r3 = r6 * 4
            if (r9 == 0) goto L2a
            if (r2 == 0) goto L2f
            r0 = r1
            goto L2f
        L2a:
            if (r2 == 0) goto L2e
            r0 = 2
            goto L2f
        L2e:
            r0 = 3
        L2f:
            int r3 = r3 + r0
            int r0 = r5.f61402b
            if (r0 != r3) goto L37
            float r6 = r5.f61403c
            return r6
        L37:
            if (r9 == 0) goto L40
            cug r9 = r5.f61401a
            float r6 = r9.getPrimaryHorizontal(r6, r7)
            goto L46
        L40:
            cug r9 = r5.f61401a
            float r6 = r9.getSecondaryHorizontal(r6, r7)
        L46:
            if (r8 == 0) goto L4c
            r5.f61402b = r3
            r5.f61403c = r6
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ml7.get(int, boolean, boolean, boolean):float");
    }

    @yfb
    public final cug getLayout() {
        return this.f61401a;
    }

    public final float getPrimaryDownstream(int i) {
        return get(i, false, false, true);
    }

    public final float getPrimaryUpstream(int i) {
        return get(i, true, true, true);
    }

    public final float getSecondaryDownstream(int i) {
        return get(i, false, false, false);
    }

    public final float getSecondaryUpstream(int i) {
        return get(i, true, true, false);
    }
}
