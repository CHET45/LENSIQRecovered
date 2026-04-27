package p000;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.q88;

/* JADX INFO: loaded from: classes.dex */
public class q88 {

    /* JADX INFO: renamed from: p */
    public static final String f73545p = "IntentSanitizer";

    /* JADX INFO: renamed from: a */
    public int f73546a;

    /* JADX INFO: renamed from: b */
    public o8d<String> f73547b;

    /* JADX INFO: renamed from: c */
    public o8d<Uri> f73548c;

    /* JADX INFO: renamed from: d */
    public o8d<String> f73549d;

    /* JADX INFO: renamed from: e */
    public o8d<String> f73550e;

    /* JADX INFO: renamed from: f */
    public o8d<String> f73551f;

    /* JADX INFO: renamed from: g */
    public o8d<ComponentName> f73552g;

    /* JADX INFO: renamed from: h */
    public boolean f73553h;

    /* JADX INFO: renamed from: i */
    public Map<String, o8d<Object>> f73554i;

    /* JADX INFO: renamed from: j */
    public boolean f73555j;

    /* JADX INFO: renamed from: k */
    public o8d<Uri> f73556k;

    /* JADX INFO: renamed from: l */
    public o8d<ClipData> f73557l;

    /* JADX INFO: renamed from: m */
    public boolean f73558m;

    /* JADX INFO: renamed from: n */
    public boolean f73559n;

    /* JADX INFO: renamed from: o */
    public boolean f73560o;

    /* JADX INFO: renamed from: q88$b */
    @c5e(29)
    public static class C11365b {
        private C11365b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static String m20144a(Intent intent) {
            return intent.getIdentifier();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Intent m20145b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* JADX INFO: renamed from: q88$c */
    @c5e(31)
    public static class C11366c {
        private C11366c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m20146a(int i, ClipData.Item item, vu2<String> vu2Var) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            vu2Var.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        }
    }

    /* JADX INFO: renamed from: q88$d */
    public static final class C11367d {

        /* JADX INFO: renamed from: q */
        public static final int f73561q = 2112614400;

        /* JADX INFO: renamed from: r */
        public static final int f73562r = 2015363072;

        /* JADX INFO: renamed from: a */
        public int f73563a;

        /* JADX INFO: renamed from: h */
        public boolean f73570h;

        /* JADX INFO: renamed from: i */
        public boolean f73571i;

        /* JADX INFO: renamed from: n */
        public boolean f73576n;

        /* JADX INFO: renamed from: o */
        public boolean f73577o;

        /* JADX INFO: renamed from: p */
        public boolean f73578p;

        /* JADX INFO: renamed from: b */
        public o8d<String> f73564b = new o8d() { // from class: b98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$0((String) obj);
            }
        };

        /* JADX INFO: renamed from: c */
        public o8d<Uri> f73565c = new o8d() { // from class: c98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$1((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: d */
        public o8d<String> f73566d = new o8d() { // from class: d98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$2((String) obj);
            }
        };

        /* JADX INFO: renamed from: e */
        public o8d<String> f73567e = new o8d() { // from class: e98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$3((String) obj);
            }
        };

