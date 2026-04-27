package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;

/* JADX INFO: renamed from: k9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C8239k9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f52817C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f52818F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f52819H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f52820L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f52821M;

    /* JADX INFO: renamed from: N */
    @efb
    public final View f52822N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final View f52823Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f52824a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f52825b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f52826c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f52827d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f52828e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f52829f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f52830m;

    private C8239k9(@efb RelativeLayout rootView, @efb RecyclerView aiRc, @efb EditText btnEt, @efb TextView btnRecordSend, @efb LinearLayout buttomView, @efb LinearLayout contentRoot, @efb ImageView icRecordSend, @efb TextView icSend, @efb ImageView ivBackBtn, @efb RelativeLayout titleLayout, @efb TextView tvEmpty, @efb TextView tvTitle, @efb View viewLine, @efb View viewLines) {
        this.f52824a = rootView;
        this.f52825b = aiRc;
        this.f52826c = btnEt;
        this.f52827d = btnRecordSend;
        this.f52828e = buttomView;
        this.f52829f = contentRoot;
        this.f52830m = icRecordSend;
        this.f52817C = icSend;
        this.f52818F = ivBackBtn;
        this.f52819H = titleLayout;
        this.f52820L = tvEmpty;
        this.f52821M = tvTitle;
        this.f52822N = viewLine;
        this.f52823Q = viewLines;
    }

    @efb
    public static C8239k9 bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C4035R.id.ai_rc;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C4035R.id.btn_et;
            EditText editText = (EditText) l8i.findChildViewById(rootView, i);
            if (editText != null) {
                i = C4035R.id.btn_record_send;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C4035R.id.buttom_view;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C4035R.id.content_root;
                        LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout2 != null) {
                            i = C4035R.id.ic_record_send;
                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView != null) {
                                i = C4035R.id.ic_send;
                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = C4035R.id.iv_back_btn;
                                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView2 != null) {
                                        i = C4035R.id.title_layout;
                                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                        if (relativeLayout != null) {
                                            i = C4035R.id.tv_empty;
                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView3 != null) {
                                                i = C4035R.id.tv_title;
                                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView4 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C4035R.id.view_line))) != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C4035R.id.view_lines))) != null) {
                                                    return new C8239k9((RelativeLayout) rootView, recyclerView, editText, textView, linearLayout, linearLayout2, imageView, textView2, imageView2, relativeLayout, textView3, textView4, viewFindChildViewById, viewFindChildViewById2);
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
    public static C8239k9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C8239k9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_chat_ai, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f52824a;
    }
}
