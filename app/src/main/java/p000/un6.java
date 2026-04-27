package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.jvd;
import p000.vvc;

/* JADX INFO: loaded from: classes.dex */
public final class un6 extends InterfaceC0701e.d implements mn2, sxb {

    /* JADX INFO: renamed from: X */
    @gib
    public vvc.InterfaceC14277a f88549X;

    /* JADX INFO: renamed from: Y */
    public boolean f88550Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f88551Z;

    /* JADX INFO: renamed from: un6$a */
    public static final class C13606a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<vvc> f88552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ un6 f88553b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13606a(jvd.C8121h<vvc> c8121h, un6 un6Var) {
            super(0);
            this.f88552a = c8121h;
            this.f88553b = un6Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f88552a.f52110a = nn2.currentValueOf(this.f88553b, wvc.getLocalPinnableContainer());
        }
    }

    private final vvc retrievePinnableContainer() {
        jvd.C8121h c8121h = new jvd.C8121h();
        txb.observeReads(this, new C13606a(c8121h, this));
        return (vvc) c8121h.f52110a;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f88551Z;
    }

    @Override // p000.sxb
    public void onObservedReadsChanged() {
        vvc vvcVarRetrievePinnableContainer = retrievePinnableContainer();
        if (this.f88550Y) {
            vvc.InterfaceC14277a interfaceC14277a = this.f88549X;
            if (interfaceC14277a != null) {
                interfaceC14277a.release();
            }
            this.f88549X = vvcVarRetrievePinnableContainer != null ? vvcVarRetrievePinnableContainer.pin() : null;
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onReset() {
        vvc.InterfaceC14277a interfaceC14277a = this.f88549X;
        if (interfaceC14277a != null) {
            interfaceC14277a.release();
        }
        this.f88549X = null;
    }

    public final void setFocus(boolean z) {
        if (z) {
            vvc vvcVarRetrievePinnableContainer = retrievePinnableContainer();
            this.f88549X = vvcVarRetrievePinnableContainer != null ? vvcVarRetrievePinnableContainer.pin() : null;
        } else {
            vvc.InterfaceC14277a interfaceC14277a = this.f88549X;
            if (interfaceC14277a != null) {
                interfaceC14277a.release();
            }
            this.f88549X = null;
        }
        this.f88550Y = z;
    }
}
