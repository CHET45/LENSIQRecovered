package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.eyevue.glassapp.C2558R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class ib4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ViewPager2 f46432C;

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f46433a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f46434b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f46435c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f46436d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f46437e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TabLayout f46438f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f46439m;

    private ib4(@efb FrameLayout rootView, @efb Button btnKnow, @efb Button btnNext, @efb ImageView imgLine, @efb RelativeLayout ivClose, @efb TabLayout tabLayout, @efb RelativeLayout titleLayout, @efb ViewPager2 viewPager) {
        this.f46433a = rootView;
        this.f46434b = btnKnow;
        this.f46435c = btnNext;
        this.f46436d = imgLine;
        this.f46437e = ivClose;
        this.f46438f = tabLayout;
        this.f46439m = titleLayout;
        this.f46432C = viewPager;
    }

    @efb
    public static ib4 bind(@efb View rootView) {
        int i = C2558R.id.btn_know;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C2558R.id.btn_next;
            Button button2 = (Button) l8i.findChildViewById(rootView, i);
            if (button2 != null) {
                i = C2558R.id.img_line;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.iv_close;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C2558R.id.tab_layout;
                        TabLayout tabLayout = (TabLayout) l8i.findChildViewById(rootView, i);
                        if (tabLayout != null) {
                            i = C2558R.id.title_layout;
                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout2 != null) {
                                i = C2558R.id.viewPager;
                                ViewPager2 viewPager2 = (ViewPager2) l8i.findChildViewById(rootView, i);
                                if (viewPager2 != null) {
                                    return new ib4((FrameLayout) rootView, button, button2, imageView, relativeLayout, tabLayout, relativeLayout2, viewPager2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ib4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ib4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_new_student_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f46433a;
    }
}
