package p000;

/* JADX INFO: loaded from: classes7.dex */
public class g40<T> {

    /* JADX INFO: renamed from: a */
    public final int f38404a;

    /* JADX INFO: renamed from: b */
    public final Object[] f38405b;

    /* JADX INFO: renamed from: c */
    public Object[] f38406c;

    /* JADX INFO: renamed from: d */
    public int f38407d;

    /* JADX INFO: renamed from: g40$a */
    public interface InterfaceC6115a<T> extends m8d<T> {
        @Override // p000.m8d
        boolean test(T t);
    }

    public g40(int i) {
        this.f38404a = i;
        Object[] objArr = new Object[i + 1];
        this.f38405b = objArr;
        this.f38406c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean accept(p000.ycg<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f38405b
            int r1 = r4.f38404a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = p000.ehb.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g40.accept(ycg):boolean");
    }

    public void add(T t) {
        int i = this.f38404a;
        int i2 = this.f38407d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f38406c[i] = objArr;
            this.f38406c = objArr;
            i2 = 0;
        }
        this.f38406c[i2] = t;
        this.f38407d = i2 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void forEachWhile(p000.g40.InterfaceC6115a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f38405b
            int r1 = r4.f38404a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g40.forEachWhile(g40$a):void");
    }

    public void setFirst(T t) {
        this.f38405b[0] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean accept(p000.oxb<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f38405b
            int r1 = r4.f38404a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = p000.ehb.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g40.accept(oxb):boolean");
    }

    public <S> void forEachWhile(S s, m11<? super S, ? super T> m11Var) throws Exception {
        Object[] objArr = this.f38405b;
        int i = this.f38404a;
        while (true) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null || m11Var.test(s, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i];
        }
    }
}
