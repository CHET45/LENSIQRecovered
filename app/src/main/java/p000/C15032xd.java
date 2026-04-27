package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.eyevue.glassapp.C2558R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* JADX INFO: renamed from: xd */
/* JADX INFO: loaded from: classes4.dex */
public final class C15032xd implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ax8 f97535C;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f97536a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f97537b;

    /* JADX INFO: renamed from: c */
    @efb
    public final FrameLayout f97538c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f97539d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f97540e;

    /* JADX INFO: renamed from: f */
    @efb
    public final SwipeRecyclerView f97541f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f97542m;

    private C15032xd(@efb RelativeLayout rootView, @efb LinearLayout emptyView, @efb FrameLayout frBack, @efb ImageView imgVoiceNote, @efb RelativeLayout ivRecord, @efb SwipeRecyclerView recyclerView, @efb RelativeLayout rlTitle, @efb ax8 viewVoiceNoteLimitTime) {
        this.f97536a = rootView;
        this.f97537b = emptyView;
        this.f97538c = frBack;
        this.f97539d = imgVoiceNote;
        this.f97540e = ivRecord;
        this.f97541f = recyclerView;
        this.f97542m = rlTitle;
        this.f97535C = viewVoiceNoteLimitTime;
    }

    @efb
    public static C15032xd bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.empty_view;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.fr_back;
            FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
            if (frameLayout != null) {
                i = C2558R.id.img_voice_note;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.iv_record;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C2558R.id.recyclerView;
                        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) l8i.findChildViewById(rootView, i);
                        if (swipeRecyclerView != null) {
                            i = C2558R.id.rl_title;
                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout2 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_voice_note_limit_time))) != null) {
                                return new C15032xd((RelativeLayout) rootView, linearLayout, frameLayout, imageView, relativeLayout, swipeRecyclerView, relativeLayout2, ax8.bind(viewFindChildViewById));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C15032xd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C15032xd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_voice_notes_v2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f97536a;
    }
}
