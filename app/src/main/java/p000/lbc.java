package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import org.opencv.videoio.Videoio;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,511:1\n148#2:512\n148#2:513\n148#2:514\n148#2:515\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n110#1:512\n113#1:513\n197#1:514\n200#1:515\n*E\n"})
public final class lbc {

    /* JADX INFO: renamed from: lbc$a */
    public static final class C8761a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ kng f57073C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f57074F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean f57075H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ qy6<Integer, Object> f57076L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ hab f57077M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ msf f57078N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ oz6<ubc, Integer, zl2, Integer, bth> f57079Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ int f57080X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f57081Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f57082Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dcc f57083a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f57084b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f57085c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ dbc f57086d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f57087e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f57088f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC9407mm.c f57089m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8761a(dcc dccVar, InterfaceC0701e interfaceC0701e, vac vacVar, dbc dbcVar, int i, float f, InterfaceC9407mm.c cVar, kng kngVar, boolean z, boolean z2, qy6<? super Integer, ? extends Object> qy6Var, hab habVar, msf msfVar, oz6<? super ubc, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var, int i2, int i3, int i4) {
            super(2);
            this.f57083a = dccVar;
            this.f57084b = interfaceC0701e;
            this.f57085c = vacVar;
            this.f57086d = dbcVar;
            this.f57087e = i;
            this.f57088f = f;
            this.f57089m = cVar;
            this.f57073C = kngVar;
            this.f57074F = z;
            this.f57075H = z2;
            this.f57076L = qy6Var;
            this.f57077M = habVar;
            this.f57078N = msfVar;
            this.f57079Q = oz6Var;
            this.f57080X = i2;
            this.f57081Y = i3;
            this.f57082Z = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            lbc.m30860HorizontalPageroI3XNZo(this.f57083a, this.f57084b, this.f57085c, this.f57086d, this.f57087e, this.f57088f, this.f57089m, this.f57073C, this.f57074F, this.f57075H, this.f57076L, this.f57077M, this.f57078N, this.f57079Q, zl2Var, tsd.updateChangedFlags(this.f57080X | 1), tsd.updateChangedFlags(this.f57081Y), this.f57082Z);
        }
    }

    /* JADX INFO: renamed from: lbc$b */
    public static final class C8762b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ kng f57090C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f57091F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean f57092H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ qy6<Integer, Object> f57093L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ hab f57094M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ msf f57095N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ oz6<ubc, Integer, zl2, Integer, bth> f57096Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ int f57097X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f57098Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f57099Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dcc f57100a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f57101b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f57102c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ dbc f57103d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f57104e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f57105f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC9407mm.b f57106m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8762b(dcc dccVar, InterfaceC0701e interfaceC0701e, vac vacVar, dbc dbcVar, int i, float f, InterfaceC9407mm.b bVar, kng kngVar, boolean z, boolean z2, qy6<? super Integer, ? extends Object> qy6Var, hab habVar, msf msfVar, oz6<? super ubc, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var, int i2, int i3, int i4) {
            super(2);
            this.f57100a = dccVar;
            this.f57101b = interfaceC0701e;
            this.f57102c = vacVar;
            this.f57103d = dbcVar;
            this.f57104e = i;
            this.f57105f = f;
            this.f57106m = bVar;
            this.f57090C = kngVar;
            this.f57091F = z;
            this.f57092H = z2;
            this.f57093L = qy6Var;
            this.f57094M = habVar;
            this.f57095N = msfVar;
            this.f57096Q = oz6Var;
            this.f57097X = i2;
            this.f57098Y = i3;
            this.f57099Z = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            lbc.m30861VerticalPageroI3XNZo(this.f57100a, this.f57101b, this.f57102c, this.f57103d, this.f57104e, this.f57105f, this.f57106m, this.f57090C, this.f57091F, this.f57092H, this.f57093L, this.f57094M, this.f57095N, this.f57096Q, zl2Var, tsd.updateChangedFlags(this.f57097X | 1), tsd.updateChangedFlags(this.f57098Y), this.f57099Z);
        }
    }

    /* JADX INFO: renamed from: lbc$c */
    public static final class C8763c extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f57107a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dcc f57108b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x13 f57109c;

        /* JADX INFO: renamed from: lbc$c$a */
        public static final class a extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ dcc f57110a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f57111b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(dcc dccVar, x13 x13Var) {
                super(0);
                this.f57110a = dccVar;
                this.f57111b = x13Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(lbc.pagerSemantics$performBackwardPaging(this.f57110a, this.f57111b));
            }
        }

        /* JADX INFO: renamed from: lbc$c$b */
        public static final class b extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ dcc f57112a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f57113b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dcc dccVar, x13 x13Var) {
                super(0);
                this.f57112a = dccVar;
                this.f57113b = x13Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(lbc.pagerSemantics$performForwardPaging(this.f57112a, this.f57113b));
            }
        }

        /* JADX INFO: renamed from: lbc$c$c */
        public static final class c extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ dcc f57114a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f57115b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(dcc dccVar, x13 x13Var) {
                super(0);
                this.f57114a = dccVar;
                this.f57115b = x13Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(lbc.pagerSemantics$performBackwardPaging(this.f57114a, this.f57115b));
            }
        }

        /* JADX INFO: renamed from: lbc$c$d */
        public static final class d extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ dcc f57116a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f57117b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(dcc dccVar, x13 x13Var) {
                super(0);
                this.f57116a = dccVar;
                this.f57117b = x13Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(lbc.pagerSemantics$performForwardPaging(this.f57116a, this.f57117b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8763c(boolean z, dcc dccVar, x13 x13Var) {
            super(1);
            this.f57107a = z;
            this.f57108b = dccVar;
            this.f57109c = x13Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            if (this.f57107a) {
                bye.pageUp$default(eyeVar, null, new a(this.f57108b, this.f57109c), 1, null);
                bye.pageDown$default(eyeVar, null, new b(this.f57108b, this.f57109c), 1, null);
            } else {
                bye.pageLeft$default(eyeVar, null, new c(this.f57108b, this.f57109c), 1, null);
                bye.pageRight$default(eyeVar, null, new d(this.f57108b, this.f57109c), 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: lbc$d */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", m4010f = "Pager.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_IMAGE_IS_COLOR}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8764d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f57118a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dcc f57119b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8764d(dcc dccVar, zy2<? super C8764d> zy2Var) {
            super(2, zy2Var);
            this.f57119b = dccVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C8764d(this.f57119b, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C8764d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f57118a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                dcc dccVar = this.f57119b;
                this.f57118a = 1;
                if (ecc.animateToPreviousPage(dccVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: lbc$e */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", m4010f = "Pager.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_OUTPUT_DATA_PACKING}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8765e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f57120a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dcc f57121b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8765e(dcc dccVar, zy2<? super C8765e> zy2Var) {
            super(2, zy2Var);
            this.f57121b = dccVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C8765e(this.f57121b, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C8765e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f57120a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                dcc dccVar = this.f57121b;
                this.f57120a = 1;
                if (ecc.animateToNextPage(dccVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30860HorizontalPageroI3XNZo(@p000.yfb p000.dcc r35, @p000.gib androidx.compose.p002ui.InterfaceC0701e r36, @p000.gib p000.vac r37, @p000.gib p000.dbc r38, int r39, float r40, @p000.gib p000.InterfaceC9407mm.c r41, @p000.gib p000.kng r42, boolean r43, boolean r44, @p000.gib p000.qy6<? super java.lang.Integer, ? extends java.lang.Object> r45, @p000.gib p000.hab r46, @p000.gib p000.msf r47, @p000.yfb p000.oz6<? super p000.ubc, ? super java.lang.Integer, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r48, @p000.gib p000.zl2 r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lbc.m30860HorizontalPageroI3XNZo(dcc, androidx.compose.ui.e, vac, dbc, int, float, mm$c, kng, boolean, boolean, qy6, hab, msf, oz6, zl2, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30861VerticalPageroI3XNZo(@p000.yfb p000.dcc r35, @p000.gib androidx.compose.p002ui.InterfaceC0701e r36, @p000.gib p000.vac r37, @p000.gib p000.dbc r38, int r39, float r40, @p000.gib p000.InterfaceC9407mm.b r41, @p000.gib p000.kng r42, boolean r43, boolean r44, @p000.gib p000.qy6<? super java.lang.Integer, ? extends java.lang.Object> r45, @p000.gib p000.hab r46, @p000.gib p000.msf r47, @p000.yfb p000.oz6<? super p000.ubc, ? super java.lang.Integer, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r48, @p000.gib p000.zl2 r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lbc.m30861VerticalPageroI3XNZo(dcc, androidx.compose.ui.e, vac, dbc, int, float, mm$b, kng, boolean, boolean, qy6, hab, msf, oz6, zl2, int, int, int):void");
    }

    public static final int currentPageOffset(@yfb msf msfVar, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return p3a.roundToInt(msfVar.position(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    private static final void debugLog(ny6<String> ny6Var) {
    }

    @yfb
    public static final InterfaceC0701e pagerSemantics(@yfb InterfaceC0701e interfaceC0701e, @yfb dcc dccVar, boolean z, @yfb x13 x13Var, boolean z2) {
        return z2 ? interfaceC0701e.then(qxe.semantics$default(InterfaceC0701e.f5158d1, false, new C8763c(z, dccVar, x13Var), 1, null)) : interfaceC0701e.then(InterfaceC0701e.f5158d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(dcc dccVar, x13 x13Var) {
        if (!dccVar.getCanScrollBackward()) {
            return false;
        }
        fg1.launch$default(x13Var, null, null, new C8764d(dccVar, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(dcc dccVar, x13 x13Var) {
        if (!dccVar.getCanScrollForward()) {
            return false;
        }
        fg1.launch$default(x13Var, null, null, new C8765e(dccVar, null), 3, null);
        return true;
    }
}
