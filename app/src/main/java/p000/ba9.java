package p000;

import android.widget.ListView;

/* JADX INFO: loaded from: classes3.dex */
public class ba9 extends dj0 {

    /* JADX INFO: renamed from: o2 */
    public final ListView f13159o2;

    public ba9(@efb ListView listView) {
        super(listView);
        this.f13159o2 = listView;
    }

    @Override // p000.dj0
    public boolean canTargetScrollHorizontally(int i) {
        return false;
    }

    @Override // p000.dj0
    public boolean canTargetScrollVertically(int i) {
        ListView listView = this.f13159o2;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.dj0
    public void scrollTargetBy(int i, int i2) {
        this.f13159o2.scrollListBy(i2);
    }
}
