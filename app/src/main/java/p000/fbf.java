package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class fbf {

    /* JADX INFO: renamed from: C */
    public static final String f36021C = "extraPersonCount";

    /* JADX INFO: renamed from: D */
    public static final String f36022D = "extraPerson_";

    /* JADX INFO: renamed from: E */
    public static final String f36023E = "extraLocusId";

    /* JADX INFO: renamed from: F */
    public static final String f36024F = "extraLongLived";

    /* JADX INFO: renamed from: G */
    public static final String f36025G = "extraSliceUri";

    /* JADX INFO: renamed from: H */
    public static final int f36026H = 1;

    /* JADX INFO: renamed from: A */
    public int f36027A;

    /* JADX INFO: renamed from: B */
    public int f36028B;

    /* JADX INFO: renamed from: a */
    public Context f36029a;

    /* JADX INFO: renamed from: b */
    public String f36030b;

    /* JADX INFO: renamed from: c */
    public String f36031c;

    /* JADX INFO: renamed from: d */
    public Intent[] f36032d;

    /* JADX INFO: renamed from: e */
    public ComponentName f36033e;

    /* JADX INFO: renamed from: f */
    public CharSequence f36034f;

    /* JADX INFO: renamed from: g */
    public CharSequence f36035g;

    /* JADX INFO: renamed from: h */
    public CharSequence f36036h;

    /* JADX INFO: renamed from: i */
    public IconCompat f36037i;

    /* JADX INFO: renamed from: j */
    public boolean f36038j;

    /* JADX INFO: renamed from: k */
    public Person[] f36039k;

    /* JADX INFO: renamed from: l */
    public Set<String> f36040l;

    /* JADX INFO: renamed from: m */
    @hib
    public wh9 f36041m;

    /* JADX INFO: renamed from: n */
    public boolean f36042n;

    /* JADX INFO: renamed from: o */
    public int f36043o;

    /* JADX INFO: renamed from: p */
    public PersistableBundle f36044p;

    /* JADX INFO: renamed from: q */
    public Bundle f36045q;

    /* JADX INFO: renamed from: r */
    public long f36046r;

    /* JADX INFO: renamed from: s */
    public UserHandle f36047s;

    /* JADX INFO: renamed from: t */
    public boolean f36048t;

    /* JADX INFO: renamed from: u */
    public boolean f36049u;

    /* JADX INFO: renamed from: v */
    public boolean f36050v;

    /* JADX INFO: renamed from: w */
    public boolean f36051w;

    /* JADX INFO: renamed from: x */
    public boolean f36052x;

    /* JADX INFO: renamed from: y */
    public boolean f36053y = true;

    /* JADX INFO: renamed from: z */
    public boolean f36054z;

    /* JADX INFO: renamed from: fbf$a */
    @c5e(33)
    public static class C5713a {
        private C5713a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m10805a(@efb ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    /* JADX INFO: renamed from: fbf$b */
    public static class C5714b {

        /* JADX INFO: renamed from: a */
        public final fbf f36055a;

        /* JADX INFO: renamed from: b */
        public boolean f36056b;

        /* JADX INFO: renamed from: c */
        public Set<String> f36057c;

        /* JADX INFO: renamed from: d */
        public Map<String, Map<String, List<String>>> f36058d;

        /* JADX INFO: renamed from: e */
        public Uri f36059e;

        public C5714b(@efb Context context, @efb String str) {
            fbf fbfVar = new fbf();
            this.f36055a = fbfVar;
            fbfVar.f36029a = context;
            fbfVar.f36030b = str;
        }

        @efb
        @igg({"MissingGetterMatchingBuilder"})
        public C5714b addCapabilityBinding(@efb String str) {
            if (this.f36057c == null) {
                this.f36057c = new HashSet();
            }
            this.f36057c.add(str);
            return this;
        }

        @efb
        public fbf build() {
            if (TextUtils.isEmpty(this.f36055a.f36034f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            fbf fbfVar = this.f36055a;
            Intent[] intentArr = fbfVar.f36032d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f36056b) {
                if (fbfVar.f36041m == null) {
                    fbfVar.f36041m = new wh9(fbfVar.f36030b);
                }
                this.f36055a.f36042n = true;
            }
            if (this.f36057c != null) {
                fbf fbfVar2 = this.f36055a;
                if (fbfVar2.f36040l == null) {
                    fbfVar2.f36040l = new HashSet();
                }
                this.f36055a.f36040l.addAll(this.f36057c);
            }
            if (this.f36058d != null) {
                fbf fbfVar3 = this.f36055a;
                if (fbfVar3.f36044p == null) {
                    fbfVar3.f36044p = new PersistableBundle();
                }
                for (String str : this.f36058d.keySet()) {
                    Map<String, List<String>> map = this.f36058d.get(str);
                    this.f36055a.f36044p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f36055a.f36044p.putStringArray(str + pj4.f71071b + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f36059e != null) {
                fbf fbfVar4 = this.f36055a;
                if (fbfVar4.f36044p == null) {
                    fbfVar4.f36044p = new PersistableBundle();
                }
                this.f36055a.f36044p.putString(fbf.f36025G, vxh.toSafeString(this.f36059e));
            }
            return this.f36055a;
        }

        @efb
        public C5714b setActivity(@efb ComponentName componentName) {
            this.f36055a.f36033e = componentName;
            return this;
        }

        @efb
        public C5714b setAlwaysBadged() {
            this.f36055a.f36038j = true;
            return this;
        }

        @efb
        public C5714b setCategories(@efb Set<String> set) {
            g70 g70Var = new g70();
            g70Var.addAll(set);
            this.f36055a.f36040l = g70Var;
            return this;
        }

        @efb
        public C5714b setDisabledMessage(@efb CharSequence charSequence) {
            this.f36055a.f36036h = charSequence;
            return this;
        }

        @efb
        public C5714b setExcludedFromSurfaces(int i) {
            this.f36055a.f36028B = i;
            return this;
        }

        @efb
        public C5714b setExtras(@efb PersistableBundle persistableBundle) {
            this.f36055a.f36044p = persistableBundle;
            return this;
        }

        @efb
        public C5714b setIcon(IconCompat iconCompat) {
            this.f36055a.f36037i = iconCompat;
            return this;
        }

        @efb
        public C5714b setIntent(@efb Intent intent) {
            return setIntents(new Intent[]{intent});
        }

        @efb
        public C5714b setIntents(@efb Intent[] intentArr) {
            this.f36055a.f36032d = intentArr;
            return this;
        }

        @efb
        public C5714b setIsConversation() {
            this.f36056b = true;
            return this;
        }

        @efb
        public C5714b setLocusId(@hib wh9 wh9Var) {
            this.f36055a.f36041m = wh9Var;
            return this;
        }

        @efb
        public C5714b setLongLabel(@efb CharSequence charSequence) {
            this.f36055a.f36035g = charSequence;
            return this;
        }

        @efb
        @Deprecated
        public C5714b setLongLived() {
            this.f36055a.f36042n = true;
            return this;
        }

        @efb
        public C5714b setPerson(@efb Person person) {
            return setPersons(new Person[]{person});
        }

        @efb
        public C5714b setPersons(@efb Person[] personArr) {
            this.f36055a.f36039k = personArr;
            return this;
        }

        @efb
        public C5714b setRank(int i) {
            this.f36055a.f36043o = i;
            return this;
        }

        @efb
        public C5714b setShortLabel(@efb CharSequence charSequence) {
            this.f36055a.f36034f = charSequence;
            return this;
        }

        @efb
        @igg({"MissingGetterMatchingBuilder"})
        public C5714b setSliceUri(@efb Uri uri) {
            this.f36059e = uri;
            return this;
        }

        @efb
        @p7e({p7e.EnumC10826a.f69936c})
        public C5714b setTransientExtras(@efb Bundle bundle) {
            this.f36055a.f36045q = (Bundle) z7d.checkNotNull(bundle);
            return this;
        }

        @efb
        public C5714b setLongLived(boolean z) {
            this.f36055a.f36042n = z;
            return this;
        }

        @efb
        @igg({"MissingGetterMatchingBuilder"})
        public C5714b addCapabilityBinding(@efb String str, @efb String str2, @efb List<String> list) {
            addCapabilityBinding(str);
            if (!list.isEmpty()) {
                if (this.f36058d == null) {
                    this.f36058d = new HashMap();
                }
                if (this.f36058d.get(str) == null) {
                    this.f36058d.put(str, new HashMap());
                }
                this.f36058d.get(str).put(str2, list);
            }
            return this;
        }

        @p7e({p7e.EnumC10826a.f69936c})
        public C5714b(@efb fbf fbfVar) {
            fbf fbfVar2 = new fbf();
            this.f36055a = fbfVar2;
            fbfVar2.f36029a = fbfVar.f36029a;
            fbfVar2.f36030b = fbfVar.f36030b;
            fbfVar2.f36031c = fbfVar.f36031c;
            Intent[] intentArr = fbfVar.f36032d;
            fbfVar2.f36032d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            fbfVar2.f36033e = fbfVar.f36033e;
            fbfVar2.f36034f = fbfVar.f36034f;
            fbfVar2.f36035g = fbfVar.f36035g;
            fbfVar2.f36036h = fbfVar.f36036h;
            fbfVar2.f36027A = fbfVar.f36027A;
            fbfVar2.f36037i = fbfVar.f36037i;
            fbfVar2.f36038j = fbfVar.f36038j;
            fbfVar2.f36047s = fbfVar.f36047s;
            fbfVar2.f36046r = fbfVar.f36046r;
            fbfVar2.f36048t = fbfVar.f36048t;
            fbfVar2.f36049u = fbfVar.f36049u;
            fbfVar2.f36050v = fbfVar.f36050v;
            fbfVar2.f36051w = fbfVar.f36051w;
            fbfVar2.f36052x = fbfVar.f36052x;
            fbfVar2.f36053y = fbfVar.f36053y;
            fbfVar2.f36041m = fbfVar.f36041m;
            fbfVar2.f36042n = fbfVar.f36042n;
            fbfVar2.f36054z = fbfVar.f36054z;
            fbfVar2.f36043o = fbfVar.f36043o;
            Person[] personArr = fbfVar.f36039k;
            if (personArr != null) {
                fbfVar2.f36039k = (Person[]) Arrays.copyOf(personArr, personArr.length);
            }
            if (fbfVar.f36040l != null) {
                fbfVar2.f36040l = new HashSet(fbfVar.f36040l);
            }
            PersistableBundle persistableBundle = fbfVar.f36044p;
            if (persistableBundle != null) {
                fbfVar2.f36044p = persistableBundle;
            }
            fbfVar2.f36028B = fbfVar.f36028B;
        }

        @c5e(25)
        @p7e({p7e.EnumC10826a.f69936c})
        public C5714b(@efb Context context, @efb ShortcutInfo shortcutInfo) {
            fbf fbfVar = new fbf();
            this.f36055a = fbfVar;
            fbfVar.f36029a = context;
            fbfVar.f36030b = shortcutInfo.getId();
            fbfVar.f36031c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            fbfVar.f36032d = (Intent[]) Arrays.copyOf(intents, intents.length);
            fbfVar.f36033e = shortcutInfo.getActivity();
            fbfVar.f36034f = shortcutInfo.getShortLabel();
            fbfVar.f36035g = shortcutInfo.getLongLabel();
            fbfVar.f36036h = shortcutInfo.getDisabledMessage();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                fbfVar.f36027A = shortcutInfo.getDisabledReason();
            } else {
                fbfVar.f36027A = shortcutInfo.isEnabled() ? 0 : 3;
            }
            fbfVar.f36040l = shortcutInfo.getCategories();
            fbfVar.f36039k = fbf.m10803e(shortcutInfo.getExtras());
            fbfVar.f36047s = shortcutInfo.getUserHandle();
            fbfVar.f36046r = shortcutInfo.getLastChangedTimestamp();
            if (i >= 30) {
                fbfVar.f36048t = shortcutInfo.isCached();
            }
            fbfVar.f36049u = shortcutInfo.isDynamic();
            fbfVar.f36050v = shortcutInfo.isPinned();
            fbfVar.f36051w = shortcutInfo.isDeclaredInManifest();
            fbfVar.f36052x = shortcutInfo.isImmutable();
            fbfVar.f36053y = shortcutInfo.isEnabled();
            fbfVar.f36054z = shortcutInfo.hasKeyFieldsOnly();
            fbfVar.f36041m = fbf.m10801c(shortcutInfo);
            fbfVar.f36043o = shortcutInfo.getRank();
            fbfVar.f36044p = shortcutInfo.getExtras();
        }
    }

    /* JADX INFO: renamed from: fbf$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC5715c {
    }

    @c5e(25)
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: b */
    public static List<fbf> m10800b(@efb Context context, @efb List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5714b(context, it.next()).build());
        }
        return arrayList;
    }

    @c5e(22)
    @p7e({p7e.EnumC10826a.f69936c})
    private PersistableBundle buildLegacyExtrasBundle() {
        if (this.f36044p == null) {
            this.f36044p = new PersistableBundle();
        }
        Person[] personArr = this.f36039k;
        if (personArr != null && personArr.length > 0) {
            this.f36044p.putInt(f36021C, personArr.length);
            int i = 0;
            while (i < this.f36039k.length) {
                PersistableBundle persistableBundle = this.f36044p;
                StringBuilder sb = new StringBuilder();
                sb.append(f36022D);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.f36039k[i].toPersistableBundle());
                i = i2;
            }
        }
        wh9 wh9Var = this.f36041m;
        if (wh9Var != null) {
            this.f36044p.putString(f36023E, wh9Var.getId());
        }
        this.f36044p.putBoolean(f36024F, this.f36042n);
        return this.f36044p;
    }

    @c5e(25)
    @hib
    /* JADX INFO: renamed from: c */
    public static wh9 m10801c(@efb ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return getLocusIdFromExtra(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return wh9.toLocusIdCompat(shortcutInfo.getLocusId());
    }

    @c5e(25)
    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: d */
    public static boolean m10802d(@hib PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f36024F)) {
            return false;
        }
        return persistableBundle.getBoolean(f36024F);
    }

    @c5e(25)
    @hib
    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: e */
    public static Person[] m10803e(@efb PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f36021C)) {
            return null;
        }
        int i = persistableBundle.getInt(f36021C);
        Person[] personArr = new Person[i];
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append(f36022D);
            int i3 = i2 + 1;
            sb.append(i3);
            personArr[i2] = Person.fromPersistableBundle(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return personArr;
    }

    @c5e(25)
    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    private static wh9 getLocusIdFromExtra(@hib PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(f36023E)) == null) {
            return null;
        }
        return new wh9(string);
    }

    /* JADX INFO: renamed from: a */
    public Intent m10804a(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f36032d[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f36034f.toString());
        if (this.f36037i != null) {
            Drawable activityIcon = null;
            if (this.f36038j) {
                PackageManager packageManager = this.f36029a.getPackageManager();
                ComponentName componentName = this.f36033e;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f36029a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f36037i.addToShortcutIntent(intent, activityIcon, this.f36029a);
        }
        return intent;
    }

    @hib
    public ComponentName getActivity() {
        return this.f36033e;
    }

    @hib
    public Set<String> getCategories() {
        return this.f36040l;
    }

    @hib
    public CharSequence getDisabledMessage() {
        return this.f36036h;
    }

    public int getDisabledReason() {
        return this.f36027A;
    }

    public int getExcludedFromSurfaces() {
        return this.f36028B;
    }

    @hib
    public PersistableBundle getExtras() {
        return this.f36044p;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public IconCompat getIcon() {
        return this.f36037i;
    }

    @efb
    public String getId() {
        return this.f36030b;
    }

    @efb
    public Intent getIntent() {
        return this.f36032d[r0.length - 1];
    }

    @efb
    public Intent[] getIntents() {
        Intent[] intentArr = this.f36032d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long getLastChangedTimestamp() {
        return this.f36046r;
    }

    @hib
    public wh9 getLocusId() {
        return this.f36041m;
    }

    @hib
    public CharSequence getLongLabel() {
        return this.f36035g;
    }

    @efb
    public String getPackage() {
        return this.f36031c;
    }

    public int getRank() {
        return this.f36043o;
    }

    @efb
    public CharSequence getShortLabel() {
        return this.f36034f;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public Bundle getTransientExtras() {
        return this.f36045q;
    }

    @hib
    public UserHandle getUserHandle() {
        return this.f36047s;
    }

    public boolean hasKeyFieldsOnly() {
        return this.f36054z;
    }

    public boolean isCached() {
        return this.f36048t;
    }

    public boolean isDeclaredInManifest() {
        return this.f36051w;
    }

    public boolean isDynamic() {
        return this.f36049u;
    }

    public boolean isEnabled() {
        return this.f36053y;
    }

    public boolean isExcludedFromSurfaces(int i) {
        return (i & this.f36028B) != 0;
    }

    public boolean isImmutable() {
        return this.f36052x;
    }

    public boolean isPinned() {
        return this.f36050v;
    }

    @c5e(25)
    public ShortcutInfo toShortcutInfo() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f36029a, this.f36030b).setShortLabel(this.f36034f).setIntents(this.f36032d);
        IconCompat iconCompat = this.f36037i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon(this.f36029a));
        }
        if (!TextUtils.isEmpty(this.f36035g)) {
            intents.setLongLabel(this.f36035g);
        }
        if (!TextUtils.isEmpty(this.f36036h)) {
            intents.setDisabledMessage(this.f36036h);
        }
        ComponentName componentName = this.f36033e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f36040l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f36043o);
        PersistableBundle persistableBundle = this.f36044p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Person[] personArr = this.f36039k;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.f36039k[i].toAndroidPerson();
                }
                intents.setPersons(personArr2);
            }
            wh9 wh9Var = this.f36041m;
            if (wh9Var != null) {
                intents.setLocusId(wh9Var.toLocusId());
            }
            intents.setLongLived(this.f36042n);
        } else {
            intents.setExtras(buildLegacyExtrasBundle());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C5713a.m10805a(intents, this.f36028B);
        }
        return intents.build();
    }
}
