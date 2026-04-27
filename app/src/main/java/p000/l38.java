package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000.uv2;

/* JADX INFO: loaded from: classes3.dex */
@igg({"PrivateConstructorForUtilityClass"})
public final class l38 {

    /* JADX INFO: renamed from: a */
    public static final String f56086a = "InputConnectionCompat";

    /* JADX INFO: renamed from: b */
    public static final String f56087b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: c */
    public static final String f56088c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: d */
    public static final String f56089d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: e */
    public static final String f56090e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: f */
    public static final String f56091f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: g */
    public static final String f56092g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: h */
    public static final String f56093h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: i */
    public static final String f56094i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: j */
    public static final String f56095j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: k */
    public static final String f56096k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: l */
    public static final String f56097l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: m */
    public static final String f56098m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: n */
    public static final String f56099n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: o */
    public static final String f56100o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: p */
    public static final int f56101p = 1;

    /* JADX INFO: renamed from: q */
    public static final String f56102q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* JADX INFO: renamed from: l38$a */
    public class C8599a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8602d f56103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8599a(InputConnection inputConnection, boolean z, InterfaceC8602d interfaceC8602d) {
            super(inputConnection, z);
            this.f56103a = interfaceC8602d;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f56103a.onCommitContent(m38.wrap(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* JADX INFO: renamed from: l38$b */
    public class C8600b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8602d f56104a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8600b(InputConnection inputConnection, boolean z, InterfaceC8602d interfaceC8602d) {
            super(inputConnection, z);
            this.f56104a = interfaceC8602d;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (l38.m15298b(str, bundle, this.f56104a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: renamed from: l38$c */
    @c5e(25)
    public static class C8601c {
        private C8601c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m15299a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* JADX INFO: renamed from: l38$d */
    public interface InterfaceC8602d {
        boolean onCommitContent(@efb m38 m38Var, int i, @hib Bundle bundle);
    }

    @Deprecated
    public l38() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: b */
    public static boolean m15298b(@hib String str, @hib Bundle bundle, @efb InterfaceC8602d interfaceC8602d) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        ?? OnCommitContent = 0;
        OnCommitContent = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f56087b, str)) {
            z = false;
        } else {
            if (!TextUtils.equals(f56088c, str)) {
                return false;
            }
            z = true;
        }
        try {
            resultReceiver2 = (ResultReceiver) bundle.getParcelable(z ? f56100o : f56099n);
        } catch (Throwable th) {
            th = th;
            resultReceiver = null;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z ? f56090e : f56089d);
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? f56092g : f56091f);
            Uri uri2 = (Uri) bundle.getParcelable(z ? f56094i : f56093h);
            int i = bundle.getInt(z ? f56098m : f56097l);
            Bundle bundle2 = (Bundle) bundle.getParcelable(z ? f56096k : f56095j);
            if (uri != null && clipDescription != null) {
                OnCommitContent = interfaceC8602d.onCommitContent(new m38(uri, clipDescription, uri2), i, bundle2);
            }
            if (resultReceiver2 != 0) {
                resultReceiver2.send(OnCommitContent, null);
            }
            return OnCommitContent;
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = resultReceiver2;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    public static boolean commitContent(@efb InputConnection inputConnection, @efb EditorInfo editorInfo, @efb m38 m38Var, int i, @hib Bundle bundle) {
        return C8601c.m15299a(inputConnection, (InputContentInfo) m38Var.unwrap(), i, bundle);
    }

    @efb
    private static InterfaceC8602d createOnCommitContentListenerUsingPerformReceiveContent(@efb final View view) {
        z7d.checkNotNull(view);
        return new InterfaceC8602d() { // from class: k38
            @Override // p000.l38.InterfaceC8602d
            public final boolean onCommitContent(m38 m38Var, int i, Bundle bundle) {
                return l38.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(view, m38Var, i, bundle);
            }
        };
    }

    @efb
    @Deprecated
    public static InputConnection createWrapper(@efb InputConnection inputConnection, @efb EditorInfo editorInfo, @efb InterfaceC8602d interfaceC8602d) {
        pkb.requireNonNull(inputConnection, "inputConnection must be non-null");
        pkb.requireNonNull(editorInfo, "editorInfo must be non-null");
        pkb.requireNonNull(interfaceC8602d, "onCommitContentListener must be non-null");
        return new C8599a(inputConnection, false, interfaceC8602d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(View view, m38 m38Var, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                m38Var.requestPermission();
                Parcelable parcelable = (Parcelable) m38Var.unwrap();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f56102q, parcelable);
            } catch (Exception e) {
                Log.w(f56086a, "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return o8i.performReceiveContent(view, new uv2.C13727b(new ClipData(m38Var.getDescription(), new ClipData.Item(m38Var.getContentUri())), 2).setLinkUri(m38Var.getLinkUri()).setExtras(bundle).build()) == null;
    }

    @efb
    public static InputConnection createWrapper(@efb View view, @efb InputConnection inputConnection, @efb EditorInfo editorInfo) {
        return createWrapper(inputConnection, editorInfo, createOnCommitContentListenerUsingPerformReceiveContent(view));
    }
}
