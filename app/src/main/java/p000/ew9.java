package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC0431d;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public class ew9 extends DialogInterfaceC0431d.a {

    /* JADX INFO: renamed from: e */
    @gc0
    public static final int f34303e = C3146R.attr.alertDialogStyle;

    /* JADX INFO: renamed from: f */
    @dbg
    public static final int f34304f = C3146R.style.MaterialAlertDialog_MaterialComponents;

    /* JADX INFO: renamed from: g */
    @gc0
    public static final int f34305g = C3146R.attr.materialAlertDialogTheme;

    /* JADX INFO: renamed from: c */
    @hib
    public Drawable f34306c;

    /* JADX INFO: renamed from: d */
    @efb
    @yc4
    public final Rect f34307d;

    public ew9(@efb Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(@efb Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context contextWrap = g3a.wrap(context, null, f34303e, f34304f);
        return materialAlertDialogThemeOverlay == 0 ? contextWrap : new hy2(contextWrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(@efb Context context) {
        TypedValue typedValueResolve = hw9.resolve(context, f34305g);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private static int getOverridingThemeResId(@efb Context context, int i) {
        return i == 0 ? getMaterialAlertDialogThemeOverlay(context) : i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    public DialogInterfaceC0431d create() {
        DialogInterfaceC0431d dialogInterfaceC0431dCreate = super.create();
        Window window = dialogInterfaceC0431dCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f34306c;
        if (drawable instanceof b3a) {
            ((b3a) drawable).setElevation(o8i.getElevation(decorView));
        }
        window.setBackgroundDrawable(sw9.insetDrawable(this.f34306c, this.f34307d));
        decorView.setOnTouchListener(new q48(dialogInterfaceC0431dCreate, this.f34307d));
        return dialogInterfaceC0431dCreate;
    }

    @hib
    public Drawable getBackground() {
        return this.f34306c;
    }

    @efb
    @op1
    public ew9 setBackground(@hib Drawable drawable) {
        this.f34306c = drawable;
        return this;
    }

    @efb
    @op1
    public ew9 setBackgroundInsetBottom(@fkd int i) {
        this.f34307d.bottom = i;
        return this;
    }

    @efb
    @op1
    public ew9 setBackgroundInsetEnd(@fkd int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f34307d.left = i;
        } else {
            this.f34307d.right = i;
        }
        return this;
    }

    @efb
    @op1
    public ew9 setBackgroundInsetStart(@fkd int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f34307d.right = i;
        } else {
            this.f34307d.left = i;
        }
        return this;
    }

    @efb
    @op1
    public ew9 setBackgroundInsetTop(@fkd int i) {
        this.f34307d.top = i;
        return this;
    }

    public ew9(@efb Context context, int i) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = f34303e;
        int i3 = f34304f;
        this.f34307d = sw9.getDialogBackgroundInsets(context2, i2, i3);
        int color = ow9.getColor(context2, C3146R.attr.colorSurface, getClass().getCanonicalName());
        b3a b3aVar = new b3a(context2, null, i2, i3);
        b3aVar.initializeElevationOverlay(context2);
        b3aVar.setFillColor(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                b3aVar.setCornerSize(dimension);
            }
        }
        this.f34306c = b3aVar;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setAdapter(@hib ListAdapter listAdapter, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setCancelable(boolean z) {
        return (ew9) super.setCancelable(z);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setCursor(@hib Cursor cursor, @hib DialogInterface.OnClickListener onClickListener, @efb String str) {
        return (ew9) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setCustomTitle(@hib View view) {
        return (ew9) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setIconAttribute(@gc0 int i) {
        return (ew9) super.setIconAttribute(i);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setNegativeButtonIcon(@hib Drawable drawable) {
        return (ew9) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setNeutralButtonIcon(@hib Drawable drawable) {
        return (ew9) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setOnCancelListener(@hib DialogInterface.OnCancelListener onCancelListener) {
        return (ew9) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setOnDismissListener(@hib DialogInterface.OnDismissListener onDismissListener) {
        return (ew9) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setOnItemSelectedListener(@hib AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (ew9) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setOnKeyListener(@hib DialogInterface.OnKeyListener onKeyListener) {
        return (ew9) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setPositiveButtonIcon(@hib Drawable drawable) {
        return (ew9) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setIcon(@gq4 int i) {
        return (ew9) super.setIcon(i);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setItems(@d70 int i, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setItems(i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setMessage(@g8g int i) {
        return (ew9) super.setMessage(i);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setNegativeButton(@g8g int i, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setNeutralButton(@g8g int i, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setNeutralButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setPositiveButton(@g8g int i, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setTitle(@g8g int i) {
        return (ew9) super.setTitle(i);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setView(int i) {
        return (ew9) super.setView(i);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setIcon(@hib Drawable drawable) {
        return (ew9) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setItems(@hib CharSequence[] charSequenceArr, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setMessage(@hib CharSequence charSequence) {
        return (ew9) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setMultiChoiceItems(@d70 int i, @hib boolean[] zArr, @hib DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (ew9) super.setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setNegativeButton(@hib CharSequence charSequence, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setNeutralButton(@hib CharSequence charSequence, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setPositiveButton(@hib CharSequence charSequence, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setTitle(@hib CharSequence charSequence) {
        return (ew9) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setView(@hib View view) {
        return (ew9) super.setView(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setMultiChoiceItems(@hib CharSequence[] charSequenceArr, @hib boolean[] zArr, @hib DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (ew9) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setSingleChoiceItems(@d70 int i, int i2, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setSingleChoiceItems(i, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setMultiChoiceItems(@hib Cursor cursor, @efb String str, @efb String str2, @hib DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (ew9) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setSingleChoiceItems(@hib Cursor cursor, int i, @efb String str, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setSingleChoiceItems(cursor, i, str, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setSingleChoiceItems(@hib CharSequence[] charSequenceArr, int i, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0431d.a
    @efb
    @op1
    public ew9 setSingleChoiceItems(@hib ListAdapter listAdapter, int i, @hib DialogInterface.OnClickListener onClickListener) {
        return (ew9) super.setSingleChoiceItems(listAdapter, i, onClickListener);
    }
}
