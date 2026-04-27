package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: rm */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,247:1\n26#2:248\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n*L\n138#1:248\n*E\n"})
@e0g(parameters = 0)
public abstract class AbstractC12150rm {

    /* JADX INFO: renamed from: j */
    public static final int f78677j = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC12654sm f78678a;

    /* JADX INFO: renamed from: b */
    public boolean f78679b;

    /* JADX INFO: renamed from: c */
    public boolean f78680c;

    /* JADX INFO: renamed from: d */
    public boolean f78681d;

    /* JADX INFO: renamed from: e */
    public boolean f78682e;

    /* JADX INFO: renamed from: f */
    public boolean f78683f;

    /* JADX INFO: renamed from: g */
    public boolean f78684g;

    /* JADX INFO: renamed from: h */
    @gib
    public InterfaceC12654sm f78685h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final Map<AbstractC9938nm, Integer> f78686i;

    /* JADX INFO: renamed from: rm$a */
    @dwf({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n215#2,2:248\n1855#3,2:250\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:248,2\n170#1:250,2\n*E\n"})
    public static final class a extends tt8 implements qy6<InterfaceC12654sm, bth> {
        public a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(InterfaceC12654sm interfaceC12654sm) {
            invoke2(interfaceC12654sm);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb InterfaceC12654sm interfaceC12654sm) {
            if (interfaceC12654sm.isPlaced()) {
                if (interfaceC12654sm.getAlignmentLines().getDirty$ui_release()) {
                    interfaceC12654sm.layoutChildren();
                }
                Map map = interfaceC12654sm.getAlignmentLines().f78686i;
                AbstractC12150rm abstractC12150rm = AbstractC12150rm.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC12150rm.addAlignmentLine((AbstractC9938nm) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC12654sm.getInnerCoordinator());
                }
                heb wrappedBy$ui_release = interfaceC12654sm.getInnerCoordinator().getWrappedBy$ui_release();
                md8.checkNotNull(wrappedBy$ui_release);
                while (!md8.areEqual(wrappedBy$ui_release, AbstractC12150rm.this.getAlignmentLinesOwner().getInnerCoordinator())) {
                    Set<AbstractC9938nm> setKeySet = AbstractC12150rm.this.mo14179b(wrappedBy$ui_release).keySet();
                    AbstractC12150rm abstractC12150rm2 = AbstractC12150rm.this;
                    for (AbstractC9938nm abstractC9938nm : setKeySet) {
                        abstractC12150rm2.addAlignmentLine(abstractC9938nm, abstractC12150rm2.mo14180c(wrappedBy$ui_release, abstractC9938nm), wrappedBy$ui_release);
                    }
                    wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                    md8.checkNotNull(wrappedBy$ui_release);
                }
            }
        }
    }

    public /* synthetic */ AbstractC12150rm(InterfaceC12654sm interfaceC12654sm, jt3 jt3Var) {
        this(interfaceC12654sm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAlignmentLine(AbstractC9938nm abstractC9938nm, int i, heb hebVar) {
        float f = i;
        long jOffset = mzb.Offset(f, f);
        while (true) {
            jOffset = mo14178a(hebVar, jOffset);
            hebVar = hebVar.getWrappedBy$ui_release();
            md8.checkNotNull(hebVar);
            if (md8.areEqual(hebVar, this.f78678a.getInnerCoordinator())) {
                break;
            } else if (mo14179b(hebVar).containsKey(abstractC9938nm)) {
                float fMo14180c = mo14180c(hebVar, abstractC9938nm);
                jOffset = mzb.Offset(fMo14180c, fMo14180c);
            }
        }
        int iRound = Math.round(abstractC9938nm instanceof kl7 ? izb.m30430getYimpl(jOffset) : izb.m30429getXimpl(jOffset));
        Map<AbstractC9938nm, Integer> map = this.f78686i;
        if (map.containsKey(abstractC9938nm)) {
            iRound = C10463om.merge(abstractC9938nm, ((Number) xt9.getValue(this.f78686i, abstractC9938nm)).intValue(), iRound);
        }
        map.put(abstractC9938nm, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo14178a(@yfb heb hebVar, long j);

    @yfb
    /* JADX INFO: renamed from: b */
    public abstract Map<AbstractC9938nm, Integer> mo14179b(@yfb heb hebVar);

    /* JADX INFO: renamed from: c */
    public abstract int mo14180c(@yfb heb hebVar, @yfb AbstractC9938nm abstractC9938nm);

    @yfb
    public final InterfaceC12654sm getAlignmentLinesOwner() {
        return this.f78678a;
    }

    public final boolean getDirty$ui_release() {
        return this.f78679b;
    }

    @yfb
    public final Map<AbstractC9938nm, Integer> getLastCalculation() {
        return this.f78686i;
    }

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.f78682e;
    }

    public final boolean getQueried$ui_release() {
        return this.f78680c || this.f78682e || this.f78683f || this.f78684g;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        return this.f78685h != null;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.f78684g;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.f78683f;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.f78681d;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.f78680c;
    }

    public final void onAlignmentsChanged() {
        this.f78679b = true;
        InterfaceC12654sm parentAlignmentLinesOwner = this.f78678a.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.f78680c) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.f78682e || this.f78681d) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.f78683f) {
            this.f78678a.requestMeasure();
        }
        if (this.f78684g) {
            this.f78678a.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        this.f78686i.clear();
        this.f78678a.forEachChildAlignmentLinesOwner(new a());
        this.f78686i.putAll(mo14179b(this.f78678a.getInnerCoordinator()));
        this.f78679b = false;
    }

    public final void recalculateQueryOwner() {
        InterfaceC12654sm interfaceC12654sm;
        AbstractC12150rm alignmentLines;
        AbstractC12150rm alignmentLines2;
        if (getQueried$ui_release()) {
            interfaceC12654sm = this.f78678a;
        } else {
            InterfaceC12654sm parentAlignmentLinesOwner = this.f78678a.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            interfaceC12654sm = parentAlignmentLinesOwner.getAlignmentLines().f78685h;
            if (interfaceC12654sm == null || !interfaceC12654sm.getAlignmentLines().getQueried$ui_release()) {
                InterfaceC12654sm interfaceC12654sm2 = this.f78685h;
                if (interfaceC12654sm2 == null || interfaceC12654sm2.getAlignmentLines().getQueried$ui_release()) {
                    return;
                }
                InterfaceC12654sm parentAlignmentLinesOwner2 = interfaceC12654sm2.getParentAlignmentLinesOwner();
                if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                    alignmentLines2.recalculateQueryOwner();
                }
                InterfaceC12654sm parentAlignmentLinesOwner3 = interfaceC12654sm2.getParentAlignmentLinesOwner();
                interfaceC12654sm = (parentAlignmentLinesOwner3 == null || (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) == null) ? null : alignmentLines.f78685h;
            }
        }
        this.f78685h = interfaceC12654sm;
    }

    public final void reset$ui_release() {
        this.f78679b = true;
        this.f78680c = false;
        this.f78682e = false;
        this.f78681d = false;
        this.f78683f = false;
        this.f78684g = false;
        this.f78685h = null;
    }

    public final void setDirty$ui_release(boolean z) {
        this.f78679b = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z) {
        this.f78682e = z;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z) {
        this.f78684g = z;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z) {
        this.f78683f = z;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z) {
        this.f78681d = z;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z) {
        this.f78680c = z;
    }

    private AbstractC12150rm(InterfaceC12654sm interfaceC12654sm) {
        this.f78678a = interfaceC12654sm;
        this.f78679b = true;
        this.f78686i = new HashMap();
    }
}
