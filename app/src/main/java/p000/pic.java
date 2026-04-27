package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.credentials.C0939R;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import p000.i01;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
@dwf({"SMAP\nPasswordCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordCredentialEntry.kt\nandroidx/credentials/provider/PasswordCredentialEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
public final class pic extends o63 {

    /* JADX INFO: renamed from: A */
    public static final int f70992A = 1;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final C10975c f70993m = new C10975c(null);

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f70994n = "PasswordCredentialEntry";

    /* JADX INFO: renamed from: o */
    @yfb
    public static final String f70995o = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";

    /* JADX INFO: renamed from: p */
    @yfb
    public static final String f70996p = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";

    /* JADX INFO: renamed from: q */
    @yfb
    public static final String f70997q = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";

    /* JADX INFO: renamed from: r */
    @yfb
    public static final String f70998r = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";

    /* JADX INFO: renamed from: s */
    @yfb
    public static final String f70999s = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    /* JADX INFO: renamed from: t */
    @yfb
    public static final String f71000t = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";

    /* JADX INFO: renamed from: u */
    @yfb
    public static final String f71001u = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";

    /* JADX INFO: renamed from: v */
    @yfb
    public static final String f71002v = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";

    /* JADX INFO: renamed from: w */
    @yfb
    public static final String f71003w = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";

    /* JADX INFO: renamed from: x */
    @yfb
    public static final String f71004x = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";

    /* JADX INFO: renamed from: y */
    @yfb
    public static final String f71005y = "true";

    /* JADX INFO: renamed from: z */
    @yfb
    public static final String f71006z = "false";

    /* JADX INFO: renamed from: d */
    @yfb
    public final CharSequence f71007d;

    /* JADX INFO: renamed from: e */
    @gib
    public final CharSequence f71008e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final CharSequence f71009f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final PendingIntent f71010g;

    /* JADX INFO: renamed from: h */
    @gib
    public final Instant f71011h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final Icon f71012i;

    /* JADX INFO: renamed from: j */
    public final boolean f71013j;

    /* JADX INFO: renamed from: k */
    public final boolean f71014k;

    /* JADX INFO: renamed from: l */
    public final boolean f71015l;

    /* JADX INFO: renamed from: pic$a */
    @c5e(28)
    @dwf({"SMAP\nPasswordCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordCredentialEntry.kt\nandroidx/credentials/provider/PasswordCredentialEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,450:1\n1855#2,2:451\n*S KotlinDebug\n*F\n+ 1 PasswordCredentialEntry.kt\nandroidx/credentials/provider/PasswordCredentialEntry$Api28Impl\n*L\n249#1:451,2\n*E\n"})
    public static final class C10973a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C10973a f71016a = new C10973a();

        private C10973a() {
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public static final pic fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            List<SliceItem> items = slice.getItems();
            md8.checkNotNullExpressionValue(items, "slice.items");
            CharSequence text = null;
            CharSequence text2 = null;
            CharSequence text3 = null;
            PendingIntent action = null;
            Instant instantOfEpochMilli = null;
            Icon icon = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            CharSequence text4 = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")) {
                    text3 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")) {
                    text4 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                    if (md8.areEqual(sliceItem.getText(), "true")) {
                        z = true;
                    }
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                    z2 = true;
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID")) {
                    z3 = true;
                }
            }
            try {
                md8.checkNotNull(text);
                md8.checkNotNull(text3);
                md8.checkNotNull(action);
                md8.checkNotNull(icon);
                i01.C7093a c7093a = i01.f45356f;
                Bundle bundle = new Bundle();
                md8.checkNotNull(text4);
                return new pic(text, text2, text3, action, instantOfEpochMilli, icon, z, c7093a.createFrom$credentials_release(bundle, text4.toString()), z2, z3);
            } catch (Exception e) {
                Log.i(pic.f70994n, "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public static final Slice toSlice(@yfb pic picVar) {
            md8.checkNotNullParameter(picVar, "entry");
            String type = picVar.getType();
            CharSequence username = picVar.getUsername();
            CharSequence displayName = picVar.getDisplayName();
            PendingIntent pendingIntent = picVar.getPendingIntent();
            CharSequence typeDisplayName = picVar.getTypeDisplayName();
            Instant lastUsedTime = picVar.getLastUsedTime();
            Icon icon = picVar.getIcon();
            boolean zIsAutoSelectAllowed = picVar.isAutoSelectAllowed();
            py0 beginGetCredentialOption = picVar.getBeginGetCredentialOption();
            Slice.Builder builderAddIcon = new Slice.Builder(Uri.EMPTY, new SliceSpec(type, 1)).addText(typeDisplayName, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(username, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(displayName, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(zIsAutoSelectAllowed ? "true" : "false", null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption.getId(), null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addIcon(icon, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON"));
            try {
                if (icon.getResId() == C0939R.drawable.ic_password) {
                    builderAddIcon.addInt(1, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                }
            } catch (IllegalStateException unused) {
            }
            if (t63.f83775g.extractAutoSelectValue$credentials_release(beginGetCredentialOption.getCandidateQueryData())) {
                builderAddIcon.addInt(1, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
            }
            if (lastUsedTime != null) {
                builderAddIcon.addLong(lastUsedTime.toEpochMilli(), null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            builderAddIcon.addAction(pendingIntent, new Slice.Builder(builderAddIcon).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
            Slice sliceBuild = builderAddIcon.build();
            md8.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }
    }

    /* JADX INFO: renamed from: pic$b */
    public static final class C10974b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Context f71017a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final CharSequence f71018b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final PendingIntent f71019c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final i01 f71020d;

        /* JADX INFO: renamed from: e */
        @gib
        public CharSequence f71021e;

        /* JADX INFO: renamed from: f */
        @gib
        public Instant f71022f;

        /* JADX INFO: renamed from: g */
        @gib
        public Icon f71023g;

        /* JADX INFO: renamed from: h */
        public boolean f71024h;

        public C10974b(@yfb Context context, @yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @yfb i01 i01Var) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(charSequence, zj7.f105250c);
            md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            md8.checkNotNullParameter(i01Var, "beginGetPasswordOption");
            this.f71017a = context;
            this.f71018b = charSequence;
            this.f71019c = pendingIntent;
            this.f71020d = i01Var;
        }

        @yfb
        public final pic build() {
            if (this.f71023g == null) {
                this.f71023g = Icon.createWithResource(this.f71017a, C0939R.drawable.ic_password);
            }
            String string = this.f71017a.getString(C0939R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL);
            md8.checkNotNullExpressionValue(string, "context.getString(\n     …_CREDENTIAL\n            )");
            CharSequence charSequence = this.f71018b;
            CharSequence charSequence2 = this.f71021e;
            PendingIntent pendingIntent = this.f71019c;
            Instant instant = this.f71022f;
            Icon icon = this.f71023g;
            md8.checkNotNull(icon);
            return new pic(charSequence, charSequence2, string, pendingIntent, instant, icon, this.f71024h, this.f71020d, false, false, 768, null);
        }

        @yfb
        public final C10974b setAutoSelectAllowed(boolean z) {
            this.f71024h = z;
            return this;
        }

        @yfb
        public final C10974b setDisplayName(@gib CharSequence charSequence) {
            this.f71021e = charSequence;
            return this;
        }

        @yfb
        public final C10974b setIcon(@yfb Icon icon) {
            md8.checkNotNullParameter(icon, "icon");
            this.f71023g = icon;
            return this;
        }

        @yfb
        public final C10974b setLastUsedTime(@gib Instant instant) {
            this.f71022f = instant;
            return this;
        }
    }

    /* JADX INFO: renamed from: pic$c */
    public static final class C10975c {
        public /* synthetic */ C10975c(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final pic fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            if (Build.VERSION.SDK_INT >= 28) {
                return C10973a.fromSlice(slice);
            }
            return null;
        }

        @do8
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final Slice toSlice(@yfb pic picVar) {
            md8.checkNotNullParameter(picVar, "entry");
            if (Build.VERSION.SDK_INT >= 28) {
                return C10973a.toSlice(picVar);
            }
            return null;
        }

        private C10975c() {
        }
    }

    public /* synthetic */ pic(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Instant instant, Icon icon, boolean z, i01 i01Var, boolean z2, boolean z3, int i, jt3 jt3Var) {
        this(charSequence, charSequence2, charSequence3, pendingIntent, instant, icon, z, i01Var, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3);
    }

    @do8
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public static final pic fromSlice(@yfb Slice slice) {
        return f70993m.fromSlice(slice);
    }

    @do8
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public static final Slice toSlice(@yfb pic picVar) {
        return f70993m.toSlice(picVar);
    }

    @gib
    public final CharSequence getDisplayName() {
        return this.f71008e;
    }

    @yfb
    public final Icon getIcon() {
        return this.f71012i;
    }

    @gib
    public final Instant getLastUsedTime() {
        return this.f71011h;
    }

    @yfb
    public final PendingIntent getPendingIntent() {
        return this.f71010g;
    }

    @yfb
    public final CharSequence getTypeDisplayName() {
        return this.f71009f;
    }

    @yfb
    public final CharSequence getUsername() {
        return this.f71007d;
    }

    public final boolean isAutoSelectAllowed() {
        return this.f71013j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pic(@yfb CharSequence charSequence, @gib CharSequence charSequence2, @yfb CharSequence charSequence3, @yfb PendingIntent pendingIntent, @gib Instant instant, @yfb Icon icon, boolean z, @yfb i01 i01Var, boolean z2, boolean z3) {
        super(oic.f67748g, i01Var);
        md8.checkNotNullParameter(charSequence, zj7.f105250c);
        md8.checkNotNullParameter(charSequence3, "typeDisplayName");
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        md8.checkNotNullParameter(icon, "icon");
        md8.checkNotNullParameter(i01Var, "beginGetPasswordOption");
        this.f71007d = charSequence;
        this.f71008e = charSequence2;
        this.f71009f = charSequence3;
        this.f71010g = pendingIntent;
        this.f71011h = instant;
        this.f71012i = icon;
        this.f71013j = z;
        this.f71014k = z2;
        this.f71015l = z3;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pic(Context context, CharSequence charSequence, PendingIntent pendingIntent, i01 i01Var, CharSequence charSequence2, Instant instant, Icon icon, boolean z, int i, jt3 jt3Var) {
        Icon icon2;
        CharSequence charSequence3 = (i & 16) != 0 ? null : charSequence2;
        Instant instant2 = (i & 32) != 0 ? null : instant;
        if ((i & 64) != 0) {
            Icon iconCreateWithResource = Icon.createWithResource(context, C0939R.drawable.ic_password);
            md8.checkNotNullExpressionValue(iconCreateWithResource, "createWithResource(conte…, R.drawable.ic_password)");
            icon2 = iconCreateWithResource;
        } else {
            icon2 = icon;
        }
        this(context, charSequence, pendingIntent, i01Var, charSequence3, instant2, icon2, (i & 128) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pic(@yfb Context context, @yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @yfb i01 i01Var, @gib CharSequence charSequence2, @gib Instant instant, @yfb Icon icon, boolean z) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(charSequence, zj7.f105250c);
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        md8.checkNotNullParameter(i01Var, "beginGetPasswordOption");
        md8.checkNotNullParameter(icon, "icon");
        String string = context.getString(C0939R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL);
        md8.checkNotNullExpressionValue(string, "context.getString(\n     …WORD_CREDENTIAL\n        )");
        this(charSequence, charSequence2, string, pendingIntent, instant, icon, z, i01Var, false, false, 768, null);
    }
}
