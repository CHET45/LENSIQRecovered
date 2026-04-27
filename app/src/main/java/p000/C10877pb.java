package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: pb */
/* JADX INFO: loaded from: classes4.dex */
public final class C10877pb implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f70197a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TabLayout f70198b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f70199c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ViewPager2 f70200d;

    private C10877pb(@efb LinearLayout rootView, @efb TabLayout tabLayout, @efb ToolBar titleBar, @efb ViewPager2 viewPager) {
        this.f70197a = rootView;
        this.f70198b = tabLayout;
        this.f70199c = titleBar;
        this.f70200d = viewPager;
    }

    @efb
    public static C10877pb bind(@efb View rootView) {
        int i = C2558R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) l8i.findChildViewById(rootView, i);
        if (tabLayout != null) {
            i = C2558R.id.title_bar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                i = C2558R.id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) l8i.findChildViewById(rootView, i);
                if (viewPager2 != null) {
                    return new C10877pb((LinearLayout) rootView, tabLayout, toolBar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C10877pb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C10877pb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_new_student_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f70197a;
    }
}
