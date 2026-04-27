package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.FocusTargetNode;
import androidx.compose.p002ui.layout.InterfaceC0749b;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,357:1\n56#1:361\n56#1:363\n56#1:365\n56#1:367\n56#1:369\n56#1:371\n56#1:373\n56#1:375\n56#1:377\n56#1:379\n56#1:387\n56#1:389\n56#1:391\n56#1:393\n56#1:395\n56#1:397\n56#1:399\n56#1:401\n56#1:403\n56#1:405\n56#1:407\n56#1:409\n56#1:411\n56#1:413\n56#1:415\n56#1:417\n56#1:419\n59#1:450\n59#1:453\n59#1:455\n59#1:457\n59#1:459\n59#1:461\n59#1:463\n59#1:465\n59#1:467\n88#2:358\n74#2:359\n76#2:360\n78#2:362\n80#2:364\n82#2:366\n84#2:368\n98#2:370\n96#2:372\n90#2:374\n86#2:376\n88#2:378\n74#2:385\n76#2:386\n78#2:388\n80#2:390\n82#2:392\n84#2:394\n86#2:396\n88#2:398\n90#2:400\n92#2:402\n94#2:404\n96#2:406\n98#2:408\n100#2:410\n102#2:412\n105#2:414\n108#2:416\n110#2:418\n76#2:449\n76#2:451\n88#2:452\n90#2:454\n78#2:456\n80#2:458\n86#2:460\n94#2:462\n96#2:464\n98#2:466\n94#2:468\n743#3,5:380\n748#3,2:420\n42#4,7:422\n42#4,7:429\n42#4,7:436\n245#5,6:443\n245#5,3:502\n248#5,3:522\n245#5,6:539\n297#6:469\n137#6:470\n138#6:472\n139#6,7:476\n146#6,9:484\n432#6,6:493\n442#6,2:500\n444#6,17:505\n461#6,8:525\n155#6,6:533\n1#7:471\n1208#8:473\n1187#8,2:474\n48#9:483\n264#10:499\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n117#1:361\n120#1:363\n123#1:365\n126#1:367\n132#1:369\n136#1:371\n140#1:373\n143#1:375\n146#1:377\n152#1:379\n167#1:387\n170#1:389\n173#1:391\n176#1:393\n179#1:395\n182#1:397\n185#1:399\n188#1:401\n191#1:403\n194#1:405\n197#1:407\n200#1:409\n203#1:411\n206#1:413\n209#1:415\n212#1:417\n215#1:419\n264#1:450\n271#1:453\n278#1:455\n285#1:457\n288#1:459\n291#1:461\n294#1:463\n300#1:465\n309#1:467\n66#1:358\n115#1:359\n117#1:360\n120#1:362\n123#1:364\n126#1:366\n132#1:368\n136#1:370\n140#1:372\n143#1:374\n146#1:376\n152#1:378\n165#1:385\n167#1:386\n170#1:388\n173#1:390\n176#1:392\n179#1:394\n182#1:396\n185#1:398\n188#1:400\n191#1:402\n194#1:404\n197#1:406\n200#1:408\n203#1:410\n206#1:412\n209#1:414\n212#1:416\n215#1:418\n264#1:449\n267#1:451\n271#1:452\n278#1:454\n285#1:456\n288#1:458\n291#1:460\n294#1:462\n300#1:464\n309#1:466\n315#1:468\n164#1:380,5\n164#1:420,2\n229#1:422,7\n234#1:429,7\n239#1:436,7\n251#1:443,6\n315#1:502,3\n315#1:522,3\n349#1:539,6\n315#1:469\n315#1:470\n315#1:472\n315#1:476,7\n315#1:484,9\n315#1:493,6\n315#1:500,2\n315#1:505,17\n315#1:525,8\n315#1:533,6\n315#1:471\n315#1:473\n315#1:474,2\n315#1:483\n315#1:499\n*E\n"})
public final class leb {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final e6b<Object> f57381a = akb.mutableObjectIntMapOf();

    /* JADX INFO: renamed from: b */
    public static final int f57382b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f57383c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f57384d = 2;

