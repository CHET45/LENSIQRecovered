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
import android.widget.TextView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.C4201R;

/* JADX INFO: loaded from: classes6.dex */
public class eud extends Dialog {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ boolean f34057e = false;

    /* JADX INFO: renamed from: a */
    public InterfaceC5474b f34058a;

    /* JADX INFO: renamed from: b */
    public EditText f34059b;

    /* JADX INFO: renamed from: c */
    public TextView f34060c;

    /* JADX INFO: renamed from: d */
    public TextView f34061d;

    /* JADX INFO: renamed from: eud$a */
    public class C5473a implements TextWatcher {
        public C5473a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s.length() > 50) {
                eud.this.f34059b.setText(s.subSequence(0, 50));
                eud.this.f34059b.setSelection(50);
            }
        }
    }

    /* JADX INFO: renamed from: eud$b */
    public interface InterfaceC5474b {
        void onCancel();

        void onSure(String name);
    }

    public eud(@efb Context context, InterfaceC5474b listener) {
        super(context, C4201R.style.custom_dialog);
        this.f34058a = listener;
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
        setContentView(C4035R.layout.dialog_record_title);
        this.f34059b = (EditText) findViewById(C4035R.id.et_title);
        this.f34060c = (TextView) findViewById(C4035R.id.tv_cancel);
        this.f34061d = (TextView) findViewById(C4035R.id.tv_sure);
        this.f34059b.addTextChangedListener(new C5473a());
        this.f34060c.setOnClickListener(new View.OnClickListener() { // from class: cud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27653a.lambda$initView$0(view);
            }
        });
        this.f34061d.setOnClickListener(new View.OnClickListener() { // from class: dud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30914a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f34058a.onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        InterfaceC5474b interfaceC5474b = this.f34058a;
        if (interfaceC5474b != null) {
            interfaceC5474b.onSure(this.f34059b.getText().toString());
        }
        this.f34059b.getText().clear();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        adjustWindow();
    }

    public void setRecordName(String language) {
        EditText editText;
        if (TextUtils.isEmpty(language) || (editText = this.f34059b) == null) {
            return;
        }
        editText.setText(language);
    }
}
