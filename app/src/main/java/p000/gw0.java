package p000;

import androidx.compose.foundation.C0617l;
import androidx.compose.foundation.layout.C0626c0;
import androidx.compose.foundation.layout.C0629e;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import org.opencv.videoio.Videoio;
import p000.esg;
import p000.xl2;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,868:1\n77#2:869\n77#2:870\n77#2:871\n77#2:897\n77#2:898\n77#2:899\n1223#3,6:872\n1223#3,3:878\n1226#3,3:882\n1223#3,6:885\n1223#3,6:891\n1223#3,6:900\n1223#3,6:906\n1223#3,6:952\n1223#3,6:958\n1223#3,6:964\n1223#3,6:970\n1223#3,6:976\n1223#3,6:982\n1223#3,6:988\n1223#3,6:994\n1223#3,6:1000\n1223#3,6:1006\n1223#3,6:1012\n1223#3,6:1018\n1223#3,6:1024\n1223#3,6:1030\n1223#3,6:1036\n1223#3,6:1042\n1#4:881\n71#5:912\n68#5,6:913\n74#5:947\n78#5:951\n78#6,6:919\n85#6,4:934\n89#6,2:944\n93#6:950\n368#7,9:925\n377#7:946\n378#7,2:948\n4032#8,6:938\n81#9:1048\n81#9:1049\n81#9:1050\n81#9:1051\n107#9,2:1052\n81#9:1054\n107#9,2:1055\n148#10:1057\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n240#1:869\n241#1:870\n242#1:871\n285#1:897\n286#1:898\n287#1:899\n246#1:872,6\n252#1:878,3\n252#1:882,3\n272#1:885,6\n274#1:891,6\n288#1:900,6\n304#1:906,6\n417#1:952,6\n424#1:958,6\n430#1:964,6\n443#1:970,6\n450#1:976,6\n458#1:982,6\n466#1:988,6\n473#1:994,6\n481#1:1000,6\n615#1:1006,6\n621#1:1012,6\n630#1:1018,6\n634#1:1024,6\n767#1:1030,6\n804#1:1036,6\n844#1:1042,6\n343#1:912\n343#1:913,6\n343#1:947\n343#1:951\n343#1:919,6\n343#1:934,4\n343#1:944,2\n343#1:950\n343#1:925,9\n343#1:946\n343#1:948,2\n343#1:938,6\n417#1:1048\n443#1:1049\n466#1:1050\n615#1:1051\n615#1:1052,2\n630#1:1054\n630#1:1055,2\n500#1:1057\n*E\n"})
public final class gw0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final org f41522a = C6615q.f41692a;

    /* JADX INFO: renamed from: b */
    public static final long f41523b;

    /* JADX INFO: renamed from: gw0$a */
    public static final class C6597a extends tt8 implements qy6<hug, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6597a f41524a = new C6597a();

        public C6597a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(hug hugVar) {
            invoke2(hugVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb hug hugVar) {
        }
    }

    /* JADX INFO: renamed from: gw0$a0 */
    public static final class C6598a0 extends tt8 implements ny6<xrg> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6598a0(rsg rsgVar) {
            super(0);
            this.f41525a = rsgVar;
        }

        @Override // p000.ny6
        @yfb
        public final xrg invoke() {
            return this.f41525a.getSelectionHandleState$foundation_release(false, false);
        }
    }

    /* JADX INFO: renamed from: gw0$b */
    public static final class C6599b extends tt8 implements qy6<zsg, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zsg f41526a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<zsg, bth> f41527b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6599b(zsg zsgVar, qy6<? super zsg, bth> qy6Var) {
            super(1);
            this.f41526a = zsgVar;
            this.f41527b = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(zsg zsgVar) {
            invoke2(zsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb zsg zsgVar) {
            if (md8.areEqual(this.f41526a, zsgVar)) {
                return;
            }
            this.f41527b.invoke(zsgVar);
        }
    }

    /* JADX INFO: renamed from: gw0$b0 */
    public static final class C6600b0 extends tt8 implements ny6<xrg> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6600b0(rsg rsgVar) {
            super(0);
            this.f41528a = rsgVar;
        }

        @Override // p000.ny6
        @yfb
        public final xrg invoke() {
            return this.f41528a.getSelectionHandleState$foundation_release(true, false);
        }
    }

    /* JADX INFO: renamed from: gw0$c */
    public static final class C6601c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ tr8 f41529C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f41530F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f41531H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f41532L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ kdi f41533M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ int f41534M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ qy6<hug, bth> f41535N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ l5b f41536Q;

        /* JADX INFO: renamed from: V1 */
        public final /* synthetic */ int f41537V1;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ he1 f41538X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> f41539Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f41540Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zsg f41541a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<zsg, bth> f41542b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f41543c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f41544d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f41545e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yvg f41546f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ wr8 f41547m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6601c(zsg zsgVar, qy6<? super zsg, bth> qy6Var, InterfaceC0701e interfaceC0701e, boolean z, boolean z2, yvg yvgVar, wr8 wr8Var, tr8 tr8Var, boolean z3, int i, int i2, kdi kdiVar, qy6<? super hug, bth> qy6Var2, l5b l5bVar, he1 he1Var, kz6<? super gz6<? super zl2, ? super Integer, bth>, ? super zl2, ? super Integer, bth> kz6Var, int i3, int i4, int i5) {
            super(2);
            this.f41541a = zsgVar;
            this.f41542b = qy6Var;
            this.f41543c = interfaceC0701e;
            this.f41544d = z;
            this.f41545e = z2;
            this.f41546f = yvgVar;
            this.f41547m = wr8Var;
            this.f41529C = tr8Var;
            this.f41530F = z3;
            this.f41531H = i;
            this.f41532L = i2;
            this.f41533M = kdiVar;
            this.f41535N = qy6Var2;
            this.f41536Q = l5bVar;
            this.f41538X = he1Var;
            this.f41539Y = kz6Var;
            this.f41540Z = i3;
            this.f41534M1 = i4;
            this.f41537V1 = i5;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.BasicTextField(this.f41541a, this.f41542b, this.f41543c, this.f41544d, this.f41545e, this.f41546f, this.f41547m, this.f41529C, this.f41530F, this.f41531H, this.f41532L, this.f41533M, this.f41535N, this.f41536Q, this.f41538X, this.f41539Y, zl2Var, tsd.updateChangedFlags(this.f41540Z | 1), tsd.updateChangedFlags(this.f41534M1), this.f41537V1);
        }
    }

    /* JADX INFO: renamed from: gw0$d */
    public static final class C6602d extends tt8 implements qy6<hug, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6602d f41548a = new C6602d();

        public C6602d() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(hug hugVar) {
            invoke2(hugVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb hug hugVar) {
        }
    }

    /* JADX INFO: renamed from: gw0$e */
    public static final class C6603e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ tr8 f41549C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f41550F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f41551H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ kdi f41552L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ qy6<hug, bth> f41553M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ int f41554M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ l5b f41555N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ he1 f41556Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> f41557X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f41558Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f41559Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f41560a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<String, bth> f41561b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f41562c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f41563d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f41564e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yvg f41565f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ wr8 f41566m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6603e(String str, qy6<? super String, bth> qy6Var, InterfaceC0701e interfaceC0701e, boolean z, boolean z2, yvg yvgVar, wr8 wr8Var, tr8 tr8Var, boolean z3, int i, kdi kdiVar, qy6<? super hug, bth> qy6Var2, l5b l5bVar, he1 he1Var, kz6<? super gz6<? super zl2, ? super Integer, bth>, ? super zl2, ? super Integer, bth> kz6Var, int i2, int i3, int i4) {
            super(2);
            this.f41560a = str;
            this.f41561b = qy6Var;
            this.f41562c = interfaceC0701e;
            this.f41563d = z;
            this.f41564e = z2;
            this.f41565f = yvgVar;
            this.f41566m = wr8Var;
            this.f41549C = tr8Var;
            this.f41550F = z3;
            this.f41551H = i;
            this.f41552L = kdiVar;
            this.f41553M = qy6Var2;
            this.f41555N = l5bVar;
            this.f41556Q = he1Var;
            this.f41557X = kz6Var;
            this.f41558Y = i2;
            this.f41559Z = i3;
            this.f41554M1 = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.BasicTextField(this.f41560a, this.f41561b, this.f41562c, this.f41563d, this.f41564e, this.f41565f, this.f41566m, this.f41549C, this.f41550F, this.f41551H, this.f41552L, this.f41553M, this.f41555N, this.f41556Q, this.f41557X, zl2Var, tsd.updateChangedFlags(this.f41558Y | 1), tsd.updateChangedFlags(this.f41559Z), this.f41554M1);
        }
    }

    /* JADX INFO: renamed from: gw0$f */
    public static final class C6604f extends tt8 implements qy6<hug, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6604f f41567a = new C6604f();

        public C6604f() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(hug hugVar) {
            invoke2(hugVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb hug hugVar) {
        }
    }

    /* JADX INFO: renamed from: gw0$g */
    public static final class C6605g extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ tr8 f41568C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f41569F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f41570H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ kdi f41571L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ qy6<hug, bth> f41572M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ int f41573M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ l5b f41574N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ he1 f41575Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> f41576X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f41577Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f41578Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zsg f41579a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<zsg, bth> f41580b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f41581c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f41582d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f41583e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yvg f41584f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ wr8 f41585m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6605g(zsg zsgVar, qy6<? super zsg, bth> qy6Var, InterfaceC0701e interfaceC0701e, boolean z, boolean z2, yvg yvgVar, wr8 wr8Var, tr8 tr8Var, boolean z3, int i, kdi kdiVar, qy6<? super hug, bth> qy6Var2, l5b l5bVar, he1 he1Var, kz6<? super gz6<? super zl2, ? super Integer, bth>, ? super zl2, ? super Integer, bth> kz6Var, int i2, int i3, int i4) {
            super(2);
            this.f41579a = zsgVar;
            this.f41580b = qy6Var;
            this.f41581c = interfaceC0701e;
            this.f41582d = z;
            this.f41583e = z2;
            this.f41584f = yvgVar;
            this.f41585m = wr8Var;
            this.f41568C = tr8Var;
            this.f41569F = z3;
            this.f41570H = i;
            this.f41571L = kdiVar;
            this.f41572M = qy6Var2;
            this.f41574N = l5bVar;
            this.f41575Q = he1Var;
            this.f41576X = kz6Var;
            this.f41577Y = i2;
            this.f41578Z = i3;
            this.f41573M1 = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.BasicTextField(this.f41579a, this.f41580b, this.f41581c, this.f41582d, this.f41583e, this.f41584f, this.f41585m, this.f41568C, this.f41569F, this.f41570H, this.f41571L, this.f41572M, this.f41574N, this.f41575Q, this.f41576X, zl2Var, tsd.updateChangedFlags(this.f41577Y | 1), tsd.updateChangedFlags(this.f41578Z), this.f41573M1);
        }
    }

    /* JADX INFO: renamed from: gw0$h */
    public static final class C6606h extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qr8 f41586C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ esg f41587F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ gz6<c64, ny6<hug>, bth> f41588H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ l5b f41589L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ he1 f41590M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ int f41591M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ l9c f41592N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ org f41593Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ C0617l f41594X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f41595Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f41596Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wsg f41597a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f41598b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f41599c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f41600d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ g48 f41601e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yvg f41602f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ wr8 f41603m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6606h(wsg wsgVar, InterfaceC0701e interfaceC0701e, boolean z, boolean z2, g48 g48Var, yvg yvgVar, wr8 wr8Var, qr8 qr8Var, esg esgVar, gz6<? super c64, ? super ny6<hug>, bth> gz6Var, l5b l5bVar, he1 he1Var, l9c l9cVar, org orgVar, C0617l c0617l, int i, int i2, int i3) {
            super(2);
            this.f41597a = wsgVar;
            this.f41598b = interfaceC0701e;
            this.f41599c = z;
            this.f41600d = z2;
            this.f41601e = g48Var;
            this.f41602f = yvgVar;
            this.f41603m = wr8Var;
            this.f41586C = qr8Var;
            this.f41587F = esgVar;
            this.f41588H = gz6Var;
            this.f41589L = l5bVar;
            this.f41590M = he1Var;
            this.f41592N = l9cVar;
            this.f41593Q = orgVar;
            this.f41594X = c0617l;
            this.f41595Y = i;
            this.f41596Z = i2;
            this.f41591M1 = i3;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.BasicTextField(this.f41597a, this.f41598b, this.f41599c, this.f41600d, this.f41601e, this.f41602f, this.f41603m, this.f41586C, this.f41587F, this.f41588H, this.f41589L, this.f41590M, this.f41592N, this.f41593Q, this.f41594X, zl2Var, tsd.updateChangedFlags(this.f41595Y | 1), tsd.updateChangedFlags(this.f41596Z), this.f41591M1);
        }
    }

    /* JADX INFO: renamed from: gw0$i */
    public static final class C6607i extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f41604C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f41605F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean f41606H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jeh f41607a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g48 f41608b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f41609c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ lg7 f41610d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ a52 f41611e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ awg f41612f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ c64 f41613m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6607i(jeh jehVar, g48 g48Var, rsg rsgVar, lg7 lg7Var, a52 a52Var, awg awgVar, c64 c64Var, boolean z, boolean z2, boolean z3) {
            super(0);
            this.f41607a = jehVar;
            this.f41608b = g48Var;
            this.f41609c = rsgVar;
            this.f41610d = lg7Var;
            this.f41611e = a52Var;
            this.f41612f = awgVar;
            this.f41613m = c64Var;
            this.f41604C = z;
            this.f41605F = z2;
            this.f41606H = z3;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f41607a.update(this.f41608b);
            this.f41609c.update(this.f41610d, this.f41611e, this.f41612f, this.f41613m, this.f41604C, this.f41605F, this.f41606H);
        }
    }

    /* JADX INFO: renamed from: gw0$j */
    @dwf({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,868:1\n64#2,5:869\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$3$1\n*L\n305#1:869,5\n*E\n"})
    public static final class C6608j extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41614a;

        /* JADX INFO: renamed from: gw0$j$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$3$1\n*L\n1#1,497:1\n306#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ rsg f41615a;

            public a(rsg rsgVar) {
                this.f41615a = rsgVar;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f41615a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6608j(rsg rsgVar) {
            super(1);
            this.f41614a = rsgVar;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f41614a);
        }
    }

    /* JADX INFO: renamed from: gw0$k */
    public static final class C6609k extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ jeh f41616C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ rsg f41617F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ he1 f41618H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ boolean f41619L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ boolean f41620M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ C0617l f41621N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ t7c f41622Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ boolean f41623X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ gz6<c64, ny6<hug>, bth> f41624Y;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ org f41625a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ esg f41626b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ lug f41627c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ yvg f41628d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f41629e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f41630f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ boolean f41631m;

        /* JADX INFO: renamed from: gw0$k$a */
        @dwf({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,868:1\n71#2:869\n68#2,6:870\n74#2:904\n78#2:908\n78#3,6:876\n85#3,4:891\n89#3,2:901\n93#3:907\n368#4,9:882\n377#4:903\n378#4,2:905\n4032#5,6:895\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1$1\n*L\n357#1:869\n357#1:870,6\n357#1:904\n357#1:908\n357#1:876,6\n357#1:891,4\n357#1:901,2\n357#1:907\n357#1:882,9\n357#1:903\n357#1:905,2\n357#1:895,6\n*E\n"})
        public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ rsg f41632C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ he1 f41633F;

            /* JADX INFO: renamed from: H */
            public final /* synthetic */ boolean f41634H;

            /* JADX INFO: renamed from: L */
            public final /* synthetic */ boolean f41635L;

            /* JADX INFO: renamed from: M */
            public final /* synthetic */ C0617l f41636M;

            /* JADX INFO: renamed from: N */
            public final /* synthetic */ t7c f41637N;

            /* JADX INFO: renamed from: Q */
            public final /* synthetic */ boolean f41638Q;

            /* JADX INFO: renamed from: X */
            public final /* synthetic */ gz6<c64, ny6<hug>, bth> f41639X;

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ esg f41640a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ lug f41641b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ yvg f41642c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ boolean f41643d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ boolean f41644e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ boolean f41645f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ jeh f41646m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(esg esgVar, lug lugVar, yvg yvgVar, boolean z, boolean z2, boolean z3, jeh jehVar, rsg rsgVar, he1 he1Var, boolean z4, boolean z5, C0617l c0617l, t7c t7cVar, boolean z6, gz6<? super c64, ? super ny6<hug>, bth> gz6Var) {
                super(2);
                this.f41640a = esgVar;
                this.f41641b = lugVar;
                this.f41642c = yvgVar;
                this.f41643d = z;
                this.f41644e = z2;
                this.f41645f = z3;
                this.f41646m = jehVar;
                this.f41632C = rsgVar;
                this.f41633F = he1Var;
                this.f41634H = z4;
                this.f41635L = z5;
                this.f41636M = c0617l;
                this.f41637N = t7cVar;
                this.f41638Q = z6;
                this.f41639X = gz6Var;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                invoke(zl2Var, num.intValue());
                return bth.f14751a;
            }

            @bl2(applier = "androidx.compose.ui.UiComposable")
            @hk2
            public final void invoke(@gib zl2 zl2Var, int i) {
                int minHeightInLines;
                int maxHeightInLines;
                if ((i & 3) == 2 && zl2Var.getSkipping()) {
                    zl2Var.skipToGroupEnd();
                    return;
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(1969169726, i, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                }
                esg esgVar = this.f41640a;
                if (esgVar instanceof esg.C5458b) {
                    minHeightInLines = ((esg.C5458b) esgVar).getMinHeightInLines();
                    maxHeightInLines = ((esg.C5458b) this.f41640a).getMaxHeightInLines();
                } else {
                    minHeightInLines = 1;
                    maxHeightInLines = 1;
                }
                InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                InterfaceC0701e interfaceC0701eThen = v42.clipToBounds(vsg.textFieldMinSize(kj7.heightInLines(C0626c0.m27410heightInVpY3zN4$default(aVar, this.f41641b.m30895getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), this.f41642c, minHeightInLines, maxHeightInLines), this.f41642c)).then(new TextFieldCoreModifier(this.f41643d && this.f41644e, this.f41645f, this.f41641b, this.f41646m, this.f41632C, this.f41633F, this.f41634H && !this.f41635L, this.f41636M, this.f41637N));
                lug lugVar = this.f41641b;
                jeh jehVar = this.f41646m;
                yvg yvgVar = this.f41642c;
                boolean z = this.f41638Q;
                gz6<c64, ny6<hug>, bth> gz6Var = this.f41639X;
                boolean z2 = this.f41634H;
                boolean z3 = this.f41643d;
                boolean z4 = this.f41644e;
                rsg rsgVar = this.f41632C;
                boolean z5 = this.f41635L;
                uba ubaVarMaybeCachedBoxMeasurePolicy = pc1.maybeCachedBoxMeasurePolicy(InterfaceC9407mm.f61437a.getTopStart(), true);
                int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
                qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
                InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701eThen);
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
                pc1.Box(od1.bringIntoViewRequester(aVar, lugVar.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(lugVar, jehVar, yvgVar, z, gz6Var)), zl2Var, 0);
                if (z2 && z3 && z4 && rsgVar.isInTouchMode()) {
                    zl2Var.startReplaceGroup(-1325530694);
                    gw0.TextFieldSelectionHandles(rsgVar, zl2Var, 0);
                    if (z5) {
                        zl2Var.startReplaceGroup(-1325177728);
                        zl2Var.endReplaceGroup();
                    } else {
                        zl2Var.startReplaceGroup(-1325351669);
                        gw0.TextFieldCursorHandle(rsgVar, zl2Var, 0);
                        zl2Var.endReplaceGroup();
                    }
                    zl2Var.endReplaceGroup();
                } else {
                    zl2Var.startReplaceGroup(-1325155904);
                    zl2Var.endReplaceGroup();
                }
                zl2Var.endNode();
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6609k(org orgVar, esg esgVar, lug lugVar, yvg yvgVar, boolean z, boolean z2, boolean z3, jeh jehVar, rsg rsgVar, he1 he1Var, boolean z4, boolean z5, C0617l c0617l, t7c t7cVar, boolean z6, gz6<? super c64, ? super ny6<hug>, bth> gz6Var) {
            super(2);
            this.f41625a = orgVar;
            this.f41626b = esgVar;
            this.f41627c = lugVar;
            this.f41628d = yvgVar;
            this.f41629e = z;
            this.f41630f = z2;
            this.f41631m = z3;
            this.f41616C = jehVar;
            this.f41617F = rsgVar;
            this.f41618H = he1Var;
            this.f41619L = z4;
            this.f41620M = z5;
            this.f41621N = c0617l;
            this.f41622Q = t7cVar;
            this.f41623X = z6;
            this.f41624Y = gz6Var;
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
                gm2.traceEventStart(-673241599, i, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
            }
            org orgVar = this.f41625a;
            if (orgVar == null) {
                orgVar = gw0.f41522a;
            }
            orgVar.Decoration(mk2.rememberComposableLambda(1969169726, true, new a(this.f41626b, this.f41627c, this.f41628d, this.f41629e, this.f41630f, this.f41631m, this.f41616C, this.f41617F, this.f41618H, this.f41619L, this.f41620M, this.f41621N, this.f41622Q, this.f41623X, this.f41624Y), zl2Var, 54), zl2Var, 6);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: gw0$l */
    public static final class C6610l extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qr8 f41647C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ esg f41648F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ gz6<c64, ny6<hug>, bth> f41649H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ l5b f41650L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ he1 f41651M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ int f41652M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ n72 f41653N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ l9c f41654Q;

        /* JADX INFO: renamed from: V1 */
        public final /* synthetic */ int f41655V1;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ org f41656X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C0617l f41657Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ boolean f41658Z;

        /* JADX INFO: renamed from: Z1 */
        public final /* synthetic */ int f41659Z1;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wsg f41660a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f41661b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f41662c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f41663d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ g48 f41664e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yvg f41665f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ wr8 f41666m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6610l(wsg wsgVar, InterfaceC0701e interfaceC0701e, boolean z, boolean z2, g48 g48Var, yvg yvgVar, wr8 wr8Var, qr8 qr8Var, esg esgVar, gz6<? super c64, ? super ny6<hug>, bth> gz6Var, l5b l5bVar, he1 he1Var, n72 n72Var, l9c l9cVar, org orgVar, C0617l c0617l, boolean z3, int i, int i2, int i3) {
            super(2);
            this.f41660a = wsgVar;
            this.f41661b = interfaceC0701e;
            this.f41662c = z;
            this.f41663d = z2;
            this.f41664e = g48Var;
            this.f41665f = yvgVar;
            this.f41666m = wr8Var;
            this.f41647C = qr8Var;
            this.f41648F = esgVar;
            this.f41649H = gz6Var;
            this.f41650L = l5bVar;
            this.f41651M = he1Var;
            this.f41653N = n72Var;
            this.f41654Q = l9cVar;
            this.f41656X = orgVar;
            this.f41657Y = c0617l;
            this.f41658Z = z3;
            this.f41652M1 = i;
            this.f41655V1 = i2;
            this.f41659Z1 = i3;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.BasicTextField(this.f41660a, this.f41661b, this.f41662c, this.f41663d, this.f41664e, this.f41665f, this.f41666m, this.f41647C, this.f41648F, this.f41649H, this.f41650L, this.f41651M, this.f41653N, this.f41654Q, this.f41656X, this.f41657Y, this.f41658Z, zl2Var, tsd.updateChangedFlags(this.f41652M1 | 1), tsd.updateChangedFlags(this.f41655V1), this.f41659Z1);
        }
    }

    /* JADX INFO: renamed from: gw0$m */
    public static final class C6611m extends tt8 implements qy6<hug, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6611m f41667a = new C6611m();

        public C6611m() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(hug hugVar) {
            invoke2(hugVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb hug hugVar) {
        }
    }

    /* JADX INFO: renamed from: gw0$n */
    public static final class C6612n extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zsg f41668a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z6b<zsg> f41669b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6612n(zsg zsgVar, z6b<zsg> z6bVar) {
            super(0);
            this.f41668a = zsgVar;
            this.f41669b = z6bVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (jvg.m30586equalsimpl0(this.f41668a.m33527getSelectiond9O1mEE(), gw0.BasicTextField$lambda$21(this.f41669b).m33527getSelectiond9O1mEE()) && md8.areEqual(this.f41668a.m33526getCompositionMzsxiRA(), gw0.BasicTextField$lambda$21(this.f41669b).m33526getCompositionMzsxiRA())) {
                return;
            }
            gw0.BasicTextField$lambda$22(this.f41669b, this.f41668a);
        }
    }

    /* JADX INFO: renamed from: gw0$o */
    public static final class C6613o extends tt8 implements qy6<zsg, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<String, bth> f41670a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z6b<zsg> f41671b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z6b<String> f41672c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6613o(qy6<? super String, bth> qy6Var, z6b<zsg> z6bVar, z6b<String> z6bVar2) {
            super(1);
            this.f41670a = qy6Var;
            this.f41671b = z6bVar;
            this.f41672c = z6bVar2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(zsg zsgVar) {
            invoke2(zsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb zsg zsgVar) {
            gw0.BasicTextField$lambda$22(this.f41671b, zsgVar);
            boolean zAreEqual = md8.areEqual(gw0.BasicTextField$lambda$25(this.f41672c), zsgVar.getText());
            gw0.BasicTextField$lambda$26(this.f41672c, zsgVar.getText());
            if (zAreEqual) {
                return;
            }
            this.f41670a.invoke(zsgVar.getText());
        }
    }

    /* JADX INFO: renamed from: gw0$p */
    public static final class C6614p extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ tr8 f41673C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f41674F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f41675H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f41676L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ kdi f41677M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ int f41678M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ qy6<hug, bth> f41679N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ l5b f41680Q;

        /* JADX INFO: renamed from: V1 */
        public final /* synthetic */ int f41681V1;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ he1 f41682X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> f41683Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f41684Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f41685a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<String, bth> f41686b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f41687c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f41688d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f41689e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yvg f41690f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ wr8 f41691m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6614p(String str, qy6<? super String, bth> qy6Var, InterfaceC0701e interfaceC0701e, boolean z, boolean z2, yvg yvgVar, wr8 wr8Var, tr8 tr8Var, boolean z3, int i, int i2, kdi kdiVar, qy6<? super hug, bth> qy6Var2, l5b l5bVar, he1 he1Var, kz6<? super gz6<? super zl2, ? super Integer, bth>, ? super zl2, ? super Integer, bth> kz6Var, int i3, int i4, int i5) {
            super(2);
            this.f41685a = str;
            this.f41686b = qy6Var;
            this.f41687c = interfaceC0701e;
            this.f41688d = z;
            this.f41689e = z2;
            this.f41690f = yvgVar;
            this.f41691m = wr8Var;
            this.f41673C = tr8Var;
            this.f41674F = z3;
            this.f41675H = i;
            this.f41676L = i2;
            this.f41677M = kdiVar;
            this.f41679N = qy6Var2;
            this.f41680Q = l5bVar;
            this.f41682X = he1Var;
            this.f41683Y = kz6Var;
            this.f41684Z = i3;
            this.f41678M1 = i4;
            this.f41681V1 = i5;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.BasicTextField(this.f41685a, this.f41686b, this.f41687c, this.f41688d, this.f41689e, this.f41690f, this.f41691m, this.f41673C, this.f41674F, this.f41675H, this.f41676L, this.f41677M, this.f41679N, this.f41680Q, this.f41682X, this.f41683Y, zl2Var, tsd.updateChangedFlags(this.f41684Z | 1), tsd.updateChangedFlags(this.f41678M1), this.f41681V1);
        }
    }

    /* JADX INFO: renamed from: gw0$q */
    public static final class C6615q implements org {

        /* JADX INFO: renamed from: a */
        public static final C6615q f41692a = new C6615q();

        /* JADX INFO: renamed from: gw0$q$a */
        public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6<zl2, Integer, bth> f41694b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f41695c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
                super(2);
                this.f41694b = gz6Var;
                this.f41695c = i;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                invoke(zl2Var, num.intValue());
                return bth.f14751a;
            }

            public final void invoke(@gib zl2 zl2Var, int i) {
                C6615q.this.Decoration(this.f41694b, zl2Var, tsd.updateChangedFlags(this.f41695c | 1));
            }
        }

        @Override // p000.org
        @hk2
        @ik2(scheme = "[0[0]]")
        public final void Decoration(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
            int i2;
            zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1669748801);
            if ((i & 6) == 0) {
                i2 = (zl2VarStartRestartGroup.changedInstance(gz6Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= zl2VarStartRestartGroup.changed(this) ? 32 : 16;
            }
            if ((i2 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
                zl2VarStartRestartGroup.skipToGroupEnd();
            } else {
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(-1669748801, i2, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:488)");
                }
                gz6Var.invoke(zl2VarStartRestartGroup, Integer.valueOf(i2 & 14));
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
            are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
            if (areVarEndRestartGroup != null) {
                areVarEndRestartGroup.updateScope(new a(gz6Var, i));
            }
        }
    }

    /* JADX INFO: renamed from: gw0$r */
    public static final class C6616r implements qzb {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41696a;

        public C6616r(rsg rsgVar) {
            this.f41696a = rsgVar;
        }

        @Override // p000.qzb
        /* JADX INFO: renamed from: provide-F1C5BW0, reason: not valid java name */
        public final long mo29872provideF1C5BW0() {
            return this.f41696a.getCursorHandleState$foundation_release(true).m33268getPositionF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: gw0$s */
    @ck3(m4009c = "androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1", m4010f = "BasicTextField.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_DECIMATION_SELECTOR}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1#2:869\n*E\n"})
    public static final class C6617s extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41697a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41698b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f41699c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6617s(rsg rsgVar, zy2<? super C6617s> zy2Var) {
            super(2, zy2Var);
            this.f41699c = rsgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6617s c6617s = new C6617s(this.f41699c, zy2Var);
            c6617s.f41698b = obj;
            return c6617s;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C6617s) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f41697a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f41698b;
                rsg rsgVar = this.f41699c;
                this.f41697a = 1;
                if (rsgVar.cursorHandleGestures(s2dVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: gw0$t */
    public static final class C6618t extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41700a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f41701b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6618t(rsg rsgVar, int i) {
            super(2);
            this.f41700a = rsgVar;
            this.f41701b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.TextFieldCursorHandle(this.f41700a, zl2Var, tsd.updateChangedFlags(this.f41701b | 1));
        }
    }

    /* JADX INFO: renamed from: gw0$u */
    public static final class C6619u extends tt8 implements ny6<xrg> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6619u(rsg rsgVar) {
            super(0);
            this.f41702a = rsgVar;
        }

        @Override // p000.ny6
        @yfb
        public final xrg invoke() {
            return this.f41702a.getCursorHandleState$foundation_release(false);
        }
    }

    /* JADX INFO: renamed from: gw0$v */
    public static final class C6620v implements qzb {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41703a;

        public C6620v(rsg rsgVar) {
            this.f41703a = rsgVar;
        }

        @Override // p000.qzb
        /* JADX INFO: renamed from: provide-F1C5BW0 */
        public final long mo29872provideF1C5BW0() {
            return this.f41703a.getSelectionHandleState$foundation_release(true, true).m33268getPositionF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: gw0$w */
    @ck3(m4009c = "androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1", m4010f = "BasicTextField.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_LIMIT_BANDWIDTH}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1#2:869\n*E\n"})
    public static final class C6621w extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41704a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41705b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f41706c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6621w(rsg rsgVar, zy2<? super C6621w> zy2Var) {
            super(2, zy2Var);
            this.f41706c = rsgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6621w c6621w = new C6621w(this.f41706c, zy2Var);
            c6621w.f41705b = obj;
            return c6621w;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C6621w) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f41704a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f41705b;
                rsg rsgVar = this.f41706c;
                this.f41704a = 1;
                if (rsgVar.selectionHandleGestures(s2dVar, true, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: gw0$x */
    public static final class C6622x implements qzb {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41707a;

        public C6622x(rsg rsgVar) {
            this.f41707a = rsgVar;
        }

        @Override // p000.qzb
        /* JADX INFO: renamed from: provide-F1C5BW0 */
        public final long mo29872provideF1C5BW0() {
            return this.f41707a.getSelectionHandleState$foundation_release(false, true).m33268getPositionF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: gw0$y */
    @ck3(m4009c = "androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1", m4010f = "BasicTextField.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_CC_MATRIX_03}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1#2:869\n*E\n"})
    public static final class C6623y extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41708a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41709b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f41710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6623y(rsg rsgVar, zy2<? super C6623y> zy2Var) {
            super(2, zy2Var);
            this.f41710c = rsgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6623y c6623y = new C6623y(this.f41710c, zy2Var);
            c6623y.f41709b = obj;
            return c6623y;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C6623y) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f41708a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f41709b;
                rsg rsgVar = this.f41710c;
                this.f41708a = 1;
                if (rsgVar.selectionHandleGestures(s2dVar, false, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: gw0$z */
    public static final class C6624z extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rsg f41711a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f41712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6624z(rsg rsgVar, int i) {
            super(2);
            this.f41711a = rsgVar;
            this.f41712b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            gw0.TextFieldSelectionHandles(this.f41711a, zl2Var, tsd.updateChangedFlags(this.f41712b | 1));
        }
    }

    static {
        float f = 40;
        f41523b = mn4.m30998DpSizeYgX7TsA(kn4.m30705constructorimpl(f), kn4.m30705constructorimpl(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(@p000.yfb p000.wsg r42, @p000.gib androidx.compose.p002ui.InterfaceC0701e r43, boolean r44, boolean r45, @p000.gib p000.g48 r46, @p000.gib p000.yvg r47, @p000.gib p000.wr8 r48, @p000.gib p000.qr8 r49, @p000.gib p000.esg r50, @p000.gib p000.gz6<? super p000.c64, ? super p000.ny6<p000.hug>, p000.bth> r51, @p000.gib p000.l5b r52, @p000.gib p000.he1 r53, @p000.gib p000.l9c r54, @p000.gib p000.org r55, @p000.gib androidx.compose.foundation.C0617l r56, @p000.gib p000.zl2 r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gw0.BasicTextField(wsg, androidx.compose.ui.e, boolean, boolean, g48, yvg, wr8, qr8, esg, gz6, l5b, he1, l9c, org, androidx.compose.foundation.l, zl2, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zsg BasicTextField$lambda$21(z6b<zsg> z6bVar) {
        return z6bVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BasicTextField$lambda$22(z6b<zsg> z6bVar, zsg zsgVar) {
        z6bVar.setValue(zsgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$25(z6b<String> z6bVar) {
        return z6bVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BasicTextField$lambda$26(z6b<String> z6bVar, String str) {
        z6bVar.setValue(str);
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void TextFieldCursorHandle(@yfb rsg rsgVar, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1991581797);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(rsgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1991581797, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = stf.derivedStateOf(new C6619u(rsgVar));
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            if (TextFieldCursorHandle$lambda$9((i2g) objRememberedValue).getVisible()) {
                zl2VarStartRestartGroup.startReplaceGroup(-317108348);
                boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(rsgVar);
                Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                    objRememberedValue2 = new C6616r(rsgVar);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                qzb qzbVar = (qzb) objRememberedValue2;
                InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                boolean zChangedInstance2 = zl2VarStartRestartGroup.changedInstance(rsgVar);
                Object objRememberedValue3 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == c16170a.getEmpty()) {
                    objRememberedValue3 = new C6617s(rsgVar, null);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                C16220zr.m33511CursorHandleUSBMPiE(qzbVar, vgg.pointerInput(aVar, rsgVar, (gz6<? super s2d, ? super zy2<? super bth>, ? extends Object>) objRememberedValue3), f41523b, zl2VarStartRestartGroup, 384, 0);
                zl2VarStartRestartGroup.endReplaceGroup();
            } else {
                zl2VarStartRestartGroup.startReplaceGroup(-316683586);
                zl2VarStartRestartGroup.endReplaceGroup();
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C6618t(rsgVar, i));
        }
    }

    private static final xrg TextFieldCursorHandle$lambda$9(i2g<xrg> i2gVar) {
        return i2gVar.getValue();
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void TextFieldSelectionHandles(@yfb rsg rsgVar, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(2025287684);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(rsgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(2025287684, i2, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:440)");
            }
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = stf.derivedStateOf(new C6600b0(rsgVar));
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            i2g i2gVar = (i2g) objRememberedValue;
            if (TextFieldSelectionHandles$lambda$13(i2gVar).getVisible()) {
                zl2VarStartRestartGroup.startReplaceGroup(-1353986043);
                boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(rsgVar);
                Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                    objRememberedValue2 = new C6620v(rsgVar);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                qzb qzbVar = (qzb) objRememberedValue2;
                q5e direction = TextFieldSelectionHandles$lambda$13(i2gVar).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$13(i2gVar).getHandlesCrossed();
                InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                boolean zChangedInstance2 = zl2VarStartRestartGroup.changedInstance(rsgVar);
                Object objRememberedValue3 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == c16170a.getEmpty()) {
                    objRememberedValue3 = new C6621w(rsgVar, null);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                C5475ev.m28857SelectionHandlepzduO1o(qzbVar, true, direction, handlesCrossed, f41523b, vgg.pointerInput(aVar, rsgVar, (gz6<? super s2d, ? super zy2<? super bth>, ? extends Object>) objRememberedValue3), zl2VarStartRestartGroup, 24624, 0);
                zl2VarStartRestartGroup.endReplaceGroup();
            } else {
                zl2VarStartRestartGroup.startReplaceGroup(-1353409443);
                zl2VarStartRestartGroup.endReplaceGroup();
            }
            Object objRememberedValue4 = zl2VarStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == c16170a.getEmpty()) {
                objRememberedValue4 = stf.derivedStateOf(new C6598a0(rsgVar));
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            i2g i2gVar2 = (i2g) objRememberedValue4;
            if (TextFieldSelectionHandles$lambda$17(i2gVar2).getVisible()) {
                zl2VarStartRestartGroup.startReplaceGroup(-1353116090);
                boolean zChangedInstance3 = zl2VarStartRestartGroup.changedInstance(rsgVar);
                Object objRememberedValue5 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == c16170a.getEmpty()) {
                    objRememberedValue5 = new C6622x(rsgVar);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                qzb qzbVar2 = (qzb) objRememberedValue5;
                q5e direction2 = TextFieldSelectionHandles$lambda$17(i2gVar2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$17(i2gVar2).getHandlesCrossed();
                InterfaceC0701e.a aVar2 = InterfaceC0701e.f5158d1;
                boolean zChangedInstance4 = zl2VarStartRestartGroup.changedInstance(rsgVar);
                Object objRememberedValue6 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue6 == c16170a.getEmpty()) {
                    objRememberedValue6 = new C6623y(rsgVar, null);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                C5475ev.m28857SelectionHandlepzduO1o(qzbVar2, false, direction2, handlesCrossed2, f41523b, vgg.pointerInput(aVar2, rsgVar, (gz6<? super s2d, ? super zy2<? super bth>, ? extends Object>) objRememberedValue6), zl2VarStartRestartGroup, 24624, 0);
                zl2VarStartRestartGroup.endReplaceGroup();
            } else {
                zl2VarStartRestartGroup.startReplaceGroup(-1352540451);
                zl2VarStartRestartGroup.endReplaceGroup();
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C6624z(rsgVar, i));
        }
    }

    private static final xrg TextFieldSelectionHandles$lambda$13(i2g<xrg> i2gVar) {
        return i2gVar.getValue();
    }

    private static final xrg TextFieldSelectionHandles$lambda$17(i2g<xrg> i2gVar) {
        return i2gVar.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(@p000.yfb p000.wsg r51, @p000.gib androidx.compose.p002ui.InterfaceC0701e r52, boolean r53, boolean r54, @p000.gib p000.g48 r55, @p000.gib p000.yvg r56, @p000.gib p000.wr8 r57, @p000.gib p000.qr8 r58, @p000.gib p000.esg r59, @p000.gib p000.gz6<? super p000.c64, ? super p000.ny6<p000.hug>, p000.bth> r60, @p000.gib p000.l5b r61, @p000.gib p000.he1 r62, @p000.gib p000.n72 r63, @p000.gib p000.l9c r64, @p000.gib p000.org r65, @p000.gib androidx.compose.foundation.C0617l r66, boolean r67, @p000.gib p000.zl2 r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instruction units count: 1626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gw0.BasicTextField(wsg, androidx.compose.ui.e, boolean, boolean, g48, yvg, wr8, qr8, esg, gz6, l5b, he1, n72, l9c, org, androidx.compose.foundation.l, boolean, zl2, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(@p000.yfb java.lang.String r41, @p000.yfb p000.qy6<? super java.lang.String, p000.bth> r42, @p000.gib androidx.compose.p002ui.InterfaceC0701e r43, boolean r44, boolean r45, @p000.gib p000.yvg r46, @p000.gib p000.wr8 r47, @p000.gib p000.tr8 r48, boolean r49, int r50, int r51, @p000.gib p000.kdi r52, @p000.gib p000.qy6<? super p000.hug, p000.bth> r53, @p000.gib p000.l5b r54, @p000.gib p000.he1 r55, @p000.gib p000.kz6<? super p000.gz6<? super p000.zl2, ? super java.lang.Integer, p000.bth>, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r56, @p000.gib p000.zl2 r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instruction units count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gw0.BasicTextField(java.lang.String, qy6, androidx.compose.ui.e, boolean, boolean, yvg, wr8, tr8, boolean, int, int, kdi, qy6, l5b, he1, kz6, zl2, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(@p000.yfb p000.zsg r37, @p000.yfb p000.qy6<? super p000.zsg, p000.bth> r38, @p000.gib androidx.compose.p002ui.InterfaceC0701e r39, boolean r40, boolean r41, @p000.gib p000.yvg r42, @p000.gib p000.wr8 r43, @p000.gib p000.tr8 r44, boolean r45, int r46, int r47, @p000.gib p000.kdi r48, @p000.gib p000.qy6<? super p000.hug, p000.bth> r49, @p000.gib p000.l5b r50, @p000.gib p000.he1 r51, @p000.gib p000.kz6<? super p000.gz6<? super p000.zl2, ? super java.lang.Integer, p000.bth>, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r52, @p000.gib p000.zl2 r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gw0.BasicTextField(zsg, qy6, androidx.compose.ui.e, boolean, boolean, yvg, wr8, tr8, boolean, int, int, kdi, qy6, l5b, he1, kz6, zl2, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @p000.q64(level = p000.u64.f86867c, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(java.lang.String r41, p000.qy6 r42, androidx.compose.p002ui.InterfaceC0701e r43, boolean r44, boolean r45, p000.yvg r46, p000.wr8 r47, p000.tr8 r48, boolean r49, int r50, p000.kdi r51, p000.qy6 r52, p000.l5b r53, p000.he1 r54, p000.kz6 r55, p000.zl2 r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gw0.BasicTextField(java.lang.String, qy6, androidx.compose.ui.e, boolean, boolean, yvg, wr8, tr8, boolean, int, kdi, qy6, l5b, he1, kz6, zl2, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @p000.q64(level = p000.u64.f86867c, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(p000.zsg r41, p000.qy6 r42, androidx.compose.p002ui.InterfaceC0701e r43, boolean r44, boolean r45, p000.yvg r46, p000.wr8 r47, p000.tr8 r48, boolean r49, int r50, p000.kdi r51, p000.qy6 r52, p000.l5b r53, p000.he1 r54, p000.kz6 r55, p000.zl2 r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gw0.BasicTextField(zsg, qy6, androidx.compose.ui.e, boolean, boolean, yvg, wr8, tr8, boolean, int, kdi, qy6, l5b, he1, kz6, zl2, int, int, int):void");
    }
}
