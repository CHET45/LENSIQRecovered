package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
public interface jz8 {
    float calculateDistanceTo(int i);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    @gib
    Object scroll(@yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var);

    void snapToItem(@yfb vre vreVar, int i, int i2);
}
