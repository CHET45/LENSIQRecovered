package p000;

import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;

/* JADX INFO: loaded from: classes.dex */
public final class t8i {

    /* JADX INFO: renamed from: t8i$a */
    public static final class C12953a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1143j f84002a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC1154n f84003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12953a(AbstractC1143j abstractC1143j, InterfaceC1154n interfaceC1154n) {
            super(0);
            this.f84002a = abstractC1143j;
            this.f84003b = interfaceC1154n;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f84002a.removeObserver(this.f84003b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ny6<bth> installForLifecycle(final AbstractComposeView abstractComposeView, AbstractC1143j abstractC1143j) {
        if (abstractC1143j.getCurrentState().compareTo(AbstractC1143j.b.DESTROYED) > 0) {
            InterfaceC1154n interfaceC1154n = new InterfaceC1154n() { // from class: s8i
                @Override // androidx.lifecycle.InterfaceC1154n
                public final void onStateChanged(g59 g59Var, AbstractC1143j.a aVar) {
                    t8i.installForLifecycle$lambda$1(abstractComposeView, g59Var, aVar);
                }
            };
            abstractC1143j.addObserver(interfaceC1154n);
            return new C12953a(abstractC1143j, interfaceC1154n);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC1143j + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, g59 g59Var, AbstractC1143j.a aVar) {
        if (aVar == AbstractC1143j.a.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
