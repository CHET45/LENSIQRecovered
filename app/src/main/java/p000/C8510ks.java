package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.C8044js;
import p000.zl2;

/* JADX INFO: renamed from: ks */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,480:1\n488#2:481\n487#2,4:482\n491#2,2:489\n495#2:495\n488#2:514\n487#2,4:515\n491#2,2:522\n495#2:528\n1223#3,3:486\n1226#3,3:492\n1223#3,6:496\n1223#3,6:502\n1223#3,6:508\n1223#3,3:519\n1226#3,3:525\n1223#3,6:529\n1223#3,6:535\n1223#3,6:541\n487#4:491\n487#4:524\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n*L\n191#1:481\n191#1:482,4\n191#1:489,2\n191#1:495\n385#1:514\n385#1:515,4\n385#1:522,2\n385#1:528\n191#1:486,3\n191#1:492,3\n192#1:496,6\n292#1:502,6\n300#1:508,6\n385#1:519,3\n385#1:525,3\n386#1:529,6\n459#1:535,6\n468#1:541,6\n191#1:491\n385#1:524\n*E\n"})
public final class C8510ks {

    /* JADX INFO: renamed from: ks$a */
    public static final class a extends tt8 implements qy6<Context, TextureView> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextureViewSurfaceTextureListenerC5944fs f55190a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f55191b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<InterfaceC6986hs, bth> f55192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TextureViewSurfaceTextureListenerC5944fs textureViewSurfaceTextureListenerC5944fs, long j, qy6<? super InterfaceC6986hs, bth> qy6Var) {
            super(1);
            this.f55190a = textureViewSurfaceTextureListenerC5944fs;
            this.f55191b = j;
            this.f55192c = qy6Var;
        }

        @Override // p000.qy6
        @yfb
        public final TextureView invoke(@yfb Context context) {
            TextureView textureView = new TextureView(context);
            TextureViewSurfaceTextureListenerC5944fs textureViewSurfaceTextureListenerC5944fs = this.f55190a;
            long j = this.f55191b;
            qy6<InterfaceC6986hs, bth> qy6Var = this.f55192c;
            textureViewSurfaceTextureListenerC5944fs.m29641setSurfaceSizeozmzZPI(j);
            qy6Var.invoke(textureViewSurfaceTextureListenerC5944fs);
            textureView.setSurfaceTextureListener(textureViewSurfaceTextureListenerC5944fs);
            return textureView;
        }
    }

    /* JADX INFO: renamed from: ks$b */
    public static final class b extends tt8 implements qy6<TextureView, bth> {

        /* JADX INFO: renamed from: a */
        public static final b f55193a = new b();

        public b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(TextureView textureView) {
            invoke2(textureView);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb TextureView textureView) {
        }
    }

    /* JADX INFO: renamed from: ks$c */
    @dwf({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,480:1\n1#2:481\n*E\n"})
    public static final class c extends tt8 implements qy6<TextureView, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f55194a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextureViewSurfaceTextureListenerC5944fs f55195b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f55196c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float[] f55197d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, TextureViewSurfaceTextureListenerC5944fs textureViewSurfaceTextureListenerC5944fs, boolean z, float[] fArr) {
            super(1);
            this.f55194a = j;
            this.f55195b = textureViewSurfaceTextureListenerC5944fs;
            this.f55196c = z;
            this.f55197d = fArr;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(TextureView textureView) {
            invoke2(textureView);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb TextureView textureView) {
            Matrix matrix;
            SurfaceTexture surfaceTexture;
            if (!r78.m32085equalsimpl0(this.f55194a, r78.f77324b.m32092getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                surfaceTexture.setDefaultBufferSize(r78.m32087getWidthimpl(this.f55194a), r78.m32086getHeightimpl(this.f55194a));
            }
            this.f55195b.m29641setSurfaceSizeozmzZPI(this.f55194a);
            textureView.setOpaque(this.f55196c);
            float[] fArr = this.f55197d;
            if (fArr != null) {
                matrix = this.f55195b.getMatrix();
                C12773st.m32333setFromEL8BTi8(matrix, fArr);
            } else {
                matrix = null;
            }
            textureView.setTransform(matrix);
        }
    }

    /* JADX INFO: renamed from: ks$d */
    public static final class d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f55198a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f55199b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f55200c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float[] f55201d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<InterfaceC6986hs, bth> f55202e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f55203f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f55204m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC0701e interfaceC0701e, boolean z, long j, float[] fArr, qy6<? super InterfaceC6986hs, bth> qy6Var, int i, int i2) {
            super(2);
            this.f55198a = interfaceC0701e;
            this.f55199b = z;
            this.f55200c = j;
            this.f55201d = fArr;
            this.f55202e = qy6Var;
            this.f55203f = i;
            this.f55204m = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C8510ks.m30746AndroidEmbeddedExternalSurfacesv6N_fY(this.f55198a, this.f55199b, this.f55200c, this.f55201d, this.f55202e, zl2Var, tsd.updateChangedFlags(this.f55203f | 1), this.f55204m);
        }
    }

    /* JADX INFO: renamed from: ks$e */
    public static final class e extends tt8 implements qy6<Context, SurfaceView> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<InterfaceC6986hs, bth> f55205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SurfaceHolderCallbackC7580is f55206b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(qy6<? super InterfaceC6986hs, bth> qy6Var, SurfaceHolderCallbackC7580is surfaceHolderCallbackC7580is) {
            super(1);
            this.f55205a = qy6Var;
            this.f55206b = surfaceHolderCallbackC7580is;
        }

        @Override // p000.qy6
        @yfb
        public final SurfaceView invoke(@yfb Context context) {
            SurfaceView surfaceView = new SurfaceView(context);
            qy6<InterfaceC6986hs, bth> qy6Var = this.f55205a;
            SurfaceHolderCallbackC7580is surfaceHolderCallbackC7580is = this.f55206b;
            qy6Var.invoke(surfaceHolderCallbackC7580is);
            surfaceView.getHolder().addCallback(surfaceHolderCallbackC7580is);
            return surfaceView;
        }
    }

    /* JADX INFO: renamed from: ks$f */
    public static final class f extends tt8 implements qy6<SurfaceView, bth> {

        /* JADX INFO: renamed from: a */
        public static final f f55207a = new f();

        public f() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(SurfaceView surfaceView) {
            invoke2(surfaceView);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb SurfaceView surfaceView) {
        }
    }

    /* JADX INFO: renamed from: ks$g */
    public static final class g extends tt8 implements qy6<SurfaceView, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f55208a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f55209b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f55210c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f55211d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, boolean z, int i, boolean z2) {
            super(1);
            this.f55208a = j;
            this.f55209b = z;
            this.f55210c = i;
            this.f55211d = z2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(SurfaceView surfaceView) {
            invoke2(surfaceView);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb SurfaceView surfaceView) {
            if (r78.m32085equalsimpl0(this.f55208a, r78.f77324b.m32092getZeroYbymL2g())) {
                surfaceView.getHolder().setSizeFromLayout();
            } else {
                surfaceView.getHolder().setFixedSize(r78.m32087getWidthimpl(this.f55208a), r78.m32086getHeightimpl(this.f55208a));
            }
            surfaceView.getHolder().setFormat(this.f55209b ? -1 : -3);
            int i = this.f55210c;
            C8044js.a aVar = C8044js.f51641b;
            if (C8044js.m30572equalsimpl0(i, aVar.m30576getBehindB_4ceCc())) {
                surfaceView.setZOrderOnTop(false);
            } else if (C8044js.m30572equalsimpl0(i, aVar.m30577getMediaOverlayB_4ceCc())) {
                surfaceView.setZOrderMediaOverlay(true);
            } else if (C8044js.m30572equalsimpl0(i, aVar.m30578getOnTopB_4ceCc())) {
                surfaceView.setZOrderOnTop(true);
            }
            surfaceView.setSecure(this.f55211d);
        }
    }

    /* JADX INFO: renamed from: ks$h */
    public static final class h extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f55212C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f55213a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f55214b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f55215c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f55216d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f55217e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qy6<InterfaceC6986hs, bth> f55218f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f55219m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(InterfaceC0701e interfaceC0701e, boolean z, long j, int i, boolean z2, qy6<? super InterfaceC6986hs, bth> qy6Var, int i2, int i3) {
            super(2);
            this.f55213a = interfaceC0701e;
            this.f55214b = z;
            this.f55215c = j;
            this.f55216d = i;
            this.f55217e = z2;
            this.f55218f = qy6Var;
            this.f55219m = i2;
            this.f55212C = i3;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C8510ks.m30747AndroidExternalSurface58FFMhA(this.f55213a, this.f55214b, this.f55215c, this.f55216d, this.f55217e, this.f55218f, zl2Var, tsd.updateChangedFlags(this.f55219m | 1), this.f55212C);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30746AndroidEmbeddedExternalSurfacesv6N_fY(@p000.gib androidx.compose.p002ui.InterfaceC0701e r23, boolean r24, long r25, @p000.gib float[] r27, @p000.yfb p000.qy6<? super p000.InterfaceC6986hs, p000.bth> r28, @p000.gib p000.zl2 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8510ks.m30746AndroidEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.e, boolean, long, float[], qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30747AndroidExternalSurface58FFMhA(@p000.gib androidx.compose.p002ui.InterfaceC0701e r21, boolean r22, long r23, int r25, boolean r26, @p000.yfb p000.qy6<? super p000.InterfaceC6986hs, p000.bth> r27, @p000.gib p000.zl2 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8510ks.m30747AndroidExternalSurface58FFMhA(androidx.compose.ui.e, boolean, long, int, boolean, qy6, zl2, int, int):void");
    }

    @hk2
    private static final TextureViewSurfaceTextureListenerC5944fs rememberAndroidEmbeddedExternalSurfaceState(zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1057437053, i, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            xn2 xn2Var = new xn2(jx4.createCompositionCoroutineScope(a05.f2a, zl2Var));
            zl2Var.updateRememberedValue(xn2Var);
            objRememberedValue = xn2Var;
        }
        x13 coroutineScope = ((xn2) objRememberedValue).getCoroutineScope();
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new TextureViewSurfaceTextureListenerC5944fs(coroutineScope);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        TextureViewSurfaceTextureListenerC5944fs textureViewSurfaceTextureListenerC5944fs = (TextureViewSurfaceTextureListenerC5944fs) objRememberedValue2;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return textureViewSurfaceTextureListenerC5944fs;
    }

    @hk2
    private static final SurfaceHolderCallbackC7580is rememberAndroidExternalSurfaceState(zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-873615933, i, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            xn2 xn2Var = new xn2(jx4.createCompositionCoroutineScope(a05.f2a, zl2Var));
            zl2Var.updateRememberedValue(xn2Var);
            objRememberedValue = xn2Var;
        }
        x13 coroutineScope = ((xn2) objRememberedValue).getCoroutineScope();
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new SurfaceHolderCallbackC7580is(coroutineScope);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        SurfaceHolderCallbackC7580is surfaceHolderCallbackC7580is = (SurfaceHolderCallbackC7580is) objRememberedValue2;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return surfaceHolderCallbackC7580is;
    }
}
