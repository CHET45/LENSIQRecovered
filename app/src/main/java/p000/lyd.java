package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class lyd {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9039b f59259b = new C9039b(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f59260c = "RemoteEntry";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f59261d = "androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT";

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f59262e = "RemoteEntry";

    /* JADX INFO: renamed from: f */
    public static final int f59263f = 1;

    /* JADX INFO: renamed from: a */
    @yfb
    public final PendingIntent f59264a;

    /* JADX INFO: renamed from: lyd$a */
    public static final class C9038a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final PendingIntent f59265a;

        public C9038a(@yfb PendingIntent pendingIntent) {
            md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            this.f59265a = pendingIntent;
        }

        @yfb
        public final lyd build() {
            return new lyd(this.f59265a);
        }
    }

    /* JADX INFO: renamed from: lyd$b */
    @dwf({"SMAP\nRemoteEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteEntry.kt\nandroidx/credentials/provider/RemoteEntry$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1855#2,2:135\n*S KotlinDebug\n*F\n+ 1 RemoteEntry.kt\nandroidx/credentials/provider/RemoteEntry$Companion\n*L\n120#1:135,2\n*E\n"})
    public static final class C9039b {
        public /* synthetic */ C9039b(jt3 jt3Var) {
            this();
        }

        @c5e(28)
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @igg({"WrongConstant"})
        public final lyd fromSlice(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            List items = slice.getItems();
            md8.checkNotNullExpressionValue(items, "slice.items");
            Iterator it = items.iterator();
            PendingIntent action = null;
            while (it.hasNext()) {
                SliceItem sliceItemM26596a = C16022z7.m26596a(it.next());
                if (sliceItemM26596a.hasHint(lyd.f59261d)) {
                    action = sliceItemM26596a.getAction();
                }
            }
            try {
                md8.checkNotNull(action);
                return new lyd(action);
            } catch (Exception e) {
                Log.i("RemoteEntry", "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @c5e(28)
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @yfb
        public final Slice toSlice(@yfb lyd lydVar) {
            md8.checkNotNullParameter(lydVar, "remoteEntry");
            PendingIntent pendingIntent = lydVar.getPendingIntent();
            C14945x7.m25023a();
            Slice.Builder builderM23829a = C13895v7.m23829a(Uri.EMPTY, C6742h8.m12259a("RemoteEntry", 1));
            builderM23829a.addAction(pendingIntent, C14446w7.m24361a(builderM23829a).addHints(Collections.singletonList(lyd.f59261d)).build(), null);
            Slice sliceBuild = builderM23829a.build();
            md8.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }

        private C9039b() {
        }
    }

    public lyd(@yfb PendingIntent pendingIntent) {
        md8.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        this.f59264a = pendingIntent;
    }

    @c5e(28)
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @igg({"WrongConstant"})
    public static final lyd fromSlice(@yfb Slice slice) {
        return f59259b.fromSlice(slice);
    }

    @c5e(28)
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @yfb
    public static final Slice toSlice(@yfb lyd lydVar) {
        return f59259b.toSlice(lydVar);
    }

    @yfb
    public final PendingIntent getPendingIntent() {
        return this.f59264a;
    }
}
