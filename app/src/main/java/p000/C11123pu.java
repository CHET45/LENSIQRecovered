package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.C0765r;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import androidx.compose.p002ui.window.PopupLayout;
import androidx.mediarouter.media.C1340j;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p000.xl2;

/* JADX INFO: renamed from: pu */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,980:1\n1223#2,6:981\n1223#2,6:991\n1223#2,6:997\n1223#2,6:1003\n1223#2,6:1009\n1223#2,6:1015\n1223#2,6:1021\n1223#2,6:1027\n77#3:987\n77#3:988\n77#3:989\n77#3:990\n78#4,6:1033\n85#4,4:1048\n89#4,2:1058\n93#4:1063\n78#4,6:1064\n85#4,4:1079\n89#4,2:1089\n93#4:1094\n368#5,9:1039\n377#5,3:1060\n368#5,9:1070\n377#5,3:1091\n4032#6,6:1052\n4032#6,6:1083\n81#7:1095\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n270#1:981,6\n311#1:991,6\n339#1:997,6\n354#1:1003,6\n363#1:1009,6\n375#1:1015,6\n388#1:1021,6\n396#1:1027,6\n304#1:987\n305#1:988\n306#1:989\n307#1:990\n385#1:1033,6\n385#1:1048,4\n385#1:1058,2\n385#1:1063\n438#1:1064,6\n438#1:1079,4\n438#1:1089,2\n438#1:1094\n385#1:1039,9\n385#1:1060,3\n438#1:1070,9\n438#1:1091,3\n385#1:1052,6\n438#1:1083,6\n309#1:1095\n*E\n"})
public final class C11123pu {

    /* JADX INFO: renamed from: a */
    public static final int f72012a = 262144;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final zhd<String> f72013b = pn2.compositionLocalOf$default(null, a.f72014a, 1, null);

    /* JADX INFO: renamed from: pu$a */
    public static final class a extends tt8 implements ny6<String> {

        /* JADX INFO: renamed from: a */
        public static final a f72014a = new a();

