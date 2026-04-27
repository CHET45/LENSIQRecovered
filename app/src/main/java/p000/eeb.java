package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,647:1\n587#1,5:659\n594#1:763\n587#1,5:764\n594#1:824\n460#2,11:648\n460#2,11:708\n460#2,11:813\n460#2,11:885\n82#3:664\n82#3:719\n82#3:769\n82#3:825\n82#3:896\n432#4,6:665\n442#4,2:672\n444#4,8:677\n452#4,9:688\n461#4,8:700\n432#4,6:720\n442#4,2:727\n444#4,8:732\n452#4,9:743\n461#4,8:755\n432#4,6:770\n442#4,2:777\n444#4,8:782\n452#4,9:793\n461#4,8:805\n432#4,6:826\n442#4,2:833\n444#4,8:838\n452#4,9:849\n461#4,8:861\n432#4,6:897\n442#4,2:904\n444#4,8:909\n452#4,9:920\n461#4,8:932\n264#5:671\n264#5:726\n264#5:776\n264#5:832\n264#5:903\n245#6,3:674\n248#6,3:697\n245#6,3:729\n248#6,3:752\n245#6,3:779\n248#6,3:802\n245#6,3:835\n248#6,3:858\n245#6,3:906\n248#6,3:929\n1208#7:685\n1187#7,2:686\n1208#7:740\n1187#7,2:741\n1208#7:790\n1187#7,2:791\n1208#7:846\n1187#7,2:847\n1208#7:917\n1187#7,2:918\n33#8,6:869\n116#8,2:876\n33#8,6:878\n118#8:884\n33#8,6:940\n178#9:875\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n361#1:659,5\n361#1:763\n400#1:764,5\n400#1:824\n344#1:648,11\n372#1:708,11\n410#1:813,11\n605#1:885,11\n366#1:664\n386#1:719\n404#1:769\n443#1:825\n606#1:896\n366#1:665,6\n366#1:672,2\n366#1:677,8\n366#1:688,9\n366#1:700,8\n386#1:720,6\n386#1:727,2\n386#1:732,8\n386#1:743,9\n386#1:755,8\n404#1:770,6\n404#1:777,2\n404#1:782,8\n404#1:793,9\n404#1:805,8\n443#1:826,6\n443#1:833,2\n443#1:838,8\n443#1:849,9\n443#1:861,8\n606#1:897,6\n606#1:904,2\n606#1:909,8\n606#1:920,9\n606#1:932,8\n366#1:671\n386#1:726\n404#1:776\n443#1:832\n606#1:903\n366#1:674,3\n366#1:697,3\n386#1:729,3\n386#1:752,3\n404#1:779,3\n404#1:802,3\n443#1:835,3\n443#1:858,3\n606#1:906,3\n606#1:929,3\n366#1:685\n366#1:686,2\n386#1:740\n386#1:741,2\n404#1:790\n404#1:791,2\n443#1:846\n443#1:847,2\n606#1:917\n606#1:918,2\n461#1:869,6\n515#1:876,2\n515#1:878,6\n515#1:884\n622#1:940,6\n502#1:875\n*E\n"})
@e0g(parameters = 0)
public final class eeb extends oeb {

    /* JADX INFO: renamed from: k */
    public static final int f32749k = 8;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC0701e.d f32750c;

    /* JADX INFO: renamed from: f */
    @gib
    public mv8 f32753f;

    /* JADX INFO: renamed from: g */
    @gib
    public t1d f32754g;

    /* JADX INFO: renamed from: h */
    public boolean f32755h;

    /* JADX INFO: renamed from: d */
    @yfb
    public final g2d f32751d = new g2d();

    /* JADX INFO: renamed from: e */
    @yfb
    public final zl9<h2d> f32752e = new zl9<>(2);

    /* JADX INFO: renamed from: i */
    public boolean f32756i = true;

    /* JADX INFO: renamed from: j */
    public boolean f32757j = true;

    public eeb(@yfb InterfaceC0701e.d dVar) {
        this.f32750c = dVar;
    }

