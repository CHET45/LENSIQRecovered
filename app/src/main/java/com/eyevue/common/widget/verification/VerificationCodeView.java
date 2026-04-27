package com.eyevue.common.widget.verification;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.eyevue.common.C2531R;
import java.lang.reflect.Field;
import p000.igg;
import p000.omg;

/* JADX INFO: loaded from: classes4.dex */
public class VerificationCodeView extends LinearLayout implements TextWatcher, View.OnKeyListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: C */
    public int f18145C;

    /* JADX INFO: renamed from: F */
    public int f18146F;

    /* JADX INFO: renamed from: H */
    public int f18147H;

    /* JADX INFO: renamed from: L */
    public boolean f18148L;

    /* JADX INFO: renamed from: M */
    public boolean f18149M;

    /* JADX INFO: renamed from: M1 */
    public int f18150M1;

    /* JADX INFO: renamed from: N */
    public int f18151N;

    /* JADX INFO: renamed from: Q */
    public int f18152Q;

    /* JADX INFO: renamed from: V1 */
    public ClipboardManager f18153V1;

    /* JADX INFO: renamed from: a */
    public Context f18154a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2550c f18155b;

    /* JADX INFO: renamed from: c */
    public int f18156c;

    /* JADX INFO: renamed from: d */
    public EnumC2551d f18157d;

    /* JADX INFO: renamed from: e */
    public int f18158e;

    /* JADX INFO: renamed from: f */
    public int f18159f;

    /* JADX INFO: renamed from: m */
    public float f18160m;

    /* JADX INFO: renamed from: com.eyevue.common.widget.verification.VerificationCodeView$a */
    public class C2548a extends AppCompatEditText {
        public C2548a(Context context) {
            super(context);
        }

        @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
        public boolean onTextContextMenuItem(int id) {
            if (id != 16908322) {
                return super.onTextContextMenuItem(id);
            }
            VerificationCodeView.this.handlePasteEvent();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.verification.VerificationCodeView$b */
    public static class C2549b extends PasswordTransformationMethod {

        /* JADX INFO: renamed from: com.eyevue.common.widget.verification.VerificationCodeView$b$a */
        public static class a implements CharSequence {

            /* JADX INFO: renamed from: a */
            public final CharSequence f18162a;

            public a(CharSequence source) {
                this.f18162a = source;
            }

            @Override // java.lang.CharSequence
            public char charAt(int index) {
                return '*';
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f18162a.length();
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int start, int end) {
                return this.f18162a.subSequence(start, end);
            }
        }

        @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence source, View view) {
            return new a(source);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.verification.VerificationCodeView$c */
    public interface InterfaceC2550c {
        void onComplete(View view, String content);

        void onTextChange(View view, String content);
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.verification.VerificationCodeView$d */
    public enum EnumC2551d {
        NUMBER,
        NUMBERPASSWORD,
        TEXT,
        TEXTPASSWORD
    }

    public VerificationCodeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f18154a = context;
        this.f18153V1 = (ClipboardManager) context.getSystemService("clipboard");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C2531R.styleable.VerificationCodeView);
        this.f18156c = typedArrayObtainStyledAttributes.getInteger(C2531R.styleable.VerificationCodeView_vcv_et_number, 6);
        this.f18157d = EnumC2551d.values()[typedArrayObtainStyledAttributes.getInt(C2531R.styleable.VerificationCodeView_vcv_et_inputType, EnumC2551d.NUMBER.ordinal())];
        this.f18158e = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.VerificationCodeView_vcv_et_width, dpToPx(this.f18154a, 52.0f));
        this.f18159f = typedArrayObtainStyledAttributes.getColor(C2531R.styleable.VerificationCodeView_vcv_et_text_color, -16777216);
        this.f18160m = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.VerificationCodeView_vcv_et_text_size, 16);
        this.f18145C = typedArrayObtainStyledAttributes.getResourceId(C2531R.styleable.VerificationCodeView_vcv_et_bg, C2531R.drawable.bg_edit_auth);
        this.f18151N = typedArrayObtainStyledAttributes.getResourceId(C2531R.styleable.VerificationCodeView_vcv_et_cursor, C2531R.drawable.et_cursor);
        this.f18149M = typedArrayObtainStyledAttributes.getBoolean(C2531R.styleable.VerificationCodeView_vcv_et_cursor_visible, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.VerificationCodeView_vcv_et_spacing);
        this.f18148L = zHasValue;
        if (zHasValue) {
            this.f18146F = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.VerificationCodeView_vcv_et_spacing, 0);
        }
        initView();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void backFocus() {
        for (int i = this.f18156c - 1; i >= 0; i--) {
            EditText editText = (EditText) getChildAt(i);
            if (editText.getText().length() >= 1) {
                editText.setText("");
                if (this.f18149M) {
                    editText.setCursorVisible(true);
                } else {
                    editText.setCursorVisible(false);
                }
                editText.requestFocus();
                return;
            }
        }
    }

    private static int dpToPx(Context context, float dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }

    private void focus() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            EditText editText = (EditText) getChildAt(i);
            if (editText.getText().length() < 1) {
                if (this.f18149M) {
                    editText.setCursorVisible(true);
                } else {
                    editText.setCursorVisible(false);
                }
                editText.requestFocus();
                return;
            }
            editText.setCursorVisible(false);
            if (i == childCount - 1) {
                editText.requestFocus();
            }
        }
    }

    private String getResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f18156c; i++) {
            sb.append((CharSequence) ((EditText) getChildAt(i)).getText());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePasteEvent() {
        CharSequence text;
        ClipboardManager clipboardManager = this.f18153V1;
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
            return;
        }
        ClipData primaryClip = this.f18153V1.getPrimaryClip();
        if (primaryClip.getItemCount() == 0 || (text = primaryClip.getItemAt(0).getText()) == null || text.length() != this.f18156c) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f18154a.getSystemService("input_method");
        if (inputMethodManager != null && getFocusedChild() != null) {
            inputMethodManager.hideSoftInputFromWindow(getFocusedChild().getWindowToken(), 0);
        }
        for (int i = 0; i < this.f18156c; i++) {
            EditText editText = (EditText) getChildAt(i);
            editText.removeTextChangedListener(this);
            editText.setText(String.valueOf(text.charAt(i)));
            editText.addTextChangedListener(this);
            editText.setCursorVisible(false);
        }
        if (this.f18155b != null) {
            String string = text.toString();
            this.f18155b.onTextChange(this, string);
            this.f18155b.onComplete(this, string);
        }
        int i2 = this.f18156c;
        if (i2 > 0) {
            ((EditText) getChildAt(i2 - 1)).requestFocus();
        }
    }

    @omg(17)
    private void initEditText(EditText editText, int i) {
        editText.setLayoutParams(getETLayoutParams(i));
        editText.setTextAlignment(4);
        editText.setGravity(17);
        editText.setId(i);
        editText.setCursorVisible(false);
        editText.setMaxEms(1);
        editText.setTextColor(this.f18159f);
        editText.setTextSize(this.f18160m);
        editText.setCursorVisible(this.f18149M);
        editText.setMaxLines(1);
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
        int iOrdinal = this.f18157d.ordinal();
        if (iOrdinal == 0) {
            editText.setInputType(2);
        } else if (iOrdinal == 1) {
            editText.setInputType(18);
            editText.setTransformationMethod(new C2549b());
        } else if (iOrdinal == 2) {
            editText.setInputType(1);
        } else if (iOrdinal != 3) {
            editText.setInputType(2);
        } else {
            editText.setInputType(2);
        }
        editText.setPadding(0, 0, 0, 0);
        editText.setOnKeyListener(this);
        editText.setBackgroundResource(this.f18145C);
        setEditTextCursorDrawable(editText);
        editText.addTextChangedListener(this);
        editText.setOnKeyListener(this);
        editText.setOnFocusChangeListener(this);
    }

    @igg({"ResourceAsColor"})
    private void initView() {
        for (int i = 0; i < this.f18156c; i++) {
            C2548a c2548a = new C2548a(this.f18154a);
            initEditText(c2548a, i);
            addView(c2548a);
            if (i == 0) {
                c2548a.setFocusable(true);
            }
        }
    }

    private void updateETMargin() {
        for (int i = 0; i < this.f18156c; i++) {
            ((EditText) getChildAt(i)).setLayoutParams(getETLayoutParams(i));
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        if (s.length() != 0) {
            focus();
        }
        InterfaceC2550c interfaceC2550c = this.f18155b;
        if (interfaceC2550c != null) {
            interfaceC2550c.onTextChange(this, getResult());
            if (((EditText) getChildAt(this.f18156c - 1)).getText().length() > 0) {
                this.f18155b.onComplete(this, getResult());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    public LinearLayout.LayoutParams getETLayoutParams(int i) {
        int i2 = this.f18158e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        if (this.f18148L) {
            int i3 = this.f18146F;
            layoutParams.leftMargin = i3 / 2;
            layoutParams.rightMargin = i3 / 2;
        } else {
            int i4 = this.f18152Q;
            int i5 = this.f18156c;
            int i6 = (i4 - (this.f18158e * i5)) / (i5 + 1);
            this.f18147H = i6;
            if (i == 0) {
                layoutParams.leftMargin = i6;
                layoutParams.rightMargin = i6 / 2;
            } else if (i == i5 - 1) {
                layoutParams.leftMargin = i6 / 2;
                layoutParams.rightMargin = i6;
            } else {
                layoutParams.leftMargin = i6 / 2;
                layoutParams.rightMargin = i6 / 2;
            }
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public InterfaceC2550c getOnCodeFinishListener() {
        return this.f18155b;
    }

    public int getmCursorDrawable() {
        return this.f18151N;
    }

    public EnumC2551d getmEtInputType() {
        return this.f18157d;
    }

    public int getmEtNumber() {
        return this.f18156c;
    }

    public int getmEtTextBg() {
        return this.f18145C;
    }

    public int getmEtTextColor() {
        return this.f18159f;
    }

    public float getmEtTextSize() {
        return this.f18160m;
    }

    public int getmEtWidth() {
        return this.f18158e;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean b) {
        if (b) {
            focus();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (keyCode != 67 || event.getAction() != 0) {
            return false;
        }
        backFocus();
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.f18152Q = getMeasuredWidth();
        updateETMargin();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    public void setEditTextCursorDrawable(EditText editText) {
        if (this.f18149M) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(editText, Integer.valueOf(this.f18151N));
            } catch (Exception unused) {
            }
        }
    }

    public void setEmpty() {
        for (int i = this.f18156c - 1; i >= 0; i--) {
            EditText editText = (EditText) getChildAt(i);
            editText.setText("");
            if (i == 0) {
                if (this.f18149M) {
                    editText.setCursorVisible(true);
                } else {
                    editText.setCursorVisible(false);
                }
                editText.requestFocus();
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(enabled);
        }
    }

    public void setOnCodeFinishListener(InterfaceC2550c onCodeFinishListener) {
        this.f18155b = onCodeFinishListener;
    }

    public void setmCursorDrawable(int mCursorDrawable) {
        this.f18151N = mCursorDrawable;
    }

    public void setmEtInputType(EnumC2551d mEtInputType) {
        this.f18157d = mEtInputType;
    }

    public void setmEtNumber(int mEtNumber) {
        this.f18156c = mEtNumber;
    }

    public void setmEtTextBg(int mEtTextBg) {
        this.f18145C = mEtTextBg;
    }

    public void setmEtTextColor(int mEtTextColor) {
        this.f18159f = mEtTextColor;
    }

    public void setmEtTextSize(float mEtTextSize) {
        this.f18160m = mEtTextSize;
    }

    public void setmEtWidth(int mEtWidth) {
        this.f18158e = mEtWidth;
    }
}
