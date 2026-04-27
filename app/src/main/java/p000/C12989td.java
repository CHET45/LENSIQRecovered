package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: renamed from: td */
/* JADX INFO: loaded from: classes7.dex */
public final class C12989td implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f84298a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f84299b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f84300c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f84301d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f84302e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RecyclerView f84303f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f84304m;

    private C12989td(@efb RelativeLayout relativeLayout, @efb LinearLayout linearLayout, @efb ImageView imageView, @efb ImageView imageView2, @efb RelativeLayout relativeLayout2, @efb RecyclerView recyclerView, @efb RelativeLayout relativeLayout3) {
        this.f84298a = relativeLayout;
        this.f84299b = linearLayout;
        this.f84300c = imageView;
        this.f84301d = imageView2;
        this.f84302e = relativeLayout2;
        this.f84303f = recyclerView;
        this.f84304m = relativeLayout3;
    }

    @efb
    public static C12989td bind(@efb View view) {
        int i = C4297R.id.empty_view;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C4297R.id.fr_back;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = C4297R.id.img_voice_note;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = C4297R.id.iv_record;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C4297R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                        if (recyclerView != null) {
                            i = C4297R.id.rl_title;
                            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                            if (relativeLayout2 != null) {
                                return new C12989td((RelativeLayout) view, linearLayout, imageView, imageView2, relativeLayout, recyclerView, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C12989td inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C12989td inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_voice_notes, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f84298a;
    }
}
