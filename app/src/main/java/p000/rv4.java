package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public class rv4 extends Dialog {

    /* JADX INFO: renamed from: a */
    public Context f79722a;

    /* JADX INFO: renamed from: b */
    public String f79723b;

    /* JADX INFO: renamed from: c */
    public String f79724c;

    /* JADX INFO: renamed from: d */
    public String f79725d;

    /* JADX INFO: renamed from: e */
    public String f79726e;

    /* JADX INFO: renamed from: f */
    public InterfaceC12313c f79727f;

    /* JADX INFO: renamed from: rv4$a */
    public class ViewOnClickListenerC12311a implements View.OnClickListener {
        public ViewOnClickListenerC12311a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (rv4.this.f79727f != null) {
                rv4.this.f79727f.onLeftClick();
            }
            rv4.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: rv4$b */
    public class ViewOnClickListenerC12312b implements View.OnClickListener {
        public ViewOnClickListenerC12312b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (rv4.this.f79727f != null) {
                rv4.this.f79727f.onRightClick();
            }
            rv4.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: rv4$c */
    public interface InterfaceC12313c {
        void onLeftClick();

        void onRightClick();
    }

    public rv4(Context context) {
        super(context, C4035R.style.CustomDialog);
        this.f79722a = context;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C4035R.layout.dlg_easy_dialog);
        TextView textView = (TextView) findViewById(C4035R.id.dialog_title);
        TextView textView2 = (TextView) findViewById(C4035R.id.dialog_message);
        TextView textView3 = (TextView) findViewById(C4035R.id.dialog_left_btn);
        TextView textView4 = (TextView) findViewById(C4035R.id.dialog_right_btn);
        String str = this.f79723b;
        if (str != null) {
            textView.setText(str);
        }
        String str2 = this.f79724c;
        if (str2 != null) {
            textView2.setText(str2);
        }
        String str3 = this.f79725d;
        if (str3 != null) {
            textView3.setText(str3);
        }
        String str4 = this.f79726e;
        if (str4 != null) {
            textView4.setText(str4);
        }
        textView3.setOnClickListener(new ViewOnClickListenerC12311a());
        textView4.setOnClickListener(new ViewOnClickListenerC12312b());
    }

    public rv4 setLeftButtonText(String text) {
        this.f79725d = text;
        return this;
    }

    public rv4 setMessage(String message) {
        this.f79724c = message;
        return this;
    }

    public rv4 setOnDialogClickListener(InterfaceC12313c listener) {
        this.f79727f = listener;
        return this;
    }

    public rv4 setRightButtonText(String text) {
        this.f79726e = text;
        return this;
    }

    public rv4 setTitle(String title) {
        this.f79723b = title;
        return this;
    }
}
