package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class k9f {

    /* JADX INFO: renamed from: e */
    @igg({"IntentName"})
    public static final String f53376e = "androidx.browser.trusted.sharing.KEY_ACTION";

    /* JADX INFO: renamed from: f */
    public static final String f53377f = "androidx.browser.trusted.sharing.KEY_METHOD";

    /* JADX INFO: renamed from: g */
    public static final String f53378g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";

    /* JADX INFO: renamed from: h */
    public static final String f53379h = "androidx.browser.trusted.sharing.KEY_PARAMS";

    /* JADX INFO: renamed from: i */
    public static final String f53380i = "GET";

    /* JADX INFO: renamed from: j */
    public static final String f53381j = "POST";

    /* JADX INFO: renamed from: k */
    public static final String f53382k = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: l */
    public static final String f53383l = "multipart/form-data";

    /* JADX INFO: renamed from: a */
    @efb
    public final String f53384a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f53385b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f53386c;

    /* JADX INFO: renamed from: d */
    @efb
    public final C8260c f53387d;

    /* JADX INFO: renamed from: k9f$a */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC8258a {
    }

    /* JADX INFO: renamed from: k9f$b */
    public static final class C8259b {

        /* JADX INFO: renamed from: c */
        public static final String f53388c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";

        /* JADX INFO: renamed from: d */
        public static final String f53389d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";

        /* JADX INFO: renamed from: a */
        @efb
        public final String f53390a;

        /* JADX INFO: renamed from: b */
        @efb
        public final List<String> f53391b;

        public C8259b(@efb String str, @efb List<String> list) {
            this.f53390a = str;
            this.f53391b = Collections.unmodifiableList(list);
        }

        @hib
        /* JADX INFO: renamed from: a */
        public static C8259b m14620a(@hib Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f53388c);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f53389d);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new C8259b(string, stringArrayList);
        }

        @efb
        /* JADX INFO: renamed from: b */
        public Bundle m14621b() {
            Bundle bundle = new Bundle();
            bundle.putString(f53388c, this.f53390a);
            bundle.putStringArrayList(f53389d, new ArrayList<>(this.f53391b));
            return bundle;
        }
    }

    /* JADX INFO: renamed from: k9f$c */
    public static class C8260c {

        /* JADX INFO: renamed from: d */
        public static final String f53392d = "androidx.browser.trusted.sharing.KEY_TITLE";

        /* JADX INFO: renamed from: e */
        public static final String f53393e = "androidx.browser.trusted.sharing.KEY_TEXT";

        /* JADX INFO: renamed from: f */
        public static final String f53394f = "androidx.browser.trusted.sharing.KEY_FILES";

        /* JADX INFO: renamed from: a */
        @hib
        public final String f53395a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f53396b;

        /* JADX INFO: renamed from: c */
        @hib
        public final List<C8259b> f53397c;

        public C8260c(@hib String str, @hib String str2, @hib List<C8259b> list) {
            this.f53395a = str;
            this.f53396b = str2;
            this.f53397c = list;
        }

        @hib
        /* JADX INFO: renamed from: a */
        public static C8260c m14622a(@hib Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f53394f);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C8259b.m14620a((Bundle) it.next()));
                }
            }
            return new C8260c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @efb
        /* JADX INFO: renamed from: b */
        public Bundle m14623b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f53395a);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f53396b);
            if (this.f53397c != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator<C8259b> it = this.f53397c.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m14621b());
                }
                bundle.putParcelableArrayList(f53394f, arrayList);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: k9f$d */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC8261d {
    }

    public k9f(@efb String str, @hib String str2, @hib String str3, @efb C8260c c8260c) {
        this.f53384a = str;
        this.f53385b = str2;
        this.f53386c = str3;
        this.f53387d = c8260c;
    }

    @hib
    public static k9f fromBundle(@efb Bundle bundle) {
        String string = bundle.getString(f53376e);
        String string2 = bundle.getString(f53377f);
        String string3 = bundle.getString(f53378g);
        C8260c c8260cM14622a = C8260c.m14622a(bundle.getBundle(f53379h));
        if (string == null || c8260cM14622a == null) {
            return null;
        }
        return new k9f(string, string2, string3, c8260cM14622a);
    }

    @efb
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(f53376e, this.f53384a);
        bundle.putString(f53377f, this.f53385b);
        bundle.putString(f53378g, this.f53386c);
        bundle.putBundle(f53379h, this.f53387d.m14623b());
        return bundle;
    }
}
