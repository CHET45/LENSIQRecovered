package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ge1 {

    /* JADX INFO: renamed from: b */
    public static final String f39563b = "BrowserActions";

    /* JADX INFO: renamed from: c */
    public static final String f39564c = "https://www.example.com";

    /* JADX INFO: renamed from: d */
    public static final String f39565d = "androidx.browser.browseractions.APP_ID";

    /* JADX INFO: renamed from: e */
    public static final String f39566e = "androidx.browser.browseractions.browser_action_open";

    /* JADX INFO: renamed from: f */
    public static final String f39567f = "androidx.browser.browseractions.ICON_ID";

    /* JADX INFO: renamed from: g */
    public static final String f39568g = "androidx.browser.browseractions.ICON_URI";

    /* JADX INFO: renamed from: h */
    public static final String f39569h = "androidx.browser.browseractions.TITLE";

    /* JADX INFO: renamed from: i */
    public static final String f39570i = "androidx.browser.browseractions.ACTION";

    /* JADX INFO: renamed from: j */
    public static final String f39571j = "androidx.browser.browseractions.extra.TYPE";

    /* JADX INFO: renamed from: k */
    public static final String f39572k = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: l */
    public static final String f39573l = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";

    /* JADX INFO: renamed from: m */
    @igg({"MinMaxConstant"})
    public static final int f39574m = 5;

    /* JADX INFO: renamed from: n */
    public static final int f39575n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f39576o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f39577p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f39578q = 3;

    /* JADX INFO: renamed from: r */
    public static final int f39579r = 4;

    /* JADX INFO: renamed from: s */
    public static final int f39580s = 5;

    /* JADX INFO: renamed from: t */
    public static final int f39581t = -1;

    /* JADX INFO: renamed from: u */
    public static final int f39582u = 0;

    /* JADX INFO: renamed from: v */
    public static final int f39583v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f39584w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f39585x = 3;

    /* JADX INFO: renamed from: y */
    public static final int f39586y = 4;

    /* JADX INFO: renamed from: z */
    @hib
    public static InterfaceC6267a f39587z;

    /* JADX INFO: renamed from: a */
    @efb
    public final Intent f39588a;

    /* JADX INFO: renamed from: ge1$a */
    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    public interface InterfaceC6267a {
        void onDialogShown();
    }

    /* JADX INFO: renamed from: ge1$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC6268b {
    }

    /* JADX INFO: renamed from: ge1$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC6269c {
    }

    public ge1(@efb Intent intent) {
        this.f39588a = intent;
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: a */
    public static void m11659a(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            openFallbackBrowserActionsMenu(context, intent);
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f39564c)), 65536);
            if (resolveInfoResolveActivity != null) {
                String str = resolveInfoResolveActivity.activityInfo.packageName;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (str.equals(list.get(i).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    }
                    i++;
                }
            }
        }
        lx2.startActivity(context, intent, null);
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: b */
    public static void m11660b(InterfaceC6267a interfaceC6267a) {
        f39587z = interfaceC6267a;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69934a})
    public static List<ResolveInfo> getBrowserActionsIntentHandlers(@efb Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f39566e, Uri.parse(f39564c)), 131072);
    }

    @hib
    @Deprecated
    public static String getCreatorPackageName(@efb Intent intent) {
        return getUntrustedCreatorPackageName(intent);
    }

    @hib
    public static String getUntrustedCreatorPackageName(@efb Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f39565d);
        if (pendingIntent != null) {
            return pendingIntent.getCreatorPackage();
        }
        return null;
    }

    public static void launchIntent(@efb Context context, @efb Intent intent) {
        m11659a(context, intent, getBrowserActionsIntentHandlers(context));
    }

    public static void openBrowserAction(@efb Context context, @efb Uri uri) {
        launchIntent(context, new C6270d(context, uri).build().getIntent());
    }

    private static void openFallbackBrowserActionsMenu(Context context, Intent intent) {
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f39572k);
        openFallbackBrowserActionsMenu(context, data, parcelableArrayListExtra != null ? parseBrowserActionItems(parcelableArrayListExtra) : null);
    }

    @efb
    public static List<ce1> parseBrowserActionItems(@efb ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = arrayList.get(i);
            String string = bundle.getString(f39569h);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f39570i);
            int i2 = bundle.getInt(f39567f);
            Uri uri = (Uri) bundle.getParcelable(f39568g);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(i2 != 0 ? new ce1(string, pendingIntent, i2) : new ce1(string, pendingIntent, uri));
        }
        return arrayList2;
    }

    @efb
    public Intent getIntent() {
        return this.f39588a;
    }

    public static void openBrowserAction(@efb Context context, @efb Uri uri, int i, @efb ArrayList<ce1> arrayList, @efb PendingIntent pendingIntent) {
        launchIntent(context, new C6270d(context, uri).setUrlType(i).setCustomItems(arrayList).setOnItemSelectedAction(pendingIntent).build().getIntent());
    }

    private static void openFallbackBrowserActionsMenu(Context context, Uri uri, List<ce1> list) {
        new fe1(context, uri, list).displayMenu();
        InterfaceC6267a interfaceC6267a = f39587z;
        if (interfaceC6267a != null) {
            interfaceC6267a.onDialogShown();
        }
    }

    /* JADX INFO: renamed from: ge1$d */
    public static final class C6270d {

        /* JADX INFO: renamed from: b */
        public Context f39590b;

        /* JADX INFO: renamed from: c */
        public Uri f39591c;

        /* JADX INFO: renamed from: a */
        public final Intent f39589a = new Intent(ge1.f39566e);

        /* JADX INFO: renamed from: d */
        public int f39592d = 0;

        /* JADX INFO: renamed from: e */
        public ArrayList<Bundle> f39593e = new ArrayList<>();

        /* JADX INFO: renamed from: f */
        @hib
        public PendingIntent f39594f = null;

        /* JADX INFO: renamed from: g */
        public List<Uri> f39595g = new ArrayList();

        public C6270d(@efb Context context, @efb Uri uri) {
            this.f39590b = context;
            this.f39591c = uri;
        }

        @efb
        private Bundle getBundleFromItem(@efb ce1 ce1Var) {
            Bundle bundle = new Bundle();
            bundle.putString(ge1.f39569h, ce1Var.getTitle());
            bundle.putParcelable(ge1.f39570i, ce1Var.getAction());
            if (ce1Var.getIconId() != 0) {
                bundle.putInt(ge1.f39567f, ce1Var.getIconId());
            }
            if (ce1Var.getIconUri() != null) {
                bundle.putParcelable(ge1.f39568g, ce1Var.getIconUri());
            }
            return bundle;
        }

        @efb
        public ge1 build() {
            this.f39589a.setData(this.f39591c);
            this.f39589a.putExtra(ge1.f39571j, this.f39592d);
            this.f39589a.putParcelableArrayListExtra(ge1.f39572k, this.f39593e);
            this.f39589a.putExtra(ge1.f39565d, PendingIntent.getActivity(this.f39590b, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.f39594f;
            if (pendingIntent != null) {
                this.f39589a.putExtra(ge1.f39573l, pendingIntent);
            }
            BrowserServiceFileProvider.grantReadPermission(this.f39589a, this.f39595g, this.f39590b);
            return new ge1(this.f39589a);
        }

        @efb
        public C6270d setCustomItems(@efb ArrayList<ce1> arrayList) {
            if (arrayList.size() > 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (TextUtils.isEmpty(arrayList.get(i).getTitle()) || arrayList.get(i).getAction() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                this.f39593e.add(getBundleFromItem(arrayList.get(i)));
                if (arrayList.get(i).getIconUri() != null) {
                    this.f39595g.add(arrayList.get(i).getIconUri());
                }
            }
            return this;
        }

        @efb
        public C6270d setOnItemSelectedAction(@efb PendingIntent pendingIntent) {
            this.f39594f = pendingIntent;
            return this;
        }

        @efb
        public C6270d setUrlType(int i) {
            this.f39592d = i;
            return this;
        }

        @efb
        public C6270d setCustomItems(@efb ce1... ce1VarArr) {
            return setCustomItems(new ArrayList<>(Arrays.asList(ce1VarArr)));
        }
    }
}
