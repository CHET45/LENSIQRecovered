package p000;

import java.io.File;
import java.io.IOException;
import p000.o9f;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,205:1\n159#1,8:226\n159#1,8:234\n120#2,10:206\n32#3,10:216\n*S KotlinDebug\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n99#1:226,8\n106#1:234,8\n43#1:206,10\n60#1:216,10\n*E\n"})
public final class a3b implements m98 {

    /* JADX INFO: renamed from: j */
    @yfb
    public static final C0040a f273j = new C0040a(null);

    /* JADX INFO: renamed from: k */
    @yfb
    public static final String f274k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l */
    public static final long f275l = 10;

    /* JADX INFO: renamed from: m */
    public static final long f276m = 60000;

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f277a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final File f278b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final y56<bth> f279c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f280d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f281e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final String f282f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final y7b f283g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final fx8 f284h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final fx8<o9f> f285i;

    /* JADX INFO: renamed from: a3b$a */
    public static final class C0040a {

        /* JADX INFO: renamed from: a3b$a$a */
        @ck3(m4009c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m4010f = "MultiProcessCoordinator.android.kt", m4011i = {0, 0}, m4012l = {182}, m4013m = "getExclusiveFileLockWithRetryIfDeadlock", m4014n = {"lockFileStream", "backoff"}, m4015s = {"L$0", "J$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f286a;

            /* JADX INFO: renamed from: b */
            public long f287b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f288c;

            /* JADX INFO: renamed from: e */
            public int f290e;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f288c = obj;
                this.f290e |= Integer.MIN_VALUE;
                return C0040a.this.getExclusiveFileLockWithRetryIfDeadlock(null, this);
            }
        }