    private final void clearCache() {
        this.f32752e.clear();
        this.f32753f = null;
    }

    private final boolean dispatchIfNeeded(ny6<bth> ny6Var) {
        if (this.f32752e.isEmpty() || !this.f32750c.isAttached()) {
            return false;
        }
        ny6Var.invoke();
        return true;
    }

    private final boolean hasPositionChanged(t1d t1dVar, t1d t1dVar2) {
        if (t1dVar == null || t1dVar.getChanges().size() != t1dVar2.getChanges().size()) {
            return true;
        }
        int size = t1dVar2.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!izb.m30426equalsimpl0(t1dVar.getChanges().get(i).m29911getPositionF1C5BW0(), t1dVar2.getChanges().get(i).m29911getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /* JADX WARN: Type inference failed for: r5v23 */
    @Override // p000.oeb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean buildCache(@p000.yfb p000.zl9<p000.h2d> r37, @p000.yfb p000.mv8 r38, @p000.yfb p000.kb8 r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.eeb.buildCache(zl9, mv8, kb8, boolean):boolean");
    }

    @Override // p000.oeb
    public void cleanUpHits(@yfb kb8 kb8Var) {
        super.cleanUpHits(kb8Var);
        t1d t1dVar = this.f32754g;
        if (t1dVar == null) {
            return;
        }
        this.f32755h = this.f32756i;
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            h2d h2dVar = changes.get(i);
            boolean pressed = h2dVar.getPressed();
            boolean zM30659activeHoverEvent0FcD4WY = kb8Var.m30659activeHoverEvent0FcD4WY(h2dVar.m29909getIdJ3iCeTQ());
            boolean z = this.f32756i;
            if ((!pressed && !zM30659activeHoverEvent0FcD4WY) || (!pressed && !z)) {
                this.f32751d.m29687remove0FcD4WY(h2dVar.m29909getIdJ3iCeTQ());
            }
        }
        this.f32756i = false;
        this.f32757j = x1d.m33153equalsimpl0(t1dVar.m32358getType7fucELk(), x1d.f96025b.m33158getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // p000.oeb
    public void dispatchCancel() {
        f7b<eeb> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            eeb[] content = children.getContent();
            int i = 0;
            do {
                content[i].dispatchCancel();
                i++;
            } while (i < size);
        }
        InterfaceC0701e.d dVarPop = this.f32750c;
        int iM30687constructorimpl = keb.m30687constructorimpl(16);
        f7b f7bVar = null;
        while (dVarPop != 0) {
            if (dVarPop instanceof p2d) {
                ((p2d) dVarPop).onCancelPointerInput();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // p000.oeb
    public boolean dispatchFinalEventPass(@yfb kb8 kb8Var) {
        f7b<eeb> children;
        int size;
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.f32752e.isEmpty() && this.f32750c.isAttached()) {
            t1d t1dVar = this.f32754g;
            md8.checkNotNull(t1dVar);
            mv8 mv8Var = this.f32753f;
            md8.checkNotNull(mv8Var);
            long jMo30031getSizeYbymL2g = mv8Var.mo30031getSizeYbymL2g();
            InterfaceC0701e.d dVarPop = this.f32750c;
            int iM30687constructorimpl = keb.m30687constructorimpl(16);
            f7b f7bVar = null;
            while (dVarPop != 0) {
                if (dVarPop instanceof p2d) {
                    ((p2d) dVarPop).mo27219onPointerEventH0pRuoY(t1dVar, v1d.Final, jMo30031getSizeYbymL2g);
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
            if (this.f32750c.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
                eeb[] content = children.getContent();
                do {
                    content[i].dispatchFinalEventPass(kb8Var);
                    i++;
                } while (i < size);
            }
            z = true;
        }
        cleanUpHits(kb8Var);
        clearCache();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // p000.oeb
    public boolean dispatchMainEventPass(@yfb zl9<h2d> zl9Var, @yfb mv8 mv8Var, @yfb kb8 kb8Var, boolean z) {
        f7b<eeb> children;
        int size;
        if (this.f32752e.isEmpty() || !this.f32750c.isAttached()) {
            return false;
        }
        t1d t1dVar = this.f32754g;
        md8.checkNotNull(t1dVar);
        mv8 mv8Var2 = this.f32753f;
        md8.checkNotNull(mv8Var2);
        long jMo30031getSizeYbymL2g = mv8Var2.mo30031getSizeYbymL2g();
        InterfaceC0701e.d dVarPop = this.f32750c;
        int iM30687constructorimpl = keb.m30687constructorimpl(16);
        f7b f7bVar = null;
        while (dVarPop != 0) {
            if (dVarPop instanceof p2d) {
                ((p2d) dVarPop).mo27219onPointerEventH0pRuoY(t1dVar, v1d.Initial, jMo30031getSizeYbymL2g);
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
        if (this.f32750c.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
            eeb[] content = children.getContent();
            int i2 = 0;
            do {
                eeb eebVar = content[i2];
                zl9<h2d> zl9Var2 = this.f32752e;
                mv8 mv8Var3 = this.f32753f;
                md8.checkNotNull(mv8Var3);
                eebVar.dispatchMainEventPass(zl9Var2, mv8Var3, kb8Var, z);
                i2++;
            } while (i2 < size);
        }
        if (this.f32750c.isAttached()) {
            InterfaceC0701e.d dVarPop2 = this.f32750c;
            int iM30687constructorimpl2 = keb.m30687constructorimpl(16);
            f7b f7bVar2 = null;
            while (dVarPop2 != 0) {
                if (dVarPop2 instanceof p2d) {
                    ((p2d) dVarPop2).mo27219onPointerEventH0pRuoY(t1dVar, v1d.Main, jMo30031getSizeYbymL2g);
                } else if ((dVarPop2.getKindSet$ui_release() & iM30687constructorimpl2) != 0 && (dVarPop2 instanceof d44)) {
                    InterfaceC0701e.d delegate$ui_release2 = ((d44) dVarPop2).getDelegate$ui_release();
                    int i3 = 0;
                    dVarPop2 = dVarPop2;
                    while (delegate$ui_release2 != null) {
                        if ((delegate$ui_release2.getKindSet$ui_release() & iM30687constructorimpl2) != 0) {
                            i3++;
                            if (i3 == 1) {
                                dVarPop2 = delegate$ui_release2;
                            } else {
                                if (f7bVar2 == null) {
                                    f7bVar2 = new f7b(new InterfaceC0701e.d[16], 0);
                                }
                                if (dVarPop2 != 0) {
                                    f7bVar2.add(dVarPop2);
                                    dVarPop2 = 0;
                                }
                                f7bVar2.add(delegate$ui_release2);
                            }
                        }
                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                        dVarPop2 = dVarPop2;
                    }
                    if (i3 == 1) {
                    }
                }
                dVarPop2 = w34.pop(f7bVar2);
            }
        }
        return true;
    }

    @yfb
    public final InterfaceC0701e.d getModifierNode() {
        return this.f32750c;
    }

    @yfb
    public final g2d getPointerIds() {
        return this.f32751d;
    }

    public final void markIsIn() {
        this.f32756i = true;
    }

    @Override // p000.oeb
    public void removeInvalidPointerIdsAndChanges(long j, @yfb f6b<eeb> f6bVar) {
        if (this.f32751d.contains(j) && !f6bVar.contains(this)) {
            this.f32751d.remove(j);
            this.f32752e.remove(j);
        }
        f7b<eeb> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            eeb[] content = children.getContent();
            int i = 0;
            do {
                content[i].removeInvalidPointerIdsAndChanges(j, f6bVar);
                i++;
            } while (i < size);
        }
    }

    @yfb
    public String toString() {
        return "Node(pointerInputFilter=" + this.f32750c + ", children=" + getChildren() + ", pointerIds=" + this.f32751d + ')';
    }
}
