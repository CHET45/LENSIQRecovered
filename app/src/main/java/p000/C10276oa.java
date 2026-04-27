package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: oa */
/* JADX INFO: loaded from: classes4.dex */
public final class C10276oa implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f66956a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ViewPager2 f66957b;

    private C10276oa(@efb ConstraintLayout rootView, @efb ViewPager2 viewPager) {
        this.f66956a = rootView;
        this.f66957b = viewPager;
    }

    @efb
    public static C10276oa bind(@efb View rootView) {
        int i = C2558R.id.view_pager;
        ViewPager2 viewPager2 = (ViewPager2) l8i.findChildViewById(rootView, i);
        if (viewPager2 != null) {
            return new C10276oa((ConstraintLayout) rootView, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C10276oa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C10276oa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_preview, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f66956a;
    }
}
