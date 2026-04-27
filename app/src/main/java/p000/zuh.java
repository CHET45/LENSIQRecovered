package p000;

import android.net.Uri;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class zuh extends yhc {

    /* JADX INFO: renamed from: c */
    public final Uri f106135c;

    /* JADX INFO: renamed from: d */
    public final kx7<huf> f106136d;

    @Deprecated
    @p28(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(message, uri, ImmutableList.of())")
    public zuh(String str, Uri uri) {
        this(str, uri, kx7.m15110of());
    }

    public zuh(String str, Uri uri, List<? extends huf> list) {
        super(str, null, false, 1);
        this.f106135c = uri;
        this.f106136d = kx7.copyOf((Collection) list);
    }
}
