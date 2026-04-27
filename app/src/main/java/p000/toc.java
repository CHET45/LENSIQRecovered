package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.utils.DialogWindowUtils;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public class toc extends Dialog {

    /* JADX INFO: renamed from: a */
    public PermissionExplanationDialog.OnClickListListener f85515a;

    /* JADX INFO: renamed from: b */
    public TextView f85516b;

    /* JADX INFO: renamed from: toc$a */
    public interface InterfaceC13129a {
        void onOk();

        void onRefuse();
    }

    public toc(Context context, PermissionExplanationDialog.OnClickListListener onClickListListener) {
        super(context, C4297R.style.custom_dialog);
        setContentView(C4297R.layout.dialog_permission_explanation2);
        this.f85515a = onClickListListener;
        initView();
    }

    private void initView() {
        ((TextView) findViewById(C4297R.id.dialog_refuse_text_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: roc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78868a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C4297R.id.dialog_allow_text_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: soc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82462a.lambda$initView$1(view);
            }
        });
        this.f85516b = (TextView) findViewById(C4297R.id.dialog_clear_text_tip_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f85515a.onRefuse();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f85515a.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogWindowUtils.makeBottomDialogImmersive(this, 17);
        setCanceledOnTouchOutside(true);
    }

    public void setTipContent(String str) {
        TextView textView = this.f85516b;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
