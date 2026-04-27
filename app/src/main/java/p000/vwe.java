package p000;

/* JADX INFO: loaded from: classes.dex */
public interface vwe {
    @yfb
    ol9<gwe> createSubSelections(@yfb gwe gweVar);

    void forEachMiddleInfo(@yfb qy6<? super ewe, bth> qy6Var);

    @yfb
    z83 getCrossStatus();

    @yfb
    ewe getCurrentInfo();

    @yfb
    ewe getEndInfo();

    int getEndSlot();

    @yfb
    ewe getFirstInfo();

    @yfb
    ewe getLastInfo();

    @gib
    gwe getPreviousSelection();

    int getSize();

    @yfb
    ewe getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(@gib vwe vweVar);
}
