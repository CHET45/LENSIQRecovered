package p000;

import java.util.Collection;
import java.util.List;
import p000.ssd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n174#2,5:991\n180#2,3:997\n174#2,5:1000\n180#2,3:1006\n1#3:996\n1#3:1005\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n922#1:991,5\n922#1:997,3\n980#1:1000,5\n980#1:1006,3\n922#1:996\n980#1:1005\n*E\n"})
public final class g6c {

    /* JADX INFO: renamed from: g6c$a */
    public static final class C6151a implements vsd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sz2 f38897a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ i0b f38898b;

        public C6151a(sz2 sz2Var, i0b i0bVar) {
            this.f38897a = sz2Var;
            this.f38898b = i0bVar;
        }

        @Override // p000.vsd
        @yfb
        public ie8 invalidate(@yfb ssd ssdVar, @gib Object obj) {
            ie8 ie8VarInvalidate;
            sz2 sz2Var = this.f38897a;
            vsd vsdVar = sz2Var instanceof vsd ? (vsd) sz2Var : null;
            if (vsdVar == null || (ie8VarInvalidate = vsdVar.invalidate(ssdVar, obj)) == null) {
                ie8VarInvalidate = ie8.IGNORED;
            }
            if (ie8VarInvalidate != ie8.IGNORED) {
                return ie8VarInvalidate;
            }
            i0b i0bVar = this.f38898b;
            i0bVar.setInvalidations$runtime_release(v82.plus((Collection<? extends scc>) i0bVar.getInvalidations$runtime_release(), vkh.m24050to(ssdVar, obj)));
            return ie8.SCHEDULED;
        }

        @Override // p000.vsd
        public void recomposeScopeReleased(@yfb ssd ssdVar) {
        }

        @Override // p000.vsd
        public void recordReadOf(@yfb Object obj) {
        }
    }

    private static final int currentNodeIndex(prf prfVar) {
        int currentGroup = prfVar.getCurrentGroup();
        int parent = prfVar.getParent();
        while (parent >= 0 && !prfVar.isNode(parent)) {
            parent = prfVar.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iNodeCount = 0;
        while (iGroupSize < currentGroup) {
            if (prfVar.indexInGroup(currentGroup, iGroupSize)) {
                if (prfVar.isNode(iGroupSize)) {
                    iNodeCount = 0;
                }
                iGroupSize++;
            } else {
                iNodeCount += prfVar.isNode(iGroupSize) ? 1 : prfVar.nodeCount(iGroupSize);
                iGroupSize += prfVar.groupSize(iGroupSize);
            }
        }
        return iNodeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(prf prfVar, C5897fo c5897fo, p40<Object> p40Var) {
        int iAnchorIndex = prfVar.anchorIndex(c5897fo);
        gm2.runtimeCheck(prfVar.getCurrentGroup() < iAnchorIndex);
        positionToParentOf(prfVar, p40Var, iAnchorIndex);
        int iCurrentNodeIndex = currentNodeIndex(prfVar);
        while (prfVar.getCurrentGroup() < iAnchorIndex) {
            if (prfVar.indexInCurrentGroup(iAnchorIndex)) {
                if (prfVar.isNode()) {
                    p40Var.down(prfVar.node(prfVar.getCurrentGroup()));
                    iCurrentNodeIndex = 0;
                }
                prfVar.startGroup();
            } else {
                iCurrentNodeIndex += prfVar.skipGroup();
            }
        }
        gm2.runtimeCheck(prfVar.getCurrentGroup() == iAnchorIndex);
        return iCurrentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(prf prfVar, p40<Object> p40Var, int i) {
        while (!prfVar.indexInParent(i)) {
            prfVar.skipToGroupEnd();
            if (prfVar.isNode(prfVar.getParent())) {
                p40Var.mo14389up();
            }
            prfVar.endGroup();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseMovableGroupAtCurrent(sz2 sz2Var, dn2 dn2Var, i0b i0bVar, prf prfVar) {
        mrf mrfVar = new mrf();
        if (prfVar.getCollectingSourceInformation()) {
            mrfVar.collectSourceInformation();
        }
        if (prfVar.getCollectingCalledInformation()) {
            mrfVar.collectCalledByInformation();
        }
        prf prfVarOpenWriter = mrfVar.openWriter();
        try {
            prfVarOpenWriter.beginInsert();
            prfVarOpenWriter.startGroup(g0b.f38116a, i0bVar.getContent$runtime_release());
            prf.markGroup$default(prfVarOpenWriter, 0, 1, null);
            prfVarOpenWriter.update(i0bVar.getParameter$runtime_release());
            List<C5897fo> listMoveTo = prfVar.moveTo(i0bVar.getAnchor$runtime_release(), 1, prfVarOpenWriter);
            prfVarOpenWriter.skipGroup();
            prfVarOpenWriter.endGroup();
            prfVarOpenWriter.endInsert();
            prfVarOpenWriter.close(true);
            h0b h0bVar = new h0b(mrfVar);
            ssd.C12768a c12768a = ssd.f82774i;
            if (c12768a.hasAnchoredRecomposeScopes$runtime_release(mrfVar, listMoveTo)) {
                C6151a c6151a = new C6151a(sz2Var, i0bVar);
                prfVarOpenWriter = mrfVar.openWriter();
                try {
                    c12768a.adoptAnchoredScopes$runtime_release(prfVarOpenWriter, listMoveTo, c6151a);
                    bth bthVar = bth.f14751a;
                    prfVarOpenWriter.close(true);
                } finally {
                }
            }
            dn2Var.movableContentStateReleased$runtime_release(i0bVar, h0bVar);
        } finally {
        }
    }
}
