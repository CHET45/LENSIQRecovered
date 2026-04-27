package p000;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,733:1\n1#2:734\n69#3,6:735\n*S KotlinDebug\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n*L\n270#1:735,6\n*E\n"})
public final class f3b implements vwe {

    /* JADX INFO: renamed from: a */
    @yfb
    public final el9 f34998a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<ewe> f34999b;

    /* JADX INFO: renamed from: c */
    public final int f35000c;

    /* JADX INFO: renamed from: d */
    public final int f35001d;

    /* JADX INFO: renamed from: e */
    public final boolean f35002e;

    /* JADX INFO: renamed from: f */
    @gib
    public final gwe f35003f;

    /* JADX INFO: renamed from: f3b$a */
    public /* synthetic */ class C5582a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35004a;

        static {
            int[] iArr = new int[z83.values().length];
            try {
                iArr[z83.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z83.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z83.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35004a = iArr;
        }
    }

    /* JADX INFO: renamed from: f3b$b */
    public static final class C5583b extends tt8 implements qy6<ewe, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ u5b<gwe> f35006b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gwe f35007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5583b(u5b<gwe> u5bVar, gwe gweVar) {
            super(1);
            this.f35006b = u5bVar;
            this.f35007c = gweVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ewe eweVar) {
            invoke2(eweVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ewe eweVar) {
            f3b.this.createAndPutSubSelection(this.f35006b, this.f35007c, eweVar, 0, eweVar.getTextLength());
        }
    }

    public f3b(@yfb el9 el9Var, @yfb List<ewe> list, int i, int i2, boolean z, @gib gwe gweVar) {
        this.f34998a = el9Var;
        this.f34999b = list;
        this.f35000c = i;
        this.f35001d = i2;
        this.f35002e = z;
        this.f35003f = gweVar;
        if (list.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + a18.f100c).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndPutSubSelection(u5b<gwe> u5bVar, gwe gweVar, ewe eweVar, int i, int i2) {
        gwe gweVarMakeSingleLayoutSelection = gweVar.getHandlesCrossed() ? eweVar.makeSingleLayoutSelection(i2, i) : eweVar.makeSingleLayoutSelection(i, i2);
        if (i <= i2) {
            u5bVar.put(eweVar.getSelectableId(), gweVarMakeSingleLayoutSelection);
            return;
        }
        throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + gweVarMakeSingleLayoutSelection).toString());
    }

