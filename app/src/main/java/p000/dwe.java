package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class dwe {

    /* JADX INFO: renamed from: dwe$a */
    public static final class C4991a extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public static final C4991a f31218a = new C4991a();

        public C4991a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.selectableGroup(eyeVar);
        }
    }

    @f0g
    @yfb
    public static final InterfaceC0701e selectableGroup(@yfb InterfaceC0701e interfaceC0701e) {
        return qxe.semantics$default(interfaceC0701e, false, C4991a.f31218a, 1, null);
    }
}
