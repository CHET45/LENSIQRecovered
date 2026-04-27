package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.eyevue.common.widget.NoScrollViewPager;
import com.eyevue.common.widget.bottomnav.BottomBarItem;
import com.eyevue.common.widget.bottomnav.BottomBarLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: nb */
/* JADX INFO: loaded from: classes4.dex */
public final class C9768nb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f63832C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f63833F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f63834H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f63835L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f63836M;

    /* JADX INFO: renamed from: N */
    @efb
    public final LinearLayout f63837N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f63838Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final BottomBarItem f63839X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final BottomBarItem f63840Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final NoScrollViewPager f63841Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f63842a;

    /* JADX INFO: renamed from: b */
    @efb
    public final BottomBarItem f63843b;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomBarLayout f63844c;

    /* JADX INFO: renamed from: d */
    @efb
    public final BottomBarItem f63845d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f63846e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f63847f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f63848m;

    private C9768nb(@efb RelativeLayout rootView, @efb BottomBarItem aiTab, @efb BottomBarLayout bottomBar, @efb BottomBarItem homeTab, @efb LinearLayout layout, @efb LinearLayout layoutAiEdit, @efb LinearLayout layoutEdit, @efb LinearLayout llAiCancel, @efb LinearLayout llAiDelete, @efb LinearLayout llAiSelectedAll, @efb LinearLayout llDelete, @efb LinearLayout llDownload, @efb LinearLayout llSelectedAll, @efb RelativeLayout mainLayout, @efb BottomBarItem minetab, @efb BottomBarItem photoTab, @efb NoScrollViewPager vpContent) {
        this.f63842a = rootView;
        this.f63843b = aiTab;
        this.f63844c = bottomBar;
        this.f63845d = homeTab;
        this.f63846e = layout;
        this.f63847f = layoutAiEdit;
        this.f63848m = layoutEdit;
        this.f63832C = llAiCancel;
        this.f63833F = llAiDelete;
        this.f63834H = llAiSelectedAll;
        this.f63835L = llDelete;
        this.f63836M = llDownload;
        this.f63837N = llSelectedAll;
        this.f63838Q = mainLayout;
        this.f63839X = minetab;
        this.f63840Y = photoTab;
        this.f63841Z = vpContent;
    }

    @efb
    public static C9768nb bind(@efb View rootView) {
        int i = C2558R.id.ai_tab;
        BottomBarItem bottomBarItem = (BottomBarItem) l8i.findChildViewById(rootView, i);
        if (bottomBarItem != null) {
            i = C2558R.id.bottom_bar;
            BottomBarLayout bottomBarLayout = (BottomBarLayout) l8i.findChildViewById(rootView, i);
            if (bottomBarLayout != null) {
                i = C2558R.id.home_tab;
                BottomBarItem bottomBarItem2 = (BottomBarItem) l8i.findChildViewById(rootView, i);
                if (bottomBarItem2 != null) {
                    i = C2558R.id.layout;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C2558R.id.layout_ai_edit;
                        LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout2 != null) {
                            i = C2558R.id.layout_edit;
                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout3 != null) {
                                i = C2558R.id.ll_ai_cancel;
                                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout4 != null) {
                                    i = C2558R.id.ll_ai_delete;
                                    LinearLayout linearLayout5 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout5 != null) {
                                        i = C2558R.id.ll_ai_selected_all;
                                        LinearLayout linearLayout6 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout6 != null) {
                                            i = C2558R.id.ll_delete;
                                            LinearLayout linearLayout7 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout7 != null) {
                                                i = C2558R.id.ll_download;
                                                LinearLayout linearLayout8 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                if (linearLayout8 != null) {
                                                    i = C2558R.id.ll_selected_all;
                                                    LinearLayout linearLayout9 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                    if (linearLayout9 != null) {
                                                        RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                                        i = C2558R.id.minetab;
                                                        BottomBarItem bottomBarItem3 = (BottomBarItem) l8i.findChildViewById(rootView, i);
                                                        if (bottomBarItem3 != null) {
                                                            i = C2558R.id.photo_tab;
                                                            BottomBarItem bottomBarItem4 = (BottomBarItem) l8i.findChildViewById(rootView, i);
                                                            if (bottomBarItem4 != null) {
                                                                i = C2558R.id.vp_content;
                                                                NoScrollViewPager noScrollViewPager = (NoScrollViewPager) l8i.findChildViewById(rootView, i);
                                                                if (noScrollViewPager != null) {
                                                                    return new C9768nb(relativeLayout, bottomBarItem, bottomBarLayout, bottomBarItem2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, relativeLayout, bottomBarItem3, bottomBarItem4, noScrollViewPager);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C9768nb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C9768nb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f63842a;
    }
}
