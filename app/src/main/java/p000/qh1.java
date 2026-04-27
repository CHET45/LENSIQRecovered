package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qh1 implements ved {

    /* JADX INFO: renamed from: a */
    public final hk5 f74442a;

    /* JADX INFO: renamed from: b */
    @hib
    public yj5 f74443b;

    /* JADX INFO: renamed from: c */
    @hib
    public zj5 f74444c;

    public qh1(hk5 hk5Var) {
        this.f74442a = hk5Var;
    }

    @Override // p000.ved
    public void disableSeekingOnMp3Streams() {
        yj5 yj5Var = this.f74443b;
        if (yj5Var instanceof s0b) {
            ((s0b) yj5Var).disableSeeking();
        }
    }

    @Override // p000.ved
    public long getCurrentInputPosition() {
        zj5 zj5Var = this.f74444c;
        if (zj5Var != null) {
            return zj5Var.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    @Override // p000.ved
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(p000.ah3 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p000.ck5 r15) throws java.io.IOException {
        /*
            r7 = this;
            wu3 r6 = new wu3
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f74444c = r6
            yj5 r8 = r7.f74443b
            if (r8 == 0) goto L10
            return
        L10:
            hk5 r8 = r7.f74442a
            yj5[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f74443b = r8
            goto L76
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L72
            r1 = r8[r0]
            boolean r2 = r1.sniff(r6)     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L62
            if (r2 == 0) goto L37
            r7.f74443b = r1     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L62
            p000.u80.checkState(r14)
            r6.resetPeekPosition()
            goto L72
        L35:
            r8 = move-exception
            goto L4e
        L37:
            yj5 r1 = r7.f74443b
            if (r1 != 0) goto L46
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L44
            goto L46
        L44:
            r1 = r13
            goto L47
        L46:
            r1 = r14
        L47:
            p000.u80.checkState(r1)
            r6.resetPeekPosition()
            goto L6f
        L4e:
            yj5 r9 = r7.f74443b
            if (r9 != 0) goto L5a
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L5b
        L5a:
            r13 = r14
        L5b:
            p000.u80.checkState(r13)
            r6.resetPeekPosition()
            throw r8
        L62:
            yj5 r1 = r7.f74443b
            if (r1 != 0) goto L46
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L44
            goto L46
        L6f:
            int r0 = r0 + 1
            goto L22
        L72:
            yj5 r10 = r7.f74443b
            if (r10 == 0) goto L7c
        L76:
            yj5 r8 = r7.f74443b
            r8.init(r15)
            return
        L7c:
            yuh r10 = new yuh
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p000.x0i.getCommaDelimitedSimpleClassNames(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p000.u80.checkNotNull(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qh1.init(ah3, android.net.Uri, java.util.Map, long, long, ck5):void");
    }

    @Override // p000.ved
    public int read(c5d c5dVar) throws IOException {
        return ((yj5) u80.checkNotNull(this.f74443b)).read((zj5) u80.checkNotNull(this.f74444c), c5dVar);
    }

    @Override // p000.ved
    public void release() {
        yj5 yj5Var = this.f74443b;
        if (yj5Var != null) {
            yj5Var.release();
            this.f74443b = null;
        }
        this.f74444c = null;
    }

    @Override // p000.ved
    public void seek(long j, long j2) {
        ((yj5) u80.checkNotNull(this.f74443b)).seek(j, j2);
    }
}