        public a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX INFO: renamed from: pu$b */
    public static final class b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9407mm f72015a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f72016b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<bth> f72017c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ y4d f72018d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<zl2, Integer, bth> f72019e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f72020f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f72021m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC9407mm interfaceC9407mm, long j, ny6<bth> ny6Var, y4d y4dVar, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f72015a = interfaceC9407mm;
            this.f72016b = j;
            this.f72017c = ny6Var;
            this.f72018d = y4dVar;
            this.f72019e = gz6Var;
            this.f72020f = i;
            this.f72021m = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C11123pu.m31868PopupK5zGePQ(this.f72015a, this.f72016b, this.f72017c, this.f72018d, this.f72019e, zl2Var, tsd.updateChangedFlags(this.f72020f | 1), this.f72021m);
        }
    }

    /* JADX INFO: renamed from: pu$c */
    @dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,980:1\n64#2,5:981\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1\n*L\n347#1:981,5\n*E\n"})
    public static final class c extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PopupLayout f72022a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f72023b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y4d f72024c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f72025d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ov8 f72026e;

        /* JADX INFO: renamed from: pu$c$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1\n*L\n1#1,497:1\n348#2,4:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PopupLayout f72027a;

            public a(PopupLayout popupLayout) {
                this.f72027a = popupLayout;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f72027a.disposeComposition();
                this.f72027a.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PopupLayout popupLayout, ny6<bth> ny6Var, y4d y4dVar, String str, ov8 ov8Var) {
            super(1);
            this.f72022a = popupLayout;
            this.f72023b = ny6Var;
            this.f72024c = y4dVar;
            this.f72025d = str;
            this.f72026e = ov8Var;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f72022a.show();
            this.f72022a.updateParameters(this.f72023b, this.f72024c, this.f72025d, this.f72026e);
            return new a(this.f72022a);
        }
    }

    /* JADX INFO: renamed from: pu$d */
    public static final class d extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PopupLayout f72028a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f72029b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y4d f72030c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f72031d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ov8 f72032e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PopupLayout popupLayout, ny6<bth> ny6Var, y4d y4dVar, String str, ov8 ov8Var) {
            super(0);
            this.f72028a = popupLayout;
            this.f72029b = ny6Var;
            this.f72030c = y4dVar;
            this.f72031d = str;
            this.f72032e = ov8Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f72028a.updateParameters(this.f72029b, this.f72030c, this.f72031d, this.f72032e);
        }
    }

    /* JADX INFO: renamed from: pu$e */
    @dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,980:1\n64#2,5:981\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1\n*L\n366#1:981,5\n*E\n"})
    public static final class e extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PopupLayout f72033a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x4d f72034b;

        /* JADX INFO: renamed from: pu$e$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1\n*L\n1#1,497:1\n366#2:498\n*E\n"})
        public static final class a implements vf4 {
            @Override // p000.vf4
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PopupLayout popupLayout, x4d x4dVar) {
            super(1);
            this.f72033a = popupLayout;
            this.f72034b = x4dVar;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f72033a.setPositionProvider(this.f72034b);
            this.f72033a.updatePosition();
            return new a();
        }
    }

    /* JADX INFO: renamed from: pu$f */
    @ck3(m4009c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", m4010f = "AndroidPopup.android.kt", m4011i = {0}, m4012l = {377}, m4013m = "invokeSuspend", m4014n = {"$this$LaunchedEffect"}, m4015s = {"L$0"})
    public static final class f extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f72035a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f72036b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PopupLayout f72037c;

        /* JADX INFO: renamed from: pu$f$a */
        public static final class a extends tt8 implements qy6<Long, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f72038a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Long l) {
                invoke(l.longValue());
                return bth.f14751a;
            }

            public final void invoke(long j) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PopupLayout popupLayout, zy2<? super f> zy2Var) {
            super(2, zy2Var);
            this.f72037c = popupLayout;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            f fVar = new f(this.f72037c, zy2Var);
            fVar.f72036b = obj;
            return fVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r3.f72035a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f72036b
                x13 r1 = (p000.x13) r1
                p000.y7e.throwOnFailure(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                p000.y7e.throwOnFailure(r4)
                java.lang.Object r4 = r3.f72036b
                x13 r4 = (p000.x13) r4
                r1 = r4
            L23:
                boolean r4 = p000.y13.isActive(r1)
                if (r4 == 0) goto L3c
                pu$f$a r4 = p000.C11123pu.f.a.f72038a
                r3.f72036b = r1
                r3.f72035a = r2
                java.lang.Object r4 = p000.e18.withInfiniteAnimationFrameNanos(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.PopupLayout r4 = r3.f72037c
                r4.pollForLocationOnScreenChange()
                goto L23
            L3c:
                bth r4 = p000.bth.f14751a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C11123pu.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pu$g */
    public static final class g extends tt8 implements qy6<mv8, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PopupLayout f72039a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PopupLayout popupLayout) {
            super(1);
            this.f72039a = popupLayout;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mv8 mv8Var) {
            invoke2(mv8Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb mv8 mv8Var) {
            mv8 parentLayoutCoordinates = mv8Var.getParentLayoutCoordinates();
            md8.checkNotNull(parentLayoutCoordinates);
            this.f72039a.updateParentLayoutCoordinates(parentLayoutCoordinates);
        }
    }

    /* JADX INFO: renamed from: pu$h */
    public static final class h implements uba {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PopupLayout f72040a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ov8 f72041b;

        /* JADX INFO: renamed from: pu$h$a */
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f72042a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
            }
        }

        public h(PopupLayout popupLayout, ov8 ov8Var) {
            this.f72040a = popupLayout;
            this.f72041b = ov8Var;
        }

        @Override // p000.uba
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
            this.f72040a.setParentLayoutDirection(this.f72041b);
            return InterfaceC0761n.layout$default(interfaceC0761n, 0, 0, null, a.f72042a, 4, null);
        }
    }

    /* JADX INFO: renamed from: pu$i */
    public static final class i extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x4d f72043a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f72044b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y4d f72045c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<zl2, Integer, bth> f72046d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f72047e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f72048f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(x4d x4dVar, ny6<bth> ny6Var, y4d y4dVar, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f72043a = x4dVar;
            this.f72044b = ny6Var;
            this.f72045c = y4dVar;
            this.f72046d = gz6Var;
            this.f72047e = i;
            this.f72048f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C11123pu.Popup(this.f72043a, this.f72044b, this.f72045c, this.f72046d, zl2Var, tsd.updateChangedFlags(this.f72047e | 1), this.f72048f);
        }
    }

    /* JADX INFO: renamed from: pu$j */
    public static final class j extends tt8 implements ny6<UUID> {

        /* JADX INFO: renamed from: a */
        public static final j f72049a = new j();

        public j() {
            super(0);
        }

        @Override // p000.ny6
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: renamed from: pu$k */
    @dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,980:1\n1223#2,6:981\n437#3,2:987\n465#3:1020\n78#4,6:989\n85#4,4:1004\n89#4,2:1014\n93#4:1019\n368#5,9:995\n377#5,3:1016\n4032#6,6:1008\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n*L\n326#1:981,6\n322#1:987,2\n322#1:1020\n322#1:989,6\n322#1:1004,4\n322#1:1014,2\n322#1:1019\n322#1:995,9\n322#1:1016,3\n322#1:1008,6\n*E\n"})
    public static final class k extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PopupLayout f72050a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ i2g<gz6<zl2, Integer, bth>> f72051b;

        /* JADX INFO: renamed from: pu$k$a */
        public static final class a extends tt8 implements qy6<eye, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f72052a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
                invoke2(eyeVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb eye eyeVar) {
                bye.popup(eyeVar);
            }
        }

        /* JADX INFO: renamed from: pu$k$b */
        public static final class b extends tt8 implements qy6<r78, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PopupLayout f72053a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PopupLayout popupLayout) {
                super(1);
                this.f72053a = popupLayout;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(r78 r78Var) {
                m31869invokeozmzZPI(r78Var.m32091unboximpl());
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m31869invokeozmzZPI(long j) {
                this.f72053a.m27762setPopupContentSizefhxjrPA(r78.m32079boximpl(j));
                this.f72053a.updatePosition();
            }
        }

        /* JADX INFO: renamed from: pu$k$c */
        public static final class c extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<gz6<zl2, Integer, bth>> f72054a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(i2g<? extends gz6<? super zl2, ? super Integer, bth>> i2gVar) {
                super(2);
                this.f72054a = i2gVar;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                invoke(zl2Var, num.intValue());
                return bth.f14751a;
            }

            @bl2(applier = "androidx.compose.ui.UiComposable")
            @hk2
            public final void invoke(@gib zl2 zl2Var, int i) {
                if ((i & 3) == 2 && zl2Var.getSkipping()) {
                    zl2Var.skipToGroupEnd();
                    return;
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(606497925, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                }
                C11123pu.Popup$lambda$1(this.f72054a).invoke(zl2Var, 0);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(PopupLayout popupLayout, i2g<? extends gz6<? super zl2, ? super Integer, bth>> i2gVar) {
            super(2);
            this.f72050a = popupLayout;
            this.f72051b = i2gVar;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1302892335, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
            }
            InterfaceC0701e interfaceC0701eSemantics$default = qxe.semantics$default(InterfaceC0701e.f5158d1, false, a.f72052a, 1, null);
            boolean zChangedInstance = zl2Var.changedInstance(this.f72050a);
            PopupLayout popupLayout = this.f72050a;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new b(popupLayout);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            InterfaceC0701e interfaceC0701eAlpha = C7985jn.alpha(C0765r.onSizeChanged(interfaceC0701eSemantics$default, (qy6) objRememberedValue), this.f72050a.getCanCalculatePosition() ? 1.0f : 0.0f);
            kk2 kk2VarRememberComposableLambda = mk2.rememberComposableLambda(606497925, true, new c(this.f72051b), zl2Var, 54);
            m mVar = m.f72058a;
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
            qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
            InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701eAlpha);
            xl2.C15179a c15179a = xl2.f98343p;
            ny6<xl2> constructor = c15179a.getConstructor();
            if (zl2Var.getApplier() == null) {
                dl2.invalidApplier();
            }
            zl2Var.startReusableNode();
            if (zl2Var.getInserting()) {
                zl2Var.createNode(constructor);
            } else {
                zl2Var.useNode();
            }
            zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
            twh.m32456setimpl(zl2VarM32449constructorimpl, mVar, c15179a.getSetMeasurePolicy());
            twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
            kk2VarRememberComposableLambda.invoke(zl2Var, 6);
            zl2Var.endNode();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: pu$l */
    public static final class l extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f72055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f72056b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f72057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(String str, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f72055a = str;
            this.f72056b = gz6Var;
            this.f72057c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C11123pu.PopupTestTag(this.f72055a, this.f72056b, zl2Var, tsd.updateChangedFlags(this.f72057c | 1));
        }
    }

    /* JADX INFO: renamed from: pu$m */
    @dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,980:1\n151#2,3:981\n33#2,4:984\n154#2,2:988\n38#2:990\n156#2:991\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n*L\n448#1:981,3\n448#1:984,4\n448#1:988,2\n448#1:990\n448#1:991\n*E\n"})
    public static final class m implements uba {

        /* JADX INFO: renamed from: a */
        public static final m f72058a = new m();

        /* JADX INFO: renamed from: pu$m$a */
        @dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1\n*L\n1#1,980:1\n*E\n"})
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f72059a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
            }
        }

        /* JADX INFO: renamed from: pu$m$b */
        @dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$2\n*L\n1#1,980:1\n*E\n"})
        public static final class b extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC0767t f72060a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC0767t abstractC0767t) {
                super(1);
                this.f72060a = abstractC0767t;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                AbstractC0767t.a.placeRelative$default(aVar, this.f72060a, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX INFO: renamed from: pu$m$c */
        @dwf({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$3\n*L\n1#1,980:1\n*E\n"})
        public static final class c extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List<AbstractC0767t> f72061a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends AbstractC0767t> list) {
                super(1);
                this.f72061a = list;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                int lastIndex = l82.getLastIndex(this.f72061a);
                if (lastIndex < 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    AbstractC0767t.a.placeRelative$default(aVar, this.f72061a.get(i), 0, 0, 0.0f, 4, null);
                    if (i == lastIndex) {
                        return;
                    } else {
                        i++;
                    }
                }
            }
        }

        @Override // p000.uba
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
            int i;
            int i2;
            int size = list.size();
            if (size == 0) {
                return InterfaceC0761n.layout$default(interfaceC0761n, 0, 0, null, a.f72059a, 4, null);
            }
            int i3 = 0;
            if (size == 1) {
                AbstractC0767t abstractC0767tMo27949measureBRTryo0 = list.get(0).mo27949measureBRTryo0(j);
                return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new b(abstractC0767tMo27949measureBRTryo0), 4, null);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList.add(list.get(i4).mo27949measureBRTryo0(j));
            }
            int lastIndex = l82.getLastIndex(arrayList);
            if (lastIndex >= 0) {
                int iMax = 0;
                int iMax2 = 0;
                while (true) {
                    AbstractC0767t abstractC0767t = (AbstractC0767t) arrayList.get(i3);
                    iMax = Math.max(iMax, abstractC0767t.getWidth());
                    iMax2 = Math.max(iMax2, abstractC0767t.getHeight());
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
                i = iMax;
                i2 = iMax2;
            } else {
                i = 0;
                i2 = 0;
            }
            return InterfaceC0761n.layout$default(interfaceC0761n, i, i2, null, new c(arrayList), 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Popup(@p000.yfb p000.x4d r35, @p000.gib p000.ny6<p000.bth> r36, @p000.gib p000.y4d r37, @p000.yfb p000.gz6<? super p000.zl2, ? super java.lang.Integer, p000.bth> r38, @p000.gib p000.zl2 r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11123pu.Popup(x4d, ny6, y4d, gz6, zl2, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gz6<zl2, Integer, bth> Popup$lambda$1(i2g<? extends gz6<? super zl2, ? super Integer, bth>> i2gVar) {
        return (gz6) i2gVar.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m31868PopupK5zGePQ(@p000.gib p000.InterfaceC9407mm r24, long r25, @p000.gib p000.ny6<p000.bth> r27, @p000.gib p000.y4d r28, @p000.yfb p000.gz6<? super p000.zl2, ? super java.lang.Integer, p000.bth> r29, @p000.gib p000.zl2 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11123pu.m31868PopupK5zGePQ(mm, long, ny6, y4d, gz6, zl2, int, int):void");
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void PopupTestTag(@yfb String str, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-498879600);
        if ((i2 & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-498879600, i3, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:428)");
            }
            pn2.CompositionLocalProvider(f72013b.provides(str), gz6Var, zl2VarStartRestartGroup, (i3 & 112) | did.f29712i);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new l(str, gz6Var, i2));
        }
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(InterfaceC0701e interfaceC0701e, gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i2) {
        m mVar = m.f72058a;
        int i3 = ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 384;
        int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
        qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
        InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701e);
        xl2.C15179a c15179a = xl2.f98343p;
        ny6<xl2> constructor = c15179a.getConstructor();
        int i4 = ((i3 << 6) & C1340j.f10444b) | 6;
        if (zl2Var.getApplier() == null) {
            dl2.invalidApplier();
        }
        zl2Var.startReusableNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(constructor);
        } else {
            zl2Var.useNode();
        }
        zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
        twh.m32456setimpl(zl2VarM32449constructorimpl, mVar, c15179a.getSetMeasurePolicy());
        twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
        gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
        if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
        gz6Var.invoke(zl2Var, Integer.valueOf((i4 >> 6) & 14));
        zl2Var.endNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createFlags(boolean z, yte yteVar, boolean z2) {
        int i2 = !z ? 262152 : 262144;
        if (yteVar == yte.SecureOn) {
            i2 |= 8192;
        }
        return !z2 ? i2 | 512 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int flagsWithSecureFlagInherited(y4d y4dVar, boolean z) {
        return (y4dVar.getInheritSecurePolicy$ui_release() && z) ? y4dVar.getFlags$ui_release() | 8192 : (!y4dVar.getInheritSecurePolicy$ui_release() || z) ? y4dVar.getFlags$ui_release() : y4dVar.getFlags$ui_release() & (-8193);
    }

    @yfb
    public static final zhd<String> getLocalPopupTestTag() {
        return f72013b;
    }

    public static final boolean isFlagSecureEnabled(@yfb View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    @dpg
    public static final boolean isPopupLayout(@yfb View view, @gib String str) {
        return (view instanceof PopupLayout) && (str == null || md8.areEqual(str, ((PopupLayout) view).getTestTag()));
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l78 toIntBounds(Rect rect) {
        return new l78(rect.left, rect.top, rect.right, rect.bottom);
    }
}
