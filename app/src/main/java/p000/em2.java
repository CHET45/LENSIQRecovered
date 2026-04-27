package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.qqc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 5 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 9 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 10 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 11 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 12 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 14 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 15 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 16 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4582:1\n3958#1,3:4592\n3971#1:4595\n3972#1:4597\n3962#1,11:4598\n3958#1,3:4636\n3971#1:4639\n3972#1:4641\n3962#1,11:4642\n3981#1,3:4655\n3994#1:4658\n3995#1:4660\n3985#1,11:4661\n3981#1,3:4672\n3994#1:4675\n3995#1:4677\n3985#1,11:4678\n3958#1,3:4690\n3971#1:4693\n3972#1:4695\n3962#1,11:4696\n3981#1,3:4707\n3994#1:4710\n3995#1:4712\n3985#1,11:4713\n3444#1,8:4758\n3453#1,3:4781\n3971#1:4900\n3972#1:4902\n3971#1:4903\n3972#1:4905\n3971#1:4906\n3972#1:4908\n3971#1:4909\n3972#1:4911\n3994#1:4913\n3995#1:4915\n3994#1:4916\n3995#1:4918\n3994#1:4919\n3995#1:4921\n3994#1:4922\n3995#1:4924\n1#2:4583\n158#3,8:4584\n158#3,8:4746\n158#3,4:4754\n163#3,3:4784\n158#3,4:4878\n163#3,3:4890\n26#4:4596\n26#4:4640\n22#4:4659\n22#4:4676\n26#4:4689\n26#4:4694\n22#4:4711\n26#4:4901\n26#4:4904\n26#4:4907\n26#4:4910\n26#4:4912\n22#4:4914\n22#4:4917\n22#4:4920\n22#4:4923\n22#4:4925\n46#5,5:4609\n46#5,3:4825\n50#5:4863\n4551#6,7:4614\n4551#6,7:4621\n4551#6,7:4724\n4551#6,7:4731\n4551#6,7:4797\n4551#6,7:4804\n4551#6,7:4811\n4551#6,7:4818\n4551#6,7:4864\n4551#6,7:4871\n4551#6,7:4893\n33#7,7:4628\n82#8:4635\n4468#9:4653\n4469#9:4654\n182#10,4:4738\n182#10,4:4766\n192#10,8:4770\n187#10,3:4778\n187#10,3:4788\n182#10,8:4882\n33#11,4:4742\n38#11:4787\n33#11,6:4791\n82#11,3:4926\n33#11,4:4929\n85#11,2:4933\n38#11:4935\n87#11:4936\n391#12,4:4828\n363#12,6:4832\n373#12,3:4839\n376#12,2:4843\n396#12,2:4845\n379#12,6:4847\n398#12:4853\n1810#13:4838\n1672#13:4842\n392#14,6:4854\n398#14,2:4861\n48#15:4860\n1855#16,2:4937\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1493#1:4592,3\n1493#1:4595\n1493#1:4597\n1493#1:4598,11\n2455#1:4636,3\n2455#1:4639\n2455#1:4641\n2455#1:4642,11\n2602#1:4655,3\n2602#1:4658\n2602#1:4660\n2602#1:4661,11\n2610#1:4672,3\n2610#1:4675\n2610#1:4677\n2610#1:4678,11\n3112#1:4690,3\n3112#1:4693\n3112#1:4695\n3112#1:4696,11\n3116#1:4707,3\n3116#1:4710\n3116#1:4712\n3116#1:4713,11\n3407#1:4758,8\n3407#1:4781,3\n3960#1:4900\n3960#1:4902\n3962#1:4903\n3962#1:4905\n3964#1:4906\n3964#1:4908\n3966#1:4909\n3966#1:4911\n3983#1:4913\n3983#1:4915\n3985#1:4916\n3985#1:4918\n3987#1:4919\n3987#1:4921\n3989#1:4922\n3989#1:4924\n1428#1:4584,8\n3348#1:4746,8\n3406#1:4754,4\n3406#1:4784,3\n3771#1:4878,4\n3771#1:4890,3\n1493#1:4596\n2455#1:4640\n2602#1:4659\n2610#1:4676\n3056#1:4689\n3112#1:4694\n3116#1:4711\n3960#1:4901\n3962#1:4904\n3964#1:4907\n3966#1:4910\n3971#1:4912\n3983#1:4914\n3985#1:4917\n3987#1:4920\n3989#1:4923\n3994#1:4925\n1753#1:4609,5\n3561#1:4825,3\n3561#1:4863\n1826#1:4614,7\n1839#1:4621,7\n3130#1:4724,7\n3143#1:4731,7\n3519#1:4797,7\n3524#1:4804,7\n3540#1:4811,7\n3560#1:4818,7\n3626#1:4864,7\n3633#1:4871,7\n3783#1:4893,7\n1886#1:4628,7\n2256#1:4635\n2461#1:4653\n2485#1:4654\n3325#1:4738,4\n3412#1:4766,4\n3413#1:4770,8\n3412#1:4778,3\n3325#1:4788,3\n3773#1:4882,8\n3327#1:4742,4\n3327#1:4787\n3471#1:4791,6\n3682#1:4926,3\n3682#1:4929,4\n3682#1:4933,2\n3682#1:4935\n3682#1:4936\n3564#1:4828,4\n3564#1:4832,6\n3564#1:4839,3\n3564#1:4843,2\n3564#1:4845,2\n3564#1:4847,6\n3564#1:4853\n3564#1:4838\n3564#1:4842\n3590#1:4854,6\n3590#1:4861,2\n3590#1:4860\n3714#1:4937,2\n*E\n"})
@e0g(parameters = 0)
public final class em2 implements zl2 {

    /* JADX INFO: renamed from: T */
    public static final int f33391T = 8;

    /* JADX INFO: renamed from: B */
    public int f33393B;

    /* JADX INFO: renamed from: C */
    public int f33394C;

    /* JADX INFO: renamed from: D */
    public boolean f33395D;

    /* JADX INFO: renamed from: E */
    @yfb
    public final C5375c f33396E;

    /* JADX INFO: renamed from: F */
    @yfb
    public final i0g<ssd> f33397F;

    /* JADX INFO: renamed from: G */
    public boolean f33398G;

    /* JADX INFO: renamed from: H */
    public boolean f33399H;

    /* JADX INFO: renamed from: I */
    @yfb
    public lrf f33400I;

    /* JADX INFO: renamed from: J */
    @yfb
    public mrf f33401J;

    /* JADX INFO: renamed from: K */
    @yfb
    public prf f33402K;

    /* JADX INFO: renamed from: L */
    public boolean f33403L;

    /* JADX INFO: renamed from: M */
    @gib
    public qqc f33404M;

    /* JADX INFO: renamed from: N */
    @gib
    public wt1 f33405N;

    /* JADX INFO: renamed from: O */
    @yfb
    public final bm2 f33406O;

    /* JADX INFO: renamed from: P */
    @yfb
    public C5897fo f33407P;

    /* JADX INFO: renamed from: Q */
    @yfb
    public l26 f33408Q;

    /* JADX INFO: renamed from: R */
    public boolean f33409R;

    /* JADX INFO: renamed from: S */
    public int f33410S;

    /* JADX INFO: renamed from: b */
    @yfb
    public final p40<?> f33411b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final dn2 f33412c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final mrf f33413d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Set<eyd> f33414e;

    /* JADX INFO: renamed from: f */
    @yfb
    public wt1 f33415f;

    /* JADX INFO: renamed from: g */
    @yfb
    public wt1 f33416g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final sz2 f33417h;

    /* JADX INFO: renamed from: j */
    @gib
    public hmc f33419j;

    /* JADX INFO: renamed from: k */
    public int f33420k;

    /* JADX INFO: renamed from: l */
    public int f33421l;

    /* JADX INFO: renamed from: m */
    public int f33422m;

    /* JADX INFO: renamed from: o */
    @gib
    public int[] f33424o;

    /* JADX INFO: renamed from: p */
    @gib
    public f5b f33425p;

    /* JADX INFO: renamed from: q */
    public boolean f33426q;

    /* JADX INFO: renamed from: r */
    public boolean f33427r;

    /* JADX INFO: renamed from: s */
    public boolean f33428s;

    /* JADX INFO: renamed from: w */
    @gib
    public v68<qqc> f33432w;

    /* JADX INFO: renamed from: x */
    public boolean f33433x;

    /* JADX INFO: renamed from: z */
    public boolean f33435z;

    /* JADX INFO: renamed from: i */
    @yfb
    public final i0g<hmc> f33418i = new i0g<>();

    /* JADX INFO: renamed from: n */
    @yfb
    public final v78 f33423n = new v78();

    /* JADX INFO: renamed from: t */
    @yfb
    public final List<fe8> f33429t = new ArrayList();

    /* JADX INFO: renamed from: u */
    @yfb
    public final v78 f33430u = new v78();

    /* JADX INFO: renamed from: v */
    @yfb
    public qqc f33431v = rqc.persistentCompositionLocalHashMapOf();

    /* JADX INFO: renamed from: y */
    @yfb
    public final v78 f33434y = new v78();

    /* JADX INFO: renamed from: A */
    public int f33392A = -1;

    /* JADX INFO: renamed from: em2$a */
    public static final class C5373a implements i9e {

        /* JADX INFO: renamed from: a */
        @yfb
        public final C5374b f33436a;

        public C5373a(@yfb C5374b c5374b) {
            this.f33436a = c5374b;
        }

        @yfb
        public final C5374b getRef() {
            return this.f33436a;
        }

        @Override // p000.eyd
        public void onAbandoned() {
            this.f33436a.dispose();
        }

        @Override // p000.eyd
        public void onForgotten() {
            this.f33436a.dispose();
        }

        @Override // p000.eyd
        public void onRemembered() {
        }
    }

