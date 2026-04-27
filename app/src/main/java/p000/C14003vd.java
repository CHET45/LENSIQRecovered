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

/* JADX INFO: renamed from: vd */
/* JADX INFO: loaded from: classes7.dex */
public final class C14003vd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f90700a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f90701b;

    /* JADX INFO: renamed from: c */
    @efb
    public final FrameLayout f90702c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f90703d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f90704e;

    /* JADX INFO: renamed from: f */
    @efb
    public final SwipeRecyclerView f90705f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f90706m;

    private C14003vd(@efb RelativeLayout relativeLayout, @efb LinearLayout linearLayout, @efb FrameLayout frameLayout, @efb ImageView imageView, @efb RelativeLayout relativeLayout2, @efb SwipeRecyclerView swipeRecyclerView, @efb RelativeLayout relativeLayout3) {
        this.f90700a = relativeLayout;
        this.f90701b = linearLayout;
        this.f90702c = frameLayout;
        this.f90703d = imageView;
        this.f90704e = relativeLayout2;
        this.f90705f = swipeRecyclerView;
        this.f90706m = relativeLayout3;
    }

    @efb
    public static C14003vd bind(@efb View view) {
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
                            if (relativeLayout2 != null) {
                                return new C14003vd((RelativeLayout) view, linearLayout, frameLayout, imageView, relativeLayout, swipeRecyclerView, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C14003vd inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C14003vd inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_voice_notes_v1, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f90700a;
    }
}
