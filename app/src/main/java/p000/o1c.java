package p000;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n38#2,23:231\n38#2,23:262\n120#3,8:254\n129#3:285\n1#4:286\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n*L\n112#1:231,23\n136#1:262,23\n129#1:254,8\n129#1:285\n*E\n"})
public final class o1c<T> implements g5g<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final FileSystem f66228a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Path f66229b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final l1c<T> f66230c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final m98 f66231d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ny6<bth> f66232e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final mb0 f66233f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final y7b f66234g;

    /* JADX INFO: renamed from: o1c$a */
    @ck3(m4009c = "androidx.datastore.core.okio.OkioStorageConnection", m4010f = "OkioStorage.kt", m4011i = {0, 0, 0}, m4012l = {113}, m4013m = "readScope", m4014n = {"this", "$this$use$iv", "lock"}, m4015s = {"L$0", "L$1", "Z$0"})
    public static final class C10139a<R> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f66235a;

        /* JADX INFO: renamed from: b */
        public Object f66236b;

        /* JADX INFO: renamed from: c */
        public boolean f66237c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f66238d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ o1c<T> f66239e;

        /* JADX INFO: renamed from: f */
        public int f66240f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10139a(o1c<T> o1cVar, zy2<? super C10139a> zy2Var) {
            super(zy2Var);
            this.f66239e = o1cVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f66238d = obj;
            this.f66240f |= Integer.MIN_VALUE;
            return this.f66239e.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: o1c$b */
    @ck3(m4009c = "androidx.datastore.core.okio.OkioStorageConnection", m4010f = "OkioStorage.kt", m4011i = {0, 0, 0, 0, 1, 1, 1, 1}, m4012l = {236, 137}, m4013m = "writeScope", m4014n = {"this", "block", "parentDir", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchPath", "$this$use$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C10140b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f66241a;

        /* JADX INFO: renamed from: b */
        public Object f66242b;

        /* JADX INFO: renamed from: c */
        public Object f66243c;

        /* JADX INFO: renamed from: d */
        public Object f66244d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f66245e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ o1c<T> f66246f;

        /* JADX INFO: renamed from: m */
        public int f66247m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10140b(o1c<T> o1cVar, zy2<? super C10140b> zy2Var) {
            super(zy2Var);
            this.f66246f = o1cVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f66245e = obj;
            this.f66247m |= Integer.MIN_VALUE;
            return this.f66246f.writeScope(null, this);
        }
    }

    public o1c(@yfb FileSystem fileSystem, @yfb Path path, @yfb l1c<T> l1cVar, @yfb m98 m98Var, @yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(fileSystem, "fileSystem");
        md8.checkNotNullParameter(path, "path");
        md8.checkNotNullParameter(l1cVar, "serializer");
        md8.checkNotNullParameter(m98Var, "coordinator");
        md8.checkNotNullParameter(ny6Var, "onClose");
        this.f66228a = fileSystem;
        this.f66229b = path;
        this.f66230c = l1cVar;
        this.f66231d = m98Var;
        this.f66232e = ny6Var;
        this.f66233f = new mb0(false);
        this.f66234g = e8b.Mutex$default(false, 1, null);
    }

    private final void checkNotClosed() {
        if (this.f66233f.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // p000.p52
    public void close() {
        this.f66233f.set(true);
        this.f66232e.invoke();
    }

    @Override // p000.g5g
    @yfb
    public m98 getCoordinator() {
        return this.f66231d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:31:0x007d, B:40:0x008e, B:39:0x008b, B:36:0x0086), top: B:54:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [o1c] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o1c$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o1c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [o1c] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kz6, kz6<? super brd<T>, ? super java.lang.Boolean, ? super zy2<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // p000.g5g
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object readScope(@p000.yfb p000.kz6<? super p000.brd<T>, ? super java.lang.Boolean, ? super p000.zy2<? super R>, ? extends java.lang.Object> r10, @p000.yfb p000.zy2<? super R> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p000.o1c.C10139a
            if (r0 == 0) goto L13
            r0 = r11
            o1c$a r0 = (p000.o1c.C10139a) r0
            int r1 = r0.f66240f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66240f = r1
            goto L18
        L13:
            o1c$a r0 = new o1c$a
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f66238d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f66240f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r10 = r0.f66237c
            java.lang.Object r1 = r0.f66236b
            p52 r1 = (p000.p52) r1
            java.lang.Object r0 = r0.f66235a
            o1c r0 = (p000.o1c) r0
            p000.y7e.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L34
            goto L6d
        L34:
            r11 = move-exception
            goto L86
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            p000.y7e.throwOnFailure(r11)
            r9.checkNotClosed()
            y7b r11 = r9.f66234g
            boolean r11 = p000.y7b.C15538a.tryLock$default(r11, r4, r3, r4)
            k1c r2 = new k1c     // Catch: java.lang.Throwable -> L8f
            okio.FileSystem r5 = r9.f66228a     // Catch: java.lang.Throwable -> L8f
            okio.Path r6 = r9.f66229b     // Catch: java.lang.Throwable -> L8f
            l1c<T> r7 = r9.f66230c     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r5 = p000.wc1.boxBoolean(r11)     // Catch: java.lang.Throwable -> L80
            r0.f66235a = r9     // Catch: java.lang.Throwable -> L80
            r0.f66236b = r2     // Catch: java.lang.Throwable -> L80
            r0.f66237c = r11     // Catch: java.lang.Throwable -> L80
            r0.f66240f = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = r10.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r10 != r1) goto L68
            return r1
        L68:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L72
            r1 = r4
            goto L73
        L72:
            r1 = move-exception
        L73:
            if (r1 != 0) goto L7d
            if (r10 == 0) goto L7c
            y7b r10 = r0.f66234g
            p000.y7b.C15538a.unlock$default(r10, r4, r3, r4)
        L7c:
            return r11
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r11 = move-exception
            goto L94
        L80:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L86:
            r1.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            p000.a85.addSuppressed(r11, r1)     // Catch: java.lang.Throwable -> L7e
        L8e:
            throw r11     // Catch: java.lang.Throwable -> L7e
        L8f:
            r10 = move-exception
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L94:
            if (r10 == 0) goto L9b
            y7b r10 = r0.f66234g
            p000.y7b.C15538a.unlock$default(r10, r4, r3, r4)
        L9b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o1c.readScope(kz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #1 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ed, B:55:0x00fc, B:54:0x00f9), top: B:70:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ed, B:55:0x00fc, B:54:0x00f9), top: B:70:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v5, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [o1c] */
    /* JADX WARN: Type inference failed for: r10v19, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r10v22, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [y7b] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, okio.Path] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [y7b] */
    /* JADX WARN: Type inference failed for: r5v4, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [o1c] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, o1c] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.g5g
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeScope(@p000.yfb p000.gz6<? super p000.msi<T>, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r10, @p000.yfb p000.zy2<? super p000.bth> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o1c.writeScope(gz6, zy2):java.lang.Object");
    }
}
