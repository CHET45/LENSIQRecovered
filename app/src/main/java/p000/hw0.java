package p000;

import androidx.compose.foundation.text.modifiers.C0675b;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.C9041lz;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,606:1\n77#2:607\n77#2:608\n77#2:621\n77#2:622\n77#2:653\n77#2:654\n77#2:667\n77#2:704\n1223#3,6:609\n1223#3,6:615\n1223#3,6:655\n1223#3,6:661\n1223#3,6:698\n1223#3,6:705\n1223#3,6:723\n1223#3,6:729\n1223#3,6:735\n1223#3,6:741\n1223#3,6:747\n1223#3,6:753\n1223#3,6:759\n1223#3,6:765\n1223#3,6:771\n124#4,6:623\n131#4,5:638\n136#4:649\n138#4:652\n124#4,6:668\n131#4,5:683\n136#4:694\n138#4:697\n78#4,6:777\n85#4,4:792\n89#4,2:802\n93#4:807\n289#5,9:629\n298#5,2:650\n289#5,9:674\n298#5,2:695\n368#5,9:783\n377#5,3:804\n4032#6,6:643\n4032#6,6:688\n4032#6,6:796\n298#7,3:711\n69#7,4:714\n301#7:718\n302#7:720\n74#7:721\n303#7:722\n1#8:719\n81#9:808\n107#9,2:809\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n102#1:607\n104#1:608\n131#1:621\n144#1:622\n197#1:653\n199#1:654\n230#1:667\n255#1:704\n106#1:609,6\n109#1:615,6\n201#1:655,6\n204#1:661,6\n242#1:698,6\n258#1:705,6\n540#1:723,6\n546#1:729,6\n549#1:735,6\n559#1:741,6\n563#1:747,6\n579#1:753,6\n596#1:759,6\n600#1:765,6\n601#1:771,6\n152#1:623,6\n152#1:638,5\n152#1:649\n152#1:652\n218#1:668,6\n218#1:683,5\n218#1:694\n218#1:697\n566#1:777,6\n566#1:792,4\n566#1:802,2\n566#1:807\n152#1:629,9\n152#1:650,2\n218#1:674,9\n218#1:695,2\n566#1:783,9\n566#1:804,3\n152#1:643,6\n218#1:688,6\n566#1:796,6\n449#1:711,3\n449#1:714,4\n449#1:718\n449#1:720\n449#1:721\n449#1:722\n449#1:719\n242#1:808\n242#1:809,2\n*E\n"})
public final class hw0 {

