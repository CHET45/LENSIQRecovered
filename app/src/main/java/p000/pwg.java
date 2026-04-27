package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000.a7d;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class pwg {

    /* JADX INFO: renamed from: a */
    public static final int f72387a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f72388b = 1;

    /* JADX INFO: renamed from: pwg$a */
    @c5e(23)
    public static class C11161a {
        private C11161a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m19810a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static ColorStateList m19811b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static PorterDuff.Mode m19812c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static int m19813d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m19814e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static void m19815f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m19816g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static void m19817h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: renamed from: pwg$b */
    @c5e(24)
    public static class C11162b {
        private C11162b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static DecimalFormatSymbols m19818a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: pwg$c */
    @c5e(26)
    public static class C11163c {
        private C11163c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m19819a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m19820b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static int m19821c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static int[] m19822d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static int m19823e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static void m19824f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m19825g(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static void m19826h(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* JADX INFO: renamed from: pwg$d */
    @c5e(28)
    public static class C11164d {
        private C11164d() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static CharSequence m19827a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static String[] m19828b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static PrecomputedText.Params m19829c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m19830d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: pwg$e */
    @c5e(34)
    public static class C11165e {
        private C11165e() {
        }

        @ih4
        public static void setLineHeight(@efb TextView textView, int i, @y46(from = 0.0d) float f) {
            textView.setLineHeight(i, f);
        }
    }

    /* JADX INFO: renamed from: pwg$f */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC11166f {
    }

    /* JADX INFO: renamed from: pwg$g */
    @c5e(26)
    public static class ActionModeCallbackC11167g implements ActionMode.Callback {

        /* JADX INFO: renamed from: g */
        public static final int f72389g = 100;

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f72390a;

        /* JADX INFO: renamed from: b */
        public final TextView f72391b;

        /* JADX INFO: renamed from: c */
        public Class<?> f72392c;

        /* JADX INFO: renamed from: d */
        public Method f72393d;

        /* JADX INFO: renamed from: e */
        public boolean f72394e;

        /* JADX INFO: renamed from: f */
        public boolean f72395f = false;

        public ActionModeCallbackC11167g(ActionMode.Callback callback, TextView textView) {
            this.f72390a = callback;
            this.f72391b = textView;
        }

        private Intent createProcessTextIntent() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !isEditable(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> getSupportedActivities(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(createProcessTextIntent(), 0)) {
                if (isSupportedActivity(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean isEditable(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean isSupportedActivity(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void recomputeProcessTextMenuItems(Menu menu) {
            Context context = this.f72391b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f72395f) {
                this.f72395f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f72392c = cls;
                    this.f72393d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f72394e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f72392c = null;
                    this.f72393d = null;
                    this.f72394e = false;
                }
            }
            try {
                Method declaredMethod = (this.f72394e && this.f72392c.isInstance(menu)) ? this.f72393d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> supportedActivities = getSupportedActivities(context, packageManager);
                for (int i = 0; i < supportedActivities.size(); i++) {
                    ResolveInfo resolveInfo = supportedActivities.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(createProcessTextIntentForResolveInfo(resolveInfo, this.f72391b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @efb
        /* JADX INFO: renamed from: a */
        public ActionMode.Callback m19831a() {
            return this.f72390a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f72390a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f72390a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f72390a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            recomputeProcessTextMenuItems(menu);
            return this.f72390a.onPrepareActionMode(actionMode, menu);
        }
    }

    private pwg() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMaxTextSize(@efb TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C11163c.m19819a(textView);
        }
        if (textView instanceof fj0) {
            return ((fj0) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMinTextSize(@efb TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C11163c.m19820b(textView);
        }
        if (textView instanceof fj0) {
            return ((fj0) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeStepGranularity(@efb TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C11163c.m19821c(textView);
        }
        if (textView instanceof fj0) {
            return ((fj0) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @efb
    public static int[] getAutoSizeTextAvailableSizes(@efb TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? C11163c.m19822d(textView) : textView instanceof fj0 ? ((fj0) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeTextType(@efb TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C11163c.m19823e(textView);
        }
        if (textView instanceof fj0) {
            return ((fj0) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @hib
    public static ColorStateList getCompoundDrawableTintList(@efb TextView textView) {
        z7d.checkNotNull(textView);
        return C11161a.m19811b(textView);
    }

    @hib
    public static PorterDuff.Mode getCompoundDrawableTintMode(@efb TextView textView) {
        z7d.checkNotNull(textView);
        return C11161a.m19812c(textView);
    }

    @efb
    public static Drawable[] getCompoundDrawablesRelative(@efb TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int getFirstBaselineToTopHeight(@efb TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(@efb TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int getMaxLines(@efb TextView textView) {
        return textView.getMaxLines();
    }

    public static int getMinLines(@efb TextView textView) {
        return textView.getMinLines();
    }

    private static int getTextDirection(@efb TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static TextDirectionHeuristic getTextDirectionHeuristic(@efb TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C11164d.m19828b(C11162b.m19818a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    @efb
    public static a7d.C0081b getTextMetricsParams(@efb TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new a7d.C0081b(C11164d.m19829c(textView));
        }
        a7d.C0081b.a aVar = new a7d.C0081b.a(new TextPaint(textView.getPaint()));
        aVar.setBreakStrategy(C11161a.m19810a(textView));
        aVar.setHyphenationFrequency(C11161a.m19813d(textView));
        aVar.setTextDirection(getTextDirectionHeuristic(textView));
        return aVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithConfiguration(@efb TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C11163c.m19824f(textView, i, i2, i3, i4);
        } else if (textView instanceof fj0) {
            ((fj0) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithPresetSizes(@efb TextView textView, @efb int[] iArr, int i) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C11163c.m19825g(textView, iArr, i);
        } else if (textView instanceof fj0) {
            ((fj0) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeWithDefaults(@efb TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C11163c.m19826h(textView, i);
        } else if (textView instanceof fj0) {
            ((fj0) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void setCompoundDrawableTintList(@efb TextView textView, @hib ColorStateList colorStateList) {
        z7d.checkNotNull(textView);
        C11161a.m19815f(textView, colorStateList);
    }

    public static void setCompoundDrawableTintMode(@efb TextView textView, @hib PorterDuff.Mode mode) {
        z7d.checkNotNull(textView);
        C11161a.m19816g(textView, mode);
    }

    public static void setCompoundDrawablesRelative(@efb TextView textView, @hib Drawable drawable, @hib Drawable drawable2, @hib Drawable drawable3, @hib Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@efb TextView textView, @hib Drawable drawable, @hib Drawable drawable2, @hib Drawable drawable3, @hib Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void setCustomSelectionActionModeCallback(@efb TextView textView, @efb ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static void setFirstBaselineToTopHeight(@efb TextView textView, @h78(from = 0) @fkd int i) {
        z7d.checkArgumentNonnegative(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C11164d.m19830d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(@efb TextView textView, @h78(from = 0) @fkd int i) {
        z7d.checkArgumentNonnegative(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void setLineHeight(@efb TextView textView, @h78(from = 0) @fkd int i) {
        z7d.checkArgumentNonnegative(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void setPrecomputedText(@efb TextView textView, @efb a7d a7dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(C11164d.m19827a(a7dVar.getPrecomputedText()));
        } else {
            if (!getTextMetricsParams(textView).equalsWithoutTextDirection(a7dVar.getParams())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(a7dVar);
        }
    }

    public static void setTextAppearance(@efb TextView textView, @dbg int i) {
        textView.setTextAppearance(i);
    }

    public static void setTextMetricsParams(@efb TextView textView, @efb a7d.C0081b c0081b) {
        textView.setTextDirection(getTextDirection(c0081b.getTextDirection()));
        textView.getPaint().set(c0081b.getTextPaint());
        C11161a.m19814e(textView, c0081b.getBreakStrategy());
        C11161a.m19817h(textView, c0081b.getHyphenationFrequency());
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public static ActionMode.Callback unwrapCustomSelectionActionModeCallback(@hib ActionMode.Callback callback) {
        return callback instanceof ActionModeCallbackC11167g ? ((ActionModeCallbackC11167g) callback).m19831a() : callback;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(@efb TextView textView, @hib ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC11167g) || callback == null) ? callback : new ActionModeCallbackC11167g(callback, textView);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@efb TextView textView, @gq4 int i, @gq4 int i2, @gq4 int i3, @gq4 int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static void setLineHeight(@efb TextView textView, int i, @y46(from = 0.0d) float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C11165e.setLineHeight(textView, i, f);
        } else {
            setLineHeight(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }
}
