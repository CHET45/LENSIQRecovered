package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class v9d extends Exception {

    /* JADX INFO: renamed from: a */
    public final nfa f90402a;

    public v9d(nfa nfaVar, @hib String str, @hib Throwable th) {
        super(str, th);
        this.f90402a = nfaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r3 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean errorInfoEquals(@p000.hib p000.v9d r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L51
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L31
            if (r3 == 0) goto L31
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 != 0) goto L22
            return r1
        L22:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L31:
            if (r2 != 0) goto L51
            if (r3 == 0) goto L36
            goto L51
        L36:
            nfa r2 = r6.f90402a
            nfa r3 = r7.f90402a
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L4f
            java.lang.String r2 = r6.getMessage()
            java.lang.String r7 = r7.getMessage()
            boolean r7 = java.util.Objects.equals(r2, r7)
            if (r7 == 0) goto L4f
            goto L50
        L4f:
            r0 = r1
        L50:
            return r0
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v9d.errorInfoEquals(v9d):boolean");
    }
}
