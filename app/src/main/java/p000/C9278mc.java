package p000;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p000.AbstractC8767lc;

/* JADX INFO: renamed from: mc */
/* JADX INFO: loaded from: classes.dex */
public final class C9278mc {

    /* JADX INFO: renamed from: mc$a */
    public static class a extends AbstractC8767lc<Uri, Boolean> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Boolean> getSynchronousResult(@yfb Context context, @yfb Uri uri) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(uri, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb Uri uri) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            md8.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @yfb
        public final Boolean parseResult(int i, @gib Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* JADX INFO: renamed from: mc$b */
    @c5e(19)
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class b extends AbstractC8767lc<String, Uri> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f60516a;

        public b(@yfb String str) {
            md8.checkNotNullParameter(str, "mimeType");
            this.f60516a = str;
        }

        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Uri> getSynchronousResult(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f60516a).putExtra("android.intent.extra.TITLE", str);
            md8.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public final Uri parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @q64(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @i2e(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public b() {
            this("*/*");
        }
    }

    /* JADX INFO: renamed from: mc$c */
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class c extends AbstractC8767lc<String, Uri> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Uri> getSynchronousResult(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            md8.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public final Uri parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: mc$d */
    @c5e(18)
    public static class d extends AbstractC8767lc<String, List<Uri>> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f60517a = new a(null);

        /* JADX INFO: renamed from: mc$d$a */
        @c5e(18)
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final List<Uri> getClipDataUris$activity_release(@yfb Intent intent) {
                md8.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return l82.emptyList();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            private a() {
            }
        }

        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<List<Uri>> getSynchronousResult(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            md8.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        public final List<Uri> parseResult(int i, @gib Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = f60517a.getClipDataUris$activity_release(intent)) == null) ? l82.emptyList() : clipDataUris$activity_release;
        }
    }

    /* JADX INFO: renamed from: mc$e */
    @c5e(19)
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class e extends AbstractC8767lc<String[], Uri> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Uri> getSynchronousResult(@yfb Context context, @yfb String[] strArr) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(strArr, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb String[] strArr) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            md8.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public final Uri parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: mc$f */
    @c5e(21)
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class f extends AbstractC8767lc<Uri, Uri> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Uri> getSynchronousResult(@yfb Context context, @gib Uri uri) {
            md8.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @gib Uri uri) {
            md8.checkNotNullParameter(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public final Uri parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: mc$g */
    @c5e(19)
    public static class g extends AbstractC8767lc<String[], List<Uri>> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<List<Uri>> getSynchronousResult(@yfb Context context, @yfb String[] strArr) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(strArr, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb String[] strArr) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            md8.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        public final List<Uri> parseResult(int i, @gib Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = d.f60517a.getClipDataUris$activity_release(intent)) == null) ? l82.emptyList() : clipDataUris$activity_release;
        }
    }

