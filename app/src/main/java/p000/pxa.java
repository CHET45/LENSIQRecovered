package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,70:1\n135#2:71\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:71\n*E\n"})
public final class pxa {

    /* JADX INFO: renamed from: pxa$a */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n1#1,178:1\n60#2,4:179\n*E\n"})
    public static final class C11172a extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aid f72458a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6 f72459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11172a(aid aidVar, ny6 ny6Var) {
            super(1);
            this.f72458a = aidVar;
            this.f72459b = ny6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("modifierLocalProvider");
            f58Var.getProperties().set("key", this.f72458a);
            f58Var.getProperties().set("value", this.f72459b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: pxa$b */
    @dwf({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,70:1\n81#2:71\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n*L\n66#1:71\n*E\n"})
    public static final class C11173b<T> extends g58 implements oxa<T> {

        /* JADX INFO: renamed from: d */
        @yfb
        public final aid<T> f72460d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final i2g f72461e;

        public C11173b(aid<T> aidVar, ny6<? extends T> ny6Var, qy6<? super f58, bth> qy6Var) {
            super(qy6Var);
            this.f72460d = aidVar;
            this.f72461e = stf.derivedStateOf(ny6Var);
        }

        @Override // p000.oxa
        @yfb
        public aid<T> getKey() {
            return this.f72460d;
        }

        @Override // p000.oxa
        public T getValue() {
            return (T) this.f72461e.getValue();
        }
    }

    @ug5
    @yfb
    public static final <T> InterfaceC0701e modifierLocalProvider(@yfb InterfaceC0701e interfaceC0701e, @yfb aid<T> aidVar, @yfb ny6<? extends T> ny6Var) {
        return interfaceC0701e.then(new C11173b(aidVar, ny6Var, c58.isDebugInspectorInfoEnabled() ? new C11172a(aidVar, ny6Var) : c58.getNoInspectorInfo()));
    }
}
