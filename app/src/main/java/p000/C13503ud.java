package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ud */
/* JADX INFO: loaded from: classes4.dex */
public final class C13503ud implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final RelativeLayout f87600C;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f87601a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f87602b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f87603c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f87604d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f87605e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RelativeLayout f87606f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RecyclerView f87607m;

    private C13503ud(@efb RelativeLayout rootView, @efb TextView btnPhoneVoice, @efb LinearLayout emptyView, @efb ImageView frBack, @efb ImageView imgVoiceNote, @efb RelativeLayout ivRecord, @efb RecyclerView recyclerView, @efb RelativeLayout rlTitle) {
        this.f87601a = rootView;
        this.f87602b = btnPhoneVoice;
        this.f87603c = emptyView;
        this.f87604d = frBack;
        this.f87605e = imgVoiceNote;
        this.f87606f = ivRecord;
        this.f87607m = recyclerView;
        this.f87600C = rlTitle;
    }

    @efb
    public static C13503ud bind(@efb View rootView) {
        int i = C2558R.id.btn_phone_voice;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.empty_view;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.fr_back;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.img_voice_note;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2558R.id.iv_record;
                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                        if (relativeLayout != null) {
                            i = C2558R.id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                            if (recyclerView != null) {
                                i = C2558R.id.rl_title;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                if (relativeLayout2 != null) {
                                    return new C13503ud((RelativeLayout) rootView, textView, linearLayout, imageView, imageView2, relativeLayout, recyclerView, relativeLayout2);
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
    public static C13503ud inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C13503ud inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_voice_notes, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f87601a;
    }
}
