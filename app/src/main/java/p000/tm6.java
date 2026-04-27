package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,154:1\n267#2,4:155\n237#2,7:159\n248#2,3:167\n251#2,2:171\n272#2:173\n273#2:284\n254#2,6:285\n274#2:291\n267#2,4:292\n237#2,7:296\n248#2,3:304\n251#2,2:308\n272#2:310\n273#2:421\n254#2,6:422\n274#2:428\n267#2,4:429\n237#2,7:433\n248#2,3:441\n251#2,2:445\n272#2,2:447\n254#2,6:449\n274#2:455\n1810#3:166\n1672#3:170\n1810#3:303\n1672#3:307\n1810#3:440\n1672#3:444\n94#4:174\n94#4:311\n303#5:175\n432#5,6:176\n442#5,2:183\n444#5,8:188\n452#5,9:199\n461#5,8:211\n304#5:219\n137#5:220\n138#5,8:222\n146#5,9:231\n432#5,37:240\n155#5,6:277\n305#5:283\n303#5:312\n432#5,6:313\n442#5,2:320\n444#5,8:325\n452#5,9:336\n461#5,8:348\n304#5:356\n137#5:357\n138#5,8:359\n146#5,9:368\n432#5,37:377\n155#5,6:414\n305#5:420\n264#6:182\n264#6:319\n245#7,3:185\n248#7,3:208\n245#7,3:322\n248#7,3:345\n1208#8:196\n1187#8,2:197\n1208#8:333\n1187#8,2:334\n1#9:221\n1#9:358\n48#10:230\n48#10:367\n42#11,7:456\n42#11,7:463\n42#11,7:470\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n70#1:155,4\n70#1:159,7\n70#1:167,3\n70#1:171,2\n70#1:173\n70#1:284\n70#1:285,6\n70#1:291\n82#1:292,4\n82#1:296,7\n82#1:304,3\n82#1:308,2\n82#1:310\n82#1:421\n82#1:422,6\n82#1:428\n130#1:429,4\n130#1:433,7\n130#1:441,3\n130#1:445,2\n130#1:447,2\n130#1:449,6\n130#1:455\n70#1:166\n70#1:170\n82#1:303\n82#1:307\n130#1:440\n130#1:444\n75#1:174\n96#1:311\n75#1:175\n75#1:176,6\n75#1:183,2\n75#1:188,8\n75#1:199,9\n75#1:211,8\n75#1:219\n75#1:220\n75#1:222,8\n75#1:231,9\n75#1:240,37\n75#1:277,6\n75#1:283\n96#1:312\n96#1:313,6\n96#1:320,2\n96#1:325,8\n96#1:336,9\n96#1:348,8\n96#1:356\n96#1:357\n96#1:359,8\n96#1:368,9\n96#1:377,37\n96#1:414,6\n96#1:420\n75#1:182\n96#1:319\n75#1:185,3\n75#1:208,3\n96#1:322,3\n96#1:345,3\n75#1:196\n75#1:197,2\n96#1:333\n96#1:334,2\n75#1:221\n96#1:358\n75#1:230\n96#1:367\n149#1:456,7\n150#1:463,7\n151#1:470,7\n*E\n"})
@e0g(parameters = 0)
public final class tm6 {

    /* JADX INFO: renamed from: g */
    public static final int f85310g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<ny6<bth>, bth> f85311a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<bth> f85312b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final u6b<FocusTargetNode> f85313c = eoe.mutableScatterSetOf();

    /* JADX INFO: renamed from: d */
    @yfb
    public final u6b<nm6> f85314d = eoe.mutableScatterSetOf();

    /* JADX INFO: renamed from: e */
    @yfb
    public final u6b<an6> f85315e = eoe.mutableScatterSetOf();

    /* JADX INFO: renamed from: f */
    @yfb
    public final u6b<FocusTargetNode> f85316f = eoe.mutableScatterSetOf();

