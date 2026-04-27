package com.draggable.library.extension.glide;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestOptions;
import io.reactivex.Observable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p000.C2062bv;
import p000.a18;
import p000.afh;
import p000.bth;
import p000.cu0;
import p000.dsb;
import p000.gib;
import p000.gjf;
import p000.k77;
import p000.kz6;
import p000.le4;
import p000.lx2;
import p000.m9g;
import p000.md8;
import p000.mf4;
import p000.mlh;
import p000.mob;
import p000.npe;
import p000.pe4;
import p000.pj4;
import p000.qy6;
import p000.ske;
import p000.tu2;
import p000.xnc;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class GlideHelper {
    public static final GlideHelper INSTANCE = new GlideHelper();
    private static final String TAG = GlideHelper.class.getSimpleName();
    private static final String DOWNLOAD_FILE_NAME = "Download";

    private GlideHelper() {
    }

    public static final /* synthetic */ String access$getDOWNLOAD_FILE_NAME$p(GlideHelper glideHelper) {
        return DOWNLOAD_FILE_NAME;
    }

    public static final /* synthetic */ String access$getTAG$p(GlideHelper glideHelper) {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean copyFile(File file, String str, String str2) {
        if (file != null && !TextUtils.isEmpty(str)) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            } else {
                try {
                    file2.mkdirs();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            File file3 = new File(str + str2);
            if (file3.exists()) {
                file3.delete();
            } else {
                try {
                    file3.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                FileChannel channel = new FileInputStream(file).getChannel();
                FileChannel channel2 = new FileOutputStream(file3).getChannel();
                if (channel == null) {
                    md8.throwNpe();
                }
                channel.transferTo(0L, channel.size(), channel2);
                try {
                    channel.close();
                    if (channel2 == null) {
                        md8.throwNpe();
                    }
                    channel2.close();
                    return true;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return true;
                }
            } catch (FileNotFoundException e4) {
                e4.printStackTrace();
            } catch (IOException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean createFileByDeleteOldFile(String str) {
        return createFileByDeleteOldFile(getFileByPath(str));
    }

    private final boolean createOrExistsDir(File file) {
        if (file != null) {
            if (file.exists() ? file.isDirectory() : file.mkdirs()) {
                return true;
            }
        }
        return false;
    }

    private final File getFileByPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    private final boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageToGallery(Context context, File file) {
        try {
            MediaScannerConnection.scanFile(context.getApplicationContext(), new String[]{file.getAbsolutePath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.draggable.library.extension.glide.GlideHelper.saveImageToGallery.1
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri) {
                }
            });
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.parse(file.getAbsolutePath()));
            context.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toastInScreenCenter(Context context, String str) {
        Toast toastMakeText = Toast.makeText(context, str, 0);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }

    public final void checkImageIsInMemoryCache(@yfb Context context, @yfb String str, @yfb final qy6<? super Boolean, bth> qy6Var) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(str, "url");
        md8.checkParameterIsNotNull(qy6Var, "callback");
        ComponentCallbacks2C2485a.with(context).load(str).apply((cu0<?>) new RequestOptions().onlyRetrieveFromCache(true)).into(new gjf<Drawable>() { // from class: com.draggable.library.extension.glide.GlideHelper.checkImageIsInMemoryCache.1
            @Override // p000.gu0, p000.jmg
            public void onLoadFailed(@gib Drawable drawable) {
                super.onLoadFailed(drawable);
                qy6Var.invoke(Boolean.FALSE);
            }

            @Override // p000.jmg
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, afh afhVar) {
                onResourceReady((Drawable) obj, (afh<? super Drawable>) afhVar);
            }

            public void onResourceReady(@yfb Drawable drawable, @gib afh<? super Drawable> afhVar) {
                md8.checkParameterIsNotNull(drawable, "resource");
                qy6Var.invoke(Boolean.TRUE);
            }
        });
    }

    @gib
    public final mf4 downloadPicture(@yfb final Context context, @yfb final String str) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(str, "url");
        if (lx2.checkSelfPermission(context, xnc.f98580E) != 0) {
            toastInScreenCenter(context, "没有打开存储权限");
            return null;
        }
        toastInScreenCenter(context, "开始下载");
        return Observable.create(new dsb<T>() { // from class: com.draggable.library.extension.glide.GlideHelper.downloadPicture.1
            @Override // p000.dsb
            public final void subscribe(@yfb mob<File> mobVar) {
                md8.checkParameterIsNotNull(mobVar, "it");
                mobVar.onNext(ComponentCallbacks2C2485a.with(context).load(str).downloadOnly(Integer.MIN_VALUE, Integer.MIN_VALUE).get());
                mobVar.onComplete();
            }
        }).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).doOnNext(new tu2<File>() { // from class: com.draggable.library.extension.glide.GlideHelper.downloadPicture.2
            @Override // p000.tu2
            public final void accept(File file) {
                String strMd5Encode;
                String str2;
                int iLastIndexOf$default;
                int length;
                try {
                    String str3 = Environment.getExternalStorageDirectory().toString() + pj4.f71071b + GlideHelper.access$getDOWNLOAD_FILE_NAME$p(GlideHelper.INSTANCE) + pj4.f71071b;
                    try {
                        str2 = str;
                        iLastIndexOf$default = m9g.lastIndexOf$default((CharSequence) str2, pj4.f71071b, 0, false, 6, (Object) null) + 1;
                        length = str.length();
                    } catch (Exception e) {
                        e.printStackTrace();
                        strMd5Encode = String.valueOf(System.currentTimeMillis()) + "";
                    }
                    if (str2 == null) {
                        throw new mlh("null cannot be cast to non-null type java.lang.String");
                    }
                    String strSubstring = str2.substring(iLastIndexOf$default, length);
                    md8.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (m9g.contains$default((CharSequence) strSubstring, (CharSequence) ".", false, 2, (Object) null)) {
                        int iLastIndexOf$default2 = m9g.lastIndexOf$default((CharSequence) strSubstring, ".", 0, false, 6, (Object) null);
                        if (strSubstring == null) {
                            throw new mlh("null cannot be cast to non-null type java.lang.String");
                        }
                        strSubstring = strSubstring.substring(0, iLastIndexOf$default2);
                        md8.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    strMd5Encode = MD5Utils.INSTANCE.md5Encode(strSubstring);
                    GlideHelper glideHelper = GlideHelper.INSTANCE;
                    md8.checkExpressionValueIsNotNull(file, "file");
                    String absolutePath = file.getAbsolutePath();
                    md8.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                    String str4 = strMd5Encode + System.currentTimeMillis() + a18.f100c + glideHelper.getImageTypeWithMime(absolutePath);
                    glideHelper.createFileByDeleteOldFile(str3 + str4);
                    GlideHelper.access$getTAG$p(glideHelper);
                    StringBuilder sb = new StringBuilder();
                    sb.append("save file : ");
                    sb.append(str3);
                    sb.append(str4);
                    if (!glideHelper.copyFile(file, str3, str4)) {
                        glideHelper.toastInScreenCenter(context, "保存失败");
                    } else {
                        glideHelper.saveImageToGallery(context, new File(str3, str4));
                        glideHelper.toastInScreenCenter(context, "成功保存到系统相册");
                    }
                } catch (Exception e2) {
                    GlideHelper.access$getTAG$p(GlideHelper.INSTANCE);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("exception : ");
                    sb2.append(e2.getMessage());
                }
            }
        }).doOnError(new tu2<Throwable>() { // from class: com.draggable.library.extension.glide.GlideHelper.downloadPicture.3
            @Override // p000.tu2
            public final void accept(Throwable th) {
                GlideHelper.INSTANCE.toastInScreenCenter(context, "保存失败");
            }
        }).subscribe();
    }

    @yfb
    public final String getImageTypeWithMime(@yfb String str) {
        md8.checkParameterIsNotNull(str, "path");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        md8.checkExpressionValueIsNotNull(str2, "type");
        if (str2 == null) {
            throw new mlh("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(6);
        md8.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final boolean imageIsInCache(@yfb Context context, @yfb String str) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(str, "url");
        if (str.length() == 0) {
            return false;
        }
        try {
            pe4.C10929e c10929e = pe4.open(new File(context.getCacheDir(), "image_manager_disk_cache"), 1, 1, le4.InterfaceC8783a.f57349a).get(new ske().getSafeKey(new k77(str)));
            if (c10929e != null) {
                if (c10929e.getFile(0).exists()) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public final void retrieveImageWhRadioFromMemoryCache(@yfb Context context, @yfb final String str, @yfb final kz6<? super Boolean, ? super Float, ? super Boolean, bth> kz6Var) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(str, "thumbnailImg");
        md8.checkParameterIsNotNull(kz6Var, "retrieveCallBack");
        ComponentCallbacks2C2485a.with(context).load(str).apply((cu0<?>) new RequestOptions().onlyRetrieveFromCache(true)).into(new gjf<Drawable>() { // from class: com.draggable.library.extension.glide.GlideHelper.retrieveImageWhRadioFromMemoryCache.1
            @Override // p000.gu0, p000.jmg
            public void onLoadFailed(@gib Drawable drawable) {
                super.onLoadFailed(drawable);
                kz6 kz6Var2 = kz6Var;
                Boolean bool = Boolean.FALSE;
                kz6Var2.invoke(bool, Float.valueOf(-1.0f), bool);
            }

            @Override // p000.jmg
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, afh afhVar) {
                onResourceReady((Drawable) obj, (afh<? super Drawable>) afhVar);
            }

            public void onResourceReady(@yfb Drawable drawable, @gib afh<? super Drawable> afhVar) {
                md8.checkParameterIsNotNull(drawable, "resource");
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    kz6 kz6Var2 = kz6Var;
                    Boolean bool = Boolean.FALSE;
                    kz6Var2.invoke(bool, Float.valueOf(-1.0f), bool);
                } else {
                    GlideHelper.access$getTAG$p(GlideHelper.INSTANCE);
                    StringBuilder sb = new StringBuilder();
                    sb.append("从内存中检索到图片！！！！");
                    sb.append(str);
                    kz6Var.invoke(Boolean.TRUE, Float.valueOf((drawable.getIntrinsicWidth() * 1.0f) / drawable.getIntrinsicHeight()), Boolean.valueOf(drawable instanceof GifDrawable));
                }
            }
        });
    }

    private final boolean createFileByDeleteOldFile(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
