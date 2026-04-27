package p000;

import p000.lw8;
import p000.z9c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 5 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,746:1\n487#1:774\n488#1:780\n490#1,12:782\n503#1,6:801\n487#1:807\n488#1:813\n490#1,19:815\n487#1:853\n488#1:859\n490#1:861\n491#1:867\n493#1:869\n494#1:875\n497#1,12:877\n1208#2:747\n1187#2,2:748\n1208#2:750\n1187#2,2:751\n96#3,7:753\n96#3,7:760\n42#3,7:767\n96#3,5:775\n102#3:781\n96#3,5:808\n102#3:814\n96#3,7:846\n96#3,5:854\n102#3:860\n96#3,5:862\n102#3:868\n96#3,5:870\n102#3:876\n96#3,7:901\n96#3,7:908\n96#3,7:915\n42#3,7:946\n96#3,7:953\n178#4,2:794\n180#4,4:797\n102#5:796\n203#6:834\n203#6:889\n203#6:960\n460#7,11:835\n460#7,11:890\n728#7,2:922\n460#7,11:924\n460#7,11:935\n460#7,11:961\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n387#1:774\n387#1:780\n387#1:782,12\n387#1:801,6\n408#1:807\n408#1:813\n408#1:815,19\n447#1:853\n447#1:859\n447#1:861\n447#1:867\n447#1:869\n447#1:875\n447#1:877,12\n75#1:747\n75#1:748,2\n96#1:750\n96#1:751,2\n83#1:753,7\n105#1:760,7\n139#1:767,7\n387#1:775,5\n387#1:781\n408#1:808,5\n408#1:814\n446#1:846,7\n447#1:854,5\n447#1:860\n447#1:862,5\n447#1:868\n447#1:870,5\n447#1:876\n487#1:901,7\n490#1:908,7\n493#1:915,7\n640#1:946,7\n645#1:953,7\n389#1:794,2\n389#1:797,4\n389#1:796\n426#1:834\n475#1:889\n665#1:960\n426#1:835,11\n475#1:890,11\n511#1:922,2\n515#1:924,11\n591#1:935,11\n665#1:961,11\n*E\n"})
@e0g(parameters = 0)
public final class sba {

    /* JADX INFO: renamed from: k */
    public static final int f81119k = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw8 f81120a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final w64 f81121b;

    /* JADX INFO: renamed from: c */
    public boolean f81122c;

    /* JADX INFO: renamed from: d */
    public boolean f81123d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final g4c f81124e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final f7b<z9c.InterfaceC16043b> f81125f;

    /* JADX INFO: renamed from: g */
    public long f81126g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final f7b<C12507a> f81127h;

    /* JADX INFO: renamed from: i */
    @gib
    public ku2 f81128i;

    /* JADX INFO: renamed from: j */
    @gib
    public final ww8 f81129j;

    /* JADX INFO: renamed from: sba$a */
    @e0g(parameters = 0)
    public static final class C12507a {

        /* JADX INFO: renamed from: d */
        public static final int f81130d = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final lw8 f81131a;

        /* JADX INFO: renamed from: b */
        public final boolean f81132b;

        /* JADX INFO: renamed from: c */
        public final boolean f81133c;

        public C12507a(@yfb lw8 lw8Var, boolean z, boolean z2) {
            this.f81131a = lw8Var;
            this.f81132b = z;
            this.f81133c = z2;
        }

        @yfb
        public final lw8 getNode() {
            return this.f81131a;
        }

        public final boolean isForced() {
            return this.f81133c;
        }

        public final boolean isLookahead() {
            return this.f81132b;
        }
    }

    /* JADX INFO: renamed from: sba$b */
    public /* synthetic */ class C12508b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81134a;

