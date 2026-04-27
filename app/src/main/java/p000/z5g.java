package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class z5g extends se9<InputStream> {

    /* JADX INFO: renamed from: C */
    public static final int f104255C = 4;

    /* JADX INFO: renamed from: F */
    public static final int f104256F = 5;

    /* JADX INFO: renamed from: H */
    public static final UriMatcher f104257H;

    /* JADX INFO: renamed from: e */
    public static final int f104258e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f104259f = 2;

    /* JADX INFO: renamed from: m */
    public static final int f104260m = 3;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f104257H = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public z5g(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream loadResourceFromUri(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f104257H.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return openContactPhotoInputStream(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return openContactPhotoInputStream(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    private InputStream openContactPhotoInputStream(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // p000.se9
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21862a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p000.se9
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo21863b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamLoadResourceFromUri = loadResourceFromUri(uri, contentResolver);
        if (inputStreamLoadResourceFromUri != null) {
            return inputStreamLoadResourceFromUri;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    @Override // p000.bg3
    @efb
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }
}
