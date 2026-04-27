package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class mw8 extends AbstractC12150rm {

    /* JADX INFO: renamed from: k */
    public static final int f62563k = 0;

    public mw8(@yfb InterfaceC12654sm interfaceC12654sm) {
        super(interfaceC12654sm, null);
    }

    @Override // p000.AbstractC12150rm
    /* JADX INFO: renamed from: a */
    public long mo14178a(@yfb heb hebVar, long j) {
        return heb.m30024toParentPosition8S9VItk$default(hebVar, j, false, 2, null);
    }

    @Override // p000.AbstractC12150rm
    @yfb
    /* JADX INFO: renamed from: b */
    public Map<AbstractC9938nm, Integer> mo14179b(@yfb heb hebVar) {
        return hebVar.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // p000.AbstractC12150rm
    /* JADX INFO: renamed from: c */
    public int mo14180c(@yfb heb hebVar, @yfb AbstractC9938nm abstractC9938nm) {
        return hebVar.get(abstractC9938nm);
    }
}
