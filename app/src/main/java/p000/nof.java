package p000;

/* JADX INFO: loaded from: classes.dex */
public final class nof implements vwe {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C9961a f65140f = new C9961a(null);

    /* JADX INFO: renamed from: g */
    public static final int f65141g = 1;

    /* JADX INFO: renamed from: h */
    public static final long f65142h = 1;

    /* JADX INFO: renamed from: a */
    public final boolean f65143a;

    /* JADX INFO: renamed from: b */
    public final int f65144b;

    /* JADX INFO: renamed from: c */
    public final int f65145c;

    /* JADX INFO: renamed from: d */
    @gib
    public final gwe f65146d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ewe f65147e;

    /* JADX INFO: renamed from: nof$a */
    public static final class C9961a {
        public /* synthetic */ C9961a(jt3 jt3Var) {
            this();
        }

        private C9961a() {
        }
    }

    public nof(boolean z, int i, int i2, @gib gwe gweVar, @yfb ewe eweVar) {
        this.f65143a = z;
        this.f65144b = i;
        this.f65145c = i2;
        this.f65146d = gweVar;
        this.f65147e = eweVar;
    }

    @Override // p000.vwe
    @yfb
    public ol9<gwe> createSubSelections(@yfb gwe gweVar) {
        if ((!gweVar.getHandlesCrossed() && gweVar.getStart().getOffset() > gweVar.getEnd().getOffset()) || (gweVar.getHandlesCrossed() && gweVar.getStart().getOffset() <= gweVar.getEnd().getOffset())) {
            gweVar = gwe.copy$default(gweVar, null, null, !gweVar.getHandlesCrossed(), 3, null);
        }
        return pl9.longObjectMapOf(this.f65147e.getSelectableId(), gweVar);
    }

    @Override // p000.vwe
    public void forEachMiddleInfo(@yfb qy6<? super ewe, bth> qy6Var) {
    }

    @Override // p000.vwe
    @yfb
    public z83 getCrossStatus() {
        return getStartSlot() < getEndSlot() ? z83.NOT_CROSSED : getStartSlot() > getEndSlot() ? z83.CROSSED : this.f65147e.getRawCrossStatus();
    }

    @Override // p000.vwe
    @yfb
    public ewe getCurrentInfo() {
        return this.f65147e;
    }

    @Override // p000.vwe
    @yfb
    public ewe getEndInfo() {
        return this.f65147e;
    }

    @Override // p000.vwe
    public int getEndSlot() {
        return this.f65145c;
    }

    @Override // p000.vwe
    @yfb
    public ewe getFirstInfo() {
        return this.f65147e;
    }

    @Override // p000.vwe
    @yfb
    public ewe getLastInfo() {
        return this.f65147e;
    }

    @Override // p000.vwe
    @gib
    public gwe getPreviousSelection() {
        return this.f65146d;
    }

    @Override // p000.vwe
    public int getSize() {
        return 1;
    }

    @Override // p000.vwe
    @yfb
    public ewe getStartInfo() {
        return this.f65147e;
    }

    @Override // p000.vwe
    public int getStartSlot() {
        return this.f65144b;
    }

    @Override // p000.vwe
    public boolean isStartHandle() {
        return this.f65143a;
    }

    @Override // p000.vwe
    public boolean shouldRecomputeSelection(@gib vwe vweVar) {
        if (getPreviousSelection() != null && vweVar != null && (vweVar instanceof nof)) {
            nof nofVar = (nof) vweVar;
            if (getStartSlot() == nofVar.getStartSlot() && getEndSlot() == nofVar.getEndSlot() && isStartHandle() == nofVar.isStartHandle() && !this.f65147e.shouldRecomputeSelection(nofVar.f65147e)) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + isStartHandle() + ", crossed=" + getCrossStatus() + ", info=\n\t" + this.f65147e + ')';
    }
}
