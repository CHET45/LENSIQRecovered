package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: ha */
/* JADX INFO: loaded from: classes4.dex */
public final class C6760ha implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f42967a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TabLayout f42968b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f42969c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ViewPager2 f42970d;

    private C6760ha(@efb LinearLayout rootView, @efb TabLayout tabLayout, @efb ToolBar titleBar, @efb ViewPager2 viewPager) {
        this.f42967a = rootView;
        this.f42968b = tabLayout;
        this.f42969c = titleBar;
        this.f42970d = viewPager;
    }

    @efb
    public static C6760ha bind(@efb View rootView) {
        int i = C2558R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) l8i.findChildViewById(rootView, i);
        if (tabLayout != null) {
            i = C2558R.id.title_bar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                i = C2558R.id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) l8i.findChildViewById(rootView, i);
                if (viewPager2 != null) {
                    return new C6760ha((LinearLayout) rootView, tabLayout, toolBar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C6760ha inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C6760ha inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f42967a;
    }
}