    private final int getInfoListIndexBySelectableId(long j) {
        try {
            return this.f34998a.get(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Invalid selectableId: " + j, e);
        }
    }

    private final boolean shouldAnyInfoRecomputeSelection(f3b f3bVar) {
        if (getSize() != f3bVar.getSize()) {
            return true;
        }
        int size = this.f34999b.size();
        for (int i = 0; i < size; i++) {
            if (this.f34999b.get(i).shouldRecomputeSelection(f3bVar.f34999b.get(i))) {
                return true;
            }
        }
        return false;
    }

    private final int slotToIndex(int i, boolean z) {
        return (i - (!z ? 1 : 0)) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int startOrEndSlotToIndex(int r4, boolean r5) {
        /*
            r3 = this;
            z83 r0 = r3.getCrossStatus()
            int[] r1 = p000.f3b.C5582a.f35004a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L21
            r2 = 3
            if (r0 != r2) goto L1b
            if (r5 != 0) goto L19
        L17:
            r5 = r1
            goto L21
        L19:
            r5 = 0
            goto L21
        L1b:
            ceb r4 = new ceb
            r4.<init>()
            throw r4
        L21:
            int r4 = r3.slotToIndex(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f3b.startOrEndSlotToIndex(int, boolean):int");
    }

    @Override // p000.vwe
    @yfb
    public ol9<gwe> createSubSelections(@yfb gwe gweVar) {
        if (gweVar.getStart().getSelectableId() != gweVar.getEnd().getSelectableId()) {
            u5b<gwe> u5bVarMutableLongObjectMapOf = pl9.mutableLongObjectMapOf();
            createAndPutSubSelection(u5bVarMutableLongObjectMapOf, gweVar, getFirstInfo(), (gweVar.getHandlesCrossed() ? gweVar.getEnd() : gweVar.getStart()).getOffset(), getFirstInfo().getTextLength());
            forEachMiddleInfo(new C5583b(u5bVarMutableLongObjectMapOf, gweVar));
            createAndPutSubSelection(u5bVarMutableLongObjectMapOf, gweVar, getLastInfo(), 0, (gweVar.getHandlesCrossed() ? gweVar.getStart() : gweVar.getEnd()).getOffset());
            return u5bVarMutableLongObjectMapOf;
        }
        if ((gweVar.getHandlesCrossed() && gweVar.getStart().getOffset() >= gweVar.getEnd().getOffset()) || (!gweVar.getHandlesCrossed() && gweVar.getStart().getOffset() <= gweVar.getEnd().getOffset())) {
            return pl9.longObjectMapOf(gweVar.getStart().getSelectableId(), gweVar);
        }
        throw new IllegalStateException(("unexpectedly miss-crossed selection: " + gweVar).toString());
    }

    @Override // p000.vwe
    public void forEachMiddleInfo(@yfb qy6<? super ewe, bth> qy6Var) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i = infoListIndexBySelectableId + 1;
        if (i >= infoListIndexBySelectableId2) {
            return;
        }
        while (i < infoListIndexBySelectableId2) {
            qy6Var.invoke(this.f34999b.get(i));
            i++;
        }
    }

    @Override // p000.vwe
    @yfb
    public z83 getCrossStatus() {
        return getStartSlot() < getEndSlot() ? z83.NOT_CROSSED : getStartSlot() > getEndSlot() ? z83.CROSSED : this.f34999b.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // p000.vwe
    @yfb
    public ewe getCurrentInfo() {
        return isStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // p000.vwe
    @yfb
    public ewe getEndInfo() {
        return this.f34999b.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // p000.vwe
    public int getEndSlot() {
        return this.f35001d;
    }

    @Override // p000.vwe
    @yfb
    public ewe getFirstInfo() {
        return getCrossStatus() == z83.CROSSED ? getEndInfo() : getStartInfo();
    }

    @yfb
    public final List<ewe> getInfoList() {
        return this.f34999b;
    }

    @Override // p000.vwe
    @yfb
    public ewe getLastInfo() {
        return getCrossStatus() == z83.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // p000.vwe
    @gib
    public gwe getPreviousSelection() {
        return this.f35003f;
    }

    @yfb
    public final el9 getSelectableIdToInfoListIndex() {
        return this.f34998a;
    }

    @Override // p000.vwe
    public int getSize() {
        return this.f34999b.size();
    }

    @Override // p000.vwe
    @yfb
    public ewe getStartInfo() {
        return this.f34999b.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // p000.vwe
    public int getStartSlot() {
        return this.f35000c;
    }

    @Override // p000.vwe
    public boolean isStartHandle() {
        return this.f35002e;
    }

    @Override // p000.vwe
    public boolean shouldRecomputeSelection(@gib vwe vweVar) {
        if (getPreviousSelection() != null && vweVar != null && (vweVar instanceof f3b)) {
            f3b f3bVar = (f3b) vweVar;
            if (isStartHandle() == f3bVar.isStartHandle() && getStartSlot() == f3bVar.getStartSlot() && getEndSlot() == f3bVar.getEndSlot() && !shouldAnyInfoRecomputeSelection(f3bVar)) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiSelectionLayout(isStartHandle=");
        sb.append(isStartHandle());
        sb.append(", startPosition=");
        boolean z = true;
        float f = 2;
        sb.append((getStartSlot() + 1) / f);
        sb.append(", endPosition=");
        sb.append((getEndSlot() + 1) / f);
        sb.append(", crossed=");
        sb.append(getCrossStatus());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[\n\t");
        List<ewe> list = this.f34999b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ewe eweVar = list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(eweVar);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }
}
