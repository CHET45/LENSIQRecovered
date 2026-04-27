package p000;

import java.util.List;
import org.opencv.imgcodecs.Imgcodecs;
import p000.qnh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n81#2:433\n107#2,2:434\n33#3,6:436\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n256#1:433\n256#1:434,2\n263#1:436,6\n*E\n"})
@e0g(parameters = 1)
public final class u90 implements i2g<Object> {

    /* JADX INFO: renamed from: C */
    public static final int f87091C = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<xn6> f87092a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final onh f87093b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ra0 f87094c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final qy6<qnh.C11571b, bth> f87095d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ywc f87096e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f87097f;

    /* JADX INFO: renamed from: m */
    public boolean f87098m = true;

    /* JADX INFO: renamed from: u90$a */
    @ck3(m4009c = "androidx.compose.ui.text.font.AsyncFontListLoader", m4010f = "FontListFontFamilyTypefaceAdapter.kt", m4011i = {0, 0, 0, 0, 1, 1, 1}, m4012l = {Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000, 285}, m4013m = "load", m4014n = {"this", "$this$fastForEach$iv", ypa.f102577q, "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, m4015s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    public static final class C13408a extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f87099C;

        /* JADX INFO: renamed from: a */
        public Object f87100a;

        /* JADX INFO: renamed from: b */
        public Object f87101b;

        /* JADX INFO: renamed from: c */
        public Object f87102c;

        /* JADX INFO: renamed from: d */
        public int f87103d;

        /* JADX INFO: renamed from: e */
        public int f87104e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f87105f;

        public C13408a(zy2<? super C13408a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f87105f = obj;
            this.f87099C |= Integer.MIN_VALUE;
            return u90.this.load(this);
        }
    }

    /* JADX INFO: renamed from: u90$b */
    @ck3(m4009c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m4010f = "FontListFontFamilyTypefaceAdapter.kt", m4011i = {}, m4012l = {273}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13409b extends ugg implements qy6<zy2<? super Object>, Object> {

        /* JADX INFO: renamed from: a */
        public int f87107a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xn6 f87109c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13409b(xn6 xn6Var, zy2<? super C13409b> zy2Var) {
            super(1, zy2Var);
            this.f87109c = xn6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return u90.this.new C13409b(this.f87109c, zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@gib zy2<Object> zy2Var) {
            return ((C13409b) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f87107a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                u90 u90Var = u90.this;
                xn6 xn6Var = this.f87109c;
                this.f87107a = 1;
                obj = u90Var.loadWithTimeoutOrNull$ui_text_release(xn6Var, this);
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

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(zy2<? super Object> zy2Var) {
            return invoke2((zy2<Object>) zy2Var);
        }
    }

    /* JADX INFO: renamed from: u90$c */
    @ck3(m4009c = "androidx.compose.ui.text.font.AsyncFontListLoader", m4010f = "FontListFontFamilyTypefaceAdapter.kt", m4011i = {0}, m4012l = {304}, m4013m = "loadWithTimeoutOrNull$ui_text_release", m4014n = {"$this$loadWithTimeoutOrNull"}, m4015s = {"L$0"})
    public static final class C13410c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f87110a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f87111b;

        /* JADX INFO: renamed from: d */
        public int f87113d;

        public C13410c(zy2<? super C13410c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f87111b = obj;
            this.f87113d |= Integer.MIN_VALUE;
            return u90.this.loadWithTimeoutOrNull$ui_text_release(null, this);
        }
    }

    /* JADX INFO: renamed from: u90$d */
    @ck3(m4009c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", m4010f = "FontListFontFamilyTypefaceAdapter.kt", m4011i = {}, m4012l = {305}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13411d extends ugg implements gz6<x13, zy2<? super Object>, Object> {

        /* JADX INFO: renamed from: a */
        public int f87114a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xn6 f87116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13411d(xn6 xn6Var, zy2<? super C13411d> zy2Var) {
            super(2, zy2Var);
            this.f87116c = xn6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return u90.this.new C13411d(this.f87116c, zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@yfb x13 x13Var, @gib zy2<Object> zy2Var) {
            return ((C13411d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f87114a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ywc ywcVar = u90.this.f87096e;
                xn6 xn6Var = this.f87116c;
                this.f87114a = 1;
                obj = ywcVar.awaitLoad(xn6Var, this);
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

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(x13 x13Var, zy2<? super Object> zy2Var) {
            return invoke2(x13Var, (zy2<Object>) zy2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u90(@yfb List<? extends xn6> list, @yfb Object obj, @yfb onh onhVar, @yfb ra0 ra0Var, @yfb qy6<? super qnh.C11571b, bth> qy6Var, @yfb ywc ywcVar) {
        this.f87092a = list;
        this.f87093b = onhVar;
        this.f87094c = ra0Var;
        this.f87095d = qy6Var;
        this.f87096e = ywcVar;
        this.f87097f = xtf.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f87097f.setValue(obj);
    }

    public final boolean getCacheable$ui_text_release() {
        return this.f87098m;
    }

    @Override // p000.i2g
    @yfb
    public Object getValue() {
        return this.f87097f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00be, B:40:0x00f5), top: B:53:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00be, B:40:0x00f5), top: B:53:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0108 -> B:44:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010d -> B:46:0x010f). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object load(@p000.yfb p000.zy2<? super p000.bth> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u90.load(zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(@p000.yfb p000.xn6 r7, @p000.yfb p000.zy2<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.u90.C13410c
            if (r0 == 0) goto L13
            r0 = r8
            u90$c r0 = (p000.u90.C13410c) r0
            int r1 = r0.f87113d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87113d = r1
            goto L18
        L13:
            u90$c r0 = new u90$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f87111b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f87113d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f87110a
            xn6 r7 = (p000.xn6) r7
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            goto L4f
        L2e:
            r8 = move-exception
            goto L51
        L30:
            r7 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            p000.y7e.throwOnFailure(r8)
            u90$d r8 = new u90$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f87110a = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f87113d = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = p000.c2h.withTimeoutOrNull(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r4 = r8
            goto L87
        L51:
            e13 r1 = r0.getContext()
            n13$b r2 = p000.n13.f62944t
            e13$b r1 = r1.get(r2)
            n13 r1 = (p000.n13) r1
            if (r1 == 0) goto L87
            e13 r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L87
        L7d:
            e13 r8 = r0.getContext()
            boolean r8 = p000.oj8.isActive(r8)
            if (r8 == 0) goto L88
        L87:
            return r4
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u90.loadWithTimeoutOrNull$ui_text_release(xn6, zy2):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.f87098m = z;
    }
}
