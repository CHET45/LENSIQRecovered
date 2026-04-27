package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierLocalConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,75:1\n135#2:76\n*S KotlinDebug\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n51#1:76\n*E\n"})
public final class ixa {

    /* JADX INFO: renamed from: ixa$a */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n1#1,178:1\n52#2,3:179\n*E\n"})
    public static final class C7654a extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f48812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7654a(qy6 qy6Var) {
            super(1);
            this.f48812a = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("modifierLocalConsumer");
            f58Var.getProperties().set("consumer", this.f48812a);
        }
    }

    @f0g
    @ug5
    @yfb
    public static final InterfaceC0701e modifierLocalConsumer(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super qxa, bth> qy6Var) {
        return interfaceC0701e.then(new hxa(qy6Var, c58.isDebugInspectorInfoEnabled() ? new C7654a(qy6Var) : c58.getNoInspectorInfo()));
    }
}
