package com.eyevue.common.widget;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes4.dex */
public class MyEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: m */
    public int f17948m;

    /* JADX INFO: renamed from: com.eyevue.common.widget.MyEditText$a */
    public class C2536a implements InputFilter {
        public C2536a() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = start; i < end; i++) {
                char cCharAt = source.charAt(i);
                if (!MyEditText.this.isEmoryCharacter(cCharAt)) {
                    stringBuffer.append(cCharAt);
                }
            }
            if (!(source instanceof Spanned)) {
                return stringBuffer;
            }
            SpannableString spannableString = new SpannableString(stringBuffer);
            TextUtils.copySpansFrom((Spanned) source, start, end, null, spannableString, 0);
            return spannableString;
        }
    }

    public MyEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17948m = -1;
        addListener(attrs);
    }

    private void addListener(AttributeSet attrs) {
        if (attrs != null) {
            this.f17948m = attrs.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", -1);
        }
        C2536a c2536a = new C2536a();
        if (this.f17948m > 0) {
            setFilters(new InputFilter[]{c2536a, new InputFilter.LengthFilter(this.f17948m)});
        } else {
            setFilters(new InputFilter[]{c2536a});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEmoryCharacter(char codePoint) {
        return (codePoint == 0 || codePoint == '\t' || codePoint == '\n' || codePoint == '\r' || (codePoint >= ' ' && codePoint <= 55295) || ((codePoint >= 57344 && codePoint <= 65533) || codePoint >= 0)) ? false : true;
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17948m = -1;
        addListener(attrs);
    }

    public MyEditText(Context context) {
        super(context);
        this.f17948m = -1;
        addListener(null);
    }
}
