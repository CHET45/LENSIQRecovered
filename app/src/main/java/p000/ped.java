package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class ped {

    /* JADX INFO: renamed from: ped$a */
    public static final class C10934a extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f70570a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z52<Float> f70571b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f70572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10934a(float f, z52<Float> z52Var, int i) {
            super(1);
            this.f70570a = f;
            this.f70571b = z52Var;
            this.f70572c = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.setProgressBarRangeInfo(eyeVar, new jed(((Number) kpd.coerceIn(Float.valueOf(this.f70570a), this.f70571b)).floatValue(), this.f70571b, this.f70572c));
        }
    }

    /* JADX INFO: renamed from: ped$b */
    public static final class C10935b extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public static final C10935b f70573a = new C10935b();

        public C10935b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.setProgressBarRangeInfo(eyeVar, jed.f50394d.getIndeterminate());
        }
    }

    @f0g
    @yfb
    public static final InterfaceC0701e progressSemantics(@yfb InterfaceC0701e interfaceC0701e, float f, @yfb z52<Float> z52Var, @h78(from = 0) int i) {
        return qxe.semantics(interfaceC0701e, true, new C10934a(f, z52Var, i));
    }

    public static /* synthetic */ InterfaceC0701e progressSemantics$default(InterfaceC0701e interfaceC0701e, float f, z52 z52Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z52Var = jpd.rangeTo(0.0f, 1.0f);
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return progressSemantics(interfaceC0701e, f, z52Var, i);
    }

    @f0g
    @yfb
    public static final InterfaceC0701e progressSemantics(@yfb InterfaceC0701e interfaceC0701e) {
        return qxe.semantics(interfaceC0701e, true, C10935b.f70573a);
    }
}
