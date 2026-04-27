package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.BundleCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import p000.p7e;
import p000.pd3;
import p000.vd3;

/* JADX INFO: loaded from: classes.dex */
public final class sd3 {

    /* JADX INFO: renamed from: A */
    public static final int f81252A = 0;

    /* JADX INFO: renamed from: B */
    public static final int f81253B = 1;

    /* JADX INFO: renamed from: C */
    public static final int f81254C = 2;

    /* JADX INFO: renamed from: D */
    public static final int f81255D = 2;

    /* JADX INFO: renamed from: E */
    public static final String f81256E = "androidx.browser.customtabs.extra.SHARE_STATE";

    /* JADX INFO: renamed from: F */
    @Deprecated
    public static final String f81257F = "android.support.customtabs.extra.SHARE_MENU_ITEM";

    /* JADX INFO: renamed from: G */
    public static final String f81258G = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";

    /* JADX INFO: renamed from: H */
    public static final String f81259H = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";

    /* JADX INFO: renamed from: I */
    public static final String f81260I = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";

    /* JADX INFO: renamed from: J */
    public static final String f81261J = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";

    /* JADX INFO: renamed from: K */
    public static final String f81262K = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";

    /* JADX INFO: renamed from: L */
    public static final String f81263L = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    /* JADX INFO: renamed from: M */
    public static final String f81264M = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";

    /* JADX INFO: renamed from: N */
    public static final String f81265N = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";

    /* JADX INFO: renamed from: O */
    public static final String f81266O = "android.support.customtabs.customaction.ID";

    /* JADX INFO: renamed from: P */
    public static final int f81267P = 0;

    /* JADX INFO: renamed from: Q */
    public static final int f81268Q = 5;

    /* JADX INFO: renamed from: c */
    public static final String f81269c = "android.support.customtabs.extra.user_opt_out";

    /* JADX INFO: renamed from: d */
    public static final String f81270d = "android.support.customtabs.extra.SESSION";

    /* JADX INFO: renamed from: e */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f81271e = "android.support.customtabs.extra.SESSION_ID";

    /* JADX INFO: renamed from: f */
    public static final int f81272f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f81273g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f81274h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f81275i = 2;

    /* JADX INFO: renamed from: j */
    public static final String f81276j = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* JADX INFO: renamed from: k */
    public static final String f81277k = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* JADX INFO: renamed from: l */
    public static final String f81278l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* JADX INFO: renamed from: m */
    public static final String f81279m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* JADX INFO: renamed from: n */
    public static final String f81280n = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* JADX INFO: renamed from: o */
    public static final int f81281o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f81282p = 1;

    /* JADX INFO: renamed from: q */
    public static final String f81283q = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* JADX INFO: renamed from: r */
    public static final String f81284r = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* JADX INFO: renamed from: s */
    public static final String f81285s = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* JADX INFO: renamed from: t */
    public static final String f81286t = "android.support.customtabs.customaction.ICON";

    /* JADX INFO: renamed from: u */
    public static final String f81287u = "android.support.customtabs.customaction.DESCRIPTION";

    /* JADX INFO: renamed from: v */
    public static final String f81288v = "android.support.customtabs.customaction.PENDING_INTENT";

    /* JADX INFO: renamed from: w */
    public static final String f81289w = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* JADX INFO: renamed from: x */
    public static final String f81290x = "android.support.customtabs.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: y */
    public static final String f81291y = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* JADX INFO: renamed from: z */
    public static final String f81292z = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";

    /* JADX INFO: renamed from: a */
    @efb
    public final Intent f81293a;

    /* JADX INFO: renamed from: b */
    @hib
    public final Bundle f81294b;

    /* JADX INFO: renamed from: sd3$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC12524b {
    }

    /* JADX INFO: renamed from: sd3$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC12525c {
    }

    public sd3(@efb Intent intent, @hib Bundle bundle) {
        this.f81293a = intent;
        this.f81294b = bundle;
    }

    @efb
    public static pd3 getColorSchemeParams(@efb Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + i);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return pd3.m19425a(null);
        }
        pd3 pd3VarM19425a = pd3.m19425a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(f81263L);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) ? pd3VarM19425a : pd3.m19425a(bundle).m19427c(pd3VarM19425a);
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    @efb
    public static Intent setAlwaysUseBrowserUI(@hib Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f81269c, true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(@efb Intent intent) {
        return intent.getBooleanExtra(f81269c, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void launchUrl(@efb Context context, @efb Uri uri) {
        this.f81293a.setData(uri);
        lx2.startActivity(context, this.f81293a, this.f81294b);
    }

    /* JADX INFO: renamed from: sd3$a */
    public static final class C12523a {