    public static final void autoInvalidateInsertedNode(@yfb InterfaceC0701e.d dVar) {
        if (!dVar.isAttached()) {
            g28.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(dVar, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(@yfb InterfaceC0701e.d dVar, int i, int i2) {
        if (!(dVar instanceof d44)) {
            autoInvalidateNodeSelf(dVar, i & dVar.getKindSet$ui_release(), i2);
            return;
        }
        d44 d44Var = (d44) dVar;
        autoInvalidateNodeSelf(dVar, d44Var.getSelfKindSet$ui_release() & i, i2);
        int i3 = (~d44Var.getSelfKindSet$ui_release()) & i;
        for (InterfaceC0701e.d delegate$ui_release = d44Var.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            autoInvalidateNodeIncludingDelegates(delegate$ui_release, i3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(InterfaceC0701e.d dVar, int i, int i2) {
        if (i2 != 0 || dVar.getShouldAutoInvalidate()) {
            if ((keb.m30687constructorimpl(2) & i) != 0 && (dVar instanceof ew8)) {
                hw8.invalidateMeasurement((ew8) dVar);
                if (i2 == 2) {
                    w34.m32852requireCoordinator64DMado(dVar, keb.m30687constructorimpl(2)).onRelease();
                }
            }
            if ((keb.m30687constructorimpl(128) & i) != 0 && (dVar instanceof iv8) && i2 != 2) {
                w34.requireLayoutNode(dVar).invalidateMeasurements$ui_release();
            }
            if ((keb.m30687constructorimpl(256) & i) != 0 && (dVar instanceof o77) && i2 != 2) {
                w34.requireLayoutNode(dVar).invalidateOnPositioned$ui_release();
            }
            if ((keb.m30687constructorimpl(4) & i) != 0 && (dVar instanceof fp4)) {
                gp4.invalidateDraw((fp4) dVar);
            }
            if ((keb.m30687constructorimpl(8) & i) != 0 && (dVar instanceof rxe)) {
                sxe.invalidateSemantics((rxe) dVar);
            }
            if ((keb.m30687constructorimpl(64) & i) != 0 && (dVar instanceof bhc)) {
                chc.invalidateParentData((bhc) dVar);
            }
            if ((keb.m30687constructorimpl(1024) & i) != 0 && (dVar instanceof FocusTargetNode) && i2 != 2) {
                nn6.invalidateFocusTarget((FocusTargetNode) dVar);
            }
            if ((keb.m30687constructorimpl(2048) & i) != 0 && (dVar instanceof an6)) {
                an6 an6Var = (an6) dVar;
                if (specifiesCanFocusProperty(an6Var)) {
                    if (i2 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(an6Var);
                    } else {
                        bn6.invalidateFocusProperties(an6Var);
                    }
                }
            }
            if ((i & keb.m30687constructorimpl(4096)) == 0 || !(dVar instanceof nm6)) {
                return;
            }
            om6.invalidateFocusEvent((nm6) dVar);
        }
    }

    public static final void autoInvalidateRemovedNode(@yfb InterfaceC0701e.d dVar) {
        if (!dVar.isAttached()) {
            g28.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(dVar, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(@yfb InterfaceC0701e.d dVar) {
        if (!dVar.isAttached()) {
            g28.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(dVar, -1, 0);
    }

    public static final int calculateNodeKindSetFrom(@yfb InterfaceC0701e.d dVar) {
        if (dVar.getKindSet$ui_release() != 0) {
            return dVar.getKindSet$ui_release();
        }
        e6b<Object> e6bVar = f57381a;
        Object objClassKeyForObject = C7247ie.classKeyForObject(dVar);
        int iFindKeyIndex = e6bVar.findKeyIndex(objClassKeyForObject);
        if (iFindKeyIndex >= 0) {
            return e6bVar.f105300c[iFindKeyIndex];
        }
        int iM30687constructorimpl = keb.m30687constructorimpl(1);
        if (dVar instanceof ew8) {
            iM30687constructorimpl |= keb.m30687constructorimpl(2);
        }
        if (dVar instanceof fp4) {
            iM30687constructorimpl |= keb.m30687constructorimpl(4);
        }
        if (dVar instanceof rxe) {
            iM30687constructorimpl |= keb.m30687constructorimpl(8);
        }
        if (dVar instanceof p2d) {
            iM30687constructorimpl |= keb.m30687constructorimpl(16);
        }
        if (dVar instanceof mxa) {
            iM30687constructorimpl |= keb.m30687constructorimpl(32);
        }
        if (dVar instanceof bhc) {
            iM30687constructorimpl |= keb.m30687constructorimpl(64);
        }
        if (dVar instanceof iv8) {
            iM30687constructorimpl |= keb.m30687constructorimpl(128);
        }
        if (dVar instanceof o77) {
            iM30687constructorimpl |= keb.m30687constructorimpl(256);
        }
        if (dVar instanceof InterfaceC0749b) {
            iM30687constructorimpl |= keb.m30687constructorimpl(512);
        }
        if (dVar instanceof FocusTargetNode) {
            iM30687constructorimpl |= keb.m30687constructorimpl(1024);
        }
        if (dVar instanceof an6) {
            iM30687constructorimpl |= keb.m30687constructorimpl(2048);
        }
        if (dVar instanceof nm6) {
            iM30687constructorimpl |= keb.m30687constructorimpl(4096);
        }
        if (dVar instanceof xq8) {
            iM30687constructorimpl |= keb.m30687constructorimpl(8192);
        }
        if (dVar instanceof fbe) {
            iM30687constructorimpl |= keb.m30687constructorimpl(16384);
        }
        if (dVar instanceof mn2) {
            iM30687constructorimpl |= keb.m30687constructorimpl(32768);
        }
        if (dVar instanceof quf) {
            iM30687constructorimpl |= keb.m30687constructorimpl(131072);
        }
        int iM30687constructorimpl2 = dVar instanceof shh ? keb.m30687constructorimpl(262144) | iM30687constructorimpl : iM30687constructorimpl;
        e6bVar.set(objClassKeyForObject, iM30687constructorimpl2);
        return iM30687constructorimpl2;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(@yfb InterfaceC0701e.d dVar) {
        if (!(dVar instanceof d44)) {
            return calculateNodeKindSetFrom(dVar);
        }
        d44 d44Var = (d44) dVar;
        int selfKindSet$ui_release = d44Var.getSelfKindSet$ui_release();
        for (InterfaceC0701e.d delegate$ui_release = d44Var.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
        }
        return selfKindSet$ui_release;
    }

    /* JADX INFO: renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m30863contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m30864getIncludeSelfInTraversalH91voCI(int i) {
        return (i & keb.m30687constructorimpl(128)) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* JADX INFO: renamed from: or-64DMado, reason: not valid java name */
    public static final int m30865or64DMado(int i, int i2) {
        return i | i2;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(an6 an6Var) {
        int iM30687constructorimpl = keb.m30687constructorimpl(1024);
        if (!an6Var.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = an6Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            w34.addLayoutNodeChildren(f7bVar, an6Var.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVarPop = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVarPop.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
                w34.addLayoutNodeChildren(f7bVar, dVarPop);
            } else {
                while (true) {
                    if (dVarPop == null) {
                        break;
                    }
                    if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        f7b f7bVar2 = null;
                        while (dVarPop != null) {
                            if (dVarPop instanceof FocusTargetNode) {
                                nn6.invalidateFocusTarget((FocusTargetNode) dVarPop);
                            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                int i = 0;
                                for (InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dVarPop = delegate$ui_release;
                                        } else {
                                            if (f7bVar2 == null) {
                                                f7bVar2 = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (dVarPop != null) {
                                                f7bVar2.add(dVarPop);
                                                dVarPop = null;
                                            }
                                            f7bVar2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            dVarPop = w34.pop(f7bVar2);
                        }
                    } else {
                        dVarPop = dVarPop.getChild$ui_release();
                    }
                }
            }
        }
    }

    private static final boolean specifiesCanFocusProperty(an6 an6Var) {
        np1 np1Var = np1.f65148a;
        np1Var.reset();
        an6Var.applyFocusProperties(np1Var);
        return np1Var.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(@yfb InterfaceC0701e.c cVar) {
        int iM30687constructorimpl = keb.m30687constructorimpl(1);
        if (cVar instanceof cw8) {
            iM30687constructorimpl |= keb.m30687constructorimpl(2);
        }
        if (cVar instanceof ep4) {
            iM30687constructorimpl |= keb.m30687constructorimpl(4);
        }
        if (cVar instanceof pxe) {
            iM30687constructorimpl |= keb.m30687constructorimpl(8);
        }
        if (cVar instanceof o2d) {
            iM30687constructorimpl |= keb.m30687constructorimpl(16);
        }
        if ((cVar instanceof gxa) || (cVar instanceof oxa)) {
            iM30687constructorimpl |= keb.m30687constructorimpl(32);
        }
        if (cVar instanceof mm6) {
            iM30687constructorimpl |= keb.m30687constructorimpl(4096);
        }
        if (cVar instanceof wm6) {
            iM30687constructorimpl |= keb.m30687constructorimpl(2048);
        }
        if (cVar instanceof x2c) {
            iM30687constructorimpl |= keb.m30687constructorimpl(256);
        }
        if (cVar instanceof ahc) {
            iM30687constructorimpl |= keb.m30687constructorimpl(64);
        }
        return ((cVar instanceof e4c) || (cVar instanceof n4c)) ? iM30687constructorimpl | keb.m30687constructorimpl(128) : iM30687constructorimpl;
    }
}
