package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.np6;

/* JADX INFO: loaded from: classes.dex */
public class so6 {

    /* JADX INFO: renamed from: a */
    public static final Comparator<byte[]> f82446a = new Comparator() { // from class: ro6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return so6.lambda$static$0((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: so6$a */
    public interface InterfaceC12714a {
        static InterfaceC12714a make(Context context, Uri uri) {
            return new C12716c(context, uri);
        }

        void close();

        Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    /* JADX INFO: renamed from: so6$b */
    public static class C12715b implements InterfaceC12714a {

        /* JADX INFO: renamed from: a */
        public final ContentProviderClient f82447a;

        public C12715b(Context context, Uri uri) {
            this.f82447a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p000.so6.InterfaceC12714a
        public void close() {
            ContentProviderClient contentProviderClient = this.f82447a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }

        @Override // p000.so6.InterfaceC12714a
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f82447a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: so6$c */
    @c5e(24)
    public static class C12716c implements InterfaceC12714a {

        /* JADX INFO: renamed from: a */
        public final ContentProviderClient f82448a;

        public C12716c(Context context, Uri uri) {
            this.f82448a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p000.so6.InterfaceC12714a
        public void close() {
            ContentProviderClient contentProviderClient = this.f82448a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // p000.so6.InterfaceC12714a
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f82448a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
    }

    private so6() {
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static np6.C9964b m22156b(@efb Context context, @efb to6 to6Var, @hib CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM22157c = m22157c(context.getPackageManager(), to6Var, context.getResources());
        return providerInfoM22157c == null ? np6.C9964b.m18050a(1, null) : np6.C9964b.m18050a(0, m22158d(context, to6Var, providerInfoM22157c.authority, cancellationSignal));
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: c */
    public static ProviderInfo m22157c(@efb PackageManager packageManager, @efb to6 to6Var, @hib Resources resources) throws PackageManager.NameNotFoundException {
        String providerAuthority = to6Var.getProviderAuthority();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(to6Var.getProviderPackage())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + to6Var.getProviderPackage());
        }
        List<byte[]> listConvertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listConvertToByteArrayList, f82446a);
        List<List<byte[]>> certificates = getCertificates(to6Var, resources);
        for (int i = 0; i < certificates.size(); i++) {
            ArrayList arrayList = new ArrayList(certificates.get(i));
            Collections.sort(arrayList, f82446a);
            if (equalsByteArrayList(listConvertToByteArrayList, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    @p000.efb
    @p000.fdi
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.np6.C9965c[] m22158d(android.content.Context r16, p000.to6 r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.so6.m22158d(android.content.Context, to6, java.lang.String, android.os.CancellationSignal):np6$c[]");
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> getCertificates(to6 to6Var, Resources resources) {
        return to6Var.getCertificates() != null ? to6Var.getCertificates() : yo6.readCerts(resources, to6Var.getCertificatesArrayResId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}
