package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rh1 implements ued {

    /* JADX INFO: renamed from: a */
    public final ik5 f78282a;

    /* JADX INFO: renamed from: b */
    @hib
    public xj5 f78283b;

    /* JADX INFO: renamed from: c */
    @hib
    public ak5 f78284c;

    public rh1(ik5 ik5Var) {
        this.f78282a = ik5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$init$0(xj5 xj5Var) {
        return xj5Var.getUnderlyingImplementation().getClass().getSimpleName();
    }

    @Override // p000.ued
    public void disableSeekingOnMp3Streams() {
        xj5 xj5Var = this.f78283b;
        if (xj5Var == null) {
            return;
        }
        xj5 underlyingImplementation = xj5Var.getUnderlyingImplementation();
        if (underlyingImplementation instanceof r0b) {
            ((r0b) underlyingImplementation).disableSeeking();
        }
    }

    @Override // p000.ued
    public long getCurrentInputPosition() {
        ak5 ak5Var = this.f78284c;
        if (ak5Var != null) {
            return ak5Var.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // p000.ued
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(p000.bh3 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p000.bk5 r15) throws java.io.IOException {
        /*
            r7 = this;
            xu3 r6 = new xu3
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f78284c = r6
            xj5 r8 = r7.f78283b
            if (r8 == 0) goto L10
            return
        L10:
            ik5 r8 = r7.f78282a
            xj5[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            kx7$a r10 = p000.kx7.builderWithExpectedSize(r10)
            int r13 = r8.length
            r14 = 0
            r0 = 1
            if (r13 != r0) goto L25
            r8 = r8[r14]
            r7.f78283b = r8
            goto L82
        L25:
            int r13 = r8.length
            r1 = r14
        L27:
            if (r1 >= r13) goto L7e
            r2 = r8[r1]
            boolean r3 = r2.sniff(r6)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            if (r3 == 0) goto L3c
            r7.f78283b = r2     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            p000.v80.checkState(r0)
            r6.resetPeekPosition()
            goto L7e
        L3a:
            r8 = move-exception
            goto L5a
        L3c:
            java.util.List r2 = r2.getSniffFailureDetails()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r10.addAll(r2)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            xj5 r2 = r7.f78283b
            if (r2 != 0) goto L52
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L52
        L50:
            r2 = r14
            goto L53
        L52:
            r2 = r0
        L53:
            p000.v80.checkState(r2)
            r6.resetPeekPosition()
            goto L7b
        L5a:
            xj5 r9 = r7.f78283b
            if (r9 != 0) goto L66
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L67
        L66:
            r14 = r0
        L67:
            p000.v80.checkState(r14)
            r6.resetPeekPosition()
            throw r8
        L6e:
            xj5 r2 = r7.f78283b
            if (r2 != 0) goto L52
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L52
        L7b:
            int r1 = r1 + 1
            goto L27
        L7e:
            xj5 r11 = r7.f78283b
            if (r11 == 0) goto L88
        L82:
            xj5 r8 = r7.f78283b
            r8.init(r15)
            return
        L88:
            zuh r11 = new zuh
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            xj8 r13 = p000.xj8.m25235on(r13)
            kx7 r8 = p000.kx7.copyOf(r8)
            ph1 r14 = new ph1
            r14.<init>()
            java.util.List r8 = p000.eb9.transform(r8, r14)
            java.lang.String r8 = r13.join(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = p000.v80.checkNotNull(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            kx7 r10 = r10.build()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rh1.init(bh3, android.net.Uri, java.util.Map, long, long, bk5):void");
    }

    @Override // p000.ued
    public int read(d5d d5dVar) throws IOException {
        return ((xj5) v80.checkNotNull(this.f78283b)).read((ak5) v80.checkNotNull(this.f78284c), d5dVar);
    }

    @Override // p000.ued
    public void release() {
        xj5 xj5Var = this.f78283b;
        if (xj5Var != null) {
            xj5Var.release();
            this.f78283b = null;
        }
        this.f78284c = null;
    }

    @Override // p000.ued
    public void seek(long j, long j2) {
        ((xj5) v80.checkNotNull(this.f78283b)).seek(j, j2);
    }
}
