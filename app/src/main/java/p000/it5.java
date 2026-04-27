package p000;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n38#2,23:209\n38#2,23:240\n120#3,8:232\n129#3:263\n1#4:264\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n*L\n100#1:209,23\n117#1:240,23\n114#1:232,8\n114#1:263\n*E\n"})
public final class it5<T> implements g5g<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final File f48186a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final w1f<T> f48187b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final m98 f48188c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ny6<bth> f48189d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final AtomicBoolean f48190e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final y7b f48191f;

    /* JADX INFO: renamed from: it5$a */
    @ck3(m4009c = "androidx.datastore.core.FileStorageConnection", m4010f = "FileStorage.kt", m4011i = {0, 0, 0}, m4012l = {101}, m4013m = "readScope", m4014n = {"this", "$this$use$iv", "lock"}, m4015s = {"L$0", "L$1", "Z$0"})
    public static final class C7592a<R> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f48192a;

        /* JADX INFO: renamed from: b */
        public Object f48193b;

        /* JADX INFO: renamed from: c */
        public boolean f48194c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f48195d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ it5<T> f48196e;

        /* JADX INFO: renamed from: f */
        public int f48197f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7592a(it5<T> it5Var, zy2<? super C7592a> zy2Var) {
            super(zy2Var);
            this.f48196e = it5Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f48195d = obj;
            this.f48197f |= Integer.MIN_VALUE;
            return this.f48196e.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: it5$b */
    @ck3(m4009c = "androidx.datastore.core.FileStorageConnection", m4010f = "FileStorage.kt", m4011i = {0, 0, 0, 1, 1, 1, 1}, m4012l = {214, 118}, m4013m = "writeScope", m4014n = {"this", "block", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchFile", "$this$use$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C7593b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f48198a;

        /* JADX INFO: renamed from: b */
        public Object f48199b;

        /* JADX INFO: renamed from: c */
        public Object f48200c;

        /* JADX INFO: renamed from: d */
        public Object f48201d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f48202e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ it5<T> f48203f;

        /* JADX INFO: renamed from: m */
        public int f48204m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7593b(it5<T> it5Var, zy2<? super C7593b> zy2Var) {
            super(zy2Var);
            this.f48203f = it5Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f48202e = obj;
            this.f48204m |= Integer.MIN_VALUE;
            return this.f48203f.writeScope(null, this);
        }
    }

    public it5(@yfb File file, @yfb w1f<T> w1fVar, @yfb m98 m98Var, @yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(file, "file");
        md8.checkNotNullParameter(w1fVar, "serializer");
        md8.checkNotNullParameter(m98Var, "coordinator");
        md8.checkNotNullParameter(ny6Var, "onClose");
        this.f48186a = file;
        this.f48187b = w1fVar;
        this.f48188c = m98Var;
        this.f48189d = ny6Var;
        this.f48190e = new AtomicBoolean(false);
        this.f48191f = e8b.Mutex$default(false, 1, null);
    }

    private final void checkNotClosed() {
        if (this.f48190e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    @Override // p000.p52
    public void close() {
        this.f48190e.set(true);
        this.f48189d.invoke();
    }

    @Override // p000.g5g
    @yfb
    public m98 getCoordinator() {
        return this.f48188c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [it5] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [it5$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [it5] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [it5] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kz6, kz6<? super brd<T>, ? super java.lang.Boolean, ? super zy2<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p000.g5g
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object readScope(@p000.yfb p000.kz6<? super p000.brd<T>, ? super java.lang.Boolean, ? super p000.zy2<? super R>, ? extends java.lang.Object> r9, @p000.yfb p000.zy2<? super R> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p000.it5.C7592a
            if (r0 == 0) goto L13
            r0 = r10
            it5$a r0 = (p000.it5.C7592a) r0
            int r1 = r0.f48197f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48197f = r1
            goto L18
        L13:
            it5$a r0 = new it5$a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f48195d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48197f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f48194c
            java.lang.Object r1 = r0.f48193b
            p52 r1 = (p000.p52) r1
            java.lang.Object r0 = r0.f48192a
            it5 r0 = (p000.it5) r0
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r10 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            p000.y7e.throwOnFailure(r10)
            r8.checkNotClosed()
            y7b r10 = r8.f48191f
            boolean r10 = p000.y7b.C15538a.tryLock$default(r10, r4, r3, r4)
            dt5 r2 = new dt5     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r8.f48186a     // Catch: java.lang.Throwable -> L8d
            w1f<T> r6 = r8.f48187b     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = p000.wc1.boxBoolean(r10)     // Catch: java.lang.Throwable -> L7e
            r0.f48192a = r8     // Catch: java.lang.Throwable -> L7e
            r0.f48193b = r2     // Catch: java.lang.Throwable -> L7e
            r0.f48194c = r10     // Catch: java.lang.Throwable -> L7e
            r0.f48197f = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r9 != r1) goto L66
            return r1
        L66:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r9 == 0) goto L7a
            y7b r9 = r0.f48191f
            p000.y7b.C15538a.unlock$default(r9, r4, r3, r4)
        L7a:
            return r10
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r10 = move-exception
            goto L92
        L7e:
            r9 = move-exception
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            p000.a85.addSuppressed(r10, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r10     // Catch: java.lang.Throwable -> L7c
        L8d:
            r9 = move-exception
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            if (r9 == 0) goto L99
            y7b r9 = r0.f48191f
            p000.y7b.C15538a.unlock$default(r9, r4, r3, r4)
        L99:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.it5.readScope(kz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #1 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fb, B:58:0x010a, B:60:0x0110, B:61:0x0113, B:56:0x0108, B:55:0x0105, B:24:0x007a, B:25:0x0096), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fb, B:58:0x010a, B:60:0x0110, B:61:0x0113, B:56:0x0108, B:55:0x0105, B:24:0x007a, B:25:0x0096), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, y7b] */
    @Override // p000.g5g
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeScope(@p000.yfb p000.gz6<? super p000.msi<T>, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r10, @p000.yfb p000.zy2<? super p000.bth> r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.it5.writeScope(gz6, zy2):java.lang.Object");
    }
}
