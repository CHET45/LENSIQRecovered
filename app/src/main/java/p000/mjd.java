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
import p000.j01;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
@dwf({"SMAP\nPublicKeyCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,440:1\n1#2:441\n*E\n"})
public final class mjd extends o63 {

    /* JADX INFO: renamed from: A */
    public static final int f61144A = 1;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final C9371c f61145m = new C9371c(null);

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f61146n = "PublicKeyCredEntry";

    /* JADX INFO: renamed from: o */
    @yfb
    public static final String f61147o = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";

    /* JADX INFO: renamed from: p */
    @yfb
    public static final String f61148p = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";

    /* JADX INFO: renamed from: q */
    @yfb
    public static final String f61149q = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";

    /* JADX INFO: renamed from: r */
    @yfb
    public static final String f61150r = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    /* JADX INFO: renamed from: s */
    @yfb
    public static final String f61151s = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";

    /* JADX INFO: renamed from: t */
    @yfb
    public static final String f61152t = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";

    /* JADX INFO: renamed from: u */
    @yfb
    public static final String f61153u = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";

    /* JADX INFO: renamed from: v */
    @yfb
    public static final String f61154v = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";

    /* JADX INFO: renamed from: w */
    @yfb
    public static final String f61155w = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";

    /* JADX INFO: renamed from: x */
    @yfb
    public static final String f61156x = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";

    /* JADX INFO: renamed from: y */
    @yfb
    public static final String f61157y = "true";

    /* JADX INFO: renamed from: z */
    @yfb
    public static final String f61158z = "false";

    /* JADX INFO: renamed from: d */
    @yfb
    public final CharSequence f61159d;

    /* JADX INFO: renamed from: e */
    @gib
    public final CharSequence f61160e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final CharSequence f61161f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final PendingIntent f61162g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final Icon f61163h;

    /* JADX INFO: renamed from: i */
    @gib
    public final Instant f61164i;

    /* JADX INFO: renamed from: j */
    public final boolean f61165j;

    /* JADX INFO: renamed from: k */
    public final boolean f61166k;

    /* JADX INFO: renamed from: l */
    public final boolean f61167l;

    /* JADX INFO: renamed from: mjd$a */
    @c5e(28)
    @dwf({"SMAP\nPublicKeyCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1855#2,2:441\n*S KotlinDebug\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl\n*L\n250#1:441,2\n*E\n"})
    public static final class C9369a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C9369a f61168a = new C9369a();

