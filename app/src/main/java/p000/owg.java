package p000;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.widget.TextView;
import androidx.databinding.library.baseAdapters.C1011R;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @w21(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @w21(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @w21(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @w21(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @w21(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @w21(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @w21(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @w21(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @w21(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class owg {

    /* JADX INFO: renamed from: a */
    public static final String f69108a = "TextViewBindingAdapters";

    /* JADX INFO: renamed from: b */
    public static final int f69109b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f69110c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f69111d = 5;

    /* JADX INFO: renamed from: owg$a */
    public class C10694a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC10696c f69112a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC10697d f69113b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ me8 f69114c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC10695b f69115d;

        public C10694a(InterfaceC10696c interfaceC10696c, InterfaceC10697d interfaceC10697d, me8 me8Var, InterfaceC10695b interfaceC10695b) {
            this.f69112a = interfaceC10696c;
            this.f69113b = interfaceC10697d;
            this.f69114c = me8Var;
            this.f69115d = interfaceC10695b;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            InterfaceC10695b interfaceC10695b = this.f69115d;
            if (interfaceC10695b != null) {
                interfaceC10695b.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            InterfaceC10696c interfaceC10696c = this.f69112a;
            if (interfaceC10696c != null) {
                interfaceC10696c.beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            InterfaceC10697d interfaceC10697d = this.f69113b;
            if (interfaceC10697d != null) {
                interfaceC10697d.onTextChanged(charSequence, i, i2, i3);
            }
            me8 me8Var = this.f69114c;
            if (me8Var != null) {
                me8Var.onChange();
            }
        }
    }

    /* JADX INFO: renamed from: owg$b */
    public interface InterfaceC10695b {
        void afterTextChanged(Editable editable);
    }

    /* JADX INFO: renamed from: owg$c */
    public interface InterfaceC10696c {
        void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* JADX INFO: renamed from: owg$d */
    public interface InterfaceC10697d {
        void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    @le8(attribute = "android:text", event = "android:textAttrChanged")
    public static String getTextString(TextView textView) {
        return textView.getText().toString();
    }

    private static boolean haveContentsChanged(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    @q21({"android:autoText"})
    public static void setAutoText(TextView textView, boolean z) {
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z, capitalize));
    }

    @q21({"android:bufferType"})
    public static void setBufferType(TextView textView, TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @q21({"android:capitalize"})
    public static void setCapitalize(TextView textView, TextKeyListener.Capitalize capitalize) {
        textView.setKeyListener(TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    @q21({"android:digits"})
    public static void setDigits(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            textView.setKeyListener(DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @q21({"android:drawableBottom"})
    public static void setDrawableBottom(TextView textView, Drawable drawable) {
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @q21({"android:drawableEnd"})
    public static void setDrawableEnd(TextView textView, Drawable drawable) {
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @q21({"android:drawableLeft"})
    public static void setDrawableLeft(TextView textView, Drawable drawable) {
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @q21({"android:drawableRight"})
    public static void setDrawableRight(TextView textView, Drawable drawable) {
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @q21({"android:drawableStart"})
    public static void setDrawableStart(TextView textView, Drawable drawable) {
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @q21({"android:drawableTop"})
    public static void setDrawableTop(TextView textView, Drawable drawable) {
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @q21({"android:imeActionLabel"})
    public static void setImeActionLabel(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @q21({"android:inputMethod"})
    public static void setInputMethod(TextView textView, CharSequence charSequence) {
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
        } catch (ClassNotFoundException e) {
            Log.e(f69108a, "Could not create input method: " + ((Object) charSequence), e);
        } catch (IllegalAccessException e2) {
            Log.e(f69108a, "Could not create input method: " + ((Object) charSequence), e2);
        } catch (InstantiationException e3) {
            Log.e(f69108a, "Could not create input method: " + ((Object) charSequence), e3);
        }
    }

    private static void setIntrinsicBounds(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @q21({"android:lineSpacingExtra"})
    public static void setLineSpacingExtra(TextView textView, float f) {
        textView.setLineSpacing(f, textView.getLineSpacingMultiplier());
    }

    @q21({"android:lineSpacingMultiplier"})
    public static void setLineSpacingMultiplier(TextView textView, float f) {
        textView.setLineSpacing(textView.getLineSpacingExtra(), f);
    }

    @q21({"android:maxLength"})
    public static void setMaxLength(TextView textView, int i) {
        InputFilter[] filters = textView.getFilters();
        if (filters != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= filters.length) {
                    int length = filters.length;
                    InputFilter[] inputFilterArr = new InputFilter[length + 1];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    inputFilterArr[length] = new InputFilter.LengthFilter(i);
                    filters = inputFilterArr;
                    break;
                }
                InputFilter inputFilter = filters[i2];
                if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                    i2++;
                } else if (((InputFilter.LengthFilter) inputFilter).getMax() != i) {
                    filters[i2] = new InputFilter.LengthFilter(i);
                }
            }
        } else {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i)};
        }
        textView.setFilters(filters);
    }

    @q21({"android:numeric"})
    public static void setNumeric(TextView textView, int i) {
        textView.setKeyListener(DigitsKeyListener.getInstance((i & 3) != 0, (i & 5) != 0));
    }

    @q21({"android:password"})
    public static void setPassword(TextView textView, boolean z) {
        if (z) {
            textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    @q21({"android:phoneNumber"})
    public static void setPhoneNumber(TextView textView, boolean z) {
        if (z) {
            textView.setKeyListener(DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @q21({"android:shadowColor"})
    public static void setShadowColor(TextView textView, int i) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
    }

    @q21({"android:shadowDx"})
    public static void setShadowDx(TextView textView, float f) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), f, textView.getShadowDy(), shadowColor);
    }

    @q21({"android:shadowDy"})
    public static void setShadowDy(TextView textView, float f) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f, shadowColor);
    }

    @q21({"android:shadowRadius"})
    public static void setShadowRadius(TextView textView, float f) {
        textView.setShadowLayer(f, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
    }

    @q21({"android:text"})
    public static void setText(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!haveContentsChanged(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    @q21({"android:textSize"})
    public static void setTextSize(TextView textView, float f) {
        textView.setTextSize(0, f);
    }

    @q21(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void setTextWatcher(TextView textView, InterfaceC10696c interfaceC10696c, InterfaceC10697d interfaceC10697d, InterfaceC10695b interfaceC10695b, me8 me8Var) {
        C10694a c10694a = (interfaceC10696c == null && interfaceC10695b == null && interfaceC10697d == null && me8Var == null) ? null : new C10694a(interfaceC10696c, interfaceC10697d, me8Var, interfaceC10695b);
        TextWatcher textWatcher = (TextWatcher) ab9.trackListener(textView, c10694a, C1011R.id.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (c10694a != null) {
            textView.addTextChangedListener(c10694a);
        }
    }

    @q21({"android:imeActionId"})
    public static void setImeActionLabel(TextView textView, int i) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i);
    }
}
