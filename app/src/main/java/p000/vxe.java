package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,486:1\n80#2:487\n80#2:564\n766#3:488\n697#3,8:489\n720#3,3:497\n705#3,2:500\n698#3:502\n767#3:508\n699#3,11:547\n723#3,3:558\n710#3:561\n700#3:562\n769#3:563\n690#3,15:565\n720#3,3:580\n705#3,2:583\n698#3:585\n691#3,2:591\n699#3,11:631\n723#3,3:642\n710#3:645\n700#3:646\n693#3:647\n432#4,5:503\n437#4:509\n442#4,2:511\n444#4,8:516\n452#4,9:527\n461#4,8:539\n432#4,5:586\n437#4:593\n442#4,2:595\n444#4,8:600\n452#4,9:611\n461#4,8:623\n264#5:510\n264#5:594\n245#6,3:513\n248#6,3:536\n245#6,3:597\n248#6,3:620\n1208#7:524\n1187#7,2:525\n1208#7:608\n1187#7,2:609\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n46#1:487\n461#1:564\n46#1:488\n46#1:489,8\n46#1:497,3\n46#1:500,2\n46#1:502\n46#1:508\n46#1:547,11\n46#1:558,3\n46#1:561\n46#1:562\n46#1:563\n461#1:565,15\n461#1:580,3\n461#1:583,2\n461#1:585\n461#1:591,2\n461#1:631,11\n461#1:642,3\n461#1:645\n461#1:646\n461#1:647\n46#1:503,5\n46#1:509\n46#1:511,2\n46#1:516,8\n46#1:527,9\n46#1:539,8\n461#1:586,5\n461#1:593\n461#1:595,2\n461#1:600,8\n461#1:611,9\n461#1:623,8\n46#1:510\n461#1:594\n46#1:513,3\n46#1:536,3\n461#1:597,3\n461#1:620,3\n46#1:524\n46#1:525,2\n461#1:608\n461#1:609,2\n*E\n"})
public final class vxe {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[EDGE_INSN: B:41:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.txe SemanticsNode(@p000.yfb p000.lw8 r10, boolean r11) {
        /*
            feb r0 = r10.getNodes$ui_release()
            r1 = 8
            int r1 = p000.keb.m30687constructorimpl(r1)
            int r2 = p000.feb.access$getAggregateChildKindSet(r0)
            r2 = r2 & r1
            r3 = 0
            if (r2 == 0) goto L7a
            androidx.compose.ui.e$d r0 = r0.getHead$ui_release()
        L16:
            if (r0 == 0) goto L7a
            int r2 = r0.getKindSet$ui_release()
            r2 = r2 & r1
            if (r2 == 0) goto L6e
            r2 = r0
            r4 = r3
        L21:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof p000.rxe
            if (r5 == 0) goto L29
            r3 = r2
            goto L7a
        L29:
            int r5 = r2.getKindSet$ui_release()
            r5 = r5 & r1
            if (r5 == 0) goto L69
            boolean r5 = r2 instanceof p000.d44
            if (r5 == 0) goto L69
            r5 = r2
            d44 r5 = (p000.d44) r5
            androidx.compose.ui.e$d r5 = r5.getDelegate$ui_release()
            r6 = 0
            r7 = r6
        L3d:
            r8 = 1
            if (r5 == 0) goto L66
            int r9 = r5.getKindSet$ui_release()
            r9 = r9 & r1
            if (r9 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r8) goto L4d
            r2 = r5
            goto L61
        L4d:
            if (r4 != 0) goto L58
            f7b r4 = new f7b
            r8 = 16
            androidx.compose.ui.e$d[] r8 = new androidx.compose.p002ui.InterfaceC0701e.d[r8]
            r4.<init>(r8, r6)
        L58:
            if (r2 == 0) goto L5e
            r4.add(r2)
            r2 = r3
        L5e:
            r4.add(r5)
        L61:
            androidx.compose.ui.e$d r5 = r5.getChild$ui_release()
            goto L3d
        L66:
            if (r7 != r8) goto L69
            goto L21
        L69:
            androidx.compose.ui.e$d r2 = p000.w34.access$pop(r4)
            goto L21
        L6e:
            int r2 = r0.getAggregateChildKindSet$ui_release()
            r2 = r2 & r1
            if (r2 == 0) goto L7a
            androidx.compose.ui.e$d r0 = r0.getChild$ui_release()
            goto L16
        L7a:
            p000.md8.checkNotNull(r3)
            rxe r3 = (p000.rxe) r3
            androidx.compose.ui.e$d r0 = r3.getNode()
            nxe r1 = r10.getCollapsedSemantics$ui_release()
            p000.md8.checkNotNull(r1)
            txe r2 = new txe
            r2.<init>(r0, r11, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vxe.SemanticsNode(lw8, boolean):txe");
    }

    public static /* synthetic */ txe SemanticsNode$default(rxe rxeVar, boolean z, lw8 lw8Var, int i, Object obj) {
        if ((i & 4) != 0) {
            lw8Var = w34.requireLayoutNode(rxeVar);
        }
        return SemanticsNode(rxeVar, z, lw8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(txe txeVar) {
        return txeVar.getId() + 2000000000;
    }

    @gib
    public static final lw8 findClosestParentNode(@yfb lw8 lw8Var, @yfb qy6<? super lw8, Boolean> qy6Var) {
        for (lw8 parent$ui_release = lw8Var.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (qy6Var.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.rxe getOuterMergingSemantics(@p000.yfb p000.lw8 r9) {
        /*
            feb r9 = r9.getNodes$ui_release()
            r0 = 8
            int r0 = p000.keb.m30687constructorimpl(r0)
            int r1 = p000.feb.access$getAggregateChildKindSet(r9)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L83
            androidx.compose.ui.e$d r9 = r9.getHead$ui_release()
        L16:
            if (r9 == 0) goto L83
            int r1 = r9.getKindSet$ui_release()
            r1 = r1 & r0
            if (r1 == 0) goto L77
            r1 = r9
            r3 = r2
        L21:
            if (r1 == 0) goto L77
            boolean r4 = r1 instanceof p000.rxe
            if (r4 == 0) goto L32
            r4 = r1
            rxe r4 = (p000.rxe) r4
            boolean r4 = r4.getShouldMergeDescendantSemantics()
            if (r4 == 0) goto L72
            r2 = r1
            goto L83
        L32:
            int r4 = r1.getKindSet$ui_release()
            r4 = r4 & r0
            if (r4 == 0) goto L72
            boolean r4 = r1 instanceof p000.d44
            if (r4 == 0) goto L72
            r4 = r1
            d44 r4 = (p000.d44) r4
            androidx.compose.ui.e$d r4 = r4.getDelegate$ui_release()
            r5 = 0
            r6 = r5
        L46:
            r7 = 1
            if (r4 == 0) goto L6f
            int r8 = r4.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto L6a
            int r6 = r6 + 1
            if (r6 != r7) goto L56
            r1 = r4
            goto L6a
        L56:
            if (r3 != 0) goto L61
            f7b r3 = new f7b
            r7 = 16
            androidx.compose.ui.e$d[] r7 = new androidx.compose.p002ui.InterfaceC0701e.d[r7]
            r3.<init>(r7, r5)
        L61:
            if (r1 == 0) goto L67
            r3.add(r1)
            r1 = r2
        L67:
            r3.add(r4)
        L6a:
            androidx.compose.ui.e$d r4 = r4.getChild$ui_release()
            goto L46
        L6f:
            if (r6 != r7) goto L72
            goto L21
        L72:
            androidx.compose.ui.e$d r1 = p000.w34.access$pop(r3)
            goto L21
        L77:
            int r1 = r9.getAggregateChildKindSet$ui_release()
            r1 = r1 & r0
            if (r1 == 0) goto L83
            androidx.compose.ui.e$d r9 = r9.getChild$ui_release()
            goto L16
        L83:
            rxe r2 = (p000.rxe) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vxe.getOuterMergingSemantics(lw8):rxe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jae getRole(txe txeVar) {
        return (jae) oxe.getOrNull(txeVar.getUnmergedConfig$ui_release(), zxe.f106362a.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(txe txeVar) {
        return txeVar.getId() + 1000000000;
    }

    @yfb
    public static final txe SemanticsNode(@yfb rxe rxeVar, boolean z, @yfb lw8 lw8Var) {
        InterfaceC0701e.d node = rxeVar.getNode();
        nxe collapsedSemantics$ui_release = lw8Var.getCollapsedSemantics$ui_release();
        if (collapsedSemantics$ui_release == null) {
            collapsedSemantics$ui_release = new nxe();
        }
        return new txe(node, z, lw8Var, collapsedSemantics$ui_release);
    }
}
