package com.watchfun.transcommon.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.watchfun.transcommon.C4201R;
import p000.axg;
import p000.hib;
import p000.hy2;
import p000.u20;
import p000.vfe;

/* JADX INFO: loaded from: classes6.dex */
public class BottomEditView extends LinearLayout {
    private boolean isAllSelect;
    private LinearLayout llCancel;
    private LinearLayout llDelete;
    private LinearLayout llMain;
    private LinearLayout llSelect;
    private OnEditClickListener onEditClickListener;
    private View view;

    public interface OnEditClickListener {
        void onCancel();

        void onDelete(boolean z);

        void onSelect(boolean z);
    }

    public BottomEditView(Context context, @hib AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isAllSelect = false;
        init(context);
    }

    private void init(Context context) {
        View viewInflate = View.inflate(context, C4201R.layout.view_edit, this);
        this.view = viewInflate;
        this.llMain = (LinearLayout) viewInflate.findViewById(C4201R.id.ll_edit);
        this.llCancel = (LinearLayout) this.view.findViewById(C4201R.id.ll_cancel);
        this.llDelete = (LinearLayout) this.view.findViewById(C4201R.id.ll_delete);
        this.llSelect = (LinearLayout) this.view.findViewById(C4201R.id.ll_select);
        this.llCancel.setOnClickListener(new View.OnClickListener() { // from class: ac1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1067a.lambda$init$0(view);
            }
        });
        this.llDelete.setOnClickListener(new View.OnClickListener() { // from class: bc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13291a.lambda$init$1(view);
            }
        });
        this.llSelect.setOnClickListener(new View.OnClickListener() { // from class: cc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16215a.lambda$init$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(View view) {
        OnEditClickListener onEditClickListener = this.onEditClickListener;
        if (onEditClickListener != null) {
            onEditClickListener.onCancel();
        }
        this.llMain.setVisibility(8);
        this.isAllSelect = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(View view) {
        OnEditClickListener onEditClickListener = this.onEditClickListener;
        if (onEditClickListener != null) {
            onEditClickListener.onDelete(this.isAllSelect);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(View view) {
        boolean z = !this.isAllSelect;
        this.isAllSelect = z;
        OnEditClickListener onEditClickListener = this.onEditClickListener;
        if (onEditClickListener != null) {
            onEditClickListener.onSelect(z);
        }
    }

    public void setEditMode(boolean z) {
        Drawable drawable = u20.getDrawable(new hy2(getContext(), vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a)), C4201R.drawable.btn_ai_trans_edit);
        this.llCancel.setBackground(drawable.mutate());
        this.llCancel.postInvalidate();
        this.llDelete.setBackground(drawable.mutate());
        this.llDelete.postInvalidate();
        this.llSelect.setBackground(drawable.mutate());
        this.llSelect.postInvalidate();
        if (z) {
            this.llMain.setVisibility(0);
        } else {
            this.llMain.setVisibility(8);
            this.isAllSelect = false;
        }
    }

    public void setOnEditClickListener(OnEditClickListener onEditClickListener) {
        this.onEditClickListener = onEditClickListener;
    }

    public void setViewSelected(boolean z) {
        this.isAllSelect = z;
    }

    public BottomEditView(Context context, @hib AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isAllSelect = false;
        init(context);
    }

    public BottomEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.isAllSelect = false;
        init(context);
    }
}
