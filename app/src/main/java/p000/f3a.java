package p000;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.material.C3146R;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69938e})
public class f3a extends DatePickerDialog {

    /* JADX INFO: renamed from: c */
    @gc0
    public static final int f34994c = 16843612;

    /* JADX INFO: renamed from: d */
    @dbg
    public static final int f34995d = C3146R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;

    /* JADX INFO: renamed from: a */
    @efb
    public final Drawable f34996a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Rect f34997b;

    public f3a(@efb Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f34996a);
        getWindow().getDecorView().setOnTouchListener(new q48(this, this.f34997b));
    }

    public f3a(@efb Context context, int i) {
        this(context, i, null, -1, -1, -1);
    }

    public f3a(@efb Context context, @hib DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public f3a(@efb Context context, int i, @hib DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int iResolveOrThrow = hw9.resolveOrThrow(getContext(), C3146R.attr.colorSurface, getClass().getCanonicalName());
        int i5 = f34995d;
        b3a b3aVar = new b3a(context2, null, 16843612, i5);
        b3aVar.setFillColor(ColorStateList.valueOf(iResolveOrThrow));
        Rect dialogBackgroundInsets = sw9.getDialogBackgroundInsets(context2, 16843612, i5);
        this.f34997b = dialogBackgroundInsets;
        this.f34996a = sw9.insetDrawable(b3aVar, dialogBackgroundInsets);
    }
}
