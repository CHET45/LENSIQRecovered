package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class ach implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f1101C;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f1102a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f1103b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f1104c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f1105d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f1106e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f1107f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f1108m;

    private ach(@efb LinearLayout rootView, @efb LinearLayout itemContainer, @efb ImageView ivLoading, @efb ImageView ivRecordShare, @efb ImageView ivSelect, @efb TextView tvRecordingDate, @efb TextView tvRecordingName, @efb TextView tvRecordingTime) {
        this.f1102a = rootView;
        this.f1103b = itemContainer;
        this.f1104c = ivLoading;
        this.f1105d = ivRecordShare;
        this.f1106e = ivSelect;
        this.f1107f = tvRecordingDate;
        this.f1108m = tvRecordingName;
        this.f1101C = tvRecordingTime;
    }

    @efb
    public static ach bind(@efb View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = C4035R.id.iv_loading;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C4035R.id.iv_record_share;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C4035R.id.iv_select;
                ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView3 != null) {
                    i = C4035R.id.tvRecordingDate;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C4035R.id.tvRecordingName;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C4035R.id.tvRecordingTime;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                return new ach(linearLayout, linearLayout, imageView, imageView2, imageView3, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ach inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ach inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_machine_record_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f1102a;
    }
}
