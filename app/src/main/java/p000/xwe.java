package p000;

import p000.gwe;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
public final class xwe {

    /* JADX INFO: renamed from: a */
    public static final int f99591a = -1;

    /* JADX INFO: renamed from: xwe$a */
    public /* synthetic */ class C15336a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99592a;

        static {
            int[] iArr = new int[pd4.values().length];
            try {
                iArr[pd4.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pd4.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pd4.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f99592a = iArr;
        }
    }

    /* JADX INFO: renamed from: xwe$b */
    public static final class C15337b extends tt8 implements qy6<ewe, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8114a f99593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15337b(jvd.C8114a c8114a) {
            super(1);
            this.f99593a = c8114a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ewe eweVar) {
            invoke2(eweVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ewe eweVar) {
            if (eweVar.getInputText().length() > 0) {
                this.f99593a.f52103a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q5e getTextDirectionForOffset(hug hugVar, int i) {
        return isOffsetAnEmptyLine(hugVar, i) ? hugVar.getParagraphDirection(i) : hugVar.getBidiRunDirection(i);
    }

    @yfb
    /* JADX INFO: renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final vwe m33326getTextFieldSelectionLayoutRcvTLA(@yfb hug hugVar, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new nof(z2, 1, 1, z ? null : new gwe(new gwe.C6633a(getTextDirectionForOffset(hugVar, jvg.m30593getStartimpl(j)), jvg.m30593getStartimpl(j), 1L), new gwe.C6633a(getTextDirectionForOffset(hugVar, jvg.m30588getEndimpl(j)), jvg.m30588getEndimpl(j), 1L), jvg.m30592getReversedimpl(j)), new ewe(1L, 1, i, i2, i3, hugVar));
    }

    public static final boolean isCollapsed(@gib gwe gweVar, @gib vwe vweVar) {
        if (gweVar == null || vweVar == null) {
            return true;
        }
        if (gweVar.getStart().getSelectableId() == gweVar.getEnd().getSelectableId()) {
            return gweVar.getStart().getOffset() == gweVar.getEnd().getOffset();
        }
        if ((gweVar.getHandlesCrossed() ? gweVar.getStart() : gweVar.getEnd()).getOffset() != 0) {
            return false;
        }
        if (vweVar.getFirstInfo().getTextLength() != (gweVar.getHandlesCrossed() ? gweVar.getEnd() : gweVar.getStart()).getOffset()) {
            return false;
        }
        jvd.C8114a c8114a = new jvd.C8114a();
        c8114a.f52103a = true;
        vweVar.forEachMiddleInfo(new C15337b(c8114a));
        return c8114a.f52103a;
    }

    private static final boolean isOffsetAnEmptyLine(hug hugVar, int i) {
        if (hugVar.getLayoutInput().getText().length() == 0) {
            return true;
        }
        int lineForOffset = hugVar.getLineForOffset(i);
        return (i == 0 || lineForOffset != hugVar.getLineForOffset(i + (-1))) && (i == hugVar.getLayoutInput().getText().length() || lineForOffset != hugVar.getLineForOffset(i + 1));
    }

    @yfb
    public static final pd4 resolve2dDirection(@yfb pd4 pd4Var, @yfb pd4 pd4Var2) {
        int[] iArr = C15336a.f99592a;
        int i = iArr[pd4Var2.ordinal()];
        if (i == 1) {
            return pd4.BEFORE;
        }
        if (i != 2) {
            if (i == 3) {
                return pd4.AFTER;
            }
            throw new ceb();
        }
        int i2 = iArr[pd4Var.ordinal()];
        if (i2 == 1) {
            return pd4.BEFORE;
        }
        if (i2 == 2) {
            return pd4.ON;
        }
        if (i2 == 3) {
            return pd4.AFTER;
        }
        throw new ceb();
    }
}
