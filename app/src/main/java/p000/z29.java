package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.i09;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n81#2:596\n107#2,2:597\n81#2:599\n107#2,2:600\n81#2:602\n1855#3,2:603\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n145#1:596\n145#1:597,2\n147#1:599\n147#1:600,2\n219#1:602\n507#1:603,2\n*E\n"})
@e0g(parameters = 0)
public final class z29 implements ase {

    /* JADX INFO: renamed from: w */
    @yfb
    public static final C15942c f103745w = new C15942c(null);

    /* JADX INFO: renamed from: x */
    public static final int f103746x = 8;

    /* JADX INFO: renamed from: y */
    @yfb
    public static final dme<z29, Object> f103747y = q99.listSaver(C15940a.f103770a, C15941b.f103771a);

    /* JADX INFO: renamed from: a */
    @yfb
    public final t29 f103748a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b<o29> f103749b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final i29 f103750c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f103751d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f103752e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final u19 f103753f;

    /* JADX INFO: renamed from: g */
    @gib
    public byd f103754g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final cyd f103755h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final dn0 f103756i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final lz8 f103757j;

    /* JADX INFO: renamed from: k */
    public boolean f103758k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final i09 f103759l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final ase f103760m;

    /* JADX INFO: renamed from: n */
    public float f103761n;

    /* JADX INFO: renamed from: o */
    public int f103762o;

    /* JADX INFO: renamed from: p */
    public int f103763p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final Map<Integer, i09.InterfaceC7095b> f103764q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final l5b f103765r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final h09 f103766s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final LazyLayoutItemAnimator<q29> f103767t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final z6b<bth> f103768u;

    /* JADX INFO: renamed from: v */
    @yfb
    public final z6b<bth> f103769v;

    /* JADX INFO: renamed from: z29$a */
    public static final class C15940a extends tt8 implements gz6<fme, z29, List<? extends int[]>> {

        /* JADX INFO: renamed from: a */
        public static final C15940a f103770a = new C15940a();

        public C15940a() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final List<int[]> invoke(@yfb fme fmeVar, @yfb z29 z29Var) {
            return l82.listOf((Object[]) new int[][]{z29Var.getScrollPosition$foundation_release().getIndices(), z29Var.getScrollPosition$foundation_release().getScrollOffsets()});
        }
    }

    /* JADX INFO: renamed from: z29$b */
    public static final class C15941b extends tt8 implements qy6<List<? extends int[]>, z29> {

        /* JADX INFO: renamed from: a */
        public static final C15941b f103771a = new C15941b();

        public C15941b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        public /* bridge */ /* synthetic */ z29 invoke(List<? extends int[]> list) {
            return invoke2((List<int[]>) list);
        }

        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final z29 invoke2(@yfb List<int[]> list) {
            return new z29(list.get(0), list.get(1), null);
        }
    }

    /* JADX INFO: renamed from: z29$c */
    public static final class C15942c {
        public /* synthetic */ C15942c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<z29, Object> getSaver() {
            return z29.f103747y;
        }

        private C15942c() {
        }
    }

    /* JADX INFO: renamed from: z29$d */
    public static final class C15943d implements cyd {
        public C15943d() {
        }

        @Override // p000.cyd
        public void onRemeasurementAvailable(@yfb byd bydVar) {
            z29.this.f103754g = bydVar;
        }
    }

