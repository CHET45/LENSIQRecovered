package com.eyevue.glassapp.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.update.VersionData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import p000.AbstractC11416qc;
import p000.fd9;
import p000.ju9;
import p000.vfe;

/* JADX INFO: loaded from: classes4.dex */
public class UpdateHelper {
    public static final String DOWNLOAD_COMPLETED = "com.yourpackage.DOWNLOAD_COMPLETED";
    private static final String TAG = "UpdateHelper";
    private static String savePath;
    private Long DAYS_FOR_FLEXIBLE_UPDATE = 86400000L;
    private boolean intercept = false;
    private Activity mContext;
    private String mDownloadUrl;
    private int progress;
    private String saveFileName;

    public class DownloadTask extends AsyncTask<Void, Integer, Void> {
        private fd9 broadcastManager;
        private AlertDialog builder;
        private Context context;
        private AbstractC11416qc<Intent> installPermApply;
        private boolean isShowProgress;
        private ProgressBar progressBar;
        private Intent resultIntent = new Intent(UpdateHelper.DOWNLOAD_COMPLETED);

        public DownloadTask(Context context, ProgressBar progressBar, AlertDialog dialog, String downloadUrl, boolean isShowProgress, AbstractC11416qc<Intent> installPermApply) {
            this.context = context;
            this.progressBar = progressBar;
            this.builder = dialog;
            this.isShowProgress = isShowProgress;
            this.installPermApply = installPermApply;
            this.broadcastManager = fd9.getInstance(context);
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voids) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(UpdateHelper.this.mDownloadUrl).openConnection();
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                InputStream inputStream = httpURLConnection.getInputStream();
                String unused = UpdateHelper.savePath = UpdateHelper.this.getSavePath(this.context);
                File file = new File(UpdateHelper.savePath);
                if (!file.exists()) {
                    file.mkdir();
                }
                UpdateHelper.this.saveFileName = UpdateHelper.savePath + "/UpdateEyevue.apk";
                FileOutputStream fileOutputStream = new FileOutputStream(new File(UpdateHelper.this.saveFileName));
                byte[] bArr = new byte[1024];
                int i = 0;
                while (!UpdateHelper.this.intercept) {
                    int i2 = inputStream.read(bArr);
                    i += i2;
                    UpdateHelper.this.progress = (int) ((i / contentLength) * 100.0f);
                    if (this.isShowProgress) {
                        publishProgress(Integer.valueOf(UpdateHelper.this.progress));
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
                fileOutputStream.close();
                inputStream.close();
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void result) {
            super.onPostExecute(result);
            UpdateHelper.this.saveFileName = UpdateHelper.this.getSavePath(this.context) + "/UpdateEyevue.apk";
            if (!this.isShowProgress) {
                this.resultIntent.putExtra("file_path", UpdateHelper.this.saveFileName);
                this.broadcastManager.sendBroadcast(this.resultIntent);
            } else {
                this.builder.cancel();
                UpdateHelper updateHelper = UpdateHelper.this;
                updateHelper.installAPK(this.context, updateHelper.saveFileName, this.installPermApply);
            }
        }

        @Override // android.os.AsyncTask
        public void onProgressUpdate(Integer... values) {
            super.onProgressUpdate((Object[]) values);
            if (this.isShowProgress) {
                this.progressBar.setProgress(values[0].intValue());
            }
        }
    }

    public static class Holder {
        private static final UpdateHelper instance = new UpdateHelper();

        private Holder() {
        }
    }

    public static UpdateHelper getInstance() {
        return Holder.instance;
    }

    private static Uri getUriForFile(Context context, File file) {
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", file);
    }

    public String apkPath(Context context) {
        return getSavePath(context) + "/UpdateEyevue.apk";
    }

    public boolean checkUpdateTime() {
        return System.currentTimeMillis() - vfe.getInstance().getLong("SP_UPDATE_TIME", 0L) >= this.DAYS_FOR_FLEXIBLE_UPDATE.longValue();
    }

    public void checkVersion(Activity activity, VersionData versionData, AbstractC11416qc<Intent> installPermApply, boolean isClick) {
        if (versionData == null) {
            return;
        }
        this.mContext = activity;
        showDownloadDialog(activity, versionData, installPermApply, isClick);
    }

    public void deleteApkIfExists(Context context) {
        File file = new File(apkPath(context));
        if (file.exists()) {
            file.delete();
        }
    }

