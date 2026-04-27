package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
public final class mug {
    /* JADX INFO: renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m31049coerceIn3MmeM6k(long j, @yfb rud rudVar) {
        return mzb.Offset(izb.m30429getXimpl(j) < rudVar.getLeft() ? rudVar.getLeft() : izb.m30429getXimpl(j) > rudVar.getRight() ? rudVar.getRight() : izb.m30429getXimpl(j), izb.m30430getYimpl(j) < rudVar.getTop() ? rudVar.getTop() : izb.m30430getYimpl(j) > rudVar.getBottom() ? rudVar.getBottom() : izb.m30430getYimpl(j));
    }

    /* JADX INFO: renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m31050fromDecorationToTextLayoutUv8p0NA(@yfb lug lugVar, long j) {
        izb izbVarM30418boximpl;
        mv8 textLayoutNodeCoordinates = lugVar.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return j;
        }
        mv8 decoratorNodeCoordinates = lugVar.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            izbVarM30418boximpl = izb.m30418boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo30034localPositionOfR5De75A(decoratorNodeCoordinates, j) : j);
        } else {
            izbVarM30418boximpl = null;
        }
        return izbVarM30418boximpl != null ? izbVarM30418boximpl.m30439unboximpl() : j;
    }

    /* JADX INFO: renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m31051fromTextLayoutToCoreUv8p0NA(@yfb lug lugVar, long j) {
        mv8 textLayoutNodeCoordinates = lugVar.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return j;
        }
        izb izbVarM30418boximpl = null;
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return j;
        }
        mv8 coreNodeCoordinates = lugVar.getCoreNodeCoordinates();
        if (coreNodeCoordinates != null) {
            if (!coreNodeCoordinates.isAttached()) {
                coreNodeCoordinates = null;
            }
            if (coreNodeCoordinates != null) {
                izbVarM30418boximpl = izb.m30418boximpl(coreNodeCoordinates.mo30034localPositionOfR5De75A(textLayoutNodeCoordinates, j));
            }
        }
        return izbVarM30418boximpl != null ? izbVarM30418boximpl.m30439unboximpl() : j;
    }

    /* JADX INFO: renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m31052fromWindowToDecorationUv8p0NA(@yfb lug lugVar, long j) {
        mv8 decoratorNodeCoordinates = lugVar.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j : decoratorNodeCoordinates.mo30047windowToLocalMKHz9U(j);
    }
}