        static {
            int[] iArr = new int[lw8.EnumC9003e.values().length];
            try {
                iArr[lw8.EnumC9003e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lw8.EnumC9003e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lw8.EnumC9003e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lw8.EnumC9003e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lw8.EnumC9003e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f81134a = iArr;
        }
    }

    public sba(@yfb lw8 lw8Var) {
        this.f81120a = lw8Var;
        z9c.C16042a c16042a = z9c.f104498S;
        w64 w64Var = new w64(c16042a.getEnableExtraAssertions());
        this.f81121b = w64Var;
        this.f81124e = new g4c();
        this.f81125f = new f7b<>(new z9c.InterfaceC16043b[16], 0);
        this.f81126g = 1L;
        f7b<C12507a> f7bVar = new f7b<>(new C12507a[16], 0);
        this.f81127h = f7bVar;
        this.f81129j = c16042a.getEnableExtraAssertions() ? new ww8(lw8Var, w64Var, f7bVar.asMutableList()) : null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m21806a(sba sbaVar, lw8 lw8Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return sbaVar.remeasureAndRelayoutIfNeeded(lw8Var, z, z2);
    }

    private final void callOnLayoutCompletedListeners() {
        f7b<z9c.InterfaceC16043b> f7bVar = this.f81125f;
        int size = f7bVar.getSize();
        if (size > 0) {
            z9c.InterfaceC16043b[] content = f7bVar.getContent();
            int i = 0;
            do {
                content[i].onLayoutComplete();
                i++;
            } while (i < size);
        }
        this.f81125f.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(sba sbaVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sbaVar.dispatchOnPositionedCallbacks(z);
    }

    /* JADX INFO: renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m32293doLookaheadRemeasuresdFAvZA(lw8 lw8Var, ku2 ku2Var) {
        if (lw8Var.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        boolean zM30907lookaheadRemeasure_Sx5XlM$ui_release = ku2Var != null ? lw8Var.m30907lookaheadRemeasure_Sx5XlM$ui_release(ku2Var) : lw8.m30903lookaheadRemeasure_Sx5XlM$ui_release$default(lw8Var, null, 1, null);
        lw8 parent$ui_release = lw8Var.getParent$ui_release();
        if (zM30907lookaheadRemeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                lw8.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
            } else if (lw8Var.getMeasuredByParentInLookahead$ui_release() == lw8.EnumC9005g.InMeasureBlock) {
                lw8.requestLookaheadRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
            } else if (lw8Var.getMeasuredByParentInLookahead$ui_release() == lw8.EnumC9005g.InLayoutBlock) {
                lw8.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return zM30907lookaheadRemeasure_Sx5XlM$ui_release;
    }

    /* JADX INFO: renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m32294doRemeasuresdFAvZA(lw8 lw8Var, ku2 ku2Var) {
        boolean zM30908remeasure_Sx5XlM$ui_release = ku2Var != null ? lw8Var.m30908remeasure_Sx5XlM$ui_release(ku2Var) : lw8.m30904remeasure_Sx5XlM$ui_release$default(lw8Var, null, 1, null);
        lw8 parent$ui_release = lw8Var.getParent$ui_release();
        if (zM30908remeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (lw8Var.getMeasuredByParent$ui_release() == lw8.EnumC9005g.InMeasureBlock) {
                lw8.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
            } else if (lw8Var.getMeasuredByParent$ui_release() == lw8.EnumC9005g.InLayoutBlock) {
                lw8.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return zM30908remeasure_Sx5XlM$ui_release;
    }

    private final void drainPostponedMeasureRequests() {
        if (this.f81127h.isNotEmpty()) {
            f7b<C12507a> f7bVar = this.f81127h;
            int size = f7bVar.getSize();
            if (size > 0) {
                C12507a[] content = f7bVar.getContent();
                int i = 0;
                do {
                    C12507a c12507a = content[i];
                    if (c12507a.getNode().isAttached()) {
                        if (c12507a.isLookahead()) {
                            lw8.requestLookaheadRemeasure$ui_release$default(c12507a.getNode(), c12507a.isForced(), false, false, 2, null);
                        } else {
                            lw8.requestRemeasure$ui_release$default(c12507a.getNode(), c12507a.isForced(), false, false, 2, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
            this.f81127h.clear();
        }
    }

    private final void ensureSubtreeLookaheadReplaced(lw8 lw8Var) {
        f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var2 = content[i];
                if (md8.areEqual(lw8Var2.isPlacedInLookahead(), Boolean.TRUE) && !lw8Var2.isDeactivated()) {
                    if (this.f81121b.contains(lw8Var2, true)) {
                        lw8Var2.lookaheadReplace$ui_release();
                    }
                    ensureSubtreeLookaheadReplaced(lw8Var2);
                }
                i++;
            } while (i < size);
        }
    }

    private final void forceMeasureTheSubtreeInternal(lw8 lw8Var, boolean z) {
        f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var2 = content[i];
                if ((!z && getMeasureAffectsParent(lw8Var2)) || (z && getMeasureAffectsParentLookahead(lw8Var2))) {
                    if (rw8.isOutMostLookaheadRoot(lw8Var2) && !z) {
                        if (lw8Var2.getLookaheadMeasurePending$ui_release() && this.f81121b.contains(lw8Var2, true)) {
                            remeasureAndRelayoutIfNeeded(lw8Var2, true, false);
                        } else {
                            forceMeasureTheSubtree(lw8Var2, true);
                        }
                    }
                    onlyRemeasureIfScheduled(lw8Var2, z);
                    if (!measurePending(lw8Var2, z)) {
                        forceMeasureTheSubtreeInternal(lw8Var2, z);
                    }
                }
                i++;
            } while (i < size);
        }
        onlyRemeasureIfScheduled(lw8Var, z);
    }

    private final boolean getCanAffectParent(lw8 lw8Var) {
        return lw8Var.getMeasurePending$ui_release() && getMeasureAffectsParent(lw8Var);
    }

    private final boolean getCanAffectParentInLookahead(lw8 lw8Var) {
        return lw8Var.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(lw8Var);
    }

    private final boolean getMeasureAffectsParent(lw8 lw8Var) {
        return lw8Var.getMeasuredByParent$ui_release() == lw8.EnumC9005g.InMeasureBlock || lw8Var.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    private final boolean getMeasureAffectsParentLookahead(lw8 lw8Var) {
        AbstractC12150rm alignmentLines;
        if (lw8Var.getMeasuredByParentInLookahead$ui_release() == lw8.EnumC9005g.InMeasureBlock) {
            return true;
        }
        InterfaceC12654sm lookaheadAlignmentLinesOwner$ui_release = lw8Var.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(sba sbaVar, ny6 ny6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ny6Var = null;
        }
        return sbaVar.measureAndLayout(ny6Var);
    }

    private final boolean measurePending(lw8 lw8Var, boolean z) {
        return z ? lw8Var.getLookaheadMeasurePending$ui_release() : lw8Var.getMeasurePending$ui_release();
    }

    private final void onlyRemeasureIfScheduled(lw8 lw8Var, boolean z) {
        if (measurePending(lw8Var, z) && this.f81121b.contains(lw8Var, z)) {
            remeasureAndRelayoutIfNeeded(lw8Var, z, false);
        }
    }

    private final void performMeasureAndLayout(boolean z, ny6<bth> ny6Var) {
        if (!this.f81120a.isAttached()) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.f81120a.isPlaced()) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.f81122c) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.f81128i != null) {
            this.f81122c = true;
            this.f81123d = z;
            try {
                ny6Var.invoke();
                o28.finallyStart(1);
                this.f81122c = false;
                this.f81123d = false;
                o28.finallyEnd(1);
                ww8 ww8Var = this.f81129j;
                if (ww8Var != null) {
                    ww8Var.assertConsistent();
                }
            } catch (Throwable th) {
                o28.finallyStart(1);
                this.f81122c = false;
                this.f81123d = false;
                o28.finallyEnd(1);
                throw th;
            }
        }
    }

    private final boolean remeasureAndRelayoutIfNeeded(lw8 lw8Var, boolean z, boolean z2) {
        ku2 ku2Var;
        lw8 parent$ui_release;
        if (lw8Var.isDeactivated()) {
            return false;
        }
        if (lw8Var.isPlaced() || lw8Var.isPlacedByParent() || getCanAffectParent(lw8Var) || md8.areEqual(lw8Var.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(lw8Var) || lw8Var.getAlignmentLinesRequired$ui_release()) {
            if (lw8Var == this.f81120a) {
                ku2Var = this.f81128i;
                md8.checkNotNull(ku2Var);
            } else {
                ku2Var = null;
            }
            if (z) {
                zM32293doLookaheadRemeasuresdFAvZA = lw8Var.getLookaheadMeasurePending$ui_release() ? m32293doLookaheadRemeasuresdFAvZA(lw8Var, ku2Var) : false;
                if (z2 && ((zM32293doLookaheadRemeasuresdFAvZA || lw8Var.getLookaheadLayoutPending$ui_release()) && md8.areEqual(lw8Var.isPlacedInLookahead(), Boolean.TRUE))) {
                    lw8Var.lookaheadReplace$ui_release();
                }
            } else {
                boolean zM32294doRemeasuresdFAvZA = lw8Var.getMeasurePending$ui_release() ? m32294doRemeasuresdFAvZA(lw8Var, ku2Var) : false;
                if (z2 && lw8Var.getLayoutPending$ui_release() && (lw8Var == this.f81120a || ((parent$ui_release = lw8Var.getParent$ui_release()) != null && parent$ui_release.isPlaced() && lw8Var.isPlacedByParent()))) {
                    if (lw8Var == this.f81120a) {
                        lw8Var.place$ui_release(0, 0);
                    } else {
                        lw8Var.replace$ui_release();
                    }
                    this.f81124e.onNodePositioned(lw8Var);
                    ww8 ww8Var = this.f81129j;
                    if (ww8Var != null) {
                        ww8Var.assertConsistent();
                    }
                }
                zM32293doLookaheadRemeasuresdFAvZA = zM32294doRemeasuresdFAvZA;
            }
            drainPostponedMeasureRequests();
        }
        return zM32293doLookaheadRemeasuresdFAvZA;
    }

    private final void remeasureLookaheadRootsInSubtree(lw8 lw8Var) {
        f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var2 = content[i];
                if (getMeasureAffectsParent(lw8Var2)) {
                    if (rw8.isOutMostLookaheadRoot(lw8Var2)) {
                        remeasureOnly(lw8Var2, true);
                    } else {
                        remeasureLookaheadRootsInSubtree(lw8Var2);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    private final void remeasureOnly(lw8 lw8Var, boolean z) {
        ku2 ku2Var;
        if (lw8Var.isDeactivated()) {
            return;
        }
        if (lw8Var == this.f81120a) {
            ku2Var = this.f81128i;
            md8.checkNotNull(ku2Var);
        } else {
            ku2Var = null;
        }
        if (z) {
            m32293doLookaheadRemeasuresdFAvZA(lw8Var, ku2Var);
        } else {
            m32294doRemeasuresdFAvZA(lw8Var, ku2Var);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(sba sbaVar, lw8 lw8Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sbaVar.requestLookaheadRelayout(lw8Var, z);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(sba sbaVar, lw8 lw8Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sbaVar.requestLookaheadRemeasure(lw8Var, z);
    }

    public static /* synthetic */ boolean requestRelayout$default(sba sbaVar, lw8 lw8Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sbaVar.requestRelayout(lw8Var, z);
    }

    public static /* synthetic */ boolean requestRemeasure$default(sba sbaVar, lw8 lw8Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sbaVar.requestRemeasure(lw8Var, z);
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.f81124e.onRootNodePositioned(this.f81120a);
        }
        this.f81124e.dispatch();
    }

    public final void forceMeasureTheSubtree(@yfb lw8 lw8Var, boolean z) {
        if (this.f81121b.isEmpty(z)) {
            return;
        }
        if (!this.f81122c) {
            g28.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (measurePending(lw8Var, z)) {
            g28.throwIllegalArgumentException("node not yet measured");
        }
        forceMeasureTheSubtreeInternal(lw8Var, z);
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.f81121b.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.f81124e.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.f81122c) {
            g28.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.f81126g;
    }

    public final boolean measureAndLayout(@gib ny6<bth> ny6Var) {
        boolean z;
        if (!this.f81120a.isAttached()) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.f81120a.isPlaced()) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.f81122c) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.f81128i != null) {
            this.f81122c = true;
            this.f81123d = true;
            try {
                if (this.f81121b.isNotEmpty()) {
                    w64 w64Var = this.f81121b;
                    z = false;
                    while (w64Var.isNotEmpty()) {
                        boolean zIsEmpty = w64Var.f93393a.isEmpty();
                        boolean z3 = !zIsEmpty;
                        lw8 lw8VarPop = (!zIsEmpty ? w64Var.f93393a : w64Var.f93394b).pop();
                        boolean zM21806a = m21806a(this, lw8VarPop, z3, false, 4, null);
                        if (lw8VarPop == this.f81120a && zM21806a) {
                            z = true;
                        }
                    }
                    if (ny6Var != null) {
                        ny6Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.f81122c = false;
                this.f81123d = false;
                ww8 ww8Var = this.f81129j;
                if (ww8Var != null) {
                    ww8Var.assertConsistent();
                }
                z2 = z;
            } catch (Throwable th) {
                this.f81122c = false;
                this.f81123d = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
        return z2;
    }

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m32295measureAndLayout0kLqBqw(@yfb lw8 lw8Var, long j) {
        if (lw8Var.isDeactivated()) {
            return;
        }
        if (md8.areEqual(lw8Var, this.f81120a)) {
            g28.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if (!this.f81120a.isAttached()) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.f81120a.isPlaced()) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.f81122c) {
            g28.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.f81128i != null) {
            this.f81122c = true;
            this.f81123d = false;
            try {
                this.f81121b.remove(lw8Var);
                if (m32293doLookaheadRemeasuresdFAvZA(lw8Var, ku2.m30751boximpl(j)) || lw8Var.getLookaheadLayoutPending$ui_release()) {
                    if (md8.areEqual(lw8Var.isPlacedInLookahead(), Boolean.TRUE)) {
                        lw8Var.lookaheadReplace$ui_release();
                    }
                }
                ensureSubtreeLookaheadReplaced(lw8Var);
                m32294doRemeasuresdFAvZA(lw8Var, ku2.m30751boximpl(j));
                if (lw8Var.getLayoutPending$ui_release() && lw8Var.isPlaced()) {
                    lw8Var.replace$ui_release();
                    this.f81124e.onNodePositioned(lw8Var);
                }
                drainPostponedMeasureRequests();
                this.f81122c = false;
                this.f81123d = false;
                ww8 ww8Var = this.f81129j;
                if (ww8Var != null) {
                    ww8Var.assertConsistent();
                }
            } catch (Throwable th) {
                this.f81122c = false;
                this.f81123d = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
    }

    public final void measureOnly() {
        if (this.f81121b.isNotEmpty()) {
            if (!this.f81120a.isAttached()) {
                g28.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.f81120a.isPlaced()) {
                g28.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.f81122c) {
                g28.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.f81128i != null) {
                this.f81122c = true;
                this.f81123d = false;
                try {
                    if (!this.f81121b.isEmpty(true)) {
                        if (this.f81120a.getLookaheadRoot$ui_release() != null) {
                            remeasureOnly(this.f81120a, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(this.f81120a);
                        }
                    }
                    remeasureOnly(this.f81120a, false);
                    this.f81122c = false;
                    this.f81123d = false;
                    ww8 ww8Var = this.f81129j;
                    if (ww8Var != null) {
                        ww8Var.assertConsistent();
                    }
                } catch (Throwable th) {
                    this.f81122c = false;
                    this.f81123d = false;
                    throw th;
                }
            }
        }
    }

    public final void onNodeDetached(@yfb lw8 lw8Var) {
        this.f81121b.remove(lw8Var);
        this.f81124e.remove(lw8Var);
    }

    public final void registerOnLayoutCompletedListener(@yfb z9c.InterfaceC16043b interfaceC16043b) {
        this.f81125f.add(interfaceC16043b);
    }

    public final boolean requestLookaheadRelayout(@yfb lw8 lw8Var, boolean z) {
        int i = C12508b.f81134a[lw8Var.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new ceb();
                    }
                }
            }
            if ((lw8Var.getLookaheadMeasurePending$ui_release() || lw8Var.getLookaheadLayoutPending$ui_release()) && !z) {
                ww8 ww8Var = this.f81129j;
                if (ww8Var == null) {
                    return false;
                }
                ww8Var.assertConsistent();
                return false;
            }
            lw8Var.markLookaheadLayoutPending$ui_release();
            lw8Var.markLayoutPending$ui_release();
            if (lw8Var.isDeactivated()) {
                return false;
            }
            lw8 parent$ui_release = lw8Var.getParent$ui_release();
            if (md8.areEqual(lw8Var.isPlacedInLookahead(), Boolean.TRUE) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.f81121b.add(lw8Var, true);
            } else if (lw8Var.isPlaced() && ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.f81121b.add(lw8Var, false);
            }
            return !this.f81123d;
        }
        ww8 ww8Var2 = this.f81129j;
        if (ww8Var2 == null) {
            return false;
        }
        ww8Var2.assertConsistent();
        return false;
    }

    public final boolean requestLookaheadRemeasure(@yfb lw8 lw8Var, boolean z) {
        lw8 parent$ui_release;
        lw8 parent$ui_release2;
        if (!(lw8Var.getLookaheadRoot$ui_release() != null)) {
            g28.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = C12508b.f81134a[lw8Var.getLayoutState$ui_release().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3 || i == 4) {
            this.f81127h.add(new C12507a(lw8Var, true, z));
            ww8 ww8Var = this.f81129j;
            if (ww8Var == null) {
                return false;
            }
            ww8Var.assertConsistent();
            return false;
        }
        if (i != 5) {
            throw new ceb();
        }
        if (lw8Var.getLookaheadMeasurePending$ui_release() && !z) {
            return false;
        }
        lw8Var.markLookaheadMeasurePending$ui_release();
        lw8Var.markMeasurePending$ui_release();
        if (lw8Var.isDeactivated()) {
            return false;
        }
        if ((md8.areEqual(lw8Var.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(lw8Var)) && ((parent$ui_release = lw8Var.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
            this.f81121b.add(lw8Var, true);
        } else if ((lw8Var.isPlaced() || getCanAffectParent(lw8Var)) && ((parent$ui_release2 = lw8Var.getParent$ui_release()) == null || !parent$ui_release2.getMeasurePending$ui_release())) {
            this.f81121b.add(lw8Var, false);
        }
        return !this.f81123d;
    }

    public final void requestOnPositionedCallback(@yfb lw8 lw8Var) {
        this.f81124e.onNodePositioned(lw8Var);
    }

    public final boolean requestRelayout(@yfb lw8 lw8Var, boolean z) {
        int i = C12508b.f81134a[lw8Var.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            ww8 ww8Var = this.f81129j;
            if (ww8Var != null) {
                ww8Var.assertConsistent();
            }
        } else {
            if (i != 5) {
                throw new ceb();
            }
            if (!z && lw8Var.isPlaced() == lw8Var.isPlacedByParent() && (lw8Var.getMeasurePending$ui_release() || lw8Var.getLayoutPending$ui_release())) {
                ww8 ww8Var2 = this.f81129j;
                if (ww8Var2 != null) {
                    ww8Var2.assertConsistent();
                }
            } else {
                lw8Var.markLayoutPending$ui_release();
                if (!lw8Var.isDeactivated() && lw8Var.isPlacedByParent()) {
                    lw8 parent$ui_release = lw8Var.getParent$ui_release();
                    if ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release())) {
                        this.f81121b.add(lw8Var, false);
                    }
                    if (!this.f81123d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean requestRemeasure(@yfb lw8 lw8Var, boolean z) {
        int i = C12508b.f81134a[lw8Var.getLayoutState$ui_release().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.f81127h.add(new C12507a(lw8Var, false, z));
                ww8 ww8Var = this.f81129j;
                if (ww8Var != null) {
                    ww8Var.assertConsistent();
                }
            } else {
                if (i != 5) {
                    throw new ceb();
                }
                if (!lw8Var.getMeasurePending$ui_release() || z) {
                    lw8Var.markMeasurePending$ui_release();
                    if (!lw8Var.isDeactivated() && (lw8Var.isPlaced() || getCanAffectParent(lw8Var))) {
                        lw8 parent$ui_release = lw8Var.getParent$ui_release();
                        if (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) {
                            this.f81121b.add(lw8Var, false);
                        }
                        if (!this.f81123d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m32296updateRootConstraintsBRTryo0(long j) {
        ku2 ku2Var = this.f81128i;
        if (ku2Var == null ? false : ku2.m30756equalsimpl0(ku2Var.m30769unboximpl(), j)) {
            return;
        }
        if (this.f81122c) {
            g28.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.f81128i = ku2.m30751boximpl(j);
        if (this.f81120a.getLookaheadRoot$ui_release() != null) {
            this.f81120a.markLookaheadMeasurePending$ui_release();
        }
        this.f81120a.markMeasurePending$ui_release();
        w64 w64Var = this.f81121b;
        lw8 lw8Var = this.f81120a;
        w64Var.add(lw8Var, lw8Var.getLookaheadRoot$ui_release() != null);
    }
}
