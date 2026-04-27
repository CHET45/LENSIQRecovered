package com.eyevue.common.widget;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class TypingTextView extends TextView {

    /* JADX INFO: renamed from: a */
    public Handler f18032a;

    /* JADX INFO: renamed from: b */
    public boolean f18033b;

    /* JADX INFO: renamed from: c */
    public Runnable f18034c;

    /* JADX INFO: renamed from: d */
    public String f18035d;

    /* JADX INFO: renamed from: e */
    public int f18036e;

    /* JADX INFO: renamed from: f */
    public long f18037f;

    /* JADX INFO: renamed from: m */
    public InterfaceC2542b f18038m;

    /* JADX INFO: renamed from: com.eyevue.common.widget.TypingTextView$a */
    public class RunnableC2541a implements Runnable {
        public RunnableC2541a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(TypingTextView.this.f18035d)) {
                return;
            }
            if (TypingTextView.this.f18036e >= TypingTextView.this.f18035d.length()) {
                TypingTextView.this.f18033b = false;
                TypingTextView.this.f18032a.removeCallbacks(this);
                return;
            }
            String strSubstring = TypingTextView.this.f18035d.substring(0, TypingTextView.this.f18036e + 1);
            int length = TypingTextView.this.getText().length();
            TypingTextView.this.setText(strSubstring);
            int length2 = TypingTextView.this.getText().length();
            if (TypingTextView.this.f18038m != null) {
                TypingTextView.this.f18038m.onTextChanged(length, length2);
            }
            TypingTextView.m4394c(TypingTextView.this);
            TypingTextView.this.f18032a.postDelayed(this, TypingTextView.this.f18037f);
            TypingTextView.this.f18033b = true;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.TypingTextView$b */
    public interface InterfaceC2542b {
        void onTextChanged(int oldLength, int newLength);
    }

    public TypingTextView(Context context) {
        super(context);
        this.f18032a = new Handler();
        this.f18036e = 0;
        this.f18037f = 50L;
        init();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m4394c(TypingTextView typingTextView) {
        int i = typingTextView.f18036e;
        typingTextView.f18036e = i + 1;
        return i;
    }

    private void init() {
        this.f18034c = new RunnableC2541a();
    }

    public boolean isAnim() {
        return this.f18033b;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        setLineSpacing(9.0f, 1.2f);
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float add, float mult) {
        super.setLineSpacing(add, mult);
    }

    public void setTextChangeListener(InterfaceC2542b listener) {
        this.f18038m = listener;
    }

    public void startAnimation(String text, InterfaceC2542b textChangeListener) {
        this.f18035d = text;
        setText("");
        this.f18036e = 0;
        setTextChangeListener(textChangeListener);
        this.f18032a.post(this.f18034c);
    }

    public TypingTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f18032a = new Handler();
        this.f18036e = 0;
        this.f18037f = 50L;
        init();
    }

    public TypingTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f18032a = new Handler();
        this.f18036e = 0;
        this.f18037f = 50L;
        init();
    }
}
