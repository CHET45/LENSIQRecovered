package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: eb */
/* JADX INFO: loaded from: classes4.dex */
public final class C5226eb implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f32433a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TabLayout f32434b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f32435c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ViewPager2 f32436d;

    private C5226eb(@efb LinearLayout rootView, @efb TabLayout tabLayout, @efb ToolBar titleBar, @efb ViewPager2 viewPager) {
        this.f32433a = rootView;
        this.f32434b = tabLayout;
        this.f32435c = titleBar;
        this.f32436d = viewPager;
    }

    @efb
    public static C5226eb bind(@efb View rootView) {
        int i = C2531R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) l8i.findChildViewById(rootView, i);
        if (tabLayout != null) {
            i = C2531R.id.title_bar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                i = C2531R.id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) l8i.findChildViewById(rootView, i);
                if (viewPager2 != null) {
                    return new C5226eb((LinearLayout) rootView, tabLayout, toolBar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C5226eb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5226eb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f32433a;
    }
}
