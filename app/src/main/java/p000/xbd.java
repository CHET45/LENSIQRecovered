package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class xbd {

    /* JADX INFO: renamed from: g */
    public static final String f97440g = "PrintHelper";

    /* JADX INFO: renamed from: h */
    public static final int f97441h = 3500;

    /* JADX INFO: renamed from: i */
    public static final boolean f97442i = true;

    /* JADX INFO: renamed from: j */
    public static final boolean f97443j = true;

    /* JADX INFO: renamed from: k */
    public static final int f97444k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f97445l = 2;

    /* JADX INFO: renamed from: m */
    @igg({"InlinedApi"})
    public static final int f97446m = 1;

    /* JADX INFO: renamed from: n */
    @igg({"InlinedApi"})
    public static final int f97447n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f97448o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f97449p = 2;

    /* JADX INFO: renamed from: a */
    public final Context f97450a;

    /* JADX INFO: renamed from: b */
    public BitmapFactory.Options f97451b = null;

    /* JADX INFO: renamed from: c */
    public final Object f97452c = new Object();

    /* JADX INFO: renamed from: d */
    public int f97453d = 2;

    /* JADX INFO: renamed from: e */
    public int f97454e = 2;

    /* JADX INFO: renamed from: f */
    public int f97455f = 1;

    /* JADX INFO: renamed from: xbd$a */
    public class AsyncTaskC15025a extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f97456a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PrintAttributes f97457b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bitmap f97458c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ PrintAttributes f97459d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f97460e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ParcelFileDescriptor f97461f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f97462g;

        public AsyncTaskC15025a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f97456a = cancellationSignal;
            this.f97457b = printAttributes;
            this.f97458c = bitmap;
            this.f97459d = printAttributes2;
            this.f97460e = i;
            this.f97461f = parcelFileDescriptor;
            this.f97462g = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f97456a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(xbd.this.f97450a, this.f97457b);
                Bitmap bitmapM25076a = xbd.m25076a(this.f97458c, this.f97457b.getColorMode());
                if (this.f97456a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z = xbd.f97443j;
                    if (z) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(xbd.this.f97450a, this.f97459d);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixM25077b = xbd.m25077b(bitmapM25076a.getWidth(), bitmapM25076a.getHeight(), rectF, this.f97460e);
                    if (!z) {
                        matrixM25077b.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapM25076a, matrixM25077b, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f97456a.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f97461f;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (bitmapM25076a != this.f97458c) {
                            bitmapM25076a.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f97461f.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f97461f;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (bitmapM25076a != this.f97458c) {
                        bitmapM25076a.recycle();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f97456a.isCanceled()) {
                this.f97462g.onWriteCancelled();
            } else if (th == null) {
                this.f97462g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(xbd.f97440g, "Error writing printed content", th);
                this.f97462g.onWriteFailed(null);
            }
        }
    }

    /* JADX INFO: renamed from: xbd$b */
    public interface InterfaceC15026b {
        void onFinish();
    }

    /* JADX INFO: renamed from: xbd$c */
    @c5e(19)
    public class C15027c extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a */
        public final String f97464a;

        /* JADX INFO: renamed from: b */
        public final int f97465b;

        /* JADX INFO: renamed from: c */
        public final Bitmap f97466c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC15026b f97467d;

        /* JADX INFO: renamed from: e */
        public PrintAttributes f97468e;

        public C15027c(String str, int i, Bitmap bitmap, InterfaceC15026b interfaceC15026b) {
            this.f97464a = str;
            this.f97465b = i;
            this.f97466c = bitmap;
            this.f97467d = interfaceC15026b;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            InterfaceC15026b interfaceC15026b = this.f97467d;
            if (interfaceC15026b != null) {
                interfaceC15026b.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f97468e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f97464a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            xbd.this.m25080e(this.f97468e, this.f97465b, this.f97466c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* JADX INFO: renamed from: xbd$d */
    @c5e(19)
    public class C15028d extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a */
        public final String f97470a;

        /* JADX INFO: renamed from: b */
        public final Uri f97471b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC15026b f97472c;

        /* JADX INFO: renamed from: d */
        public final int f97473d;

        /* JADX INFO: renamed from: e */
        public PrintAttributes f97474e;

        /* JADX INFO: renamed from: f */
        public AsyncTask<Uri, Boolean, Bitmap> f97475f;

        /* JADX INFO: renamed from: g */
        public Bitmap f97476g = null;

        /* JADX INFO: renamed from: xbd$d$a */
        public class a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CancellationSignal f97478a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PrintAttributes f97479b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ PrintAttributes f97480c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f97481d;

            /* JADX INFO: renamed from: xbd$d$a$a, reason: collision with other inner class name */
            public class C16557a implements CancellationSignal.OnCancelListener {
                public C16557a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    C15028d.this.m25083a();
                    a.this.cancel(false);
                }
            }

            public a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f97478a = cancellationSignal;
                this.f97479b = printAttributes;
                this.f97480c = printAttributes2;
                this.f97481d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    C15028d c15028d = C15028d.this;
                    return xbd.this.m25079d(c15028d.f97471b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f97481d.onLayoutCancelled();
                C15028d.this.f97475f = null;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!xbd.f97442i || xbd.this.f97455f == 0)) {
                    synchronized (this) {
                        mediaSize = C15028d.this.f97474e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != xbd.m25078c(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                C15028d.this.f97476g = bitmap;
                if (bitmap != null) {
                    this.f97481d.onLayoutFinished(new PrintDocumentInfo.Builder(C15028d.this.f97470a).setContentType(1).setPageCount(1).build(), true ^ this.f97479b.equals(this.f97480c));
                } else {
                    this.f97481d.onLayoutFailed(null);
                }
                C15028d.this.f97475f = null;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.f97478a.setOnCancelListener(new C16557a());
            }
        }

        public C15028d(String str, Uri uri, InterfaceC15026b interfaceC15026b, int i) {
            this.f97470a = str;
            this.f97471b = uri;
            this.f97472c = interfaceC15026b;
            this.f97473d = i;
        }

        /* JADX INFO: renamed from: a */
        public void m25083a() {
            synchronized (xbd.this.f97452c) {
                try {
                    xbd xbdVar = xbd.this;
                    if (xbdVar.f97451b != null) {
                        xbdVar.f97451b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            m25083a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f97475f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            InterfaceC15026b interfaceC15026b = this.f97472c;
            if (interfaceC15026b != null) {
                interfaceC15026b.onFinish();
            }
            Bitmap bitmap = this.f97476g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f97476g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f97474e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f97476g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f97470a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f97475f = new a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            xbd.this.m25080e(this.f97474e, this.f97473d, this.f97476g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public xbd(@efb Context context) {
        this.f97450a = context;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m25076a(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static Matrix m25077b(int i, int i2, RectF rectF, int i3) {
        Matrix matrix = new Matrix();
        float f = i;
        float fWidth = rectF.width() / f;
        float fMax = i3 == 2 ? Math.max(fWidth, rectF.height() / i2) : Math.min(fWidth, rectF.height() / i2);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((rectF.width() - (f * fMax)) / 2.0f, (rectF.height() - (i2 * fMax)) / 2.0f);
        return matrix;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m25078c(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    @c5e(19)
    private static PrintAttributes.Builder copyAttributes(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    private Bitmap loadBitmap(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        InputStream inputStreamOpenInputStream;
        if (uri == null || (context = this.f97450a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e) {
                    Log.w(f97440g, "close fail ", e);
                }
            }
            return bitmapDecodeStream;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    Log.w(f97440g, "close fail ", e2);
                }
            }
            throw th;
        }
    }

    public static boolean systemSupportsPrint() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public Bitmap m25079d(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f97450a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        loadBitmap(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int iMax = Math.max(i, i2);
            int i3 = 1;
            while (iMax > 3500) {
                iMax >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.f97452c) {
                    options = new BitmapFactory.Options();
                    this.f97451b = options;
                    options.inMutable = true;
                    options.inSampleSize = i3;
                }
                try {
                    Bitmap bitmapLoadBitmap = loadBitmap(uri, options);
                    synchronized (this.f97452c) {
                        this.f97451b = null;
                    }
                    return bitmapLoadBitmap;
                } catch (Throwable th) {
                    synchronized (this.f97452c) {
                        this.f97451b = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    @c5e(19)
    /* JADX INFO: renamed from: e */
    public void m25080e(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC15025a(cancellationSignal, f97443j ? printAttributes : copyAttributes(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }

    public int getColorMode() {
        return this.f97454e;
    }

    public int getOrientation() {
        int i = this.f97455f;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public int getScaleMode() {
        return this.f97453d;
    }

    public void printBitmap(@efb String str, @efb Bitmap bitmap) {
        printBitmap(str, bitmap, (InterfaceC15026b) null);
    }

    public void setColorMode(int i) {
        this.f97454e = i;
    }

    public void setOrientation(int i) {
        this.f97455f = i;
    }

    public void setScaleMode(int i) {
        this.f97453d = i;
    }

    public void printBitmap(@efb String str, @efb Bitmap bitmap, @hib InterfaceC15026b interfaceC15026b) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f97450a.getSystemService("print")).print(str, new C15027c(str, this.f97453d, bitmap, interfaceC15026b), new PrintAttributes.Builder().setMediaSize(m25078c(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f97454e).build());
    }

    public void printBitmap(@efb String str, @efb Uri uri) throws FileNotFoundException {
        printBitmap(str, uri, (InterfaceC15026b) null);
    }

    public void printBitmap(@efb String str, @efb Uri uri, @hib InterfaceC15026b interfaceC15026b) throws FileNotFoundException {
        C15028d c15028d = new C15028d(str, uri, interfaceC15026b, this.f97453d);
        PrintManager printManager = (PrintManager) this.f97450a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f97454e);
        int i = this.f97455f;
        if (i == 1 || i == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, c15028d, builder.build());
    }
}
