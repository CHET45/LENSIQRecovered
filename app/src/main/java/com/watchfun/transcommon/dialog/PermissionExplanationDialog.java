package com.watchfun.transcommon.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.DialogWindowUtils;

/* JADX INFO: loaded from: classes5.dex */
public class PermissionExplanationDialog extends Dialog {
    private final Context mContext;
    private OnClickListListener mListListener;
    private TextView tvTip;

    public interface OnClickListListener {
        void onOk();

        void onRefuse();
    }

    public PermissionExplanationDialog(Context context, OnClickListListener onClickListListener) {
        super(context, C4201R.style.custom_dialog);
        setContentView(C4201R.layout.dialog_permission_explanation);
        this.mContext = context;
        this.mListListener = onClickListListener;
        initView();
    }

    private void initView() {
        ((TextView) findViewById(C4201R.id.dialog_refuse_text_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: uoc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88681a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C4201R.id.dialog_allow_text_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: voc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91868a.lambda$initView$1(view);
            }
        });
        this.tvTip = (TextView) findViewById(C4201R.id.dialog_clear_text_tip_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.mListListener.onRefuse();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.mListListener.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogWindowUtils.makeBottomDialogImmersive(this, 17);
        setCanceledOnTouchOutside(true);
    }

    public void setTipContent(String str) {
        TextView textView = this.tvTip;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
