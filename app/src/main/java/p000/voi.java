package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,214:1\n135#2:215\n135#2:216\n135#2:217\n135#2:218\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n50#1:215\n75#1:216\n98#1:217\n117#1:218\n*E\n"})
public final class voi {

    /* JADX INFO: renamed from: voi$a */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n118#2,3:179\n*E\n"})
    public static final class C14188a extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f91890a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14188a(vli vliVar) {
            super(1);
            this.f91890a = vliVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("insetsBottomHeight");
            f58Var.getProperties().set("insets", this.f91890a);
        }
    }

    /* JADX INFO: renamed from: voi$b */
    public static final class C14189b extends tt8 implements gz6<vli, c64, Integer> {

        /* JADX INFO: renamed from: a */
        public static final C14189b f91891a = new C14189b();

        public C14189b() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final Integer invoke(@yfb vli vliVar, @yfb c64 c64Var) {
            return Integer.valueOf(vliVar.getBottom(c64Var));
        }
    }

    /* JADX INFO: renamed from: voi$c */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n76#2,3:179\n*E\n"})
    public static final class C14190c extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f91892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14190c(vli vliVar) {
            super(1);
            this.f91892a = vliVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("insetsEndWidth");
            f58Var.getProperties().set("insets", this.f91892a);
        }
    }

    /* JADX INFO: renamed from: voi$d */
    public static final class C14191d extends tt8 implements kz6<vli, ov8, c64, Integer> {

        /* JADX INFO: renamed from: a */
        public static final C14191d f91893a = new C14191d();

        public C14191d() {
            super(3);
        }

        @Override // p000.kz6
        @yfb
        public final Integer invoke(@yfb vli vliVar, @yfb ov8 ov8Var, @yfb c64 c64Var) {
            return Integer.valueOf(ov8Var == ov8.Rtl ? vliVar.getLeft(c64Var, ov8Var) : vliVar.getRight(c64Var, ov8Var));
        }
    }

    /* JADX INFO: renamed from: voi$e */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n51#2,3:179\n*E\n"})
    public static final class C14192e extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f91894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14192e(vli vliVar) {
            super(1);
            this.f91894a = vliVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("insetsStartWidth");
            f58Var.getProperties().set("insets", this.f91894a);
        }
    }

    /* JADX INFO: renamed from: voi$f */
    public static final class C14193f extends tt8 implements kz6<vli, ov8, c64, Integer> {

        /* JADX INFO: renamed from: a */
        public static final C14193f f91895a = new C14193f();

        public C14193f() {
            super(3);
        }

        @Override // p000.kz6
        @yfb
        public final Integer invoke(@yfb vli vliVar, @yfb ov8 ov8Var, @yfb c64 c64Var) {
            return Integer.valueOf(ov8Var == ov8.Ltr ? vliVar.getLeft(c64Var, ov8Var) : vliVar.getRight(c64Var, ov8Var));
        }
    }

    /* JADX INFO: renamed from: voi$g */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n99#2,3:179\n*E\n"})
    public static final class C14194g extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f91896a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14194g(vli vliVar) {
            super(1);
            this.f91896a = vliVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("insetsTopHeight");
            f58Var.getProperties().set("insets", this.f91896a);
        }
    }

    /* JADX INFO: renamed from: voi$h */
    public static final class C14195h extends tt8 implements gz6<vli, c64, Integer> {

        /* JADX INFO: renamed from: a */
        public static final C14195h f91897a = new C14195h();

        public C14195h() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final Integer invoke(@yfb vli vliVar, @yfb c64 c64Var) {
            return Integer.valueOf(vliVar.getTop(c64Var));
        }
    }

    @f0g
    @yfb
    public static final InterfaceC0701e windowInsetsBottomHeight(@yfb InterfaceC0701e interfaceC0701e, @yfb vli vliVar) {
        return interfaceC0701e.then(new x64(vliVar, c58.isDebugInspectorInfoEnabled() ? new C14188a(vliVar) : c58.getNoInspectorInfo(), C14189b.f91891a));
    }

    @f0g
    @yfb
    public static final InterfaceC0701e windowInsetsEndWidth(@yfb InterfaceC0701e interfaceC0701e, @yfb vli vliVar) {
        return interfaceC0701e.then(new b74(vliVar, c58.isDebugInspectorInfoEnabled() ? new C14190c(vliVar) : c58.getNoInspectorInfo(), C14191d.f91893a));
    }

    @f0g
    @yfb
    public static final InterfaceC0701e windowInsetsStartWidth(@yfb InterfaceC0701e interfaceC0701e, @yfb vli vliVar) {
        return interfaceC0701e.then(new b74(vliVar, c58.isDebugInspectorInfoEnabled() ? new C14192e(vliVar) : c58.getNoInspectorInfo(), C14193f.f91895a));
    }

    @f0g
    @yfb
    public static final InterfaceC0701e windowInsetsTopHeight(@yfb InterfaceC0701e interfaceC0701e, @yfb vli vliVar) {
        return interfaceC0701e.then(new x64(vliVar, c58.isDebugInspectorInfoEnabled() ? new C14194g(vliVar) : c58.getNoInspectorInfo(), C14195h.f91897a));
    }
}
