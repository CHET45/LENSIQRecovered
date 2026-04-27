package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.shh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,230:1\n110#2:231\n110#2:297\n110#2:363\n110#2:429\n110#2:495\n110#2:566\n110#2:637\n110#2:716\n251#3,5:232\n62#3:237\n63#3,8:239\n432#3,6:247\n442#3,2:254\n444#3,8:259\n452#3,9:270\n461#3,8:282\n72#3,7:290\n251#3,5:298\n62#3:303\n63#3,8:305\n432#3,6:313\n442#3,2:320\n444#3,8:325\n452#3,9:336\n461#3,8:348\n72#3,7:356\n251#3,5:364\n62#3:369\n63#3,8:371\n432#3,6:379\n442#3,2:386\n444#3,8:391\n452#3,9:402\n461#3,8:414\n72#3,7:422\n251#3,5:430\n62#3:435\n63#3,8:437\n432#3,6:445\n442#3,2:452\n444#3,8:457\n452#3,9:468\n461#3,8:480\n72#3,7:488\n297#3:496\n137#3:497\n138#3:499\n139#3,7:503\n146#3,9:511\n432#3,6:520\n442#3,2:527\n444#3,17:532\n461#3,8:552\n155#3,6:560\n297#3:567\n137#3:568\n138#3:570\n139#3,7:574\n146#3,9:582\n432#3,6:591\n442#3,2:598\n444#3,17:603\n461#3,8:623\n155#3,6:631\n310#3:638\n167#3:639\n168#3:647\n169#3,12:651\n311#3:663\n432#3,5:664\n312#3,2:669\n437#3:671\n442#3,2:673\n444#3,17:678\n461#3,8:698\n314#3:706\n181#3,8:707\n315#3:715\n310#3:717\n167#3:718\n168#3:726\n169#3,12:730\n311#3:742\n432#3,5:743\n312#3,2:748\n437#3:750\n442#3,2:752\n444#3,17:757\n461#3,8:777\n314#3:785\n181#3,8:786\n315#3:794\n1#4:238\n1#4:304\n1#4:370\n1#4:436\n1#4:498\n1#4:569\n264#5:253\n264#5:319\n264#5:385\n264#5:451\n264#5:526\n264#5:597\n264#5:672\n264#5:751\n245#6,3:256\n248#6,3:279\n245#6,3:322\n248#6,3:345\n245#6,3:388\n248#6,3:411\n245#6,3:454\n248#6,3:477\n245#6,3:529\n248#6,3:549\n245#6,3:600\n248#6,3:620\n245#6,3:675\n248#6,3:695\n245#6,3:754\n248#6,3:774\n1208#7:267\n1187#7,2:268\n1208#7:333\n1187#7,2:334\n1208#7:399\n1187#7,2:400\n1208#7:465\n1187#7,2:466\n1208#7:500\n1187#7,2:501\n1208#7:571\n1187#7,2:572\n1208#7:648\n1187#7,2:649\n1208#7:727\n1187#7,2:728\n48#8:510\n48#8:581\n42#9,7:640\n42#9,7:719\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n58#1:231\n70#1:297\n92#1:363\n111#1:429\n138#1:495\n159#1:566\n187#1:637\n214#1:716\n58#1:232,5\n58#1:237\n58#1:239,8\n58#1:247,6\n58#1:254,2\n58#1:259,8\n58#1:270,9\n58#1:282,8\n58#1:290,7\n70#1:298,5\n70#1:303\n70#1:305,8\n70#1:313,6\n70#1:320,2\n70#1:325,8\n70#1:336,9\n70#1:348,8\n70#1:356,7\n92#1:364,5\n92#1:369\n92#1:371,8\n92#1:379,6\n92#1:386,2\n92#1:391,8\n92#1:402,9\n92#1:414,8\n92#1:422,7\n111#1:430,5\n111#1:435\n111#1:437,8\n111#1:445,6\n111#1:452,2\n111#1:457,8\n111#1:468,9\n111#1:480,8\n111#1:488,7\n138#1:496\n138#1:497\n138#1:499\n138#1:503,7\n138#1:511,9\n138#1:520,6\n138#1:527,2\n138#1:532,17\n138#1:552,8\n138#1:560,6\n159#1:567\n159#1:568\n159#1:570\n159#1:574,7\n159#1:582,9\n159#1:591,6\n159#1:598,2\n159#1:603,17\n159#1:623,8\n159#1:631,6\n187#1:638\n187#1:639\n187#1:647\n187#1:651,12\n187#1:663\n187#1:664,5\n187#1:669,2\n187#1:671\n187#1:673,2\n187#1:678,17\n187#1:698,8\n187#1:706\n187#1:707,8\n187#1:715\n214#1:717\n214#1:718\n214#1:726\n214#1:730,12\n214#1:742\n214#1:743,5\n214#1:748,2\n214#1:750\n214#1:752,2\n214#1:757,17\n214#1:777,8\n214#1:785\n214#1:786,8\n214#1:794\n58#1:238\n70#1:304\n92#1:370\n111#1:436\n138#1:498\n159#1:569\n58#1:253\n70#1:319\n92#1:385\n111#1:451\n138#1:526\n159#1:597\n187#1:672\n214#1:751\n58#1:256,3\n58#1:279,3\n70#1:322,3\n70#1:345,3\n92#1:388,3\n92#1:411,3\n111#1:454,3\n111#1:477,3\n138#1:529,3\n138#1:549,3\n159#1:600,3\n159#1:620,3\n187#1:675,3\n187#1:695,3\n214#1:754,3\n214#1:774,3\n58#1:267\n58#1:268,2\n70#1:333\n70#1:334,2\n92#1:399\n92#1:400,2\n111#1:465\n111#1:466,2\n138#1:500\n138#1:501,2\n159#1:571\n159#1:572,2\n187#1:648\n187#1:649,2\n214#1:727\n214#1:728,2\n138#1:510\n159#1:581\n187#1:640,7\n214#1:719,7\n*E\n"})
public final class thh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    @gib
    public static final shh findNearestAncestor(@yfb v34 v34Var, @gib Object obj) {
        feb nodes$ui_release;
        int iM30687constructorimpl = keb.m30687constructorimpl(262144);
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d parent$ui_release = v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = parent$ui_release;
                        f7b f7bVar = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof shh) {
                                shh shhVar = (shh) dVarPop;
                                if (md8.areEqual(obj, shhVar.getTraverseKey())) {
                                    return shhVar;
                                }
                            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                int i = 0;
                                dVarPop = dVarPop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            dVarPop = w34.pop(f7bVar);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    public static final void traverseAncestors(@yfb v34 v34Var, @gib Object obj, @yfb qy6<? super shh, Boolean> qy6Var) {
        feb nodes$ui_release;
        int iM30687constructorimpl = keb.m30687constructorimpl(262144);
        if (!v34Var.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d parent$ui_release = v34Var.getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(v34Var);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = parent$ui_release;
                        f7b f7bVar = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof shh) {
                                shh shhVar = (shh) dVarPop;
                                if (!(md8.areEqual(obj, shhVar.getTraverseKey()) ? qy6Var.invoke(shhVar).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0) && (dVarPop instanceof d44)) {
                                    InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                    int i = 0;
                                    dVarPop = dVarPop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                            }
                            dVarPop = w34.pop(f7bVar);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x002f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void traverseChildren(@p000.yfb p000.v34 r10, @p000.gib java.lang.Object r11, @p000.yfb p000.qy6<? super p000.shh, java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.thh.traverseChildren(v34, java.lang.Object, qy6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    public static final void traverseDescendants(@yfb v34 v34Var, @gib Object obj, @yfb qy6<? super shh, ? extends shh.C12597a.a> qy6Var) {
        int iM30687constructorimpl = keb.m30687constructorimpl(262144);
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            w34.addLayoutNodeChildren(f7bVar, v34Var.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVar = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVar.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                for (InterfaceC0701e.d child$ui_release2 = dVar; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = child$ui_release2;
                        f7b f7bVar2 = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof shh) {
                                shh shhVar = (shh) dVarPop;
                                shh.C12597a.a aVarInvoke = md8.areEqual(obj, shhVar.getTraverseKey()) ? qy6Var.invoke(shhVar) : shh.C12597a.a.ContinueTraversal;
                                if (aVarInvoke == shh.C12597a.a.CancelTraversal) {
                                    return;
                                }
                                if (aVarInvoke == shh.C12597a.a.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                int i = 0;
                                dVarPop = dVarPop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dVarPop = delegate$ui_release;
                                        } else {
                                            if (f7bVar2 == null) {
                                                f7bVar2 = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (dVarPop != 0) {
                                                f7bVar2.add(dVarPop);
                                                dVarPop = 0;
                                            }
                                            f7bVar2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    dVarPop = dVarPop;
                                }
                                if (i == 1) {
                                }
                            }
                            dVarPop = w34.pop(f7bVar2);
                        }
                    }
                }
            }
            w34.addLayoutNodeChildren(f7bVar, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    @gib
    public static final <T extends shh> T findNearestAncestor(@yfb T t) {
        feb nodes$ui_release;
        int iM30687constructorimpl = keb.m30687constructorimpl(262144);
        if (t.getNode().isAttached()) {
            InterfaceC0701e.d parent$ui_release = t.getNode().getParent$ui_release();
            lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(t);
            while (lw8VarRequireLayoutNode != null) {
                if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                            InterfaceC0701e.d dVarPop = parent$ui_release;
                            f7b f7bVar = null;
                            while (dVarPop != 0) {
                                if (dVarPop instanceof shh) {
                                    T t2 = (T) dVarPop;
                                    if (md8.areEqual(t.getTraverseKey(), t2.getTraverseKey()) && C7247ie.areObjectsOfSameType(t, t2)) {
                                        return t2;
                                    }
                                } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                    InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                    int i = 0;
                                    dVarPop = dVarPop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                dVarPop = w34.pop(f7bVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
                parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    public static final <T extends shh> void traverseAncestors(@yfb T t, @yfb qy6<? super T, Boolean> qy6Var) {
        feb nodes$ui_release;
        int iM30687constructorimpl = keb.m30687constructorimpl(262144);
        if (t.getNode().isAttached()) {
            InterfaceC0701e.d parent$ui_release = t.getNode().getParent$ui_release();
            lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(t);
            while (lw8VarRequireLayoutNode != null) {
                if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                            InterfaceC0701e.d dVarPop = parent$ui_release;
                            f7b f7bVar = null;
                            while (dVarPop != 0) {
                                boolean zBooleanValue = true;
                                if (dVarPop instanceof shh) {
                                    shh shhVar = (shh) dVarPop;
                                    if (md8.areEqual(t.getTraverseKey(), shhVar.getTraverseKey()) && C7247ie.areObjectsOfSameType(t, shhVar)) {
                                        zBooleanValue = qy6Var.invoke(shhVar).booleanValue();
                                    }
                                    if (!zBooleanValue) {
                                        return;
                                    }
                                } else {
                                    if (((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0) && (dVarPop instanceof d44)) {
                                        InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                        int i = 0;
                                        dVarPop = dVarPop;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                                i++;
                                                if (i == 1) {
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
                                        if (i == 1) {
                                        }
                                    }
                                }
                                dVarPop = w34.pop(f7bVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
                parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x002f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends p000.shh> void traverseChildren(@p000.yfb T r11, @p000.yfb p000.qy6<? super T, java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.thh.traverseChildren(shh, qy6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public static final <T extends shh> void traverseDescendants(@yfb T t, @yfb qy6<? super T, ? extends shh.C12597a.a> qy6Var) {
        shh.C12597a.a aVarInvoke;
        int iM30687constructorimpl = keb.m30687constructorimpl(262144);
        if (!t.getNode().isAttached()) {
            g28.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = t.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            w34.addLayoutNodeChildren(f7bVar, t.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVar = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVar.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                for (InterfaceC0701e.d child$ui_release2 = dVar; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = child$ui_release2;
                        f7b f7bVar2 = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof shh) {
                                shh shhVar = (shh) dVarPop;
                                if (md8.areEqual(t.getTraverseKey(), shhVar.getTraverseKey()) && C7247ie.areObjectsOfSameType(t, shhVar)) {
                                    aVarInvoke = qy6Var.invoke(shhVar);
                                } else {
                                    aVarInvoke = shh.C12597a.a.ContinueTraversal;
                                }
                                if (aVarInvoke == shh.C12597a.a.CancelTraversal) {
                                    return;
                                }
                                if (aVarInvoke == shh.C12597a.a.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                int i = 0;
                                dVarPop = dVarPop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dVarPop = delegate$ui_release;
                                        } else {
                                            if (f7bVar2 == null) {
                                                f7bVar2 = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (dVarPop != 0) {
                                                f7bVar2.add(dVarPop);
                                                dVarPop = 0;
                                            }
                                            f7bVar2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    dVarPop = dVarPop;
                                }
                                if (i == 1) {
                                }
                            }
                            dVarPop = w34.pop(f7bVar2);
                        }
                    }
                }
            }
            w34.addLayoutNodeChildren(f7bVar, dVar);
        }
    }
}
