package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,843:1\n751#1,6:911\n720#1,6:917\n720#1,6:923\n728#1,3:930\n731#1,3:936\n751#1,6:939\n751#1,6:945\n697#1,8:967\n720#1,3:975\n705#1,2:978\n698#1:980\n699#1,11:1024\n723#1,3:1035\n710#1:1038\n700#1:1039\n703#1,2:1040\n720#1,3:1042\n705#1,2:1045\n708#1,2:1090\n723#1,3:1092\n710#1:1095\n720#1,6:1096\n742#1,12:1102\n754#1,3:1157\n748#1:1160\n751#1,6:1161\n736#1,18:1167\n754#1,3:1228\n748#1:1231\n739#1:1232\n697#1,8:1233\n720#1,3:1241\n705#1,2:1244\n698#1:1246\n699#1,11:1290\n723#1,3:1301\n710#1:1304\n700#1:1305\n728#1,6:1306\n42#2,7:844\n42#2,7:851\n42#2,7:858\n66#2,9:868\n66#2,9:879\n66#2,9:888\n66#2,9:898\n42#2,7:953\n42#2,7:960\n1208#3:865\n1187#3,2:866\n1187#3,2:908\n1188#3:929\n1208#3:1001\n1187#3,2:1002\n1208#3:1067\n1187#3,2:1068\n1208#3:1134\n1187#3,2:1135\n1208#3:1205\n1187#3,2:1206\n1208#3:1267\n1187#3,2:1268\n523#4:877\n523#4:878\n523#4:897\n523#4:907\n523#4:933\n728#4,2:934\n1#5:910\n76#6:951\n264#7:952\n264#7:987\n264#7:1053\n264#7:1120\n264#7:1191\n264#7:1253\n432#8,6:981\n442#8,2:988\n444#8,8:993\n452#8,9:1004\n461#8,8:1016\n432#8,6:1047\n442#8,2:1054\n444#8,8:1059\n452#8,9:1070\n461#8,8:1082\n432#8,6:1114\n442#8,2:1121\n444#8,8:1126\n452#8,9:1137\n461#8,8:1149\n432#8,6:1185\n442#8,2:1192\n444#8,8:1197\n452#8,9:1208\n461#8,8:1220\n432#8,6:1247\n442#8,2:1254\n444#8,8:1259\n452#8,9:1270\n461#8,8:1282\n245#9,3:990\n248#9,3:1013\n245#9,3:1056\n248#9,3:1079\n245#9,3:1123\n248#9,3:1146\n245#9,3:1194\n248#9,3:1217\n245#9,3:1256\n248#9,3:1279\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n222#1:911,6\n282#1:917,6\n292#1:923,6\n318#1:930,3\n318#1:936,3\n352#1:939,6\n358#1:945,6\n690#1:967,8\n690#1:975,3\n690#1:978,2\n690#1:980\n690#1:1024,11\n690#1:1035,3\n690#1:1038\n690#1:1039\n697#1:1040,2\n697#1:1042,3\n697#1:1045,2\n697#1:1090,2\n697#1:1092,3\n697#1:1095\n704#1:1096,6\n736#1:1102,12\n736#1:1157,3\n736#1:1160\n743#1:1161,6\n759#1:1167,18\n759#1:1228,3\n759#1:1231\n759#1:1232\n766#1:1233,8\n766#1:1241,3\n766#1:1244,2\n766#1:1246\n766#1:1290,11\n766#1:1301,3\n766#1:1304\n766#1:1305\n782#1:1306,6\n65#1:844,7\n73#1:851,7\n81#1:858,7\n127#1:868,9\n157#1:879,9\n158#1:888,9\n187#1:898,9\n584#1:953,7\n624#1:960,7\n117#1:865\n117#1:866,2\n199#1:908,2\n316#1:929\n690#1:1001\n690#1:1002,2\n698#1:1067\n698#1:1068,2\n737#1:1134\n737#1:1135,2\n759#1:1205\n759#1:1206,2\n766#1:1267\n766#1:1268,2\n128#1:877\n129#1:878\n179#1:897\n191#1:907\n346#1:933\n346#1:934,2\n400#1:951\n400#1:952\n690#1:987\n698#1:1053\n737#1:1120\n759#1:1191\n766#1:1253\n690#1:981,6\n690#1:988,2\n690#1:993,8\n690#1:1004,9\n690#1:1016,8\n698#1:1047,6\n698#1:1054,2\n698#1:1059,8\n698#1:1070,9\n698#1:1082,8\n737#1:1114,6\n737#1:1121,2\n737#1:1126,8\n737#1:1137,9\n737#1:1149,8\n759#1:1185,6\n759#1:1192,2\n759#1:1197,8\n759#1:1208,9\n759#1:1220,8\n766#1:1247,6\n766#1:1254,2\n766#1:1259,8\n766#1:1270,9\n766#1:1282,8\n690#1:990,3\n690#1:1013,3\n698#1:1056,3\n698#1:1079,3\n737#1:1123,3\n737#1:1146,3\n759#1:1194,3\n759#1:1217,3\n766#1:1256,3\n766#1:1279,3\n*E\n"})
@e0g(parameters = 0)
public final class feb {

