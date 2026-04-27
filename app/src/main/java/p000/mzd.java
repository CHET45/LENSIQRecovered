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
import android.widget.TextView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.C4201R;

/* JADX INFO: loaded from: classes6.dex */
public class mzd extends Dialog {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ boolean f62862m = false;

    /* JADX INFO: renamed from: a */
    public InterfaceC9617b f62863a;

    /* JADX INFO: renamed from: b */
    public ImageView f62864b;

    /* JADX INFO: renamed from: c */
    public EditText f62865c;

    /* JADX INFO: renamed from: d */
    public TextView f62866d;

    /* JADX INFO: renamed from: e */
    public TextView f62867e;

    /* JADX INFO: renamed from: f */
    public jbh f62868f;

    /* JADX INFO: renamed from: mzd$a */
    public class C9616a implements TextWatcher {
        public C9616a() {
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
                mzd.this.f62865c.setText(s.subSequence(0, 50));
                mzd.this.f62865c.setSelection(50);
            }
        }
    }

    /* JADX INFO: renamed from: mzd$b */
    public interface InterfaceC9617b {
        void onCancel();

        void onSure(String name);
    }

    public mzd(@efb Context context, jbh record, InterfaceC9617b listener) {
        super(context, C4201R.style.custom_dialog);
        this.f62863a = listener;
        this.f62868f = record;
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
        setContentView(C4035R.layout.dialog_record_rename);
        this.f62864b = (ImageView) findViewById(C4035R.id.iv_delete);
        this.f62865c = (EditText) findViewById(C4035R.id.et_title);
        this.f62866d = (TextView) findViewById(C4035R.id.tv_cancel);
        this.f62867e = (TextView) findViewById(C4035R.id.tv_sure);
        this.f62865c.setText(this.f62868f.getName());
        this.f62865c.addTextChangedListener(new C9616a());
        this.f62864b.setOnClickListener(new View.OnClickListener() { // from class: jzd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52283a.lambda$initView$0(view);
            }
        });
        this.f62866d.setOnClickListener(new View.OnClickListener() { // from class: kzd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f55722a.lambda$initView$1(view);
            }
        });
        this.f62867e.setOnClickListener(new View.OnClickListener() { // from class: lzd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f59463a.lambda$initView$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f62865c.getText().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f62863a.onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        InterfaceC9617b interfaceC9617b = this.f62863a;
        if (interfaceC9617b != null) {
            interfaceC9617b.onSure(this.f62865c.getText().toString());
        }
        this.f62865c.getText().clear();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        adjustWindow();
    }

    public void setRecordName(String language) {
        EditText editText;
        if (TextUtils.isEmpty(language) || (editText = this.f62865c) == null) {
            return;
        }
        editText.setText(language);
    }
}
