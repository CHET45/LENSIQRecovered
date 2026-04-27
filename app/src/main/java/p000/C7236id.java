package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.widget.BottomEditView;

/* JADX INFO: renamed from: id */
/* JADX INFO: loaded from: classes6.dex */
public final class C7236id implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f46520a;

    /* JADX INFO: renamed from: b */
    @efb
    public final BottomEditView f46521b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f46522c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RecyclerView f46523d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f46524e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f46525f;

    private C7236id(@efb RelativeLayout rootView, @efb BottomEditView bottomEditView, @efb ImageView frBack, @efb RecyclerView rcRecord, @efb RelativeLayout rlTitle, @efb TextView tvEdit) {
        this.f46520a = rootView;
        this.f46521b = bottomEditView;
        this.f46522c = frBack;
        this.f46523d = rcRecord;
        this.f46524e = rlTitle;
        this.f46525f = tvEdit;
    }

    @efb
    public static C7236id bind(@efb View rootView) {
        int i = C4035R.id.bottomEditView;
        BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
        if (bottomEditView != null) {
            i = C4035R.id.fr_back;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C4035R.id.rc_record;
                RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                if (recyclerView != null) {
                    i = C4035R.id.rl_title;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C4035R.id.tv_edit;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            return new C7236id((RelativeLayout) rootView, bottomEditView, imageView, recyclerView, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C7236id inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C7236id inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_trans_machine_record, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f46520a;
    }
}
