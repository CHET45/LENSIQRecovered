package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.watchfun.transcommon.utils.DialogWindowUtils;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public class dc2 extends Dialog {

    /* JADX INFO: renamed from: a */
    public InterfaceC4732a f29265a;

    /* JADX INFO: renamed from: b */
    public String f29266b;

    /* JADX INFO: renamed from: c */
    public String f29267c;

    /* JADX INFO: renamed from: d */
    public String f29268d;

    /* JADX INFO: renamed from: dc2$a */
    public interface InterfaceC4732a {
        void onOk();
    }

    public dc2(Context context, InterfaceC4732a interfaceC4732a) {
        super(context, C4297R.style.custom_dialog);
        this.f29265a = interfaceC4732a;
        initView();
    }

    private void initView() {
        setContentView(C4297R.layout.dialog_ai_voice_note_common);
        TextView textView = (TextView) findViewById(C4297R.id.dialog_clear_text_left_tv);
        if (!TextUtils.isEmpty(this.f29267c)) {
            textView.setText(this.f29267c);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: bc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13292a.lambda$initView$0(view);
            }
        });
        TextView textView2 = (TextView) findViewById(C4297R.id.dialog_clear_text_right_tv);
        if (!TextUtils.isEmpty(this.f29268d)) {
            textView2.setText(this.f29268d);
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: cc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16216a.lambda$initView$1(view);
            }
        });
        TextView textView3 = (TextView) findViewById(C4297R.id.dialog_clear_text_tip_tv);
        if (TextUtils.isEmpty(this.f29266b)) {
            return;
        }
        textView3.setText(this.f29266b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f29265a.onOk();
        dismiss();
    }

    public void hideLeftText() {
        TextView textView = (TextView) findViewById(C4297R.id.dialog_clear_text_left_tv);
        View viewFindViewById = findViewById(C4297R.id.dialog_clear_text_vertical_divide);
        textView.setVisibility(8);
        viewFindViewById.setVisibility(8);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogWindowUtils.makeBottomDialogImmersive(this, 17);
        setCanceledOnTouchOutside(true);
    }

    public void setLeftText(String str) {
        this.f29267c = str;
        TextView textView = (TextView) findViewById(C4297R.id.dialog_clear_text_left_tv);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
    }

    public void setRightText(String str) {
        this.f29268d = str;
        TextView textView = (TextView) findViewById(C4297R.id.dialog_clear_text_right_tv);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
    }

    public void setTitle(String str) {
        this.f29266b = str;
        TextView textView = (TextView) findViewById(C4297R.id.dialog_clear_text_tip_tv);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
    }
}
