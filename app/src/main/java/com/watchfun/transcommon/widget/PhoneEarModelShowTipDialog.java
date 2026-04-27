package com.watchfun.transcommon.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.DialogWindowUtils;
import p000.efb;
import p000.igg;
import p000.ne4;

/* JADX INFO: loaded from: classes6.dex */
public class PhoneEarModelShowTipDialog extends Dialog {
    private Context mContext;
    private final int mProjectType;
    private final int mType;

    public interface OnDialogClickListener {
        void onCancel(boolean z);
    }

    public PhoneEarModelShowTipDialog(@efb Context context, int i, int i2, OnDialogClickListener onDialogClickListener) {
        super(context, C4201R.style.custom_dialog);
        this.mContext = context;
        this.mProjectType = i;
        this.mType = i2;
        initView(context, onDialogClickListener);
    }

    @igg({"StringFormatInvalid"})
    private void initView(Context context, final OnDialogClickListener onDialogClickListener) {
        setContentView(C4201R.layout.phone_ear_show_tip);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(C4201R.id.img_trans_view);
        TextView textView = (TextView) findViewById(C4201R.id.text_tip);
        int i = this.mType;
        if (i == 1) {
            if (this.mProjectType == 2) {
                ComponentCallbacks2C2485a.with(context).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_glasses_dialog)).diskCacheStrategy(ne4.f64120d).into(imageView);
                textView.setText(C4201R.string.ai_tarns_glasses_empty);
            } else {
                ComponentCallbacks2C2485a.with(context).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_ear_model)).diskCacheStrategy(ne4.f64120d).into(imageView);
                textView.setText(C4201R.string.ai_tarns_empty);
            }
        } else if (i == 2) {
            ComponentCallbacks2C2485a.with(context).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_phone_model)).diskCacheStrategy(ne4.f64120d).into(imageView);
            textView.setText(C4201R.string.ai_tarns_phone_empty);
        } else if (i == 3) {
            ComponentCallbacks2C2485a.with(context).asGif().load(Integer.valueOf(C4201R.drawable.free_talk_image)).diskCacheStrategy(ne4.f64120d).into(imageView);
            textView.setText(C4201R.string.ai_tarns_freely_empty);
        } else {
            ComponentCallbacks2C2485a.with(context).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_two_ear_model)).diskCacheStrategy(ne4.f64120d).into(imageView);
            textView.setText(C4201R.string.ai_tarns_two_ear_empty);
        }
        CheckBox checkBox = (CheckBox) findViewById(C4201R.id.show_checkbox);
        LinearLayout linearLayout = (LinearLayout) findViewById(C4201R.id.img_cancel);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vsc
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f92185a.lambda$initView$0(onDialogClickListener, compoundButton, z);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PhoneEarModelShowTipDialog.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(OnDialogClickListener onDialogClickListener, CompoundButton compoundButton, boolean z) {
        dismiss();
        if (onDialogClickListener != null) {
            onDialogClickListener.onCancel(z);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogWindowUtils.makeBottomDialogImmersive(this, 17);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @efb KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 4) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
