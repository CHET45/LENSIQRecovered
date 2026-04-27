package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n328#2,12:166\n254#2,11:178\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,12\n116#1:178,11\n*E\n"})
public final class e3i {

    /* JADX INFO: renamed from: e3i$a */
    public static final class C5067a extends tt8 implements ny6<mb7> {

        /* JADX INFO: renamed from: a */
        public static final C5067a f31673a = new C5067a();

        public C5067a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final mb7 invoke() {
            return new mb7();
        }
    }

    /* JADX INFO: renamed from: e3i$a0 */
    public static final class C5068a0 extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ float f31674C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f31675F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f31676H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ float f31677L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ float f31678M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ float f31679N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ float f31680Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ int f31681X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f31682Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f31683Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<qjc> f31684a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f31685b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f31686c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ he1 f31687d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f31688e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ he1 f31689f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ float f31690m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5068a0(List<? extends qjc> list, int i, String str, he1 he1Var, float f, he1 he1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, int i5, int i6) {
            super(2);
            this.f31684a = list;
            this.f31685b = i;
            this.f31686c = str;
            this.f31687d = he1Var;
            this.f31688e = f;
            this.f31689f = he1Var2;
            this.f31690m = f2;
            this.f31674C = f3;
            this.f31675F = i2;
            this.f31676H = i3;
            this.f31677L = f4;
            this.f31678M = f5;
            this.f31679N = f6;
            this.f31680Q = f7;
            this.f31681X = i4;
            this.f31682Y = i5;
            this.f31683Z = i6;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            e3i.m28727Path9cdaXJ4(this.f31684a, this.f31685b, this.f31686c, this.f31687d, this.f31688e, this.f31689f, this.f31690m, this.f31674C, this.f31675F, this.f31676H, this.f31677L, this.f31678M, this.f31679N, this.f31680Q, zl2Var, tsd.updateChangedFlags(this.f31681X | 1), tsd.updateChangedFlags(this.f31682Y), this.f31683Z);
        }
    }

    /* JADX INFO: renamed from: e3i$b */
    public static final class C5069b extends tt8 implements gz6<mb7, String, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5069b f31691a = new C5069b();

        public C5069b() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, String str) {
            invoke2(mb7Var, str);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb mb7 mb7Var, @yfb String str) {
            mb7Var.setName(str);
        }
    }

    /* JADX INFO: renamed from: e3i$c */
    public static final class C5070c extends tt8 implements gz6<mb7, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5070c f31692a = new C5070c();

        public C5070c() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, Float f) {
            invoke(mb7Var, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb mb7 mb7Var, float f) {
            mb7Var.setRotation(f);
        }
    }

    /* JADX INFO: renamed from: e3i$d */
    public static final class C5071d extends tt8 implements gz6<mb7, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5071d f31693a = new C5071d();

        public C5071d() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, Float f) {
            invoke(mb7Var, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb mb7 mb7Var, float f) {
            mb7Var.setPivotX(f);
        }
    }

    /* JADX INFO: renamed from: e3i$e */
    public static final class C5072e extends tt8 implements gz6<mb7, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5072e f31694a = new C5072e();

        public C5072e() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, Float f) {
            invoke(mb7Var, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb mb7 mb7Var, float f) {
            mb7Var.setPivotY(f);
        }
    }

    /* JADX INFO: renamed from: e3i$f */
    public static final class C5073f extends tt8 implements gz6<mb7, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5073f f31695a = new C5073f();

        public C5073f() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, Float f) {
            invoke(mb7Var, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb mb7 mb7Var, float f) {
            mb7Var.setScaleX(f);
        }
    }

    /* JADX INFO: renamed from: e3i$g */
    public static final class C5074g extends tt8 implements gz6<mb7, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5074g f31696a = new C5074g();

        public C5074g() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, Float f) {
            invoke(mb7Var, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb mb7 mb7Var, float f) {
            mb7Var.setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: e3i$h */
    public static final class C5075h extends tt8 implements gz6<mb7, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5075h f31697a = new C5075h();

        public C5075h() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, Float f) {
            invoke(mb7Var, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb mb7 mb7Var, float f) {
            mb7Var.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: e3i$i */
    public static final class C5076i extends tt8 implements gz6<mb7, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5076i f31698a = new C5076i();

        public C5076i() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, Float f) {
            invoke(mb7Var, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb mb7 mb7Var, float f) {
            mb7Var.setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: e3i$j */
    public static final class C5077j extends tt8 implements gz6<mb7, List<? extends qjc>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5077j f31699a = new C5077j();

        public C5077j() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(mb7 mb7Var, List<? extends qjc> list) {
            invoke2(mb7Var, list);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb mb7 mb7Var, @yfb List<? extends qjc> list) {
            mb7Var.setClipPathData(list);
        }
    }

    /* JADX INFO: renamed from: e3i$k */
    public static final class C5078k extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ float f31700C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ List<qjc> f31701F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ gz6<zl2, Integer, bth> f31702H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f31703L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ int f31704M;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f31705a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f31706b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f31707c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f31708d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f31709e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f31710f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ float f31711m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5078k(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends qjc> list, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f31705a = str;
            this.f31706b = f;
            this.f31707c = f2;
            this.f31708d = f3;
            this.f31709e = f4;
            this.f31710f = f5;
            this.f31711m = f6;
            this.f31700C = f7;
            this.f31701F = list;
            this.f31702H = gz6Var;
            this.f31703L = i;
            this.f31704M = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            e3i.Group(this.f31705a, this.f31706b, this.f31707c, this.f31708d, this.f31709e, this.f31710f, this.f31711m, this.f31700C, this.f31701F, this.f31702H, zl2Var, tsd.updateChangedFlags(this.f31703L | 1), this.f31704M);
        }
    }

    /* JADX INFO: renamed from: e3i$l */
    public static final class C5079l extends tt8 implements ny6<xic> {

        /* JADX INFO: renamed from: a */
        public static final C5079l f31712a = new C5079l();

        public C5079l() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final xic invoke() {
            return new xic();
        }
    }

    /* JADX INFO: renamed from: e3i$m */
    public static final class C5080m extends tt8 implements gz6<xic, fag, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5080m f31713a = new C5080m();

        public C5080m() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, fag fagVar) {
            m28728invokeCSYIeUk(xicVar, fagVar.m28903unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-CSYIeUk, reason: not valid java name */
        public final void m28728invokeCSYIeUk(@yfb xic xicVar, int i) {
            xicVar.m33231setStrokeLineCapBeK7IIE(i);
        }
    }

    /* JADX INFO: renamed from: e3i$n */
    public static final class C5081n extends tt8 implements gz6<xic, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5081n f31714a = new C5081n();

        public C5081n() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, Float f) {
            invoke(xicVar, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb xic xicVar, float f) {
            xicVar.setStrokeLineMiter(f);
        }
    }

    /* JADX INFO: renamed from: e3i$o */
    public static final class C5082o extends tt8 implements gz6<xic, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5082o f31715a = new C5082o();

        public C5082o() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, Float f) {
            invoke(xicVar, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb xic xicVar, float f) {
            xicVar.setTrimPathStart(f);
        }
    }

    /* JADX INFO: renamed from: e3i$p */
    public static final class C5083p extends tt8 implements gz6<xic, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5083p f31716a = new C5083p();

        public C5083p() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, Float f) {
            invoke(xicVar, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb xic xicVar, float f) {
            xicVar.setTrimPathEnd(f);
        }
    }

    /* JADX INFO: renamed from: e3i$q */
    public static final class C5084q extends tt8 implements gz6<xic, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5084q f31717a = new C5084q();

        public C5084q() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, Float f) {
            invoke(xicVar, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb xic xicVar, float f) {
            xicVar.setTrimPathOffset(f);
        }
    }

    /* JADX INFO: renamed from: e3i$r */
    public static final class C5085r extends tt8 implements gz6<xic, String, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5085r f31718a = new C5085r();

        public C5085r() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, String str) {
            invoke2(xicVar, str);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb xic xicVar, @yfb String str) {
            xicVar.setName(str);
        }
    }

    /* JADX INFO: renamed from: e3i$s */
    public static final class C5086s extends tt8 implements gz6<xic, List<? extends qjc>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5086s f31719a = new C5086s();

        public C5086s() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, List<? extends qjc> list) {
            invoke2(xicVar, list);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb xic xicVar, @yfb List<? extends qjc> list) {
            xicVar.setPathData(list);
        }
    }

    /* JADX INFO: renamed from: e3i$t */
    public static final class C5087t extends tt8 implements gz6<xic, bjc, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5087t f31720a = new C5087t();

        public C5087t() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, bjc bjcVar) {
            m28729invokepweu1eQ(xicVar, bjcVar.m28003unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-pweu1eQ, reason: not valid java name */
        public final void m28729invokepweu1eQ(@yfb xic xicVar, int i) {
            xicVar.m33230setPathFillTypeoQ8Xj4U(i);
        }
    }

    /* JADX INFO: renamed from: e3i$u */
    public static final class C5088u extends tt8 implements gz6<xic, he1, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5088u f31721a = new C5088u();

        public C5088u() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, he1 he1Var) {
            invoke2(xicVar, he1Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb xic xicVar, @gib he1 he1Var) {
            xicVar.setFill(he1Var);
        }
    }

    /* JADX INFO: renamed from: e3i$v */
    public static final class C5089v extends tt8 implements gz6<xic, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5089v f31722a = new C5089v();

        public C5089v() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, Float f) {
            invoke(xicVar, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb xic xicVar, float f) {
            xicVar.setFillAlpha(f);
        }
    }

    /* JADX INFO: renamed from: e3i$w */
    public static final class C5090w extends tt8 implements gz6<xic, he1, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5090w f31723a = new C5090w();

        public C5090w() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, he1 he1Var) {
            invoke2(xicVar, he1Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb xic xicVar, @gib he1 he1Var) {
            xicVar.setStroke(he1Var);
        }
    }

    /* JADX INFO: renamed from: e3i$x */
    public static final class C5091x extends tt8 implements gz6<xic, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5091x f31724a = new C5091x();

        public C5091x() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, Float f) {
            invoke(xicVar, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb xic xicVar, float f) {
            xicVar.setStrokeAlpha(f);
        }
    }

    /* JADX INFO: renamed from: e3i$y */
    public static final class C5092y extends tt8 implements gz6<xic, Float, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5092y f31725a = new C5092y();

        public C5092y() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, Float f) {
            invoke(xicVar, f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb xic xicVar, float f) {
            xicVar.setStrokeLineWidth(f);
        }
    }

    /* JADX INFO: renamed from: e3i$z */
    public static final class C5093z extends tt8 implements gz6<xic, hag, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5093z f31726a = new C5093z();

        public C5093z() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(xic xicVar, hag hagVar) {
            m28730invokekLtJ_vA(xicVar, hagVar.m29983unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-kLtJ_vA, reason: not valid java name */
        public final void m28730invokekLtJ_vA(@yfb xic xicVar, int i) {
            xicVar.m33232setStrokeLineJoinWw9F2mQ(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    @p000.d3i
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Group(@p000.gib java.lang.String r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, @p000.gib java.util.List<? extends p000.qjc> r29, @p000.yfb p000.gz6<? super p000.zl2, ? super java.lang.Integer, p000.bth> r30, @p000.gib p000.zl2 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e3i.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, gz6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    @p000.d3i
    @p000.hk2
    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m28727Path9cdaXJ4(@p000.yfb java.util.List<? extends p000.qjc> r31, int r32, @p000.gib java.lang.String r33, @p000.gib p000.he1 r34, float r35, @p000.gib p000.he1 r36, float r37, float r38, int r39, int r40, float r41, float r42, float r43, float r44, @p000.gib p000.zl2 r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e3i.m28727Path9cdaXJ4(java.util.List, int, java.lang.String, he1, float, he1, float, float, int, int, float, float, float, float, zl2, int, int, int):void");
    }
}
