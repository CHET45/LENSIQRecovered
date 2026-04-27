package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class fuf<T> {

    /* JADX INFO: renamed from: d */
    public static final int f37788d = 8;

    /* JADX INFO: renamed from: a */
    public int f37789a;

    /* JADX INFO: renamed from: b */
    @yfb
    public int[] f37790b = new int[16];

    /* JADX INFO: renamed from: c */
    @yfb
    public dii<T>[] f37791c = new dii[16];

    private final int find(T t, int i) {
        int i2 = this.f37789a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f37790b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    dii<T> diiVar = this.f37791c[i4];
                    return t == (diiVar != null ? diiVar.get() : null) ? i4 : findExactIndex(i4, t, i);
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f37789a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f37790b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f37791c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f37789a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int findExactIndex(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f37790b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            dii<T>[] r2 = r3.f37791c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f37789a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f37790b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            dii<T>[] r2 = r3.f37791c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f37789a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fuf.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean add(@yfb T t) {
        int iFind;
        int i = this.f37789a;
        int iIdentityHashCode = C5737fe.identityHashCode(t);
        if (i > 0) {
            iFind = find(t, iIdentityHashCode);
            if (iFind >= 0) {
                return false;
            }
        } else {
            iFind = -1;
        }
        int i2 = -(iFind + 1);
        dii<T>[] diiVarArr = this.f37791c;
        int length = diiVarArr.length;
        if (i == length) {
            int i3 = length * 2;
            dii<T>[] diiVarArr2 = new dii[i3];
            int[] iArr = new int[i3];
            int i4 = i2 + 1;
            u70.copyInto(diiVarArr, diiVarArr2, i4, i2, i);
            u70.copyInto$default(this.f37791c, diiVarArr2, 0, 0, i2, 6, (Object) null);
            u70.copyInto(this.f37790b, iArr, i4, i2, i);
            u70.copyInto$default(this.f37790b, iArr, 0, 0, i2, 6, (Object) null);
            this.f37791c = diiVarArr2;
            this.f37790b = iArr;
        } else {
            int i5 = i2 + 1;
            u70.copyInto(diiVarArr, diiVarArr, i5, i2, i);
            int[] iArr2 = this.f37790b;
            u70.copyInto(iArr2, iArr2, i5, i2, i);
        }
        this.f37791c[i2] = new dii<>(t);
        this.f37790b[i2] = iIdentityHashCode;
        this.f37789a++;
        return true;
    }

    @yfb
    public final int[] getHashes$runtime_release() {
        return this.f37790b;
    }

    public final int getSize$runtime_release() {
        return this.f37789a;
    }

    @yfb
    public final dii<T>[] getValues$runtime_release() {
        return this.f37791c;
    }

    @dpg
    public final boolean isValid$runtime_release() {
        dii<T> diiVar;
        int i = this.f37789a;
        dii<T>[] diiVarArr = this.f37791c;
        int[] iArr = this.f37790b;
        int length = diiVarArr.length;
        if (i > length) {
            return false;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            if (i4 < i2 || (diiVar = diiVarArr[i3]) == null) {
                return false;
            }
            T t = diiVar.get();
            if (t != null && i4 != C5737fe.identityHashCode(t)) {
                return false;
            }
            i3++;
            i2 = i4;
        }
        while (i < length) {
            if (iArr[i] != 0 || diiVarArr[i] != null) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final void removeIf(@yfb qy6<? super T, Boolean> qy6Var) {
        int size$runtime_release = getSize$runtime_release();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size$runtime_release) {
                break;
            }
            dii<T> diiVar = getValues$runtime_release()[i];
            T t = diiVar != null ? diiVar.get() : null;
            if (t != null && !qy6Var.invoke(t).booleanValue()) {
                if (i2 != i) {
                    getValues$runtime_release()[i2] = diiVar;
                    getHashes$runtime_release()[i2] = getHashes$runtime_release()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size$runtime_release; i3++) {
            getValues$runtime_release()[i3] = null;
            getHashes$runtime_release()[i3] = 0;
        }
        if (i2 != size$runtime_release) {
            setSize$runtime_release(i2);
        }
    }

    public final void setHashes$runtime_release(@yfb int[] iArr) {
        this.f37790b = iArr;
    }

    public final void setSize$runtime_release(int i) {
        this.f37789a = i;
    }

    public final void setValues$runtime_release(@yfb dii<T>[] diiVarArr) {
        this.f37791c = diiVarArr;
    }
}
