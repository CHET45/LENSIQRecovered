package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.watchfun.voicenotes.CommonWebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nAuthenticationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class bi0 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C1907b f13770c = new C1907b(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f13771d = "AuthenticationAction";

    /* JADX INFO: renamed from: e */
    public static final int f13772e = 0;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f13773f = "AuthenticationAction";

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f13774g = "androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f13775h = "androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT";

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f13776a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final PendingIntent f13777b;

    /* JADX INFO: renamed from: bi0$a */
    public static final class C1906a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final CharSequence f13778a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final PendingIntent f13779b;

        public C1906a(@yfb CharSequence charSequence, @yfb PendingIntent pendingIntent) {
            md8.checkNotNullParameter(charSequence, CommonWebViewActivity.f26185L);
            md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            this.f13778a = charSequence;
            this.f13779b = pendingIntent;
        }

        @yfb
        public final bi0 build() {
            return new bi0(this.f13778a, this.f13779b);
        }
    }

    /* JADX INFO: renamed from: bi0$b */
    @dwf({"SMAP\nAuthenticationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n1855#2,2:162\n*S KotlinDebug\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction$Companion\n*L\n145#1:162,2\n*E\n"})
    public static final class C1907b {
        public /* synthetic */ C1907b(jt3 jt3Var) {
            this();
        }

        @c5e(28)
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public final bi0 fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            List items = slice.getItems();
            md8.checkNotNullExpressionValue(items, "slice.items");
            Iterator it = items.iterator();
            CharSequence text = null;
            PendingIntent action = null;
            while (it.hasNext()) {
                SliceItem sliceItemM26596a = C16022z7.m26596a(it.next());
                if (sliceItemM26596a.hasHint(bi0.f13775h)) {
                    action = sliceItemM26596a.getAction();
                } else if (sliceItemM26596a.hasHint(bi0.f13774g)) {
                    text = sliceItemM26596a.getText();
                }
            }
            try {
                md8.checkNotNull(text);
                md8.checkNotNull(action);
                return new bi0(text, action);
            } catch (Exception e) {
                Log.i("AuthenticationAction", "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @c5e(28)
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @yfb
        public final Slice toSlice(@yfb bi0 bi0Var) {
            md8.checkNotNullParameter(bi0Var, "authenticationAction");
            CharSequence title = bi0Var.getTitle();
            PendingIntent pendingIntent = bi0Var.getPendingIntent();
            C14945x7.m25023a();
            Uri uri = Uri.EMPTY;
            C15513y7.m25671a();
            Slice.Builder builderM23829a = C13895v7.m23829a(uri, C6742h8.m12259a("AuthenticationAction", 0));
            builderM23829a.addAction(pendingIntent, C14446w7.m24361a(builderM23829a).addHints(Collections.singletonList(bi0.f13775h)).build(), null).addText(title, null, k82.listOf(bi0.f13774g));
            Slice sliceBuild = builderM23829a.build();
            md8.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }

        private C1907b() {
        }
    }

    public bi0(@yfb CharSequence charSequence, @yfb PendingIntent pendingIntent) {
        md8.checkNotNullParameter(charSequence, CommonWebViewActivity.f26185L);
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        this.f13776a = charSequence;
        this.f13777b = pendingIntent;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    @c5e(28)
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @igg({"WrongConstant"})
    public static final bi0 fromSlice(@yfb Slice slice) {
        return f13770c.fromSlice(slice);
    }

    @c5e(28)
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @yfb
    public static final Slice toSlice(@yfb bi0 bi0Var) {
        return f13770c.toSlice(bi0Var);
    }

    @yfb
    public final PendingIntent getPendingIntent() {
        return this.f13777b;
    }

    @yfb
    public final CharSequence getTitle() {
        return this.f13776a;
    }
}