    /* JADX INFO: renamed from: tm6$a */
    public /* synthetic */ class C13103a extends n07 implements ny6<bth> {
        public C13103a(Object obj) {
            super(0, obj, tm6.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((tm6) this.receiver).invalidateNodes();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tm6(@yfb qy6<? super ny6<bth>, bth> qy6Var, @yfb ny6<bth> ny6Var) {
        this.f85311a = qy6Var;
        this.f85312b = ny6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        int i;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        in6 focusState;
        f7b f7bVar;
        int i2;
        int i3;
        int i4;
        long[] jArr3;
        Object[] objArr3;
        boolean z;
        Object[] objArr4;
        boolean z2;
        int i5;
        f7b f7bVar2;
        long[] jArr4;
        long[] jArr5;
        int i6;
        long[] jArr6;
        long[] jArr7;
        u6b<an6> u6bVar = this.f85315e;
        Object[] objArr5 = u6bVar.f30278b;
        long[] jArr8 = u6bVar.f30277a;
        int length = jArr8.length - 2;
        char c = 7;
        long j = -9187201950435737472L;
        int i7 = 8;
        int i8 = 1;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j2 = jArr8[i9];
                if ((((~j2) << c) & j2 & j) != j) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j2 & 255) < 128) {
                            an6 an6Var = (an6) objArr5[(i9 << 3) + i11];
                            if (an6Var.getNode().isAttached()) {
                                int iM30687constructorimpl = keb.m30687constructorimpl(1024);
                                InterfaceC0701e.d node = an6Var.getNode();
                                f7b f7bVar3 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        this.f85313c.add((FocusTargetNode) node);
                                    } else {
                                        if ((node.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (node instanceof d44)) {
                                            InterfaceC0701e.d delegate$ui_release = ((d44) node).getDelegate$ui_release();
                                            int i12 = 0;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                                    i12++;
                                                    if (i12 == i8) {
                                                        jArr7 = jArr8;
                                                        node = delegate$ui_release;
                                                    } else {
                                                        if (f7bVar3 == null) {
                                                            jArr7 = jArr8;
                                                            f7bVar3 = new f7b(new InterfaceC0701e.d[16], 0);
                                                        } else {
                                                            jArr7 = jArr8;
                                                        }
                                                        if (node != null) {
                                                            f7bVar3.add(node);
                                                            node = null;
                                                        }
                                                        f7bVar3.add(delegate$ui_release);
                                                    }
                                                } else {
                                                    jArr7 = jArr8;
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                jArr8 = jArr7;
                                                i8 = 1;
                                            }
                                            jArr6 = jArr8;
                                            int i13 = i8;
                                            if (i12 == i13) {
                                                i8 = i13;
                                                jArr8 = jArr6;
                                            }
                                        }
                                        node = w34.pop(f7bVar3);
                                        jArr8 = jArr6;
                                        i8 = 1;
                                    }
                                    jArr6 = jArr8;
                                    node = w34.pop(f7bVar3);
                                    jArr8 = jArr6;
                                    i8 = 1;
                                }
                                jArr5 = jArr8;
                                if (!an6Var.getNode().isAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                f7b f7bVar4 = new f7b(new InterfaceC0701e.d[16], 0);
                                InterfaceC0701e.d child$ui_release = an6Var.getNode().getChild$ui_release();
                                if (child$ui_release == null) {
                                    w34.addLayoutNodeChildren(f7bVar4, an6Var.getNode());
                                } else {
                                    f7bVar4.add(child$ui_release);
                                }
                                while (f7bVar4.isNotEmpty()) {
                                    InterfaceC0701e.d dVarPop = (InterfaceC0701e.d) f7bVar4.removeAt(f7bVar4.getSize() - 1);
                                    if ((dVarPop.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
                                        w34.addLayoutNodeChildren(f7bVar4, dVarPop);
                                    } else {
                                        while (true) {
                                            if (dVarPop == null) {
                                                break;
                                            }
                                            if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                                f7b f7bVar5 = null;
                                                while (dVarPop != null) {
                                                    if (dVarPop instanceof FocusTargetNode) {
                                                        this.f85313c.add((FocusTargetNode) dVarPop);
                                                    } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                                        int i14 = 0;
                                                        for (InterfaceC0701e.d delegate$ui_release2 = ((d44) dVarPop).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                            if ((delegate$ui_release2.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                                                i14++;
                                                                if (i14 == 1) {
                                                                    dVarPop = delegate$ui_release2;
                                                                } else {
                                                                    if (f7bVar5 == null) {
                                                                        f7bVar5 = new f7b(new InterfaceC0701e.d[16], 0);
                                                                    }
                                                                    if (dVarPop != null) {
                                                                        f7bVar5.add(dVarPop);
                                                                        dVarPop = null;
                                                                    }
                                                                    f7bVar5.add(delegate$ui_release2);
                                                                }
                                                            }
                                                        }
                                                        if (i14 == 1) {
                                                        }
                                                    }
                                                    dVarPop = w34.pop(f7bVar5);
                                                }
                                            } else {
                                                dVarPop = dVarPop.getChild$ui_release();
                                            }
                                        }
                                    }
                                }
                            } else {
                                jArr5 = jArr8;
                            }
                            i6 = 8;
                        } else {
                            jArr5 = jArr8;
                            i6 = i7;
                        }
                        j2 >>= i6;
                        i11++;
                        i7 = i6;
                        jArr8 = jArr5;
                        i8 = 1;
                    }
                    jArr4 = jArr8;
                    if (i10 != i7) {
                        break;
                    }
                } else {
                    jArr4 = jArr8;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                jArr8 = jArr4;
                c = 7;
                j = -9187201950435737472L;
                i8 = 1;
                i7 = 8;
            }
        }
        this.f85315e.clear();
        u6b<nm6> u6bVar2 = this.f85314d;
        Object[] objArr6 = u6bVar2.f30278b;
        long[] jArr9 = u6bVar2.f30277a;
        int length2 = jArr9.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j3 = jArr9[i15];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j3 & 255) < 128) {
                            nm6 nm6Var = (nm6) objArr6[(i15 << 3) + i17];
                            if (nm6Var.getNode().isAttached()) {
                                int iM30687constructorimpl2 = keb.m30687constructorimpl(1024);
                                InterfaceC0701e.d node2 = nm6Var.getNode();
                                boolean z3 = false;
                                boolean z4 = true;
                                FocusTargetNode focusTargetNode = null;
                                f7b f7bVar6 = null;
                                while (node2 != null) {
                                    if (node2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node2;
                                        if (focusTargetNode != null) {
                                            z3 = true;
                                        }
                                        if (this.f85313c.contains(focusTargetNode2)) {
                                            this.f85316f.add(focusTargetNode2);
                                            z4 = false;
                                        }
                                        jArr3 = jArr9;
                                        objArr3 = objArr6;
                                        focusTargetNode = focusTargetNode2;
                                    } else {
                                        if ((node2.getKindSet$ui_release() & iM30687constructorimpl2) == 0 || !(node2 instanceof d44)) {
                                            jArr3 = jArr9;
                                            objArr3 = objArr6;
                                            z = z3;
                                        } else {
                                            InterfaceC0701e.d delegate$ui_release3 = ((d44) node2).getDelegate$ui_release();
                                            jArr3 = jArr9;
                                            int i18 = 0;
                                            while (delegate$ui_release3 != null) {
                                                if ((delegate$ui_release3.getKindSet$ui_release() & iM30687constructorimpl2) != 0) {
                                                    i18++;
                                                    objArr4 = objArr6;
                                                    if (i18 == 1) {
                                                        node2 = delegate$ui_release3;
                                                    } else {
                                                        if (f7bVar6 == null) {
                                                            i5 = i18;
                                                            z2 = z3;
                                                            f7bVar2 = new f7b(new InterfaceC0701e.d[16], 0);
                                                        } else {
                                                            i5 = i18;
                                                            z2 = z3;
                                                            f7bVar2 = f7bVar6;
                                                        }
                                                        if (node2 != null) {
                                                            f7bVar2.add(node2);
                                                            node2 = null;
                                                        }
                                                        f7bVar2.add(delegate$ui_release3);
                                                        f7bVar6 = f7bVar2;
                                                        i18 = i5;
                                                        delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                                                        objArr6 = objArr4;
                                                        z3 = z2;
                                                    }
                                                } else {
                                                    objArr4 = objArr6;
                                                }
                                                z2 = z3;
                                                delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                                                objArr6 = objArr4;
                                                z3 = z2;
                                            }
                                            objArr3 = objArr6;
                                            z = z3;
                                            if (i18 == 1) {
                                                jArr9 = jArr3;
                                                objArr6 = objArr3;
                                                z3 = z;
                                            }
                                        }
                                        z3 = z;
                                    }
                                    node2 = w34.pop(f7bVar6);
                                    jArr9 = jArr3;
                                    objArr6 = objArr3;
                                }
                                jArr2 = jArr9;
                                objArr2 = objArr6;
                                boolean z5 = z3;
                                if (!nm6Var.getNode().isAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                f7b f7bVar7 = new f7b(new InterfaceC0701e.d[16], 0);
                                InterfaceC0701e.d child$ui_release2 = nm6Var.getNode().getChild$ui_release();
                                if (child$ui_release2 == null) {
                                    w34.addLayoutNodeChildren(f7bVar7, nm6Var.getNode());
                                } else {
                                    f7bVar7.add(child$ui_release2);
                                }
                                boolean z6 = z5;
                                while (f7bVar7.isNotEmpty()) {
                                    InterfaceC0701e.d dVarPop2 = (InterfaceC0701e.d) f7bVar7.removeAt(f7bVar7.getSize() - 1);
                                    if ((dVarPop2.getAggregateChildKindSet$ui_release() & iM30687constructorimpl2) == 0) {
                                        w34.addLayoutNodeChildren(f7bVar7, dVarPop2);
                                    } else {
                                        while (dVarPop2 != null) {
                                            if ((dVarPop2.getKindSet$ui_release() & iM30687constructorimpl2) != 0) {
                                                f7b f7bVar8 = null;
                                                while (dVarPop2 != null) {
                                                    if (dVarPop2 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) dVarPop2;
                                                        if (focusTargetNode != null) {
                                                            z6 = true;
                                                        }
                                                        if (this.f85313c.contains(focusTargetNode3)) {
                                                            this.f85316f.add(focusTargetNode3);
                                                            z4 = false;
                                                        }
                                                        f7bVar = f7bVar7;
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((dVarPop2.getKindSet$ui_release() & iM30687constructorimpl2) == 0 || !(dVarPop2 instanceof d44)) {
                                                        f7bVar = f7bVar7;
                                                    } else {
                                                        InterfaceC0701e.d delegate$ui_release4 = ((d44) dVarPop2).getDelegate$ui_release();
                                                        f7bVar = f7bVar7;
                                                        int i19 = 0;
                                                        while (delegate$ui_release4 != null) {
                                                            if ((delegate$ui_release4.getKindSet$ui_release() & iM30687constructorimpl2) != 0) {
                                                                i19++;
                                                                i3 = iM30687constructorimpl2;
                                                                if (i19 == 1) {
                                                                    dVarPop2 = delegate$ui_release4;
                                                                } else {
                                                                    if (f7bVar8 == null) {
                                                                        i4 = i19;
                                                                        f7bVar8 = new f7b(new InterfaceC0701e.d[16], 0);
                                                                    } else {
                                                                        i4 = i19;
                                                                    }
                                                                    if (dVarPop2 != null) {
                                                                        f7bVar8.add(dVarPop2);
                                                                        dVarPop2 = null;
                                                                    }
                                                                    f7bVar8.add(delegate$ui_release4);
                                                                    i19 = i4;
                                                                    delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                                                    iM30687constructorimpl2 = i3;
                                                                }
                                                            } else {
                                                                i3 = iM30687constructorimpl2;
                                                            }
                                                            delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                                            iM30687constructorimpl2 = i3;
                                                        }
                                                        i2 = iM30687constructorimpl2;
                                                        if (i19 != 1) {
                                                            dVarPop2 = w34.pop(f7bVar8);
                                                        }
                                                        f7bVar7 = f7bVar;
                                                        iM30687constructorimpl2 = i2;
                                                    }
                                                    i2 = iM30687constructorimpl2;
                                                    dVarPop2 = w34.pop(f7bVar8);
                                                    f7bVar7 = f7bVar;
                                                    iM30687constructorimpl2 = i2;
                                                }
                                            } else {
                                                dVarPop2 = dVarPop2.getChild$ui_release();
                                                iM30687constructorimpl2 = iM30687constructorimpl2;
                                            }
                                        }
                                    }
                                    f7bVar7 = f7bVar7;
                                    iM30687constructorimpl2 = iM30687constructorimpl2;
                                }
                                if (z4) {
                                    if (z6) {
                                        focusState = om6.getFocusState(nm6Var);
                                    } else if (focusTargetNode == null || (focusState = focusTargetNode.getFocusState()) == null) {
                                        focusState = jn6.Inactive;
                                    }
                                    nm6Var.onFocusEvent(focusState);
                                }
                            } else {
                                nm6Var.onFocusEvent(jn6.Inactive);
                                jArr2 = jArr9;
                                objArr2 = objArr6;
                            }
                        } else {
                            jArr2 = jArr9;
                            objArr2 = objArr6;
                        }
                        j3 >>= 8;
                        i17++;
                        jArr9 = jArr2;
                        objArr6 = objArr2;
                    }
                    jArr = jArr9;
                    objArr = objArr6;
                    i = 0;
                    if (i16 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr9;
                    objArr = objArr6;
                    i = 0;
                }
                if (i15 == length2) {
                    break;
                }
                i15++;
                jArr9 = jArr;
                objArr6 = objArr;
            }
        } else {
            i = 0;
        }
        this.f85314d.clear();
        u6b<FocusTargetNode> u6bVar3 = this.f85313c;
        Object[] objArr7 = u6bVar3.f30278b;
        long[] jArr10 = u6bVar3.f30277a;
        int length3 = jArr10.length - 2;
        if (length3 >= 0) {
            int i20 = i;
            while (true) {
                long j4 = jArr10[i20];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                    for (int i22 = i; i22 < i21; i22++) {
                        if ((j4 & 255) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr7[(i20 << 3) + i22];
                            if (focusTargetNode4.isAttached()) {
                                jn6 focusState2 = focusTargetNode4.getFocusState();
                                focusTargetNode4.invalidateFocus$ui_release();
                                if (focusState2 != focusTargetNode4.getFocusState() || this.f85316f.contains(focusTargetNode4)) {
                                    om6.refreshFocusEventNodes(focusTargetNode4);
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length3) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.f85313c.clear();
        this.f85316f.clear();
        this.f85312b.invoke();
        if (!this.f85315e.isEmpty()) {
            g28.throwIllegalStateException("Unprocessed FocusProperties nodes");
        }
        if (!this.f85314d.isEmpty()) {
            g28.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if (this.f85313c.isEmpty()) {
            return;
        }
        g28.throwIllegalStateException("Unprocessed FocusTarget nodes");
    }

    public final boolean hasPendingInvalidation() {
        return this.f85313c.isNotEmpty() || this.f85315e.isNotEmpty() || this.f85314d.isNotEmpty();
    }

    public final void scheduleInvalidation(@yfb FocusTargetNode focusTargetNode) {
        scheduleInvalidation(this.f85313c, focusTargetNode);
    }

    public final void scheduleInvalidation(@yfb nm6 nm6Var) {
        scheduleInvalidation(this.f85314d, nm6Var);
    }

    public final void scheduleInvalidation(@yfb an6 an6Var) {
        scheduleInvalidation(this.f85315e, an6Var);
    }

    private final <T> void scheduleInvalidation(u6b<T> u6bVar, T t) {
        if (u6bVar.add(t) && this.f85313c.getSize() + this.f85314d.getSize() + this.f85315e.getSize() == 1) {
            this.f85311a.invoke(new C13103a(this));
        }
    }
}
