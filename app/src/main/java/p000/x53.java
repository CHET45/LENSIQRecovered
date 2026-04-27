package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
@dwf({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
public final class x53 {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C14921c f96733h = new C14921c(null);

    /* JADX INFO: renamed from: i */
    @yfb
    public static final String f96734i = "CreateEntry";

    /* JADX INFO: renamed from: j */
    public static final int f96735j = 300;

    /* JADX INFO: renamed from: k */
    @yfb
    public static final String f96736k = "TOTAL_CREDENTIAL_COUNT_TYPE";

    /* JADX INFO: renamed from: l */
    @yfb
    public static final String f96737l = "androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME";

    /* JADX INFO: renamed from: m */
    @yfb
    public static final String f96738m = "androidx.credentials.provider.createEntry.SLICE_HINT_NOTE";

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f96739n = "androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON";

    /* JADX INFO: renamed from: o */
    @yfb
    public static final String f96740o = "androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION";

    /* JADX INFO: renamed from: p */
    @yfb
    public static final String f96741p = "androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    /* JADX INFO: renamed from: q */
    @yfb
    public static final String f96742q = "androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT";

    /* JADX INFO: renamed from: r */
    @yfb
    public static final String f96743r = "androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED";

    /* JADX INFO: renamed from: s */
    @yfb
    public static final String f96744s = "true";

    /* JADX INFO: renamed from: t */
    @yfb
    public static final String f96745t = "false";

    /* JADX INFO: renamed from: u */
    @yfb
    public static final String f96746u = "CreateEntry";

    /* JADX INFO: renamed from: v */
    public static final int f96747v = 1;

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f96748a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final PendingIntent f96749b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Icon f96750c;

    /* JADX INFO: renamed from: d */
    @gib
    public final CharSequence f96751d;

    /* JADX INFO: renamed from: e */
    @gib
    public final Instant f96752e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Map<String, Integer> f96753f;

    /* JADX INFO: renamed from: g */
    public final boolean f96754g;

    /* JADX INFO: renamed from: x53$a */
    @c5e(28)
    @dwf({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,487:1\n1855#2,2:488\n1855#2,2:490\n215#3,2:492\n*S KotlinDebug\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api28Impl\n*L\n347#1:488,2\n388#1:490,2\n404#1:492,2\n*E\n"})
    public static final class C14919a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14919a f96755a = new C14919a();

        private C14919a() {
        }

        @do8
        @yfb
        public static final Map<String, Integer> convertBundleToCredentialCountInfo$credentials_release(@gib Bundle bundle) {
            HashMap map = new HashMap();
            if (bundle == null) {
                return map;
            }
            Set<String> setKeySet = bundle.keySet();
            md8.checkNotNullExpressionValue(setKeySet, "bundle.keySet()");
            for (String str : setKeySet) {
                try {
                    md8.checkNotNullExpressionValue(str, "it");
                    map.put(str, Integer.valueOf(bundle.getInt(str)));
                } catch (Exception e) {
                    Log.i("CreateEntry", "Issue unpacking credential count info bundle: " + e.getMessage());
                }
            }
            return map;
        }

        @do8
        @gib
        public static final Bundle convertCredentialCountInfoToBundle$credentials_release(@yfb Map<String, Integer> map) {
            md8.checkNotNullParameter(map, "credentialCountInformationMap");
            Bundle bundle = new Bundle();
            boolean z = false;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    md8.checkNotNull(value);
                    bundle.putInt(key, value.intValue());
                    z = true;
                }
            }
            if (z) {
                return bundle;
            }
            return null;
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public static final x53 fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<SliceItem> items = slice.getItems();
            md8.checkNotNullExpressionValue(items, "slice.items");
            Map mapAsMutableMap = linkedHashMap;
            CharSequence text = null;
            PendingIntent action = null;
            Icon icon = null;
            CharSequence text2 = null;
            Instant instantOfEpochMilli = null;
            boolean z = false;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(x53.f96737l)) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint(x53.f96739n)) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint(x53.f96742q)) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint(x53.f96740o)) {
                    Map<String, Integer> mapConvertBundleToCredentialCountInfo$credentials_release = convertBundleToCredentialCountInfo$credentials_release(sliceItem.getBundle());
                    md8.checkNotNull(mapConvertBundleToCredentialCountInfo$credentials_release, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Int?>");
                    mapAsMutableMap = qlh.asMutableMap(mapConvertBundleToCredentialCountInfo$credentials_release);
                } else if (sliceItem.hasHint(x53.f96741p)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(x53.f96738m)) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint(x53.f96741p)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(x53.f96743r) && md8.areEqual(sliceItem.getText(), "true")) {
                    z = true;
                }
            }
            try {
                md8.checkNotNull(text);
                md8.checkNotNull(action);
                return new x53(text, action, icon, text2, instantOfEpochMilli, mapAsMutableMap, z);
            } catch (Exception e) {
                Log.i("CreateEntry", "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public static final Slice toSlice(@yfb x53 x53Var) {
            md8.checkNotNullParameter(x53Var, "createEntry");
            CharSequence accountName = x53Var.getAccountName();
            Icon icon = x53Var.getIcon();
            CharSequence description = x53Var.getDescription();
            Instant lastUsedTime = x53Var.getLastUsedTime();
            Map map = x53Var.f96753f;
            PendingIntent pendingIntent = x53Var.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = x53Var.isAutoSelectAllowed() ? "true" : "false";
            builder.addText(accountName, null, k82.listOf(x53.f96737l));
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, k82.listOf(x53.f96741p));
            }
            if (description != null) {
                builder.addText(description, null, k82.listOf(x53.f96738m));
            }
            if (icon != null) {
                builder.addIcon(icon, null, k82.listOf(x53.f96739n));
            }
            if (convertCredentialCountInfoToBundle$credentials_release(map) != null) {
                builder.addBundle(convertCredentialCountInfoToBundle$credentials_release(map), null, k82.listOf(x53.f96740o));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(x53.f96742q)).build(), null).addText(str, null, k82.listOf(x53.f96743r));
            Slice sliceBuild = builder.build();
            md8.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }
    }

    /* JADX INFO: renamed from: x53$b */
    public static final class C14920b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final CharSequence f96756a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final PendingIntent f96757b;

        /* JADX INFO: renamed from: c */
        @yfb
        public Map<String, Integer> f96758c;

        /* JADX INFO: renamed from: d */
        @gib
        public Icon f96759d;

        /* JADX INFO: renamed from: e */
        @gib
        public CharSequence f96760e;

        /* JADX INFO: renamed from: f */
        @gib
        public Instant f96761f;

        /* JADX INFO: renamed from: g */
        @gib
        public Integer f96762g;

        /* JADX INFO: renamed from: h */
        @gib
        public Integer f96763h;

        /* JADX INFO: renamed from: i */
        @gib
        public Integer f96764i;

        /* JADX INFO: renamed from: j */
        public boolean f96765j;

        public C14920b(@yfb CharSequence charSequence, @yfb PendingIntent pendingIntent) {
            md8.checkNotNullParameter(charSequence, "accountName");
            md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            this.f96756a = charSequence;
            this.f96757b = pendingIntent;
            this.f96758c = new LinkedHashMap();
        }

        @yfb
        public final x53 build() {
            return new x53(this.f96756a, this.f96757b, this.f96759d, this.f96760e, this.f96761f, this.f96758c, this.f96765j);
        }

        @yfb
        public final C14920b setAutoSelectAllowed(boolean z) {
            this.f96765j = z;
            return this;
        }

        @yfb
        public final C14920b setDescription(@gib CharSequence charSequence) {
            if ((charSequence != null ? Integer.valueOf(charSequence.length()) : null) != null && charSequence.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            this.f96760e = charSequence;
            return this;
        }

        @yfb
        public final C14920b setIcon(@gib Icon icon) {
            this.f96759d = icon;
            return this;
        }

        @yfb
        public final C14920b setLastUsedTime(@gib Instant instant) {
            this.f96761f = instant;
            return this;
        }

        @yfb
        public final C14920b setPasswordCredentialCount(int i) {
            this.f96762g = Integer.valueOf(i);
            this.f96758c.put(oic.f67748g, Integer.valueOf(i));
            return this;
        }

        @yfb
        public final C14920b setPublicKeyCredentialCount(int i) {
            this.f96763h = Integer.valueOf(i);
            this.f96758c.put(jjd.f50722f, Integer.valueOf(i));
            return this;
        }

        @yfb
        public final C14920b setTotalCredentialCount(int i) {
            this.f96764i = Integer.valueOf(i);
            this.f96758c.put(x53.f96736k, Integer.valueOf(i));
            return this;
        }
    }

    /* JADX INFO: renamed from: x53$c */
    public static final class C14921c {
        public /* synthetic */ C14921c(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final x53 fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            if (Build.VERSION.SDK_INT >= 28) {
                return C14919a.fromSlice(slice);
            }
            return null;
        }

        @do8
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final Slice toSlice(@yfb x53 x53Var) {
            md8.checkNotNullParameter(x53Var, "createEntry");
            if (Build.VERSION.SDK_INT >= 28) {
                return C14919a.toSlice(x53Var);
            }
            return null;
        }

        private C14921c() {
        }
    }

    public x53(@yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @gib Icon icon, @gib CharSequence charSequence2, @gib Instant instant, @yfb Map<String, Integer> map, boolean z) {
        md8.checkNotNullParameter(charSequence, "accountName");
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        md8.checkNotNullParameter(map, "credentialCountInformationMap");
        this.f96748a = charSequence;
        this.f96749b = pendingIntent;
        this.f96750c = icon;
        this.f96751d = charSequence2;
        this.f96752e = instant;
        this.f96753f = map;
        this.f96754g = z;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("accountName must not be empty");
        }
        if (charSequence2 != null && charSequence2.length() > 300) {
            throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
        }
    }

    @do8
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public static final x53 fromSlice(@yfb Slice slice) {
        return f96733h.fromSlice(slice);
    }

    @do8
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public static final Slice toSlice(@yfb x53 x53Var) {
        return f96733h.toSlice(x53Var);
    }

    @yfb
    public final CharSequence getAccountName() {
        return this.f96748a;
    }

    @gib
    public final CharSequence getDescription() {
        return this.f96751d;
    }

    @gib
    public final Icon getIcon() {
        return this.f96750c;
    }

    @gib
    public final Instant getLastUsedTime() {
        return this.f96752e;
    }

    @gib
    public final Integer getPasswordCredentialCount() {
        return this.f96753f.get(oic.f67748g);
    }

    @yfb
    public final PendingIntent getPendingIntent() {
        return this.f96749b;
    }

    @gib
    public final Integer getPublicKeyCredentialCount() {
        return this.f96753f.get(jjd.f50722f);
    }

    @gib
    public final Integer getTotalCredentialCount() {
        return this.f96753f.get(f96736k);
    }

    public final boolean isAutoSelectAllowed() {
        return this.f96754g;
    }

    public /* synthetic */ x53(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z, int i, jt3 jt3Var) {
        this(charSequence, pendingIntent, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : icon, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x53(@yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @gib CharSequence charSequence2, @gib Instant instant, @gib Icon icon, @gib Integer num, @gib Integer num2, @gib Integer num3, boolean z) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, xt9.mutableMapOf(vkh.m24050to(oic.f67748g, num), vkh.m24050to(jjd.f50722f, num2), vkh.m24050to(f96736k, num3)), z);
        md8.checkNotNullParameter(charSequence, "accountName");
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
    }
}
