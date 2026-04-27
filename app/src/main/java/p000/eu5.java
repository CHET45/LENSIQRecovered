package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class eu5<T> extends dt5<T> implements msi<T> {

    /* JADX INFO: renamed from: eu5$a */
    @ck3(m4009c = "androidx.datastore.core.FileWriteScope", m4010f = "FileStorage.kt", m4011i = {0}, m4012l = {201}, m4013m = "writeData", m4014n = {"stream"}, m4015s = {"L$1"})
    public static final class C5470a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f34028a;

        /* JADX INFO: renamed from: b */
        public Object f34029b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f34030c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ eu5<T> f34031d;

        /* JADX INFO: renamed from: e */
        public int f34032e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5470a(eu5<T> eu5Var, zy2<? super C5470a> zy2Var) {
            super(zy2Var);
            this.f34031d = eu5Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f34030c = obj;
            this.f34032e |= Integer.MIN_VALUE;
            return this.f34031d.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu5(@yfb File file, @yfb w1f<T> w1fVar) {
        super(file, w1fVar);
        md8.checkNotNullParameter(file, "file");
        md8.checkNotNullParameter(w1fVar, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.msi
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeData(T r6, @p000.yfb p000.zy2<? super p000.bth> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.eu5.C5470a
            if (r0 == 0) goto L13
            r0 = r7
            eu5$a r0 = (p000.eu5.C5470a) r0
            int r1 = r0.f34032e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34032e = r1
            goto L18
        L13:
            eu5$a r0 = new eu5$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f34030c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34032e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f34029b
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.f34028a
            java.io.Closeable r0 = (java.io.Closeable) r0
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L72
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            p000.y7e.throwOnFailure(r7)
            r5.m9352a()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.m9353b()
            r7.<init>(r2)
            w1f r2 = r5.m9354c()     // Catch: java.lang.Throwable -> L70
            rrh r4 = new rrh     // Catch: java.lang.Throwable -> L70
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L70
            r0.f34028a = r7     // Catch: java.lang.Throwable -> L70
            r0.f34029b = r7     // Catch: java.lang.Throwable -> L70
            r0.f34032e = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L70
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L31
            r7 = 0
            p000.u52.closeFinally(r0, r7)
            return r6
        L70:
            r6 = move-exception
            r0 = r7
        L72:
            throw r6     // Catch: java.lang.Throwable -> L73
        L73:
            r7 = move-exception
            p000.u52.closeFinally(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.eu5.writeData(java.lang.Object, zy2):java.lang.Object");
    }
}
