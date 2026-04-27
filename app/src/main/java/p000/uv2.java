package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class uv2 {

    /* JADX INFO: renamed from: b */
    public static final int f89194b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f89195c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f89196d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f89197e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f89198f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f89199g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f89200h = 1;

    /* JADX INFO: renamed from: a */
    @efb
    public final InterfaceC13732g f89201a;

    /* JADX INFO: renamed from: uv2$a */
    @c5e(31)
    public static final class C13726a {
        private C13726a() {
        }

        @efb
        @ih4
        public static Pair<ContentInfo, ContentInfo> partition(@efb ContentInfo contentInfo, @efb final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair<ClipData, ClipData> pairM23593c = uv2.m23593c(clip, new o8d() { // from class: tv2
                    @Override // p000.o8d
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return pairM23593c.first == null ? Pair.create(null, contentInfo) : pairM23593c.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairM23593c.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairM23593c.second).build());
            }
            boolean zTest = predicate.test(clip.getItemAt(0));
            ContentInfo contentInfo2 = zTest ? contentInfo : null;
            if (zTest) {
                contentInfo = null;
            }
            return Pair.create(contentInfo2, contentInfo);
        }
    }

    /* JADX INFO: renamed from: uv2$d */
    public interface InterfaceC13729d {
        @efb
        uv2 build();

        void setClip(@efb ClipData clipData);

        void setExtras(@hib Bundle bundle);

        void setFlags(int i);

        void setLinkUri(@hib Uri uri);

        void setSource(int i);
    }

    /* JADX INFO: renamed from: uv2$f */
    @c5e(31)
    public static final class C13731f implements InterfaceC13732g {

        /* JADX INFO: renamed from: a */
        @efb
        public final ContentInfo f89209a;

        public C13731f(@efb ContentInfo contentInfo) {
            this.f89209a = sv2.m22263a(z7d.checkNotNull(contentInfo));
        }

        @Override // p000.uv2.InterfaceC13732g
        @efb
        public ClipData getClip() {
            return this.f89209a.getClip();
        }

        @Override // p000.uv2.InterfaceC13732g
        @hib
        public Bundle getExtras() {
            return this.f89209a.getExtras();
        }

        @Override // p000.uv2.InterfaceC13732g
        public int getFlags() {
            return this.f89209a.getFlags();
        }

        @Override // p000.uv2.InterfaceC13732g
        @hib
        public Uri getLinkUri() {
            return this.f89209a.getLinkUri();
        }

        @Override // p000.uv2.InterfaceC13732g
        public int getSource() {
            return this.f89209a.getSource();
        }

        @Override // p000.uv2.InterfaceC13732g
        @efb
        public ContentInfo getWrapped() {
            return this.f89209a;
        }

        @efb
        public String toString() {
            return "ContentInfoCompat{" + this.f89209a + "}";
        }
    }

    /* JADX INFO: renamed from: uv2$g */
    public interface InterfaceC13732g {
        @efb
        ClipData getClip();

        @hib
        Bundle getExtras();

        int getFlags();

        @hib
        Uri getLinkUri();

        int getSource();

        @hib
        ContentInfo getWrapped();
    }

    /* JADX INFO: renamed from: uv2$h */
    public static final class C13733h implements InterfaceC13732g {

        /* JADX INFO: renamed from: a */
        @efb
        public final ClipData f89210a;

        /* JADX INFO: renamed from: b */
        public final int f89211b;

        /* JADX INFO: renamed from: c */
        public final int f89212c;

        /* JADX INFO: renamed from: d */
        @hib
        public final Uri f89213d;

        /* JADX INFO: renamed from: e */
        @hib
        public final Bundle f89214e;

        public C13733h(C13730e c13730e) {
            this.f89210a = (ClipData) z7d.checkNotNull(c13730e.f89204a);
            this.f89211b = z7d.checkArgumentInRange(c13730e.f89205b, 0, 5, "source");
            this.f89212c = z7d.checkFlagsArgument(c13730e.f89206c, 1);
            this.f89213d = c13730e.f89207d;
            this.f89214e = c13730e.f89208e;
        }

        @Override // p000.uv2.InterfaceC13732g
        @efb
        public ClipData getClip() {
            return this.f89210a;
        }

        @Override // p000.uv2.InterfaceC13732g
        @hib
        public Bundle getExtras() {
            return this.f89214e;
        }

        @Override // p000.uv2.InterfaceC13732g
        public int getFlags() {
            return this.f89212c;
        }

        @Override // p000.uv2.InterfaceC13732g
        @hib
        public Uri getLinkUri() {
            return this.f89213d;
        }

        @Override // p000.uv2.InterfaceC13732g
        public int getSource() {
            return this.f89211b;
        }

        @Override // p000.uv2.InterfaceC13732g
        @hib
        public ContentInfo getWrapped() {
            return null;
        }

        @efb
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f89210a.getDescription());
            sb.append(", source=");
            sb.append(uv2.m23594d(this.f89211b));
            sb.append(", flags=");
            sb.append(uv2.m23592b(this.f89212c));
            if (this.f89213d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f89213d.toString().length() + c0b.f15434d;
            }
            sb.append(str);
            sb.append(this.f89214e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: uv2$i */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC13734i {
    }

    /* JADX INFO: renamed from: uv2$j */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC13735j {
    }

    public uv2(@efb InterfaceC13732g interfaceC13732g) {
        this.f89201a = interfaceC13732g;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static ClipData m23591a(@efb ClipDescription clipDescription, @efb List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: b */
    public static String m23592b(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    @efb
    /* JADX INFO: renamed from: c */
    public static Pair<ClipData, ClipData> m23593c(@efb ClipData clipData, @efb o8d<ClipData.Item> o8dVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (o8dVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(m23591a(clipData.getDescription(), arrayList), m23591a(clipData.getDescription(), arrayList2));
    }

    @efb
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: d */
    public static String m23594d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @c5e(31)
    @efb
    public static uv2 toContentInfoCompat(@efb ContentInfo contentInfo) {
        return new uv2(new C13731f(contentInfo));
    }

    @efb
    public ClipData getClip() {
        return this.f89201a.getClip();
    }

    @hib
    public Bundle getExtras() {
        return this.f89201a.getExtras();
    }

    public int getFlags() {
        return this.f89201a.getFlags();
    }

    @hib
    public Uri getLinkUri() {
        return this.f89201a.getLinkUri();
    }

    public int getSource() {
        return this.f89201a.getSource();
    }

    @efb
    public Pair<uv2, uv2> partition(@efb o8d<ClipData.Item> o8dVar) {
        ClipData clip = this.f89201a.getClip();
        if (clip.getItemCount() == 1) {
            boolean zTest = o8dVar.test(clip.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair<ClipData, ClipData> pairM23593c = m23593c(clip, o8dVar);
        return pairM23593c.first == null ? Pair.create(null, this) : pairM23593c.second == null ? Pair.create(this, null) : Pair.create(new C13727b(this).setClip((ClipData) pairM23593c.first).build(), new C13727b(this).setClip((ClipData) pairM23593c.second).build());
    }

    @c5e(31)
    @efb
    public ContentInfo toContentInfo() {
        ContentInfo wrapped = this.f89201a.getWrapped();
        Objects.requireNonNull(wrapped);
        return sv2.m22263a(wrapped);
    }

    @efb
    public String toString() {
        return this.f89201a.toString();
    }

    /* JADX INFO: renamed from: uv2$c */
    @c5e(31)
    public static final class C13728c implements InterfaceC13729d {

        /* JADX INFO: renamed from: a */
        @efb
        public final ContentInfo.Builder f89203a;

        public C13728c(@efb ClipData clipData, int i) {
            this.f89203a = bw2.m3461a(clipData, i);
        }

        @Override // p000.uv2.InterfaceC13729d
        @efb
        public uv2 build() {
            return new uv2(new C13731f(this.f89203a.build()));
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setClip(@efb ClipData clipData) {
            this.f89203a.setClip(clipData);
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setExtras(@hib Bundle bundle) {
            this.f89203a.setExtras(bundle);
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setFlags(int i) {
            this.f89203a.setFlags(i);
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setLinkUri(@hib Uri uri) {
            this.f89203a.setLinkUri(uri);
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setSource(int i) {
            this.f89203a.setSource(i);
        }

        public C13728c(@efb uv2 uv2Var) {
            dw2.m9496a();
            this.f89203a = cw2.m8761a(uv2Var.toContentInfo());
        }
    }

    /* JADX INFO: renamed from: uv2$e */
    public static final class C13730e implements InterfaceC13729d {

        /* JADX INFO: renamed from: a */
        @efb
        public ClipData f89204a;

        /* JADX INFO: renamed from: b */
        public int f89205b;

        /* JADX INFO: renamed from: c */
        public int f89206c;

        /* JADX INFO: renamed from: d */
        @hib
        public Uri f89207d;

        /* JADX INFO: renamed from: e */
        @hib
        public Bundle f89208e;

        public C13730e(@efb ClipData clipData, int i) {
            this.f89204a = clipData;
            this.f89205b = i;
        }

        @Override // p000.uv2.InterfaceC13729d
        @efb
        public uv2 build() {
            return new uv2(new C13733h(this));
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setClip(@efb ClipData clipData) {
            this.f89204a = clipData;
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setExtras(@hib Bundle bundle) {
            this.f89208e = bundle;
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setFlags(int i) {
            this.f89206c = i;
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setLinkUri(@hib Uri uri) {
            this.f89207d = uri;
        }

        @Override // p000.uv2.InterfaceC13729d
        public void setSource(int i) {
            this.f89205b = i;
        }

        public C13730e(@efb uv2 uv2Var) {
            this.f89204a = uv2Var.getClip();
            this.f89205b = uv2Var.getSource();
            this.f89206c = uv2Var.getFlags();
            this.f89207d = uv2Var.getLinkUri();
            this.f89208e = uv2Var.getExtras();
        }
    }

    /* JADX INFO: renamed from: uv2$b */
    public static final class C13727b {

        /* JADX INFO: renamed from: a */
        @efb
        public final InterfaceC13729d f89202a;

        public C13727b(@efb uv2 uv2Var) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f89202a = new C13728c(uv2Var);
            } else {
                this.f89202a = new C13730e(uv2Var);
            }
        }

        @efb
        public uv2 build() {
            return this.f89202a.build();
        }

        @efb
        public C13727b setClip(@efb ClipData clipData) {
            this.f89202a.setClip(clipData);
            return this;
        }

        @efb
        public C13727b setExtras(@hib Bundle bundle) {
            this.f89202a.setExtras(bundle);
            return this;
        }

        @efb
        public C13727b setFlags(int i) {
            this.f89202a.setFlags(i);
            return this;
        }

        @efb
        public C13727b setLinkUri(@hib Uri uri) {
            this.f89202a.setLinkUri(uri);
            return this;
        }

        @efb
        public C13727b setSource(int i) {
            this.f89202a.setSource(i);
            return this;
        }

        public C13727b(@efb ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f89202a = new C13728c(clipData, i);
            } else {
                this.f89202a = new C13730e(clipData, i);
            }
        }
    }

    @c5e(31)
    @efb
    public static Pair<ContentInfo, ContentInfo> partition(@efb ContentInfo contentInfo, @efb Predicate<ClipData.Item> predicate) {
        return C13726a.partition(contentInfo, predicate);
    }
}
