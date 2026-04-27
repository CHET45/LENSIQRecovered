package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.ArrayList;
import java.util.List;
import p000.i09;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,566:1\n81#2:567\n81#2:568\n107#2,2:569\n81#2:571\n107#2,2:572\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n282#1:567\n380#1:568\n380#1:569,2\n382#1:571\n382#1:572,2\n*E\n"})
public final class az8 implements ase {

    /* JADX INFO: renamed from: w */
    public static final int f12242w = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final oy8 f12244a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final sy8 f12245b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b<hy8> f12246c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final l5b f12247d;

    /* JADX INFO: renamed from: e */
    public float f12248e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final ase f12249f;

    /* JADX INFO: renamed from: g */
    public int f12250g;

    /* JADX INFO: renamed from: h */
    public boolean f12251h;

    /* JADX INFO: renamed from: i */
    @gib
    public byd f12252i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final cyd f12253j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final dn0 f12254k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final LazyLayoutItemAnimator<iy8> f12255l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final lz8 f12256m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final i09 f12257n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final ny8 f12258o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final rx8 f12259p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final h09 f12260q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final z6b<bth> f12261r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final z6b<bth> f12262s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final z6b f12263t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final z6b f12264u;

    /* JADX INFO: renamed from: v */
    @yfb
    public static final C1674c f12241v = new C1674c(null);

    /* JADX INFO: renamed from: x */
    @yfb
    public static final dme<az8, ?> f12243x = q99.listSaver(C1672a.f12265a, C1673b.f12266a);

    /* JADX INFO: renamed from: az8$a */
    public static final class C1672a extends tt8 implements gz6<fme, az8, List<? extends Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C1672a f12265a = new C1672a();

