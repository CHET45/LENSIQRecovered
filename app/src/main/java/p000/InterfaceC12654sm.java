package p000;

import java.util.Map;

/* JADX INFO: renamed from: sm */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC12654sm extends rba {
    @yfb
    Map<AbstractC9938nm, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(@yfb qy6<? super InterfaceC12654sm, bth> qy6Var);

    @yfb
    AbstractC12150rm getAlignmentLines();

    @yfb
    heb getInnerCoordinator();

    @gib
    InterfaceC12654sm getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
