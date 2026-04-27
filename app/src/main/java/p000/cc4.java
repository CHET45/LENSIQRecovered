package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class cc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f16217a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f16218b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f16219c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f16220d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f16221e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f16222f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f16223m;

    private cc4(@efb LinearLayout rootView, @efb ImageView ivBar, @efb TextView tvCancel, @efb TextView tvDelete, @efb TextView tvRename, @efb TextView tvShareAudio, @efb TextView tvShareText) {
        this.f16217a = rootView;
        this.f16218b = ivBar;
        this.f16219c = tvCancel;
        this.f16220d = tvDelete;
        this.f16221e = tvRename;
        this.f16222f = tvShareAudio;
        this.f16223m = tvShareText;
    }

    @efb
    public static cc4 bind(@efb View rootView) {
        int i = C4035R.id.iv_bar;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C4035R.id.tv_cancel;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C4035R.id.tv_delete;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = C4035R.id.tv_rename;
                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = C4035R.id.tv_share_audio;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            i = C4035R.id.tv_share_text;
                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView5 != null) {
                                return new cc4((LinearLayout) rootView, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static cc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static cc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.dialog_record_share, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f16217a;
    }
}