        private C9369a() {
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public static final mjd fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            List<SliceItem> items = slice.getItems();
            md8.checkNotNullExpressionValue(items, "slice.items");
            CharSequence text = null;
            CharSequence text2 = null;
            CharSequence text3 = null;
            PendingIntent action = null;
            Icon icon = null;
            Instant instantOfEpochMilli = null;
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
                j01.C7700a c7700a = j01.f49203g;
                Bundle bundle = new Bundle();
                md8.checkNotNull(text4);
                return new mjd(text, text2, text3, action, icon, instantOfEpochMilli, z, c7700a.createFromEntrySlice$credentials_release(bundle, text4.toString()), z2, z3);
            } catch (Exception e) {
                Log.i(mjd.f61146n, "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public static final Slice toSlice(@yfb mjd mjdVar) {
            md8.checkNotNullParameter(mjdVar, "entry");
            String type = mjdVar.getType();
            CharSequence username = mjdVar.getUsername();
            CharSequence displayName = mjdVar.getDisplayName();
            PendingIntent pendingIntent = mjdVar.getPendingIntent();
            CharSequence typeDisplayName = mjdVar.getTypeDisplayName();
            Instant lastUsedTime = mjdVar.getLastUsedTime();
            Icon icon = mjdVar.getIcon();
            boolean zIsAutoSelectAllowed = mjdVar.isAutoSelectAllowed();
            py0 beginGetCredentialOption = mjdVar.getBeginGetCredentialOption();
            Slice.Builder builderAddIcon = new Slice.Builder(Uri.EMPTY, new SliceSpec(type, 1)).addText(typeDisplayName, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(username, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(displayName, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(zIsAutoSelectAllowed ? "true" : "false", null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption.getId(), null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addIcon(icon, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON"));
            try {
                if (icon.getResId() == C0939R.drawable.ic_passkey) {
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

    /* JADX INFO: renamed from: mjd$b */
    public static final class C9370b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Context f61169a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final CharSequence f61170b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final PendingIntent f61171c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final j01 f61172d;

        /* JADX INFO: renamed from: e */
        @gib
        public CharSequence f61173e;

        /* JADX INFO: renamed from: f */
        @gib
        public Instant f61174f;

        /* JADX INFO: renamed from: g */
        @gib
        public Icon f61175g;

        /* JADX INFO: renamed from: h */
        public boolean f61176h;

        public C9370b(@yfb Context context, @yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @yfb j01 j01Var) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(charSequence, zj7.f105250c);
            md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            md8.checkNotNullParameter(j01Var, "beginGetPublicKeyCredentialOption");
            this.f61169a = context;
            this.f61170b = charSequence;
            this.f61171c = pendingIntent;
            this.f61172d = j01Var;
        }

        @yfb
        public final mjd build() {
            if (this.f61175g == null) {
                this.f61175g = Icon.createWithResource(this.f61169a, C0939R.drawable.ic_passkey);
            }
            String string = this.f61169a.getString(C0939R.string.androidx_credentials_TYPE_PUBLIC_KEY_CREDENTIAL);
            md8.checkNotNullExpressionValue(string, "context.getString(\n     …_CREDENTIAL\n            )");
            CharSequence charSequence = this.f61170b;
            CharSequence charSequence2 = this.f61173e;
            PendingIntent pendingIntent = this.f61171c;
            Icon icon = this.f61175g;
            md8.checkNotNull(icon);
            return new mjd(charSequence, charSequence2, string, pendingIntent, icon, this.f61174f, this.f61176h, this.f61172d, false, false, 768, null);
        }

        @yfb
        public final C9370b setAutoSelectAllowed(boolean z) {
            this.f61176h = z;
            return this;
        }

        @yfb
        public final C9370b setDisplayName(@gib CharSequence charSequence) {
            this.f61173e = charSequence;
            return this;
        }

        @yfb
        public final C9370b setIcon(@yfb Icon icon) {
            md8.checkNotNullParameter(icon, "icon");
            this.f61175g = icon;
            return this;
        }

        @yfb
        public final C9370b setLastUsedTime(@gib Instant instant) {
            this.f61174f = instant;
            return this;
        }
    }

    /* JADX INFO: renamed from: mjd$c */
    public static final class C9371c {
        public /* synthetic */ C9371c(jt3 jt3Var) {
            this();
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public final mjd fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            if (Build.VERSION.SDK_INT >= 28) {
                return C9369a.fromSlice(slice);
            }
            return null;
        }

        @do8
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final Slice toSlice(@yfb mjd mjdVar) {
            md8.checkNotNullParameter(mjdVar, "entry");
            if (Build.VERSION.SDK_INT >= 28) {
                return C9369a.toSlice(mjdVar);
            }
            return null;
        }

        private C9371c() {
        }
    }

    public /* synthetic */ mjd(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Icon icon, Instant instant, boolean z, j01 j01Var, boolean z2, boolean z3, int i, jt3 jt3Var) {
        this(charSequence, charSequence2, charSequence3, pendingIntent, icon, instant, z, j01Var, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3);
    }

    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @igg({"WrongConstant"})
    public static final mjd fromSlice(@yfb Slice slice) {
        return f61145m.fromSlice(slice);
    }

    @do8
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public static final Slice toSlice(@yfb mjd mjdVar) {
        return f61145m.toSlice(mjdVar);
    }

    @gib
    public final CharSequence getDisplayName() {
        return this.f61160e;
    }

    @yfb
    public final Icon getIcon() {
        return this.f61163h;
    }

    @gib
    public final Instant getLastUsedTime() {
        return this.f61164i;
    }

    @yfb
    public final PendingIntent getPendingIntent() {
        return this.f61162g;
    }

    @yfb
    public final CharSequence getTypeDisplayName() {
        return this.f61161f;
    }

    @yfb
    public final CharSequence getUsername() {
        return this.f61159d;
    }

    public final boolean isAutoSelectAllowed() {
        return this.f61165j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjd(@yfb CharSequence charSequence, @gib CharSequence charSequence2, @yfb CharSequence charSequence3, @yfb PendingIntent pendingIntent, @yfb Icon icon, @gib Instant instant, boolean z, @yfb j01 j01Var, boolean z2, boolean z3) {
        super(jjd.f50722f, j01Var);
        md8.checkNotNullParameter(charSequence, zj7.f105250c);
        md8.checkNotNullParameter(charSequence3, "typeDisplayName");
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        md8.checkNotNullParameter(icon, "icon");
        md8.checkNotNullParameter(j01Var, "beginGetPublicKeyCredentialOption");
        this.f61159d = charSequence;
        this.f61160e = charSequence2;
        this.f61161f = charSequence3;
        this.f61162g = pendingIntent;
        this.f61163h = icon;
        this.f61164i = instant;
        this.f61165j = z;
        this.f61166k = z2;
        this.f61167l = z3;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
        if (charSequence3.length() <= 0) {
            throw new IllegalArgumentException("typeDisplayName must not be empty");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mjd(Context context, CharSequence charSequence, PendingIntent pendingIntent, j01 j01Var, CharSequence charSequence2, Instant instant, Icon icon, boolean z, int i, jt3 jt3Var) {
        Icon icon2;
        CharSequence charSequence3 = (i & 16) != 0 ? null : charSequence2;
        Instant instant2 = (i & 32) != 0 ? null : instant;
        if ((i & 64) != 0) {
            Icon iconCreateWithResource = Icon.createWithResource(context, C0939R.drawable.ic_passkey);
            md8.checkNotNullExpressionValue(iconCreateWithResource, "createWithResource(context, R.drawable.ic_passkey)");
            icon2 = iconCreateWithResource;
        } else {
            icon2 = icon;
        }
        this(context, charSequence, pendingIntent, j01Var, charSequence3, instant2, icon2, (i & 128) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mjd(@yfb Context context, @yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @yfb j01 j01Var, @gib CharSequence charSequence2, @gib Instant instant, @yfb Icon icon, boolean z) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(charSequence, zj7.f105250c);
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        md8.checkNotNullParameter(j01Var, "beginGetPublicKeyCredentialOption");
        md8.checkNotNullParameter(icon, "icon");
        String string = context.getString(C0939R.string.androidx_credentials_TYPE_PUBLIC_KEY_CREDENTIAL);
        md8.checkNotNullExpressionValue(string, "context.getString(\n     …_KEY_CREDENTIAL\n        )");
        this(charSequence, charSequence2, string, pendingIntent, icon, instant, z, j01Var, false, false, 768, null);
    }
}
