package p000;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:232\n66#2:237\n52#2,21:238\n60#2,10:259\n57#2,2:269\n71#2,2:271\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n*L\n214#1:231\n214#1:232,5\n215#1:237\n215#1:238,21\n214#1:259,10\n214#1:269,2\n214#1:271,2\n*E\n"})
public final class q1c<T> extends k1c<T> implements msi<T> {

    /* JADX INFO: renamed from: q1c$a */
    @ck3(m4009c = "androidx.datastore.core.okio.OkioWriteScope", m4010f = "OkioStorage.kt", m4011i = {0, 0, 0}, m4012l = {216}, m4013m = "writeData", m4014n = {"$this$use$iv", "handle", "$this$use$iv"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C11267a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f72924a;

        /* JADX INFO: renamed from: b */
        public Object f72925b;

        /* JADX INFO: renamed from: c */
        public Object f72926c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f72927d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ q1c<T> f72928e;

        /* JADX INFO: renamed from: f */
        public int f72929f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11267a(q1c<T> q1cVar, zy2<? super C11267a> zy2Var) {
            super(zy2Var);
            this.f72928e = q1cVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f72927d = obj;
            this.f72929f |= Integer.MIN_VALUE;
            return this.f72928e.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1c(@yfb FileSystem fileSystem, @yfb Path path, @yfb l1c<T> l1cVar) {
        super(fileSystem, path, l1cVar);
        md8.checkNotNullParameter(fileSystem, "fileSystem");
        md8.checkNotNullParameter(path, "path");
        md8.checkNotNullParameter(l1cVar, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:42:0x0097, B:48:0x00a4, B:37:0x008c, B:34:0x0087), top: B:60:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:42:0x0097, B:48:0x00a4, B:37:0x008c, B:34:0x0087), top: B:60:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [q1c$a, zy2] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [l1c] */
    @Override // p000.msi
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeData(T r9, @p000.yfb p000.zy2<? super p000.bth> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p000.q1c.C11267a
            if (r0 == 0) goto L13
            r0 = r10
            q1c$a r0 = (p000.q1c.C11267a) r0
            int r1 = r0.f72929f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72929f = r1
            goto L18
        L13:
            q1c$a r0 = new q1c$a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f72927d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72929f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f72926c
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.f72925b
            okio.FileHandle r1 = (okio.FileHandle) r1
            java.lang.Object r0 = r0.f72924a
            java.io.Closeable r0 = (java.io.Closeable) r0
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L36
            goto L72
        L36:
            r10 = move-exception
            goto L85
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            p000.y7e.throwOnFailure(r10)
            r8.m14444a()
            okio.FileSystem r10 = r8.m14445b()
            okio.Path r2 = r8.m14446c()
            okio.FileHandle r10 = r10.openReadWrite(r2)
            r5 = 0
            okio.Sink r2 = okio.FileHandle.sink$default(r10, r5, r3, r4)     // Catch: java.lang.Throwable -> La5
            okio.BufferedSink r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> La5
            l1c r5 = r8.m14447d()     // Catch: java.lang.Throwable -> L81
            r0.f72924a = r10     // Catch: java.lang.Throwable -> L81
            r0.f72925b = r10     // Catch: java.lang.Throwable -> L81
            r0.f72926c = r2     // Catch: java.lang.Throwable -> L81
            r0.f72929f = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r5.writeTo(r9, r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r0 = r10
            r1 = r0
            r9 = r2
        L72:
            r1.flush()     // Catch: java.lang.Throwable -> L36
            bth r10 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L7f
            r9.close()     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r9 = move-exception
            goto L95
        L7f:
            r9 = r4
            goto L95
        L81:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L85:
            if (r9 == 0) goto L93
            r9.close()     // Catch: java.lang.Throwable -> L8b
            goto L93
        L8b:
            r9 = move-exception
            p000.a85.addSuppressed(r10, r9)     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r9 = move-exception
            r10 = r0
            goto La6
        L93:
            r9 = r10
            r10 = r4
        L95:
            if (r9 != 0) goto La4
            p000.md8.checkNotNull(r10)     // Catch: java.lang.Throwable -> L90
            bth r9 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lb3
            r0.close()     // Catch: java.lang.Throwable -> La2
            goto Lb3
        La2:
            r4 = move-exception
            goto Lb3
        La4:
            throw r9     // Catch: java.lang.Throwable -> L90
        La5:
            r9 = move-exception
        La6:
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r10 = move-exception
            p000.a85.addSuppressed(r9, r10)
        Lb0:
            r7 = r4
            r4 = r9
            r9 = r7
        Lb3:
            if (r4 != 0) goto Lbb
            p000.md8.checkNotNull(r9)
            bth r9 = p000.bth.f14751a
            return r9
        Lbb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q1c.writeData(java.lang.Object, zy2):java.lang.Object");
    }
}
