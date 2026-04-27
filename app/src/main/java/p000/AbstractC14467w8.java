package p000;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import p000.p7e;

/* JADX INFO: renamed from: w8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14467w8 {

    /* JADX INFO: renamed from: a */
    public Object f93543a;

    /* JADX INFO: renamed from: b */
    public boolean f93544b;

    /* JADX INFO: renamed from: w8$a */
    public interface a {
        boolean onActionItemClicked(AbstractC14467w8 abstractC14467w8, MenuItem menuItem);

        boolean onCreateActionMode(AbstractC14467w8 abstractC14467w8, Menu menu);

        void onDestroyActionMode(AbstractC14467w8 abstractC14467w8);

        boolean onPrepareActionMode(AbstractC14467w8 abstractC14467w8, Menu menu);
    }

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag() {
        return this.f93543a;
    }

    public abstract CharSequence getTitle();

    public boolean getTitleOptionalHint() {
        return this.f93544b;
    }

    public abstract void invalidate();

    public boolean isTitleOptional() {
        return false;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public boolean isUiFocusable() {
        return true;
    }

    public abstract void setCustomView(View view);

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charSequence);

    public void setTag(Object obj) {
        this.f93543a = obj;
    }

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charSequence);

    public void setTitleOptionalHint(boolean z) {
        this.f93544b = z;
    }
}