    /* JADX INFO: renamed from: em2$b */
    @dwf({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4582:1\n1855#2,2:4583\n81#3:4585\n107#3,2:4586\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3849#1:4583,2\n3899#1:4585\n3899#1:4586,2\n*E\n"})
    public final class C5374b extends dn2 {

        /* JADX INFO: renamed from: b */
        public final int f33437b;

        /* JADX INFO: renamed from: c */
        public final boolean f33438c;

        /* JADX INFO: renamed from: d */
        public final boolean f33439d;

        /* JADX INFO: renamed from: e */
        @gib
        public final vn2 f33440e;

        /* JADX INFO: renamed from: f */
        @gib
        public Set<Set<fn2>> f33441f;

        /* JADX INFO: renamed from: g */
        @yfb
        public final Set<em2> f33442g = new LinkedHashSet();

        /* JADX INFO: renamed from: h */
        @yfb
        public final z6b f33443h = stf.mutableStateOf(rqc.persistentCompositionLocalHashMapOf(), stf.referentialEqualityPolicy());

        public C5374b(int i, boolean z, boolean z2, @gib vn2 vn2Var) {
            this.f33437b = i;
            this.f33438c = z;
            this.f33439d = z2;
            this.f33440e = vn2Var;
        }

        private final qqc getCompositionLocalScope() {
            return (qqc) this.f33443h.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(qqc qqcVar) {
            this.f33443h.setValue(qqcVar);
        }

        @Override // p000.dn2
        @ik2(scheme = "[0[0]]")
        public void composeInitial$runtime_release(@yfb sz2 sz2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
            em2.this.f33412c.composeInitial$runtime_release(sz2Var, gz6Var);
        }

        @Override // p000.dn2
        public void deletedMovableContent$runtime_release(@yfb i0b i0bVar) {
            em2.this.f33412c.deletedMovableContent$runtime_release(i0bVar);
        }

        public final void dispose() {
            if (this.f33442g.isEmpty()) {
                return;
            }
            Set<Set<fn2>> set = this.f33441f;
            if (set != null) {
                for (em2 em2Var : this.f33442g) {
                    Iterator<Set<fn2>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(em2Var.f33413d);
                    }
                }
            }
            this.f33442g.clear();
        }

        @Override // p000.dn2
        public void doneComposing$runtime_release() {
            em2 em2Var = em2.this;
            em2Var.f33393B--;
        }

        @Override // p000.dn2
        public boolean getCollectingCallByInformation$runtime_release() {
            return em2.this.f33412c.getCollectingCallByInformation$runtime_release();
        }

        @Override // p000.dn2
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.f33438c;
        }

        @Override // p000.dn2
        public boolean getCollectingSourceInformation$runtime_release() {
            return this.f33439d;
        }

        @yfb
        public final Set<em2> getComposers() {
            return this.f33442g;
        }

        @Override // p000.dn2
        @yfb
        public qqc getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // p000.dn2
        public int getCompoundHashKey$runtime_release() {
            return this.f33437b;
        }

        @Override // p000.dn2
        @yfb
        public e13 getEffectCoroutineContext() {
            return em2.this.f33412c.getEffectCoroutineContext();
        }

        @gib
        public final Set<Set<fn2>> getInspectionTables() {
            return this.f33441f;
        }

        @Override // p000.dn2
        @gib
        public vn2 getObserverHolder$runtime_release() {
            return this.f33440e;
        }

        @Override // p000.dn2
        @yfb
        public e13 getRecomposeCoroutineContext$runtime_release() {
            return in2.getRecomposeCoroutineContext(em2.this.getComposition());
        }

        @Override // p000.dn2
        public void insertMovableContent$runtime_release(@yfb i0b i0bVar) {
            em2.this.f33412c.insertMovableContent$runtime_release(i0bVar);
        }

        @Override // p000.dn2
        public void invalidate$runtime_release(@yfb sz2 sz2Var) {
            em2.this.f33412c.invalidate$runtime_release(em2.this.getComposition());
            em2.this.f33412c.invalidate$runtime_release(sz2Var);
        }

        @Override // p000.dn2
        public void invalidateScope$runtime_release(@yfb ssd ssdVar) {
            em2.this.f33412c.invalidateScope$runtime_release(ssdVar);
        }

        @Override // p000.dn2
        public void movableContentStateReleased$runtime_release(@yfb i0b i0bVar, @yfb h0b h0bVar) {
            em2.this.f33412c.movableContentStateReleased$runtime_release(i0bVar, h0bVar);
        }

        @Override // p000.dn2
        @gib
        public h0b movableContentStateResolve$runtime_release(@yfb i0b i0bVar) {
            return em2.this.f33412c.movableContentStateResolve$runtime_release(i0bVar);
        }

        @Override // p000.dn2
        public void recordInspectionTable$runtime_release(@yfb Set<fn2> set) {
            Set hashSet = this.f33441f;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f33441f = hashSet;
            }
            hashSet.add(set);
        }

        @Override // p000.dn2
        public void registerComposer$runtime_release(@yfb zl2 zl2Var) {
            md8.checkNotNull(zl2Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((em2) zl2Var);
            this.f33442g.add(zl2Var);
        }

        @Override // p000.dn2
        public void registerComposition$runtime_release(@yfb sz2 sz2Var) {
            em2.this.f33412c.registerComposition$runtime_release(sz2Var);
        }

        @Override // p000.dn2
        public void reportRemovedComposition$runtime_release(@yfb sz2 sz2Var) {
            em2.this.f33412c.reportRemovedComposition$runtime_release(sz2Var);
        }

        public final void setInspectionTables(@gib Set<Set<fn2>> set) {
            this.f33441f = set;
        }

        @Override // p000.dn2
        public void startComposing$runtime_release() {
            em2.this.f33393B++;
        }

        @Override // p000.dn2
        public void unregisterComposer$runtime_release(@yfb zl2 zl2Var) {
            Set<Set<fn2>> set = this.f33441f;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    md8.checkNotNull(zl2Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((em2) zl2Var).f33413d);
                }
            }
            qlh.asMutableCollection(this.f33442g).remove(zl2Var);
        }

        @Override // p000.dn2
        public void unregisterComposition$runtime_release(@yfb sz2 sz2Var) {
            em2.this.f33412c.unregisterComposition$runtime_release(sz2Var);
        }

