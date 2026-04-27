package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class l4a implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public int f56138a;

    /* JADX INFO: renamed from: b */
    public EditText f56139b;

    /* JADX INFO: renamed from: c */
    public TextView f56140c;

    /* JADX INFO: renamed from: d */
    public a3c f56141d;

    public l4a(int i, EditText editText, TextView textView, a3c a3cVar) {
        this.f56138a = i;
        this.f56139b = editText;
        this.f56140c = textView;
        this.f56141d = a3cVar;
        if (editText != null) {
            int length = i - editText.getText().toString().length();
            a3c a3cVar2 = this.f56141d;
            if (a3cVar2 == null) {
                this.f56140c.setText(String.valueOf(length));
            } else {
                String strOnCounterChange = a3cVar2.onCounterChange(i, length);
                this.f56140c.setText(strOnCounterChange == null ? "" : strOnCounterChange);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int selectionStart = this.f56139b.getSelectionStart();
        int selectionEnd = this.f56139b.getSelectionEnd();
        this.f56139b.removeTextChangedListener(this);
        if (!TextUtils.isEmpty(editable)) {
            while (editable.toString().length() > this.f56138a) {
                editable.delete(selectionStart - 1, selectionEnd);
                selectionStart--;
                selectionEnd--;
            }
        }
        int length = this.f56138a - editable.toString().length();
        a3c a3cVar = this.f56141d;
        if (a3cVar != null) {
            String strOnCounterChange = a3cVar.onCounterChange(this.f56138a, length);
            TextView textView = this.f56140c;
            if (strOnCounterChange == null) {
                strOnCounterChange = "";
            }
            textView.setText(strOnCounterChange);
        } else {
            this.f56140c.setText(String.valueOf(length));
        }
        this.f56139b.setSelection(selectionStart);
        this.f56139b.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