    /* JADX INFO: renamed from: j */
    public static final int f36290j = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw8 f36291a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final b38 f36292b;

    /* JADX INFO: renamed from: c */
    @yfb
    public heb f36293c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final InterfaceC0701e.d f36294d;

    /* JADX INFO: renamed from: e */
    @yfb
    public InterfaceC0701e.d f36295e;

    /* JADX INFO: renamed from: f */
    @gib
    public f7b<InterfaceC0701e.c> f36296f;

    /* JADX INFO: renamed from: g */
    @gib
    public f7b<InterfaceC0701e.c> f36297g;

    /* JADX INFO: renamed from: h */
    @gib
    public C5751a f36298h;

    /* JADX INFO: renamed from: i */
    @gib
    public InterfaceC5752b f36299i;

    /* JADX INFO: renamed from: feb$a */
    @dwf({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,843:1\n523#2:844\n523#2:845\n523#2:846\n523#2:847\n523#2:848\n523#2:851\n523#2:852\n76#3:849\n264#4:850\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n415#1:844\n416#1:845\n423#1:846\n424#1:847\n449#1:848\n465#1:851\n466#1:852\n450#1:849\n450#1:850\n*E\n"})
    public final class C5751a implements qc4 {

        /* JADX INFO: renamed from: a */
        @yfb
        public InterfaceC0701e.d f36300a;

        /* JADX INFO: renamed from: b */
        public int f36301b;

        /* JADX INFO: renamed from: c */
        @yfb
        public f7b<InterfaceC0701e.c> f36302c;

        /* JADX INFO: renamed from: d */
        @yfb
        public f7b<InterfaceC0701e.c> f36303d;

        /* JADX INFO: renamed from: e */
        public boolean f36304e;

        public C5751a(@yfb InterfaceC0701e.d dVar, int i, @yfb f7b<InterfaceC0701e.c> f7bVar, @yfb f7b<InterfaceC0701e.c> f7bVar2, boolean z) {
            this.f36300a = dVar;
            this.f36301b = i;
            this.f36302c = f7bVar;
            this.f36303d = f7bVar2;
            this.f36304e = z;
        }

        @Override // p000.qc4
        public boolean areItemsTheSame(int i, int i2) {
            return geb.actionForModifiers(this.f36302c.getContent()[this.f36301b + i], this.f36303d.getContent()[this.f36301b + i2]) != 0;
        }

        @yfb
        public final f7b<InterfaceC0701e.c> getAfter() {
            return this.f36303d;
        }

        @yfb
        public final f7b<InterfaceC0701e.c> getBefore() {
            return this.f36302c;
        }

        @yfb
        public final InterfaceC0701e.d getNode() {
            return this.f36300a;
        }

        public final int getOffset() {
            return this.f36301b;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.f36304e;
        }

        @Override // p000.qc4
        public void insert(int i) {
            int i2 = this.f36301b + i;
            InterfaceC0701e.d dVar = this.f36300a;
            this.f36300a = feb.this.createAndInsertNodeAsChild(this.f36303d.getContent()[i2], dVar);
            InterfaceC5752b interfaceC5752b = feb.this.f36299i;
            if (interfaceC5752b != null) {
                interfaceC5752b.nodeInserted(i2, i2, this.f36303d.getContent()[i2], dVar, this.f36300a);
            }
            if (!this.f36304e) {
                this.f36300a.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            InterfaceC0701e.d child$ui_release = this.f36300a.getChild$ui_release();
            md8.checkNotNull(child$ui_release);
            heb coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
            md8.checkNotNull(coordinator$ui_release);
            ew8 ew8VarAsLayoutModifierNode = w34.asLayoutModifierNode(this.f36300a);
            if (ew8VarAsLayoutModifierNode != null) {
                fw8 fw8Var = new fw8(feb.this.getLayoutNode(), ew8VarAsLayoutModifierNode);
                this.f36300a.updateCoordinator$ui_release(fw8Var);
                feb.this.propagateCoordinator(this.f36300a, fw8Var);
                fw8Var.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                fw8Var.setWrapped$ui_release(coordinator$ui_release);
                coordinator$ui_release.setWrappedBy$ui_release(fw8Var);
            } else {
                this.f36300a.updateCoordinator$ui_release(coordinator$ui_release);
            }
            this.f36300a.markAsAttached$ui_release();
            this.f36300a.runAttachLifecycle$ui_release();
            leb.autoInvalidateInsertedNode(this.f36300a);
        }

        @Override // p000.qc4
        public void remove(int i, int i2) {
            InterfaceC0701e.d child$ui_release = this.f36300a.getChild$ui_release();
            md8.checkNotNull(child$ui_release);
            InterfaceC5752b interfaceC5752b = feb.this.f36299i;
            if (interfaceC5752b != null) {
                f7b<InterfaceC0701e.c> f7bVar = this.f36302c;
                interfaceC5752b.nodeRemoved(i2, f7bVar.getContent()[this.f36301b + i2], child$ui_release);
            }
            if ((keb.m30687constructorimpl(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                heb coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                md8.checkNotNull(coordinator$ui_release);
                heb wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                heb wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                md8.checkNotNull(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                feb.this.propagateCoordinator(this.f36300a, wrapped$ui_release);
            }
            this.f36300a = feb.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // p000.qc4
        public void same(int i, int i2) {
            InterfaceC0701e.d child$ui_release = this.f36300a.getChild$ui_release();
            md8.checkNotNull(child$ui_release);
            this.f36300a = child$ui_release;
            f7b<InterfaceC0701e.c> f7bVar = this.f36302c;
            InterfaceC0701e.c cVar = f7bVar.getContent()[this.f36301b + i];
            f7b<InterfaceC0701e.c> f7bVar2 = this.f36303d;
            InterfaceC0701e.c cVar2 = f7bVar2.getContent()[this.f36301b + i2];
            if (md8.areEqual(cVar, cVar2)) {
                InterfaceC5752b interfaceC5752b = feb.this.f36299i;
                if (interfaceC5752b != null) {
                    int i3 = this.f36301b;
                    interfaceC5752b.nodeReused(i3 + i, i3 + i2, cVar, cVar2, this.f36300a);
                    return;
                }
                return;
            }
            feb.this.updateNode(cVar, cVar2, this.f36300a);
            InterfaceC5752b interfaceC5752b2 = feb.this.f36299i;
            if (interfaceC5752b2 != null) {
                int i4 = this.f36301b;
                interfaceC5752b2.nodeUpdated(i4 + i, i4 + i2, cVar, cVar2, this.f36300a);
            }
        }

        public final void setAfter(@yfb f7b<InterfaceC0701e.c> f7bVar) {
            this.f36303d = f7bVar;
        }

        public final void setBefore(@yfb f7b<InterfaceC0701e.c> f7bVar) {
            this.f36302c = f7bVar;
        }

        public final void setNode(@yfb InterfaceC0701e.d dVar) {
            this.f36300a = dVar;
        }

        public final void setOffset(int i) {
            this.f36301b = i;
        }

        public final void setShouldAttachOnInsert(boolean z) {
            this.f36304e = z;
        }
    }

    /* JADX INFO: renamed from: feb$b */
    public interface InterfaceC5752b {
        void linearDiffAborted(int i, @yfb InterfaceC0701e.c cVar, @yfb InterfaceC0701e.c cVar2, @yfb InterfaceC0701e.d dVar);

        void nodeInserted(int i, int i2, @yfb InterfaceC0701e.c cVar, @yfb InterfaceC0701e.d dVar, @yfb InterfaceC0701e.d dVar2);

        void nodeRemoved(int i, @yfb InterfaceC0701e.c cVar, @yfb InterfaceC0701e.d dVar);

        void nodeReused(int i, int i2, @yfb InterfaceC0701e.c cVar, @yfb InterfaceC0701e.c cVar2, @yfb InterfaceC0701e.d dVar);

        void nodeUpdated(int i, int i2, @yfb InterfaceC0701e.c cVar, @yfb InterfaceC0701e.c cVar2, @yfb InterfaceC0701e.d dVar);
    }

    public feb(@yfb lw8 lw8Var) {
        this.f36291a = lw8Var;
        b38 b38Var = new b38(lw8Var);
        this.f36292b = b38Var;
        this.f36293c = b38Var;
        ylg tail = b38Var.getTail();
        this.f36294d = tail;
        this.f36295e = tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0701e.d createAndInsertNodeAsChild(InterfaceC0701e.c cVar, InterfaceC0701e.d dVar) {
        InterfaceC0701e.d dp0Var;
        if (cVar instanceof sxa) {
            dp0Var = ((sxa) cVar).create();
            dp0Var.setKindSet$ui_release(leb.calculateNodeKindSetFromIncludingDelegates(dp0Var));
        } else {
            dp0Var = new dp0(cVar);
        }
        if (dp0Var.isAttached()) {
            g28.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        dp0Var.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(dp0Var, dVar);
    }

    private final InterfaceC0701e.d createAndInsertNodeAsParent(InterfaceC0701e.c cVar, InterfaceC0701e.d dVar) {
        InterfaceC0701e.d dp0Var;
        if (cVar instanceof sxa) {
            dp0Var = ((sxa) cVar).create();
            dp0Var.setKindSet$ui_release(leb.calculateNodeKindSetFromIncludingDelegates(dp0Var));
        } else {
            dp0Var = new dp0(cVar);
        }
        if (dp0Var.isAttached()) {
            g28.throwIllegalStateException("createAndInsertNodeAsParent called on an attached node");
        }
        dp0Var.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertParent(dp0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0701e.d detachAndRemoveNode(InterfaceC0701e.d dVar) {
        if (dVar.isAttached()) {
            leb.autoInvalidateRemovedNode(dVar);
            dVar.runDetachLifecycle$ui_release();
            dVar.markAsDetached$ui_release();
        }
        return removeNode(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.f36295e.getAggregateChildKindSet$ui_release();
    }

    private final C5751a getDiffer(InterfaceC0701e.d dVar, int i, f7b<InterfaceC0701e.c> f7bVar, f7b<InterfaceC0701e.c> f7bVar2, boolean z) {
        C5751a c5751a = this.f36298h;
        if (c5751a == null) {
            C5751a c5751a2 = new C5751a(dVar, i, f7bVar, f7bVar2, z);
            this.f36298h = c5751a2;
            return c5751a2;
        }
        c5751a.setNode(dVar);
        c5751a.setOffset(i);
        c5751a.setBefore(f7bVar);
        c5751a.setAfter(f7bVar2);
        c5751a.setShouldAttachOnInsert(z);
        return c5751a;
    }

    private final InterfaceC0701e.d insertChild(InterfaceC0701e.d dVar, InterfaceC0701e.d dVar2) {
        InterfaceC0701e.d child$ui_release = dVar2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(dVar);
            dVar.setChild$ui_release(child$ui_release);
        }
        dVar2.setChild$ui_release(dVar);
        dVar.setParent$ui_release(dVar2);
        return dVar;
    }

    private final InterfaceC0701e.d insertParent(InterfaceC0701e.d dVar, InterfaceC0701e.d dVar2) {
        InterfaceC0701e.d parent$ui_release = dVar2.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(dVar);
            dVar.setParent$ui_release(parent$ui_release);
        }
        dVar2.setParent$ui_release(dVar);
        dVar.setChild$ui_release(dVar2);
        return dVar;
    }

    private final boolean isUpdating() {
        return this.f36295e == geb.f39621a;
    }

    private final InterfaceC0701e.d padChain() {
        if (!(this.f36295e != geb.f39621a)) {
            g28.throwIllegalStateException("padChain called on already padded chain");
        }
        InterfaceC0701e.d dVar = this.f36295e;
        dVar.setParent$ui_release(geb.f39621a);
        geb.f39621a.setChild$ui_release(dVar);
        return geb.f39621a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(InterfaceC0701e.d dVar, heb hebVar) {
        for (InterfaceC0701e.d parent$ui_release = dVar.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release == geb.f39621a) {
                lw8 parent$ui_release2 = this.f36291a.getParent$ui_release();
                hebVar.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
                this.f36293c = hebVar;
                return;
            } else {
                if ((keb.m30687constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(hebVar);
            }
        }
    }

    private final InterfaceC0701e.d removeNode(InterfaceC0701e.d dVar) {
        InterfaceC0701e.d child$ui_release = dVar.getChild$ui_release();
        InterfaceC0701e.d parent$ui_release = dVar.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            dVar.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            dVar.setParent$ui_release(null);
        }
        md8.checkNotNull(parent$ui_release);
        return parent$ui_release;
    }

    private final void structuralUpdate(int i, f7b<InterfaceC0701e.c> f7bVar, f7b<InterfaceC0701e.c> f7bVar2, InterfaceC0701e.d dVar, boolean z) {
        g8b.executeDiff(f7bVar.getSize() - i, f7bVar2.getSize() - i, getDiffer(dVar, i, f7bVar, f7bVar2, z));
        syncAggregateChildKindSet();
    }

    private final void syncAggregateChildKindSet() {
        int kindSet$ui_release = 0;
        for (InterfaceC0701e.d parent$ui_release = this.f36294d.getParent$ui_release(); parent$ui_release != null && parent$ui_release != geb.f39621a; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            kindSet$ui_release |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(kindSet$ui_release);
        }
    }

    private final InterfaceC0701e.d trimChain(InterfaceC0701e.d dVar) {
        if (!(dVar == geb.f39621a)) {
            g28.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        InterfaceC0701e.d child$ui_release = geb.f39621a.getChild$ui_release();
        if (child$ui_release == null) {
            child$ui_release = this.f36294d;
        }
        child$ui_release.setParent$ui_release(null);
        geb.f39621a.setChild$ui_release(null);
        geb.f39621a.setAggregateChildKindSet$ui_release(-1);
        geb.f39621a.updateCoordinator$ui_release(null);
        if (!(child$ui_release != geb.f39621a)) {
            g28.throwIllegalStateException("trimChain did not update the head");
        }
        return child$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(InterfaceC0701e.c cVar, InterfaceC0701e.c cVar2, InterfaceC0701e.d dVar) {
        if ((cVar instanceof sxa) && (cVar2 instanceof sxa)) {
            geb.updateUnsafe((sxa) cVar2, dVar);
            if (dVar.isAttached()) {
                leb.autoInvalidateUpdatedNode(dVar);
                return;
            } else {
                dVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(dVar instanceof dp0)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((dp0) dVar).setElement(cVar2);
        if (dVar.isAttached()) {
            leb.autoInvalidateUpdatedNode(dVar);
        } else {
            dVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    /* JADX INFO: renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m28909firstFromHeadaLcG6gQ$ui_release(int i, qy6<? super T, Boolean> qy6Var) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (InterfaceC0701e.d head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (InterfaceC0701e.d dVarPop = head$ui_release; dVarPop != null; dVarPop = w34.pop(null)) {
                        md8.reifiedOperationMarker(3, "T");
                        if (qy6Var.invoke(dVarPop).booleanValue()) {
                            return dVarPop;
                        }
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @yfb
    public final InterfaceC0701e.d getHead$ui_release() {
        return this.f36295e;
    }

    @yfb
    public final b38 getInnerCoordinator$ui_release() {
        return this.f36292b;
    }

    @yfb
    public final lw8 getLayoutNode() {
        return this.f36291a;
    }

    @yfb
    public final List<dxa> getModifierInfo() {
        f7b<InterfaceC0701e.c> f7bVar = this.f36296f;
        if (f7bVar == null) {
            return l82.emptyList();
        }
        int i = 0;
        f7b f7bVar2 = new f7b(new dxa[f7bVar.getSize()], 0);
        InterfaceC0701e.d head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            heb coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            y9c layer = coordinator$ui_release.getLayer();
            y9c layer2 = this.f36292b.getLayer();
            InterfaceC0701e.d child$ui_release = head$ui_release.getChild$ui_release();
            if (child$ui_release != this.f36294d || head$ui_release.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            f7bVar2.add(new dxa(f7bVar.getContent()[i], coordinator$ui_release, layer));
            head$ui_release = head$ui_release.getChild$ui_release();
            i++;
        }
        return f7bVar2.asMutableList();
    }

    @yfb
    public final heb getOuterCoordinator$ui_release() {
        return this.f36293c;
    }

    @yfb
    public final InterfaceC0701e.d getTail$ui_release() {
        return this.f36294d;
    }

    public final boolean has$ui_release(int i) {
        return (i & getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m28910hasH91voCI$ui_release(int i) {
        return (i & getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m28911headH91voCI$ui_release(int i) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return null;
        }
        for (Object obj = (T) getHead$ui_release(); obj != null; obj = (T) ((InterfaceC0701e.d) obj).getChild$ui_release()) {
            if ((((InterfaceC0701e.d) obj).getKindSet$ui_release() & i) != 0) {
                md8.reifiedOperationMarker(3, "T");
                return (T) obj;
            }
            if ((((InterfaceC0701e.d) obj).getAggregateChildKindSet$ui_release() & i) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int i, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return;
        }
        for (InterfaceC0701e.d head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                qy6Var.invoke(head$ui_release);
            }
            if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m28912headToTailaLcG6gQ$ui_release(int i, qy6<? super T, bth> qy6Var) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (InterfaceC0701e.d head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (InterfaceC0701e.d dVarPop = head$ui_release; dVarPop != null; dVarPop = w34.pop(null)) {
                        md8.reifiedOperationMarker(3, "T");
                        qy6Var.invoke(dVarPop);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        for (InterfaceC0701e.d head$ui_release = getHead$ui_release(); head$ui_release != null && head$ui_release != getTail$ui_release(); head$ui_release = head$ui_release.getChild$ui_release()) {
            qy6Var.invoke(head$ui_release);
        }
    }

    public final void markAsAttached() {
        for (InterfaceC0701e.d head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (InterfaceC0701e.d tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        for (InterfaceC0701e.d tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        for (InterfaceC0701e.d head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                leb.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                leb.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (InterfaceC0701e.d tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
    }

    public final void syncCoordinators() {
        heb fw8Var;
        heb hebVar = this.f36292b;
        for (InterfaceC0701e.d parent$ui_release = this.f36294d.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            ew8 ew8VarAsLayoutModifierNode = w34.asLayoutModifierNode(parent$ui_release);
            if (ew8VarAsLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    heb coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    md8.checkNotNull(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    fw8Var = (fw8) coordinator$ui_release;
                    ew8 layoutModifierNode = fw8Var.getLayoutModifierNode();
                    fw8Var.setLayoutModifierNode$ui_release(ew8VarAsLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        fw8Var.onLayoutModifierNodeChanged();
                    }
                } else {
                    fw8Var = new fw8(this.f36291a, ew8VarAsLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(fw8Var);
                }
                hebVar.setWrappedBy$ui_release(fw8Var);
                fw8Var.setWrapped$ui_release(hebVar);
                hebVar = fw8Var;
            } else {
                parent$ui_release.updateCoordinator$ui_release(hebVar);
            }
        }
        lw8 parent$ui_release2 = this.f36291a.getParent$ui_release();
        hebVar.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.f36293c = hebVar;
    }

    /* JADX INFO: renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m28913tailH91voCI$ui_release(int i) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return null;
        }
        for (Object obj = (T) getTail$ui_release(); obj != null; obj = (T) ((InterfaceC0701e.d) obj).getParent$ui_release()) {
            if ((((InterfaceC0701e.d) obj).getKindSet$ui_release() & i) != 0) {
                md8.reifiedOperationMarker(3, "T");
                return (T) obj;
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int i, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return;
        }
        for (InterfaceC0701e.d tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((tail$ui_release.getKindSet$ui_release() & i) != 0) {
                qy6Var.invoke(tail$ui_release);
            }
        }
    }

    /* JADX INFO: renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m28914tailToHeadaLcG6gQ$ui_release(int i, qy6<? super T, bth> qy6Var) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (InterfaceC0701e.d tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (InterfaceC0701e.d dVarPop = tail$ui_release; dVarPop != null; dVarPop = w34.pop(null)) {
                        md8.reifiedOperationMarker(3, "T");
                        qy6Var.invoke(dVarPop);
                    }
                }
            }
        }
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f36295e == this.f36294d) {
            sb.append("]");
        } else {
            InterfaceC0701e.d head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.f36294d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void updateFrom$ui_release(@yfb InterfaceC0701e interfaceC0701e) {
        InterfaceC5752b interfaceC5752b;
        InterfaceC0701e.d dVarPadChain = padChain();
        f7b<InterfaceC0701e.c> f7bVar = this.f36296f;
        int i = 0;
        int size = f7bVar != null ? f7bVar.getSize() : 0;
        f7b<InterfaceC0701e.c> f7bVar2 = this.f36297g;
        if (f7bVar2 == null) {
            f7bVar2 = new f7b<>(new InterfaceC0701e.c[16], 0);
        }
        f7b<InterfaceC0701e.c> f7bVarFillVector = geb.fillVector(interfaceC0701e, f7bVar2);
        f7b<InterfaceC0701e.c> f7bVar3 = null;
        if (f7bVarFillVector.getSize() == size) {
            InterfaceC0701e.d child$ui_release = dVarPadChain.getChild$ui_release();
            int i2 = 0;
            while (true) {
                if (child$ui_release == null || i2 >= size) {
                    break;
                }
                if (f7bVar == null) {
                    g28.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new us8();
                }
                InterfaceC0701e.c cVar = f7bVar.getContent()[i2];
                InterfaceC0701e.c cVar2 = f7bVarFillVector.getContent()[i2];
                int iActionForModifiers = geb.actionForModifiers(cVar, cVar2);
                if (iActionForModifiers != 0) {
                    if (iActionForModifiers == 1) {
                        updateNode(cVar, cVar2, child$ui_release);
                        InterfaceC5752b interfaceC5752b2 = this.f36299i;
                        if (interfaceC5752b2 != null) {
                            interfaceC5752b2.nodeUpdated(i2, i2, cVar, cVar2, child$ui_release);
                        }
                    } else if (iActionForModifiers == 2 && (interfaceC5752b = this.f36299i) != null) {
                        interfaceC5752b.nodeReused(i2, i2, cVar, cVar2, child$ui_release);
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                    i2++;
                } else {
                    InterfaceC5752b interfaceC5752b3 = this.f36299i;
                    if (interfaceC5752b3 != null) {
                        interfaceC5752b3.linearDiffAborted(i2, cVar, cVar2, child$ui_release);
                    }
                    child$ui_release = child$ui_release.getParent$ui_release();
                }
            }
            InterfaceC0701e.d dVar = child$ui_release;
            if (i2 < size) {
                if (f7bVar == null) {
                    g28.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new us8();
                }
                if (dVar == null) {
                    g28.throwIllegalStateExceptionForNullCheck("structuralUpdate requires a non-null tail");
                    throw new us8();
                }
                structuralUpdate(i2, f7bVar, f7bVarFillVector, dVar, !this.f36291a.getApplyingModifierOnAttach$ui_release());
                i = 1;
            }
        } else {
            if (this.f36291a.getApplyingModifierOnAttach$ui_release() && size == 0) {
                InterfaceC0701e.d dVar2 = dVarPadChain;
                while (i < f7bVarFillVector.getSize()) {
                    InterfaceC0701e.c cVar3 = f7bVarFillVector.getContent()[i];
                    InterfaceC0701e.d dVarCreateAndInsertNodeAsChild = createAndInsertNodeAsChild(cVar3, dVar2);
                    InterfaceC5752b interfaceC5752b4 = this.f36299i;
                    if (interfaceC5752b4 != null) {
                        interfaceC5752b4.nodeInserted(0, i, cVar3, dVar2, dVarCreateAndInsertNodeAsChild);
                    }
                    i++;
                    dVar2 = dVarCreateAndInsertNodeAsChild;
                }
                syncAggregateChildKindSet();
            } else if (f7bVarFillVector.getSize() != 0) {
                if (f7bVar == null) {
                    f7bVar = new f7b<>(new InterfaceC0701e.c[16], 0);
                }
                structuralUpdate(0, f7bVar, f7bVarFillVector, dVarPadChain, !this.f36291a.getApplyingModifierOnAttach$ui_release());
            } else {
                if (f7bVar == null) {
                    g28.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new us8();
                }
                InterfaceC0701e.d child$ui_release2 = dVarPadChain.getChild$ui_release();
                for (int i3 = 0; child$ui_release2 != null && i3 < f7bVar.getSize(); i3++) {
                    InterfaceC5752b interfaceC5752b5 = this.f36299i;
                    if (interfaceC5752b5 != null) {
                        interfaceC5752b5.nodeRemoved(i3, f7bVar.getContent()[i3], child$ui_release2);
                    }
                    child$ui_release2 = detachAndRemoveNode(child$ui_release2).getChild$ui_release();
                }
                b38 b38Var = this.f36292b;
                lw8 parent$ui_release = this.f36291a.getParent$ui_release();
                b38Var.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
                this.f36293c = this.f36292b;
            }
            i = 1;
        }
        this.f36296f = f7bVarFillVector;
        if (f7bVar != null) {
            f7bVar.clear();
            f7bVar3 = f7bVar;
        }
        this.f36297g = f7bVar3;
        this.f36295e = trimChain(dVarPadChain);
        if (i != 0) {
            syncCoordinators();
        }
    }

    public final void useLogger$ui_release(@gib InterfaceC5752b interfaceC5752b) {
        this.f36299i = interfaceC5752b;
    }

    public final void tailToHead$ui_release(@yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        for (InterfaceC0701e.d tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            qy6Var.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(@yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        for (InterfaceC0701e.d head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            qy6Var.invoke(head$ui_release);
        }
    }
}