    public String getSavePath(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return "";
        }
        File file = new File(externalFilesDir, "Download");
        if (!file.exists() && !file.mkdirs()) {
            return "";
        }
        String absolutePath = file.getAbsolutePath();
        savePath = absolutePath;
        return absolutePath;
    }

    public void installAPK(Context context, String saveFileName, AbstractC11416qc<Intent> installPermApply) {
        if (!context.getPackageManager().canRequestPackageInstalls()) {
            installPermApply.launch(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:com.eyevue.glassapp")));
        }
        File file = new File(saveFileName);
        if (file.exists()) {
            Uri uriForFile = getUriForFile(this.mContext, file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            intent.setFlags(268435457);
            this.mContext.startActivity(intent);
        }
    }

    public void showDownloadDialog(final Activity context, final VersionData versionData, final AbstractC11416qc<Intent> installPermApply, boolean isClick) {
        if (checkUpdateTime() || isClick) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            View viewInflate = LayoutInflater.from(context).inflate(C2531R.layout.update_version_dialog, (ViewGroup) null);
            final AlertDialog alertDialogCreate = builder.setView(viewInflate).create();
            alertDialogCreate.getWindow().setBackgroundDrawableResource(C2531R.drawable.dialog_bg);
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            if (versionData.getUpgradeType() == 3) {
                alertDialogCreate.setCanceledOnTouchOutside(false);
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.eyevue.glassapp.helper.UpdateHelper.1
                    @Override // android.content.DialogInterface.OnKeyListener
                    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                        return keyCode == 4 && event.getAction() == 1;
                    }
                });
            }
            final ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(C2531R.id.progressBar);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(C2531R.id.button_layout);
            LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(C2531R.id.button_force_layout);
            Button button = (Button) viewInflate.findViewById(C2531R.id.update_btn);
            ((TextView) viewInflate.findViewById(C2531R.id.update_version_msg)).setText(context.getString(C2531R.string.eyevue_update_version_msg, versionData.getVersion()));
            if (versionData.getUpgradeType() == 1) {
                linearLayout.setVisibility(0);
                linearLayout2.setVisibility(8);
            } else {
                linearLayout2.setVisibility(0);
                linearLayout.setVisibility(8);
            }
            Button button2 = (Button) viewInflate.findViewById(C2531R.id.ok_btn);
            ImageView imageView = (ImageView) viewInflate.findViewById(C2531R.id.cancel_btn);
            final ju9 ju9Var = new ju9();
            this.mDownloadUrl = versionData.getDownloadUrl();
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.eyevue.glassapp.helper.UpdateHelper.2
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    AlertDialog alertDialog = alertDialogCreate;
                    if (alertDialog != null && alertDialog.isShowing()) {
                        alertDialogCreate.cancel();
                    }
                    if (versionData.getUpgradeType() == 1) {
                        vfe.getInstance().putLong("SP_UPDATE_TIME", System.currentTimeMillis());
                        return;
                    }
                    vfe.getInstance().putLong("SP_UPDATE_TIME", 0L);
                    if (ju9Var.startMarket(context)) {
                        alertDialogCreate.cancel();
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.eyevue.glassapp.helper.UpdateHelper.3
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    if (versionData.getUpgradeType() == 1) {
                        vfe.getInstance().putLong("SP_UPDATE_TIME", System.currentTimeMillis());
                    } else {
                        vfe.getInstance().putLong("SP_UPDATE_TIME", 0L);
                    }
                    progressBar.setVisibility(0);
                    UpdateHelper updateHelper = UpdateHelper.this;
                    updateHelper.new DownloadTask(context, progressBar, alertDialogCreate, updateHelper.mDownloadUrl, true, installPermApply).execute(new Void[0]);
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: com.eyevue.glassapp.helper.UpdateHelper.4
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    vfe.getInstance().putLong("SP_UPDATE_TIME", 0L);
                    if (ju9Var.startMarket(context)) {
                        alertDialogCreate.cancel();
                        return;
                    }
                    progressBar.setVisibility(0);
                    UpdateHelper updateHelper = UpdateHelper.this;
                    updateHelper.new DownloadTask(context, progressBar, alertDialogCreate, updateHelper.mDownloadUrl, true, installPermApply).execute(new Void[0]);
                }
            });
            alertDialogCreate.show();
        }
    }
}
