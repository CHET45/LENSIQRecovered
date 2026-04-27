package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class xd0 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f97543a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f97544b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f97545c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f97546d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f97547e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f97548f;

    private xd0(@efb LinearLayout rootView, @efb LinearLayout imgRecoder, @efb ImageView ivVoice, @efb LinearLayout layoutTest, @efb TextView tvDialogTip, @efb TextView tvDialogTxt) {
        this.f97543a = rootView;
        this.f97544b = imgRecoder;
        this.f97545c = ivVoice;
        this.f97546d = layoutTest;
        this.f97547e = tvDialogTip;
        this.f97548f = tvDialogTxt;
    }

    @efb
    public static xd0 bind(@efb View rootView) {
        int i = C2531R.id.img_recoder;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2531R.id.iv_voice;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2531R.id.layout_test;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2531R.id.tv_dialog_tip;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2531R.id.tv_dialog_txt;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new xd0((LinearLayout) rootView, linearLayout, imageView, linearLayout2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static xd0 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static xd0 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.audio_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f97543a;
    }
}
