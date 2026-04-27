package p000;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.C0629e;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.input.key.C0743a;
import p000.esg;
import p000.xl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,343:1\n1223#2,6:344\n1223#2,6:350\n1223#2,6:356\n1223#2,6:362\n1223#2,6:369\n77#3:368\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n*L\n133#1:344,6\n134#1:350,6\n145#1:356,6\n151#1:362,6\n313#1:369,6\n312#1:368\n*E\n"})
public final class ew0 {

    /* JADX INFO: renamed from: a */
    public static final long f34237a = 1500;

    /* JADX INFO: renamed from: b */
    public static final char f34238b = 8226;

    /* JADX INFO: renamed from: ew0$a */
    @ck3(m4009c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$1$1", m4010f = "BasicSecureTextField.kt", m4011i = {}, m4012l = {136}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5488a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f34239a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cue f34240b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5488a(cue cueVar, zy2<? super C5488a> zy2Var) {
            super(2, zy2Var);
            this.f34240b = cueVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C5488a(this.f34240b, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C5488a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f34239a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                cue cueVar = this.f34240b;
                this.f34239a = 1;
                if (cueVar.observeHideEvents(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: ew0$b */
    @ck3(m4009c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1", m4010f = "BasicSecureTextField.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5489b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f34241a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f34242b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cue f34243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5489b(boolean z, cue cueVar, zy2<? super C5489b> zy2Var) {
            super(2, zy2Var);
            this.f34242b = z;
            this.f34243c = cueVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C5489b(this.f34242b, this.f34243c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C5489b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f34241a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            if (!this.f34242b) {
                this.f34243c.getPasswordInputTransformation().hide();
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: ew0$c */
    public static final class C5490c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ wr8 f34244C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ qr8 f34245F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ gz6<c64, ny6<hug>, bth> f34246H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ l5b f34247L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ he1 f34248M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ n72 f34249N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ org f34250Q;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wsg f34251a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f34252b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f34253c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f34254d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ g48 f34255e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ cue f34256f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ yvg f34257m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5490c(wsg wsgVar, InterfaceC0701e interfaceC0701e, boolean z, boolean z2, g48 g48Var, cue cueVar, yvg yvgVar, wr8 wr8Var, qr8 qr8Var, gz6<? super c64, ? super ny6<hug>, bth> gz6Var, l5b l5bVar, he1 he1Var, n72 n72Var, org orgVar) {
            super(2);
            this.f34251a = wsgVar;
            this.f34252b = interfaceC0701e;
            this.f34253c = z;
            this.f34254d = z2;
            this.f34255e = g48Var;
            this.f34256f = cueVar;
            this.f34257m = yvgVar;
            this.f34244C = wr8Var;
            this.f34245F = qr8Var;
            this.f34246H = gz6Var;
            this.f34247L = l5bVar;
            this.f34248M = he1Var;
            this.f34249N = n72Var;
            this.f34250Q = orgVar;
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
                gm2.traceEventStart(2023988909, i, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
            }
            gw0.BasicTextField(this.f34251a, this.f34252b, this.f34253c, false, this.f34254d ? ew0.then(this.f34255e, this.f34256f.getPasswordInputTransformation()) : this.f34255e, this.f34257m, this.f34244C, this.f34245F, esg.C5459c.f33988b, this.f34246H, this.f34247L, this.f34248M, this.f34249N, null, this.f34250Q, null, true, zl2Var, 100666368, 1572864, 40960);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: ew0$d */
    public static final class C5491d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ gz6<c64, ny6<hug>, bth> f34258C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ l5b f34259F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ he1 f34260H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ org f34261L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ int f34262M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ char f34263N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ int f34264Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ int f34265X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f34266Y;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wsg f34267a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f34268b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f34269c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g48 f34270d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ yvg f34271e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wr8 f34272f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ qr8 f34273m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5491d(wsg wsgVar, InterfaceC0701e interfaceC0701e, boolean z, g48 g48Var, yvg yvgVar, wr8 wr8Var, qr8 qr8Var, gz6<? super c64, ? super ny6<hug>, bth> gz6Var, l5b l5bVar, he1 he1Var, org orgVar, int i, char c, int i2, int i3, int i4) {
            super(2);
            this.f34267a = wsgVar;
            this.f34268b = interfaceC0701e;
            this.f34269c = z;
            this.f34270d = g48Var;
            this.f34271e = yvgVar;
            this.f34272f = wr8Var;
            this.f34273m = qr8Var;
            this.f34258C = gz6Var;
            this.f34259F = l5bVar;
            this.f34260H = he1Var;
            this.f34261L = orgVar;
            this.f34262M = i;
            this.f34263N = c;
            this.f34264Q = i2;
            this.f34265X = i3;
            this.f34266Y = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            ew0.m28867BasicSecureTextFieldJb9bMDk(this.f34267a, this.f34268b, this.f34269c, this.f34270d, this.f34271e, this.f34272f, this.f34273m, this.f34258C, this.f34259F, this.f34260H, this.f34261L, this.f34262M, this.f34263N, zl2Var, tsd.updateChangedFlags(this.f34264Q | 1), tsd.updateChangedFlags(this.f34265X), this.f34266Y);
        }
    }

    /* JADX INFO: renamed from: ew0$e */
    public static final class C5492e extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5492e f34274a = new C5492e();

        /* JADX INFO: renamed from: ew0$e$a */
        public static final class a extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public static final a f34275a = new a();

            public a() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: renamed from: ew0$e$b */
        public static final class b extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public static final b f34276a = new b();

            public b() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        public C5492e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.password(eyeVar);
            bye.copyText$default(eyeVar, null, a.f34275a, 1, null);
            bye.cutText$default(eyeVar, null, b.f34276a, 1, null);
        }
    }

    /* JADX INFO: renamed from: ew0$f */
    @dwf({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt$DisableCutCopy$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,343:1\n71#2:344\n68#2,6:345\n74#2:379\n78#2:383\n78#3,6:351\n85#3,4:366\n89#3,2:376\n93#3:382\n368#4,9:357\n377#4:378\n378#4,2:380\n4032#5,6:370\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt$DisableCutCopy$1\n*L\n333#1:344\n333#1:345,6\n333#1:379\n333#1:383\n333#1:351,6\n333#1:366,4\n333#1:376,2\n333#1:382\n333#1:357,9\n333#1:378\n333#1:380,2\n333#1:370,6\n*E\n"})
    public static final class C5493f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<zl2, Integer, bth> f34277a;

        /* JADX INFO: renamed from: ew0$f$a */
        public static final class a extends tt8 implements qy6<kq8, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final a f34278a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ Boolean invoke(kq8 kq8Var) {
                return m28868invokeZmokQxo(kq8Var.m30741unboximpl());
            }

            @yfb
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m28868invokeZmokQxo(@yfb KeyEvent keyEvent) {
                hq8 hq8VarMo27875mapZmokQxo = br8.getPlatformDefaultKeyMapping().mo27875mapZmokQxo(keyEvent);
                return Boolean.valueOf(hq8VarMo27875mapZmokQxo == hq8.COPY || hq8VarMo27875mapZmokQxo == hq8.CUT);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5493f(gz6<? super zl2, ? super Integer, bth> gz6Var) {
            super(2);
            this.f34277a = gz6Var;
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
                gm2.traceEventStart(-1448819882, i, -1, "androidx.compose.foundation.text.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:332)");
            }
            InterfaceC0701e interfaceC0701eOnPreviewKeyEvent = C0743a.onPreviewKeyEvent(InterfaceC0701e.f5158d1, a.f34278a);
            gz6<zl2, Integer, bth> gz6Var = this.f34277a;
            uba ubaVarMaybeCachedBoxMeasurePolicy = pc1.maybeCachedBoxMeasurePolicy(InterfaceC9407mm.f61437a.getTopStart(), false);
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
            qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
            InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701eOnPreviewKeyEvent);
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
            twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVarMaybeCachedBoxMeasurePolicy, c15179a.getSetMeasurePolicy());
            twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
            C0629e c0629e = C0629e.f4557a;
            gz6Var.invoke(zl2Var, 0);
            zl2Var.endNode();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: ew0$g */
    public static final class C5494g extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<zl2, Integer, bth> f34279a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5494g(gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f34279a = gz6Var;
            this.f34280b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            ew0.DisableCutCopy(this.f34279a, zl2Var, tsd.updateChangedFlags(this.f34280b | 1));
        }
    }

    /* JADX INFO: renamed from: ew0$h */
    public static final class C5495h implements awg {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ awg f34281a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ awg f34282b;

        public C5495h(awg awgVar) {
            this.f34282b = awgVar;
            this.f34281a = awgVar;
        }

        @Override // p000.awg
        @yfb
        public dwg getStatus() {
            return this.f34281a.getStatus();
        }

        @Override // p000.awg
        public void hide() {
            this.f34281a.hide();
        }

        @Override // p000.awg
        public void showMenu(@yfb rud rudVar, @gib ny6<bth> ny6Var, @gib ny6<bth> ny6Var2, @gib ny6<bth> ny6Var3, @gib ny6<bth> ny6Var4) {
            this.f34282b.showMenu(rudVar, null, ny6Var2, null, ny6Var4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* JADX INFO: renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m28867BasicSecureTextFieldJb9bMDk(@p000.yfb p000.wsg r37, @p000.gib androidx.compose.p002ui.InterfaceC0701e r38, boolean r39, @p000.gib p000.g48 r40, @p000.gib p000.yvg r41, @p000.gib p000.wr8 r42, @p000.gib p000.qr8 r43, @p000.gib p000.gz6<? super p000.c64, ? super p000.ny6<p000.hug>, p000.bth> r44, @p000.gib p000.l5b r45, @p000.gib p000.he1 r46, @p000.gib p000.org r47, int r48, char r49, @p000.gib p000.zl2 r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ew0.m28867BasicSecureTextFieldJb9bMDk(wsg, androidx.compose.ui.e, boolean, g48, yvg, wr8, qr8, gz6, l5b, he1, org, int, char, zl2, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(i2g i2gVar, int i, int i2) {
        return ((Character) i2gVar.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DisableCutCopy(gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1085555050);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(gz6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1085555050, i2, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)");
            }
            awg awgVar = (awg) zl2VarStartRestartGroup.consume(sn2.getLocalTextToolbar());
            boolean zChanged = zl2VarStartRestartGroup.changed(awgVar);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C5495h(awgVar);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            pn2.CompositionLocalProvider(sn2.getLocalTextToolbar().provides((C5495h) objRememberedValue), mk2.rememberComposableLambda(-1448819882, true, new C5493f(gz6Var), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, did.f29712i | 48);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C5494g(gz6Var, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g48 then(g48 g48Var, g48 g48Var2) {
        return g48Var == null ? g48Var2 : g48Var2 == null ? g48Var : i48.then(g48Var, g48Var2);
    }
}
