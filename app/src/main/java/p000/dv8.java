package p000;

import android.media.Image;
import android.media.ImageReader;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@c5e(22)
@dwf({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n*L\n90#1:231,11\n*E\n"})
public final class dv8 implements bv8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dv8 f30977a = new dv8();

    /* JADX INFO: renamed from: dv8$a */
    @ck3(m4009c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", m4010f = "LayerSnapshot.android.kt", m4011i = {0, 0, 0, 0}, m4012l = {231}, m4013m = "toBitmap", m4014n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, m4015s = {"L$0", "L$1", "L$3", "L$4"})
    public static final class C4964a extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f30978C;

        /* JADX INFO: renamed from: a */
        public Object f30979a;

        /* JADX INFO: renamed from: b */
        public Object f30980b;

        /* JADX INFO: renamed from: c */
        public Object f30981c;

        /* JADX INFO: renamed from: d */
        public Object f30982d;

        /* JADX INFO: renamed from: e */
        public Object f30983e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30984f;

        public C4964a(zy2<? super C4964a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f30984f = obj;
            this.f30978C |= Integer.MIN_VALUE;
            return dv8.this.toBitmap(null, this);
        }
    }

    /* JADX INFO: renamed from: dv8$b */
    public static final class C4965b implements ImageReader.OnImageAvailableListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<Image> f30986a;

        /* JADX WARN: Multi-variable type inference failed */
        public C4965b(dq1<? super Image> dq1Var) {
            this.f30986a = dq1Var;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            dq1<Image> dq1Var = this.f30986a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(imageReader.acquireLatestImage()));
        }
    }

    private dv8() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.bv8
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object toBitmap(@p000.yfb p000.u97 r9, @p000.yfb p000.zy2<? super android.graphics.Bitmap> r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dv8.toBitmap(u97, zy2):java.lang.Object");
    }
}
