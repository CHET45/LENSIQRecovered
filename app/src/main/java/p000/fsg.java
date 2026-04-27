package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class fsg {

    /* JADX INFO: renamed from: fsg$a */
    public /* synthetic */ class C5957a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37650a;

        static {
            int[] iArr = new int[zd7.values().length];
            try {
                iArr[zd7.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zd7.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zd7.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37650a = iArr;
        }
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m29660calculateSelectionMagnifierCenterAndroidhUlJWOE(@yfb jeh jehVar, @yfb rsg rsgVar, @yfb lug lugVar, long j) {
        int iM30593getStartimpl;
        long jM32188getHandleDragPositionF1C5BW0 = rsgVar.m32188getHandleDragPositionF1C5BW0();
        if (mzb.m31102isUnspecifiedk4lQ0M(jM32188getHandleDragPositionF1C5BW0) || jehVar.getVisualText().length() == 0) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        long jM30568getSelectiond9O1mEE = jehVar.getVisualText().m30568getSelectiond9O1mEE();
        zd7 draggingHandle = rsgVar.getDraggingHandle();
        int i = draggingHandle == null ? -1 : C5957a.f37650a[draggingHandle.ordinal()];
        if (i == -1) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            iM30593getStartimpl = jvg.m30593getStartimpl(jM30568getSelectiond9O1mEE);
        } else {
            if (i != 3) {
                throw new ceb();
            }
            iM30593getStartimpl = jvg.m30588getEndimpl(jM30568getSelectiond9O1mEE);
        }
        hug layoutResult = lugVar.getLayoutResult();
        if (layoutResult == null) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        float fM30429getXimpl = izb.m30429getXimpl(jM32188getHandleDragPositionF1C5BW0);
        int lineForOffset = layoutResult.getLineForOffset(iM30593getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float fCoerceIn = kpd.coerceIn(fM30429getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!r78.m32085equalsimpl0(j, r78.f77324b.m32092getZeroYbymL2g()) && Math.abs(fM30429getXimpl - fCoerceIn) > r78.m32087getWidthimpl(j) / 2) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long jOffset = mzb.Offset(fCoerceIn, ((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
        mv8 textLayoutNodeCoordinates = lugVar.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                jOffset = mug.m31049coerceIn3MmeM6k(jOffset, axe.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return mug.m31051fromTextLayoutToCoreUv8p0NA(lugVar, jOffset);
    }
}