        /* JADX INFO: renamed from: f */
        public o8d<String> f73568f = new o8d() { // from class: f98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$4((String) obj);
            }
        };

        /* JADX INFO: renamed from: g */
        public o8d<ComponentName> f73569g = new o8d() { // from class: g98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$5((ComponentName) obj);
            }
        };

        /* JADX INFO: renamed from: j */
        public Map<String, o8d<Object>> f73572j = new HashMap();

        /* JADX INFO: renamed from: k */
        public boolean f73573k = false;

        /* JADX INFO: renamed from: l */
        public o8d<Uri> f73574l = new o8d() { // from class: h98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$6((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: m */
        public o8d<ClipData> f73575m = new o8d() { // from class: i98
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return q88.C11367d.lambda$new$7((ClipData) obj);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowAnyComponent$10(ComponentName componentName) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowClipDataUriWithAuthority$11(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowComponentWithPackage$9(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowDataWithAuthority$8(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtra$12(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtra$13(Class cls, o8d o8dVar, Object obj) {
            return cls.isInstance(obj) && o8dVar.test(cls.cast(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtra$14(Object obj) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtraOutput$16(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtraStreamUriWithAuthority$15(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$1(Uri uri) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$2(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$3(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$4(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$5(ComponentName componentName) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$6(Uri uri) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$7(ClipData clipData) {
            return false;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowAction(@efb String str) {
            z7d.checkNotNull(str);
            Objects.requireNonNull(str);
            allowAction(new s88(str));
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowAnyComponent() {
            this.f73570h = true;
            this.f73569g = new o8d() { // from class: x88
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowAnyComponent$10((ComponentName) obj);
                }
            };
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowCategory(@efb String str) {
            z7d.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowCategory(new s88(str));
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowClipData(@efb o8d<ClipData> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73575m = this.f73575m.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowClipDataText() {
            this.f73573k = true;
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowClipDataUri(@efb o8d<Uri> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73574l = this.f73574l.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowClipDataUriWithAuthority(@efb final String str) {
            z7d.checkNotNull(str);
            return allowClipDataUri(new o8d() { // from class: y88
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowClipDataUriWithAuthority$11(str, (Uri) obj);
                }
            });
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowComponent(@efb final ComponentName componentName) {
            z7d.checkNotNull(componentName);
            Objects.requireNonNull(componentName);
            return allowComponent(new o8d() { // from class: w88
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowComponentWithPackage(@efb final String str) {
            z7d.checkNotNull(str);
            return allowComponent(new o8d() { // from class: t88
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowComponentWithPackage$9(str, (ComponentName) obj);
                }
            });
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowData(@efb o8d<Uri> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73565c = this.f73565c.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowDataWithAuthority(@efb final String str) {
            z7d.checkNotNull(str);
            allowData(new o8d() { // from class: u88
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowDataWithAuthority$8(str, (Uri) obj);
                }
            });
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowExtra(@efb String str, @efb Class<?> cls) {
            return allowExtra(str, cls, new o8d() { // from class: j98
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowExtra$12(obj);
                }
            });
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowExtraOutput(@efb final String str) {
            allowExtra("output", Uri.class, new o8d() { // from class: r88
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowExtraOutput$16(str, (Uri) obj);
                }
            });
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowExtraStream(@efb o8d<Uri> o8dVar) {
            allowExtra("android.intent.extra.STREAM", Uri.class, o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowExtraStreamUriWithAuthority(@efb final String str) {
            z7d.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", Uri.class, new o8d() { // from class: a98
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowExtraStreamUriWithAuthority$15(str, (Uri) obj);
                }
            });
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowFlags(int i) {
            this.f73563a = i | this.f73563a;
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowHistoryStackFlags() {
            this.f73563a |= f73561q;
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowIdentifier() {
            this.f73576n = true;
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowPackage(@efb String str) {
            z7d.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowPackage(new s88(str));
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowReceiverFlags() {
            this.f73563a |= f73562r;
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowSelector() {
            this.f73577o = true;
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowSourceBounds() {
            this.f73578p = true;
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowType(@efb String str) {
            z7d.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowType(new s88(str));
        }

        @efb
        public q88 build() {
            boolean z = this.f73570h;
            if ((z && this.f73571i) || (!z && !this.f73571i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            q88 q88Var = new q88();
            q88Var.f73546a = this.f73563a;
            q88Var.f73547b = this.f73564b;
            q88Var.f73548c = this.f73565c;
            q88Var.f73549d = this.f73566d;
            q88Var.f73550e = this.f73567e;
            q88Var.f73551f = this.f73568f;
            q88Var.f73553h = this.f73570h;
            q88Var.f73552g = this.f73569g;
            q88Var.f73554i = this.f73572j;
            q88Var.f73555j = this.f73573k;
            q88Var.f73556k = this.f73574l;
            q88Var.f73557l = this.f73575m;
            q88Var.f73558m = this.f73576n;
            q88Var.f73559n = this.f73577o;
            q88Var.f73560o = this.f73578p;
            return q88Var;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public <T> C11367d allowExtra(@efb String str, @efb final Class<T> cls, @efb final o8d<T> o8dVar) {
            z7d.checkNotNull(str);
            z7d.checkNotNull(cls);
            z7d.checkNotNull(o8dVar);
            return allowExtra(str, new o8d() { // from class: v88
                @Override // p000.o8d
                public final boolean test(Object obj) {
                    return q88.C11367d.lambda$allowExtra$13(cls, o8dVar, obj);
                }
            });
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowExtraOutput(@efb o8d<Uri> o8dVar) {
            allowExtra("output", Uri.class, o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowAction(@efb o8d<String> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73564b = this.f73564b.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowCategory(@efb o8d<String> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73567e = this.f73567e.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowComponent(@efb o8d<ComponentName> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73571i = true;
            this.f73569g = this.f73569g.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowPackage(@efb o8d<String> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73568f = this.f73568f.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowType(@efb o8d<String> o8dVar) {
            z7d.checkNotNull(o8dVar);
            this.f73566d = this.f73566d.m18418or(o8dVar);
            return this;
        }

        @efb
        @igg({"BuilderSetStyle"})
        public C11367d allowExtra(@efb String str, @efb o8d<Object> o8dVar) {
            z7d.checkNotNull(str);
            z7d.checkNotNull(o8dVar);
            o8d<Object> o8dVar2 = this.f73572j.get(str);
            if (o8dVar2 == null) {
                o8dVar2 = new o8d() { // from class: z88
                    @Override // p000.o8d
                    public final boolean test(Object obj) {
                        return q88.C11367d.lambda$allowExtra$14(obj);
                    }
                };
            }
            this.f73572j.put(str, o8dVar2.m18418or(o8dVar));
            return this;
        }
    }

    private static void checkOtherMembers(int i, ClipData.Item item, vu2<String> vu2Var) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        vu2Var.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sanitizeByFiltering$0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sanitizeByThrowing$1(String str) {
        throw new SecurityException(str);
    }

    private void putExtra(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else {
            if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
                return;
            }
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m20143r(@p000.efb android.content.Intent r7, android.content.Intent r8, p000.o8d<android.content.ClipData> r9, boolean r10, p000.o8d<android.net.Uri> r11, p000.vu2<java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q88.m20143r(android.content.Intent, android.content.Intent, o8d, boolean, o8d, vu2):void");
    }

    @efb
    public Intent sanitize(@efb Intent intent, @efb vu2<String> vu2Var) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f73553h && component == null) || this.f73552g.test(component)) {
            intent2.setComponent(component);
        } else {
            vu2Var.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.f73551f.test(str)) {
            intent2.setPackage(str);
        } else {
            vu2Var.accept("Package is not allowed: " + str);
        }
        int flags = this.f73546a | intent.getFlags();
        int i = this.f73546a;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            vu2Var.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f73546a)));
        }
        String action = intent.getAction();
        if (action == null || this.f73547b.test(action)) {
            intent2.setAction(action);
        } else {
            vu2Var.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.f73548c.test(data)) {
            intent2.setData(data);
        } else {
            vu2Var.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f73549d.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            vu2Var.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f73550e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    vu2Var.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f73546a & 1) == 0) {
                    vu2Var.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.f73546a) & 3) == 0) {
                    Object obj = extras.get(str3);
                    o8d<Object> o8dVar = this.f73554i.get(str3);
                    if (o8dVar == null || !o8dVar.test(obj)) {
                        vu2Var.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        putExtra(intent2, str3, obj);
                    }
                } else {
                    vu2Var.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        m20143r(intent, intent2, this.f73557l, this.f73555j, this.f73556k, vu2Var);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f73558m) {
                C11365b.m20145b(intent2, C11365b.m20144a(intent));
            } else if (C11365b.m20144a(intent) != null) {
                vu2Var.accept("Identifier is not allowed: " + C11365b.m20144a(intent));
            }
        }
        if (this.f73559n) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            vu2Var.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.f73560o) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            vu2Var.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @efb
    public Intent sanitizeByFiltering(@efb Intent intent) {
        return sanitize(intent, new vu2() { // from class: p88
            @Override // p000.vu2
            public final void accept(Object obj) {
                q88.lambda$sanitizeByFiltering$0((String) obj);
            }
        });
    }

    @efb
    public Intent sanitizeByThrowing(@efb Intent intent) {
        return sanitize(intent, new vu2() { // from class: o88
            @Override // p000.vu2
            public final void accept(Object obj) {
                q88.lambda$sanitizeByThrowing$1((String) obj);
            }
        });
    }

    private q88() {
    }
}
