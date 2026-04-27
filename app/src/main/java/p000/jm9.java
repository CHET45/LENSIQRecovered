package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,247:1\n175#2:248\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n245#1:248\n*E\n"})
@e0g(parameters = 1)
public final class jm9 extends AbstractC12150rm {

    /* JADX INFO: renamed from: k */
    public static final int f51193k = 0;

    public jm9(@yfb InterfaceC12654sm interfaceC12654sm) {
        super(interfaceC12654sm, null);
    }

    @Override // p000.AbstractC12150rm
    /* JADX INFO: renamed from: a */
    public long mo14178a(@yfb heb hebVar, long j) {
        lm9 lookaheadDelegate = hebVar.getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        long jMo30030getPositionnOccac = lookaheadDelegate.mo30030getPositionnOccac();
        return izb.m30434plusMKHz9U(mzb.Offset(a78.m27201getXimpl(jMo30030getPositionnOccac), a78.m27202getYimpl(jMo30030getPositionnOccac)), j);
    }

    @Override // p000.AbstractC12150rm
    @yfb
    /* JADX INFO: renamed from: b */
    public Map<AbstractC9938nm, Integer> mo14179b(@yfb heb hebVar) {
        lm9 lookaheadDelegate = hebVar.getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // p000.AbstractC12150rm
    /* JADX INFO: renamed from: c */
    public int mo14180c(@yfb heb hebVar, @yfb AbstractC9938nm abstractC9938nm) {
        lm9 lookaheadDelegate = hebVar.getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.get(abstractC9938nm);
    }
}
