package p000;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:233\n60#2,10:239\n57#2,2:249\n71#2,2:251\n66#2:253\n52#2,5:255\n60#2,10:261\n57#2,2:271\n71#2,2:273\n67#3:232\n68#3:238\n67#3:254\n68#3:260\n1#4:275\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n*L\n177#1:231\n177#1:233,5\n177#1:239,10\n177#1:249,2\n177#1:251,2\n187#1:253\n187#1:255,5\n187#1:261,10\n187#1:271,2\n187#1:273,2\n177#1:232\n177#1:238\n187#1:254\n187#1:260\n*E\n"})
public class k1c<T> implements brd<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final FileSystem f52378a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Path f52379b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final l1c<T> f52380c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final mb0 f52381d;

    /* JADX INFO: renamed from: k1c$a */
    @ck3(m4009c = "androidx.datastore.core.okio.OkioReadScope", m4010f = "OkioStorage.kt", m4011i = {0, 0, 1}, m4012l = {180, 187}, m4013m = "readData$suspendImpl", m4014n = {"$this", "$this$use$iv$iv", "$this$use$iv$iv"}, m4015s = {"L$0", "L$1", "L$0"})
    public static final class C8165a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f52382a;

        /* JADX INFO: renamed from: b */
        public Object f52383b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f52384c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ k1c<T> f52385d;

        /* JADX INFO: renamed from: e */
        public int f52386e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8165a(k1c<T> k1cVar, zy2<? super C8165a> zy2Var) {
            super(zy2Var);
            this.f52385d = k1cVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f52384c = obj;
            this.f52386e |= Integer.MIN_VALUE;
            return k1c.m14443e(this.f52385d, this);
        }
    }

    public k1c(@yfb FileSystem fileSystem, @yfb Path path, @yfb l1c<T> l1cVar) {
        md8.checkNotNullParameter(fileSystem, "fileSystem");
        md8.checkNotNullParameter(path, "path");
        md8.checkNotNullParameter(l1cVar, "serializer");
        this.f52378a = fileSystem;
        this.f52379b = path;
        this.f52380c = l1cVar;
        this.f52381d = new mb0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090 A[Catch: FileNotFoundException -> 0x008a, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[Catch: FileNotFoundException -> 0x008a, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <T> java.lang.Object m14443e(p000.k1c<T> r7, p000.zy2<? super T> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k1c.m14443e(k1c, zy2):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final void m14444a() {
        if (this.f52381d.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final FileSystem m14445b() {
        return this.f52378a;
    }

    @yfb
    /* JADX INFO: renamed from: c */
    public final Path m14446c() {
        return this.f52379b;
    }

    @Override // p000.p52
    public void close() {
        this.f52381d.set(true);
    }

    @yfb
    /* JADX INFO: renamed from: d */
    public final l1c<T> m14447d() {
        return this.f52380c;
    }

    @Override // p000.brd
    @gib
    public Object readData(@yfb zy2<? super T> zy2Var) {
        return m14443e(this, zy2Var);
    }
}
