package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class mra extends gs0 implements Menu {

    /* JADX INFO: renamed from: o */
    public final sfg f61837o;

    public mra(Context context, sfg sfgVar) {
        super(context);
        if (sfgVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f61837o = sfgVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m11825a(this.f61837o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f61837o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m11825a(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m11826b(this.f61837o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m11827c();
        this.f61837o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f61837o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m11825a(this.f61837o.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m11825a(this.f61837o.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f61837o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f61837o.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f61837o.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f61837o.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m11828d(i);
        this.f61837o.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m11829e(i);
        this.f61837o.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f61837o.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f61837o.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f61837o.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f61837o.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f61837o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m11825a(this.f61837o.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m11826b(this.f61837o.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m11825a(this.f61837o.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m11826b(this.f61837o.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m11825a(this.f61837o.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m11826b(this.f61837o.addSubMenu(i, i2, i3, i4));
    }
}