        public final void updateCompositionLocalScope(@yfb qqc qqcVar) {
            setCompositionLocalScope(qqcVar);
        }
    }

    /* JADX INFO: renamed from: em2$c */
    public static final class C5375c implements a74 {
        public C5375c() {
        }

        @Override // p000.a74
        public void done(@yfb z64<?> z64Var) {
            em2 em2Var = em2.this;
            em2Var.f33393B--;
        }

        @Override // p000.a74
        public void start(@yfb z64<?> z64Var) {
            em2.this.f33393B++;
        }
    }

    /* JADX INFO: renamed from: em2$d */
    @dwf({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n+ 2 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4582:1\n182#2,4:4583\n192#2,8:4595\n187#2,3:4606\n3444#3,8:4587\n3453#3,3:4603\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n*L\n3353#1:4583,4\n3355#1:4595,8\n3353#1:4606,3\n3354#1:4587,8\n3354#1:4603,3\n*E\n"})
    public static final class C5376d extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ wt1 f33447b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ lrf f33448c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ i0b f33449d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5376d(wt1 wt1Var, lrf lrfVar, i0b i0bVar) {
            super(0);
            this.f33447b = wt1Var;
            this.f33448c = lrfVar;
            this.f33449d = i0bVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            bm2 bm2Var = em2.this.f33406O;
            wt1 wt1Var = this.f33447b;
            em2 em2Var = em2.this;
            lrf lrfVar = this.f33448c;
            i0b i0bVar = this.f33449d;
            wt1 changeList = bm2Var.getChangeList();
            try {
                bm2Var.setChangeList(wt1Var);
                lrf reader$runtime_release = em2Var.getReader$runtime_release();
                int[] iArr = em2Var.f33424o;
                v68 v68Var = em2Var.f33432w;
                em2Var.f33424o = null;
                em2Var.f33432w = null;
                try {
                    em2Var.setReader$runtime_release(lrfVar);
                    bm2 bm2Var2 = em2Var.f33406O;
                    boolean implicitRootStart = bm2Var2.getImplicitRootStart();
                    try {
                        bm2Var2.setImplicitRootStart(false);
                        em2Var.invokeMovableContentLambda(i0bVar.getContent$runtime_release(), i0bVar.getLocals$runtime_release(), i0bVar.getParameter$runtime_release(), true);
                        bm2Var2.setImplicitRootStart(implicitRootStart);
                        bth bthVar = bth.f14751a;
                    } catch (Throwable th) {
                        bm2Var2.setImplicitRootStart(implicitRootStart);
                        throw th;
                    }
                } finally {
                    em2Var.setReader$runtime_release(reader$runtime_release);
                    em2Var.f33424o = iArr;
                    em2Var.f33432w = v68Var;
                }
            } finally {
                bm2Var.setChangeList(changeList);
            }
        }
    }

    /* JADX INFO: renamed from: em2$e */
    public static final class C5377e extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ i0b f33451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5377e(i0b i0bVar) {
            super(0);
            this.f33451b = i0bVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            em2.this.invokeMovableContentLambda(this.f33451b.getContent$runtime_release(), this.f33451b.getLocals$runtime_release(), this.f33451b.getParameter$runtime_release(), true);
        }
    }

    /* JADX INFO: renamed from: em2$f */
    public static final class C5378f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f0b<Object> f33452a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f33453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5378f(f0b<Object> f0bVar, Object obj) {
            super(2);
            this.f33452a = f0bVar;
            this.f33453b = obj;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3291)");
            }
            this.f33452a.getContent().invoke(this.f33453b, zl2Var, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    public em2(@yfb p40<?> p40Var, @yfb dn2 dn2Var, @yfb mrf mrfVar, @yfb Set<eyd> set, @yfb wt1 wt1Var, @yfb wt1 wt1Var2, @yfb sz2 sz2Var) {
        this.f33411b = p40Var;
        this.f33412c = dn2Var;
        this.f33413d = mrfVar;
        this.f33414e = set;
        this.f33415f = wt1Var;
        this.f33416g = wt1Var2;
        this.f33417h = sz2Var;
        this.f33395D = dn2Var.getCollectingSourceInformation$runtime_release() || dn2Var.getCollectingCallByInformation$runtime_release();
        this.f33396E = new C5375c();
        this.f33397F = new i0g<>();
        lrf lrfVarOpenReader = mrfVar.openReader();
        lrfVarOpenReader.close();
        this.f33400I = lrfVarOpenReader;
        mrf mrfVar2 = new mrf();
        if (dn2Var.getCollectingSourceInformation$runtime_release()) {
            mrfVar2.collectSourceInformation();
        }
        if (dn2Var.getCollectingCallByInformation$runtime_release()) {
            mrfVar2.collectCalledByInformation();
        }
        this.f33401J = mrfVar2;
        prf prfVarOpenWriter = mrfVar2.openWriter();
        prfVarOpenWriter.close(true);
        this.f33402K = prfVarOpenWriter;
        this.f33406O = new bm2(this, this.f33415f);
        lrf lrfVarOpenReader2 = this.f33401J.openReader();
        try {
            C5897fo c5897foAnchor = lrfVarOpenReader2.anchor(0);
            lrfVarOpenReader2.close();
            this.f33407P = c5897foAnchor;
            this.f33408Q = new l26();
        } catch (Throwable th) {
            lrfVarOpenReader2.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m10121a(em2 em2Var, sz2 sz2Var, sz2 sz2Var2, Integer num, List list, ny6 ny6Var, int i, Object obj) {
        sz2 sz2Var3 = (i & 1) != 0 ? null : sz2Var;
        sz2 sz2Var4 = (i & 2) != 0 ? null : sz2Var2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = l82.emptyList();
        }
        return em2Var.recomposeMovableContent(sz2Var3, sz2Var4, num2, list, ny6Var);
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.f33418i.clear();
        this.f33423n.clear();
        this.f33430u.clear();
        this.f33434y.clear();
        this.f33432w = null;
        this.f33408Q.clear();
        this.f33410S = 0;
        this.f33393B = 0;
        this.f33428s = false;
        this.f33409R = false;
        this.f33435z = false;
        this.f33398G = false;
        this.f33427r = false;
        this.f33392A = -1;
        if (!this.f33400I.getClosed()) {
            this.f33400I.close();
        }
        if (this.f33402K.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addRecomposeScope() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            ssd r0 = new ssd
            sz2 r2 = r4.getComposition()
            p000.md8.checkNotNull(r2, r1)
            hn2 r2 = (p000.hn2) r2
            r0.<init>(r2)
            i0g<ssd> r1 = r4.f33397F
            r1.push(r0)
            r4.updateValue(r0)
            int r1 = r4.f33394C
            r0.start(r1)
            goto L77
        L24:
            java.util.List<fe8> r0 = r4.f33429t
            lrf r2 = r4.f33400I
            int r2 = r2.getParent()
            fe8 r0 = p000.gm2.access$removeLocation(r0, r2)
            lrf r2 = r4.f33400I
            java.lang.Object r2 = r2.next()
            zl2$a r3 = p000.zl2.f105372a
            java.lang.Object r3 = r3.getEmpty()
            boolean r3 = p000.md8.areEqual(r2, r3)
            if (r3 == 0) goto L54
            ssd r2 = new ssd
            sz2 r3 = r4.getComposition()
            p000.md8.checkNotNull(r3, r1)
            hn2 r3 = (p000.hn2) r3
            r2.<init>(r3)
            r4.updateValue(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            p000.md8.checkNotNull(r2, r1)
            ssd r2 = (p000.ssd) r2
        L5b:
            if (r0 != 0) goto L69
            boolean r0 = r2.getForcedRecompose()
            r1 = 0
            if (r0 == 0) goto L67
            r2.setForcedRecompose(r1)
        L67:
            if (r0 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r2.setRequiresRecompose(r1)
            i0g<ssd> r0 = r4.f33397F
            r0.push(r2)
            int r0 = r4.f33394C
            r2.start(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.em2.addRecomposeScope():void");
    }

    private final void cleanUpCompose() {
        this.f33419j = null;
        this.f33420k = 0;
        this.f33421l = 0;
        this.f33410S = 0;
        this.f33428s = false;
        this.f33406O.resetTransientState();
        this.f33397F.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.f33424o = null;
        this.f33425p = null;
    }

    private final int compoundKeyOf(int i, int i2, int i3, int i4) {
        if (i == i3) {
            return i4;
        }
        int iGroupCompoundKeyPart = groupCompoundKeyPart(this.f33400I, i);
        if (iGroupCompoundKeyPart == 126665345) {
            return iGroupCompoundKeyPart;
        }
        int iParent = this.f33400I.parent(i);
        if (iParent != i3) {
            i4 = compoundKeyOf(iParent, rGroupIndexOf(iParent), i3, i4);
        }
        if (this.f33400I.hasObjectKey(i)) {
            i2 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i4, 3) ^ iGroupCompoundKeyPart, 3) ^ i2;
    }

    private final void createFreshInsertTable() {
        gm2.runtimeCheck(this.f33402K.getClosed());
        forceFreshInsertTable();
    }

    private final qqc currentCompositionLocalScope() {
        qqc qqcVar = this.f33404M;
        return qqcVar != null ? qqcVar : currentCompositionLocalScope(this.f33400I.getParent());
    }

    private final void doCompose(wqe<ssd, Object> wqeVar, gz6<? super zl2, ? super Integer, bth> gz6Var) {
        long[] jArr;
        long[] jArr2;
        int i;
        if (this.f33398G) {
            gm2.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        Object objBeginSection = q5h.f73293a.beginSection("Compose:recompose");
        try {
            this.f33394C = gtf.currentSnapshot().getId();
            this.f33432w = null;
            s6b<Object, Object> map = wqeVar.getMap();
            Object[] objArr = map.f14265b;
            Object[] objArr2 = map.f14266c;
            long[] jArr3 = map.f14264a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                int i6 = (i2 << 3) + i5;
                                Object obj = objArr[i6];
                                Object obj2 = objArr2[i6];
                                md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C5897fo anchor = ((ssd) obj).getAnchor();
                                if (anchor != null) {
                                    int location$runtime_release = anchor.getLocation$runtime_release();
                                    List<fe8> list = this.f33429t;
                                    ssd ssdVar = (ssd) obj;
                                    jArr2 = jArr3;
                                    if (obj2 == vqe.f92004a) {
                                        obj2 = null;
                                    }
                                    list.add(new fe8(ssdVar, location$runtime_release, obj2));
                                } else {
                                    jArr2 = jArr3;
                                }
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            p82.sortWith(this.f33429t, gm2.f40182s);
            this.f33420k = 0;
            this.f33398G = true;
            try {
                startRoot();
                Object objNextSlot = nextSlot();
                if (objNextSlot != gz6Var && gz6Var != null) {
                    updateValue(gz6Var);
                }
                C5375c c5375c = this.f33396E;
                f7b<a74> f7bVarDerivedStateObservers = stf.derivedStateObservers();
                try {
                    f7bVarDerivedStateObservers.add(c5375c);
                    if (gz6Var != null) {
                        startGroup(200, gm2.getInvocation());
                        C5737fe.invokeComposable(this, gz6Var);
                        endGroup();
                    } else if ((!this.f33427r && !this.f33433x) || objNextSlot == null || md8.areEqual(objNextSlot, zl2.f105372a.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        startGroup(200, gm2.getInvocation());
                        C5737fe.invokeComposable(this, (gz6) qlh.beforeCheckcastToFunctionOfArity(objNextSlot, 2));
                        endGroup();
                    }
                    f7bVarDerivedStateObservers.removeAt(f7bVarDerivedStateObservers.getSize() - 1);
                    endRoot();
                    this.f33398G = false;
                    this.f33429t.clear();
                    createFreshInsertTable();
                    bth bthVar = bth.f14751a;
                    q5h.f73293a.endSection(objBeginSection);
                } finally {
                    f7bVarDerivedStateObservers.removeAt(f7bVarDerivedStateObservers.getSize() - 1);
                }
            } catch (Throwable th) {
                this.f33398G = false;
                this.f33429t.clear();
                abortRoot();
                createFreshInsertTable();
                throw th;
            }
        } catch (Throwable th2) {
            q5h.f73293a.endSection(objBeginSection);
            throw th2;
        }
    }

    private final void doRecordDownsFor(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        doRecordDownsFor(this.f33400I.parent(i), i2);
        if (this.f33400I.isNode(i)) {
            this.f33406O.moveDown(nodeAt(this.f33400I, i));
        }
    }

    private final void end(boolean z) {
        int iHashCode;
        Set set;
        List<wq8> list;
        int iHashCode2;
        int iPeek2 = this.f33423n.peek2() - 1;
        if (getInserting()) {
            int parent = this.f33402K.getParent();
            int iGroupKey = this.f33402K.groupKey(parent);
            Object objGroupObjectKey = this.f33402K.groupObjectKey(parent);
            Object objGroupAux = this.f33402K.groupAux(parent);
            if (objGroupObjectKey != null) {
                iHashCode2 = Integer.hashCode(objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux == null || iGroupKey != 207 || md8.areEqual(objGroupAux, zl2.f105372a.getEmpty())) {
                iHashCode2 = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iGroupKey);
            } else {
                this.f33410S = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objGroupAux.hashCode()), 3);
            }
            this.f33410S = Integer.rotateRight(iHashCode2, 3);
        } else {
            int parent2 = this.f33400I.getParent();
            int iGroupKey2 = this.f33400I.groupKey(parent2);
            Object objGroupObjectKey2 = this.f33400I.groupObjectKey(parent2);
            Object objGroupAux2 = this.f33400I.groupAux(parent2);
            if (objGroupObjectKey2 != null) {
                iHashCode = Integer.hashCode(objGroupObjectKey2 instanceof Enum ? ((Enum) objGroupObjectKey2).ordinal() : objGroupObjectKey2.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux2 == null || iGroupKey2 != 207 || md8.areEqual(objGroupAux2, zl2.f105372a.getEmpty())) {
                iHashCode = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iGroupKey2);
            } else {
                this.f33410S = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objGroupAux2.hashCode()), 3);
            }
            this.f33410S = Integer.rotateRight(iHashCode, 3);
        }
        int i = this.f33421l;
        hmc hmcVar = this.f33419j;
        if (hmcVar != null && hmcVar.getKeyInfos().size() > 0) {
            List<wq8> keyInfos = hmcVar.getKeyInfos();
            List<wq8> used = hmcVar.getUsed();
            Set setFastToSet = v99.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i2 < size2) {
                wq8 wq8Var = keyInfos.get(i2);
                if (setFastToSet.contains(wq8Var)) {
                    set = setFastToSet;
                    if (!linkedHashSet.contains(wq8Var)) {
                        if (i3 < size) {
                            wq8 wq8Var2 = used.get(i3);
                            if (wq8Var2 != wq8Var) {
                                int iNodePositionOf = hmcVar.nodePositionOf(wq8Var2);
                                linkedHashSet.add(wq8Var2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = hmcVar.updatedNodeCountOf(wq8Var2);
                                    list = used;
                                    this.f33406O.moveNode(hmcVar.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + hmcVar.getStartIndex(), iUpdatedNodeCountOf2);
                                    hmcVar.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i2++;
                            }
                            i3++;
                            iUpdatedNodeCountOf += hmcVar.updatedNodeCountOf(wq8Var2);
                            setFastToSet = set;
                            used = list;
                        }
                    }
                    setFastToSet = set;
                } else {
                    this.f33406O.removeNode(hmcVar.nodePositionOf(wq8Var) + hmcVar.getStartIndex(), wq8Var.getNodes());
                    hmcVar.updateNodeCount(wq8Var.getLocation(), 0);
                    this.f33406O.moveReaderRelativeTo(wq8Var.getLocation());
                    this.f33400I.reposition(wq8Var.getLocation());
                    recordDelete();
                    this.f33400I.skipGroup();
                    set = setFastToSet;
                    gm2.removeRange(this.f33429t, wq8Var.getLocation(), wq8Var.getLocation() + this.f33400I.groupSize(wq8Var.getLocation()));
                }
                i2++;
                setFastToSet = set;
            }
            this.f33406O.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.f33406O.moveReaderRelativeTo(this.f33400I.getGroupEnd());
                this.f33400I.skipToGroupEnd();
            }
        }
        int i4 = this.f33420k;
        while (!this.f33400I.isGroupEnd()) {
            int currentGroup = this.f33400I.getCurrentGroup();
            recordDelete();
            this.f33406O.removeNode(i4, this.f33400I.skipGroup());
            gm2.removeRange(this.f33429t, currentGroup, this.f33400I.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z) {
                this.f33408Q.endNodeInsert();
                i = 1;
            }
            this.f33400I.endEmpty();
            int parent3 = this.f33402K.getParent();
            this.f33402K.endGroup();
            if (!this.f33400I.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.f33402K.endInsert();
                this.f33402K.close(true);
                recordInsert(this.f33407P);
                this.f33409R = false;
                if (!this.f33413d.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (z) {
                this.f33406O.moveUp();
            }
            int remainingSlots = this.f33400I.getRemainingSlots();
            if (remainingSlots > 0) {
                this.f33406O.trimValues(remainingSlots);
            }
            this.f33406O.endCurrentGroup();
            int parent4 = this.f33400I.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (z) {
                i = 1;
            }
            this.f33400I.endGroup();
            this.f33406O.endNodeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.f33412c.doneComposing$runtime_release();
        endGroup();
        this.f33406O.endRoot();
        finalizeCompose();
        this.f33400I.close();
        this.f33427r = false;
        this.f33433x = gm2.asBool(this.f33434y.pop());
    }

    private final void ensureWriter() {
        if (this.f33402K.getClosed()) {
            prf prfVarOpenWriter = this.f33401J.openWriter();
            this.f33402K = prfVarOpenWriter;
            prfVarOpenWriter.skipToGroupEnd();
            this.f33403L = false;
            this.f33404M = null;
        }
    }

    private final void enterGroup(boolean z, hmc hmcVar) {
        this.f33418i.push(this.f33419j);
        this.f33419j = hmcVar;
        this.f33423n.push(this.f33421l);
        this.f33423n.push(this.f33422m);
        this.f33423n.push(this.f33420k);
        if (z) {
            this.f33420k = 0;
        }
        this.f33421l = 0;
        this.f33422m = 0;
    }

    private final void exitGroup(int i, boolean z) {
        hmc hmcVarPop = this.f33418i.pop();
        if (hmcVarPop != null && !z) {
            hmcVarPop.setGroupIndex(hmcVarPop.getGroupIndex() + 1);
        }
        this.f33419j = hmcVarPop;
        this.f33420k = this.f33423n.pop() + i;
        this.f33422m = this.f33423n.pop();
        this.f33421l = this.f33423n.pop() + i;
    }

    private final void finalizeCompose() {
        this.f33406O.finalizeComposition();
        if (!this.f33418i.isEmpty()) {
            gm2.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void forceFreshInsertTable() {
        mrf mrfVar = new mrf();
        if (this.f33395D) {
            mrfVar.collectSourceInformation();
        }
        if (this.f33412c.getCollectingCallByInformation$runtime_release()) {
            mrfVar.collectCalledByInformation();
        }
        this.f33401J = mrfVar;
        prf prfVarOpenWriter = mrfVar.openWriter();
        prfVarOpenWriter.close(true);
        this.f33402K = prfVarOpenWriter;
    }

    @ga8
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @fl2
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @fl2
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(lrf lrfVar) {
        return lrfVar.node(lrfVar.getParent());
    }

    @fl2
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(lrf lrfVar, int i) {
        Object objGroupAux;
        if (lrfVar.hasObjectKey(i)) {
            Object objGroupObjectKey = lrfVar.groupObjectKey(i);
            if (objGroupObjectKey != null) {
                return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof f0b ? g0b.f38116a : objGroupObjectKey.hashCode();
            }
            return 0;
        }
        int iGroupKey = lrfVar.groupKey(i);
        if (iGroupKey == 207 && (objGroupAux = lrfVar.groupAux(i)) != null && !md8.areEqual(objGroupAux, zl2.f105372a.getEmpty())) {
            iGroupKey = objGroupAux.hashCode();
        }
        return iGroupKey;
    }

    private final void insertMovableContentGuarded(List<scc<i0b, i0b>> list) throws Throwable {
        bm2 bm2Var;
        wt1 wt1Var;
        bm2 bm2Var2;
        wt1 wt1Var2;
        mrf slotTable$runtime_release;
        C5897fo anchor$runtime_release;
        lrf lrfVar;
        v68 v68Var;
        int[] iArr;
        wt1 wt1Var3;
        bm2 bm2Var3;
        bm2 bm2Var4;
        int i;
        sz2 composition$runtime_release;
        sz2 composition$runtime_release2;
        Integer numValueOf;
        int i2;
        mrf slotTable$runtime_release2;
        lrf lrfVar2;
        bm2 bm2Var5 = this.f33406O;
        wt1 wt1Var4 = this.f33416g;
        wt1 changeList = bm2Var5.getChangeList();
        try {
            bm2Var5.setChangeList(wt1Var4);
            this.f33406O.resetSlots();
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                try {
                    scc<i0b, i0b> sccVar = list.get(i4);
                    i0b i0bVarComponent1 = sccVar.component1();
                    i0b i0bVarComponent2 = sccVar.component2();
                    C5897fo anchor$runtime_release2 = i0bVarComponent1.getAnchor$runtime_release();
                    int iAnchorIndex = i0bVarComponent1.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                    n78 n78Var = new n78(i3, 1, null);
                    this.f33406O.determineMovableContentNodeIndex(n78Var, anchor$runtime_release2);
                    if (i0bVarComponent2 == null) {
                        if (md8.areEqual(i0bVarComponent1.getSlotTable$runtime_release(), this.f33401J)) {
                            createFreshInsertTable();
                        }
                        lrf lrfVarOpenReader = i0bVarComponent1.getSlotTable$runtime_release().openReader();
                        try {
                            lrfVarOpenReader.reposition(iAnchorIndex);
                            this.f33406O.moveReaderToAbsolute(iAnchorIndex);
                            wt1 wt1Var5 = new wt1();
                            lrfVar2 = lrfVarOpenReader;
                            try {
                                m10121a(this, null, null, null, null, new C5376d(wt1Var5, lrfVarOpenReader, i0bVarComponent1), 15, null);
                                this.f33406O.includeOperationsIn(wt1Var5, n78Var);
                                bth bthVar = bth.f14751a;
                                lrfVar2.close();
                                i = size;
                                bm2Var2 = bm2Var5;
                                wt1Var2 = changeList;
                                i2 = i4;
                            } catch (Throwable th) {
                                th = th;
                                lrfVar2.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            lrfVar2 = lrfVarOpenReader;
                        }
                    } else {
                        h0b h0bVarMovableContentStateResolve$runtime_release = this.f33412c.movableContentStateResolve$runtime_release(i0bVarComponent2);
                        if (h0bVarMovableContentStateResolve$runtime_release == null || (slotTable$runtime_release = h0bVarMovableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                            slotTable$runtime_release = i0bVarComponent2.getSlotTable$runtime_release();
                        }
                        if (h0bVarMovableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = h0bVarMovableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(0)) == null) {
                            anchor$runtime_release = i0bVarComponent2.getAnchor$runtime_release();
                        }
                        List<? extends Object> listCollectNodesFrom = gm2.collectNodesFrom(slotTable$runtime_release, anchor$runtime_release);
                        if (!listCollectNodesFrom.isEmpty()) {
                            this.f33406O.copyNodesToNewAnchorLocation(listCollectNodesFrom, n78Var);
                            if (md8.areEqual(i0bVarComponent1.getSlotTable$runtime_release(), this.f33413d)) {
                                int iAnchorIndex2 = this.f33413d.anchorIndex(anchor$runtime_release2);
                                updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                            }
                        }
                        this.f33406O.copySlotTableToAnchorLocation(h0bVarMovableContentStateResolve$runtime_release, this.f33412c, i0bVarComponent2, i0bVarComponent1);
                        lrf lrfVarOpenReader2 = slotTable$runtime_release.openReader();
                        try {
                            lrf reader$runtime_release = getReader$runtime_release();
                            int[] iArr2 = this.f33424o;
                            v68 v68Var2 = this.f33432w;
                            this.f33424o = null;
                            this.f33432w = null;
                            try {
                                setReader$runtime_release(lrfVarOpenReader2);
                                int iAnchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                                lrfVarOpenReader2.reposition(iAnchorIndex3);
                                this.f33406O.moveReaderToAbsolute(iAnchorIndex3);
                                wt1 wt1Var6 = new wt1();
                                bm2 bm2Var6 = this.f33406O;
                                wt1 changeList2 = bm2Var6.getChangeList();
                                try {
                                    bm2Var6.setChangeList(wt1Var6);
                                    bm2Var4 = this.f33406O;
                                    bm2Var2 = bm2Var5;
                                } catch (Throwable th3) {
                                    th = th3;
                                    v68Var = v68Var2;
                                    iArr = iArr2;
                                    lrfVar = lrfVarOpenReader2;
                                }
                                try {
                                    boolean implicitRootStart = bm2Var4.getImplicitRootStart();
                                    i = size;
                                    try {
                                        bm2Var4.setImplicitRootStart(false);
                                        composition$runtime_release = i0bVarComponent2.getComposition$runtime_release();
                                        composition$runtime_release2 = i0bVarComponent1.getComposition$runtime_release();
                                        numValueOf = Integer.valueOf(lrfVarOpenReader2.getCurrentGroup());
                                        wt1Var2 = changeList;
                                        wt1Var3 = changeList2;
                                        i2 = i4;
                                        lrfVar = lrfVarOpenReader2;
                                        bm2Var3 = bm2Var6;
                                        iArr = iArr2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        v68Var = v68Var2;
                                        iArr = iArr2;
                                        lrfVar = lrfVarOpenReader2;
                                        wt1Var3 = changeList2;
                                        bm2Var3 = bm2Var6;
                                    }
                                    try {
                                        recomposeMovableContent(composition$runtime_release, composition$runtime_release2, numValueOf, i0bVarComponent2.getInvalidations$runtime_release(), new C5377e(i0bVarComponent1));
                                        try {
                                            bm2Var4.setImplicitRootStart(implicitRootStart);
                                            try {
                                                bm2Var3.setChangeList(wt1Var3);
                                                this.f33406O.includeOperationsIn(wt1Var6, n78Var);
                                                bth bthVar2 = bth.f14751a;
                                                try {
                                                    setReader$runtime_release(reader$runtime_release);
                                                    this.f33424o = iArr;
                                                    this.f33432w = v68Var2;
                                                    try {
                                                        lrfVar.close();
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        bm2Var = bm2Var2;
                                                        wt1Var = wt1Var2;
                                                        bm2Var.setChangeList(wt1Var);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    lrfVar.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                v68Var = v68Var2;
                                                setReader$runtime_release(reader$runtime_release);
                                                this.f33424o = iArr;
                                                this.f33432w = v68Var;
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            v68Var = v68Var2;
                                            try {
                                                bm2Var3.setChangeList(wt1Var3);
                                                throw th;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                setReader$runtime_release(reader$runtime_release);
                                                this.f33424o = iArr;
                                                this.f33432w = v68Var;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        v68Var = v68Var2;
                                        try {
                                            bm2Var4.setImplicitRootStart(implicitRootStart);
                                            throw th;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            bm2Var3.setChangeList(wt1Var3);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    v68Var = v68Var2;
                                    iArr = iArr2;
                                    lrfVar = lrfVarOpenReader2;
                                    wt1Var3 = changeList2;
                                    bm2Var3 = bm2Var6;
                                    bm2Var3.setChangeList(wt1Var3);
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                v68Var = v68Var2;
                                iArr = iArr2;
                                lrfVar = lrfVarOpenReader2;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            lrfVar = lrfVarOpenReader2;
                        }
                    }
                    this.f33406O.skipToEndOfCurrentGroup();
                    i4 = i2 + 1;
                    bm2Var5 = bm2Var2;
                    size = i;
                    changeList = wt1Var2;
                    i3 = 0;
                } catch (Throwable th15) {
                    th = th15;
                    bm2Var2 = bm2Var5;
                    wt1Var2 = changeList;
                }
            }
            bm2 bm2Var7 = bm2Var5;
            wt1 wt1Var7 = changeList;
            this.f33406O.endMovableContentPlacement();
            this.f33406O.moveReaderToAbsolute(0);
            bm2Var7.setChangeList(wt1Var7);
        } catch (Throwable th16) {
            th = th16;
            bm2Var = bm2Var5;
            wt1Var = changeList;
        }
    }

    private final int insertedGroupVirtualIndex(int i) {
        return (-2) - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeMovableContentLambda(f0b<Object> f0bVar, qqc qqcVar, Object obj, boolean z) {
        startMovableGroup(g0b.f38116a, f0bVar);
        updateSlot(obj);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.f33410S = g0b.f38116a;
            boolean z2 = false;
            if (getInserting()) {
                prf.markGroup$default(this.f33402K, 0, 1, null);
            }
            if (!getInserting() && !md8.areEqual(this.f33400I.getGroupAux(), qqcVar)) {
                z2 = true;
            }
            if (z2) {
                recordProviderUpdate(qqcVar);
            }
            m28825startBaiHCIY(202, gm2.getCompositionLocalMap(), pb7.f70211b.m31770getGroupULZAiWs(), qqcVar);
            this.f33404M = null;
            if (!getInserting() || z) {
                boolean z3 = this.f33433x;
                this.f33433x = z2;
                C5737fe.invokeComposable(this, mk2.composableLambdaInstance(316014703, true, new C5378f(f0bVar, obj)));
                this.f33433x = z3;
            } else {
                this.f33403L = true;
                prf prfVar = this.f33402K;
                this.f33412c.insertMovableContent$runtime_release(new i0b(f0bVar, obj, getComposition(), this.f33401J, prfVar.anchor(prfVar.parent(prfVar.getParent())), l82.emptyList(), currentCompositionLocalScope()));
            }
            endGroup();
            this.f33404M = null;
            this.f33410S = compoundKeyHash;
            endMovableGroup();
        } catch (Throwable th) {
            endGroup();
            this.f33404M = null;
            this.f33410S = compoundKeyHash;
            endMovableGroup();
            throw th;
        }
    }

    private final Object nodeAt(lrf lrfVar, int i) {
        return lrfVar.node(i);
    }

    private final int nodeIndexOf(int i, int i2, int i3, int i4) {
        int iParent = this.f33400I.parent(i2);
        while (iParent != i3 && !this.f33400I.isNode(iParent)) {
            iParent = this.f33400I.parent(iParent);
        }
        if (this.f33400I.isNode(iParent)) {
            i4 = 0;
        }
        if (iParent == i2) {
            return i4;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.f33400I.nodeCount(i2)) + i4;
        loop1: while (i4 < iUpdatedNodeCount && iParent != i) {
            iParent++;
            while (iParent < i) {
                int iGroupSize = this.f33400I.groupSize(iParent) + iParent;
                if (i >= iGroupSize) {
                    i4 += this.f33400I.isNode(iParent) ? 1 : updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return i4;
    }

    private final int rGroupIndexOf(int i) {
        int iParent = this.f33400I.parent(i) + 1;
        int i2 = 0;
        while (iParent < i) {
            if (!this.f33400I.hasObjectKey(iParent)) {
                i2++;
            }
            iParent += this.f33400I.groupSize(iParent);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <R> R recomposeMovableContent(p000.sz2 r7, p000.sz2 r8, java.lang.Integer r9, java.util.List<? extends p000.scc<p000.ssd, ? extends java.lang.Object>> r10, p000.ny6<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.f33398G
            int r1 = r6.f33420k
            r2 = 1
            r6.f33398G = r2     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r6.f33420k = r2     // Catch: java.lang.Throwable -> L26
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L26
        Le:
            if (r2 >= r3) goto L2f
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L26
            scc r4 = (p000.scc) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.component1()     // Catch: java.lang.Throwable -> L26
            ssd r5 = (p000.ssd) r5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.component2()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            r6.tryImminentInvalidation$runtime_release(r5, r4)     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r7 = move-exception
            goto L48
        L28:
            r4 = 0
            r6.tryImminentInvalidation$runtime_release(r5, r4)     // Catch: java.lang.Throwable -> L26
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            if (r7 == 0) goto L3f
            if (r9 == 0) goto L38
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L26
            goto L39
        L38:
            r9 = -1
        L39:
            java.lang.Object r7 = r7.delegateInvalidations(r8, r9, r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L43
        L3f:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L26
        L43:
            r6.f33398G = r0
            r6.f33420k = r1
            return r7
        L48:
            r6.f33398G = r0
            r6.f33420k = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.em2.recomposeMovableContent(sz2, sz2, java.lang.Integer, java.util.List, ny6):java.lang.Object");
    }

    private final void recomposeToGroupEnd() {
        boolean z = this.f33398G;
        this.f33398G = true;
        int parent = this.f33400I.getParent();
        int iGroupSize = this.f33400I.groupSize(parent) + parent;
        int i = this.f33420k;
        int compoundKeyHash = getCompoundKeyHash();
        int i2 = this.f33421l;
        int i3 = this.f33422m;
        fe8 fe8VarFirstInRange = gm2.firstInRange(this.f33429t, this.f33400I.getCurrentGroup(), iGroupSize);
        boolean z2 = false;
        int i4 = parent;
        while (fe8VarFirstInRange != null) {
            int location = fe8VarFirstInRange.getLocation();
            gm2.removeLocation(this.f33429t, location);
            if (fe8VarFirstInRange.isInvalid()) {
                this.f33400I.reposition(location);
                int currentGroup = this.f33400I.getCurrentGroup();
                recordUpsAndDowns(i4, currentGroup, parent);
                this.f33420k = nodeIndexOf(location, currentGroup, parent, i);
                this.f33422m = rGroupIndexOf(currentGroup);
                int iParent = this.f33400I.parent(currentGroup);
                this.f33410S = compoundKeyOf(iParent, rGroupIndexOf(iParent), parent, compoundKeyHash);
                this.f33404M = null;
                fe8VarFirstInRange.getScope().compose(this);
                this.f33404M = null;
                this.f33400I.restoreParent(parent);
                i4 = currentGroup;
                z2 = true;
            } else {
                this.f33397F.push(fe8VarFirstInRange.getScope());
                fe8VarFirstInRange.getScope().rereadTrackedInstances();
                this.f33397F.pop();
            }
            fe8VarFirstInRange = gm2.firstInRange(this.f33429t, this.f33400I.getCurrentGroup(), iGroupSize);
        }
        if (z2) {
            recordUpsAndDowns(i4, parent, parent);
            this.f33400I.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.f33420k = i + iUpdatedNodeCount;
            this.f33421l = i2 + iUpdatedNodeCount;
            this.f33422m = i3;
        } else {
            skipReaderToGroupEnd();
        }
        this.f33410S = compoundKeyHash;
        this.f33398G = z;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.f33400I.getCurrentGroup());
        this.f33406O.removeCurrentGroup();
    }

    private final void recordInsert(C5897fo c5897fo) {
        if (this.f33408Q.isEmpty()) {
            this.f33406O.insertSlots(c5897fo, this.f33401J);
        } else {
            this.f33406O.insertSlots(c5897fo, this.f33401J, this.f33408Q);
            this.f33408Q = new l26();
        }
    }

    private final void recordProviderUpdate(qqc qqcVar) {
        v68<qqc> v68Var = this.f33432w;
        if (v68Var == null) {
            v68Var = new v68<>(0, 1, null);
            this.f33432w = v68Var;
        }
        v68Var.set(this.f33400I.getCurrentGroup(), qqcVar);
    }

    private final void recordUpsAndDowns(int i, int i2, int i3) {
        lrf lrfVar = this.f33400I;
        int iNearestCommonRootOf = gm2.nearestCommonRootOf(lrfVar, i, i2, i3);
        while (i > 0 && i != iNearestCommonRootOf) {
            if (lrfVar.isNode(i)) {
                this.f33406O.moveUp();
            }
            i = lrfVar.parent(i);
        }
        doRecordDownsFor(i2, iNearestCommonRootOf);
    }

    private final C5897fo rememberObserverAnchor() {
        int i;
        int i2;
        if (getInserting()) {
            if (!gm2.isAfterFirstChild(this.f33402K)) {
                return null;
            }
            int currentGroup = this.f33402K.getCurrentGroup() - 1;
            int iParent = this.f33402K.parent(currentGroup);
            while (true) {
                int i3 = iParent;
                i2 = currentGroup;
                currentGroup = i3;
                if (currentGroup == this.f33402K.getParent() || currentGroup < 0) {
                    break;
                }
                iParent = this.f33402K.parent(currentGroup);
            }
            return this.f33402K.anchor(i2);
        }
        if (!gm2.isAfterFirstChild(this.f33400I)) {
            return null;
        }
        int currentGroup2 = this.f33400I.getCurrentGroup() - 1;
        int iParent2 = this.f33400I.parent(currentGroup2);
        while (true) {
            int i4 = iParent2;
            i = currentGroup2;
            currentGroup2 = i4;
            if (currentGroup2 == this.f33400I.getParent() || currentGroup2 < 0) {
                break;
            }
            iParent2 = this.f33400I.parent(currentGroup2);
        }
        return this.f33400I.anchor(i);
    }

    private final void reportAllMovableContent() {
        if (this.f33413d.containsMark()) {
            wt1 wt1Var = new wt1();
            this.f33405N = wt1Var;
            lrf lrfVarOpenReader = this.f33413d.openReader();
            try {
                this.f33400I = lrfVarOpenReader;
                bm2 bm2Var = this.f33406O;
                wt1 changeList = bm2Var.getChangeList();
                try {
                    bm2Var.setChangeList(wt1Var);
                    reportFreeMovableContent(0);
                    this.f33406O.releaseMovableContent();
                    bm2Var.setChangeList(changeList);
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    bm2Var.setChangeList(changeList);
                    throw th;
                }
            } finally {
                lrfVarOpenReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int i) {
        reportFreeMovableContent$reportGroup(this, i, false, 0);
        this.f33406O.endNodeMovement();
    }

    private static final int reportFreeMovableContent$reportGroup(em2 em2Var, int i, boolean z, int i2) {
        lrf lrfVar = em2Var.f33400I;
        if (!lrfVar.hasMark(i)) {
            if (!lrfVar.containsMark(i)) {
                if (lrfVar.isNode(i)) {
                    return 1;
                }
                return lrfVar.nodeCount(i);
            }
            int iGroupSize = lrfVar.groupSize(i) + i;
            int iReportFreeMovableContent$reportGroup = 0;
            for (int iGroupSize2 = i + 1; iGroupSize2 < iGroupSize; iGroupSize2 += lrfVar.groupSize(iGroupSize2)) {
                boolean zIsNode = lrfVar.isNode(iGroupSize2);
                if (zIsNode) {
                    em2Var.f33406O.endNodeMovement();
                    em2Var.f33406O.moveDown(lrfVar.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(em2Var, iGroupSize2, zIsNode || z, zIsNode ? 0 : i2 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    em2Var.f33406O.endNodeMovement();
                    em2Var.f33406O.moveUp();
                }
            }
            if (lrfVar.isNode(i)) {
                return 1;
            }
            return iReportFreeMovableContent$reportGroup;
        }
        int iGroupKey = lrfVar.groupKey(i);
        Object objGroupObjectKey = lrfVar.groupObjectKey(i);
        if (iGroupKey != 126665345 || !(objGroupObjectKey instanceof f0b)) {
            if (iGroupKey != 206 || !md8.areEqual(objGroupObjectKey, gm2.getReference())) {
                if (lrfVar.isNode(i)) {
                    return 1;
                }
                return lrfVar.nodeCount(i);
            }
            Object objGroupGet = lrfVar.groupGet(i, 0);
            C5373a c5373a = objGroupGet instanceof C5373a ? (C5373a) objGroupGet : null;
            if (c5373a != null) {
                for (em2 em2Var2 : c5373a.getRef().getComposers()) {
                    em2Var2.reportAllMovableContent();
                    em2Var.f33412c.reportRemovedComposition$runtime_release(em2Var2.getComposition());
                }
            }
            return lrfVar.nodeCount(i);
        }
        f0b f0bVar = (f0b) objGroupObjectKey;
        Object objGroupGet2 = lrfVar.groupGet(i, 0);
        C5897fo c5897foAnchor = lrfVar.anchor(i);
        List listFilterToRange = gm2.filterToRange(em2Var.f33429t, i, lrfVar.groupSize(i) + i);
        ArrayList arrayList = new ArrayList(listFilterToRange.size());
        int size = listFilterToRange.size();
        for (int i3 = 0; i3 < size; i3++) {
            fe8 fe8Var = (fe8) listFilterToRange.get(i3);
            arrayList.add(vkh.m24050to(fe8Var.getScope(), fe8Var.getInstances()));
        }
        i0b i0bVar = new i0b(f0bVar, objGroupGet2, em2Var.getComposition(), em2Var.f33413d, c5897foAnchor, arrayList, em2Var.currentCompositionLocalScope(i));
        em2Var.f33412c.deletedMovableContent$runtime_release(i0bVar);
        em2Var.f33406O.recordSlotEditing();
        em2Var.f33406O.releaseMovableGroupAtCurrent(em2Var.getComposition(), em2Var.f33412c, i0bVar);
        if (!z) {
            return lrfVar.nodeCount(i);
        }
        em2Var.f33406O.endNodeMovementAndDeleteNode(i2, i);
        return 0;
    }

    private final void skipGroup() {
        this.f33421l += this.f33400I.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.f33421l = this.f33400I.getParentNodes();
        this.f33400I.skipToGroupEnd();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX INFO: renamed from: start-BaiHCIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m28825startBaiHCIY(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.em2.m28825startBaiHCIY(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void startGroup(int i) {
        m28825startBaiHCIY(i, null, pb7.f70211b.m31770getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean z, Object obj) {
        if (z) {
            this.f33400I.startNode();
            return;
        }
        if (obj != null && this.f33400I.getGroupAux() != obj) {
            this.f33406O.updateAuxData(obj);
        }
        this.f33400I.startGroup();
    }

    private final void startRoot() {
        this.f33422m = 0;
        this.f33400I = this.f33413d.openReader();
        startGroup(100);
        this.f33412c.startComposing$runtime_release();
        this.f33431v = this.f33412c.getCompositionLocalScope$runtime_release();
        this.f33434y.push(gm2.asInt(this.f33433x));
        this.f33433x = changed(this.f33431v);
        this.f33404M = null;
        if (!this.f33426q) {
            this.f33426q = this.f33412c.getCollectingParameterInformation$runtime_release();
        }
        if (!this.f33395D) {
            this.f33395D = this.f33412c.getCollectingSourceInformation$runtime_release();
        }
        Set<fn2> set = (Set) rn2.read(this.f33431v, e58.getLocalInspectionTables());
        if (set != null) {
            set.add(this.f33413d);
            this.f33412c.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.f33412c.getCompoundHashKey$runtime_release());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i, int i2, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.f33410S = Integer.rotateLeft(((Enum) obj).ordinal() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
                return;
            } else {
                this.f33410S = Integer.rotateLeft(obj.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
                return;
            }
        }
        if (obj2 == null || i != 207 || md8.areEqual(obj2, zl2.f105372a.getEmpty())) {
            this.f33410S = Integer.rotateLeft(i ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i2;
        } else {
            this.f33410S = Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i2;
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i, int i2) {
        this.f33410S = Integer.rotateLeft(i ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i2;
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i, int i2, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                int iOrdinal = ((Enum) obj).ordinal();
                this.f33410S = Integer.rotateRight(Integer.hashCode(iOrdinal) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            } else {
                int iHashCode = obj.hashCode();
                this.f33410S = Integer.rotateRight(Integer.hashCode(iHashCode) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            }
        }
        if (obj2 == null || i != 207 || md8.areEqual(obj2, zl2.f105372a.getEmpty())) {
            this.f33410S = Integer.rotateRight(Integer.hashCode(i) ^ Integer.rotateRight(i2 ^ getCompoundKeyHash(), 3), 3);
        } else {
            int iHashCode2 = obj2.hashCode();
            this.f33410S = Integer.rotateRight(Integer.hashCode(iHashCode2) ^ Integer.rotateRight(i2 ^ getCompoundKeyHash(), 3), 3);
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i, int i2) {
        this.f33410S = Integer.rotateRight(Integer.hashCode(i) ^ Integer.rotateRight(i2 ^ getCompoundKeyHash(), 3), 3);
    }

    private final void updateNodeCount(int i, int i2) {
        if (updatedNodeCount(i) != i2) {
            if (i < 0) {
                f5b f5bVar = this.f33425p;
                if (f5bVar == null) {
                    f5bVar = new f5b(0, 1, null);
                    this.f33425p = f5bVar;
                }
                f5bVar.set(i, i2);
                return;
            }
            int[] iArr = this.f33424o;
            if (iArr == null) {
                iArr = new int[this.f33400I.getSize()];
                u70.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.f33424o = iArr;
            }
            iArr[i] = i2;
        }
    }

    private final void updateNodeCountOverrides(int i, int i2) {
        int iUpdatedNodeCount = updatedNodeCount(i);
        if (iUpdatedNodeCount != i2) {
            int i3 = i2 - iUpdatedNodeCount;
            int size = this.f33418i.getSize() - 1;
            while (i != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(i) + i3;
                updateNodeCount(i, iUpdatedNodeCount2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        hmc hmcVarPeek = this.f33418i.peek(i4);
                        if (hmcVarPeek != null && hmcVarPeek.updateNodeCount(i, iUpdatedNodeCount2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f33400I.getParent();
                } else if (this.f33400I.isNode(i)) {
                    return;
                } else {
                    i = this.f33400I.parent(i);
                }
            }
        }
    }

    private final qqc updateProviderMapGroup(qqc qqcVar, qqc qqcVar2) {
        qqc.InterfaceC11587a interfaceC11587aBuilder = qqcVar.builder();
        interfaceC11587aBuilder.putAll(qqcVar2);
        qqc qqcVarBuild = interfaceC11587aBuilder.build();
        startGroup(gm2.f40176m, gm2.getProviderMaps());
        updateSlot(qqcVarBuild);
        updateSlot(qqcVar2);
        endGroup();
        return qqcVarBuild;
    }

    private final void updateSlot(Object obj) {
        nextSlot();
        updateValue(obj);
    }

    private final int updatedNodeCount(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f33424o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f33400I.nodeCount(i) : i2;
        }
        f5b f5bVar = this.f33425p;
        if (f5bVar == null || !f5bVar.contains(i)) {
            return 0;
        }
        return f5bVar.get(i);
    }

    private final void validateNodeExpected() {
        if (!this.f33428s) {
            gm2.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f33428s = false;
    }

    private final void validateNodeNotExpected() {
        if (this.f33428s) {
            gm2.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final <R> R withReader(lrf lrfVar, ny6<? extends R> ny6Var) {
        lrf reader$runtime_release = getReader$runtime_release();
        int[] iArr = this.f33424o;
        v68 v68Var = this.f33432w;
        this.f33424o = null;
        this.f33432w = null;
        try {
            setReader$runtime_release(lrfVar);
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            setReader$runtime_release(reader$runtime_release);
            this.f33424o = iArr;
            this.f33432w = v68Var;
            o28.finallyEnd(1);
        }
    }

    @Override // p000.zl2
    public <V, T> void apply(V v, @yfb gz6<? super T, ? super V, bth> gz6Var) {
        if (getInserting()) {
            this.f33408Q.updateNode(v, gz6Var);
        } else {
            this.f33406O.updateNode(v, gz6Var);
        }
    }

    @Override // p000.zl2
    @yfb
    public dn2 buildContext() {
        startGroup(gm2.f40178o, gm2.getReference());
        if (getInserting()) {
            prf.markGroup$default(this.f33402K, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        C5373a c5373a = objNextSlot instanceof C5373a ? (C5373a) objNextSlot : null;
        if (c5373a == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z = this.f33426q;
            boolean z2 = this.f33395D;
            sz2 composition = getComposition();
            hn2 hn2Var = composition instanceof hn2 ? (hn2) composition : null;
            c5373a = new C5373a(new C5374b(compoundKeyHash, z, z2, hn2Var != null ? hn2Var.getObserverHolder$runtime_release() : null));
            updateValue(c5373a);
        }
        c5373a.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return c5373a.getRef();
    }

    @fl2
    public final <T> T cache(boolean z, @yfb ny6<? extends T> ny6Var) {
        T t = (T) nextSlotForCache();
        if (t != zl2.f105372a.getEmpty() && !z) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        updateCachedValue(tInvoke);
        return tInvoke;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(@gib Object obj) {
        if (md8.areEqual(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changedInstance(@gib Object obj) {
        if (nextSlot() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.f33432w = null;
    }

    @Override // p000.zl2
    public void collectParameterInformation() {
        this.f33426q = true;
        this.f33395D = true;
        this.f33413d.collectSourceInformation();
        this.f33401J.collectSourceInformation();
        this.f33402K.updateToTableMaps();
    }

    public final void composeContent$runtime_release(@yfb wqe<ssd, Object> wqeVar, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        if (!this.f33415f.isEmpty()) {
            gm2.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        doCompose(wqeVar, gz6Var);
    }

    @Override // p000.zl2
    @ga8
    public <T> T consume(@yfb kn2<T> kn2Var) {
        return (T) rn2.read(currentCompositionLocalScope(), kn2Var);
    }

    @Override // p000.zl2
    public <T> void createNode(@yfb ny6<? extends T> ny6Var) {
        validateNodeExpected();
        if (!getInserting()) {
            gm2.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.f33423n.peek();
        prf prfVar = this.f33402K;
        C5897fo c5897foAnchor = prfVar.anchor(prfVar.getParent());
        this.f33421l++;
        this.f33408Q.createAndInsertNode(ny6Var, iPeek, c5897foAnchor);
    }

    public final void deactivate$runtime_release() {
        this.f33397F.clear();
        this.f33429t.clear();
        this.f33415f.clear();
        this.f33432w = null;
    }

    @Override // p000.zl2
    @fl2
    public void deactivateToEndGroup(boolean z) {
        if (!(this.f33421l == 0)) {
            gm2.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.f33400I.getCurrentGroup();
        int currentEnd = this.f33400I.getCurrentEnd();
        this.f33406O.deactivateCurrentGroup();
        gm2.removeRange(this.f33429t, currentGroup, currentEnd);
        this.f33400I.skipToGroupEnd();
    }

    @Override // p000.zl2
    public void disableReusing() {
        this.f33435z = false;
    }

    @Override // p000.zl2
    public void disableSourceInformation() {
        this.f33395D = false;
    }

    public final void dispose$runtime_release() {
        q5h q5hVar = q5h.f73293a;
        Object objBeginSection = q5hVar.beginSection("Compose:Composer.dispose");
        try {
            this.f33412c.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.f33399H = true;
            bth bthVar = bth.f14751a;
            q5hVar.endSection(objBeginSection);
        } catch (Throwable th) {
            q5h.f73293a.endSection(objBeginSection);
            throw th;
        }
    }

    @Override // p000.zl2
    public void enableReusing() {
        this.f33435z = this.f33392A >= 0;
    }

    @Override // p000.zl2
    @fl2
    public void endDefaults() {
        endGroup();
        ssd currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // p000.zl2
    @fl2
    public void endMovableGroup() {
        endGroup();
    }

    @Override // p000.zl2
    public void endNode() {
        end(true);
    }

    @Override // p000.zl2
    @ga8
    public void endProvider() {
        endGroup();
        endGroup();
        this.f33433x = gm2.asBool(this.f33434y.pop());
        this.f33404M = null;
    }

    @Override // p000.zl2
    @ga8
    public void endProviders() {
        endGroup();
        endGroup();
        this.f33433x = gm2.asBool(this.f33434y.pop());
        this.f33404M = null;
    }

    @Override // p000.zl2
    @fl2
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // p000.zl2
    @fl2
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // p000.zl2
    @gib
    @fl2
    public are endRestartGroup() {
        C5897fo c5897foAnchor;
        qy6<cn2, bth> qy6VarEnd;
        ssd ssdVar = null;
        ssd ssdVarPop = this.f33397F.isNotEmpty() ? this.f33397F.pop() : null;
        if (ssdVarPop != null) {
            ssdVarPop.setRequiresRecompose(false);
        }
        if (ssdVarPop != null && (qy6VarEnd = ssdVarPop.end(this.f33394C)) != null) {
            this.f33406O.endCompositionScope(qy6VarEnd, getComposition());
        }
        if (ssdVarPop != null && !ssdVarPop.getSkipped$runtime_release() && (ssdVarPop.getUsed() || this.f33426q)) {
            if (ssdVarPop.getAnchor() == null) {
                if (getInserting()) {
                    prf prfVar = this.f33402K;
                    c5897foAnchor = prfVar.anchor(prfVar.getParent());
                } else {
                    lrf lrfVar = this.f33400I;
                    c5897foAnchor = lrfVar.anchor(lrfVar.getParent());
                }
                ssdVarPop.setAnchor(c5897foAnchor);
            }
            ssdVarPop.setDefaultsInvalid(false);
            ssdVar = ssdVarPop;
        }
        end(false);
        return ssdVar;
    }

    @Override // p000.zl2
    public void endReusableGroup() {
        if (this.f33435z && this.f33400I.getParent() == this.f33392A) {
            this.f33392A = -1;
            this.f33435z = false;
        }
        end(false);
    }

    public final void endReuseFromRoot() {
        if (!(!this.f33398G && this.f33392A == 100)) {
            a8d.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f33392A = -1;
        this.f33435z = false;
    }

    @Override // p000.zl2
    public void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            prf prfVar = this.f33402K;
            while (true) {
                int parent = prfVar.getParent();
                if (parent <= i2) {
                    return;
                } else {
                    end(prfVar.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                prf prfVar2 = this.f33402K;
                while (getInserting()) {
                    end(prfVar2.isNode(prfVar2.getParent()));
                }
            }
            lrf lrfVar = this.f33400I;
            while (true) {
                int parent2 = lrfVar.getParent();
                if (parent2 <= i) {
                    return;
                } else {
                    end(lrfVar.isNode(parent2));
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.f33426q) {
            return false;
        }
        this.f33426q = true;
        this.f33427r = true;
        return true;
    }

    @Override // p000.zl2
    @yfb
    public p40<?> getApplier() {
        return this.f33411b;
    }

    @Override // p000.zl2
    @yfb
    @dpg
    public e13 getApplyCoroutineContext() {
        return this.f33412c.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.f33393B > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.f33415f.getSize();
    }

    @Override // p000.zl2
    @yfb
    public sz2 getComposition() {
        return this.f33417h;
    }

    @Override // p000.zl2
    @yfb
    public fn2 getCompositionData() {
        return this.f33413d;
    }

    @Override // p000.zl2
    public int getCompoundKeyHash() {
        return this.f33410S;
    }

    @Override // p000.zl2
    @yfb
    public qn2 getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // p000.zl2
    public int getCurrentMarker() {
        return getInserting() ? -this.f33402K.getParent() : this.f33400I.getParent();
    }

    @gib
    public final ssd getCurrentRecomposeScope$runtime_release() {
        i0g<ssd> i0gVar = this.f33397F;
        if (this.f33393B == 0 && i0gVar.isNotEmpty()) {
            return i0gVar.peek();
        }
        return null;
    }

    @Override // p000.zl2
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.f33433x) {
            return true;
        }
        ssd currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @gib
    public final wt1 getDeferredChanges$runtime_release() {
        return this.f33405N;
    }

    public final boolean getHasInvalidations() {
        return !this.f33429t.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.f33415f.isNotEmpty();
    }

    @yfb
    public final mrf getInsertTable$runtime_release() {
        return this.f33401J;
    }

    @Override // p000.zl2
    public boolean getInserting() {
        return this.f33409R;
    }

    @yfb
    public final lrf getReader$runtime_release() {
        return this.f33400I;
    }

    @Override // p000.zl2
    @gib
    public rsd getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // p000.zl2
    @gib
    public Object getRecomposeScopeIdentity() {
        ssd currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // p000.zl2
    public boolean getSkipping() {
        ssd currentRecomposeScope$runtime_release;
        return (getInserting() || this.f33435z || this.f33433x || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.f33427r) ? false : true;
    }

    @Override // p000.zl2
    @ga8
    public void insertMovableContent(@yfb f0b<?> f0bVar, @gib Object obj) {
        md8.checkNotNull(f0bVar, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(f0bVar, currentCompositionLocalScope(), obj, false);
    }

    @Override // p000.zl2
    @ga8
    public void insertMovableContentReferences(@yfb List<scc<i0b, i0b>> list) {
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    public final boolean isComposing$runtime_release() {
        return this.f33398G;
    }

    public final boolean isDisposed$runtime_release() {
        return this.f33399H;
    }

    @Override // p000.zl2
    @fl2
    @yfb
    public Object joinKey(@gib Object obj, @gib Object obj2) {
        Object key = gm2.getKey(this.f33400I.getGroupObjectKey(), obj, obj2);
        return key == null ? new wj8(obj, obj2) : key;
    }

    @gib
    @yjd
    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return zl2.f105372a.getEmpty();
        }
        Object next = this.f33400I.next();
        return (!this.f33435z || (next instanceof i9e)) ? next : zl2.f105372a.getEmpty();
    }

    @gib
    @yjd
    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return zl2.f105372a.getEmpty();
        }
        Object next = this.f33400I.next();
        return (!this.f33435z || (next instanceof i9e)) ? next instanceof fyd ? ((fyd) next).getWrapped() : next : zl2.f105372a.getEmpty();
    }

    @dpg
    public final int parentKey$runtime_release() {
        if (getInserting()) {
            prf prfVar = this.f33402K;
            return prfVar.groupKey(prfVar.getParent());
        }
        lrf lrfVar = this.f33400I;
        return lrfVar.groupKey(lrfVar.getParent());
    }

    public final void prepareCompose$runtime_release(@yfb ny6<bth> ny6Var) {
        if (this.f33398G) {
            gm2.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.f33398G = true;
        try {
            ny6Var.invoke();
        } finally {
            this.f33398G = false;
        }
    }

    public final boolean recompose$runtime_release(@yfb wqe<ssd, Object> wqeVar) {
        if (!this.f33415f.isEmpty()) {
            gm2.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (wqeVar.getSize() <= 0 && this.f33429t.isEmpty() && !this.f33427r) {
            return false;
        }
        doCompose(wqeVar, null);
        return this.f33415f.isNotEmpty();
    }

    @Override // p000.zl2
    public void recordSideEffect(@yfb ny6<bth> ny6Var) {
        this.f33406O.sideEffect(ny6Var);
    }

    @Override // p000.zl2
    public void recordUsed(@yfb rsd rsdVar) {
        ssd ssdVar = rsdVar instanceof ssd ? (ssd) rsdVar : null;
        if (ssdVar == null) {
            return;
        }
        ssdVar.setUsed(true);
    }

    @Override // p000.zl2
    @gib
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    public final void setDeferredChanges$runtime_release(@gib wt1 wt1Var) {
        this.f33405N = wt1Var;
    }

    public final void setInsertTable$runtime_release(@yfb mrf mrfVar) {
        this.f33401J = mrfVar;
    }

    public final void setReader$runtime_release(@yfb lrf lrfVar) {
        this.f33400I = lrfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    @Override // p000.zl2
    @p000.fl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void skipCurrentGroup() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.em2.skipCurrentGroup():void");
    }

    @Override // p000.zl2
    @fl2
    public void skipToGroupEnd() {
        if (!(this.f33421l == 0)) {
            gm2.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        ssd currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.f33429t.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // p000.zl2
    @fl2
    public void sourceInformation(@yfb String str) {
        if (getInserting() && this.f33395D) {
            this.f33402K.recordGroupSourceInformation(str);
        }
    }

    @Override // p000.zl2
    @fl2
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.f33395D) {
            this.f33402K.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // p000.zl2
    @fl2
    public void sourceInformationMarkerStart(int i, @yfb String str) {
        if (getInserting() && this.f33395D) {
            this.f33402K.recordGrouplessCallSourceInformationStart(i, str);
        }
    }

    public final int stacksSize$runtime_release() {
        return this.f33430u.getSize() + this.f33397F.getSize() + this.f33434y.getSize() + this.f33418i.getSize() + this.f33423n.getSize();
    }

    @Override // p000.zl2
    @fl2
    public void startDefaults() {
        m28825startBaiHCIY(gm2.f40167d, null, pb7.f70211b.m31770getGroupULZAiWs(), null);
    }

    @Override // p000.zl2
    @fl2
    public void startMovableGroup(int i, @gib Object obj) {
        m28825startBaiHCIY(i, obj, pb7.f70211b.m31770getGroupULZAiWs(), null);
    }

    @Override // p000.zl2
    public void startNode() {
        m28825startBaiHCIY(125, null, pb7.f70211b.m31771getNodeULZAiWs(), null);
        this.f33428s = true;
    }

    @Override // p000.zl2
    @ga8
    public void startProvider(@yfb did<?> didVar) {
        l2i<?> l2iVar;
        qqc qqcVarCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, gm2.getProvider());
        Object objRememberedValue = rememberedValue();
        if (md8.areEqual(objRememberedValue, zl2.f105372a.getEmpty())) {
            l2iVar = null;
        } else {
            md8.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            l2iVar = (l2i) objRememberedValue;
        }
        kn2<?> compositionLocal = didVar.getCompositionLocal();
        md8.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        md8.checkNotNull(didVar, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        l2i<?> l2iVarUpdatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(didVar, l2iVar);
        boolean zAreEqual = md8.areEqual(l2iVarUpdatedStateOf$runtime_release, l2iVar);
        if (!zAreEqual) {
            updateRememberedValue(l2iVarUpdatedStateOf$runtime_release);
        }
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            if (didVar.getCanOverride() || !rn2.contains(qqcVarCurrentCompositionLocalScope, compositionLocal)) {
                qqcVarCurrentCompositionLocalScope = qqcVarCurrentCompositionLocalScope.putValue(compositionLocal, l2iVarUpdatedStateOf$runtime_release);
            }
            this.f33403L = true;
        } else {
            lrf lrfVar = this.f33400I;
            Object objGroupAux = lrfVar.groupAux(lrfVar.getCurrentGroup());
            md8.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            qqc qqcVar = (qqc) objGroupAux;
            qqcVarCurrentCompositionLocalScope = (!(getSkipping() && zAreEqual) && (didVar.getCanOverride() || !rn2.contains(qqcVarCurrentCompositionLocalScope, compositionLocal))) ? qqcVarCurrentCompositionLocalScope.putValue(compositionLocal, l2iVarUpdatedStateOf$runtime_release) : qqcVar;
            if (!this.f33435z && qqcVar == qqcVarCurrentCompositionLocalScope) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && !getInserting()) {
            recordProviderUpdate(qqcVarCurrentCompositionLocalScope);
        }
        this.f33434y.push(gm2.asInt(this.f33433x));
        this.f33433x = z2;
        this.f33404M = qqcVarCurrentCompositionLocalScope;
        m28825startBaiHCIY(202, gm2.getCompositionLocalMap(), pb7.f70211b.m31770getGroupULZAiWs(), qqcVarCurrentCompositionLocalScope);
    }

    @Override // p000.zl2
    @ga8
    public void startProviders(@yfb did<?>[] didVarArr) {
        qqc qqcVarUpdateProviderMapGroup;
        qqc qqcVarCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, gm2.getProvider());
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            qqcVarUpdateProviderMapGroup = updateProviderMapGroup(qqcVarCurrentCompositionLocalScope, rn2.updateCompositionMap$default(didVarArr, qqcVarCurrentCompositionLocalScope, null, 4, null));
            this.f33403L = true;
        } else {
            Object objGroupGet = this.f33400I.groupGet(0);
            md8.checkNotNull(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            qqc qqcVar = (qqc) objGroupGet;
            Object objGroupGet2 = this.f33400I.groupGet(1);
            md8.checkNotNull(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            qqc qqcVar2 = (qqc) objGroupGet2;
            qqc qqcVarUpdateCompositionMap = rn2.updateCompositionMap(didVarArr, qqcVarCurrentCompositionLocalScope, qqcVar2);
            if (getSkipping() && !this.f33435z && md8.areEqual(qqcVar2, qqcVarUpdateCompositionMap)) {
                skipGroup();
                qqcVarUpdateProviderMapGroup = qqcVar;
            } else {
                qqcVarUpdateProviderMapGroup = updateProviderMapGroup(qqcVarCurrentCompositionLocalScope, qqcVarUpdateCompositionMap);
                if (!this.f33435z && md8.areEqual(qqcVarUpdateProviderMapGroup, qqcVar)) {
                    z = false;
                }
                z2 = z;
            }
        }
        if (z2 && !getInserting()) {
            recordProviderUpdate(qqcVarUpdateProviderMapGroup);
        }
        this.f33434y.push(gm2.asInt(this.f33433x));
        this.f33433x = z2;
        this.f33404M = qqcVarUpdateProviderMapGroup;
        m28825startBaiHCIY(202, gm2.getCompositionLocalMap(), pb7.f70211b.m31770getGroupULZAiWs(), qqcVarUpdateProviderMapGroup);
    }

    @Override // p000.zl2
    @fl2
    public void startReplaceGroup(int i) {
        if (this.f33419j != null) {
            m28825startBaiHCIY(i, null, pb7.f70211b.m31770getGroupULZAiWs(), null);
            return;
        }
        validateNodeNotExpected();
        this.f33410S = this.f33422m ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ i, 3);
        this.f33422m++;
        lrf lrfVar = this.f33400I;
        if (getInserting()) {
            lrfVar.beginEmpty();
            this.f33402K.startGroup(i, zl2.f105372a.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (lrfVar.getGroupKey() == i && !lrfVar.getHasObjectKey()) {
            lrfVar.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!lrfVar.isGroupEnd()) {
            int i2 = this.f33420k;
            int currentGroup = lrfVar.getCurrentGroup();
            recordDelete();
            this.f33406O.removeNode(i2, lrfVar.skipGroup());
            gm2.removeRange(this.f33429t, currentGroup, lrfVar.getCurrentGroup());
        }
        lrfVar.beginEmpty();
        this.f33409R = true;
        this.f33404M = null;
        ensureWriter();
        prf prfVar = this.f33402K;
        prfVar.beginInsert();
        int currentGroup2 = prfVar.getCurrentGroup();
        prfVar.startGroup(i, zl2.f105372a.getEmpty());
        this.f33407P = prfVar.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // p000.zl2
    @fl2
    public void startReplaceableGroup(int i) {
        m28825startBaiHCIY(i, null, pb7.f70211b.m31770getGroupULZAiWs(), null);
    }

    @Override // p000.zl2
    @fl2
    @yfb
    public zl2 startRestartGroup(int i) {
        startReplaceGroup(i);
        addRecomposeScope();
        return this;
    }

    @Override // p000.zl2
    public void startReusableGroup(int i, @gib Object obj) {
        if (!getInserting() && this.f33400I.getGroupKey() == i && !md8.areEqual(this.f33400I.getGroupAux(), obj) && this.f33392A < 0) {
            this.f33392A = this.f33400I.getCurrentGroup();
            this.f33435z = true;
        }
        m28825startBaiHCIY(i, null, pb7.f70211b.m31770getGroupULZAiWs(), obj);
    }

    @Override // p000.zl2
    public void startReusableNode() {
        m28825startBaiHCIY(125, null, pb7.f70211b.m31772getReusableNodeULZAiWs(), null);
        this.f33428s = true;
    }

    public final void startReuseFromRoot() {
        this.f33392A = 100;
        this.f33435z = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@yfb ssd ssdVar, @gib Object obj) {
        C5897fo anchor = ssdVar.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.f33400I.getTable$runtime_release());
        if (!this.f33398G || indexFor < this.f33400I.getCurrentGroup()) {
            return false;
        }
        gm2.insertIfMissing(this.f33429t, indexFor, ssdVar, obj);
        return true;
    }

    @yjd
    public final void updateCachedValue(@gib Object obj) {
        if (obj instanceof eyd) {
            if (getInserting()) {
                this.f33406O.remember((eyd) obj);
            }
            this.f33414e.add(obj);
            obj = new fyd((eyd) obj, rememberObserverAnchor());
        }
        updateValue(obj);
    }

    @Override // p000.zl2
    public void updateRememberedValue(@gib Object obj) {
        updateCachedValue(obj);
    }

    @yjd
    public final void updateValue(@gib Object obj) {
        if (getInserting()) {
            this.f33402K.update(obj);
            return;
        }
        if (!this.f33400I.getHadNext()) {
            bm2 bm2Var = this.f33406O;
            lrf lrfVar = this.f33400I;
            bm2Var.appendValue(lrfVar.anchor(lrfVar.getParent()), obj);
            return;
        }
        int groupSlotIndex = this.f33400I.getGroupSlotIndex() - 1;
        if (!this.f33406O.getPastParent()) {
            this.f33406O.updateValue(obj, groupSlotIndex);
            return;
        }
        bm2 bm2Var2 = this.f33406O;
        lrf lrfVar2 = this.f33400I;
        bm2Var2.updateAnchoredValue(obj, lrfVar2.anchor(lrfVar2.getParent()), groupSlotIndex);
    }

    @Override // p000.zl2
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            gm2.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.f33400I);
        this.f33406O.moveDown(node);
        if (this.f33435z && (node instanceof pl2)) {
            this.f33406O.useNode(node);
        }
    }

    public final void verifyConsistent$runtime_release() {
        this.f33401J.verifyWellFormed();
    }

    private final void startGroup(int i, Object obj) {
        m28825startBaiHCIY(i, obj, pb7.f70211b.m31770getGroupULZAiWs(), null);
    }

    private final qqc currentCompositionLocalScope(int i) {
        qqc qqcVar;
        if (getInserting() && this.f33403L) {
            int parent = this.f33402K.getParent();
            while (parent > 0) {
                if (this.f33402K.groupKey(parent) == 202 && md8.areEqual(this.f33402K.groupObjectKey(parent), gm2.getCompositionLocalMap())) {
                    Object objGroupAux = this.f33402K.groupAux(parent);
                    md8.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    qqc qqcVar2 = (qqc) objGroupAux;
                    this.f33404M = qqcVar2;
                    return qqcVar2;
                }
                parent = this.f33402K.parent(parent);
            }
        }
        if (this.f33400I.getSize() > 0) {
            while (i > 0) {
                if (this.f33400I.groupKey(i) == 202 && md8.areEqual(this.f33400I.groupObjectKey(i), gm2.getCompositionLocalMap())) {
                    v68<qqc> v68Var = this.f33432w;
                    if (v68Var == null || (qqcVar = v68Var.get(i)) == null) {
                        Object objGroupAux2 = this.f33400I.groupAux(i);
                        md8.checkNotNull(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        qqcVar = (qqc) objGroupAux2;
                    }
                    this.f33404M = qqcVar;
                    return qqcVar;
                }
                i = this.f33400I.parent(i);
            }
        }
        qqc qqcVar3 = this.f33431v;
        this.f33404M = qqcVar3;
        return qqcVar3;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(char c) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && c == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c));
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(byte b) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && b == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b));
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(short s) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && s == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s));
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(boolean z) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && z == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(float f) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && f == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(long j) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && j == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(double d) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && d == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d));
        return true;
    }

    @Override // p000.zl2
    @fl2
    public boolean changed(int i) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && i == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }
}
