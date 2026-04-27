package p000;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileReadScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public class dt5<T> implements brd<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final File f30831a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final w1f<T> f30832b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final AtomicBoolean f30833c;

    /* JADX INFO: renamed from: dt5$a */
    @ck3(m4009c = "androidx.datastore.core.FileReadScope", m4010f = "FileStorage.kt", m4011i = {0}, m4012l = {169, 178}, m4013m = "readData$suspendImpl", m4014n = {"$this"}, m4015s = {"L$0"})
    public static final class C4942a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f30834a;

        /* JADX INFO: renamed from: b */
        public Object f30835b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f30836c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ dt5<T> f30837d;

        /* JADX INFO: renamed from: e */
        public int f30838e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4942a(dt5<T> dt5Var, zy2<? super C4942a> zy2Var) {
            super(zy2Var);
            this.f30837d = dt5Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f30836c = obj;
            this.f30838e |= Integer.MIN_VALUE;
            return dt5.m9351d(this.f30837d, this);
        }
    }

    public dt5(@yfb File file, @yfb w1f<T> w1fVar) {
        md8.checkNotNullParameter(file, "file");
        md8.checkNotNullParameter(w1fVar, "serializer");
        this.f30831a = file;
        this.f30832b = w1fVar;
        this.f30833c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [dt5] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <T> java.lang.Object m9351d(p000.dt5<T> r7, p000.zy2<? super T> r8) {
        /*
            boolean r0 = r8 instanceof p000.dt5.C4942a
            if (r0 == 0) goto L13
            r0 = r8
            dt5$a r0 = (p000.dt5.C4942a) r0
            int r1 = r0.f30838e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30838e = r1
            goto L18
        L13:
            dt5$a r0 = new dt5$a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f30836c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f30838e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f30834a
            java.io.Closeable r7 = (java.io.Closeable) r7
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L32:
            r8 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.f30835b
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.f30834a
            dt5 r2 = (p000.dt5) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L49:
            r8 = move-exception
            goto L76
        L4b:
            p000.y7e.throwOnFailure(r8)
            r7.m9352a()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7c
            java.io.File r2 = r7.f30831a     // Catch: java.io.FileNotFoundException -> L7c
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7c
            w1f<T> r2 = r7.f30832b     // Catch: java.lang.Throwable -> L71
            r0.f30834a = r7     // Catch: java.lang.Throwable -> L71
            r0.f30835b = r8     // Catch: java.lang.Throwable -> L71
            r0.f30838e = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.readFrom(r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            p000.u52.closeFinally(r7, r5)     // Catch: java.io.FileNotFoundException -> L6f
            goto Lb1
        L6f:
            r7 = r2
            goto L7c
        L71:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L76:
            throw r8     // Catch: java.lang.Throwable -> L77
        L77:
            r4 = move-exception
            p000.u52.closeFinally(r7, r8)     // Catch: java.io.FileNotFoundException -> L6f
            throw r4     // Catch: java.io.FileNotFoundException -> L6f
        L7c:
            java.io.File r8 = r7.f30831a
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lab
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.f30831a
            r8.<init>(r2)
            w1f<T> r7 = r7.f30832b     // Catch: java.lang.Throwable -> La1
            r0.f30834a = r8     // Catch: java.lang.Throwable -> La1
            r0.f30835b = r5     // Catch: java.lang.Throwable -> La1
            r0.f30838e = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r7 = r7.readFrom(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r7 != r1) goto L9a
            return r1
        L9a:
            r6 = r8
            r8 = r7
            r7 = r6
        L9d:
            p000.u52.closeFinally(r7, r5)
            return r8
        La1:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La5:
            throw r8     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            p000.u52.closeFinally(r7, r8)
            throw r0
        Lab:
            w1f<T> r7 = r7.f30832b
            java.lang.Object r8 = r7.getDefaultValue()
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dt5.m9351d(dt5, zy2):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final void m9352a() {
        if (this.f30833c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final File m9353b() {
        return this.f30831a;
    }

    @yfb
    /* JADX INFO: renamed from: c */
    public final w1f<T> m9354c() {
        return this.f30832b;
    }

    @Override // p000.p52
    public void close() {
        this.f30833c.set(true);
    }

    @Override // p000.brd
    @gib
    public Object readData(@yfb zy2<? super T> zy2Var) {
        return m9351d(this, zy2Var);
    }
}
