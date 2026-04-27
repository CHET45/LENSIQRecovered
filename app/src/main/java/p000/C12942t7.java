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

/* JADX INFO: renamed from: t7 */
/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class C12942t7 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final b f83906d = new b(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f83907e = "Action";

    /* JADX INFO: renamed from: f */
    public static final int f83908f = 0;

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f83909g = "Action";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f83910h = "androidx.credentials.provider.action.HINT_ACTION_TITLE";

    /* JADX INFO: renamed from: i */
    @yfb
    public static final String f83911i = "androidx.credentials.provider.action.HINT_ACTION_SUBTEXT";

    /* JADX INFO: renamed from: j */
    @yfb
    public static final String f83912j = "androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT";

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f83913a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final PendingIntent f83914b;

    /* JADX INFO: renamed from: c */
    @gib
    public final CharSequence f83915c;

    /* JADX INFO: renamed from: t7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final CharSequence f83916a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final PendingIntent f83917b;

        /* JADX INFO: renamed from: c */
        @gib
        public CharSequence f83918c;

        public a(@yfb CharSequence charSequence, @yfb PendingIntent pendingIntent) {
            md8.checkNotNullParameter(charSequence, CommonWebViewActivity.f26185L);
            md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            this.f83916a = charSequence;
            this.f83917b = pendingIntent;
        }

        @yfb
        public final C12942t7 build() {
            return new C12942t7(this.f83916a, this.f83917b, this.f83918c);
        }

        @yfb
        public final a setSubtitle(@gib CharSequence charSequence) {
            this.f83918c = charSequence;
            return this;
        }
    }

    /* JADX INFO: renamed from: t7$b */
    @dwf({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1855#2,2:197\n*S KotlinDebug\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n*L\n177#1:197,2\n*E\n"})
    public static final class b {
        public /* synthetic */ b(jt3 jt3Var) {
            this();
        }

        @c5e(28)
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public final C12942t7 fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            List items = slice.getItems();
            md8.checkNotNullExpressionValue(items, "slice.items");
            Iterator it = items.iterator();
            CharSequence text = "";
            PendingIntent action = null;
            CharSequence text2 = null;
            while (it.hasNext()) {
                SliceItem sliceItemM26596a = C16022z7.m26596a(it.next());
                if (sliceItemM26596a.hasHint(C12942t7.f83910h)) {
                    text = sliceItemM26596a.getText();
                    md8.checkNotNullExpressionValue(text, "it.text");
                } else if (sliceItemM26596a.hasHint(C12942t7.f83911i)) {
                    text2 = sliceItemM26596a.getText();
                } else if (sliceItemM26596a.hasHint(C12942t7.f83912j)) {
                    action = sliceItemM26596a.getAction();
                }
            }
            try {
                md8.checkNotNull(action);
                return new C12942t7(text, action, text2);
            } catch (Exception e) {
                Log.i("Action", "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @c5e(28)
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @yfb
        public final Slice toSlice(@yfb C12942t7 c12942t7) {
            md8.checkNotNullParameter(c12942t7, "action");
            CharSequence title = c12942t7.getTitle();
            CharSequence subtitle = c12942t7.getSubtitle();
            PendingIntent pendingIntent = c12942t7.getPendingIntent();
            C14945x7.m25023a();
            Uri uri = Uri.EMPTY;
            C15513y7.m25671a();
            Slice.Builder builderAddText = C13895v7.m23829a(uri, C6742h8.m12259a("Action", 0)).addText(title, null, k82.listOf(C12942t7.f83910h)).addText(subtitle, null, k82.listOf(C12942t7.f83911i));
            builderAddText.addAction(pendingIntent, C14446w7.m24361a(builderAddText).addHints(Collections.singletonList(C12942t7.f83912j)).build(), null);
            Slice sliceBuild = builderAddText.build();
            md8.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }

        private b() {
        }
    }

    public C12942t7(@yfb CharSequence charSequence, @yfb PendingIntent pendingIntent, @gib CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, CommonWebViewActivity.f26185L);
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        this.f83913a = charSequence;
        this.f83914b = pendingIntent;
        this.f83915c = charSequence2;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    @c5e(28)
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @igg({"WrongConstant"})
    public static final C12942t7 fromSlice(@yfb Slice slice) {
        return f83906d.fromSlice(slice);
    }

    @c5e(28)
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @yfb
    public static final Slice toSlice(@yfb C12942t7 c12942t7) {
        return f83906d.toSlice(c12942t7);
    }

    @yfb
    public final PendingIntent getPendingIntent() {
        return this.f83914b;
    }

    @gib
    public final CharSequence getSubtitle() {
        return this.f83915c;
    }

    @yfb
    public final CharSequence getTitle() {
        return this.f83913a;
    }

    public /* synthetic */ C12942t7(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, int i, jt3 jt3Var) {
        this(charSequence, pendingIntent, (i & 4) != 0 ? null : charSequence2);
    }
}
