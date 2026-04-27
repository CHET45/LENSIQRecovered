package p000;

import java.util.List;
import org.opencv.videoio.Videoio;
import p000.i09;
import p000.ssf;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,961:1\n81#2:962\n107#2,2:963\n81#2:983\n81#2:984\n81#2:985\n107#2,2:986\n81#2:988\n81#2:989\n107#2,2:990\n81#2:992\n107#2,2:993\n868#3,4:965\n868#3,4:969\n868#3,4:973\n868#3,4:995\n868#3,4:1000\n75#4:977\n108#4,2:978\n75#4:980\n108#4,2:981\n1#5:999\n602#6,8:1004\n602#6,8:1012\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n186#1:962\n186#1:963,2\n390#1:983\n407#1:984\n457#1:985\n457#1:986,2\n479#1:988\n645#1:989\n645#1:990,2\n647#1:992\n647#1:993,2\n221#1:965,4\n268#1:969,4\n277#1:973,4\n668#1:995,4\n683#1:1000,4\n378#1:977\n378#1:978,2\n380#1:980\n380#1:981,2\n689#1:1004,8\n816#1:1012,8\n*E\n"})
public abstract class dcc implements ase {

    /* JADX INFO: renamed from: K */
    public static final int f29291K = 0;

    /* JADX INFO: renamed from: A */
    @yfb
    public final z6b f29292A;

    /* JADX INFO: renamed from: B */
    @yfb
    public final cyd f29293B;

    /* JADX INFO: renamed from: C */
    public long f29294C;

    /* JADX INFO: renamed from: D */
    @yfb
    public final h09 f29295D;

    /* JADX INFO: renamed from: E */
    @yfb
    public final z6b<bth> f29296E;

    /* JADX INFO: renamed from: F */
    @yfb
    public final z6b<bth> f29297F;

    /* JADX INFO: renamed from: G */
    @yfb
    public final z6b f29298G;

    /* JADX INFO: renamed from: H */
    @yfb
    public final z6b f29299H;

    /* JADX INFO: renamed from: I */
    @yfb
    public final z6b<Boolean> f29300I;

    /* JADX INFO: renamed from: J */
    @yfb
    public final z6b<Boolean> f29301J;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b f29302a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final jz8 f29303b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final wbc f29304c;

    /* JADX INFO: renamed from: d */
    public int f29305d;

    /* JADX INFO: renamed from: e */
    public int f29306e;

    /* JADX INFO: renamed from: f */
    public long f29307f;

    /* JADX INFO: renamed from: g */
    public long f29308g;

    /* JADX INFO: renamed from: h */
    public float f29309h;

    /* JADX INFO: renamed from: i */
    public float f29310i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final ase f29311j;

    /* JADX INFO: renamed from: k */
    public int f29312k;

    /* JADX INFO: renamed from: l */
    public int f29313l;

    /* JADX INFO: renamed from: m */
    public boolean f29314m;

    /* JADX INFO: renamed from: n */
    public int f29315n;

    /* JADX INFO: renamed from: o */
    @gib
    public i09.InterfaceC7095b f29316o;

    /* JADX INFO: renamed from: p */
    public boolean f29317p;

    /* JADX INFO: renamed from: q */
    @yfb
    public z6b<tbc> f29318q;

    /* JADX INFO: renamed from: r */
    @yfb
    public c64 f29319r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final l5b f29320s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final k5b f29321t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final k5b f29322u;

    /* JADX INFO: renamed from: v */
    @yfb
    public final i2g f29323v;

    /* JADX INFO: renamed from: w */
    @yfb
    public final i2g f29324w;

    /* JADX INFO: renamed from: x */
    @yfb
    public final i09 f29325x;

    /* JADX INFO: renamed from: y */
    @yfb
    public final lz8 f29326y;

    /* JADX INFO: renamed from: z */
    @yfb
    public final dn0 f29327z;

