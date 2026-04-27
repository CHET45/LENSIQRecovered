package p000;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.C0392R;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c30 {

    /* JADX INFO: renamed from: h */
    public static final String f15626h = "AppCompatViewInflater";

    /* JADX INFO: renamed from: a */
    public final Object[] f15628a = new Object[2];

    /* JADX INFO: renamed from: b */
    public static final Class<?>[] f15620b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f15621c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f15622d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f15623e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f15624f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f15625g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: i */
    public static final scf<String, Constructor<? extends View>> f15627i = new scf<>();

    /* JADX INFO: renamed from: c30$a */
    public static class ViewOnClickListenerC2174a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final View f15629a;

        /* JADX INFO: renamed from: b */
        public final String f15630b;

        /* JADX INFO: renamed from: c */
        public Method f15631c;

        /* JADX INFO: renamed from: d */
        public Context f15632d;

        public ViewOnClickListenerC2174a(@efb View view, @efb String str) {
            this.f15629a = view;
            this.f15630b = str;
        }

        private void resolveMethod(@hib Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f15630b, View.class)) != null) {
                        this.f15631c = method;
                        this.f15632d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f15629a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f15629a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f15630b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f15629a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@efb View view) {
            if (this.f15631c == null) {
                resolveMethod(this.f15629a.getContext());
            }
            try {
                this.f15631c.invoke(this.f15632d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void backportAccessibilityAttributes(@efb Context context, @efb View view, @efb AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f15622d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            o8i.setAccessibilityHeading(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f15623e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            o8i.setAccessibilityPaneTitle(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f15624f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            o8i.setScreenReaderFocusable(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && o8i.hasOnClickListeners(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f15621c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new ViewOnClickListenerC2174a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        scf<String, Constructor<? extends View>> scfVar = f15627i;
        Constructor<? extends View> constructor = scfVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f15620b);
            scfVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f15628a);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f15628a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f15625g;
                if (i >= strArr.length) {
                    return null;
                }
                View viewCreateViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (viewCreateViewByPrefix != null) {
                    return viewCreateViewByPrefix;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f15628a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0392R.styleable.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(C0392R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C0392R.styleable.View_theme, 0)) != 0) {
            Log.i(f15626h, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof hy2) && ((hy2) context).getThemeResId() == resourceId) ? context : new hy2(context, resourceId) : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @efb
    /* JADX INFO: renamed from: a */
    public AppCompatAutoCompleteTextView mo3685a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: b */
    public AppCompatButton mo3686b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: c */
    public AppCompatCheckBox mo3687c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @hib
    public final View createView(@hib View view, @efb String str, @efb Context context, @efb AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View viewM3694j;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = q2h.wrap(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewM3694j = m3694j(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "CheckedTextView":
                viewM3694j = m3688d(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "MultiAutoCompleteTextView":
                viewM3694j = m3692h(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "TextView":
                viewM3694j = mo3697m(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "ImageButton":
                viewM3694j = m3690f(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "SeekBar":
                viewM3694j = m3695k(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "Spinner":
                viewM3694j = m3696l(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "RadioButton":
                viewM3694j = mo3693i(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "ToggleButton":
                viewM3694j = m3698n(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "ImageView":
                viewM3694j = m3691g(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "AutoCompleteTextView":
                viewM3694j = mo3685a(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "CheckBox":
                viewM3694j = mo3687c(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "EditText":
                viewM3694j = m3689e(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            case "Button":
                viewM3694j = mo3686b(context2, attributeSet);
                verifyNotNull(viewM3694j, str);
                break;
            default:
                viewM3694j = m3699o(context2, str, attributeSet);
                break;
        }
        if (viewM3694j == null && context != context2) {
            viewM3694j = createViewFromTag(context2, str, attributeSet);
        }
        if (viewM3694j != null) {
            checkOnClickListener(viewM3694j, attributeSet);
            backportAccessibilityAttributes(context2, viewM3694j, attributeSet);
        }
        return viewM3694j;
    }

    @efb
    /* JADX INFO: renamed from: d */
    public AppCompatCheckedTextView m3688d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: e */
    public AppCompatEditText m3689e(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: f */
    public AppCompatImageButton m3690f(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: g */
    public AppCompatImageView m3691g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: h */
    public AppCompatMultiAutoCompleteTextView m3692h(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: i */
    public AppCompatRadioButton mo3693i(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: j */
    public AppCompatRatingBar m3694j(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: k */
    public AppCompatSeekBar m3695k(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: l */
    public AppCompatSpinner m3696l(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: m */
    public AppCompatTextView mo3697m(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @efb
    /* JADX INFO: renamed from: n */
    public AppCompatToggleButton m3698n(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @hib
    /* JADX INFO: renamed from: o */
    public View m3699o(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}
