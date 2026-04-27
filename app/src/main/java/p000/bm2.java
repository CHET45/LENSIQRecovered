package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n4551#2,7:485\n4551#2,7:492\n4551#2,7:499\n4551#2,7:506\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n167#1:485,7\n248#1:492,7\n318#1:499,7\n466#1:506,7\n*E\n"})
@e0g(parameters = 0)
public final class bm2 {

    /* JADX INFO: renamed from: m */
    @yfb
    public static final C1941a f14105m = new C1941a(null);

    /* JADX INFO: renamed from: n */
    public static final int f14106n = 8;

    /* JADX INFO: renamed from: o */
    public static final int f14107o = -2;

    /* JADX INFO: renamed from: a */
    @yfb
    public final em2 f14108a;

    /* JADX INFO: renamed from: b */
    @yfb
    public wt1 f14109b;

    /* JADX INFO: renamed from: c */
    public boolean f14110c;

    /* JADX INFO: renamed from: f */
    public int f14113f;

    /* JADX INFO: renamed from: g */
    public int f14114g;

    /* JADX INFO: renamed from: l */
    public int f14119l;

    /* JADX INFO: renamed from: d */
    @yfb
    public final v78 f14111d = new v78();

    /* JADX INFO: renamed from: e */
    public boolean f14112e = true;

    /* JADX INFO: renamed from: h */
    @yfb
    public i0g<Object> f14115h = new i0g<>();

    /* JADX INFO: renamed from: i */
    public int f14116i = -1;

    /* JADX INFO: renamed from: j */
    public int f14117j = -1;

    /* JADX INFO: renamed from: k */
    public int f14118k = -1;

    /* JADX INFO: renamed from: bm2$a */
    public static final class C1941a {
        public /* synthetic */ C1941a(jt3 jt3Var) {
            this();
        }

        private C1941a() {
        }
    }

