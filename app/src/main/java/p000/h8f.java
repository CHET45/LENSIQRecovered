package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.draw.ShadowGraphicsLayerElement;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,145:1\n148#2:146\n148#2:147\n148#2:148\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n66#1:146\n108#1:147\n105#1:148\n*E\n"})
public final class h8f {
    @f0g
    @yfb
    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final InterfaceC0701e m29959shadows4CzXII(@yfb InterfaceC0701e interfaceC0701e, float f, @yfb m8f m8fVar, boolean z, long j, long j2) {
        return (kn4.m30704compareTo0680j_4(f, kn4.m30705constructorimpl((float) 0)) > 0 || z) ? interfaceC0701e.then(new ShadowGraphicsLayerElement(f, m8fVar, z, j, j2, null)) : interfaceC0701e;
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC0701e m29960shadows4CzXII$default(InterfaceC0701e interfaceC0701e, float f, m8f m8fVar, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        m8f rectangleShape = (i & 2) != 0 ? cvd.getRectangleShape() : m8fVar;
        if ((i & 4) != 0) {
            z2 = false;
            if (kn4.m30704compareTo0680j_4(f, kn4.m30705constructorimpl(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return m29959shadows4CzXII(interfaceC0701e, f, rectangleShape, z2, (i & 8) != 0 ? y97.getDefaultShadowColor() : j, (i & 16) != 0 ? y97.getDefaultShadowColor() : j2);
    }

    @f0g
    @q64(level = u64.f86867c, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @i2e(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* JADX INFO: renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ InterfaceC0701e m29961shadowziNgDLE(InterfaceC0701e interfaceC0701e, float f, m8f m8fVar, boolean z) {
        return m29959shadows4CzXII(interfaceC0701e, f, m8fVar, z, y97.getDefaultShadowColor(), y97.getDefaultShadowColor());
    }

    /* JADX INFO: renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC0701e m29962shadowziNgDLE$default(InterfaceC0701e interfaceC0701e, float f, m8f m8fVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            m8fVar = cvd.getRectangleShape();
        }
        if ((i & 4) != 0) {
            z = false;
            if (kn4.m30704compareTo0680j_4(f, kn4.m30705constructorimpl(0)) > 0) {
                z = true;
            }
        }
        return m29961shadowziNgDLE(interfaceC0701e, f, m8fVar, z);
    }
}
