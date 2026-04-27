package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,474:1\n204#1:515\n205#1,10:523\n204#1:547\n205#1,6:555\n432#1,6:561\n442#1,2:568\n444#1,8:573\n452#1,9:584\n461#1,8:596\n212#1,3:604\n193#1,12:607\n205#1,6:626\n432#1,6:632\n442#1,2:639\n444#1,8:644\n452#1,9:655\n461#1,8:667\n212#1,3:675\n197#1:678\n220#1:679\n221#1,4:687\n432#1,6:691\n442#1,2:698\n444#1,8:703\n452#1,9:714\n461#1,8:726\n226#1,3:734\n62#1:737\n63#1,8:739\n432#1,6:747\n442#1,2:754\n444#1,8:759\n452#1,9:770\n461#1,8:782\n72#1,7:790\n62#1,9:797\n432#1,12:806\n444#1,8:821\n452#1,9:832\n461#1,8:844\n72#1,7:852\n62#1:859\n63#1,8:861\n432#1,6:871\n442#1,2:878\n444#1,8:883\n452#1,9:894\n461#1,8:906\n72#1,7:914\n251#1,5:921\n62#1:926\n63#1,8:928\n432#1,6:936\n442#1,2:943\n444#1,8:948\n452#1,9:959\n461#1,8:971\n72#1,7:979\n251#1,5:986\n62#1:991\n63#1,8:993\n432#1,6:1001\n442#1,2:1008\n444#1,8:1013\n452#1,9:1024\n461#1,8:1036\n72#1,7:1044\n104#1:1051\n105#1,15:1059\n432#1,6:1074\n442#1,2:1081\n444#1,8:1086\n452#1,9:1097\n461#1,8:1109\n121#1,8:1117\n137#1:1125\n138#1:1127\n139#1,7:1131\n146#1,9:1139\n432#1,6:1148\n442#1,2:1155\n444#1,17:1160\n461#1,8:1180\n155#1,6:1188\n432#1,6:1194\n442#1,2:1201\n444#1,8:1206\n452#1,9:1217\n461#1,8:1229\n137#1:1237\n138#1:1239\n139#1,7:1243\n146#1,9:1251\n432#1,6:1260\n442#1,2:1267\n444#1,8:1272\n452#1,9:1283\n461#1,8:1295\n155#1,6:1303\n167#1:1309\n168#1:1317\n169#1,12:1321\n432#1,6:1333\n442#1,2:1340\n444#1,8:1345\n452#1,9:1356\n461#1,8:1368\n181#1,8:1376\n1#2:475\n1#2:738\n1#2:860\n1#2:927\n1#2:992\n1#2:1126\n1#2:1238\n42#3,7:476\n42#3,7:483\n42#3,7:505\n42#3,7:516\n42#3,7:533\n42#3,7:540\n42#3,7:548\n42#3,7:619\n42#3,7:680\n42#3,7:1052\n42#3,7:1310\n66#3,9:1384\n66#3,9:1393\n42#3,7:1402\n42#3,7:1410\n492#4,11:490\n48#4:504\n48#4:1138\n48#4:1250\n1208#5:501\n1187#5,2:502\n1208#5:512\n1187#5,2:513\n1208#5:581\n1187#5,2:582\n1208#5:652\n1187#5,2:653\n1208#5:711\n1187#5,2:712\n1208#5:767\n1187#5,2:768\n1208#5:829\n1187#5,2:830\n1208#5:891\n1187#5,2:892\n1208#5:956\n1187#5,2:957\n1208#5:1021\n1187#5,2:1022\n1208#5:1094\n1187#5,2:1095\n1208#5:1128\n1187#5,2:1129\n1208#5:1214\n1187#5,2:1215\n1208#5:1240\n1187#5,2:1241\n1208#5:1280\n1187#5,2:1281\n1208#5:1318\n1187#5,2:1319\n1208#5:1353\n1187#5,2:1354\n1208#5:1426\n1187#5,2:1427\n264#6:567\n264#6:638\n264#6:697\n264#6:753\n264#6:869\n264#6:870\n264#6:877\n264#6:942\n264#6:1007\n264#6:1080\n264#6:1154\n264#6:1200\n264#6:1266\n264#6:1339\n264#6:1418\n264#6:1420\n264#6:1421\n264#6:1425\n245#7,3:570\n248#7,3:593\n245#7,3:641\n248#7,3:664\n245#7,3:700\n248#7,3:723\n245#7,3:756\n248#7,3:779\n245#7,3:818\n248#7,3:841\n245#7,3:880\n248#7,3:903\n245#7,3:945\n248#7,3:968\n245#7,3:1010\n248#7,3:1033\n245#7,3:1083\n248#7,3:1106\n245#7,3:1157\n248#7,3:1177\n245#7,3:1203\n248#7,3:1226\n245#7,3:1269\n248#7,3:1292\n245#7,3:1342\n248#7,3:1365\n245#7,3:1422\n248#7,3:1429\n76#8:1409\n76#8:1417\n76#8:1419\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n193#1:515\n193#1:523,10\n233#1:547\n233#1:555,6\n234#1:561,6\n234#1:568,2\n234#1:573,8\n234#1:584,9\n234#1:596,8\n233#1:604,3\n240#1:607,12\n240#1:626,6\n241#1:632,6\n241#1:639,2\n241#1:644,8\n241#1:655,9\n241#1:667,8\n240#1:675,3\n240#1:678\n247#1:679\n247#1:687,4\n248#1:691,6\n248#1:698,2\n248#1:703,8\n248#1:714,9\n248#1:726,8\n247#1:734,3\n255#1:737\n255#1:739,8\n255#1:747,6\n255#1:754,2\n255#1:759,8\n255#1:770,9\n255#1:782,8\n255#1:790,7\n255#1:797,9\n255#1:806,12\n255#1:821,8\n255#1:832,9\n255#1:844,8\n255#1:852,7\n263#1:859\n263#1:861,8\n266#1:871,6\n266#1:878,2\n266#1:883,8\n266#1:894,9\n266#1:906,8\n263#1:914,7\n275#1:921,5\n275#1:926\n275#1:928,8\n275#1:936,6\n275#1:943,2\n275#1:948,8\n275#1:959,9\n275#1:971,8\n275#1:979,7\n283#1:986,5\n283#1:991\n283#1:993,8\n283#1:1001,6\n283#1:1008,2\n283#1:1013,8\n283#1:1024,9\n283#1:1036,8\n283#1:1044,7\n292#1:1051\n292#1:1059,15\n292#1:1074,6\n292#1:1081,2\n292#1:1086,8\n292#1:1097,9\n292#1:1109,8\n292#1:1117,8\n297#1:1125\n297#1:1127\n297#1:1131,7\n297#1:1139,9\n297#1:1148,6\n297#1:1155,2\n297#1:1160,17\n297#1:1180,8\n297#1:1188,6\n303#1:1194,6\n303#1:1201,2\n303#1:1206,8\n303#1:1217,9\n303#1:1229,8\n304#1:1237\n304#1:1239\n304#1:1243,7\n304#1:1251,9\n304#1:1260,6\n304#1:1267,2\n304#1:1272,8\n304#1:1283,9\n304#1:1295,8\n304#1:1303,6\n310#1:1309\n310#1:1317\n310#1:1321,12\n311#1:1333,6\n311#1:1340,2\n311#1:1345,8\n311#1:1356,9\n311#1:1368,8\n310#1:1376,8\n255#1:738\n263#1:860\n275#1:927\n283#1:992\n297#1:1126\n304#1:1238\n82#1:476,7\n104#1:483,7\n167#1:505,7\n193#1:516,7\n204#1:533,7\n220#1:540,7\n233#1:548,7\n240#1:619,7\n247#1:680,7\n292#1:1052,7\n310#1:1310,7\n331#1:1384,9\n336#1:1393,9\n367#1:1402,7\n371#1:1410,7\n131#1:490,11\n145#1:504\n297#1:1138\n304#1:1250\n138#1:501\n138#1:502,2\n168#1:512\n168#1:513,2\n234#1:581\n234#1:582,2\n241#1:652\n241#1:653,2\n248#1:711\n248#1:712,2\n255#1:767\n255#1:768,2\n255#1:829\n255#1:830,2\n266#1:891\n266#1:892,2\n275#1:956\n275#1:957,2\n283#1:1021\n283#1:1022,2\n292#1:1094\n292#1:1095,2\n297#1:1128\n297#1:1129,2\n303#1:1214\n303#1:1215,2\n304#1:1240\n304#1:1241,2\n304#1:1280\n304#1:1281,2\n310#1:1318\n310#1:1319,2\n311#1:1353\n311#1:1354,2\n451#1:1426\n451#1:1427,2\n234#1:567\n241#1:638\n248#1:697\n255#1:753\n264#1:869\n265#1:870\n266#1:877\n275#1:942\n283#1:1007\n292#1:1080\n297#1:1154\n303#1:1200\n304#1:1266\n311#1:1339\n394#1:1418\n400#1:1420\n437#1:1421\n444#1:1425\n234#1:570,3\n234#1:593,3\n241#1:641,3\n241#1:664,3\n248#1:700,3\n248#1:723,3\n255#1:756,3\n255#1:779,3\n255#1:818,3\n255#1:841,3\n266#1:880,3\n266#1:903,3\n275#1:945,3\n275#1:968,3\n283#1:1010,3\n283#1:1033,3\n292#1:1083,3\n292#1:1106,3\n297#1:1157,3\n297#1:1177,3\n303#1:1203,3\n303#1:1226,3\n304#1:1269,3\n304#1:1292,3\n311#1:1342,3\n311#1:1365,3\n443#1:1422,3\n443#1:1429,3\n370#1:1409\n394#1:1417\n400#1:1419\n*E\n"})
public final class w34 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(f7b<InterfaceC0701e.d> f7bVar, InterfaceC0701e.d dVar) {
        f7b<lw8> f7bVar2 = requireLayoutNode(dVar).get_children$ui_release();
        int size = f7bVar2.getSize();
        if (size > 0) {
            int i = size - 1;
            lw8[] content = f7bVar2.getContent();
            do {
                f7bVar.add(content[i].getNodes$ui_release().getHead$ui_release());
                i--;
            } while (i >= 0);
        }
    }

    /* JADX INFO: renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m32848ancestors64DMado(v34 v34Var, int i) {
        feb nodes$ui_release;
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d parent$ui_release = v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        ArrayList arrayList = null;
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                        for (InterfaceC0701e.d dVarPop = parent$ui_release; dVarPop != null; dVarPop = pop(null)) {
                            md8.reifiedOperationMarker(3, "T");
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(dVarPop);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public static final ew8 asLayoutModifierNode(@yfb InterfaceC0701e.d dVar) {
        if ((keb.m30687constructorimpl(2) & dVar.getKindSet$ui_release()) != 0) {
            if (dVar instanceof ew8) {
                return (ew8) dVar;
            }
            if (dVar instanceof d44) {
                InterfaceC0701e.d delegate$ui_release = ((d44) dVar).getDelegate$ui_release();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof ew8) {
                        return (ew8) delegate$ui_release;
                    }
                    delegate$ui_release = (!(delegate$ui_release instanceof d44) || (keb.m30687constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) == 0) ? delegate$ui_release.getChild$ui_release() : ((d44) delegate$ui_release).getDelegate$ui_release();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32849dispatchForKind6rFNWt0(InterfaceC0701e.d dVar, int i, qy6<? super T, bth> qy6Var) {
        while (dVar != null) {
            md8.reifiedOperationMarker(3, "T");
            qy6Var.invoke(dVar);
            dVar = pop(null);
        }
    }

    /* JADX INFO: renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m32850has64DMado(@yfb v34 v34Var, int i) {
        return (v34Var.getNode().getAggregateChildKindSet$ui_release() & i) != 0;
    }

    public static final void invalidateSubtree(@yfb v34 v34Var) {
        if (v34Var.getNode().isAttached()) {
            lw8.invalidateSubtree$default(requireLayoutNode(v34Var), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(@yfb v34 v34Var) {
        return v34Var.getNode() == v34Var;
    }

    @gib
    public static final InterfaceC0701e.d nearestAncestor(@yfb v34 v34Var, int i) {
        feb nodes$ui_release;
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        InterfaceC0701e.d parent$ui_release = v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                        return parent$ui_release;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX INFO: renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m32851nearestAncestor64DMado(v34 v34Var, int i) {
        feb nodes$ui_release;
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        v34 parent$ui_release = v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (parent$ui_release != null) {
                    if ((((InterfaceC0701e.d) parent$ui_release).getKindSet$ui_release() & i) != 0) {
                        md8.reifiedOperationMarker(3, "T");
                        return (T) parent$ui_release;
                    }
                    parent$ui_release = (T) ((InterfaceC0701e.d) parent$ui_release).getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? (T) null : (T) nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0701e.d pop(f7b<InterfaceC0701e.d> f7bVar) {
        if (f7bVar == null || f7bVar.isEmpty()) {
            return null;
        }
        return f7bVar.removeAt(f7bVar.getSize() - 1);
    }

    @yfb
    /* JADX INFO: renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final heb m32852requireCoordinator64DMado(@yfb v34 v34Var, int i) {
        heb coordinator$ui_release = v34Var.getNode().getCoordinator$ui_release();
        md8.checkNotNull(coordinator$ui_release);
        if (coordinator$ui_release.getTail() != v34Var || !leb.m30864getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator$ui_release;
        }
        heb wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
        md8.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @yfb
    public static final c64 requireDensity(@yfb v34 v34Var) {
        return requireLayoutNode(v34Var).getDensity();
    }

    @yfb
    public static final s97 requireGraphicsContext(@yfb v34 v34Var) {
        return requireOwner(v34Var).getGraphicsContext();
    }

    @yfb
    public static final mv8 requireLayoutCoordinates(@yfb v34 v34Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        mv8 coordinates = m32852requireCoordinator64DMado(v34Var, keb.m30687constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            g28.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    @yfb
    public static final ov8 requireLayoutDirection(@yfb v34 v34Var) {
        return requireLayoutNode(v34Var).getLayoutDirection();
    }

    @yfb
    public static final lw8 requireLayoutNode(@yfb v34 v34Var) {
        heb coordinator$ui_release = v34Var.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        g28.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new us8();
    }

    @yfb
    public static final z9c requireOwner(@yfb v34 v34Var) {
        z9c owner$ui_release = requireLayoutNode(v34Var).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        g28.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new us8();
    }

    public static final void visitAncestors(@yfb v34 v34Var, int i, boolean z, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        feb nodes$ui_release;
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d node = z ? v34Var.getNode() : v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i) != 0) {
                        qy6Var.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            node = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static /* synthetic */ void visitAncestors$default(v34 v34Var, int i, boolean z, qy6 qy6Var, int i2, Object obj) {
        feb nodes$ui_release;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d node = z ? v34Var.getNode() : v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i) != 0) {
                        qy6Var.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            node = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m32853visitAncestorsYYKmho(v34 v34Var, int i, boolean z, qy6<? super T, bth> qy6Var) {
        feb nodes$ui_release;
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d node = z ? v34Var.getNode() : v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i) != 0) {
                        for (InterfaceC0701e.d dVarPop = node; dVarPop != null; dVarPop = pop(null)) {
                            md8.reifiedOperationMarker(3, "T");
                            qy6Var.invoke(dVarPop);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            node = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m32854visitAncestorsYYKmho$default(v34 v34Var, int i, boolean z, qy6 qy6Var, int i2, Object obj) {
        feb nodes$ui_release;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d node = z ? v34Var.getNode() : v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i) != 0) {
                        for (InterfaceC0701e.d dVarPop = node; dVarPop != null; dVarPop = pop(null)) {
                            md8.reifiedOperationMarker(3, "T");
                            qy6Var.invoke(dVarPop);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            node = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static final void visitChildren(@yfb v34 v34Var, int i, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(f7bVar, v34Var.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d child$ui_release2 = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((child$ui_release2.getAggregateChildKindSet$ui_release() & i) == 0) {
                addLayoutNodeChildren(f7bVar, child$ui_release2);
            } else {
                while (true) {
                    if (child$ui_release2 == null) {
                        break;
                    }
                    if ((child$ui_release2.getKindSet$ui_release() & i) != 0) {
                        qy6Var.invoke(child$ui_release2);
                        break;
                    }
                    child$ui_release2 = child$ui_release2.getChild$ui_release();
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32855visitChildren6rFNWt0(v34 v34Var, int i, qy6<? super T, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(f7bVar, v34Var.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVarPop = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVarPop.getAggregateChildKindSet$ui_release() & i) == 0) {
                addLayoutNodeChildren(f7bVar, dVarPop);
            } else {
                while (true) {
                    if (dVarPop == null) {
                        break;
                    }
                    if ((dVarPop.getKindSet$ui_release() & i) != 0) {
                        while (dVarPop != null) {
                            md8.reifiedOperationMarker(3, "T");
                            qy6Var.invoke(dVarPop);
                            dVarPop = pop(null);
                        }
                    } else {
                        dVarPop = dVarPop.getChild$ui_release();
                    }
                }
            }
        }
    }

    public static final void visitLocalAncestors(@yfb v34 v34Var, int i, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (InterfaceC0701e.d parent$ui_release = v34Var.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                qy6Var.invoke(parent$ui_release);
            }
        }
    }

    /* JADX INFO: renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32856visitLocalAncestors6rFNWt0(v34 v34Var, int i, qy6<? super T, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (InterfaceC0701e.d parent$ui_release = v34Var.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                for (InterfaceC0701e.d dVarPop = parent$ui_release; dVarPop != null; dVarPop = pop(null)) {
                    md8.reifiedOperationMarker(3, "T");
                    qy6Var.invoke(dVarPop);
                }
            }
        }
    }

    public static final void visitLocalDescendants(@yfb v34 v34Var, int i, boolean z, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        InterfaceC0701e.d node = v34Var.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            if ((node.getKindSet$ui_release() & i) != 0) {
                qy6Var.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(v34 v34Var, int i, boolean z, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        InterfaceC0701e.d node = v34Var.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            if ((node.getKindSet$ui_release() & i) != 0) {
                qy6Var.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32857visitLocalDescendants6rFNWt0(v34 v34Var, int i, qy6<? super T, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        InterfaceC0701e.d node = v34Var.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
            for (InterfaceC0701e.d child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (InterfaceC0701e.d dVarPop = child$ui_release; dVarPop != null; dVarPop = pop(null)) {
                        md8.reifiedOperationMarker(3, "T");
                        qy6Var.invoke(dVarPop);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m32858visitSelfAndAncestors5BbP62I(v34 v34Var, int i, int i2, qy6<? super T, bth> qy6Var) {
        feb nodes$ui_release;
        InterfaceC0701e.d node = v34Var.getNode();
        int i3 = i | i2;
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d node2 = v34Var.getNode();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i3) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i3) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & i2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui_release() & i) != 0) {
                            for (InterfaceC0701e.d dVarPop = node2; dVarPop != null; dVarPop = pop(null)) {
                                md8.reifiedOperationMarker(3, "T");
                                qy6Var.invoke(dVarPop);
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

    /* JADX INFO: renamed from: visitSelfAndChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32859visitSelfAndChildren6rFNWt0(v34 v34Var, int i, qy6<? super T, bth> qy6Var) {
        for (InterfaceC0701e.d node = v34Var.getNode(); node != null; node = pop(null)) {
            md8.reifiedOperationMarker(3, "T");
            qy6Var.invoke(node);
        }
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(f7bVar, v34Var.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVarPop = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVarPop.getAggregateChildKindSet$ui_release() & i) == 0) {
                addLayoutNodeChildren(f7bVar, dVarPop);
            } else {
                while (true) {
                    if (dVarPop == null) {
                        break;
                    }
                    if ((dVarPop.getKindSet$ui_release() & i) != 0) {
                        while (dVarPop != null) {
                            md8.reifiedOperationMarker(3, "T");
                            qy6Var.invoke(dVarPop);
                            dVarPop = pop(null);
                        }
                    } else {
                        dVarPop = dVarPop.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32860visitSelfAndLocalDescendants6rFNWt0(v34 v34Var, int i, qy6<? super T, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        InterfaceC0701e.d node = v34Var.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
            while (node != null) {
                if ((node.getKindSet$ui_release() & i) != 0) {
                    for (InterfaceC0701e.d dVarPop = node; dVarPop != null; dVarPop = pop(null)) {
                        md8.reifiedOperationMarker(3, "T");
                        qy6Var.invoke(dVarPop);
                    }
                }
                node = node.getChild$ui_release();
            }
        }
    }

    public static final void visitSubtree(@yfb v34 v34Var, int i, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        xab xabVar = new xab();
        while (lw8VarRequireLayoutNode != null) {
            if (child$ui_release == null) {
                child$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release();
            }
            if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                        qy6Var.invoke(child$ui_release);
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                }
            }
            xabVar.push(lw8VarRequireLayoutNode.get_children$ui_release());
            child$ui_release = null;
            lw8VarRequireLayoutNode = xabVar.isNotEmpty() ? (lw8) xabVar.pop() : null;
        }
    }

    /* JADX INFO: renamed from: visitSubtree-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32861visitSubtree6rFNWt0(v34 v34Var, int i, qy6<? super T, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        lw8 lw8VarRequireLayoutNode = requireLayoutNode(v34Var);
        xab xabVar = new xab();
        while (lw8VarRequireLayoutNode != null) {
            if (child$ui_release == null) {
                child$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release();
            }
            if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                        for (InterfaceC0701e.d dVarPop = child$ui_release; dVarPop != null; dVarPop = pop(null)) {
                            md8.reifiedOperationMarker(3, "T");
                            qy6Var.invoke(dVarPop);
                        }
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                }
            }
            xabVar.push(lw8VarRequireLayoutNode.get_children$ui_release());
            lw8VarRequireLayoutNode = xabVar.isNotEmpty() ? (lw8) xabVar.pop() : null;
            child$ui_release = null;
        }
    }

    public static final void visitSubtreeIf(@yfb v34 v34Var, int i, @yfb qy6<? super InterfaceC0701e.d, Boolean> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(f7bVar, v34Var.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVar = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVar.getAggregateChildKindSet$ui_release() & i) != 0) {
                for (InterfaceC0701e.d child$ui_release2 = dVar; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & i) == 0 || qy6Var.invoke(child$ui_release2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(f7bVar, dVar);
        }
    }

    /* JADX INFO: renamed from: visitSubtreeIf-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32862visitSubtreeIf6rFNWt0(v34 v34Var, int i, qy6<? super T, Boolean> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(f7bVar, v34Var.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVar = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVar.getAggregateChildKindSet$ui_release() & i) != 0) {
                for (InterfaceC0701e.d child$ui_release2 = dVar; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & i) != 0) {
                        for (InterfaceC0701e.d dVarPop = child$ui_release2; dVarPop != null; dVarPop = pop(null)) {
                            md8.reifiedOperationMarker(3, "T");
                            if (!qy6Var.invoke(dVarPop).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(f7bVar, dVar);
        }
    }

    public static final void visitLocalDescendants(@yfb v34 v34Var, int i, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        InterfaceC0701e.d node = v34Var.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
            for (InterfaceC0701e.d child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                    qy6Var.invoke(child$ui_release);
                }
            }
        }
    }
}
