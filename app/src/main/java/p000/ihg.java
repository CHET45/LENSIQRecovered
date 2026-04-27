package p000;

import com.yanzhenjie.recyclerview.SwipeMenuLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ihg {

    /* JADX INFO: renamed from: d */
    public static final int f47049d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f47050e = 1;

    /* JADX INFO: renamed from: a */
    public SwipeMenuLayout f47051a;

    /* JADX INFO: renamed from: b */
    public int f47052b = 0;

    /* JADX INFO: renamed from: c */
    public List<lhg> f47053c = new ArrayList(2);

    /* JADX INFO: renamed from: ihg$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7292a {
    }

    public ihg(SwipeMenuLayout swipeMenuLayout) {
        this.f47051a = swipeMenuLayout;
    }

    public void addMenuItem(lhg lhgVar) {
        this.f47053c.add(lhgVar);
    }

    public List<lhg> getMenuItems() {
        return this.f47053c;
    }

    public int getOrientation() {
        return this.f47052b;
    }

    public boolean hasMenuItems() {
        return !this.f47053c.isEmpty();
    }

    public void removeMenuItem(lhg lhgVar) {
        this.f47053c.remove(lhgVar);
    }

    public void setOpenPercent(@y46(from = 0.1d, m25645to = 1.0d) float f) {
        this.f47051a.setOpenPercent(f);
    }

    public void setOrientation(int i) {
        this.f47052b = i;
    }

    public void setScrollerDuration(@h78(from = 1) int i) {
        this.f47051a.setScrollerDuration(i);
    }
}