    /* JADX INFO: renamed from: mc$h */
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static final class h extends AbstractC8767lc<Void, Uri> {
        @Override // p000.AbstractC8767lc
        @yfb
        public Intent createIntent(@yfb Context context, @gib Void r2) {
            md8.checkNotNullParameter(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            md8.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public Uri parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: mc$i */
    @c5e(19)
    public static class i extends AbstractC8767lc<qvc, List<Uri>> {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f60518b = new a(null);

        /* JADX INFO: renamed from: a */
        public final int f60519a;

        /* JADX INFO: renamed from: mc$i$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @igg({"NewApi", "ClassVerificationFailure"})
            public final int getMaxItems$activity_release() {
                if (j.f60520a.isSystemPickerAvailable$activity_release()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            private a() {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<List<Uri>> getSynchronousResult(@yfb Context context, @yfb qvc qvcVar) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(qvcVar, "input");
            return null;
        }

        public /* synthetic */ i(int i, int i2, jt3 jt3Var) {
            this((i2 & 1) != 0 ? f60518b.getMaxItems$activity_release() : i);
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @igg({"NewApi", "ClassVerificationFailure"})
        @un1
        public Intent createIntent(@yfb Context context, @yfb qvc qvcVar) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(qvcVar, "input");
            j.a aVar = j.f60520a;
            if (aVar.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.getVisualMimeType$activity_release(qvcVar.getMediaType()));
                if (this.f60519a > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f60519a);
                return intent;
            }
            if (aVar.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = aVar.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                Intent intent2 = new Intent(j.f60521b);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.getVisualMimeType$activity_release(qvcVar.getMediaType()));
                intent2.putExtra(j.f60524e, this.f60519a);
                return intent2;
            }
            if (aVar.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = aVar.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                Intent intent3 = new Intent(j.f60523d);
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra(j.f60524e, this.f60519a);
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(aVar.getVisualMimeType$activity_release(qvcVar.getMediaType()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent4;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        public final List<Uri> parseResult(int i, @gib Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = d.f60517a.getClipDataUris$activity_release(intent)) == null) ? l82.emptyList() : clipDataUris$activity_release;
        }

        public i(int i) {
            this.f60519a = i;
            if (i <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
    }

    /* JADX INFO: renamed from: mc$j */
    @c5e(19)
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class j extends AbstractC8767lc<qvc, Uri> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f60520a = new a(null);

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f60521b = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* JADX INFO: renamed from: c */
        @yfb
        public static final String f60522c = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: d */
        @yfb
        public static final String f60523d = "com.google.android.gms.provider.action.PICK_IMAGES";

        /* JADX INFO: renamed from: e */
        @yfb
        public static final String f60524e = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: mc$j$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }

            @do8
            @gib
            public final ResolveInfo getGmsPicker$activity_release(@yfb Context context) {
                md8.checkNotNullParameter(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f60523d), jhc.f50567d);
            }

            @do8
            @gib
            public final ResolveInfo getSystemFallbackPicker$activity_release(@yfb Context context) {
                md8.checkNotNullParameter(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f60521b), jhc.f50567d);
            }

            @gib
            public final String getVisualMimeType$activity_release(@yfb f fVar) {
                md8.checkNotNullParameter(fVar, "input");
                if (fVar instanceof c) {
                    return "image/*";
                }
                if (fVar instanceof e) {
                    return "video/*";
                }
                if (fVar instanceof d) {
                    return ((d) fVar).getMimeType();
                }
                if (fVar instanceof b) {
                    return null;
                }
                throw new ceb();
            }

            @do8
            public final boolean isGmsPickerAvailable$activity_release(@yfb Context context) {
                md8.checkNotNullParameter(context, "context");
                return getGmsPicker$activity_release(context) != null;
            }

            @do8
            @igg({"ClassVerificationFailure", "NewApi"})
            @q64(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @i2e(expression = "isPhotoPickerAvailable(context)", imports = {}))
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            @do8
            public final boolean isSystemFallbackPickerAvailable$activity_release(@yfb Context context) {
                md8.checkNotNullParameter(context, "context");
                return getSystemFallbackPicker$activity_release(context) != null;
            }

            @do8
            @igg({"ClassVerificationFailure", "NewApi"})
            public final boolean isSystemPickerAvailable$activity_release() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            private a() {
            }

            @do8
            @igg({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable(@yfb Context context) {
                md8.checkNotNullParameter(context, "context");
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
            }
        }

        /* JADX INFO: renamed from: mc$j$b */
        public static final class b implements f {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final b f60525a = new b();

            private b() {
            }
        }

        /* JADX INFO: renamed from: mc$j$c */
        public static final class c implements f {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final c f60526a = new c();

            private c() {
            }
        }

        /* JADX INFO: renamed from: mc$j$d */
        public static final class d implements f {

            /* JADX INFO: renamed from: a */
            @yfb
            public final String f60527a;

            public d(@yfb String str) {
                md8.checkNotNullParameter(str, "mimeType");
                this.f60527a = str;
            }

            @yfb
            public final String getMimeType() {
                return this.f60527a;
            }
        }

        /* JADX INFO: renamed from: mc$j$e */
        public static final class e implements f {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final e f60528a = new e();

            private e() {
            }
        }

        /* JADX INFO: renamed from: mc$j$f */
        public interface f {
        }

        @do8
        @igg({"ClassVerificationFailure", "NewApi"})
        @q64(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @i2e(expression = "isPhotoPickerAvailable(context)", imports = {}))
        public static final boolean isPhotoPickerAvailable() {
            return f60520a.isPhotoPickerAvailable();
        }

        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Uri> getSynchronousResult(@yfb Context context, @yfb qvc qvcVar) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(qvcVar, "input");
            return null;
        }

        @do8
        @igg({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable(@yfb Context context) {
            return f60520a.isPhotoPickerAvailable(context);
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb qvc qvcVar) {
            Intent intent;
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(qvcVar, "input");
            a aVar = f60520a;
            if (aVar.isSystemPickerAvailable$activity_release()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(aVar.getVisualMimeType$activity_release(qvcVar.getMediaType()));
                return intent2;
            }
            if (aVar.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = aVar.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                intent = new Intent(f60521b);
                intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setType(aVar.getVisualMimeType$activity_release(qvcVar.getMediaType()));
            } else {
                if (!aVar.isGmsPickerAvailable$activity_release(context)) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(aVar.getVisualMimeType$activity_release(qvcVar.getMediaType()));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
                ResolveInfo gmsPicker$activity_release = aVar.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                intent = new Intent(f60523d);
                intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent.setType(aVar.getVisualMimeType$activity_release(qvcVar.getMediaType()));
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public final Uri parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) v82.firstOrNull((List) d.f60517a.getClipDataUris$activity_release(intent));
            }
            return data;
        }
    }

    /* JADX INFO: renamed from: mc$k */
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
    public static final class k extends AbstractC8767lc<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f60529a = new a(null);

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f60530b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: c */
        @yfb
        public static final String f60531c = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: d */
        @yfb
        public static final String f60532d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: renamed from: mc$k$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final Intent createIntent$activity_release(@yfb String[] strArr) {
                md8.checkNotNullParameter(strArr, "input");
                Intent intentPutExtra = new Intent(k.f60530b).putExtra(k.f60531c, strArr);
                md8.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }

            private a() {
            }
        }

        @Override // p000.AbstractC8767lc
        @yfb
        public Intent createIntent(@yfb Context context, @yfb String[] strArr) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(strArr, "input");
            return f60529a.createIntent$activity_release(strArr);
        }

