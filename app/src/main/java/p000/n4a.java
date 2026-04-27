package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class n4a implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public int f63251a;

    /* JADX INFO: renamed from: b */
    public EditText f63252b;

    /* JADX INFO: renamed from: c */
    public TextView f63253c;

    /* JADX INFO: renamed from: d */
    public a3c f63254d;

    public n4a(int i, EditText editText, TextView textView, a3c a3cVar) {
        this.f63251a = i;
        this.f63252b = editText;
        this.f63253c = textView;
        this.f63254d = a3cVar;
        if (editText != null) {
            int iChineseLength = i - chineseLength(editText.getText().toString());
            a3c a3cVar2 = this.f63254d;
            if (a3cVar2 == null) {
                this.f63253c.setText(String.valueOf(iChineseLength));
            } else {
                String strOnCounterChange = a3cVar2.onCounterChange(i, iChineseLength);
                this.f63253c.setText(strOnCounterChange == null ? "" : strOnCounterChange);
            }
        }
    }

    private int chineseLength(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            i2 = isChinese(str.substring(i, i3)) ? i2 + 2 : i2 + 1;
            i = i3;
        }
        return i2;
    }

    private boolean isChinese(String str) {
        Boolean bool = Boolean.TRUE;
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 1;
                if (!str.substring(i, i2).matches("[Α-￥]")) {
                    bool = Boolean.FALSE;
                }
                i = i2;
            }
        }
        return bool.booleanValue();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int selectionStart = this.f63252b.getSelectionStart();
        int selectionEnd = this.f63252b.getSelectionEnd();
        this.f63252b.removeTextChangedListener(this);
        if (!TextUtils.isEmpty(editable)) {
            while (chineseLength(editable.toString()) > this.f63251a) {
                editable.delete(selectionStart - 1, selectionEnd);
                selectionStart--;
                selectionEnd--;
            }
        }
        int iChineseLength = this.f63251a - chineseLength(editable.toString());
        a3c a3cVar = this.f63254d;
        if (a3cVar != null) {
            String strOnCounterChange = a3cVar.onCounterChange(this.f63251a, iChineseLength);
            TextView textView = this.f63253c;
            if (strOnCounterChange == null) {
                strOnCounterChange = "";
            }
            textView.setText(strOnCounterChange);
        } else {
            this.f63253c.setText(String.valueOf(iChineseLength));
        }
        this.f63252b.setSelection(selectionStart);
        this.f63252b.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
