package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class q2h extends ContextWrapper {

    /* JADX INFO: renamed from: c */
    public static final Object f73079c = new Object();

    /* JADX INFO: renamed from: d */
    public static ArrayList<WeakReference<q2h>> f73080d;

    /* JADX INFO: renamed from: a */
    public final Resources f73081a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f73082b;

    private q2h(@efb Context context) {
        super(context);
        if (!j3i.shouldBeUsed()) {
            this.f73081a = new s2h(this, context.getResources());
            this.f73082b = null;
            return;
        }
        j3i j3iVar = new j3i(this, context.getResources());
        this.f73081a = j3iVar;
        Resources.Theme themeNewTheme = j3iVar.newTheme();
        this.f73082b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean shouldWrap(@efb Context context) {
        if ((context instanceof q2h) || (context.getResources() instanceof s2h) || (context.getResources() instanceof j3i)) {
            return false;
        }
        return j3i.shouldBeUsed();
    }

    public static Context wrap(@efb Context context) {
        if (!shouldWrap(context)) {
            return context;
        }
        synchronized (f73079c) {
            try {
                ArrayList<WeakReference<q2h>> arrayList = f73080d;
                if (arrayList == null) {
                    f73080d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<q2h> weakReference = f73080d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f73080d.remove(size);
                        }
                    }
                    for (int size2 = f73080d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<q2h> weakReference2 = f73080d.get(size2);
                        q2h q2hVar = weakReference2 != null ? weakReference2.get() : null;
                        if (q2hVar != null && q2hVar.getBaseContext() == context) {
                            return q2hVar;
                        }
                    }
                }
                q2h q2hVar2 = new q2h(context);
                f73080d.add(new WeakReference<>(q2hVar2));
                return q2hVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f73081a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f73081a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f73082b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f73082b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
