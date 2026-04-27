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
import com.watchfun.voicenotes.CommonWebViewActivity;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
@dwf({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
public final class uc3 extends o63 {

    /* JADX INFO: renamed from: A */
    @yfb
    public static final String f87490A = "false";

    /* JADX INFO: renamed from: B */
    public static final int f87491B = 1;

    /* JADX INFO: renamed from: n */
    @yfb
    public static final C13486c f87492n = new C13486c(null);

    /* JADX INFO: renamed from: o */
    @yfb
    public static final String f87493o = "CredentialEntry";

    /* JADX INFO: renamed from: p */
    @yfb
    public static final String f87494p = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";

    /* JADX INFO: renamed from: q */
    @yfb
    public static final String f87495q = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";

    /* JADX INFO: renamed from: r */
    @yfb
    public static final String f87496r = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";

    /* JADX INFO: renamed from: s */
    @yfb
    public static final String f87497s = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    /* JADX INFO: renamed from: t */
    @yfb
    public static final String f87498t = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";

    /* JADX INFO: renamed from: u */
    @yfb
    public static final String f87499u = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";

    /* JADX INFO: renamed from: v */
    @yfb
    public static final String f87500v = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";

    /* JADX INFO: renamed from: w */
    @yfb
    public static final String f87501w = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";

    /* JADX INFO: renamed from: x */
    @yfb
    public static final String f87502x = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";

    /* JADX INFO: renamed from: y */
    @yfb
    public static final String f87503y = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";

    /* JADX INFO: renamed from: z */
    @yfb
    public static final String f87504z = "true";

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f87505d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final CharSequence f87506e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final PendingIntent f87507f;

    /* JADX INFO: renamed from: g */
    public final boolean f87508g;

    /* JADX INFO: renamed from: h */
    @gib
    public final CharSequence f87509h;

    /* JADX INFO: renamed from: i */
    @gib
    public final CharSequence f87510i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final Icon f87511j;

    /* JADX INFO: renamed from: k */
    @gib
    public final Instant f87512k;

    /* JADX INFO: renamed from: l */
    public final boolean f87513l;

    /* JADX INFO: renamed from: m */
    public final boolean f87514m;

    /* JADX INFO: renamed from: uc3$a */
    @c5e(28)
    @dwf({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,458:1\n1855#2,2:459\n*S KotlinDebug\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api28Impl\n*L\n243#1:459,2\n*E\n"})
    public static final class C13484a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C13484a f87515a = new C13484a();

        private C13484a() {
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public static final uc3 fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            SliceSpec spec = slice.getSpec();
            md8.checkNotNull(spec);
            String type = spec.getType();
            md8.checkNotNullExpressionValue(type, "slice.spec!!.type");
            List<SliceItem> items = slice.getItems();
            md8.checkNotNullExpressionValue(items, "slice.items");
            CharSequence text = null;
            PendingIntent action = null;
            CharSequence text2 = null;
            CharSequence text3 = null;
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
                md8.checkNotNull(action);
                md8.checkNotNull(icon);
                md8.checkNotNull(text4);
                return new uc3(type, text, action, z, text2, text3, icon, instantOfEpochMilli, new h01(text4.toString(), type, new Bundle()), z2, z3);
            } catch (Exception e) {
                Log.i(uc3.f87493o, "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public static final Slice toSlice(@yfb uc3 uc3Var) {
            md8.checkNotNullParameter(uc3Var, "entry");
            String type = uc3Var.getType();
            CharSequence title = uc3Var.getTitle();
            CharSequence subtitle = uc3Var.getSubtitle();
            PendingIntent pendingIntent = uc3Var.getPendingIntent();
            CharSequence typeDisplayName = uc3Var.getTypeDisplayName();
            Instant lastUsedTime = uc3Var.getLastUsedTime();
            Icon icon = uc3Var.getIcon();
            boolean zIsAutoSelectAllowed = uc3Var.isAutoSelectAllowed();
            py0 beginGetCredentialOption = uc3Var.getBeginGetCredentialOption();
            Slice.Builder builderAddIcon = new Slice.Builder(Uri.EMPTY, new SliceSpec(type, 1)).addText(typeDisplayName, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(title, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(subtitle, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(zIsAutoSelectAllowed ? "true" : "false", null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption.getId(), null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addIcon(icon, null, k82.listOf("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON"));
            try {
                if (icon.getResId() == C0939R.drawable.ic_other_sign_in) {
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

    /* JADX INFO: renamed from: uc3$b */
    public static final class C13485b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Context f87516a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final String f87517b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final CharSequence f87518c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final PendingIntent f87519d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final py0 f87520e;

        /* JADX INFO: renamed from: f */
        @gib
        public CharSequence f87521f;

        /* JADX INFO: renamed from: g */
        @gib
        public Instant f87522g;

        /* JADX INFO: renamed from: h */
        @gib
        public CharSequence f87523h;

        /* JADX INFO: renamed from: i */
        @gib
        public Icon f87524i;

        /* JADX INFO: renamed from: j */
        public boolean f87525j;

        public C13485b(@yfb Context context, @yfb String str, @yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @yfb py0 py0Var) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "type");
            md8.checkNotNullParameter(charSequence, CommonWebViewActivity.f26185L);
            md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            md8.checkNotNullParameter(py0Var, "beginGetCredentialOption");
            this.f87516a = context;
            this.f87517b = str;
            this.f87518c = charSequence;
            this.f87519d = pendingIntent;
            this.f87520e = py0Var;
        }

        @yfb
        public final uc3 build() {
            if (this.f87524i == null) {
                this.f87524i = Icon.createWithResource(this.f87516a, C0939R.drawable.ic_other_sign_in);
            }
            String str = this.f87517b;
            CharSequence charSequence = this.f87518c;
            PendingIntent pendingIntent = this.f87519d;
            boolean z = this.f87525j;
            CharSequence charSequence2 = this.f87521f;
            CharSequence charSequence3 = this.f87523h;
            Icon icon = this.f87524i;
            md8.checkNotNull(icon);
            return new uc3(str, charSequence, pendingIntent, z, charSequence2, charSequence3, icon, this.f87522g, this.f87520e, false, false, 1536, null);
        }

        @yfb
        public final C13485b setAutoSelectAllowed(boolean z) {
            this.f87525j = z;
            return this;
        }

        @yfb
        public final C13485b setIcon(@yfb Icon icon) {
            md8.checkNotNullParameter(icon, "icon");
            this.f87524i = icon;
            return this;
        }

        @yfb
        public final C13485b setLastUsedTime(@gib Instant instant) {
            this.f87522g = instant;
            return this;
        }

        @yfb
        public final C13485b setSubtitle(@gib CharSequence charSequence) {
            this.f87521f = charSequence;
            return this;
        }

        @yfb
        public final C13485b setTypeDisplayName(@gib CharSequence charSequence) {
            this.f87523h = charSequence;
            return this;
        }
    }

    /* JADX INFO: renamed from: uc3$c */
    public static final class C13486c {
        public /* synthetic */ C13486c(jt3 jt3Var) {
            this();
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public final uc3 fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            if (Build.VERSION.SDK_INT >= 28) {
                return C13484a.fromSlice(slice);
            }
            return null;
        }

        @do8
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final Slice toSlice(@yfb uc3 uc3Var) {
            md8.checkNotNullParameter(uc3Var, "entry");
            if (Build.VERSION.SDK_INT >= 28) {
                return C13484a.toSlice(uc3Var);
            }
            return null;
        }

        private C13486c() {
        }
    }

    public /* synthetic */ uc3(String str, CharSequence charSequence, PendingIntent pendingIntent, boolean z, CharSequence charSequence2, CharSequence charSequence3, Icon icon, Instant instant, py0 py0Var, boolean z2, boolean z3, int i, jt3 jt3Var) {
        this(str, charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, py0Var, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3);
    }

    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @igg({"WrongConstant"})
    public static final uc3 fromSlice(@yfb Slice slice) {
        return f87492n.fromSlice(slice);
    }

    @do8
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public static final Slice toSlice(@yfb uc3 uc3Var) {
        return f87492n.toSlice(uc3Var);
    }

    @yfb
    public final Icon getIcon() {
        return this.f87511j;
    }

    @gib
    public final Instant getLastUsedTime() {
        return this.f87512k;
    }

    @yfb
    public final PendingIntent getPendingIntent() {
        return this.f87507f;
    }

    @gib
    public final CharSequence getSubtitle() {
        return this.f87509h;
    }

    @yfb
    public final CharSequence getTitle() {
        return this.f87506e;
    }

    @Override // p000.o63
    @yfb
    public String getType() {
        return this.f87505d;
    }

    @gib
    public final CharSequence getTypeDisplayName() {
        return this.f87510i;
    }

    public final boolean isAutoSelectAllowed() {
        return this.f87508g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc3(@yfb String str, @yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, boolean z, @gib CharSequence charSequence2, @gib CharSequence charSequence3, @yfb Icon icon, @gib Instant instant, @yfb py0 py0Var, boolean z2, boolean z3) {
        super(str, py0Var);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(charSequence, CommonWebViewActivity.f26185L);
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        md8.checkNotNullParameter(icon, "icon");
        md8.checkNotNullParameter(py0Var, "beginGetCredentialOption");
        this.f87505d = str;
        this.f87506e = charSequence;
        this.f87507f = pendingIntent;
        this.f87508g = z;
        this.f87509h = charSequence2;
        this.f87510i = charSequence3;
        this.f87511j = icon;
        this.f87512k = instant;
        this.f87513l = z2;
        this.f87514m = z3;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ uc3(Context context, CharSequence charSequence, PendingIntent pendingIntent, py0 py0Var, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, int i, jt3 jt3Var) {
        Icon icon2;
        CharSequence charSequence4 = (i & 16) != 0 ? null : charSequence2;
        CharSequence charSequence5 = (i & 32) != 0 ? null : charSequence3;
        Instant instant2 = (i & 64) != 0 ? null : instant;
        if ((i & 128) != 0) {
            Icon iconCreateWithResource = Icon.createWithResource(context, C0939R.drawable.ic_other_sign_in);
            md8.checkNotNullExpressionValue(iconCreateWithResource, "createWithResource(conte…rawable.ic_other_sign_in)");
            icon2 = iconCreateWithResource;
        } else {
            icon2 = icon;
        }
        this(context, charSequence, pendingIntent, py0Var, charSequence4, charSequence5, instant2, icon2, (i & 256) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uc3(@yfb Context context, @yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @yfb py0 py0Var, @gib CharSequence charSequence2, @gib CharSequence charSequence3, @gib Instant instant, @yfb Icon icon, boolean z) {
        this(py0Var.getType(), charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, py0Var, false, false, 1536, null);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(charSequence, CommonWebViewActivity.f26185L);
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        md8.checkNotNullParameter(py0Var, "beginGetCredentialOption");
        md8.checkNotNullParameter(icon, "icon");
    }
}
