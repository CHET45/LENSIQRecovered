package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.transcommon.utils.DialogWindowUtils;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public class rtd extends Dialog {

    /* JADX INFO: renamed from: C */
    public String f79556C;

    /* JADX INFO: renamed from: a */
    public InterfaceC12285a f79557a;

    /* JADX INFO: renamed from: b */
    public TextView f79558b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f79559c;

    /* JADX INFO: renamed from: d */
    public ImageView f79560d;

    /* JADX INFO: renamed from: e */
    public EditText f79561e;

    /* JADX INFO: renamed from: f */
    public TextView f79562f;

    /* JADX INFO: renamed from: m */
    public TextView f79563m;

    /* JADX INFO: renamed from: rtd$a */
    public interface InterfaceC12285a {
        void onCancel();

        void onSure(String str);
    }

    public rtd(@efb Context context, String str, InterfaceC12285a interfaceC12285a) {
        super(context, C4297R.style.custom_dialog);
        this.f79557a = interfaceC12285a;
        this.f79556C = str;
    }

    private void initView() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(C4297R.style.BottomToTopAnim);
        window.getDecorView().setPadding(0, 0, 0, 0);
        setContentView(C4297R.layout.voice_notes_reame_dialog);
        this.f79560d = (ImageView) findViewById(C4297R.id.iv_delete);
        this.f79561e = (EditText) findViewById(C4297R.id.et_title);
        this.f79562f = (TextView) findViewById(C4297R.id.tv_cancel);
        this.f79563m = (TextView) findViewById(C4297R.id.tv_sure);
        this.f79561e.setText(a1h.ShowDateToStr(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.f79556C)) {
            this.f79561e.setText(this.f79556C);
        }
        this.f79560d.setOnClickListener(new View.OnClickListener() { // from class: otd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68734a.lambda$initView$0(view);
            }
        });
        this.f79562f.setOnClickListener(new View.OnClickListener() { // from class: ptd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72001a.lambda$initView$1(view);
            }
        });
        this.f79563m.setOnClickListener(new View.OnClickListener() { // from class: qtd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75741a.lambda$initView$2(view);
            }
        });
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f79561e.getText().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        yr8.hideSoftKeyboard(getEtTitle());
        InterfaceC12285a interfaceC12285a = this.f79557a;
        if (interfaceC12285a != null) {
            interfaceC12285a.onSure(this.f79561e.getText().toString());
        }
        this.f79561e.getText().clear();
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        yr8.hideSoftKeyboard(getEtTitle());
        super.dismiss();
    }

    public EditText getEtTitle() {
        return this.f79561e;
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
        if (TextUtils.isEmpty(str) || (textView = this.f79558b) == null) {
            return;
        }
        textView.setText(str);
    }
}