    /* JADX INFO: renamed from: z29$e */
    @ck3(m4009c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1", m4010f = "LazyStaggeredGridState.kt", m4011i = {}, m4012l = {360}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15944e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f103773a;

        public C15944e(zy2<? super C15944e> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return z29.this.new C15944e(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C15944e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f103773a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                z29 z29Var = z29.this;
                this.f103773a = 1;
                if (rre.stopScroll$default(z29Var, null, this, 1, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: z29$f */
    @ck3(m4009c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", m4010f = "LazyStaggeredGridState.kt", m4011i = {0, 0, 0}, m4012l = {235, 236}, m4013m = "scroll", m4014n = {"this", "scrollPriority", "block"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C15945f extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f103775a;

        /* JADX INFO: renamed from: b */
        public Object f103776b;

        /* JADX INFO: renamed from: c */
        public Object f103777c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f103778d;

        /* JADX INFO: renamed from: f */
        public int f103780f;

        public C15945f(zy2<? super C15945f> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f103778d = obj;
            this.f103780f |= Integer.MIN_VALUE;
            return z29.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: renamed from: z29$g */
    public /* synthetic */ class C15946g extends n07 implements gz6<Integer, Integer, int[]> {
        public C15946g(Object obj) {
            super(2, obj, z29.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ int[] invoke(Integer num, Integer num2) {
            return invoke(num.intValue(), num2.intValue());
        }

        @yfb
        public final int[] invoke(int i, int i2) {
            return ((z29) this.receiver).fillNearestIndices(i, i2);
        }
    }

    /* JADX INFO: renamed from: z29$h */
    @ck3(m4009c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", m4010f = "LazyStaggeredGridState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15947h extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f103781a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f103783c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f103784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15947h(int i, int i2, zy2<? super C15947h> zy2Var) {
            super(2, zy2Var);
            this.f103783c = i;
            this.f103784d = i2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return z29.this.new C15947h(this.f103783c, this.f103784d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C15947h) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f103781a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            z29.this.snapToItemInternal$foundation_release(this.f103783c, this.f103784d, true);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: z29$i */
    public static final class C15948i extends tt8 implements qy6<Float, Float> {
        public C15948i() {
            super(1);
        }

        @yfb
        public final Float invoke(float f) {
            return Float.valueOf(-z29.this.onScroll(-f));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    public z29(@yfb int[] iArr, @yfb int[] iArr2, @gib s9d s9dVar) {
        t29 t29Var = new t29(iArr, iArr2, new C15946g(this));
        this.f103748a = t29Var;
        this.f103749b = stf.mutableStateOf(p29.getEmptyLazyStaggeredGridLayoutInfo(), stf.neverEqualPolicy());
        this.f103750c = new i29();
        Boolean bool = Boolean.FALSE;
        this.f103751d = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f103752e = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f103753f = new u19(this);
        this.f103755h = new C15943d();
        this.f103756i = new dn0();
        this.f103757j = new lz8();
        this.f103758k = true;
        this.f103759l = new i09(s9dVar, null, 2, null);
        this.f103760m = bse.ScrollableState(new C15948i());
        this.f103763p = -1;
        this.f103764q = new LinkedHashMap();
        this.f103765r = r98.MutableInteractionSource();
        this.f103766s = new h09();
        this.f103767t = new LazyLayoutItemAnimator<>();
        t29Var.getNearestRangeState();
        this.f103768u = aub.m27886constructorimpl$default(null, 1, null);
        this.f103769v = aub.m27886constructorimpl$default(null, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m26503a(z29 z29Var, float f, o29 o29Var, int i, Object obj) {
        if ((i & 2) != 0) {
            o29Var = z29Var.f103749b.getValue();
        }
        z29Var.notifyPrefetch(f, o29Var);
    }

    public static /* synthetic */ Object animateScrollToItem$default(z29 z29Var, int i, int i2, zy2 zy2Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return z29Var.animateScrollToItem(i, i2, zy2Var);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(z29 z29Var, o29 o29Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        z29Var.applyMeasureResult$foundation_release(o29Var, z);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(j29 j29Var) {
        List<b29> visibleItemsInfo = j29Var.getVisibleItemsInfo();
        if (this.f103763p == -1 || visibleItemsInfo.isEmpty()) {
            return;
        }
        int index = ((b29) v82.first((List) visibleItemsInfo)).getIndex();
        int index2 = ((b29) v82.last((List) visibleItemsInfo)).getIndex();
        int i = this.f103763p;
        if (index > i || i > index2) {
            this.f103763p = -1;
            Iterator<T> it = this.f103764q.values().iterator();
            while (it.hasNext()) {
                ((i09.InterfaceC7095b) it.next()).cancel();
            }
            this.f103764q.clear();
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, i09.InterfaceC7095b>> it = this.f103764q.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, i09.InterfaceC7095b> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i, int i2) {
        int iMin;
        int[] iArr = new int[i2];
        if (this.f103749b.getValue().getSpanProvider().isFullSpan(i)) {
            u70.fill$default(iArr, i, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.f103750c.ensureValidIndex(i + i2);
        int lane = this.f103750c.getLane(i);
        if (lane == -2 || lane == -1) {
            iMin = 0;
        } else {
            if (lane < 0) {
                throw new IllegalArgumentException(("Expected positive lane number, got " + lane + " instead.").toString());
            }
            iMin = Math.min(lane, i2);
        }
        int i3 = iMin;
        int i4 = i3 - 1;
        int iFindPreviousItemIndex = i;
        while (true) {
            if (-1 >= i4) {
                break;
            }
            iFindPreviousItemIndex = this.f103750c.findPreviousItemIndex(iFindPreviousItemIndex, i4);
            iArr[i4] = iFindPreviousItemIndex;
            if (iFindPreviousItemIndex == -1) {
                u70.fill$default(iArr, -1, 0, i4, 2, (Object) null);
                break;
            }
            i4--;
        }
        iArr[i3] = i;
        while (true) {
            i3++;
            if (i3 >= i2) {
                return iArr;
            }
            i = this.f103750c.findNextItemIndex(i, i3);
            iArr[i3] = i;
        }
    }

    private final void notifyPrefetch(float f, o29 o29Var) {
        int i;
        if (!this.f103758k || o29Var.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        int index = z ? ((q29) v82.last((List) o29Var.getVisibleItemsInfo())).getIndex() : ((q29) v82.first((List) o29Var.getVisibleItemsInfo())).getIndex();
        if (index == this.f103763p) {
            return;
        }
        this.f103763p = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        x29 slots = o29Var.getSlots();
        int length = slots.getSizes().length;
        for (int i2 = 0; i2 < length; i2++) {
            index = z ? this.f103750c.findNextItemIndex(index, i2) : this.f103750c.findPreviousItemIndex(index, i2);
            if (index < 0 || index >= o29Var.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.f103764q.containsKey(Integer.valueOf(index))) {
                boolean zIsFullSpan = o29Var.getSpanProvider().isFullSpan(index);
                int i3 = zIsFullSpan ? 0 : i2;
                int i4 = zIsFullSpan ? length : 1;
                if (i4 == 1) {
                    i = slots.getSizes()[i3];
                } else {
                    int i5 = slots.getPositions()[i3];
                    int i6 = (i3 + i4) - 1;
                    i = (slots.getPositions()[i6] + slots.getSizes()[i6]) - i5;
                }
                this.f103764q.put(Integer.valueOf(index), this.f103759l.m30145schedulePrefetch0kLqBqw(index, o29Var.getOrientation() == t7c.Vertical ? ku2.f55323b.m30775fixedWidthOenEA2s(i) : ku2.f55323b.m30774fixedHeightOenEA2s(i)));
            }
        }
        clearLeftoverPrefetchHandles(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float f) {
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.f103761n) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f103761n).toString());
        }
        float f2 = this.f103761n + f;
        this.f103761n = f2;
        if (Math.abs(f2) > 0.5f) {
            o29 value = this.f103749b.getValue();
            float f3 = this.f103761n;
            if (value.tryToApplyScrollWithoutRemeasure(p3a.roundToInt(f3))) {
                applyMeasureResult$foundation_release(value, true);
                aub.m27890invalidateScopeimpl(this.f103768u);
                notifyPrefetch(f3 - this.f103761n, value);
            } else {
                byd bydVar = this.f103754g;
                if (bydVar != null) {
                    bydVar.forceRemeasure();
                }
                m26503a(this, f3 - this.f103761n, null, 2, null);
            }
        }
        if (Math.abs(this.f103761n) <= 0.5f) {
            return f;
        }
        float f4 = f - this.f103761n;
        this.f103761n = 0.0f;
        return f4;
    }

    public static /* synthetic */ void requestScrollToItem$default(z29 z29Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        z29Var.requestScrollToItem(i, i2);
    }

    public static /* synthetic */ Object scrollToItem$default(z29 z29Var, int i, int i2, zy2 zy2Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return z29Var.scrollToItem(i, i2, zy2Var);
    }

    private void setCanScrollBackward(boolean z) {
        this.f103752e.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.f103751d.setValue(Boolean.valueOf(z));
    }

    @gib
    public final Object animateScrollToItem(int i, int i2, @yfb zy2<? super bth> zy2Var) {
        o29 value = this.f103749b.getValue();
        Object objAnimateScrollToItem = ix8.animateScrollToItem(this.f103753f, i, i2, value.getSlots().getSizes().length * 100, value.getDensity(), zy2Var);
        return objAnimateScrollToItem == pd8.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : bth.f14751a;
    }

    public final void applyMeasureResult$foundation_release(@yfb o29 o29Var, boolean z) {
        this.f103761n -= o29Var.getConsumedScroll();
        this.f103749b.setValue(o29Var);
        if (z) {
            this.f103748a.updateScrollOffset(o29Var.getFirstVisibleItemScrollOffsets());
        } else {
            this.f103748a.updateFromMeasureResult(o29Var);
            cancelPrefetchIfVisibleItemsChanged(o29Var);
        }
        setCanScrollBackward(o29Var.getCanScrollBackward());
        setCanScrollForward(o29Var.getCanScrollForward());
        this.f103762o++;
    }

    @Override // p000.ase
    public float dispatchRawDelta(float f) {
        return this.f103760m.dispatchRawDelta(f);
    }

    @yfb
    public final dn0 getAwaitLayoutModifier$foundation_release() {
        return this.f103756i;
    }

    @yfb
    public final lz8 getBeyondBoundsInfo$foundation_release() {
        return this.f103757j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public boolean getCanScrollBackward() {
        return ((Boolean) this.f103752e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public boolean getCanScrollForward() {
        return ((Boolean) this.f103751d.getValue()).booleanValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.f103748a.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f103748a.getScrollOffset();
    }

    @yfb
    public final q98 getInteractionSource() {
        return this.f103765r;
    }

    @yfb
    public final LazyLayoutItemAnimator<q29> getItemAnimator$foundation_release() {
        return this.f103767t;
    }

    public final int getLaneCount$foundation_release() {
        return this.f103749b.getValue().getSlots().getSizes().length;
    }

    @yfb
    public final i29 getLaneInfo$foundation_release() {
        return this.f103750c;
    }

    @Override // p000.ase
    public boolean getLastScrolledBackward() {
        return this.f103760m.getLastScrolledBackward();
    }

    @Override // p000.ase
    public boolean getLastScrolledForward() {
        return this.f103760m.getLastScrolledForward();
    }

    @yfb
    public final j29 getLayoutInfo() {
        return this.f103749b.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.f103762o;
    }

    @yfb
    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m33464getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f103769v;
    }

    @yfb
    public final l5b getMutableInteractionSource$foundation_release() {
        return this.f103765r;
    }

    @yfb
    public final f78 getNearestRange$foundation_release() {
        return this.f103748a.getNearestRangeState().getValue();
    }

    @yfb
    public final h09 getPinnedItems$foundation_release() {
        return this.f103766s;
    }

    @yfb
    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m33465getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f103768u;
    }

    @yfb
    public final i09 getPrefetchState$foundation_release() {
        return this.f103759l;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f103758k;
    }

    @gib
    public final byd getRemeasurement$foundation_release() {
        return this.f103754g;
    }

    @yfb
    public final cyd getRemeasurementModifier$foundation_release() {
        return this.f103755h;
    }

    @yfb
    public final t29 getScrollPosition$foundation_release() {
        return this.f103748a;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.f103761n;
    }

    @Override // p000.ase
    public boolean isScrollInProgress() {
        return this.f103760m.isScrollInProgress();
    }

    public final void requestScrollToItem(@h78(from = 0) int i, int i2) {
        if (isScrollInProgress()) {
            fg1.launch$default(this.f103749b.getValue().getCoroutineScope(), null, null, new C15944e(null), 3, null);
        }
        snapToItemInternal$foundation_release(i, i2, false);
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
            boolean r0 = r8 instanceof p000.z29.C15945f
            if (r0 == 0) goto L13
            r0 = r8
            z29$f r0 = (p000.z29.C15945f) r0
            int r1 = r0.f103780f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103780f = r1
            goto L18
        L13:
            z29$f r0 = new z29$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f103778d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f103780f
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
            java.lang.Object r6 = r0.f103777c
            r7 = r6
            gz6 r7 = (p000.gz6) r7
            java.lang.Object r6 = r0.f103776b
            j7b r6 = (p000.j7b) r6
            java.lang.Object r2 = r0.f103775a
            z29 r2 = (p000.z29) r2
            p000.y7e.throwOnFailure(r8)
            goto L5a
        L45:
            p000.y7e.throwOnFailure(r8)
            dn0 r8 = r5.f103756i
            r0.f103775a = r5
            r0.f103776b = r6
            r0.f103777c = r7
            r0.f103780f = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            ase r8 = r2.f103760m
            r2 = 0
            r0.f103775a = r2
            r0.f103776b = r2
            r0.f103777c = r2
            r0.f103780f = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z29.scroll(j7b, gz6, zy2):java.lang.Object");
    }

    @gib
    public final Object scrollToItem(int i, int i2, @yfb zy2<? super bth> zy2Var) {
        Object objScroll$default = ase.scroll$default(this, null, new C15947h(i, i2, null), zy2Var, 1, null);
        return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
    }

    public final void setMeasurePassCount$foundation_release(int i) {
        this.f103762o = i;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f103758k = z;
    }

    public final void snapToItemInternal$foundation_release(int i, int i2, boolean z) {
        boolean z2 = (this.f103748a.getIndex() == i && this.f103748a.getScrollOffset() == i2) ? false : true;
        if (z2) {
            this.f103767t.reset();
        }
        o29 value = this.f103749b.getValue();
        b29 b29VarFindVisibleItem = p29.findVisibleItem(value, i);
        if (b29VarFindVisibleItem == null || !z2) {
            this.f103748a.requestPositionAndForgetLastKnownKey(i, i2);
        } else {
            int iM27202getYimpl = (value.getOrientation() == t7c.Vertical ? a78.m27202getYimpl(b29VarFindVisibleItem.mo27944getOffsetnOccac()) : a78.m27201getXimpl(b29VarFindVisibleItem.mo27944getOffsetnOccac())) + i2;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = value.getFirstVisibleItemScrollOffsets()[i3] + iM27202getYimpl;
            }
            this.f103748a.updateScrollOffset(iArr);
        }
        if (!z) {
            aub.m27890invalidateScopeimpl(this.f103769v);
            return;
        }
        byd bydVar = this.f103754g;
        if (bydVar != null) {
            bydVar.forceRemeasure();
        }
    }

    @yfb
    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@yfb vz8 vz8Var, @yfb int[] iArr) {
        return this.f103748a.updateScrollPositionIfTheFirstItemWasMoved(vz8Var, iArr);
    }

    public /* synthetic */ z29(int i, int i2, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public z29(int i, int i2) {
        this(new int[]{i}, new int[]{i2}, null);
    }
}