        public /* synthetic */ C0040a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:27:0x007d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r14, p000.zy2<? super java.nio.channels.FileLock> r15) throws java.io.IOException {
            /*
                r13 = this;
                boolean r0 = r15 instanceof p000.a3b.C0040a.a
                if (r0 == 0) goto L13
                r0 = r15
                a3b$a$a r0 = (p000.a3b.C0040a.a) r0
                int r1 = r0.f290e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f290e = r1
                goto L18
            L13:
                a3b$a$a r0 = new a3b$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f288c
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f290e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 != r4) goto L30
                long r5 = r0.f287b
                java.lang.Object r14 = r0.f286a
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                p000.y7e.throwOnFailure(r15)
                goto L7d
            L30:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L38:
                p000.y7e.throwOnFailure(r15)
                long r5 = p000.a3b.access$getINITIAL_WAIT_MILLIS$cp()
            L3f:
                long r7 = p000.a3b.access$getMAX_WAIT_MILLIS$cp()
                int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r15 > 0) goto L81
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch: java.io.IOException -> L5d
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r15 = r7.lock(r8, r10, r12)     // Catch: java.io.IOException -> L5d
                p000.md8.checkNotNullExpressionValue(r15, r2)     // Catch: java.io.IOException -> L5d
                return r15
            L5d:
                r15 = move-exception
                java.lang.String r2 = r15.getMessage()
                if (r2 == 0) goto L80
                java.lang.String r7 = p000.a3b.access$getDEADLOCK_ERROR_MESSAGE$cp()
                r8 = 0
                r9 = 0
                boolean r2 = p000.m9g.contains$default(r2, r7, r8, r3, r9)
                if (r2 != r4) goto L80
                r0.f286a = r14
                r0.f287b = r5
                r0.f290e = r4
                java.lang.Object r15 = p000.p34.delay(r5, r0)
                if (r15 != r1) goto L7d
                return r1
            L7d:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L3f
            L80:
                throw r15
            L81:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                p000.md8.checkNotNullExpressionValue(r14, r2)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.a3b.C0040a.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, zy2):java.lang.Object");
        }

        private C0040a() {
        }
    }

    /* JADX INFO: renamed from: a3b$b */
    @ck3(m4009c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", m4010f = "MultiProcessCoordinator.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n+ 2 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n1#1,205:1\n99#2:206\n*E\n"})
    public static final class C0041b extends ugg implements gz6<x13, zy2<? super Integer>, Object> {

        /* JADX INFO: renamed from: a */
        public int f291a;

        public C0041b(zy2 zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return a3b.this.new C0041b(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Integer> zy2Var) {
            return ((C0041b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f291a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxInt(a3b.this.getSharedCounter().getValue());
        }
    }

    /* JADX INFO: renamed from: a3b$c */
    @ck3(m4009c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", m4010f = "MultiProcessCoordinator.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n+ 2 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n1#1,205:1\n106#2:206\n*E\n"})
    public static final class C0042c extends ugg implements gz6<x13, zy2<? super Integer>, Object> {

        /* JADX INFO: renamed from: a */
        public int f293a;

        public C0042c(zy2 zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return a3b.this.new C0042c(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Integer> zy2Var) {
            return ((C0042c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f293a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxInt(a3b.this.getSharedCounter().incrementAndGetValue());
        }
    }

    /* JADX INFO: renamed from: a3b$d */
    public static final class C0043d extends tt8 implements ny6<o9f> {

        /* JADX INFO: renamed from: a3b$d$a */
        public static final class a extends tt8 implements ny6<File> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ a3b f296a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a3b a3bVar) {
                super(0);
                this.f296a = a3bVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final File invoke() throws IOException {
                a3b a3bVar = this.f296a;
                File fileFileWithSuffix = a3bVar.fileWithSuffix(a3bVar.f281e);
                this.f296a.createIfNotExists(fileFileWithSuffix);
                return fileFileWithSuffix;
            }
        }

        public C0043d() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final o9f invoke() {
            o9f.C10274a c10274a = o9f.f66946b;
            c10274a.loadLib();
            return c10274a.create$datastore_core_release(new a(a3b.this));
        }
    }

    /* JADX INFO: renamed from: a3b$e */
    @ck3(m4009c = "androidx.datastore.core.MultiProcessCoordinator", m4010f = "MultiProcessCoordinator.android.kt", m4011i = {0, 0, 0, 1, 1, 2, 2}, m4012l = {211, 47, 48}, m4013m = "lock", m4014n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    public static final class C0044e<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f297a;

        /* JADX INFO: renamed from: b */
        public Object f298b;

        /* JADX INFO: renamed from: c */
        public Object f299c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f300d;

        /* JADX INFO: renamed from: f */
        public int f302f;

        public C0044e(zy2<? super C0044e> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f300d = obj;
            this.f302f |= Integer.MIN_VALUE;
            return a3b.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: a3b$f */
    public static final class C0045f extends tt8 implements ny6<File> {
        public C0045f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final File invoke() throws IOException {
            a3b a3bVar = a3b.this;
            File fileFileWithSuffix = a3bVar.fileWithSuffix(a3bVar.f280d);
            a3b.this.createIfNotExists(fileFileWithSuffix);
            return fileFileWithSuffix;
        }
    }

    /* JADX INFO: renamed from: a3b$g */
    @ck3(m4009c = "androidx.datastore.core.MultiProcessCoordinator", m4010f = "MultiProcessCoordinator.android.kt", m4011i = {0, 0, 1, 1, 1}, m4012l = {62, 87}, m4013m = "tryLock", m4014n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, m4015s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    public static final class C0046g<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f304a;

        /* JADX INFO: renamed from: b */
        public Object f305b;

        /* JADX INFO: renamed from: c */
        public Object f306c;

        /* JADX INFO: renamed from: d */
        public boolean f307d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f308e;

        /* JADX INFO: renamed from: m */
        public int f310m;

        public C0046g(zy2<? super C0046g> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f308e = obj;
            this.f310m |= Integer.MIN_VALUE;
            return a3b.this.tryLock(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: a3b$h */
    @ck3(m4009c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", m4010f = "MultiProcessCoordinator.android.kt", m4011i = {}, m4012l = {163}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n*L\n1#1,205:1\n*E\n"})
    public static final class C0047h<T> extends ugg implements gz6<x13, zy2<? super T>, Object> {

        /* JADX INFO: renamed from: a */
        public int f311a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<o9f, zy2<? super T>, Object> f312b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ a3b f313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0047h(gz6<? super o9f, ? super zy2<? super T>, ? extends Object> gz6Var, a3b a3bVar, zy2<? super C0047h> zy2Var) {
            super(2, zy2Var);
            this.f312b = gz6Var;
            this.f313c = a3bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C0047h(this.f312b, this.f313c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super T> zy2Var) {
            return ((C0047h) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f311a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                gz6<o9f, zy2<? super T>, Object> gz6Var = this.f312b;
                o9f sharedCounter = this.f313c.getSharedCounter();
                this.f311a = 1;
                obj = gz6Var.invoke(sharedCounter, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return obj;
        }

        @gib
        public final Object invokeSuspend$$forInline(@yfb Object obj) {
            return this.f312b.invoke(this.f313c.getSharedCounter(), this);
        }
    }

    public a3b(@yfb e13 e13Var, @yfb File file) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(file, "file");
        this.f277a = e13Var;
        this.f278b = file;
        this.f279c = q3b.f73125c.observe(file);
        this.f280d = ".lock";
        this.f281e = ".version";
        this.f282f = "fcntl failed: EAGAIN";
        this.f283g = e8b.Mutex$default(false, 1, null);
        this.f284h = hz8.lazy(new C0045f());
        this.f285i = hz8.lazy(new C0043d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String str) {
        return new File(this.f278b.getAbsolutePath() + str);
    }

    private final File getLockFile() {
        return (File) this.f284h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o9f getSharedCounter() {
        return this.f285i.getValue();
    }

    private final <T> Object withLazyCounter(gz6<? super o9f, ? super zy2<? super T>, ? extends Object> gz6Var, zy2<? super T> zy2Var) {
        if (this.f285i.isInitialized()) {
            return gz6Var.invoke(getSharedCounter(), zy2Var);
        }
        e13 e13Var = this.f277a;
        C0047h c0047h = new C0047h(gz6Var, this, null);
        o28.mark(0);
        Object objWithContext = dg1.withContext(e13Var, c0047h, zy2Var);
        o28.mark(1);
        return objWithContext;
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public final File m125a() {
        return this.f278b;
    }

    @Override // p000.m98
    @yfb
    public y56<bth> getUpdateNotifications() {
        return this.f279c;
    }

    @Override // p000.m98
    @gib
    public Object getVersion(@yfb zy2<? super Integer> zy2Var) {
        return this.f285i.isInitialized() ? wc1.boxInt(getSharedCounter().getValue()) : dg1.withContext(this.f277a, new C0041b(null), zy2Var);
    }

    @Override // p000.m98
    @gib
    public Object incrementAndGetVersion(@yfb zy2<? super Integer> zy2Var) {
        return this.f285i.isInitialized() ? wc1.boxInt(getSharedCounter().incrementAndGetValue()) : dg1.withContext(this.f277a, new C0042c(null), zy2Var);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [y7b] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [y7b] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [y7b] */
    @Override // p000.m98
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object lock(@p000.yfb p000.qy6<? super p000.zy2<? super T>, ? extends java.lang.Object> r9, @p000.yfb p000.zy2<? super T> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a3b.lock(qy6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5 A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00e9, blocks: (B:59:0x00e5, B:71:0x00fe, B:72:0x0101), top: B:89:0x0029, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe A[Catch: all -> 0x00e9, TRY_ENTER, TryCatch #6 {all -> 0x00e9, blocks: (B:59:0x00e5, B:71:0x00fe, B:72:0x0101), top: B:89:0x0029, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v0, types: [gz6] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [a3b$g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [y7b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // p000.m98
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object tryLock(@p000.yfb p000.gz6<? super java.lang.Boolean, ? super p000.zy2<? super T>, ? extends java.lang.Object> r19, @p000.yfb p000.zy2<? super T> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a3b.tryLock(gz6, zy2):java.lang.Object");
    }
}