    public bm2(@yfb em2 em2Var, @yfb wt1 wt1Var) {
        this.f14108a = em2Var;
        this.f14109b = wt1Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3245a(bm2 bm2Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bm2Var.pushSlotTableOperationPreamble(z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3246b(bm2 bm2Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bm2Var.realizeOperationLocation(z);
    }

    private final void ensureGroupStarted(C5897fo c5897fo) {
        m3245a(this, false, 1, null);
        this.f14109b.pushEnsureGroupStarted(c5897fo);
        this.f14110c = true;
    }

    private final void ensureRootStarted() {
        if (this.f14110c || !this.f14112e) {
            return;
        }
        m3245a(this, false, 1, null);
        this.f14109b.pushEnsureRootStarted();
        this.f14110c = true;
    }

    private final lrf getReader() {
        return this.f14108a.getReader$runtime_release();
    }

    public static /* synthetic */ void includeOperationsIn$default(bm2 bm2Var, wt1 wt1Var, n78 n78Var, int i, Object obj) {
        if ((i & 2) != 0) {
            n78Var = null;
        }
        bm2Var.includeOperationsIn(wt1Var, n78Var);
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i = this.f14114g;
        if (i > 0) {
            this.f14109b.pushUps(i);
            this.f14114g = 0;
        }
        if (this.f14115h.isNotEmpty()) {
            this.f14109b.pushDowns(this.f14115h.toArray());
            this.f14115h.clear();
        }
    }

    private final void pushSlotEditingOperationPreamble() {
        m3246b(this, false, 1, null);
        recordSlotEditing();
    }

    private final void pushSlotTableOperationPreamble(boolean z) {
        realizeOperationLocation(z);
    }

    private final void realizeMoveNode(int i, int i2, int i3) {
        pushApplierOperationPreamble();
        this.f14109b.pushMoveNode(i, i2, i3);
    }

    private final void realizeNodeMovementOperations() {
        int i = this.f14119l;
        if (i > 0) {
            int i2 = this.f14116i;
            if (i2 >= 0) {
                realizeRemoveNode(i2, i);
                this.f14116i = -1;
            } else {
                realizeMoveNode(this.f14118k, this.f14117j, i);
                this.f14117j = -1;
                this.f14118k = -1;
            }
            this.f14119l = 0;
        }
    }

    private final void realizeOperationLocation(boolean z) {
        int parent = z ? getReader().getParent() : getReader().getCurrentGroup();
        int i = parent - this.f14113f;
        if (!(i >= 0)) {
            gm2.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i > 0) {
            this.f14109b.pushAdvanceSlotsBy(i);
            this.f14113f = parent;
        }
    }

    private final void realizeRemoveNode(int i, int i2) {
        pushApplierOperationPreamble();
        this.f14109b.pushRemoveNode(i, i2);
    }

    public final void appendValue(@yfb C5897fo c5897fo, @gib Object obj) {
        this.f14109b.pushAppendValue(c5897fo, obj);
    }

    public final void copyNodesToNewAnchorLocation(@yfb List<? extends Object> list, @yfb n78 n78Var) {
        this.f14109b.pushCopyNodesToNewAnchorLocation(list, n78Var);
    }

    public final void copySlotTableToAnchorLocation(@gib h0b h0bVar, @yfb dn2 dn2Var, @yfb i0b i0bVar, @yfb i0b i0bVar2) {
        this.f14109b.pushCopySlotTableToAnchorLocation(h0bVar, dn2Var, i0bVar, i0bVar2);
    }

    public final void deactivateCurrentGroup() {
        m3245a(this, false, 1, null);
        this.f14109b.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(@yfb n78 n78Var, @yfb C5897fo c5897fo) {
        pushPendingUpsAndDowns();
        this.f14109b.pushDetermineMovableContentNodeIndex(n78Var, c5897fo);
    }

    public final void endCompositionScope(@yfb qy6<? super cn2, bth> qy6Var, @yfb cn2 cn2Var) {
        this.f14109b.pushEndCompositionScope(qy6Var, cn2Var);
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (!(this.f14111d.peekOr(-1) <= parent)) {
            gm2.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.f14111d.peekOr(-1) == parent) {
            m3245a(this, false, 1, null);
            this.f14111d.pop();
            this.f14109b.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        this.f14109b.pushEndMovableContentPlacement();
        this.f14113f = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i, int i2) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int iNodeCount = getReader().isNode(i2) ? 1 : getReader().nodeCount(i2);
        if (iNodeCount > 0) {
            removeNode(i, iNodeCount);
        }
    }

    public final void endRoot() {
        if (this.f14110c) {
            m3245a(this, false, 1, null);
            m3245a(this, false, 1, null);
            this.f14109b.pushEndCurrentGroup();
            this.f14110c = false;
        }
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.f14111d.isEmpty()) {
            return;
        }
        gm2.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    @yfb
    public final wt1 getChangeList() {
        return this.f14109b;
    }

    public final boolean getImplicitRootStart() {
        return this.f14112e;
    }

    public final boolean getPastParent() {
        return getReader().getParent() - this.f14113f < 0;
    }

    public final void includeOperationsIn(@yfb wt1 wt1Var, @gib n78 n78Var) {
        this.f14109b.pushExecuteOperationsIn(wt1Var, n78Var);
    }

    public final void insertSlots(@yfb C5897fo c5897fo, @yfb mrf mrfVar) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.f14109b.pushInsertSlots(c5897fo, mrfVar);
    }

    public final void moveCurrentGroup(int i) {
        pushSlotEditingOperationPreamble();
        this.f14109b.pushMoveCurrentGroup(i);
    }

    public final void moveDown(@gib Object obj) {
        realizeNodeMovementOperations();
        this.f14115h.push(obj);
    }

    public final void moveNode(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.f14119l;
            if (i4 > 0 && this.f14117j == i - i4 && this.f14118k == i2 - i4) {
                this.f14119l = i4 + i3;
                return;
            }
            realizeNodeMovementOperations();
            this.f14117j = i;
            this.f14118k = i2;
            this.f14119l = i3;
        }
    }

    public final void moveReaderRelativeTo(int i) {
        this.f14113f += i - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int i) {
        this.f14113f = i;
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (this.f14115h.isNotEmpty()) {
            this.f14115h.pop();
        } else {
            this.f14114g++;
        }
    }

    public final void recordSlotEditing() {
        lrf reader;
        int parent;
        if (getReader().getSize() <= 0 || this.f14111d.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            C5897fo c5897foAnchor = reader.anchor(parent);
            this.f14111d.push(parent);
            ensureGroupStarted(c5897foAnchor);
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.f14110c) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(@yfb sz2 sz2Var, @yfb dn2 dn2Var, @yfb i0b i0bVar) {
        this.f14109b.pushReleaseMovableGroupAtCurrent(sz2Var, dn2Var, i0bVar);
    }

    public final void remember(@yfb eyd eydVar) {
        this.f14109b.pushRemember(eydVar);
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.f14109b.pushRemoveCurrentGroup();
        this.f14113f += getReader().getGroupSize();
    }

    public final void removeNode(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                gm2.composeImmediateRuntimeError("Invalid remove index " + i);
            }
            if (this.f14116i == i) {
                this.f14119l += i2;
                return;
            }
            realizeNodeMovementOperations();
            this.f14116i = i;
            this.f14119l = i2;
        }
    }

    public final void resetSlots() {
        this.f14109b.pushResetSlots();
    }

    public final void resetTransientState() {
        this.f14110c = false;
        this.f14111d.clear();
        this.f14113f = 0;
    }

    public final void setChangeList(@yfb wt1 wt1Var) {
        this.f14109b = wt1Var;
    }

    public final void setImplicitRootStart(boolean z) {
        this.f14112e = z;
    }

    public final void sideEffect(@yfb ny6<bth> ny6Var) {
        this.f14109b.pushSideEffect(ny6Var);
    }

    public final void skipToEndOfCurrentGroup() {
        this.f14109b.pushSkipToEndOfCurrentGroup();
    }

    public final void trimValues(int i) {
        if (i > 0) {
            pushSlotEditingOperationPreamble();
            this.f14109b.pushTrimValues(i);
        }
    }

    public final void updateAnchoredValue(@gib Object obj, @yfb C5897fo c5897fo, int i) {
        this.f14109b.pushUpdateAnchoredValue(obj, c5897fo, i);
    }

    public final void updateAuxData(@gib Object obj) {
        m3245a(this, false, 1, null);
        this.f14109b.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v, @yfb gz6<? super T, ? super V, bth> gz6Var) {
        pushApplierOperationPreamble();
        this.f14109b.pushUpdateNode(v, gz6Var);
    }

    public final void updateValue(@gib Object obj, int i) {
        pushSlotTableOperationPreamble(true);
        this.f14109b.pushUpdateValue(obj, i);
    }

    public final void useNode(@gib Object obj) {
        pushApplierOperationPreamble();
        this.f14109b.pushUseNode(obj);
    }

    public final void withChangeList(@yfb wt1 wt1Var, @yfb ny6<bth> ny6Var) {
        wt1 changeList = getChangeList();
        try {
            setChangeList(wt1Var);
            ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            setChangeList(changeList);
            o28.finallyEnd(1);
        }
    }

    public final void withoutImplicitRootStart(@yfb ny6<bth> ny6Var) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            setImplicitRootStart(implicitRootStart);
            o28.finallyEnd(1);
        }
    }

    public final void insertSlots(@yfb C5897fo c5897fo, @yfb mrf mrfVar, @yfb l26 l26Var) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.f14109b.pushInsertSlots(c5897fo, mrfVar, l26Var);
    }
}
