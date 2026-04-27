package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.C4201R;

/* JADX INFO: loaded from: classes6.dex */
public class ztd extends Dialog {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ boolean f106077m = false;

    /* JADX INFO: renamed from: a */
    public InterfaceC16252a f106078a;

    /* JADX INFO: renamed from: b */
    public TextView f106079b;

    /* JADX INFO: renamed from: c */
    public TextView f106080c;

    /* JADX INFO: renamed from: d */
    public TextView f106081d;

    /* JADX INFO: renamed from: e */
    public TextView f106082e;

    /* JADX INFO: renamed from: f */
    public TextView f106083f;

    /* JADX INFO: renamed from: ztd$a */
    public interface InterfaceC16252a {
        void cancel();

        void delete();

        void rename();

        void shareAudio();

        void shareText();
    }

    public ztd(@efb Context context, InterfaceC16252a listener) {
        super(context, C4201R.style.custom_dialog);
        this.f106078a = listener;
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(C4201R.style.BottomToTopAnim);
        window.getDecorView().setPadding(0, 0, 0, 0);
        setCanceledOnTouchOutside(false);
        setContentView(C4035R.layout.dialog_record_share);
        this.f106079b = (TextView) findViewById(C4035R.id.tv_share_text);
        this.f106080c = (TextView) findViewById(C4035R.id.tv_share_audio);
        this.f106081d = (TextView) findViewById(C4035R.id.tv_rename);
        this.f106083f = (TextView) findViewById(C4035R.id.tv_cancel);
        this.f106082e = (TextView) findViewById(C4035R.id.tv_delete);
        this.f106079b.setOnClickListener(new View.OnClickListener() { // from class: utd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89091a.lambda$initView$0(view);
            }
        });
        this.f106080c.setOnClickListener(new View.OnClickListener() { // from class: vtd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92239a.lambda$initView$1(view);
            }
        });
        this.f106083f.setOnClickListener(new View.OnClickListener() { // from class: wtd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95497a.lambda$initView$2(view);
            }
        });
        this.f106082e.setOnClickListener(new View.OnClickListener() { // from class: xtd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99239a.lambda$initView$3(view);
            }
        });
        this.f106081d.setOnClickListener(new View.OnClickListener() { // from class: ytd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102958a.lambda$initView$4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f106078a.shareText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f106078a.shareAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(View view) {
        this.f106078a.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$4(View view) {
        this.f106078a.rename();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        adjustWindow();
    }
}
