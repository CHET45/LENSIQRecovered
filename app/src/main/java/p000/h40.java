package p000;

/* JADX INFO: loaded from: classes7.dex */
public class h40<T> {

    /* JADX INFO: renamed from: a */
    public final int f42287a;

    /* JADX INFO: renamed from: b */
    public final Object[] f42288b;

    /* JADX INFO: renamed from: c */
    public Object[] f42289c;

    /* JADX INFO: renamed from: d */
    public int f42290d;

    /* JADX INFO: renamed from: h40$a */
    public interface InterfaceC6699a<T> extends n8d<T> {
        @Override // p000.n8d
        boolean test(T t);
    }

    public h40(int capacity) {
        this.f42287a = capacity;
        Object[] objArr = new Object[capacity + 1];
        this.f42288b = objArr;
        this.f42289c = objArr;
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
            java.lang.Object[] r0 = r4.f42288b
            int r1 = r4.f42287a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = p000.fhb.acceptFull(r3, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.h40.accept(ycg):boolean");
    }

    public void add(T value) {
        int i = this.f42287a;
        int i2 = this.f42290d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f42289c[i] = objArr;
            this.f42289c = objArr;
            i2 = 0;
        }
        this.f42289c[i2] = value;
        this.f42290d = i2 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void forEachWhile(p000.h40.InterfaceC6699a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f42288b
            int r1 = r4.f42287a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.h40.forEachWhile(h40$a):void");
    }

    public void setFirst(T value) {
        this.f42288b[0] = value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean accept(p000.pxb<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f42288b
            int r1 = r4.f42287a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = p000.fhb.acceptFull(r3, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.h40.accept(pxb):boolean");
    }

    public <S> void forEachWhile(S state, l11<? super S, ? super T> consumer) throws Throwable {
        Object[] objArr = this.f42288b;
        int i = this.f42287a;
        while (true) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null || consumer.test(state, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i];
        }
    }
}
