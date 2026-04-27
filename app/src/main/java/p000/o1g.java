package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class o1g {

    /* JADX INFO: renamed from: a */
    public static final String f66252a = "sub_intent_key";

    /* JADX INFO: renamed from: o1g$b */
    public interface InterfaceC10142b {
        void startActivity(@efb Intent intent);

        void startActivityForResult(@efb Intent intent, int i);
    }

    /* JADX INFO: renamed from: o1g$c */
    public static class C10143c implements InterfaceC10142b {

        /* JADX INFO: renamed from: a */
        public final Activity f66253a;

        @Override // p000.o1g.InterfaceC10142b
        public void startActivity(@efb Intent intent) {
            this.f66253a.startActivity(intent);
        }

        @Override // p000.o1g.InterfaceC10142b
        public void startActivityForResult(@efb Intent intent, int i) {
            this.f66253a.startActivityForResult(intent, i);
        }

        private C10143c(@efb Activity activity) {
            this.f66253a = activity;
        }
    }

    /* JADX INFO: renamed from: o1g$d */
    public static class C10144d implements InterfaceC10142b {

        /* JADX INFO: renamed from: a */
        public final Context f66254a;

        @Override // p000.o1g.InterfaceC10142b
        public void startActivity(@efb Intent intent) {
            this.f66254a.startActivity(intent);
        }

        @Override // p000.o1g.InterfaceC10142b
        public void startActivityForResult(@efb Intent intent, int i) {
            Activity activityM20486j = qpc.m20486j(this.f66254a);
            if (activityM20486j != null) {
                activityM20486j.startActivityForResult(intent, i);
            } else {
                startActivity(intent);
            }
        }

        private C10144d(@efb Context context) {
            this.f66254a = context;
        }
    }

    /* JADX INFO: renamed from: o1g$e */
    public static class C10145e implements InterfaceC10142b {

        /* JADX INFO: renamed from: a */
        public final Fragment f66255a;

        @Override // p000.o1g.InterfaceC10142b
        public void startActivity(@efb Intent intent) {
            this.f66255a.startActivity(intent);
        }

        @Override // p000.o1g.InterfaceC10142b
        public void startActivityForResult(@efb Intent intent, int i) {
            this.f66255a.startActivityForResult(intent, i);
        }

        private C10145e(@efb Fragment fragment) {
            this.f66255a = fragment;
        }
    }

    /* JADX INFO: renamed from: o1g$f */
    public static class C10146f implements InterfaceC10142b {

        /* JADX INFO: renamed from: a */
        public final androidx.fragment.app.Fragment f66256a;

        @Override // p000.o1g.InterfaceC10142b
        public void startActivity(@efb Intent intent) {
            this.f66256a.startActivity(intent);
        }

        @Override // p000.o1g.InterfaceC10142b
        public void startActivityForResult(@efb Intent intent, int i) {
            this.f66256a.startActivityForResult(intent, i);
        }

        private C10146f(@efb androidx.fragment.app.Fragment fragment) {
            this.f66256a = fragment;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m18258a(@hib Intent intent, @hib Intent intent2) {
        if (intent == null && intent2 != null) {
            return intent2;
        }
        if (intent2 == null) {
            return intent;
        }
        m18259b(intent).putExtra(f66252a, intent2);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m18259b(@efb Intent intent) {
        Intent intentM18260c = m18260c(intent);
        return intentM18260c != null ? m18259b(intentM18260c) : intent;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m18260c(@efb Intent intent) {
        return C5487ew.m10310f() ? (Intent) intent.getParcelableExtra(f66252a, Intent.class) : (Intent) intent.getParcelableExtra(f66252a);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18261d(@efb InterfaceC10142b interfaceC10142b, @efb Intent intent) {
        try {
            interfaceC10142b.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Intent intentM18260c = m18260c(intent);
            if (intentM18260c == null) {
                return false;
            }
            return m18261d(interfaceC10142b, intentM18260c);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18262e(@efb Activity activity, Intent intent) {
        return m18261d(new C10143c(activity), intent);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18263f(@efb Fragment fragment, Intent intent) {
        return m18261d(new C10145e(fragment), intent);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18264g(@efb Context context, Intent intent) {
        return m18261d(new C10144d(context), intent);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18265h(@efb androidx.fragment.app.Fragment fragment, Intent intent) {
        return m18261d(new C10146f(fragment), intent);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18266i(@efb InterfaceC10142b interfaceC10142b, @efb Intent intent, int i) {
        try {
            interfaceC10142b.startActivityForResult(intent, i);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Intent intentM18260c = m18260c(intent);
            if (intentM18260c == null) {
                return false;
            }
            return m18266i(interfaceC10142b, intentM18260c, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18267j(@efb Activity activity, @efb Intent intent, int i) {
        return m18266i(new C10143c(activity), intent, i);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m18268k(@efb Fragment fragment, @efb Intent intent, int i) {
        return m18266i(new C10145e(fragment), intent, i);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m18269l(@efb androidx.fragment.app.Fragment fragment, @efb Intent intent, int i) {
        return m18266i(new C10146f(fragment), intent, i);
    }
}
