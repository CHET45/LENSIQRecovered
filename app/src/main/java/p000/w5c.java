package p000;

import java.util.ArrayList;
import java.util.List;
import p000.ssd;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class w5c {

    /* JADX INFO: renamed from: c */
    public static final int f93294c = 0;

    /* JADX INFO: renamed from: a */
    public final int f93295a;

    /* JADX INFO: renamed from: b */
    public final int f93296b;

    /* JADX INFO: renamed from: w5c$a */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,990:1\n116#1:991\n116#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n119#1:991\n128#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14398a extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14398a f93297d = new C14398a();

        /* JADX INFO: renamed from: e */
        public static final int f93298e = 0;

        private C14398a() {
            super(1, 0, 2, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.advanceBy(a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getDistance-jn0FJLE, reason: not valid java name */
        public final int m32879getDistancejn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "distance" : super.mo32877intParamNamew8GmfQM(i);
        }
    }

    /* JADX INFO: renamed from: w5c$a0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,990:1\n135#1:991\n135#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n138#1:991\n147#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14399a0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14399a0 f93299d = new C14399a0();

        /* JADX INFO: renamed from: e */
        public static final int f93300e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14399a0() {
            int i = 1;
            super(0, i, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            dydVar.sideEffect((ny6) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m32880getEffectHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "effect" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$b */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n1#1,990:1\n169#1:991\n170#1:992\n169#1:993\n170#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n173#1:991\n174#1:992\n183#1:993\n184#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14400b extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14400b f93301d = new C14400b();

        /* JADX INFO: renamed from: e */
        public static final int f93302e = 0;

        private C14400b() {
            super(0, 2, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            C5897fo c5897fo = (C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            Object objMo27191getObject31yXWZQ = a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            if (objMo27191getObject31yXWZQ instanceof fyd) {
                dydVar.remembering(((fyd) objMo27191getObject31yXWZQ).getWrapped());
            }
            prfVar.appendSlot(c5897fo, objMo27191getObject31yXWZQ);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32881getAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m32882getValueHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "anchor" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "value" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$b0 */
    @e0g(parameters = 1)
    public static final class C14401b0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14401b0 f93303d = new C14401b0();

        /* JADX INFO: renamed from: e */
        public static final int f93304e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14401b0() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: w5c$c */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,990:1\n788#1:991\n789#1:992\n789#1:993\n788#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n792#1:991\n793#1:992\n802#1:993\n804#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14402c extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14402c f93305d = new C14402c();

        /* JADX INFO: renamed from: e */
        public static final int f93306e = 0;

        private C14402c() {
            super(0, 2, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            n78 n78Var = (n78) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            int element = n78Var != null ? n78Var.getElement() : 0;
            wt1 wt1Var = (wt1) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            if (element > 0) {
                p40Var = new jzb(p40Var, element);
            }
            wt1Var.executeAndFlushAllPendingChanges(p40Var, prfVar, dydVar);
        }

        /* JADX INFO: renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m32883getChangesHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m32884getEffectiveNodeIndexHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "changes" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "effectiveNodeIndex" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$c0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n1#2:991\n*E\n"})
    @e0g(parameters = 0)
    public static final class C14403c0 extends w5c {

        /* JADX INFO: renamed from: g */
        public static final int f93307g = 8;

        /* JADX INFO: renamed from: d */
        @yfb
        public final kz6<p40<?>, prf, dyd, bth> f93308d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final List<C14424q> f93309e;

        /* JADX INFO: renamed from: f */
        @yfb
        public final List<C14427t<Object>> f93310f;

        /* JADX INFO: renamed from: w5c$c0$a */
        public static final class a extends tt8 implements kz6<p40<?>, prf, dyd, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f93311a = new a();

            public a() {
                super(3);
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ bth invoke(p40<?> p40Var, prf prfVar, dyd dydVar) {
                invoke2(p40Var, prfVar, dydVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            }
        }

        @dpg
        public C14403c0() {
            this(0, 0, null, 7, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            this.f93308d.invoke(p40Var, prfVar, dydVar);
        }

        @yfb
        public final kz6<p40<?>, prf, dyd, bth> getBlock() {
            return this.f93308d;
        }

        @yfb
        public final List<C14424q> getIntParams() {
            return this.f93309e;
        }

        @yfb
        public final List<C14427t<Object>> getObjParams() {
            return this.f93310f;
        }

        @Override // p000.w5c
        @yfb
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + System.identityHashCode(this);
        }

        public /* synthetic */ C14403c0(int i, int i2, kz6 kz6Var, int i3, jt3 jt3Var) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? a.f93311a : kz6Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dpg
        public C14403c0(int i, int i2, @yfb kz6<? super p40<?>, ? super prf, ? super dyd, bth> kz6Var) {
            super(i, i2, null);
            this.f93308d = kz6Var;
            ArrayList arrayList = new ArrayList(i);
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(C14424q.m32915boximpl(C14424q.m32916constructorimpl(i3)));
            }
            this.f93309e = arrayList;
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList2.add(C14427t.m32926boximpl(C14427t.m32927constructorimpl(i4)));
            }
            this.f93310f = arrayList2;
        }
    }

    /* JADX INFO: renamed from: w5c$d */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,990:1\n674#1:991\n675#1:992\n674#1:993\n675#1:994\n64#2,6:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n678#1:991\n679#1:992\n688#1:993\n689#1:994\n691#1:995,6\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14404d extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14404d f93312d = new C14404d();

        /* JADX INFO: renamed from: e */
        public static final int f93313e = 0;

        private C14404d() {
            super(0, 2, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            int element = ((n78) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0))).getElement();
            List list = (List) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                md8.checkNotNull(p40Var, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i2 = element + i;
                p40Var.insertBottomUp(i2, obj);
                p40Var.insertTopDown(i2, obj);
            }
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m32885getEffectiveNodeIndexHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m32886getNodesHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "effectiveNodeIndex" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "nodes" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$d0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1#1,990:1\n193#1:991\n193#1:992\n1871#2,6:993\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n*L\n196#1:991\n205#1:992\n207#1:993,6\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14405d0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14405d0 f93314d = new C14405d0();

        /* JADX INFO: renamed from: e */
        public static final int f93315e = 0;

        private C14405d0() {
            super(1, 0, 2, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            int iMo27190getIntw8GmfQM = a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0));
            int slotsSize = prfVar.getSlotsSize();
            int parent = prfVar.getParent();
            int iSlotsStartIndex$runtime_release = prfVar.slotsStartIndex$runtime_release(parent);
            int iSlotsEndIndex$runtime_release = prfVar.slotsEndIndex$runtime_release(parent);
            for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - iMo27190getIntw8GmfQM); iMax < iSlotsEndIndex$runtime_release; iMax++) {
                Object obj = prfVar.f71751c[prfVar.dataIndexToDataAddress(iMax)];
                if (obj instanceof fyd) {
                    dydVar.forgetting(((fyd) obj).getWrapped(), slotsSize - iMax, -1, -1);
                } else if (obj instanceof ssd) {
                    ((ssd) obj).release();
                }
            }
            prfVar.trimTailSlots(iMo27190getIntw8GmfQM);
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m32887getCountjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "count" : super.mo32877intParamNamew8GmfQM(i);
        }
    }

    /* JADX INFO: renamed from: w5c$e */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,990:1\n701#1:991\n702#1:992\n703#1:993\n704#1:994\n703#1:995\n704#1:996\n702#1:997\n701#1:998\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n707#1:991\n708#1:992\n709#1:993\n710#1:994\n719#1:995\n720#1:996\n722#1:997\n724#1:998\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14406e extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14406e f93316d = new C14406e();

        /* JADX INFO: renamed from: e */
        public static final int f93317e = 0;

        private C14406e() {
            super(0, 4, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            i0b i0bVar = (i0b) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(2));
            i0b i0bVar2 = (i0b) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(3));
            dn2 dn2Var = (dn2) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            h0b h0bVarMovableContentStateResolve$runtime_release = (h0b) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            if (h0bVarMovableContentStateResolve$runtime_release == null && (h0bVarMovableContentStateResolve$runtime_release = dn2Var.movableContentStateResolve$runtime_release(i0bVar)) == null) {
                gm2.composeRuntimeError("Could not resolve state for movable content");
                throw new us8();
            }
            List<C5897fo> listMoveIntoGroupFrom = prfVar.moveIntoGroupFrom(1, h0bVarMovableContentStateResolve$runtime_release.getSlotTable$runtime_release(), 2);
            ssd.C12768a c12768a = ssd.f82774i;
            sz2 composition$runtime_release = i0bVar2.getComposition$runtime_release();
            md8.checkNotNull(composition$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            c12768a.adoptAnchoredScopes$runtime_release(prfVar, listMoveIntoGroupFrom, (vsd) composition$runtime_release);
        }

        /* JADX INFO: renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m32888getFromHpuvwBQ() {
            return C14427t.m32927constructorimpl(2);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m32889getParentCompositionContextHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        /* JADX INFO: renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m32890getResolvedStateHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m32891getToHpuvwBQ() {
            return C14427t.m32927constructorimpl(3);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "resolvedState" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "resolvedCompositionContext" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(2)) ? ymh.InterfaceC15729h.f102263c : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(3)) ? "to" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$e0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,990:1\n264#1:991\n262#1:992\n263#1:993\n262#1:994\n263#1:995\n264#1:996\n4184#2,8:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n*L\n267#1:991\n272#1:992\n273#1:993\n282#1:994\n283#1:995\n284#1:996\n293#1:997,8\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14407e0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14407e0 f93318d = new C14407e0();

        /* JADX INFO: renamed from: e */
        public static final int f93319e = 0;

        private C14407e0() {
            super(1, 2, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            int iAnchorIndex;
            int slotsSize;
            Object objMo27191getObject31yXWZQ = a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            C5897fo c5897fo = (C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            int iMo27190getIntw8GmfQM = a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0));
            if (objMo27191getObject31yXWZQ instanceof fyd) {
                dydVar.remembering(((fyd) objMo27191getObject31yXWZQ).getWrapped());
            }
            int iAnchorIndex2 = prfVar.anchorIndex(c5897fo);
            Object obj = prfVar.set(iAnchorIndex2, iMo27190getIntw8GmfQM, objMo27191getObject31yXWZQ);
            if (!(obj instanceof fyd)) {
                if (obj instanceof ssd) {
                    ((ssd) obj).release();
                    return;
                }
                return;
            }
            int slotsSize2 = prfVar.getSlotsSize() - prfVar.slotIndexOfGroupSlotIndex(iAnchorIndex2, iMo27190getIntw8GmfQM);
            fyd fydVar = (fyd) obj;
            C5897fo after = fydVar.getAfter();
            if (after == null || !after.getValid()) {
                iAnchorIndex = -1;
                slotsSize = -1;
            } else {
                iAnchorIndex = prfVar.anchorIndex(after);
                slotsSize = prfVar.getSlotsSize() - prfVar.slotsEndAllIndex$runtime_release(iAnchorIndex);
            }
            dydVar.forgetting(fydVar.getWrapped(), slotsSize2, iAnchorIndex, slotsSize);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32892getAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        /* JADX INFO: renamed from: getGroupSlotIndex-jn0FJLE, reason: not valid java name */
        public final int m32893getGroupSlotIndexjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m32894getValueHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "groupSlotIndex" : super.mo32877intParamNamew8GmfQM(i);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "value" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "anchor" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$f */
    @e0g(parameters = 1)
    public static final class C14408f extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14408f f93320d = new C14408f();

        /* JADX INFO: renamed from: e */
        public static final int f93321e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14408f() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            gm2.deactivateCurrentGroup(prfVar, dydVar);
        }
    }

    /* JADX INFO: renamed from: w5c$f0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,990:1\n310#1:991\n310#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n313#1:991\n322#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14409f0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14409f0 f93322d = new C14409f0();

        /* JADX INFO: renamed from: e */
        public static final int f93323e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14409f0() {
            int i = 1;
            super(0, i, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.updateAux(a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m32895getDataHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "data" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$g */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,990:1\n646#1:991\n647#1:992\n646#1:993\n647#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n650#1:991\n651#1:992\n661#1:993\n665#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14410g extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14410g f93324d = new C14410g();

        /* JADX INFO: renamed from: e */
        public static final int f93325e = 0;

        private C14410g() {
            super(0, 2, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            n78 n78Var = (n78) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            C5897fo c5897fo = (C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            md8.checkNotNull(p40Var, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            n78Var.setElement(g6c.positionToInsert(prfVar, c5897fo, p40Var));
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32896getAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m32897getEffectiveNodeIndexOutHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "effectiveNodeIndexOut" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "anchor" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$g0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,990:1\n433#1:991\n434#1:992\n433#1:993\n434#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n437#1:991\n438#1:992\n447#1:993\n448#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14411g0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14411g0 f93326d = new C14411g0();

        /* JADX INFO: renamed from: e */
        public static final int f93327e = 0;

        private C14411g0() {
            super(0, 2, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            ((gz6) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1))).invoke(p40Var.getCurrent(), a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m32898getBlockHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m32899getValueHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "value" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "block" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$h */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,990:1\n94#1:991\n94#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n97#1:991\n108#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14412h extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14412h f93328d = new C14412h();

        /* JADX INFO: renamed from: e */
        public static final int f93329e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14412h() {
            int i = 1;
            super(0, i, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            md8.checkNotNull(p40Var, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0))) {
                p40Var.down(obj);
            }
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m32900getNodesHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "nodes" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$h0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n1#1,990:1\n224#1:991\n223#1:992\n223#1:993\n224#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n227#1:991\n232#1:992\n241#1:993\n242#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14413h0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14413h0 f93330d = new C14413h0();

        /* JADX INFO: renamed from: e */
        public static final int f93331e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14413h0() {
            int i = 1;
            super(i, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            Object objMo27191getObject31yXWZQ = a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            int iMo27190getIntw8GmfQM = a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0));
            if (objMo27191getObject31yXWZQ instanceof fyd) {
                dydVar.remembering(((fyd) objMo27191getObject31yXWZQ).getWrapped());
            }
            Object obj = prfVar.set(iMo27190getIntw8GmfQM, objMo27191getObject31yXWZQ);
            if (obj instanceof fyd) {
                dydVar.forgetting(((fyd) obj).getWrapped(), prfVar.getSlotsSize() - prfVar.slotIndexOfGroupSlotIndex(prfVar.getCurrentGroup(), iMo27190getIntw8GmfQM), -1, -1);
            } else if (obj instanceof ssd) {
                ((ssd) obj).release();
            }
        }

        /* JADX INFO: renamed from: getGroupSlotIndex-jn0FJLE, reason: not valid java name */
        public final int m32901getGroupSlotIndexjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m32902getValueHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "groupSlotIndex" : super.mo32877intParamNamew8GmfQM(i);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "value" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$i */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,990:1\n401#1:991\n402#1:992\n401#1:993\n402#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n405#1:991\n406#1:992\n415#1:993\n416#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14414i extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14414i f93332d = new C14414i();

        /* JADX INFO: renamed from: e */
        public static final int f93333e = 0;

        private C14414i() {
            super(0, 2, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            ((qy6) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0))).invoke((cn2) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1)));
        }

        /* JADX INFO: renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m32903getActionHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m32904getCompositionHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "anchor" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "composition" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$i0 */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n77#1:991\n77#1:992\n1#2:993\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n80#1:991\n89#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14415i0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14415i0 f93334d = new C14415i0();

        /* JADX INFO: renamed from: e */
        public static final int f93335e = 0;

        private C14415i0() {
            super(1, 0, 2, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            int iMo27190getIntw8GmfQM = a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0));
            for (int i = 0; i < iMo27190getIntw8GmfQM; i++) {
                p40Var.mo14389up();
            }
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m32905getCountjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "count" : super.mo32877intParamNamew8GmfQM(i);
        }
    }

    /* JADX INFO: renamed from: w5c$j */
    @e0g(parameters = 1)
    public static final class C14416j extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14416j f93336d = new C14416j();

        /* JADX INFO: renamed from: e */
        public static final int f93337e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14416j() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.endGroup();
        }
    }

    /* JADX INFO: renamed from: w5c$j0 */
    @e0g(parameters = 1)
    public static final class C14417j0 extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14417j0 f93338d = new C14417j0();

        /* JADX INFO: renamed from: e */
        public static final int f93339e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14417j0() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            Object current = p40Var.getCurrent();
            md8.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((pl2) current).onReuse();
        }
    }

    /* JADX INFO: renamed from: w5c$k */
    @e0g(parameters = 1)
    public static final class C14418k extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14418k f93340d = new C14418k();

        /* JADX INFO: renamed from: e */
        public static final int f93341e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14418k() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            md8.checkNotNull(p40Var, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            g6c.positionToParentOf(prfVar, p40Var, 0);
            prfVar.endGroup();
        }
    }

    /* JADX INFO: renamed from: w5c$l */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,990:1\n337#1:991\n337#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n340#1:991\n349#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14419l extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14419l f93342d = new C14419l();

        /* JADX INFO: renamed from: e */
        public static final int f93343e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14419l() {
            int i = 1;
            super(0, i, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.ensureStarted((C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32906getAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "anchor" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$m */
    @e0g(parameters = 1)
    public static final class C14420m extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14420m f93344d = new C14420m();

        /* JADX INFO: renamed from: e */
        public static final int f93345e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14420m() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.ensureStarted(0);
        }
    }

    /* JADX INFO: renamed from: w5c$n */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,990:1\n564#1:991\n563#1:992\n565#1:993\n563#1:994\n565#1:995\n564#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n568#1:991\n573#1:992\n574#1:993\n583#1:994\n584#1:995\n585#1:996\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14421n extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14421n f93346d = new C14421n();

        /* JADX INFO: renamed from: e */
        public static final int f93347e = 0;

        private C14421n() {
            super(1, 2, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            Object objInvoke = ((ny6) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0))).invoke();
            C5897fo c5897fo = (C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            int iMo27190getIntw8GmfQM = a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0));
            md8.checkNotNull(p40Var, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            prfVar.updateNode(c5897fo, objInvoke);
            p40Var.insertTopDown(iMo27190getIntw8GmfQM, objInvoke);
            p40Var.down(objInvoke);
        }

        /* JADX INFO: renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m32907getFactoryHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32908getGroupAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        /* JADX INFO: renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m32909getInsertIndexjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "insertIndex" : super.mo32877intParamNamew8GmfQM(i);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "factory" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "groupAnchor" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$o */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,990:1\n501#1:991\n502#1:992\n502#1:993\n501#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n505#1:991\n506#1:992\n515#1:993\n516#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14422o extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14422o f93348d = new C14422o();

        /* JADX INFO: renamed from: e */
        public static final int f93349e = 0;

        private C14422o() {
            super(0, 2, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            mrf mrfVar = (mrf) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            C5897fo c5897fo = (C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            prfVar.beginInsert();
            prfVar.moveFrom(mrfVar, c5897fo.toIndexFor(mrfVar), false);
            prfVar.endInsert();
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32910getAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m32911getFromSlotTableHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "anchor" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? ymh.InterfaceC15729h.f102263c : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$p */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n529#1:991\n530#1:992\n531#1:993\n530#1:994\n529#1:995\n531#1:996\n174#2,5:997\n180#2,3:1003\n1#3:1002\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n534#1:991\n535#1:992\n536#1:993\n545#1:994\n546#1:995\n547#1:996\n549#1:997,5\n549#1:1003,3\n549#1:1002\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14423p extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14423p f93350d = new C14423p();

        /* JADX INFO: renamed from: e */
        public static final int f93351e = 0;

        private C14423p() {
            super(0, 3, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            mrf mrfVar = (mrf) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1));
            C5897fo c5897fo = (C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            l26 l26Var = (l26) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(2));
            prf prfVarOpenWriter = mrfVar.openWriter();
            try {
                l26Var.executeAndFlushAllPendingFixups(p40Var, prfVarOpenWriter, dydVar);
                bth bthVar = bth.f14751a;
                prfVarOpenWriter.close(true);
                prfVar.beginInsert();
                prfVar.moveFrom(mrfVar, c5897fo.toIndexFor(mrfVar), false);
                prfVar.endInsert();
            } catch (Throwable th) {
                prfVarOpenWriter.close(false);
                throw th;
            }
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32912getAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m32913getFixupsHpuvwBQ() {
            return C14427t.m32927constructorimpl(2);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m32914getFromSlotTableHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "anchor" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? ymh.InterfaceC15729h.f102263c : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(2)) ? "fixups" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$q */
    @vn8
    public static final class C14424q {

        /* JADX INFO: renamed from: a */
        public final int f93352a;

        private /* synthetic */ C14424q(int i) {
            this.f93352a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C14424q m32915boximpl(int i) {
            return new C14424q(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m32916constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m32917equalsimpl(int i, Object obj) {
            return (obj instanceof C14424q) && i == ((C14424q) obj).m32921unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m32918equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m32919hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m32920toStringimpl(int i) {
            return "IntParameter(offset=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m32917equalsimpl(this.f93352a, obj);
        }

        public final int getOffset() {
            return this.f93352a;
        }

        public int hashCode() {
            return m32919hashCodeimpl(this.f93352a);
        }

        public String toString() {
            return m32920toStringimpl(this.f93352a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m32921unboximpl() {
            return this.f93352a;
        }
    }

    /* JADX INFO: renamed from: w5c$r */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,990:1\n364#1:991\n364#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n367#1:991\n376#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14425r extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14425r f93353d = new C14425r();

        /* JADX INFO: renamed from: e */
        public static final int f93354e = 0;

        private C14425r() {
            super(1, 0, 2, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.moveGroup(a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getOffset-jn0FJLE, reason: not valid java name */
        public final int m32922getOffsetjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? ymh.InterfaceC15724c.f102156R : super.mo32877intParamNamew8GmfQM(i);
        }
    }

    /* JADX INFO: renamed from: w5c$s */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,990:1\n476#1:991\n477#1:992\n478#1:993\n476#1:994\n477#1:995\n478#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n481#1:991\n482#1:992\n483#1:993\n493#1:994\n494#1:995\n495#1:996\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14426s extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14426s f93355d = new C14426s();

        /* JADX INFO: renamed from: e */
        public static final int f93356e = 0;

        private C14426s() {
            super(3, 0, 2, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            p40Var.move(a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0)), a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(1)), a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(2)));
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m32923getCountjn0FJLE() {
            return C14424q.m32916constructorimpl(2);
        }

        /* JADX INFO: renamed from: getFrom-jn0FJLE, reason: not valid java name */
        public final int m32924getFromjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        /* JADX INFO: renamed from: getTo-jn0FJLE, reason: not valid java name */
        public final int m32925getTojn0FJLE() {
            return C14424q.m32916constructorimpl(1);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? ymh.InterfaceC15729h.f102263c : C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(1)) ? "to" : C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(2)) ? "count" : super.mo32877intParamNamew8GmfQM(i);
        }
    }

    /* JADX INFO: renamed from: w5c$t */
    @vn8
    public static final class C14427t<T> {

        /* JADX INFO: renamed from: a */
        public final int f93357a;

        private /* synthetic */ C14427t(int i) {
            this.f93357a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C14427t m32926boximpl(int i) {
            return new C14427t(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m32927constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m32928equalsimpl(int i, Object obj) {
            return (obj instanceof C14427t) && i == ((C14427t) obj).m32932unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m32929equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m32930hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m32931toStringimpl(int i) {
            return "ObjectParameter(offset=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m32928equalsimpl(this.f93357a, obj);
        }

        public final int getOffset() {
            return this.f93357a;
        }

        public int hashCode() {
            return m32930hashCodeimpl(this.f93357a);
        }

        public String toString() {
            return m32931toStringimpl(this.f93357a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m32932unboximpl() {
            return this.f93357a;
        }
    }

    /* JADX INFO: renamed from: w5c$u */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,990:1\n595#1:991\n596#1:992\n596#1:993\n595#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n599#1:991\n604#1:992\n613#1:993\n614#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14428u extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14428u f93358d = new C14428u();

        /* JADX INFO: renamed from: e */
        public static final int f93359e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14428u() {
            int i = 1;
            super(i, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            C5897fo c5897fo = (C5897fo) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0));
            int iMo27190getIntw8GmfQM = a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0));
            p40Var.mo14389up();
            md8.checkNotNull(p40Var, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            p40Var.insertBottomUp(iMo27190getIntw8GmfQM, prfVar.node(c5897fo));
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m32933getGroupAnchorHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m32934getInsertIndexjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "insertIndex" : super.mo32877intParamNamew8GmfQM(i);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "groupAnchor" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$v */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,990:1\n762#1:991\n763#1:992\n764#1:993\n762#1:994\n763#1:995\n764#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n767#1:991\n768#1:992\n769#1:993\n779#1:994\n780#1:995\n781#1:996\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14429v extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14429v f93360d = new C14429v();

        /* JADX INFO: renamed from: e */
        public static final int f93361e = 0;

        private C14429v() {
            super(0, 3, 1, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            g6c.releaseMovableGroupAtCurrent((sz2) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0)), (dn2) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(1)), (i0b) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(2)), prfVar);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m32935getCompositionHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m32936getParentCompositionContextHpuvwBQ() {
            return C14427t.m32927constructorimpl(1);
        }

        /* JADX INFO: renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m32937getReferenceHpuvwBQ() {
            return C14427t.m32927constructorimpl(2);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "composition" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(1)) ? "parentCompositionContext" : C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(2)) ? "reference" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$w */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,990:1\n152#1:991\n152#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n155#1:991\n164#1:992\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14430w extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14430w f93362d = new C14430w();

        /* JADX INFO: renamed from: e */
        public static final int f93363e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14430w() {
            int i = 1;
            super(0, i, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            dydVar.remembering((eyd) a6cVar.mo27191getObject31yXWZQ(C14427t.m32927constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m32938getValueHpuvwBQ() {
            return C14427t.m32927constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo32878objectParamName31yXWZQ(int i) {
            return C14427t.m32929equalsimpl0(i, C14427t.m32927constructorimpl(0)) ? "value" : super.mo32878objectParamName31yXWZQ(i);
        }
    }

    /* JADX INFO: renamed from: w5c$x */
    @e0g(parameters = 1)
    public static final class C14431x extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14431x f93364d = new C14431x();

        /* JADX INFO: renamed from: e */
        public static final int f93365e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14431x() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            gm2.removeCurrentGroup(prfVar, dydVar);
        }
    }

    /* JADX INFO: renamed from: w5c$y */
    @dwf({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,990:1\n454#1:991\n455#1:992\n454#1:993\n455#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n458#1:991\n459#1:992\n469#1:993\n470#1:994\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14432y extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14432y f93366d = new C14432y();

        /* JADX INFO: renamed from: e */
        public static final int f93367e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14432y() {
            int i = 2;
            super(i, 0, i, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            p40Var.remove(a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(0)), a6cVar.mo27190getIntw8GmfQM(C14424q.m32916constructorimpl(1)));
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m32939getCountjn0FJLE() {
            return C14424q.m32916constructorimpl(1);
        }

        /* JADX INFO: renamed from: getRemoveIndex-jn0FJLE, reason: not valid java name */
        public final int m32940getRemoveIndexjn0FJLE() {
            return C14424q.m32916constructorimpl(0);
        }

        @Override // p000.w5c
        @yfb
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo32877intParamNamew8GmfQM(int i) {
            return C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(0)) ? "removeIndex" : C14424q.m32918equalsimpl0(i, C14424q.m32916constructorimpl(1)) ? "count" : super.mo32877intParamNamew8GmfQM(i);
        }
    }

    /* JADX INFO: renamed from: w5c$z */
    @e0g(parameters = 1)
    public static final class C14433z extends w5c {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final C14433z f93368d = new C14433z();

        /* JADX INFO: renamed from: e */
        public static final int f93369e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private C14433z() {
            int i = 0;
            super(i, i, 3, null);
        }

        @Override // p000.w5c
        public void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
            prfVar.reset();
        }
    }

    public /* synthetic */ w5c(int i, int i2, jt3 jt3Var) {
        this(i, i2);
    }

    public abstract void execute(@yfb a6c a6cVar, @yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar);

    public final int getInts() {
        return this.f93295a;
    }

    @yfb
    public final String getName() {
        String simpleName = vvd.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public final int getObjects() {
        return this.f93296b;
    }

    @yfb
    /* JADX INFO: renamed from: intParamName-w8GmfQM, reason: not valid java name */
    public String mo32877intParamNamew8GmfQM(int i) {
        return "IntParameter(" + i + ')';
    }

    @yfb
    /* JADX INFO: renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public String mo32878objectParamName31yXWZQ(int i) {
        return "ObjectParameter(" + i + ')';
    }

    @yfb
    public String toString() {
        return getName();
    }

    private w5c(int i, int i2) {
        this.f93295a = i;
        this.f93296b = i2;
    }

    public /* synthetic */ w5c(int i, int i2, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, null);
    }
}