        public C1672a() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final List<Integer> invoke(@yfb fme fmeVar, @yfb az8 az8Var) {
            return l82.listOf((Object[]) new Integer[]{Integer.valueOf(az8Var.getFirstVisibleItemIndex()), Integer.valueOf(az8Var.getFirstVisibleItemScrollOffset())});
        }
    }

    /* JADX INFO: renamed from: az8$b */
    public static final class C1673b extends tt8 implements qy6<List<? extends Integer>, az8> {

        /* JADX INFO: renamed from: a */
        public static final C1673b f12266a = new C1673b();

        public C1673b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ az8 invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final az8 invoke2(@yfb List<Integer> list) {
            return new az8(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* JADX INFO: renamed from: az8$c */
    public static final class C1674c {

        /* JADX INFO: renamed from: az8$c$a */
        public static final class a extends tt8 implements gz6<fme, az8, List<? extends Integer>> {

            /* JADX INFO: renamed from: a */
            public static final a f12267a = new a();

            public a() {
                super(2);
            }

            @Override // p000.gz6
            @yfb
            public final List<Integer> invoke(@yfb fme fmeVar, @yfb az8 az8Var) {
                return l82.listOf((Object[]) new Integer[]{Integer.valueOf(az8Var.getFirstVisibleItemIndex()), Integer.valueOf(az8Var.getFirstVisibleItemScrollOffset())});
            }
        }

        /* JADX INFO: renamed from: az8$c$b */
        public static final class b extends tt8 implements qy6<List<? extends Integer>, az8> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ oy8 f12268a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(oy8 oy8Var) {
                super(1);
                this.f12268a = oy8Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ az8 invoke(List<? extends Integer> list) {
                return invoke2((List<Integer>) list);
            }

            @gib
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final az8 invoke2(@yfb List<Integer> list) {
                return new az8(list.get(0).intValue(), list.get(1).intValue(), this.f12268a);
            }
        }

        public /* synthetic */ C1674c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<az8, ?> getSaver() {
            return az8.f12243x;
        }

        @ah5
        @yfb
        public final dme<az8, ?> saver$foundation_release(@yfb oy8 oy8Var) {
            return q99.listSaver(a.f12267a, new b(oy8Var));
        }

        private C1674c() {
        }
    }

    /* JADX INFO: renamed from: az8$d */
    @dwf({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,566:1\n602#2,6:567\n609#2:579\n33#3,6:573\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1\n*L\n266#1:567,6\n266#1:579\n267#1:573,6\n*E\n"})
    public static final class C1675d implements ny8 {
        public C1675d() {
        }

        @Override // p000.ny8
        @yfb
        public List<i09.InterfaceC7095b> scheduleLinePrefetch(int i) {
            ArrayList arrayList = new ArrayList();
            ssf.C12771a c12771a = ssf.f82790e;
            az8 az8Var = az8.this;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                List<scc<Integer, ku2>> listInvoke = ((hy8) az8Var.f12246c.getValue()).getPrefetchInfoRetriever().invoke(Integer.valueOf(i));
                int size = listInvoke.size();
                for (int i2 = 0; i2 < size; i2++) {
                    scc<Integer, ku2> sccVar = listInvoke.get(i2);
                    arrayList.add(az8Var.getPrefetchState$foundation_release().m30145schedulePrefetch0kLqBqw(sccVar.getFirst().intValue(), sccVar.getSecond().m30769unboximpl()));
                }
                bth bthVar = bth.f14751a;
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                return arrayList;
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: az8$e */
    @dwf({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchState$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,566:1\n602#2,8:567\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchState$1\n*L\n254#1:567,8\n*E\n"})
    public static final class C1676e extends tt8 implements qy6<fab, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1676e(int i) {
            super(1);
            this.f12271b = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(fab fabVar) {
            invoke2(fabVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb fab fabVar) {
            oy8 oy8Var = az8.this.f12244a;
            int i = this.f12271b;
            ssf.C12771a c12771a = ssf.f82790e;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            c12771a.restoreNonObservable(currentThreadSnapshot, c12771a.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
            oy8Var.onNestedPrefetch(fabVar, i);
        }
    }

    /* JADX INFO: renamed from: az8$f */
    public static final class C1677f implements cyd {
        public C1677f() {
        }

        @Override // p000.cyd
        public void onRemeasurementAvailable(@yfb byd bydVar) {
            az8.this.f12252i = bydVar;
        }
    }

    /* JADX INFO: renamed from: az8$g */
    @ck3(m4009c = "androidx.compose.foundation.lazy.grid.LazyGridState$requestScrollToItem$1", m4010f = "LazyGridState.kt", m4011i = {}, m4012l = {330}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1678g extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f12273a;

        public C1678g(zy2<? super C1678g> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return az8.this.new C1678g(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C1678g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f12273a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                az8 az8Var = az8.this;
                this.f12273a = 1;
                if (rre.stopScroll$default(az8Var, null, this, 1, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: az8$h */
    @ck3(m4009c = "androidx.compose.foundation.lazy.grid.LazyGridState", m4010f = "LazyGridState.kt", m4011i = {0, 0, 0}, m4012l = {370, 371}, m4013m = "scroll", m4014n = {"this", "scrollPriority", "block"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C1679h extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f12275a;

        /* JADX INFO: renamed from: b */
        public Object f12276b;

        /* JADX INFO: renamed from: c */
        public Object f12277c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f12278d;

        /* JADX INFO: renamed from: f */
        public int f12280f;

        public C1679h(zy2<? super C1679h> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f12278d = obj;
            this.f12280f |= Integer.MIN_VALUE;
            return az8.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: renamed from: az8$i */
    @ck3(m4009c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", m4010f = "LazyGridState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1680i extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f12281a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f12283c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f12284d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1680i(int i, int i2, zy2<? super C1680i> zy2Var) {
            super(2, zy2Var);
            this.f12283c = i;
            this.f12284d = i2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return az8.this.new C1680i(this.f12283c, this.f12284d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C1680i) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f12281a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            az8.this.snapToItemIndexInternal$foundation_release(this.f12283c, this.f12284d, true);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: az8$j */
    public static final class C1681j extends tt8 implements qy6<Float, Float> {
        public C1681j() {
            super(1);
        }

        @yfb
        public final Float invoke(float f) {
            return Float.valueOf(-az8.this.onScroll$foundation_release(-f));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    @ah5
    public az8() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(az8 az8Var, int i, int i2, zy2 zy2Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return az8Var.animateScrollToItem(i, i2, zy2Var);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(az8 az8Var, hy8 hy8Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        az8Var.applyMeasureResult$foundation_release(hy8Var, z);
    }

    private final int getNumOfItemsToTeleport() {
        return getSlotsPerLine$foundation_release() * 100;
    }

    private final void notifyPrefetchOnScroll(float f, fy8 fy8Var) {
        if (this.f12251h) {
            this.f12244a.onScroll(this.f12258o, f, fy8Var);
        }
    }

    public static /* synthetic */ void requestScrollToItem$default(az8 az8Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        az8Var.requestScrollToItem(i, i2);
    }

    public static /* synthetic */ Object scrollToItem$default(az8 az8Var, int i, int i2, zy2 zy2Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return az8Var.scrollToItem(i, i2, zy2Var);
    }

    private void setCanScrollBackward(boolean z) {
        this.f12264u.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.f12263t.setValue(Boolean.valueOf(z));
    }

    @gib
    public final Object animateScrollToItem(@h78(from = 0) int i, int i2, @yfb zy2<? super bth> zy2Var) {
        Object objAnimateScrollToItem = ix8.animateScrollToItem(this.f12259p, i, i2, getNumOfItemsToTeleport(), getDensity$foundation_release(), zy2Var);
        return objAnimateScrollToItem == pd8.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : bth.f14751a;
    }

    public final void applyMeasureResult$foundation_release(@yfb hy8 hy8Var, boolean z) {
        this.f12248e -= hy8Var.getConsumedScroll();
        this.f12246c.setValue(hy8Var);
        setCanScrollBackward(hy8Var.getCanScrollBackward());
        setCanScrollForward(hy8Var.getCanScrollForward());
        if (z) {
            this.f12245b.updateScrollOffset(hy8Var.getFirstVisibleLineScrollOffset());
        } else {
            this.f12245b.updateFromMeasureResult(hy8Var);
            if (this.f12251h) {
                this.f12244a.onVisibleItemsUpdated(this.f12258o, hy8Var);
            }
        }
        this.f12250g++;
    }

    @Override // p000.ase
    public float dispatchRawDelta(float f) {
        return this.f12249f.dispatchRawDelta(f);
    }

    @yfb
    public final dn0 getAwaitLayoutModifier$foundation_release() {
        return this.f12254k;
    }

    @yfb
    public final lz8 getBeyondBoundsInfo$foundation_release() {
        return this.f12256m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public boolean getCanScrollBackward() {
        return ((Boolean) this.f12264u.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public boolean getCanScrollForward() {
        return ((Boolean) this.f12263t.getValue()).booleanValue();
    }

    @yfb
    public final c64 getDensity$foundation_release() {
        return this.f12246c.getValue().getDensity();
    }

    public final int getFirstVisibleItemIndex() {
        return this.f12245b.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f12245b.getScrollOffset();
    }

    @yfb
    public final q98 getInteractionSource() {
        return this.f12247d;
    }

    @yfb
    public final l5b getInternalInteractionSource$foundation_release() {
        return this.f12247d;
    }

    @yfb
    public final LazyLayoutItemAnimator<iy8> getItemAnimator$foundation_release() {
        return this.f12255l;
    }

    @Override // p000.ase
    public boolean getLastScrolledBackward() {
        return this.f12249f.getLastScrolledBackward();
    }

    @Override // p000.ase
    public boolean getLastScrolledForward() {
        return this.f12249f.getLastScrolledForward();
    }

    @yfb
    public final fy8 getLayoutInfo() {
        return this.f12246c.getValue();
    }

    @yfb
    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m27908getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f12262s;
    }

    @yfb
    public final f78 getNearestRange$foundation_release() {
        return this.f12245b.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.f12250g;
    }

    @yfb
    public final h09 getPinnedItems$foundation_release() {
        return this.f12260q;
    }

    @yfb
    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m27909getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f12261r;
    }

    @yfb
    public final i09 getPrefetchState$foundation_release() {
        return this.f12257n;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f12251h;
    }

    @gib
    public final byd getRemeasurement$foundation_release() {
        return this.f12252i;
    }

    @yfb
    public final cyd getRemeasurementModifier$foundation_release() {
        return this.f12253j;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.f12248e;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.f12246c.getValue().getSlotsPerLine();
    }

    @Override // p000.ase
    public boolean isScrollInProgress() {
        return this.f12249f.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f) {
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.f12248e) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f12248e).toString());
        }
        float f2 = this.f12248e + f;
        this.f12248e = f2;
        if (Math.abs(f2) > 0.5f) {
            hy8 value = this.f12246c.getValue();
            float f3 = this.f12248e;
            if (value.tryToApplyScrollWithoutRemeasure(p3a.roundToInt(f3))) {
                applyMeasureResult$foundation_release(value, true);
                aub.m27890invalidateScopeimpl(this.f12261r);
                notifyPrefetchOnScroll(f3 - this.f12248e, value);
            } else {
                byd bydVar = this.f12252i;
                if (bydVar != null) {
                    bydVar.forceRemeasure();
                }
                notifyPrefetchOnScroll(f3 - this.f12248e, getLayoutInfo());
            }
        }
        if (Math.abs(this.f12248e) <= 0.5f) {
            return f;
        }
        float f4 = f - this.f12248e;
        this.f12248e = 0.0f;
        return f4;
    }

    public final void requestScrollToItem(@h78(from = 0) int i, int i2) {
        if (isScrollInProgress()) {
            fg1.launch$default(this.f12246c.getValue().getCoroutineScope(), null, null, new C1678g(null), 3, null);
        }
        snapToItemIndexInternal$foundation_release(i, i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.ase
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(@p000.yfb p000.j7b r6, @p000.yfb p000.gz6<? super p000.vre, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r7, @p000.yfb p000.zy2<? super p000.bth> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p000.az8.C1679h
            if (r0 == 0) goto L13
            r0 = r8
            az8$h r0 = (p000.az8.C1679h) r0
            int r1 = r0.f12280f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12280f = r1
            goto L18
        L13:
            az8$h r0 = new az8$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12278d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f12280f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p000.y7e.throwOnFailure(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f12277c
            r7 = r6
            gz6 r7 = (p000.gz6) r7
            java.lang.Object r6 = r0.f12276b
            j7b r6 = (p000.j7b) r6
            java.lang.Object r2 = r0.f12275a
            az8 r2 = (p000.az8) r2
            p000.y7e.throwOnFailure(r8)
            goto L5a
        L45:
            p000.y7e.throwOnFailure(r8)
            dn0 r8 = r5.f12254k
            r0.f12275a = r5
            r0.f12276b = r6
            r0.f12277c = r7
            r0.f12280f = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            ase r8 = r2.f12249f
            r2 = 0
            r0.f12275a = r2
            r0.f12276b = r2
            r0.f12277c = r2
            r0.f12280f = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.az8.scroll(j7b, gz6, zy2):java.lang.Object");
    }

    @gib
    public final Object scrollToItem(@h78(from = 0) int i, int i2, @yfb zy2<? super bth> zy2Var) {
        Object objScroll$default = ase.scroll$default(this, null, new C1680i(i, i2, null), zy2Var, 1, null);
        return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f12251h = z;
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2, boolean z) {
        if (this.f12245b.getIndex() != i || this.f12245b.getScrollOffset() != i2) {
            this.f12255l.reset();
        }
        this.f12245b.requestPositionAndForgetLastKnownKey(i, i2);
        if (!z) {
            aub.m27890invalidateScopeimpl(this.f12262s);
            return;
        }
        byd bydVar = this.f12252i;
        if (bydVar != null) {
            bydVar.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@yfb yx8 yx8Var, int i) {
        return this.f12245b.updateScrollPositionIfTheFirstItemWasMoved(yx8Var, i);
    }

    @ah5
    public az8(int i, int i2, @yfb oy8 oy8Var) {
        this.f12244a = oy8Var;
        sy8 sy8Var = new sy8(i, i2);
        this.f12245b = sy8Var;
        this.f12246c = stf.mutableStateOf(bz8.f15229a, stf.neverEqualPolicy());
        this.f12247d = r98.MutableInteractionSource();
        this.f12249f = bse.ScrollableState(new C1681j());
        this.f12251h = true;
        this.f12253j = new C1677f();
        this.f12254k = new dn0();
        this.f12255l = new LazyLayoutItemAnimator<>();
        this.f12256m = new lz8();
        this.f12257n = new i09(oy8Var.getPrefetchScheduler(), new C1676e(i));
        this.f12258o = new C1675d();
        this.f12259p = new rx8(this);
        this.f12260q = new h09();
        sy8Var.getNearestRangeState();
        this.f12261r = aub.m27886constructorimpl$default(null, 1, null);
        this.f12262s = aub.m27886constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f12263t = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f12264u = xtf.mutableStateOf$default(bool, null, 2, null);
    }

    public /* synthetic */ az8(int i, int i2, oy8 oy8Var, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? py8.LazyGridPrefetchStrategy$default(0, 1, null) : oy8Var);
    }

    public /* synthetic */ az8(int i, int i2, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public az8(int i, int i2) {
        this(i, i2, py8.LazyGridPrefetchStrategy$default(0, 1, null));
    }
}
