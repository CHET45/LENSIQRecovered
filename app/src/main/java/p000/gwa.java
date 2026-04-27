package p000;

import p000.o34;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class gwa extends dr9 implements o34 {

    /* JADX INFO: renamed from: c */
    @gib
    public final Throwable f41726c;

    /* JADX INFO: renamed from: d */
    @gib
    public final String f41727d;

    public /* synthetic */ gwa(Throwable th, String str, int i, jt3 jt3Var) {
        this(th, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void missing() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f41726c
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f41727d
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f41726c
            r1.<init>(r0, r2)
            throw r1
        L36:
            p000.gr9.throwMissingMainDispatcherException()
            us8 r0 = new us8
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gwa.missing():java.lang.Void");
    }

    @Override // p000.o34
    @gib
    @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, @yfb zy2<? super bth> zy2Var) {
        return o34.C10164a.delay(this, j, zy2Var);
    }

    @Override // p000.dr9
    @yfb
    public dr9 getImmediate() {
        return this;
    }

    @Override // p000.o34
    @yfb
    public yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var) {
        missing();
        throw new us8();
    }

    @Override // p000.m13
    public boolean isDispatchNeeded(@yfb e13 e13Var) {
        missing();
        throw new us8();
    }

    @Override // p000.dr9, p000.m13
    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        missing();
        throw new us8();
    }

    @Override // p000.o34
    /* JADX INFO: renamed from: scheduleResumeAfterDelay, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo29874scheduleResumeAfterDelay(long j, dq1 dq1Var) {
        scheduleResumeAfterDelay(j, (dq1<? super bth>) dq1Var);
    }

    @Override // p000.dr9, p000.m13
    @yfb
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f41726c != null) {
            str = ", cause=" + this.f41726c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(C4584d2.f28243l);
        return sb.toString();
    }

    public gwa(@gib Throwable th, @gib String str) {
        this.f41726c = th;
        this.f41727d = str;
    }

    @Override // p000.m13
    @yfb
    /* JADX INFO: renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        missing();
        throw new us8();
    }

    @yfb
    public Void scheduleResumeAfterDelay(long j, @yfb dq1<? super bth> dq1Var) {
        missing();
        throw new us8();
    }
}
