package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.C0392R;
import androidx.appcompat.view.menu.C0444e;
import androidx.appcompat.view.menu.C0448i;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class v4d {

    /* JADX INFO: renamed from: a */
    public final Context f89969a;

    /* JADX INFO: renamed from: b */
    public final C0444e f89970b;

    /* JADX INFO: renamed from: c */
    public final View f89971c;

    /* JADX INFO: renamed from: d */
    public final C0448i f89972d;

    /* JADX INFO: renamed from: e */
    public InterfaceC13866e f89973e;

    /* JADX INFO: renamed from: f */
    public InterfaceC13865d f89974f;

    /* JADX INFO: renamed from: g */
    public View.OnTouchListener f89975g;

    /* JADX INFO: renamed from: v4d$a */
    public class C13862a implements C0444e.a {
        public C13862a() {
        }

        @Override // androidx.appcompat.view.menu.C0444e.a
        public boolean onMenuItemSelected(@efb C0444e c0444e, @efb MenuItem menuItem) {
            InterfaceC13866e interfaceC13866e = v4d.this.f89973e;
            if (interfaceC13866e != null) {
                return interfaceC13866e.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0444e.a
        public void onMenuModeChange(@efb C0444e c0444e) {
        }
    }

    /* JADX INFO: renamed from: v4d$b */
    public class C13863b implements PopupWindow.OnDismissListener {
        public C13863b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            v4d v4dVar = v4d.this;
            InterfaceC13865d interfaceC13865d = v4dVar.f89974f;
            if (interfaceC13865d != null) {
                interfaceC13865d.onDismiss(v4dVar);
            }
        }
    }

    /* JADX INFO: renamed from: v4d$c */
    public class C13864c extends js6 {
        public C13864c(View view) {
            super(view);
        }

        @Override // p000.js6
        public qbf getPopup() {
            return v4d.this.f89972d.getPopup();
        }

        @Override // p000.js6
        public boolean onForwardingStarted() {
            v4d.this.show();
            return true;
        }

        @Override // p000.js6
        public boolean onForwardingStopped() {
            v4d.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: v4d$d */
    public interface InterfaceC13865d {
        void onDismiss(v4d v4dVar);
    }

    /* JADX INFO: renamed from: v4d$e */
    public interface InterfaceC13866e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public v4d(@efb Context context, @efb View view) {
        this(context, view, 0);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: a */
    public ListView m23773a() {
        if (this.f89972d.isShowing()) {
            return this.f89972d.getListView();
        }
        return null;
    }

    public void dismiss() {
        this.f89972d.dismiss();
    }

    @efb
    public View.OnTouchListener getDragToOpenListener() {
        if (this.f89975g == null) {
            this.f89975g = new C13864c(this.f89971c);
        }
        return this.f89975g;
    }

    public int getGravity() {
        return this.f89972d.getGravity();
    }

    @efb
    public Menu getMenu() {
        return this.f89970b;
    }

    @efb
    public MenuInflater getMenuInflater() {
        return new tfg(this.f89969a);
    }

    public void inflate(@lra int i) {
        getMenuInflater().inflate(i, this.f89970b);
    }

    public void setForceShowIcon(boolean z) {
        this.f89972d.setForceShowIcon(z);
    }

    public void setGravity(int i) {
        this.f89972d.setGravity(i);
    }

    public void setOnDismissListener(@hib InterfaceC13865d interfaceC13865d) {
        this.f89974f = interfaceC13865d;
    }

    public void setOnMenuItemClickListener(@hib InterfaceC13866e interfaceC13866e) {
        this.f89973e = interfaceC13866e;
    }

    public void show() {
        this.f89972d.show();
    }

    public v4d(@efb Context context, @efb View view, int i) {
        this(context, view, i, C0392R.attr.popupMenuStyle, 0);
    }

    public v4d(@efb Context context, @efb View view, int i, @gc0 int i2, @dbg int i3) {
        this.f89969a = context;
        this.f89971c = view;
        C0444e c0444e = new C0444e(context);
        this.f89970b = c0444e;
        c0444e.setCallback(new C13862a());
        C0448i c0448i = new C0448i(context, c0444e, view, false, i2, i3);
        this.f89972d = c0448i;
        c0448i.setGravity(i);
        c0448i.setOnDismissListener(new C13863b());
    }
}
