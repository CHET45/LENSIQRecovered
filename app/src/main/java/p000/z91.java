package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.graphics.C0735b;
import androidx.compose.p002ui.graphics.InterfaceC0736c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,154:1\n148#2:155\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:155\n*E\n"})
public final class z91 {

    /* JADX INFO: renamed from: z91$a */
    public static final class C16039a extends tt8 implements qy6<InterfaceC0736c, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f104432a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f104433b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f104434c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ m8f f104435d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f104436e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16039a(float f, float f2, int i, m8f m8fVar, boolean z) {
            super(1);
            this.f104432a = f;
            this.f104433b = f2;
            this.f104434c = i;
            this.f104435d = m8fVar;
            this.f104436e = z;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(InterfaceC0736c interfaceC0736c) {
            invoke2(interfaceC0736c);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb InterfaceC0736c interfaceC0736c) {
            float fMo27173toPx0680j_4 = interfaceC0736c.mo27173toPx0680j_4(this.f104432a);
            float fMo27173toPx0680j_42 = interfaceC0736c.mo27173toPx0680j_4(this.f104433b);
            interfaceC0736c.setRenderEffect((fMo27173toPx0680j_4 <= 0.0f || fMo27173toPx0680j_42 <= 0.0f) ? null : pzd.m31889BlurEffect3YTHUZs(fMo27173toPx0680j_4, fMo27173toPx0680j_42, this.f104434c));
            m8f rectangleShape = this.f104435d;
            if (rectangleShape == null) {
                rectangleShape = cvd.getRectangleShape();
            }
            interfaceC0736c.setShape(rectangleShape);
            interfaceC0736c.setClip(this.f104436e);
        }
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final InterfaceC0701e m33497blur1fqSgw(@yfb InterfaceC0701e interfaceC0701e, float f, float f2, @yfb m8f m8fVar) {
        boolean z;
        int iM32477getDecal3opZhB0;
        if (m8fVar != null) {
            iM32477getDecal3opZhB0 = tzg.f86446b.m32476getClamp3opZhB0();
            z = true;
        } else {
            z = false;
            iM32477getDecal3opZhB0 = tzg.f86446b.m32477getDecal3opZhB0();
        }
        float f3 = 0;
        return ((kn4.m30704compareTo0680j_4(f, kn4.m30705constructorimpl(f3)) <= 0 || kn4.m30704compareTo0680j_4(f2, kn4.m30705constructorimpl(f3)) <= 0) && !z) ? interfaceC0701e : C0735b.graphicsLayer(interfaceC0701e, new C16039a(f, f2, iM32477getDecal3opZhB0, m8fVar, z));
    }

    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC0701e m33498blur1fqSgw$default(InterfaceC0701e interfaceC0701e, float f, float f2, ba1 ba1Var, int i, Object obj) {
        if ((i & 4) != 0) {
            ba1Var = ba1.m27968boximpl(ba1.f13107b.m27975getRectangleGoahg());
        }
        return m33497blur1fqSgw(interfaceC0701e, f, f2, ba1Var.m27974unboximpl());
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final InterfaceC0701e m33499blurF8QBwvs(@yfb InterfaceC0701e interfaceC0701e, float f, @yfb m8f m8fVar) {
        return m33497blur1fqSgw(interfaceC0701e, f, f, m8fVar);
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC0701e m33500blurF8QBwvs$default(InterfaceC0701e interfaceC0701e, float f, ba1 ba1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            ba1Var = ba1.m27968boximpl(ba1.f13107b.m27975getRectangleGoahg());
        }
        return m33499blurF8QBwvs(interfaceC0701e, f, ba1Var.m27974unboximpl());
    }
}
