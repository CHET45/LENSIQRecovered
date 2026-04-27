package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class fri extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f37585a;

    /* JADX INFO: renamed from: b */
    public Drawable.ConstantState f37586b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f37587c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f37588d;

    public fri(@hib fri friVar) {
        this.f37587c = null;
        this.f37588d = dri.f30515m;
        if (friVar != null) {
            this.f37585a = friVar.f37585a;
            this.f37586b = friVar.f37586b;
            this.f37587c = friVar.f37587c;
            this.f37588d = friVar.f37588d;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m11113a() {
        return this.f37586b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f37585a;
        Drawable.ConstantState constantState = this.f37586b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @efb
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @efb
    public Drawable newDrawable(@hib Resources resources) {
        return new eri(this, resources);
    }
}
