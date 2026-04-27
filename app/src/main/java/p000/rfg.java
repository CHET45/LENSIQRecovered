package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000.AbstractC14467w8;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class rfg extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f78167a;

    /* JADX INFO: renamed from: b */
    public final AbstractC14467w8 f78168b;

    /* JADX INFO: renamed from: rfg$a */
    @p7e({p7e.EnumC10826a.f69936c})
    public static class C12064a implements AbstractC14467w8.a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f78169a;

        /* JADX INFO: renamed from: b */
        public final Context f78170b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<rfg> f78171c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final scf<Menu, Menu> f78172d = new scf<>();

        public C12064a(Context context, ActionMode.Callback callback) {
            this.f78170b = context;
            this.f78169a = callback;
        }

        private Menu getMenuWrapper(Menu menu) {
            Menu menu2 = this.f78172d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            mra mraVar = new mra(this.f78170b, (sfg) menu);
            this.f78172d.put(menu, mraVar);
            return mraVar;
        }

        public ActionMode getActionModeWrapper(AbstractC14467w8 abstractC14467w8) {
            int size = this.f78171c.size();
            for (int i = 0; i < size; i++) {
                rfg rfgVar = this.f78171c.get(i);
                if (rfgVar != null && rfgVar.f78168b == abstractC14467w8) {
                    return rfgVar;
                }
            }
            rfg rfgVar2 = new rfg(this.f78170b, abstractC14467w8);
            this.f78171c.add(rfgVar2);
            return rfgVar2;
        }

        @Override // p000.AbstractC14467w8.a
        public boolean onActionItemClicked(AbstractC14467w8 abstractC14467w8, MenuItem menuItem) {
            return this.f78169a.onActionItemClicked(getActionModeWrapper(abstractC14467w8), new hra(this.f78170b, (ufg) menuItem));
        }

        @Override // p000.AbstractC14467w8.a
        public boolean onCreateActionMode(AbstractC14467w8 abstractC14467w8, Menu menu) {
            return this.f78169a.onCreateActionMode(getActionModeWrapper(abstractC14467w8), getMenuWrapper(menu));
        }

        @Override // p000.AbstractC14467w8.a
        public void onDestroyActionMode(AbstractC14467w8 abstractC14467w8) {
            this.f78169a.onDestroyActionMode(getActionModeWrapper(abstractC14467w8));
        }

        @Override // p000.AbstractC14467w8.a
        public boolean onPrepareActionMode(AbstractC14467w8 abstractC14467w8, Menu menu) {
            return this.f78169a.onPrepareActionMode(getActionModeWrapper(abstractC14467w8), getMenuWrapper(menu));
        }
    }

    public rfg(Context context, AbstractC14467w8 abstractC14467w8) {
        this.f78167a = context;
        this.f78168b = abstractC14467w8;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f78168b.finish();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f78168b.getCustomView();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new mra(this.f78167a, (sfg) this.f78168b.getMenu());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f78168b.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f78168b.getSubtitle();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f78168b.getTag();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f78168b.getTitle();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f78168b.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f78168b.invalidate();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f78168b.isTitleOptional();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f78168b.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f78168b.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f78168b.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f78168b.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f78168b.setTitleOptionalHint(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f78168b.setSubtitle(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f78168b.setTitle(i);
    }
}