        /* JADX INFO: renamed from: c */
        @hib
        public ArrayList<Bundle> f81297c;

        /* JADX INFO: renamed from: d */
        @hib
        public Bundle f81298d;

        /* JADX INFO: renamed from: e */
        @hib
        public ArrayList<Bundle> f81299e;

        /* JADX INFO: renamed from: f */
        @hib
        public SparseArray<Bundle> f81300f;

        /* JADX INFO: renamed from: g */
        @hib
        public Bundle f81301g;

        /* JADX INFO: renamed from: a */
        public final Intent f81295a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b */
        public final pd3.C10915a f81296b = new pd3.C10915a();

        /* JADX INFO: renamed from: h */
        public int f81302h = 0;

        /* JADX INFO: renamed from: i */
        public boolean f81303i = true;

        public C12523a() {
        }

        private void setSessionParameters(@hib IBinder iBinder, @hib PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, sd3.f81270d, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(sd3.f81271e, pendingIntent);
            }
            this.f81295a.putExtras(bundle);
        }

        @efb
        @Deprecated
        public C12523a addDefaultShareMenuItem() {
            setShareState(1);
            return this;
        }

        @efb
        public C12523a addMenuItem(@efb String str, @efb PendingIntent pendingIntent) {
            if (this.f81297c == null) {
                this.f81297c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(sd3.f81291y, str);
            bundle.putParcelable(sd3.f81288v, pendingIntent);
            this.f81297c.add(bundle);
            return this;
        }

        @efb
        @Deprecated
        public C12523a addToolbarItem(int i, @efb Bitmap bitmap, @efb String str, @efb PendingIntent pendingIntent) throws IllegalStateException {
            if (this.f81299e == null) {
                this.f81299e = new ArrayList<>();
            }
            if (this.f81299e.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(sd3.f81266O, i);
            bundle.putParcelable(sd3.f81286t, bitmap);
            bundle.putString(sd3.f81287u, str);
            bundle.putParcelable(sd3.f81288v, pendingIntent);
            this.f81299e.add(bundle);
            return this;
        }

        @efb
        public sd3 build() {
            if (!this.f81295a.hasExtra(sd3.f81270d)) {
                setSessionParameters(null, null);
            }
            ArrayList<Bundle> arrayList = this.f81297c;
            if (arrayList != null) {
                this.f81295a.putParcelableArrayListExtra(sd3.f81290x, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f81299e;
            if (arrayList2 != null) {
                this.f81295a.putParcelableArrayListExtra(sd3.f81284r, arrayList2);
            }
            this.f81295a.putExtra(sd3.f81262K, this.f81303i);
            this.f81295a.putExtras(this.f81296b.build().m19426b());
            Bundle bundle = this.f81301g;
            if (bundle != null) {
                this.f81295a.putExtras(bundle);
            }
            if (this.f81300f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(sd3.f81263L, this.f81300f);
                this.f81295a.putExtras(bundle2);
            }
            this.f81295a.putExtra(sd3.f81256E, this.f81302h);
            return new sd3(this.f81295a, this.f81298d);
        }

        @efb
        @Deprecated
        public C12523a enableUrlBarHiding() {
            this.f81295a.putExtra(sd3.f81278l, true);
            return this;
        }

        @efb
        public C12523a setActionButton(@efb Bitmap bitmap, @efb String str, @efb PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt(sd3.f81266O, 0);
            bundle.putParcelable(sd3.f81286t, bitmap);
            bundle.putString(sd3.f81287u, str);
            bundle.putParcelable(sd3.f81288v, pendingIntent);
            this.f81295a.putExtra(sd3.f81283q, bundle);
            this.f81295a.putExtra(sd3.f81289w, z);
            return this;
        }

        @efb
        public C12523a setCloseButtonIcon(@efb Bitmap bitmap) {
            this.f81295a.putExtra(sd3.f81279m, bitmap);
            return this;
        }

        @efb
        public C12523a setColorScheme(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f81295a.putExtra(sd3.f81276j, i);
            return this;
        }

        @efb
        public C12523a setColorSchemeParams(int i, @efb pd3 pd3Var) {
            if (i < 0 || i > 2 || i == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i);
            }
            if (this.f81300f == null) {
                this.f81300f = new SparseArray<>();
            }
            this.f81300f.put(i, pd3Var.m19426b());
            return this;
        }

        @efb
        public C12523a setDefaultColorSchemeParams(@efb pd3 pd3Var) {
            this.f81301g = pd3Var.m19426b();
            return this;
        }

        @efb
        @Deprecated
        public C12523a setDefaultShareMenuItemEnabled(boolean z) {
            if (z) {
                setShareState(1);
            } else {
                setShareState(2);
            }
            return this;
        }

        @efb
        public C12523a setExitAnimations(@efb Context context, @InterfaceC12810sw int i, @InterfaceC12810sw int i2) {
            this.f81295a.putExtra(sd3.f81292z, ActivityOptionsCompat.makeCustomAnimation(context, i, i2).toBundle());
            return this;
        }

        @efb
        public C12523a setInstantAppsEnabled(boolean z) {
            this.f81303i = z;
            return this;
        }

        @efb
        @Deprecated
        public C12523a setNavigationBarColor(@g92 int i) {
            this.f81296b.setNavigationBarColor(i);
            return this;
        }

        @efb
        @Deprecated
        public C12523a setNavigationBarDividerColor(@g92 int i) {
            this.f81296b.setNavigationBarDividerColor(i);
            return this;
        }

        @efb
        @p7e({p7e.EnumC10826a.f69934a})
        public C12523a setPendingSession(@efb vd3.C14009b c14009b) {
            setSessionParameters(null, c14009b.m23926b());
            return this;
        }

        @efb
        @Deprecated
        public C12523a setSecondaryToolbarColor(@g92 int i) {
            this.f81296b.setSecondaryToolbarColor(i);
            return this;
        }

        @efb
        public C12523a setSecondaryToolbarViews(@efb RemoteViews remoteViews, @hib int[] iArr, @hib PendingIntent pendingIntent) {
            this.f81295a.putExtra(sd3.f81258G, remoteViews);
            this.f81295a.putExtra(sd3.f81259H, iArr);
            this.f81295a.putExtra(sd3.f81260I, pendingIntent);
            return this;
        }

        @efb
        public C12523a setSession(@efb vd3 vd3Var) {
            this.f81295a.setPackage(vd3Var.m23923b().getPackageName());
            setSessionParameters(vd3Var.m23922a(), vd3Var.m23924c());
            return this;
        }

        @efb
        public C12523a setShareState(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f81302h = i;
            if (i == 1) {
                this.f81295a.putExtra(sd3.f81257F, true);
            } else if (i == 2) {
                this.f81295a.putExtra(sd3.f81257F, false);
            } else {
                this.f81295a.removeExtra(sd3.f81257F);
            }
            return this;
        }

        @efb
        public C12523a setShowTitle(boolean z) {
            this.f81295a.putExtra(sd3.f81280n, z ? 1 : 0);
            return this;
        }

        @efb
        public C12523a setStartAnimations(@efb Context context, @InterfaceC12810sw int i, @InterfaceC12810sw int i2) {
            this.f81298d = ActivityOptionsCompat.makeCustomAnimation(context, i, i2).toBundle();
            return this;
        }

        @efb
        @Deprecated
        public C12523a setToolbarColor(@g92 int i) {
            this.f81296b.setToolbarColor(i);
            return this;
        }

        @efb
        public C12523a setUrlBarHidingEnabled(boolean z) {
            this.f81295a.putExtra(sd3.f81278l, z);
            return this;
        }

        public C12523a(@hib vd3 vd3Var) {
            if (vd3Var != null) {
                setSession(vd3Var);
            }
        }

        @efb
        public C12523a setActionButton(@efb Bitmap bitmap, @efb String str, @efb PendingIntent pendingIntent) {
            return setActionButton(bitmap, str, pendingIntent, false);
        }
    }
}
