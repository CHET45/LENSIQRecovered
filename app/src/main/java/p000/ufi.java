package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.DialogWindowUtils;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public class ufi extends Dialog {

    /* JADX INFO: renamed from: a */
    public InterfaceC13534b f87929a;

    /* JADX INFO: renamed from: b */
    public TextView f87930b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f87931c;

    /* JADX INFO: renamed from: d */
    public ImageView f87932d;

    /* JADX INFO: renamed from: e */
    public EditText f87933e;

    /* JADX INFO: renamed from: f */
    public TextView f87934f;

    /* JADX INFO: renamed from: m */
    public TextView f87935m;

    /* JADX INFO: renamed from: ufi$a */
    public class C13533a implements TextWatcher {
        public C13533a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 50) {
                ufi.this.f87933e.setText(charSequence.subSequence(0, 50));
                ufi.this.f87933e.setSelection(50);
            }
        }
    }

    /* JADX INFO: renamed from: ufi$b */
    public interface InterfaceC13534b {
        void onLanguageSelect();

        void onSure(String str);
    }

    public ufi(@efb Context context, InterfaceC13534b interfaceC13534b) {
        super(context, C4201R.style.custom_dialog);
        this.f87929a = interfaceC13534b;
    }

    private void initView() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(C4201R.style.BottomToTopAnim);
        window.getDecorView().setPadding(0, 0, 0, 0);
        setContentView(C4297R.layout.voice_notes_start_dialog);
        this.f87930b = (TextView) findViewById(C4297R.id.tv_language);
        this.f87931c = (RelativeLayout) findViewById(C4297R.id.btn_language);
        this.f87932d = (ImageView) findViewById(C4297R.id.iv_delete);
        this.f87933e = (EditText) findViewById(C4297R.id.et_title);
        this.f87934f = (TextView) findViewById(C4297R.id.tv_cancel);
        this.f87935m = (TextView) findViewById(C4297R.id.tv_sure);
        this.f87933e.addTextChangedListener(new C13533a());
        this.f87931c.setOnClickListener(new View.OnClickListener() { // from class: qfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74327a.lambda$initView$0(view);
            }
        });
        this.f87932d.setOnClickListener(new View.OnClickListener() { // from class: rfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78183a.lambda$initView$1(view);
            }
        });
        this.f87934f.setOnClickListener(new View.OnClickListener() { // from class: sfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81695a.lambda$initView$2(view);
            }
        });
        this.f87935m.setOnClickListener(new View.OnClickListener() { // from class: tfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84611a.lambda$initView$3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        InterfaceC13534b interfaceC13534b = this.f87929a;
        if (interfaceC13534b != null) {
            interfaceC13534b.onLanguageSelect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f87933e.getText().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(View view) {
        InterfaceC13534b interfaceC13534b = this.f87929a;
        if (interfaceC13534b != null) {
            interfaceC13534b.onSure(this.f87933e.getText().toString());
        }
        this.f87933e.getText().clear();
    }

    public EditText getEtTitle() {
        return this.f87933e;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        DialogWindowUtils.makeBottomDialogImmersive(this, 80);
    }

    public void setLanguage(String str) {
        TextView textView;
        if (TextUtils.isEmpty(str) || (textView = this.f87930b) == null) {
            return;
        }
        textView.setText(str);
    }
}
