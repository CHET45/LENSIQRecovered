package p000;

import androidx.compose.animation.C0579l;
import androidx.compose.animation.C0581n;
import androidx.compose.animation.C0582o;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,254:1\n101#2,2:255\n33#2,6:257\n103#2:263\n33#2,6:273\n101#2,2:279\n33#2,6:281\n103#2:287\n51#2,6:288\n81#3:264\n107#3,2:265\n81#3:267\n107#3,2:268\n81#3:270\n107#3,2:271\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n*L\n43#1:255,2\n43#1:257,6\n43#1:263\n97#1:273,6\n115#1:279,2\n115#1:281,6\n115#1:287\n127#1:288,6\n45#1:264\n45#1:265,2\n79#1:267\n79#1:268,2\n83#1:270\n83#1:271,2\n*E\n"})
@e0g(parameters = 0)
public final class p9f {

    /* JADX INFO: renamed from: j */
    public static final int f70116j = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object f70117a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C0581n f70118b;

    /* JADX INFO: renamed from: f */
    @gib
    public C0579l f70122f;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f70119c = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f70120d = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f70121e = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: g */
    @yfb
    public final ytf<C0579l> f70123g = stf.mutableStateListOf();

    /* JADX INFO: renamed from: h */
    @yfb
    public final qy6<p9f, bth> f70124h = new C10866b();

    /* JADX INFO: renamed from: i */
    @yfb
    public final ny6<bth> f70125i = new C10865a();

    /* JADX INFO: renamed from: p9f$a */
    public static final class C10865a extends tt8 implements ny6<bth> {
        public C10865a() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            p9f.this.hasVisibleContent();
        }
    }

    /* JADX INFO: renamed from: p9f$b */
    public static final class C10866b extends tt8 implements qy6<p9f, bth> {
        public C10866b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(p9f p9fVar) {
            invoke2(p9fVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb p9f p9fVar) {
            p9f.this.updateMatch();
        }
    }

    public p9f(@yfb Object obj, @yfb C0581n c0581n) {
        this.f70117a = obj;
        this.f70118b = c0581n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final rud get_targetBounds() {
        return (rud) this.f70119c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasVisibleContent() {
        ytf<C0579l> ytfVar = this.f70123g;
        int size = ytfVar.size();
        for (int i = 0; i < size; i++) {
            if (ytfVar.get(i).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    private final void setFoundMatch(boolean z) {
        this.f70120d.setValue(Boolean.valueOf(z));
    }

    private final void set_targetBounds(rud rudVar) {
        this.f70119c.setValue(rudVar);
    }

    public final void addState(@yfb C0579l c0579l) {
        this.f70123g.add(c0579l);
        C0582o.getSharedTransitionObserver().observeReads(this, this.f70124h, this.f70125i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final rud getCurrentBounds() {
        return (rud) this.f70121e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getFoundMatch() {
        return ((Boolean) this.f70120d.getValue()).booleanValue();
    }

    @yfb
    public final Object getKey() {
        return this.f70117a;
    }

    @yfb
    public final C0581n getScope() {
        return this.f70118b;
    }

    @yfb
    public final ytf<C0579l> getStates() {
        return this.f70123g;
    }

    @gib
    public final rud getTargetBounds() {
        C0579l c0579l = this.f70122f;
        set_targetBounds(c0579l != null ? xud.m33303Recttz77jQw(c0579l.m27277calculateLookaheadOffsetF1C5BW0(), c0579l.m27278getNonNullLookaheadSizeNHjbRc()) : null);
        return get_targetBounds();
    }

    @gib
    public final C0579l getTargetBoundsProvider$animation_release() {
        return this.f70122f;
    }

    public final boolean isAnimating() {
        ytf<C0579l> ytfVar = this.f70123g;
        int size = ytfVar.size();
        for (int i = 0; i < size; i++) {
            if (ytfVar.get(i).getBoundsAnimation().isRunning()) {
                return getFoundMatch();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: onLookaheadResult-v_w8tDc, reason: not valid java name */
    public final void m31736onLookaheadResultv_w8tDc(@yfb C0579l c0579l, long j, long j2) {
        if (c0579l.getBoundsAnimation().getTarget()) {
            this.f70122f = c0579l;
            rud rudVar = get_targetBounds();
            izb izbVarM30418boximpl = rudVar != null ? izb.m30418boximpl(rudVar.m32208getTopLeftF1C5BW0()) : null;
            if (izbVarM30418boximpl == null ? false : izb.m30426equalsimpl0(izbVarM30418boximpl.m30439unboximpl(), j2)) {
                rud rudVar2 = get_targetBounds();
                wpf wpfVarM33057boximpl = rudVar2 != null ? wpf.m33057boximpl(rudVar2.m32206getSizeNHjbRc()) : null;
                if (wpfVarM33057boximpl == null ? false : wpf.m33065equalsimpl0(wpfVarM33057boximpl.m33074unboximpl(), j)) {
                    return;
                }
            }
            rud rudVarM33303Recttz77jQw = xud.m33303Recttz77jQw(j2, j);
            set_targetBounds(rudVarM33303Recttz77jQw);
            ytf<C0579l> ytfVar = this.f70123g;
            int size = ytfVar.size();
            for (int i = 0; i < size; i++) {
                lc1 boundsAnimation = ytfVar.get(i).getBoundsAnimation();
                rud currentBounds = getCurrentBounds();
                md8.checkNotNull(currentBounds);
                boundsAnimation.animate(currentBounds, rudVarM33303Recttz77jQw);
            }
        }
    }

    public final void onSharedTransitionFinished() {
        setFoundMatch(this.f70123g.size() > 1 && hasVisibleContent());
        set_targetBounds(null);
    }

    public final void removeState(@yfb C0579l c0579l) {
        this.f70123g.remove(c0579l);
        if (!this.f70123g.isEmpty()) {
            C0582o.getSharedTransitionObserver().observeReads(this, this.f70124h, this.f70125i);
        } else {
            updateMatch();
            C0582o.getSharedTransitionObserver().clear(this);
        }
    }

    public final void setCurrentBounds(@gib rud rudVar) {
        this.f70121e.setValue(rudVar);
    }

    public final void updateMatch() {
        boolean zHasVisibleContent = hasVisibleContent();
        if (this.f70123g.size() > 1 && zHasVisibleContent) {
            setFoundMatch(true);
        } else if (!this.f70118b.isTransitionActive() || !zHasVisibleContent) {
            setFoundMatch(false);
        }
        if (this.f70123g.isEmpty()) {
            return;
        }
        C0582o.getSharedTransitionObserver().observeReads(this, this.f70124h, this.f70125i);
    }

    public final void updateTargetBoundsProvider() {
        ytf<C0579l> ytfVar = this.f70123g;
        int size = ytfVar.size() - 1;
        C0579l c0579l = null;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C0579l c0579l2 = ytfVar.get(size);
                if (c0579l2.getBoundsAnimation().getTarget()) {
                    c0579l = c0579l2;
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (md8.areEqual(c0579l, this.f70122f)) {
            return;
        }
        this.f70122f = c0579l;
        set_targetBounds(null);
    }
}
