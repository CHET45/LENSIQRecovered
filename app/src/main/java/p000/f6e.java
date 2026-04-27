package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f6e implements b6e<Uri, Drawable> {

    /* JADX INFO: renamed from: b */
    public static final String f35500b = "android";

    /* JADX INFO: renamed from: c */
    public static final int f35501c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f35502d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f35503e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f35504f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f35505g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f35506h = 0;

    /* JADX INFO: renamed from: a */
    public final Context f35507a;

    public f6e(Context context) {
        this.f35507a = context.getApplicationContext();
    }

    @efb
    private Context findContextForPackage(Uri uri, String str) {
        if (str.equals(this.f35507a.getPackageName())) {
            return this.f35507a;
        }
        try {
            return this.f35507a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f35507a.getPackageName())) {
                return this.f35507a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @gq4
    private int findResourceIdFromResourceIdUri(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    @gq4
    private int findResourceIdFromTypeAndNameResourceUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @gq4
    private int findResourceIdFromUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return findResourceIdFromTypeAndNameResourceUri(context, uri);
        }
        if (pathSegments.size() == 1) {
            return findResourceIdFromResourceIdUri(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p000.b6e
    @hib
    public t5e<Drawable> decode(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        Context contextFindContextForPackage = findContextForPackage(uri, uri.getAuthority());
        return ifb.m13011a(cq4.getDrawable(this.f35507a, contextFindContextForPackage, findResourceIdFromUri(contextFindContextForPackage, uri)));
    }

    @Override // p000.b6e
    public boolean handles(@efb Uri uri, @efb i7c i7cVar) {
        return uri.getScheme().equals("android.resource");
    }
}
