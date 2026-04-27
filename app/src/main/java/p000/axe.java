package p000;

import java.util.List;
import p000.gwe;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1073:1\n33#2,6:1074\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n945#1:1074,6\n*E\n"})
public final class axe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final rud f12165a = new rud(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: axe$a */
    public /* synthetic */ class C1651a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12166a;

        static {
            int[] iArr = new int[zd7.values().length];
            try {
                iArr[zd7.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zd7.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zd7.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12166a = iArr;
        }
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m27905calculateSelectionMagnifierCenterAndroidO0kMr_c(@yfb zwe zweVar, long j) {
        gwe selection = zweVar.getSelection();
        if (selection == null) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        zd7 draggingHandle = zweVar.getDraggingHandle();
        int i = draggingHandle == null ? -1 : C1651a.f12166a[draggingHandle.ordinal()];
        if (i == -1) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m27907getMagnifierCenterJVtK1S4(zweVar, j, selection.getStart());
        }
        if (i == 2) {
            return m27907getMagnifierCenterJVtK1S4(zweVar, j, selection.getEnd());
        }
        if (i != 3) {
            throw new ceb();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m27906containsInclusiveUv8p0NA(@yfb rud rudVar, long j) {
        float left = rudVar.getLeft();
        float right = rudVar.getRight();
        float fM30429getXimpl = izb.m30429getXimpl(j);
        if (left <= fM30429getXimpl && fM30429getXimpl <= right) {
            float top = rudVar.getTop();
            float bottom = rudVar.getBottom();
            float fM30430getYimpl = izb.m30430getYimpl(j);
            if (top <= fM30430getYimpl && fM30430getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : l82.listOf(v82.first((List) list), v82.last((List) list));
    }

    /* JADX INFO: renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m27907getMagnifierCenterJVtK1S4(zwe zweVar, long j, gwe.C6633a c6633a) {
        mv8 containerLayoutCoordinates;
        mv8 layoutCoordinates;
        int offset;
        float fCoerceIn;
        cwe anchorSelectable$foundation_release = zweVar.getAnchorSelectable$foundation_release(c6633a);
        if (anchorSelectable$foundation_release != null && (containerLayoutCoordinates = zweVar.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null && (offset = c6633a.getOffset()) <= anchorSelectable$foundation_release.getLastVisibleOffset()) {
            izb izbVarM33554getCurrentDragPosition_m7T9E = zweVar.m33554getCurrentDragPosition_m7T9E();
            md8.checkNotNull(izbVarM33554getCurrentDragPosition_m7T9E);
            float fM30429getXimpl = izb.m30429getXimpl(layoutCoordinates.mo30034localPositionOfR5De75A(containerLayoutCoordinates, izbVarM33554getCurrentDragPosition_m7T9E.m30439unboximpl()));
            long jMo28557getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo28557getRangeOfLineContainingjx7JFs(offset);
            if (jvg.m30587getCollapsedimpl(jMo28557getRangeOfLineContainingjx7JFs)) {
                fCoerceIn = anchorSelectable$foundation_release.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation_release.getLineLeft(jvg.m30593getStartimpl(jMo28557getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation_release.getLineRight(jvg.m30588getEndimpl(jMo28557getRangeOfLineContainingjx7JFs) - 1);
                fCoerceIn = kpd.coerceIn(fM30429getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
            }
            if (fCoerceIn == -1.0f) {
                return izb.f49009b.m30444getUnspecifiedF1C5BW0();
            }
            if (!r78.m32085equalsimpl0(j, r78.f77324b.m32092getZeroYbymL2g()) && Math.abs(fM30429getXimpl - fCoerceIn) > r78.m32087getWidthimpl(j) / 2) {
                return izb.f49009b.m30444getUnspecifiedF1C5BW0();
            }
            float centerYForOffset = anchorSelectable$foundation_release.getCenterYForOffset(offset);
            return centerYForOffset == -1.0f ? izb.f49009b.m30444getUnspecifiedF1C5BW0() : containerLayoutCoordinates.mo30034localPositionOfR5De75A(layoutCoordinates, mzb.Offset(fCoerceIn, centerYForOffset));
        }
        return izb.f49009b.m30444getUnspecifiedF1C5BW0();
    }

    @yfb
    @fdi
    public static final rud getSelectedRegionRect(@yfb List<? extends scc<? extends cwe, gwe>> list, @yfb mv8 mv8Var) {
        int i;
        mv8 layoutCoordinates;
        int[] iArr;
        if (list.isEmpty()) {
            return f12165a;
        }
        rud rudVar = f12165a;
        float fComponent1 = rudVar.component1();
        float fComponent2 = rudVar.component2();
        float fComponent3 = rudVar.component3();
        float fComponent4 = rudVar.component4();
        int size = list.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            scc<? extends cwe, gwe> sccVar = list.get(i2);
            cwe cweVarComponent1 = sccVar.component1();
            gwe gweVarComponent2 = sccVar.component2();
            int offset = gweVarComponent2.getStart().getOffset();
            int offset2 = gweVarComponent2.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates = cweVarComponent1.getLayoutCoordinates()) == null) {
                i = size;
            } else {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                rud rudVar2 = f12165a;
                float fComponent12 = rudVar2.component1();
                float fComponent22 = rudVar2.component2();
                float fComponent32 = rudVar2.component3();
                float fComponent42 = rudVar2.component4();
                int length = iArr.length;
                i = size;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    rud boundingBox = cweVarComponent1.getBoundingBox(iArr[i3]);
                    fComponent12 = Math.min(fComponent12, boundingBox.getLeft());
                    fComponent22 = Math.min(fComponent22, boundingBox.getTop());
                    fComponent32 = Math.max(fComponent32, boundingBox.getRight());
                    fComponent42 = Math.max(fComponent42, boundingBox.getBottom());
                    i3++;
                    length = i4;
                }
                long jOffset = mzb.Offset(fComponent12, fComponent22);
                long jOffset2 = mzb.Offset(fComponent32, fComponent42);
                long jMo30034localPositionOfR5De75A = mv8Var.mo30034localPositionOfR5De75A(layoutCoordinates, jOffset);
                long jMo30034localPositionOfR5De75A2 = mv8Var.mo30034localPositionOfR5De75A(layoutCoordinates, jOffset2);
                fComponent1 = Math.min(fComponent1, izb.m30429getXimpl(jMo30034localPositionOfR5De75A));
                fComponent2 = Math.min(fComponent2, izb.m30430getYimpl(jMo30034localPositionOfR5De75A));
                fComponent3 = Math.max(fComponent3, izb.m30429getXimpl(jMo30034localPositionOfR5De75A2));
                fComponent4 = Math.max(fComponent4, izb.m30430getYimpl(jMo30034localPositionOfR5De75A2));
            }
            i2++;
            size = i;
            c = 0;
        }
        return new rud(fComponent1, fComponent2, fComponent3, fComponent4);
    }

    @gib
    public static final gwe merge(@gib gwe gweVar, @gib gwe gweVar2) {
        gwe gweVarMerge;
        return (gweVar == null || (gweVarMerge = gweVar.merge(gweVar2)) == null) ? gweVar2 : gweVarMerge;
    }

    @yfb
    public static final rud visibleBounds(@yfb mv8 mv8Var) {
        rud rudVarBoundsInWindow = nv8.boundsInWindow(mv8Var);
        return xud.m33301Rect0a9Yr6o(mv8Var.mo30047windowToLocalMKHz9U(rudVarBoundsInWindow.m32208getTopLeftF1C5BW0()), mv8Var.mo30047windowToLocalMKHz9U(rudVarBoundsInWindow.m32202getBottomRightF1C5BW0()));
    }
}
