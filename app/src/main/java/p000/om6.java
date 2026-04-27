package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,71:1\n94#2:72\n98#2:182\n94#2:183\n303#3:73\n432#3,6:74\n442#3,2:81\n444#3,8:86\n452#3,9:97\n461#3,8:109\n304#3:117\n137#3:118\n138#3,8:120\n146#3,9:129\n432#3,37:138\n155#3,6:175\n305#3:181\n262#3,2:184\n62#3:186\n63#3,8:188\n264#3:196\n265#3,2:198\n432#3,12:200\n444#3,8:215\n452#3,9:226\n461#3,8:238\n268#3:246\n72#3,7:247\n269#3:254\n264#4:80\n264#4:197\n245#5,3:83\n248#5,3:106\n245#5,3:212\n248#5,3:235\n1208#6:94\n1187#6,2:95\n1208#6:223\n1187#6,2:224\n1#7:119\n1#7:187\n48#8:128\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n47#1:72\n66#1:182\n66#1:183\n47#1:73\n47#1:74,6\n47#1:81,2\n47#1:86,8\n47#1:97,9\n47#1:109,8\n47#1:117\n47#1:118\n47#1:120,8\n47#1:129,9\n47#1:138,37\n47#1:175,6\n47#1:181\n66#1:184,2\n66#1:186\n66#1:188,8\n66#1:196\n66#1:198,2\n66#1:200,12\n66#1:215,8\n66#1:226,9\n66#1:238,8\n66#1:246\n66#1:247,7\n66#1:254\n47#1:80\n66#1:197\n47#1:83,3\n47#1:106,3\n66#1:212,3\n66#1:235,3\n47#1:94\n47#1:95,2\n66#1:223\n66#1:224,2\n47#1:119\n66#1:187\n47#1:128\n*E\n"})
public final class om6 {

    /* JADX INFO: renamed from: om6$a */
    public /* synthetic */ class C10466a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68122a;

        static {
            int[] iArr = new int[jn6.values().length];
            try {
                iArr[jn6.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jn6.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jn6.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jn6.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f68122a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0095, code lost:
    
        continue;
     */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.in6 getFocusState(@p000.yfb p000.nm6 r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.om6.getFocusState(nm6):in6");
    }

    public static final void invalidateFocusEvent(@yfb nm6 nm6Var) {
        w34.requireOwner(nm6Var).getFocusOwner().scheduleInvalidation(nm6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    public static final void refreshFocusEventNodes(@yfb FocusTargetNode focusTargetNode) {
        feb nodes$ui_release;
        int iM30687constructorimpl = keb.m30687constructorimpl(4096);
        int iM30687constructorimpl2 = keb.m30687constructorimpl(1024);
        InterfaceC0701e.d node = focusTargetNode.getNode();
        int i = iM30687constructorimpl | iM30687constructorimpl2;
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d node2 = focusTargetNode.getNode();
        lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(focusTargetNode);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & iM30687constructorimpl2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                            InterfaceC0701e.d dVarPop = node2;
                            f7b f7bVar = null;
                            while (dVarPop != 0) {
                                if (dVarPop instanceof nm6) {
                                    nm6 nm6Var = (nm6) dVarPop;
                                    nm6Var.onFocusEvent(getFocusState(nm6Var));
                                } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                    InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                    int i2 = 0;
                                    dVarPop = dVarPop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                dVarPop = delegate$ui_release;
                                            } else {
                                                if (f7bVar == null) {
                                                    f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                                }
                                                if (dVarPop != 0) {
                                                    f7bVar.add(dVarPop);
                                                    dVarPop = 0;
                                                }
                                                f7bVar.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        dVarPop = dVarPop;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                dVarPop = w34.pop(f7bVar);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            node2 = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }
}
