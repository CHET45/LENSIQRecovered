package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class pzb extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    public float f72588X;

    /* JADX INFO: renamed from: Y */
    public float f72589Y;

    /* JADX INFO: renamed from: Z */
    public boolean f72590Z;

    /* JADX INFO: renamed from: pzb$a */
    public static final class C11192a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0767t f72592b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0761n f72593c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11192a(AbstractC0767t abstractC0767t, InterfaceC0761n interfaceC0761n) {
            super(1);
            this.f72592b = abstractC0767t;
            this.f72593c = interfaceC0761n;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            if (pzb.this.getRtlAware()) {
                AbstractC0767t.a.placeRelative$default(aVar, this.f72592b, this.f72593c.mo27167roundToPx0680j_4(pzb.this.m31885getXD9Ej5fM()), this.f72593c.mo27167roundToPx0680j_4(pzb.this.m31886getYD9Ej5fM()), 0.0f, 4, null);
            } else {
                AbstractC0767t.a.place$default(aVar, this.f72592b, this.f72593c.mo27167roundToPx0680j_4(pzb.this.m31885getXD9Ej5fM()), this.f72593c.mo27167roundToPx0680j_4(pzb.this.m31886getYD9Ej5fM()), 0.0f, 4, null);
            }
        }
    }

    public /* synthetic */ pzb(float f, float f2, boolean z, jt3 jt3Var) {
        this(f, f2, z);
    }

    public final boolean getRtlAware() {
        return this.f72590Z;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m31885getXD9Ej5fM() {
        return this.f72588X;
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m31886getYD9Ej5fM() {
        return this.f72589Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C11192a(abstractC0767tMo27949measureBRTryo0, interfaceC0761n), 4, null);
    }

    public final void setRtlAware(boolean z) {
        this.f72590Z = z;
    }

    /* JADX INFO: renamed from: setX-0680j_4, reason: not valid java name */
    public final void m31887setX0680j_4(float f) {
        this.f72588X = f;
    }

    /* JADX INFO: renamed from: setY-0680j_4, reason: not valid java name */
    public final void m31888setY0680j_4(float f) {
        this.f72589Y = f;
    }

    private pzb(float f, float f2, boolean z) {
        this.f72588X = f;
        this.f72589Y = f2;
        this.f72590Z = z;
    }
}