    /* JADX INFO: renamed from: dcc$a */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerState", m4010f = "PagerState.kt", m4011i = {0, 0, 0, 0}, m4012l = {ymh.InterfaceC15726e.f102213u, 613}, m4013m = "animateScrollToPage", m4014n = {"this", "animationSpec", "page", "pageOffsetFraction"}, m4015s = {"L$0", "L$1", "I$0", "F$0"})
    public static final class C4735a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f29328a;

        /* JADX INFO: renamed from: b */
        public Object f29329b;

        /* JADX INFO: renamed from: c */
        public int f29330c;

        /* JADX INFO: renamed from: d */
        public float f29331d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29332e;

        /* JADX INFO: renamed from: m */
        public int f29334m;

        public C4735a(zy2<? super C4735a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f29332e = obj;
            this.f29334m |= Integer.MIN_VALUE;
            return dcc.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: dcc$b */
    public static final class C4736b extends tt8 implements gz6<vre, Integer, bth> {
        public C4736b() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(vre vreVar, Integer num) {
            invoke(vreVar, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb vre vreVar, int i) {
            dcc.this.updateTargetPage(vreVar, i);
        }
    }

    /* JADX INFO: renamed from: dcc$c */
    public static final class C4737c implements cyd {
        public C4737c() {
        }

        @Override // p000.cyd
        public void onRemeasurementAvailable(@yfb byd bydVar) {
            dcc.this.setRemeasurement(bydVar);
        }
    }

    /* JADX INFO: renamed from: dcc$d */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", m4010f = "PagerState.kt", m4011i = {}, m4012l = {576}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C4738d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f29337a;

        public C4738d(zy2<? super C4738d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return dcc.this.new C4738d(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C4738d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f29337a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                dcc dccVar = dcc.this;
                this.f29337a = 1;
                if (rre.stopScroll$default(dccVar, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: dcc$e */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerState", m4010f = "PagerState.kt", m4011i = {0, 0, 0, 1}, m4012l = {629, 634}, m4013m = "scroll$suspendImpl", m4014n = {"$this", "scrollPriority", "block", "$this"}, m4015s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class C4739e extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f29339a;

        /* JADX INFO: renamed from: b */
        public Object f29340b;

        /* JADX INFO: renamed from: c */
        public Object f29341c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f29342d;

        /* JADX INFO: renamed from: f */
        public int f29344f;

        public C4739e(zy2<? super C4739e> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f29342d = obj;
            this.f29344f |= Integer.MIN_VALUE;
            return dcc.m9065a(dcc.this, null, null, this);
        }
    }

    /* JADX INFO: renamed from: dcc$f */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", m4010f = "PagerState.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_TRG_SELECTOR}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,961:1\n868#2,4:962\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n497#1:962,4\n*E\n"})
    public static final class C4740f extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f29345a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f29347c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f29348d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4740f(float f, int i, zy2<? super C4740f> zy2Var) {
            super(2, zy2Var);
            this.f29347c = f;
            this.f29348d = i;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return dcc.this.new C4740f(this.f29347c, this.f29348d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C4740f) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f29345a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                dcc dccVar = dcc.this;
                this.f29345a = 1;
                if (dccVar.awaitScrollDependencies(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            float f = this.f29347c;
            double d = f;
            boolean z = false;
            if (-0.5d <= d && d <= 0.5d) {
                z = true;
            }
            if (z) {
                dcc.this.snapToItem$foundation_release(dcc.this.coerceInPageRange(this.f29348d), this.f29347c, true);
                return bth.f14751a;
            }
            throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
    }

    /* JADX INFO: renamed from: dcc$g */
    public static final class C4741g extends tt8 implements qy6<Float, Float> {
        public C4741g() {
            super(1);
        }

        @yfb
        public final Float invoke(float f) {
            return Float.valueOf(dcc.this.performScroll(f));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: dcc$h */
    public static final class C4742h extends tt8 implements ny6<Integer> {
        public C4742h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Integer invoke() {
            return Integer.valueOf(dcc.this.isScrollInProgress() ? dcc.this.getSettledPageState() : dcc.this.getCurrentPage());
        }
    }

    /* JADX INFO: renamed from: dcc$i */
    public static final class C4743i extends tt8 implements ny6<Integer> {
        public C4743i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Integer invoke() {
            return Integer.valueOf(dcc.this.coerceInPageRange(!dcc.this.isScrollInProgress() ? dcc.this.getCurrentPage() : dcc.this.getProgrammaticScrollTargetPage() != -1 ? dcc.this.getProgrammaticScrollTargetPage() : Math.abs(dcc.this.getCurrentPageOffsetFraction()) >= Math.abs(dcc.this.getPositionThresholdFraction$foundation_release()) ? dcc.this.getLastScrolledForward() ? dcc.this.getFirstVisiblePage$foundation_release() + 1 : dcc.this.getFirstVisiblePage$foundation_release() : dcc.this.getCurrentPage()));
        }
    }

    public dcc() {
        this(0, 0.0f, null, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m9065a(p000.dcc r5, p000.j7b r6, p000.gz6<? super p000.vre, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r7, p000.zy2<? super p000.bth> r8) {
        /*
            boolean r0 = r8 instanceof p000.dcc.C4739e
            if (r0 == 0) goto L13
            r0 = r8
            dcc$e r0 = (p000.dcc.C4739e) r0
            int r1 = r0.f29344f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29344f = r1
            goto L18
        L13:
            dcc$e r0 = new dcc$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29342d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29344f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f29339a
            dcc r5 = (p000.dcc) r5
            p000.y7e.throwOnFailure(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f29341c
            r7 = r5
            gz6 r7 = (p000.gz6) r7
            java.lang.Object r5 = r0.f29340b
            r6 = r5
            j7b r6 = (p000.j7b) r6
            java.lang.Object r5 = r0.f29339a
            dcc r5 = (p000.dcc) r5
            p000.y7e.throwOnFailure(r8)
            goto L5c
        L4a:
            p000.y7e.throwOnFailure(r8)
            r0.f29339a = r5
            r0.f29340b = r6
            r0.f29341c = r7
            r0.f29344f = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            boolean r8 = r5.isScrollInProgress()
            if (r8 != 0) goto L69
            int r8 = r5.getCurrentPage()
            r5.setSettledPageState(r8)
        L69:
            ase r8 = r5.f29311j
            r0.f29339a = r5
            r2 = 0
            r0.f29340b = r2
            r0.f29341c = r2
            r0.f29344f = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r6 = -1
            r5.setProgrammaticScrollTargetPage(r6)
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dcc.m9065a(dcc, j7b, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(dcc dccVar, int i, float f, InterfaceC11178py interfaceC11178py, zy2 zy2Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            interfaceC11178py = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return dccVar.animateScrollToPage(i, f, interfaceC11178py, zy2Var);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(dcc dccVar, tbc tbcVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        dccVar.applyMeasureResult$foundation_release(tbcVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(zy2<? super bth> zy2Var) throws Throwable {
        Object objWaitForFirstLayout = this.f29327z.waitForFirstLayout(zy2Var);
        return objWaitForFirstLayout == pd8.getCOROUTINE_SUSPENDED() ? objWaitForFirstLayout : bth.f14751a;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(mbc mbcVar) {
        if (this.f29315n == -1 || mbcVar.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.f29315n != (this.f29317p ? ((bbc) v82.last((List) mbcVar.getVisiblePagesInfo())).getIndex() + mbcVar.getBeyondViewportPageCount() + 1 : (((bbc) v82.first((List) mbcVar.getVisiblePagesInfo())).getIndex() - mbcVar.getBeyondViewportPageCount()) - 1)) {
            this.f29315n = -1;
            i09.InterfaceC7095b interfaceC7095b = this.f29316o;
            if (interfaceC7095b != null) {
                interfaceC7095b.cancel();
            }
            this.f29316o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return kpd.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.f29321t.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.f29322u.getIntValue();
    }

    private final boolean isGestureActionMatchesScroll(float f) {
        if (getLayoutInfo().getOrientation() != t7c.Vertical ? Math.signum(f) != Math.signum(-izb.m30429getXimpl(m28638getUpDownDifferenceF1C5BW0$foundation_release())) : Math.signum(f) != Math.signum(-izb.m30430getYimpl(m28638getUpDownDifferenceF1C5BW0$foundation_release()))) {
            if (!isNotGestureAction()) {
                return false;
            }
        }
        return true;
    }

    private final boolean isNotGestureAction() {
        return ((int) izb.m30429getXimpl(m28638getUpDownDifferenceF1C5BW0$foundation_release())) == 0 && ((int) izb.m30430getYimpl(m28638getUpDownDifferenceF1C5BW0$foundation_release())) == 0;
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(dcc dccVar, qbc qbcVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i2 & 2) != 0) {
            ssf.C12771a c12771a = ssf.f82790e;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = dccVar.f29304c.getCurrentPage();
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                i = currentPage;
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return dccVar.matchScrollPositionWithKey$foundation_release(qbcVar, i);
    }

    private final void notifyPrefetch(float f, mbc mbcVar) {
        i09.InterfaceC7095b interfaceC7095b;
        i09.InterfaceC7095b interfaceC7095b2;
        i09.InterfaceC7095b interfaceC7095b3;
        if (this.f29314m && !mbcVar.getVisiblePagesInfo().isEmpty()) {
            boolean z = f > 0.0f;
            int index = z ? ((bbc) v82.last((List) mbcVar.getVisiblePagesInfo())).getIndex() + mbcVar.getBeyondViewportPageCount() + 1 : (((bbc) v82.first((List) mbcVar.getVisiblePagesInfo())).getIndex() - mbcVar.getBeyondViewportPageCount()) - 1;
            if (index < 0 || index >= getPageCount()) {
                return;
            }
            if (index != this.f29315n) {
                if (this.f29317p != z && (interfaceC7095b3 = this.f29316o) != null) {
                    interfaceC7095b3.cancel();
                }
                this.f29317p = z;
                this.f29315n = index;
                this.f29316o = this.f29325x.m30145schedulePrefetch0kLqBqw(index, this.f29294C);
            }
            if (z) {
                if ((((bbc) v82.last((List) mbcVar.getVisiblePagesInfo())).getOffset() + (mbcVar.getPageSize() + mbcVar.getPageSpacing())) - mbcVar.getViewportEndOffset() >= f || (interfaceC7095b2 = this.f29316o) == null) {
                    return;
                }
                interfaceC7095b2.markAsUrgent();
                return;
            }
            if (mbcVar.getViewportStartOffset() - ((bbc) v82.first((List) mbcVar.getVisiblePagesInfo())).getOffset() >= (-f) || (interfaceC7095b = this.f29316o) == null) {
                return;
            }
            interfaceC7095b.markAsUrgent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f) {
        long jCurrentAbsoluteScrollOffset = xbc.currentAbsoluteScrollOffset(this);
        float f2 = this.f29309h + f;
        long jRoundToLong = p3a.roundToLong(f2);
        this.f29309h = f2 - jRoundToLong;
        if (Math.abs(f) < 1.0E-4f) {
            return f;
        }
        long j = jRoundToLong + jCurrentAbsoluteScrollOffset;
        long jCoerceIn = kpd.coerceIn(j, this.f29308g, this.f29307f);
        boolean z = j != jCoerceIn;
        long j2 = jCoerceIn - jCurrentAbsoluteScrollOffset;
        float f3 = j2;
        this.f29310i = f3;
        if (Math.abs(j2) != 0) {
            this.f29300I.setValue(Boolean.valueOf(f3 > 0.0f));
            this.f29301J.setValue(Boolean.valueOf(f3 < 0.0f));
        }
        tbc value = this.f29318q.getValue();
        int i = (int) j2;
        if (value.tryToApplyScrollWithoutRemeasure(-i)) {
            applyMeasureResult$foundation_release(value, true);
            aub.m27890invalidateScopeimpl(this.f29296E);
            this.f29313l++;
        } else {
            this.f29304c.applyScrollDelta(i);
            byd remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            this.f29312k++;
        }
        return (z ? Long.valueOf(j2) : Float.valueOf(f)).floatValue();
    }

    public static /* synthetic */ void requestScrollToPage$default(dcc dccVar, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        dccVar.requestScrollToPage(i, f);
    }

    public static /* synthetic */ Object scrollToPage$default(dcc dccVar, int i, float f, zy2 zy2Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return dccVar.scrollToPage(i, f, zy2Var);
    }

    private final void setCanScrollBackward(boolean z) {
        this.f29299H.setValue(Boolean.valueOf(z));
    }

    private final void setCanScrollForward(boolean z) {
        this.f29298G.setValue(Boolean.valueOf(z));
    }

    private final void setProgrammaticScrollTargetPage(int i) {
        this.f29321t.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(byd bydVar) {
        this.f29292A.setValue(bydVar);
    }

    private final void setSettledPageState(int i) {
        this.f29322u.setIntValue(i);
    }

    private final void tryRunPrefetch(tbc tbcVar) {
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (Math.abs(this.f29310i) > 0.5f && this.f29314m && isGestureActionMatchesScroll(this.f29310i)) {
                notifyPrefetch(this.f29310i, tbcVar);
            }
            bth bthVar = bth.f14751a;
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(dcc dccVar, vre vreVar, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        dccVar.updateCurrentPage(vreVar, i, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateScrollToPage(int r10, @p000.y46(from = -0.5d, m25645to = 0.5d) float r11, @p000.yfb p000.InterfaceC11178py<java.lang.Float> r12, @p000.yfb p000.zy2<? super p000.bth> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof p000.dcc.C4735a
            if (r0 == 0) goto L14
            r0 = r13
            dcc$a r0 = (p000.dcc.C4735a) r0
            int r1 = r0.f29334m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f29334m = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            dcc$a r0 = new dcc$a
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f29332e
            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r1 = r6.f29334m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            p000.y7e.throwOnFailure(r13)
            goto La5
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            float r11 = r6.f29331d
            int r10 = r6.f29330c
            java.lang.Object r12 = r6.f29329b
            py r12 = (p000.InterfaceC11178py) r12
            java.lang.Object r1 = r6.f29328a
            dcc r1 = (p000.dcc) r1
            p000.y7e.throwOnFailure(r13)
        L46:
            r4 = r12
            goto L76
        L48:
            p000.y7e.throwOnFailure(r13)
            int r13 = r9.getCurrentPage()
            if (r10 != r13) goto L5a
            float r13 = r9.getCurrentPageOffsetFraction()
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L5a
            goto L60
        L5a:
            int r13 = r9.getPageCount()
            if (r13 != 0) goto L63
        L60:
            bth r10 = p000.bth.f14751a
            return r10
        L63:
            r6.f29328a = r9
            r6.f29329b = r12
            r6.f29330c = r10
            r6.f29331d = r11
            r6.f29334m = r3
            java.lang.Object r13 = r9.awaitScrollDependencies(r6)
            if (r13 != r0) goto L74
            return r0
        L74:
            r1 = r9
            goto L46
        L76:
            double r12 = (double) r11
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 > 0) goto La8
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 > 0) goto La8
            int r10 = r1.coerceInPageRange(r10)
            int r12 = r1.getPageSizeWithSpacing$foundation_release()
            float r12 = (float) r12
            float r3 = r11 * r12
            jz8 r11 = r1.f29303b
            dcc$b r5 = new dcc$b
            r5.<init>()
            r12 = 0
            r6.f29328a = r12
            r6.f29329b = r12
            r6.f29334m = r2
            r1 = r11
            r2 = r10
            java.lang.Object r10 = p000.ecc.access$animateScrollToPage(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto La5
            return r0
        La5:
            bth r10 = p000.bth.f14751a
            return r10
        La8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "pageOffsetFraction "
            r10.append(r12)
            r10.append(r11)
            java.lang.String r11 = " is not within the range -0.5 to 0.5"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dcc.animateScrollToPage(int, float, py, zy2):java.lang.Object");
    }

    public final void applyMeasureResult$foundation_release(@yfb tbc tbcVar, boolean z) {
        if (z) {
            this.f29304c.updateCurrentPageOffsetFraction(tbcVar.getCurrentPageOffsetFraction());
        } else {
            this.f29304c.updateFromMeasureResult(tbcVar);
            cancelPrefetchIfVisibleItemsChanged(tbcVar);
        }
        this.f29318q.setValue(tbcVar);
        setCanScrollForward(tbcVar.getCanScrollForward());
        setCanScrollBackward(tbcVar.getCanScrollBackward());
        bca firstVisiblePage = tbcVar.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.f29305d = firstVisiblePage.getIndex();
        }
        this.f29306e = tbcVar.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(tbcVar);
        this.f29307f = ecc.calculateNewMaxScrollOffset(tbcVar, getPageCount());
        this.f29308g = ecc.calculateNewMinScrollOffset(tbcVar, getPageCount());
    }

    @Override // p000.ase
    public float dispatchRawDelta(float f) {
        return this.f29311j.dispatchRawDelta(f);
    }

    @yfb
    public final dn0 getAwaitLayoutModifier$foundation_release() {
        return this.f29327z;
    }

    @yfb
    public final lz8 getBeyondBoundsInfo$foundation_release() {
        return this.f29326y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.f29299H.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public final boolean getCanScrollForward() {
        return ((Boolean) this.f29298G.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.f29304c.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.f29304c.getCurrentPageOffsetFraction();
    }

    @yfb
    public final c64 getDensity$foundation_release() {
        return this.f29319r;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.f29305d;
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.f29306e;
    }

    @yfb
    public final q98 getInteractionSource() {
        return this.f29320s;
    }

    @yfb
    public final l5b getInternalInteractionSource$foundation_release() {
        return this.f29320s;
    }

    @Override // p000.ase
    public boolean getLastScrolledBackward() {
        return this.f29301J.getValue().booleanValue();
    }

    @Override // p000.ase
    public boolean getLastScrolledForward() {
        return this.f29300I.getValue().booleanValue();
    }

    @yfb
    public final mbc getLayoutInfo() {
        return this.f29318q.getValue();
    }

    public final int getLayoutWithMeasurement$foundation_release() {
        return this.f29312k;
    }

    @yfb
    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m28635getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f29297F;
    }

    @yfb
    public final f78 getNearestRange$foundation_release() {
        return this.f29304c.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.f29312k + this.f29313l;
    }

    public final float getOffsetDistanceInPages(int i) {
        if (i >= 0 && i <= getPageCount()) {
            return (i - getCurrentPage()) - getCurrentPageOffsetFraction();
        }
        throw new IllegalArgumentException(("page " + i + " is not within the range 0 to " + getPageCount()).toString());
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return this.f29318q.getValue().getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final int getPageSpacing$foundation_release() {
        return this.f29318q.getValue().getPageSpacing();
    }

    @yfb
    public final h09 getPinnedPages$foundation_release() {
        return this.f29295D;
    }

    @yfb
    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m28636getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f29296E;
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.f29319r.mo27173toPx0680j_4(ecc.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    @yfb
    public final i09 getPrefetchState$foundation_release() {
        return this.f29325x;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f29314m;
    }

    /* JADX INFO: renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m28637getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.f29294C;
    }

    @gib
    public final byd getRemeasurement$foundation_release() {
        return (byd) this.f29292A.getValue();
    }

    @yfb
    public final cyd getRemeasurementModifier$foundation_release() {
        return this.f29293B;
    }

    public final int getSettledPage() {
        return ((Number) this.f29323v.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.f29324w.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m28638getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((izb) this.f29302a.getValue()).m30439unboximpl();
    }

    @Override // p000.ase
    public boolean isScrollInProgress() {
        return this.f29311j.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation_release(@yfb qbc qbcVar, int i) {
        return this.f29304c.matchPageWithKey(qbcVar, i);
    }

    public final void requestScrollToPage(@h78(from = 0) int i, @y46(from = -0.5d, m25645to = 0.5d) float f) {
        if (isScrollInProgress()) {
            fg1.launch$default(this.f29318q.getValue().getCoroutineScope(), null, null, new C4738d(null), 3, null);
        }
        snapToItem$foundation_release(i, f, false);
    }

    @Override // p000.ase
    @gib
    public Object scroll(@yfb j7b j7bVar, @yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        return m9065a(this, j7bVar, gz6Var, zy2Var);
    }

    @gib
    public final Object scrollToPage(int i, @y46(from = -0.5d, m25645to = 0.5d) float f, @yfb zy2<? super bth> zy2Var) {
        Object objScroll$default = ase.scroll$default(this, null, new C4740f(f, i, null), zy2Var, 1, null);
        return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
    }

    public final void setDensity$foundation_release(@yfb c64 c64Var) {
        this.f29319r = c64Var;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f29314m = z;
    }

    /* JADX INFO: renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m28639setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.f29294C = j;
    }

    /* JADX INFO: renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m28640setUpDownDifferencek4lQ0M$foundation_release(long j) {
        this.f29302a.setValue(izb.m30418boximpl(j));
    }

    public final void snapToItem$foundation_release(int i, float f, boolean z) {
        this.f29304c.requestPositionAndForgetLastKnownKey(i, f);
        if (!z) {
            aub.m27890invalidateScopeimpl(this.f29297F);
            return;
        }
        byd remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    @ah5
    public final void updateCurrentPage(@yfb vre vreVar, int i, @y46(from = -0.5d, m25645to = 0.5d) float f) {
        snapToItem$foundation_release(i, f, true);
    }

    @ah5
    public final void updateTargetPage(@yfb vre vreVar, int i) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i));
    }

    public dcc(int i, @y46(from = -0.5d, m25645to = 0.5d) float f, @gib s9d s9dVar) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        this.f29302a = xtf.mutableStateOf$default(izb.m30418boximpl(izb.f49009b.m30445getZeroF1C5BW0()), null, 2, null);
        this.f29303b = pbc.PagerLazyAnimateScrollScope(this);
        wbc wbcVar = new wbc(i, f, this);
        this.f29304c = wbcVar;
        this.f29305d = i;
        this.f29307f = Long.MAX_VALUE;
        this.f29311j = bse.ScrollableState(new C4741g());
        this.f29314m = true;
        this.f29315n = -1;
        this.f29318q = stf.mutableStateOf(ecc.getEmptyLayoutInfo(), stf.neverEqualPolicy());
        this.f29319r = ecc.f32632e;
        this.f29320s = r98.MutableInteractionSource();
        this.f29321t = etf.mutableIntStateOf(-1);
        this.f29322u = etf.mutableIntStateOf(i);
        this.f29323v = stf.derivedStateOf(stf.structuralEqualityPolicy(), new C4742h());
        this.f29324w = stf.derivedStateOf(stf.structuralEqualityPolicy(), new C4743i());
        this.f29325x = new i09(s9dVar, null, 2, null);
        this.f29326y = new lz8();
        this.f29327z = new dn0();
        this.f29292A = xtf.mutableStateOf$default(null, null, 2, null);
        this.f29293B = new C4737c();
        this.f29294C = nu2.Constraints$default(0, 0, 0, 0, 15, null);
        this.f29295D = new h09();
        wbcVar.getNearestRangeState();
        this.f29296E = aub.m27886constructorimpl$default(null, 1, null);
        this.f29297F = aub.m27886constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f29298G = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f29299H = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f29300I = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f29301J = xtf.mutableStateOf$default(bool, null, 2, null);
    }

    public /* synthetic */ dcc(int i, float f, s9d s9dVar, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? null : s9dVar);
    }

    public /* synthetic */ dcc(int i, float f, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public dcc(int i, @y46(from = -0.5d, m25645to = 0.5d) float f) {
        this(i, f, null);
    }
}
