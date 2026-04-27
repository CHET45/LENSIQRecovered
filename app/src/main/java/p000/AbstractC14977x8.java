package p000;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000.p7e;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14977x8 {

    /* JADX INFO: renamed from: d */
    public static final String f97125d = "ActionProvider(support)";

    /* JADX INFO: renamed from: a */
    public final Context f97126a;

    /* JADX INFO: renamed from: b */
    public a f97127b;

    /* JADX INFO: renamed from: c */
    public b f97128c;

    /* JADX INFO: renamed from: x8$a */
    @p7e({p7e.EnumC10826a.f69936c})
    public interface a {
        void onSubUiVisibilityChanged(boolean z);
    }

    /* JADX INFO: renamed from: x8$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC14977x8(@efb Context context) {
        this.f97126a = context;
    }

    @efb
    public Context getContext() {
        return this.f97126a;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    @efb
    public abstract View onCreateActionView();

    @efb
    public View onCreateActionView(@efb MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(@efb SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.f97128c == null || !overridesItemVisibility()) {
            return;
        }
        this.f97128c.onActionProviderVisibilityChanged(isVisible());
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public void reset() {
        this.f97128c = null;
        this.f97127b = null;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public void setSubUiVisibilityListener(@hib a aVar) {
        this.f97127b = aVar;
    }

    public void setVisibilityListener(@hib b bVar) {
        if (this.f97128c != null && bVar != null) {
            Log.w(f97125d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f97128c = bVar;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public void subUiVisibilityChanged(boolean z) {
        a aVar = this.f97127b;
        if (aVar != null) {
            aVar.onSubUiVisibilityChanged(z);
        }
    }
}
