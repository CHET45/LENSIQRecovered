package com.eyevue.glassapp.view.photo;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.eyevue.glassapp.utils.photo.FileUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.dwf;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.l82;
import p000.md8;
import p000.ru6;
import p000.yfb;

/* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.a */
/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nImageVideoFragmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVideoFragmentAdapter.kt\ncom/eyevue/glassapp/view/photo/ImageVideoFragmentAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1755#2,3:101\n*S KotlinDebug\n*F\n+ 1 ImageVideoFragmentAdapter.kt\ncom/eyevue/glassapp/view/photo/ImageVideoFragmentAdapter\n*L\n81#1:101,3\n*E\n"})
@e0g(parameters = 0)
public final class C2865a extends ru6 {

    /* JADX INFO: renamed from: n */
    @yfb
    public static final a f19000n = new a(null);

    /* JADX INFO: renamed from: o */
    public static final int f19001o = 8;

    /* JADX INFO: renamed from: p */
    @yfb
    public static final String f19002p = "isVideo";

    /* JADX INFO: renamed from: q */
    @yfb
    public static final String f19003q = "url";

    /* JADX INFO: renamed from: r */
    @yfb
    public static final String f19004r = "position";

    /* JADX INFO: renamed from: l */
    @yfb
    public final FragmentActivity f19005l;

    /* JADX INFO: renamed from: m */
    @yfb
    public List<String> f19006m;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.a$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C2865a(FragmentActivity fragmentActivity, List list, int i, jt3 jt3Var) {
        this(fragmentActivity, (i & 2) != 0 ? l82.emptyList() : list);
    }

    @Override // p000.ru6
    public boolean containsItem(long j) {
        List<String> list = this.f19006m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).hashCode() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ru6
    @yfb
    public Fragment createFragment(int i) {
        String str = this.f19006m.get(i);
        Log.e("ltttt", "文件:" + str + "::::" + i);
        if (FileUtils.isVideoFile(str)) {
            return VideoFragment.f18979a2.newInstance(str, i);
        }
        if (!FileUtils.isAudioFile(str)) {
            return ImageFragment.f18859k2.newInstance(str, i);
        }
        AudioFragment audioFragmentNewInstance = AudioFragment.newInstance(str, i);
        md8.checkNotNull(audioFragmentNewInstance);
        return audioFragmentNewInstance;
    }

    @yfb
    public final List<String> getData() {
        return this.f19006m;
    }

    @gib
    public final Fragment getFragmentAt(int i) {
        long itemId = getItemId(i);
        StringBuilder sb = new StringBuilder();
        sb.append('f');
        sb.append(itemId);
        return this.f19005l.getSupportFragmentManager().findFragmentByTag(sb.toString());
    }

    @gib
    public final String getItemAt(int i) {
        if (i < 0 || i >= this.f19006m.size()) {
            return null;
        }
        return this.f19006m.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f19006m.size();
    }

    @Override // p000.ru6, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (i < 0 || i >= this.f19006m.size()) {
            return -1L;
        }
        return this.f19006m.get(i).hashCode();
    }

    public final void setNewList(@yfb List<String> list) {
        md8.checkNotNullParameter(list, "newFiles");
        this.f19006m = list;
        notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2865a(@yfb FragmentActivity fragmentActivity, @yfb List<String> list) {
        super(fragmentActivity);
        md8.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        md8.checkNotNullParameter(list, "files");
        this.f19005l = fragmentActivity;
        this.f19006m = list;
    }
}