    /* JADX INFO: renamed from: hw0$a */
    public static final class C7040a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f45019C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ u92 f45020F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f45021H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f45022L;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f45023a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f45024b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f45025c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<hug, bth> f45026d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f45027e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f45028f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f45029m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7040a(String str, InterfaceC0701e interfaceC0701e, yvg yvgVar, qy6<? super hug, bth> qy6Var, int i, boolean z, int i2, int i3, u92 u92Var, int i4, int i5) {
            super(2);
            this.f45023a = str;
            this.f45024b = interfaceC0701e;
            this.f45025c = yvgVar;
            this.f45026d = qy6Var;
            this.f45027e = i;
            this.f45028f = z;
            this.f45029m = i2;
            this.f45019C = i3;
            this.f45020F = u92Var;
            this.f45021H = i4;
            this.f45022L = i5;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            hw0.m30137BasicTextVhcvRP8(this.f45023a, this.f45024b, this.f45025c, this.f45026d, this.f45027e, this.f45028f, this.f45029m, this.f45019C, this.f45020F, zl2Var, tsd.updateChangedFlags(this.f45021H | 1), this.f45022L);
        }
    }

    /* JADX INFO: renamed from: hw0$b */
    public static final class C7041b extends tt8 implements qy6<C0675b.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6b<C9041lz> f45030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7041b(z6b<C9041lz> z6bVar) {
            super(1);
            this.f45030a = z6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(C0675b.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb C0675b.a aVar) {
            hw0.BasicText_RWo7tUw$lambda$6(this.f45030a, aVar.isShowingSubstitution() ? aVar.getSubstitution() : aVar.getOriginal());
        }
    }

    /* JADX INFO: renamed from: hw0$c */
    public static final class C7042c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f45031C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ Map<String, z28> f45032F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ u92 f45033H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f45034L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ int f45035M;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9041lz f45036a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f45037b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f45038c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<hug, bth> f45039d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f45040e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f45041f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f45042m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7042c(C9041lz c9041lz, InterfaceC0701e interfaceC0701e, yvg yvgVar, qy6<? super hug, bth> qy6Var, int i, boolean z, int i2, int i3, Map<String, z28> map, u92 u92Var, int i4, int i5) {
            super(2);
            this.f45036a = c9041lz;
            this.f45037b = interfaceC0701e;
            this.f45038c = yvgVar;
            this.f45039d = qy6Var;
            this.f45040e = i;
            this.f45041f = z;
            this.f45042m = i2;
            this.f45031C = i3;
            this.f45032F = map;
            this.f45033H = u92Var;
            this.f45034L = i4;
            this.f45035M = i5;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            hw0.m30136BasicTextRWo7tUw(this.f45036a, this.f45037b, this.f45038c, this.f45039d, this.f45040e, this.f45041f, this.f45042m, this.f45031C, this.f45032F, this.f45033H, zl2Var, tsd.updateChangedFlags(this.f45034L | 1), this.f45035M);
        }
    }

    /* JADX INFO: renamed from: hw0$d */
    public static final class C7043d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f45043C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f45044F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f45045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f45046b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f45047c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<hug, bth> f45048d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f45049e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f45050f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f45051m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7043d(String str, InterfaceC0701e interfaceC0701e, yvg yvgVar, qy6<? super hug, bth> qy6Var, int i, boolean z, int i2, int i3, int i4) {
            super(2);
            this.f45045a = str;
            this.f45046b = interfaceC0701e;
            this.f45047c = yvgVar;
            this.f45048d = qy6Var;
            this.f45049e = i;
            this.f45050f = z;
            this.f45051m = i2;
            this.f45043C = i3;
            this.f45044F = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            hw0.m30135BasicTextBpD7jsM(this.f45045a, this.f45046b, this.f45047c, this.f45048d, this.f45049e, this.f45050f, this.f45051m, zl2Var, tsd.updateChangedFlags(this.f45043C | 1), this.f45044F);
        }
    }

    /* JADX INFO: renamed from: hw0$e */
    public static final class C7044e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ Map<String, z28> f45052C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f45053F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f45054H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9041lz f45055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f45056b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f45057c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<hug, bth> f45058d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f45059e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f45060f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f45061m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7044e(C9041lz c9041lz, InterfaceC0701e interfaceC0701e, yvg yvgVar, qy6<? super hug, bth> qy6Var, int i, boolean z, int i2, Map<String, z28> map, int i3, int i4) {
            super(2);
            this.f45055a = c9041lz;
            this.f45056b = interfaceC0701e;
            this.f45057c = yvgVar;
            this.f45058d = qy6Var;
            this.f45059e = i;
            this.f45060f = z;
            this.f45061m = i2;
            this.f45052C = map;
            this.f45053F = i3;
            this.f45054H = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            hw0.m30134BasicText4YKlhWE(this.f45055a, this.f45056b, this.f45057c, this.f45058d, this.f45059e, this.f45060f, this.f45061m, this.f45052C, zl2Var, tsd.updateChangedFlags(this.f45053F | 1), this.f45054H);
        }
    }

    /* JADX INFO: renamed from: hw0$f */
    public static final class C7045f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f45062C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f45063F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f45064H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f45065a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f45066b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f45067c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<hug, bth> f45068d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f45069e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f45070f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f45071m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7045f(String str, InterfaceC0701e interfaceC0701e, yvg yvgVar, qy6<? super hug, bth> qy6Var, int i, boolean z, int i2, int i3, int i4, int i5) {
            super(2);
            this.f45065a = str;
            this.f45066b = interfaceC0701e;
            this.f45067c = yvgVar;
            this.f45068d = qy6Var;
            this.f45069e = i;
            this.f45070f = z;
            this.f45071m = i2;
            this.f45062C = i3;
            this.f45063F = i4;
            this.f45064H = i5;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            hw0.m30133BasicText4YKlhWE(this.f45065a, this.f45066b, this.f45067c, this.f45068d, this.f45069e, this.f45070f, this.f45071m, this.f45062C, zl2Var, tsd.updateChangedFlags(this.f45063F | 1), this.f45064H);
        }
    }

    /* JADX INFO: renamed from: hw0$g */
    public static final class C7046g extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f45072C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ Map<String, z28> f45073F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f45074H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f45075L;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9041lz f45076a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f45077b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f45078c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<hug, bth> f45079d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f45080e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f45081f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f45082m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7046g(C9041lz c9041lz, InterfaceC0701e interfaceC0701e, yvg yvgVar, qy6<? super hug, bth> qy6Var, int i, boolean z, int i2, int i3, Map<String, z28> map, int i4, int i5) {
            super(2);
            this.f45076a = c9041lz;
            this.f45077b = interfaceC0701e;
            this.f45078c = yvgVar;
            this.f45079d = qy6Var;
            this.f45080e = i;
            this.f45081f = z;
            this.f45082m = i2;
            this.f45072C = i3;
            this.f45073F = map;
            this.f45074H = i4;
            this.f45075L = i5;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            hw0.m30138BasicTextVhcvRP8(this.f45076a, this.f45077b, this.f45078c, this.f45079d, this.f45080e, this.f45081f, this.f45082m, this.f45072C, this.f45073F, zl2Var, tsd.updateChangedFlags(this.f45074H | 1), this.f45075L);
        }
    }

    /* JADX INFO: renamed from: hw0$h */
    public static final class C7047h extends tt8 implements ny6<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dxe f45083a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7047h(dxe dxeVar) {
            super(0);
            this.f45083a = dxeVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Long invoke() {
            return Long.valueOf(this.f45083a.nextSelectableId());
        }
    }

    /* JADX INFO: renamed from: hw0$i */
    public static final class C7048i extends tt8 implements ny6<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dxe f45084a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7048i(dxe dxeVar) {
            super(0);
            this.f45084a = dxeVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Long invoke() {
            return Long.valueOf(this.f45084a.nextSelectableId());
        }
    }

    /* JADX INFO: renamed from: hw0$j */
    public static final class C7049j extends tt8 implements qy6<hug, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pug f45085a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<hug, bth> f45086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7049j(pug pugVar, qy6<? super hug, bth> qy6Var) {
            super(1);
            this.f45085a = pugVar;
            this.f45086b = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(hug hugVar) {
            invoke2(hugVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb hug hugVar) {
            pug pugVar = this.f45085a;
            if (pugVar != null) {
                pugVar.setTextLayoutResult(hugVar);
            }
            qy6<hug, bth> qy6Var = this.f45086b;
            if (qy6Var != null) {
                qy6Var.invoke(hugVar);
            }
        }
    }

    /* JADX INFO: renamed from: hw0$k */
    @dwf({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,606:1\n1#2:607\n*E\n"})
    public static final class C7050k extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pug f45087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7050k(pug pugVar) {
            super(0);
            this.f45087a = pugVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            pug pugVar = this.f45087a;
            return Boolean.valueOf(pugVar != null ? pugVar.getShouldMeasureLinks().invoke().booleanValue() : false);
        }
    }

    /* JADX INFO: renamed from: hw0$l */
    @dwf({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,606:1\n1#2:607\n*E\n"})
    public static final class C7051l extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pug f45088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7051l(pug pugVar) {
            super(0);
            this.f45088a = pugVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            pug pugVar = this.f45088a;
            return Boolean.valueOf(pugVar != null ? pugVar.getShouldMeasureLinks().invoke().booleanValue() : false);
        }
    }

    /* JADX INFO: renamed from: hw0$m */
    public static final class C7052m extends tt8 implements ny6<List<? extends rud>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6b<List<rud>> f45089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7052m(z6b<List<rud>> z6bVar) {
            super(0);
            this.f45089a = z6bVar;
        }

        @Override // p000.ny6
        @gib
        public final List<? extends rud> invoke() {
            z6b<List<rud>> z6bVar = this.f45089a;
            if (z6bVar != null) {
                return z6bVar.getValue();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: hw0$n */
    public static final class C7053n extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f45090C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f45091F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f45092H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ do6.InterfaceC4891b f45093L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ pwe f45094M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ u92 f45095N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ qy6<C0675b.a, bth> f45096Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ int f45097X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f45098Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f45099Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f45100a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9041lz f45101b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<hug, bth> f45102c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f45103d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Map<String, z28> f45104e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ yvg f45105f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f45106m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7053n(InterfaceC0701e interfaceC0701e, C9041lz c9041lz, qy6<? super hug, bth> qy6Var, boolean z, Map<String, z28> map, yvg yvgVar, int i, boolean z2, int i2, int i3, do6.InterfaceC4891b interfaceC4891b, pwe pweVar, u92 u92Var, qy6<? super C0675b.a, bth> qy6Var2, int i4, int i5, int i6) {
            super(2);
            this.f45100a = interfaceC0701e;
            this.f45101b = c9041lz;
            this.f45102c = qy6Var;
            this.f45103d = z;
            this.f45104e = map;
            this.f45105f = yvgVar;
            this.f45106m = i;
            this.f45090C = z2;
            this.f45091F = i2;
            this.f45092H = i3;
            this.f45093L = interfaceC4891b;
            this.f45094M = pweVar;
            this.f45095N = u92Var;
            this.f45096Q = qy6Var2;
            this.f45097X = i4;
            this.f45098Y = i5;
            this.f45099Z = i6;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            hw0.m30139LayoutWithLinksAndInlineContentvOo2fZY(this.f45100a, this.f45101b, this.f45102c, this.f45103d, this.f45104e, this.f45105f, this.f45106m, this.f45090C, this.f45091F, this.f45092H, this.f45093L, this.f45094M, this.f45095N, this.f45096Q, zl2Var, tsd.updateChangedFlags(this.f45097X | 1), tsd.updateChangedFlags(this.f45098Y), this.f45099Z);
        }
    }

    /* JADX INFO: renamed from: hw0$o */
    public static final class C7054o extends tt8 implements qy6<List<? extends rud>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6b<List<rud>> f45107a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7054o(z6b<List<rud>> z6bVar) {
            super(1);
            this.f45107a = z6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(List<? extends rud> list) {
            invoke2((List<rud>) list);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb List<rud> list) {
            z6b<List<rud>> z6bVar = this.f45107a;
            if (z6bVar == null) {
                return;
            }
            z6bVar.setValue(list);
        }
    }

    /* JADX INFO: renamed from: hw0$p */
    public static final class C7055p extends tt8 implements ny6<C9041lz> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pug f45108a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9041lz f45109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7055p(pug pugVar, C9041lz c9041lz) {
            super(0);
            this.f45108a = pugVar;
            this.f45109b = c9041lz;
        }

        @Override // p000.ny6
        @yfb
        public final C9041lz invoke() {
            C9041lz c9041lzApplyAnnotators$foundation_release;
            pug pugVar = this.f45108a;
            return (pugVar == null || (c9041lzApplyAnnotators$foundation_release = pugVar.applyAnnotators$foundation_release()) == null) ? this.f45109b : c9041lzApplyAnnotators$foundation_release;
        }
    }

    /* JADX INFO: renamed from: hw0$q */
    public static final class C7056q extends tt8 implements ny6<C9041lz> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9041lz f45110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7056q(C9041lz c9041lz) {
            super(0);
            this.f45110a = c9041lz;
        }

        @Override // p000.ny6
        @yfb
        public final C9041lz invoke() {
            return this.f45110a;
        }
    }

    /* JADX INFO: renamed from: hw0$r */
    public static final class C7057r extends tt8 implements gz6<fme, Long, Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dxe f45111a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7057r(dxe dxeVar) {
            super(2);
            this.f45111a = dxeVar;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Long invoke(fme fmeVar, Long l) {
            return invoke(fmeVar, l.longValue());
        }

        @gib
        public final Long invoke(@yfb fme fmeVar, long j) {
            if (gxe.hasSelection(this.f45111a, j)) {
                return Long.valueOf(j);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: hw0$s */
    public static final class C7058s extends tt8 implements qy6<Long, Long> {

        /* JADX INFO: renamed from: a */
        public static final C7058s f45112a = new C7058s();

        public C7058s() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Long invoke(Long l) {
            return invoke(l.longValue());
        }

        @gib
        public final Long invoke(long j) {
            return Long.valueOf(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    @p000.q64(level = p000.u64.f86867c, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m30134BasicText4YKlhWE(p000.C9041lz r24, androidx.compose.p002ui.InterfaceC0701e r25, p000.yvg r26, p000.qy6 r27, int r28, boolean r29, int r30, java.util.Map r31, p000.zl2 r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw0.m30134BasicText4YKlhWE(lz, androidx.compose.ui.e, yvg, qy6, int, boolean, int, java.util.Map, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    @p000.q64(level = p000.u64.f86867c, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m30135BasicTextBpD7jsM(java.lang.String r21, androidx.compose.p002ui.InterfaceC0701e r22, p000.yvg r23, p000.qy6 r24, int r25, boolean r26, int r27, p000.zl2 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw0.m30135BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.e, yvg, qy6, int, boolean, int, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30136BasicTextRWo7tUw(@p000.yfb p000.C9041lz r52, @p000.gib androidx.compose.p002ui.InterfaceC0701e r53, @p000.gib p000.yvg r54, @p000.gib p000.qy6<? super p000.hug, p000.bth> r55, int r56, boolean r57, int r58, int r59, @p000.gib java.util.Map<java.lang.String, p000.z28> r60, @p000.gib p000.u92 r61, @p000.gib p000.zl2 r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw0.m30136BasicTextRWo7tUw(lz, androidx.compose.ui.e, yvg, qy6, int, boolean, int, int, java.util.Map, u92, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30137BasicTextVhcvRP8(@p000.yfb java.lang.String r42, @p000.gib androidx.compose.p002ui.InterfaceC0701e r43, @p000.gib p000.yvg r44, @p000.gib p000.qy6<? super p000.hug, p000.bth> r45, int r46, boolean r47, int r48, int r49, @p000.gib p000.u92 r50, @p000.gib p000.zl2 r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw0.m30137BasicTextVhcvRP8(java.lang.String, androidx.compose.ui.e, yvg, qy6, int, boolean, int, int, u92, zl2, int, int):void");
    }

    private static final C9041lz BasicText_RWo7tUw$lambda$5(z6b<C9041lz> z6bVar) {
        return z6bVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BasicText_RWo7tUw$lambda$6(z6b<C9041lz> z6bVar, C9041lz c9041lz) {
        z6bVar.setValue(c9041lz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: LayoutWithLinksAndInlineContent-vOo2fZY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30139LayoutWithLinksAndInlineContentvOo2fZY(androidx.compose.p002ui.InterfaceC0701e r43, p000.C9041lz r44, p000.qy6<? super p000.hug, p000.bth> r45, boolean r46, java.util.Map<java.lang.String, p000.z28> r47, p000.yvg r48, int r49, boolean r50, int r51, int r52, p000.do6.InterfaceC4891b r53, p000.pwe r54, p000.u92 r55, p000.qy6<? super androidx.compose.foundation.text.modifiers.C0675b.a, p000.bth> r56, p000.zl2 r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw0.m30139LayoutWithLinksAndInlineContentvOo2fZY(androidx.compose.ui.e, lz, qy6, boolean, java.util.Map, yvg, int, boolean, int, int, do6$b, pwe, u92, qy6, zl2, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<scc<AbstractC0767t, ny6<a78>>> measureWithTextRangeMeasureConstraints(List<? extends rba> list, ny6<Boolean> ny6Var) {
        if (!ny6Var.invoke().booleanValue()) {
            return null;
        }
        mvg mvgVar = new mvg();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rba rbaVar = list.get(i);
            Object parentData = rbaVar.getParentData();
            md8.checkNotNull(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            lvg lvgVarMeasure = ((nvg) parentData).getMeasurePolicy().measure(mvgVar);
            arrayList.add(new scc(rbaVar.mo27949measureBRTryo0(ku2.f55323b.m30772fitPrioritizingWidthZbe2FdA(lvgVarMeasure.getWidth(), lvgVarMeasure.getWidth(), lvgVarMeasure.getHeight(), lvgVarMeasure.getHeight())), lvgVarMeasure.getPlace()));
        }
        return arrayList;
    }

    private static final dme<Long, Long> selectionIdSaver(dxe dxeVar) {
        return eme.Saver(new C7057r(dxeVar), C7058s.f45112a);
    }

    /* JADX INFO: renamed from: textModifier-cFh6CEA, reason: not valid java name */
    private static final InterfaceC0701e m30141textModifiercFh6CEA(InterfaceC0701e interfaceC0701e, C9041lz c9041lz, yvg yvgVar, qy6<? super hug, bth> qy6Var, int i, boolean z, int i2, int i3, do6.InterfaceC4891b interfaceC4891b, List<C9041lz.c<ewc>> list, qy6<? super List<rud>, bth> qy6Var2, pwe pweVar, u92 u92Var, qy6<? super C0675b.a, bth> qy6Var3) {
        if (pweVar == null) {
            return interfaceC0701e.then(InterfaceC0701e.f5158d1).then(new TextAnnotatedStringElement(c9041lz, yvgVar, interfaceC4891b, qy6Var, i, z, i2, i3, list, qy6Var2, null, u92Var, qy6Var3, null));
        }
        return interfaceC0701e.then(pweVar.getModifier()).then(new SelectableTextAnnotatedStringElement(c9041lz, yvgVar, interfaceC4891b, qy6Var, i, z, i2, i3, list, qy6Var2, pweVar, u92Var, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    @p000.q64(level = p000.u64.f86867c, message = "Maintained for binary compat")
    /* JADX INFO: renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m30133BasicText4YKlhWE(java.lang.String r25, androidx.compose.p002ui.InterfaceC0701e r26, p000.yvg r27, p000.qy6 r28, int r29, boolean r30, int r31, int r32, p000.zl2 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw0.m30133BasicText4YKlhWE(java.lang.String, androidx.compose.ui.e, yvg, qy6, int, boolean, int, int, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    @p000.q64(level = p000.u64.f86867c, message = "Maintained for binary compat")
    /* JADX INFO: renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m30138BasicTextVhcvRP8(p000.C9041lz r26, androidx.compose.p002ui.InterfaceC0701e r27, p000.yvg r28, p000.qy6 r29, int r30, boolean r31, int r32, int r33, java.util.Map r34, p000.zl2 r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hw0.m30138BasicTextVhcvRP8(lz, androidx.compose.ui.e, yvg, qy6, int, boolean, int, int, java.util.Map, zl2, int, int):void");
    }
}