        @Override // p000.AbstractC8767lc
        @gib
        public AbstractC8767lc.a<Map<String, Boolean>> getSynchronousResult(@yfb Context context, @yfb String[] strArr) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(strArr, "input");
            if (strArr.length == 0) {
                return new AbstractC8767lc.a<>(xt9.emptyMap());
            }
            for (String str : strArr) {
                if (lx2.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(strArr.length), 16));
            for (String str2 : strArr) {
                scc sccVarM24050to = vkh.m24050to(str2, Boolean.TRUE);
                linkedHashMap.put(sccVarM24050to.getFirst(), sccVarM24050to.getSecond());
            }
            return new AbstractC8767lc.a<>(linkedHashMap);
        }

        @Override // p000.AbstractC8767lc
        @yfb
        public Map<String, Boolean> parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                return xt9.emptyMap();
            }
            if (intent == null) {
                return xt9.emptyMap();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f60531c);
            int[] intArrayExtra = intent.getIntArrayExtra(f60532d);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return xt9.emptyMap();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            return xt9.toMap(v82.zip(e80.filterNotNull(stringArrayExtra), arrayList));
        }
    }

    /* JADX INFO: renamed from: mc$l */
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
    public static final class l extends AbstractC8767lc<String, Boolean> {
        @Override // p000.AbstractC8767lc
        @yfb
        public Intent createIntent(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            return k.f60529a.createIntent$activity_release(new String[]{str});
        }

        @Override // p000.AbstractC8767lc
        @gib
        public AbstractC8767lc.a<Boolean> getSynchronousResult(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "input");
            if (lx2.checkSelfPermission(context, str) == 0) {
                return new AbstractC8767lc.a<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @yfb
        public Boolean parseResult(int i, @gib Intent intent) {
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(k.f60532d);
            boolean z = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: mc$m */
    public static final class m extends AbstractC8767lc<Intent, ActivityResult> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f60533a = new a(null);

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f60534b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX INFO: renamed from: mc$m$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private a() {
            }
        }

        @Override // p000.AbstractC8767lc
        @yfb
        public Intent createIntent(@yfb Context context, @yfb Intent intent) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(intent, "input");
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @yfb
        public ActivityResult parseResult(int i, @gib Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: renamed from: mc$n */
    public static final class n extends AbstractC8767lc<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f60535a = new a(null);

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f60536b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: c */
        @yfb
        public static final String f60537c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: d */
        @yfb
        public static final String f60538d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: renamed from: mc$n$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private a() {
            }
        }

        @Override // p000.AbstractC8767lc
        @yfb
        public Intent createIntent(@yfb Context context, @yfb IntentSenderRequest intentSenderRequest) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(intentSenderRequest, "input");
            Intent intentPutExtra = new Intent(f60536b).putExtra(f60537c, intentSenderRequest);
            md8.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @yfb
        public ActivityResult parseResult(int i, @gib Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: renamed from: mc$o */
    public static class o extends AbstractC8767lc<Uri, Boolean> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Boolean> getSynchronousResult(@yfb Context context, @yfb Uri uri) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(uri, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb Uri uri) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            md8.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @yfb
        public final Boolean parseResult(int i, @gib Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* JADX INFO: renamed from: mc$p */
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class p extends AbstractC8767lc<Void, Bitmap> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Bitmap> getSynchronousResult(@yfb Context context, @gib Void r2) {
            md8.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @gib Void r2) {
            md8.checkNotNullParameter(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public final Bitmap parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: mc$q */
    @dwf({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    @q64(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class q extends AbstractC8767lc<Uri, Bitmap> {
        @Override // p000.AbstractC8767lc
        @gib
        public final AbstractC8767lc.a<Bitmap> getSynchronousResult(@yfb Context context, @yfb Uri uri) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(uri, "input");
            return null;
        }

        @Override // p000.AbstractC8767lc
        @yfb
        @un1
        public Intent createIntent(@yfb Context context, @yfb Uri uri) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            md8.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC8767lc
        @gib
        public final Bitmap parseResult(int i, @gib Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private C9278mc() {
    }
}
