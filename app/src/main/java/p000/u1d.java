package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u1d {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ long m23001a(h2d h2dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(h2dVar, z);
    }

    @q64(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @i2e(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@yfb h2d h2dVar) {
        return h2dVar.isConsumed();
    }

    public static final boolean changedToDown(@yfb h2d h2dVar) {
        return (h2dVar.isConsumed() || h2dVar.getPreviousPressed() || !h2dVar.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@yfb h2d h2dVar) {
        return !h2dVar.getPreviousPressed() && h2dVar.getPressed();
    }

    public static final boolean changedToUp(@yfb h2d h2dVar) {
        return (h2dVar.isConsumed() || !h2dVar.getPreviousPressed() || h2dVar.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@yfb h2d h2dVar) {
        return h2dVar.getPreviousPressed() && !h2dVar.getPressed();
    }

    @q64(message = "Use consume() instead", replaceWith = @i2e(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@yfb h2d h2dVar) {
        h2dVar.consume();
    }

    @q64(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @i2e(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@yfb h2d h2dVar) {
        if (h2dVar.getPressed() != h2dVar.getPreviousPressed()) {
            h2dVar.consume();
        }
    }

    @q64(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @i2e(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@yfb h2d h2dVar) {
        if (izb.m30426equalsimpl0(positionChange(h2dVar), izb.f49009b.m30445getZeroF1C5BW0())) {
            return;
        }
        h2dVar.consume();
    }

    @q64(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @i2e(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m32523isOutOfBoundsO0kMr_c(@yfb h2d h2dVar, long j) {
        long jM29911getPositionF1C5BW0 = h2dVar.m29911getPositionF1C5BW0();
        float fM30429getXimpl = izb.m30429getXimpl(jM29911getPositionF1C5BW0);
        float fM30430getYimpl = izb.m30430getYimpl(jM29911getPositionF1C5BW0);
        return fM30429getXimpl < 0.0f || fM30429getXimpl > ((float) r78.m32087getWidthimpl(j)) || fM30430getYimpl < 0.0f || fM30430getYimpl > ((float) r78.m32086getHeightimpl(j));
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m32524isOutOfBoundsjwHxaWs(@yfb h2d h2dVar, long j, long j2) {
        if (!z2d.m33469equalsimpl0(h2dVar.m29914getTypeT8wyACA(), z2d.f103875b.m33476getTouchT8wyACA())) {
            return m32523isOutOfBoundsO0kMr_c(h2dVar, j);
        }
        long jM29911getPositionF1C5BW0 = h2dVar.m29911getPositionF1C5BW0();
        float fM30429getXimpl = izb.m30429getXimpl(jM29911getPositionF1C5BW0);
        float fM30430getYimpl = izb.m30430getYimpl(jM29911getPositionF1C5BW0);
        return fM30429getXimpl < (-wpf.m33069getWidthimpl(j2)) || fM30429getXimpl > ((float) r78.m32087getWidthimpl(j)) + wpf.m33069getWidthimpl(j2) || fM30430getYimpl < (-wpf.m33066getHeightimpl(j2)) || fM30430getYimpl > ((float) r78.m32086getHeightimpl(j)) + wpf.m33066getHeightimpl(j2);
    }

    public static final long positionChange(@yfb h2d h2dVar) {
        return positionChangeInternal(h2dVar, false);
    }

    @q64(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @i2e(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@yfb h2d h2dVar) {
        return h2dVar.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@yfb h2d h2dVar) {
        return positionChangeInternal(h2dVar, true);
    }

    private static final long positionChangeInternal(h2d h2dVar, boolean z) {
        long jM30433minusMKHz9U = izb.m30433minusMKHz9U(h2dVar.m29911getPositionF1C5BW0(), h2dVar.m29912getPreviousPositionF1C5BW0());
        return (z || !h2dVar.isConsumed()) ? jM30433minusMKHz9U : izb.f49009b.m30445getZeroF1C5BW0();
    }

    public static final boolean positionChanged(@yfb h2d h2dVar) {
        return !izb.m30426equalsimpl0(positionChangeInternal(h2dVar, false), izb.f49009b.m30445getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@yfb h2d h2dVar) {
        return !izb.m30426equalsimpl0(positionChangeInternal(h2dVar, true), izb.f49009b.m30445getZeroF1C5BW0());
    }
}
