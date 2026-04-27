package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.watchfun.voicenotes.C4297R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* JADX INFO: renamed from: wd */
/* JADX INFO: loaded from: classes7.dex */
public final class C14552wd implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final zw8 f93955C;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f93956a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f93957b;

    /* JADX INFO: renamed from: c */
    @efb
    public final FrameLayout f93958c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f93959d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f93960e;

    /* JADX INFO: renamed from: f */
    @efb
    public final SwipeRecyclerView f93961f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f93962m;

    private C14552wd(@efb RelativeLayout relativeLayout, @efb LinearLayout linearLayout, @efb FrameLayout frameLayout, @efb ImageView imageView, @efb RelativeLayout relativeLayout2, @efb SwipeRecyclerView swipeRecyclerView, @efb RelativeLayout relativeLayout3, @efb zw8 zw8Var) {
        this.f93956a = relativeLayout;
        this.f93957b = linearLayout;
        this.f93958c = frameLayout;
        this.f93959d = imageView;
        this.f93960e = relativeLayout2;
        this.f93961f = swipeRecyclerView;
        this.f93962m = relativeLayout3;
        this.f93955C = zw8Var;
    }

    @efb
    public static C14552wd bind(@efb View view) {
        View viewFindViewById;
        int i = C4297R.id.empty_view;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C4297R.id.fr_back;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
            if (frameLayout != null) {
                i = C4297R.id.img_voice_note;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C4297R.id.iv_record;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C4297R.id.recyclerView;
                        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) view.findViewById(i);
                        if (swipeRecyclerView != null) {
                            i = C4297R.id.rl_title;
                            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                            if (relativeLayout2 != null && (viewFindViewById = view.findViewById((i = C4297R.id.view_voice_note_limit_time))) != null) {
                                return new C14552wd((RelativeLayout) view, linearLayout, frameLayout, imageView, relativeLayout, swipeRecyclerView, relativeLayout2, zw8.bind(viewFindViewById));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C14552wd inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C14552wd inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_voice_notes_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f93956a;
    }
}
