package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.transcommon.utils.DialogWindowUtils;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public class bc4 extends Dialog {

    /* JADX INFO: renamed from: a */
    public InterfaceC1827a f13293a;

    /* JADX INFO: renamed from: b */
    public TextView f13294b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f13295c;

    /* JADX INFO: renamed from: d */
    public ImageView f13296d;

    /* JADX INFO: renamed from: e */
    public EditText f13297e;

    /* JADX INFO: renamed from: f */
    public TextView f13298f;

    /* JADX INFO: renamed from: m */
    public TextView f13299m;

    /* JADX INFO: renamed from: bc4$a */
    public interface InterfaceC1827a {
        void onLanguageSelect();

        void onSure(String str);
    }

    public bc4(@efb Context context, InterfaceC1827a interfaceC1827a) {
        super(context, C4297R.style.custom_dialog);
        this.f13293a = interfaceC1827a;
    }

    private void initView() {
        if (getWindow() != null) {
            getWindow().setWindowAnimations(C4297R.style.BottomToTopAnim);
        }
        setContentView(C4297R.layout.voice_notes_save_dialog);
        this.f13296d = (ImageView) findViewById(C4297R.id.iv_delete);
        this.f13297e = (EditText) findViewById(C4297R.id.et_title);
        this.f13298f = (TextView) findViewById(C4297R.id.tv_cancel);
        this.f13299m = (TextView) findViewById(C4297R.id.tv_sure);
        this.f13297e.setText(a1h.ShowDateToStr(System.currentTimeMillis()));
        this.f13296d.setOnClickListener(new View.OnClickListener() { // from class: yb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101030a.lambda$initView$0(view);
            }
        });
        this.f13298f.setOnClickListener(new View.OnClickListener() { // from class: zb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104671a.lambda$initView$1(view);
            }
        });
        this.f13299m.setOnClickListener(new View.OnClickListener() { // from class: ac4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1071a.lambda$initView$2(view);
            }
        });
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f13297e.getText().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        yr8.hideSoftKeyboard(getEtTitle());
        InterfaceC1827a interfaceC1827a = this.f13293a;
        if (interfaceC1827a != null) {
            interfaceC1827a.onSure(this.f13297e.getText().toString());
        }
        this.f13297e.getText().clear();
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        yr8.hideSoftKeyboard(getEtTitle());
        super.dismiss();
    }

    public EditText getEtTitle() {
        return this.f13297e;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        DialogWindowUtils.makeBottomDialogImmersive(this, 80);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setLanguage(String str) {
        TextView textView;
        if (TextUtils.isEmpty(str) || (textView = this.f13294b) == null) {
            return;
        }
        textView.setText(str);
    }
}
