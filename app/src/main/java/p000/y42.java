package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n148#2:101\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n63#1:101\n*E\n"})
public final class y42 {

    /* JADX INFO: renamed from: a */
    public static final float f100318a = kn4.m30705constructorimpl(30);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final InterfaceC0701e f100319b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final InterfaceC0701e f100320c;

    /* JADX INFO: renamed from: y42$a */
    @dwf({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$HorizontalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
    public static final class C15484a implements m8f {
        @Override // p000.m8f
        @yfb
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public n8c mo27947createOutlinePq9zytI(long j, @yfb ov8 ov8Var, @yfb c64 c64Var) {
            float fMo27167roundToPx0680j_4 = c64Var.mo27167roundToPx0680j_4(y42.getMaxSupportedElevation());
            return new n8c.C9742b(new rud(0.0f, -fMo27167roundToPx0680j_4, wpf.m33069getWidthimpl(j), wpf.m33066getHeightimpl(j) + fMo27167roundToPx0680j_4));
        }
    }

    /* JADX INFO: renamed from: y42$b */
    @dwf({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$VerticalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
    public static final class C15485b implements m8f {
        @Override // p000.m8f
        @yfb
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public n8c mo27947createOutlinePq9zytI(long j, @yfb ov8 ov8Var, @yfb c64 c64Var) {
            float fMo27167roundToPx0680j_4 = c64Var.mo27167roundToPx0680j_4(y42.getMaxSupportedElevation());
            return new n8c.C9742b(new rud(-fMo27167roundToPx0680j_4, 0.0f, wpf.m33069getWidthimpl(j) + fMo27167roundToPx0680j_4, wpf.m33066getHeightimpl(j)));
        }
    }

    static {
        InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
        f100319b = v42.clip(aVar, new C15484a());
        f100320c = v42.clip(aVar, new C15485b());
    }

    @f0g
    @yfb
    public static final InterfaceC0701e clipScrollableContainer(@yfb InterfaceC0701e interfaceC0701e, @yfb t7c t7cVar) {
        return interfaceC0701e.then(t7cVar == t7c.Vertical ? f100320c : f100319b);
    }

    public static final float getMaxSupportedElevation() {
        return f100318a;
    }
}
