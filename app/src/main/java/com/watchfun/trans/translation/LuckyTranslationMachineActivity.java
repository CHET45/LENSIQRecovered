package com.watchfun.trans.translation;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.NetworkUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.C4035R;
import com.watchfun.trans.database.transmachine.TransMachineDatabase;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.widget.BottomEditView;
import com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import p000.C9243mb;
import p000.ct5;
import p000.d1h;
import p000.dbh;
import p000.dq8;
import p000.eud;
import p000.igg;
import p000.jbh;
import p000.kgh;
import p000.l3h;
import p000.ne4;
import p000.pj4;
import p000.st5;
import p000.t2c;
import p000.uah;
import p000.ubb;
import p000.vfe;
import p000.xt5;

/* JADX INFO: loaded from: classes6.dex */
public class LuckyTranslationMachineActivity extends BaseAsrActivity<C9243mb, TransMachineDatabase> implements MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: r2 */
    public static final String f25710r2 = "TranslationMachineActivity";

    /* JADX INFO: renamed from: s2 */
    public static final String f25711s2 = "extra_show_receive_btn";

    /* JADX INFO: renamed from: F */
    public dbh f25713F;

    /* JADX INFO: renamed from: H */
    public int f25714H;

    /* JADX INFO: renamed from: L */
    public int f25715L;

    /* JADX INFO: renamed from: M */
    public long f25716M;

    /* JADX INFO: renamed from: N */
    public GestureDetector f25718N;

    /* JADX INFO: renamed from: Q */
    public float f25719Q;

    /* JADX INFO: renamed from: X */
    public float f25721X;

    /* JADX INFO: renamed from: Y */
    public boolean f25722Y;

    /* JADX INFO: renamed from: a */
    public kgh f25725a;

    /* JADX INFO: renamed from: b */
    public kgh f25727b;

    /* JADX INFO: renamed from: b2 */
    public float f25728b2;

    /* JADX INFO: renamed from: c */
    public uah f25729c;

    /* JADX INFO: renamed from: d2 */
    public jbh f25732d2;

    /* JADX INFO: renamed from: e */
    public MediaPlayer f25733e;

    /* JADX INFO: renamed from: e2 */
    public String f25734e2;

    /* JADX INFO: renamed from: f */
    public AudioManager f25735f;

    /* JADX INFO: renamed from: j2 */
    public UUID f25740j2;

    /* JADX INFO: renamed from: k2 */
    public boolean f25741k2;

    /* JADX INFO: renamed from: m */
    public long f25743m;

    /* JADX INFO: renamed from: m2 */
    public boolean f25744m2;

    /* JADX INFO: renamed from: o2 */
    public TransLanguageData f25746o2;

    /* JADX INFO: renamed from: p2 */
    public TransLanguageData f25747p2;

    /* JADX INFO: renamed from: q2 */
    public eud f25748q2;

    /* JADX INFO: renamed from: d */
    public boolean f25731d = false;

    /* JADX INFO: renamed from: C */
    public boolean f25712C = false;

    /* JADX INFO: renamed from: Z */
    public boolean f25723Z = false;

    /* JADX INFO: renamed from: M1 */
    public boolean f25717M1 = false;

    /* JADX INFO: renamed from: V1 */
    public long f25720V1 = 0;

    /* JADX INFO: renamed from: Z1 */
    public boolean f25724Z1 = false;

    /* JADX INFO: renamed from: a2 */
    public boolean f25726a2 = false;

    /* JADX INFO: renamed from: c2 */
    public boolean f25730c2 = false;

    /* JADX INFO: renamed from: f2 */
    public ArrayList<dbh> f25736f2 = new ArrayList<>();

    /* JADX INFO: renamed from: g2 */
    public int f25737g2 = 44100;

    /* JADX INFO: renamed from: h2 */
    public int f25738h2 = 16;

    /* JADX INFO: renamed from: i2 */
    public int f25739i2 = 1;

    /* JADX INFO: renamed from: l2 */
    public boolean f25742l2 = true;

    /* JADX INFO: renamed from: n2 */
    public boolean f25745n2 = false;

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$a */
    public class ViewOnClickListenerC4141a implements View.OnClickListener {
        public ViewOnClickListenerC4141a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LuckyTranslationMachineActivity.this.startActivity(new Intent(LuckyTranslationMachineActivity.this, (Class<?>) TransMachineRecordActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$b */
    public class C4142b implements t2c {
        public C4142b() {
        }

        @Override // p000.t2c
        public void onKeyEvent(int type) {
            if (type == 1) {
                LuckyTranslationMachineActivity.this.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$c */
    public class C4143c implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4143c() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_PHONE_MODEL_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$d */
    public class C4144d implements AudioManager.OnAudioFocusChangeListener {
        public C4144d() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$e */
    public class C4145e implements MediaPlayer.OnCompletionListener {
        public C4145e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            if (LuckyTranslationMachineActivity.this.f25733e != null) {
                LuckyTranslationMachineActivity.this.f25733e.reset();
            }
            LuckyTranslationMachineActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$f */
    public class C4146f implements eud.InterfaceC5474b {
        public C4146f() {
        }

        @Override // p000.eud.InterfaceC5474b
        public void onCancel() {
            if (LuckyTranslationMachineActivity.this.checkAndRequestPermissions()) {
                if (!NetworkUtils.isConnected()) {
                    l3h.showToastShort(LuckyTranslationMachineActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                LuckyTranslationMachineActivity.this.f25717M1 = true;
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60382Z.setImageResource(C4035R.drawable.ic_volume_pause);
                LuckyTranslationMachineActivity.this.gptVoice();
                LuckyTranslationMachineActivity.this.f25748q2.dismiss();
                LuckyTranslationMachineActivity.this.f25748q2 = null;
            }
        }

        @Override // p000.eud.InterfaceC5474b
        public void onSure(String name) {
            if (!TextUtils.isEmpty(name)) {
                LuckyTranslationMachineActivity.this.f25732d2.setName(name);
            }
            LuckyTranslationMachineActivity.this.saveRecord();
            LuckyTranslationMachineActivity.this.f25748q2.dismiss();
            LuckyTranslationMachineActivity.this.f25748q2 = null;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$g */
    public class ViewOnClickListenerC4147g implements View.OnClickListener {
        public ViewOnClickListenerC4147g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            LuckyTranslationMachineActivity.this.back();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$h */
    public class ViewOnClickListenerC4148h implements View.OnClickListener {
        public ViewOnClickListenerC4148h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            LuckyTranslationMachineActivity luckyTranslationMachineActivity = LuckyTranslationMachineActivity.this;
            luckyTranslationMachineActivity.startSelectTransActivityForResult(((C9243mb) ((BaseActivity) luckyTranslationMachineActivity).binding).f60390d.getText().toString(), ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60396m.getText().toString(), 1, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode(), 10001);
            LuckyTranslationMachineActivity.this.stopAsr();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$i */
    public class ViewOnClickListenerC4149i implements View.OnClickListener {
        public ViewOnClickListenerC4149i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            LuckyTranslationMachineActivity.this.exchangeLanguage();
            TextView textView = ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60390d;
            LuckyTranslationMachineActivity luckyTranslationMachineActivity = LuckyTranslationMachineActivity.this;
            textView.setText(AiLangUtil.getValue(luckyTranslationMachineActivity, ((BaseAsrActivity) luckyTranslationMachineActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60396m;
            LuckyTranslationMachineActivity luckyTranslationMachineActivity2 = LuckyTranslationMachineActivity.this;
            textView2.setText(AiLangUtil.getValue(luckyTranslationMachineActivity2, ((BaseAsrActivity) luckyTranslationMachineActivity2).toLanguageData.getKeyName()));
            LuckyTranslationMachineActivity.this.f25745n2 = true;
            if (TextUtils.isEmpty(LuckyTranslationMachineActivity.this.f25734e2)) {
                return;
            }
            LuckyTranslationMachineActivity luckyTranslationMachineActivity3 = LuckyTranslationMachineActivity.this;
            luckyTranslationMachineActivity3.startAsrVad(luckyTranslationMachineActivity3.f25734e2);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$j */
    public class ViewOnClickListenerC4150j implements View.OnClickListener {
        public ViewOnClickListenerC4150j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            LuckyTranslationMachineActivity luckyTranslationMachineActivity = LuckyTranslationMachineActivity.this;
            luckyTranslationMachineActivity.startSelectTransActivityForResult(((C9243mb) ((BaseActivity) luckyTranslationMachineActivity).binding).f60396m.getText().toString(), ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60390d.getText().toString(), 2, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode(), 10001);
            LuckyTranslationMachineActivity.this.stopAsr();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$k */
    public class ViewOnClickListenerC4151k implements View.OnClickListener {
        public ViewOnClickListenerC4151k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            LuckyTranslationMachineActivity.this.toggleRecyclerViewFlip();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$l */
    public class ViewOnClickListenerC4152l implements View.OnClickListener {
        public ViewOnClickListenerC4152l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - LuckyTranslationMachineActivity.this.f25743m <= 500) {
                return;
            }
            LuckyTranslationMachineActivity.this.f25743m = System.currentTimeMillis();
            if (LuckyTranslationMachineActivity.this.checkAndRequestPermissions()) {
                if (!NetworkUtils.isConnected()) {
                    l3h.showToastShort(LuckyTranslationMachineActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                LuckyTranslationMachineActivity.this.f25742l2 = false;
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60387b2.setVisibility(0);
                if (LuckyTranslationMachineActivity.this.f25725a != null && LuckyTranslationMachineActivity.this.f25725a.getItemCount() > 0) {
                    ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60385a2.scrollToPosition(LuckyTranslationMachineActivity.this.f25725a.getItemCount() - 1);
                }
                if (LuckyTranslationMachineActivity.this.f25727b != null && LuckyTranslationMachineActivity.this.f25727b.getItemCount() > 0) {
                    ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60387b2.scrollToPosition(LuckyTranslationMachineActivity.this.f25727b.getItemCount() - 1);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (LuckyTranslationMachineActivity.this.f25732d2 == null) {
                    LuckyTranslationMachineActivity.this.f25732d2 = new jbh();
                    LuckyTranslationMachineActivity.this.f25732d2.setTime(jCurrentTimeMillis);
                    LuckyTranslationMachineActivity.this.f25732d2.setName(LuckyTranslationMachineActivity.this.getDefaultRecordName());
                }
                LuckyTranslationMachineActivity luckyTranslationMachineActivity = LuckyTranslationMachineActivity.this;
                luckyTranslationMachineActivity.f25734e2 = luckyTranslationMachineActivity.getPcmPath(jCurrentTimeMillis);
                LuckyTranslationMachineActivity.this.f25732d2.setSourcePcmPath(LuckyTranslationMachineActivity.this.f25734e2);
                LuckyTranslationMachineActivity.this.showGptVoice();
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60382Z.setImageResource(C4035R.drawable.ic_volume_pause);
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60394f.setVisibility(8);
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60374L.setVisibility(8);
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60382Z.setVisibility(0);
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60376M1.setVisibility(0);
                LuckyTranslationMachineActivity.this.f25717M1 = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$m */
    public class ViewOnClickListenerC4153m implements View.OnClickListener {
        public ViewOnClickListenerC4153m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - LuckyTranslationMachineActivity.this.f25743m <= 500) {
                return;
            }
            LuckyTranslationMachineActivity.this.f25743m = System.currentTimeMillis();
            if (!LuckyTranslationMachineActivity.this.f25717M1) {
                if (LuckyTranslationMachineActivity.this.checkAndRequestPermissions()) {
                    if (!NetworkUtils.isConnected()) {
                        l3h.showToastShort(LuckyTranslationMachineActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                        return;
                    }
                    LuckyTranslationMachineActivity.this.f25717M1 = true;
                    ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60382Z.setImageResource(C4035R.drawable.ic_volume_pause);
                    LuckyTranslationMachineActivity.this.gptVoice();
                    return;
                }
                return;
            }
            LuckyTranslationMachineActivity.this.f25730c2 = true;
            LuckyTranslationMachineActivity.this.f25717M1 = false;
            ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60382Z.setImageResource(C4035R.drawable.ic_volume_start);
            LuckyTranslationMachineActivity.this.stopAsr();
            LuckyTranslationMachineActivity.this.hideVoiceView();
            if (LuckyTranslationMachineActivity.this.f25725a.getItemCount() != 0) {
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60373H.setVisibility(8);
            } else {
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60373H.setVisibility(0);
                ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60391d2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$n */
    public class ViewOnClickListenerC4154n implements View.OnClickListener {
        public ViewOnClickListenerC4154n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - LuckyTranslationMachineActivity.this.f25743m <= 500) {
                return;
            }
            LuckyTranslationMachineActivity.this.showTitleDialog();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.LuckyTranslationMachineActivity$o */
    public class C4155o implements BottomEditView.OnEditClickListener {
        public C4155o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<dbh> it = LuckyTranslationMachineActivity.this.f25729c.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            LuckyTranslationMachineActivity.this.f25729c.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            LuckyTranslationMachineActivity.this.f25725a.setEditMode(false);
            LuckyTranslationMachineActivity.this.f25727b.setEditMode(false);
            ((C9243mb) ((BaseActivity) LuckyTranslationMachineActivity.this).binding).f60383Z1.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: fq9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37464a.lambda$onDelete$0();
                    }
                });
            } else {
                for (dbh dbhVar : LuckyTranslationMachineActivity.this.f25725a.getSelectData()) {
                    LuckyTranslationMachineActivity.this.f25729c.deleteSelectData(dbhVar.getMessageTime());
                    xt5.delete(dbhVar.getVoicePath());
                }
                for (dbh dbhVar2 : LuckyTranslationMachineActivity.this.f25727b.getSelectData()) {
                    LuckyTranslationMachineActivity.this.f25729c.deleteSelectData(dbhVar2.getMessageTime());
                    xt5.delete(dbhVar2.getVoicePath());
                }
            }
            LuckyTranslationMachineActivity.this.f25725a.removeSelectData();
            LuckyTranslationMachineActivity.this.f25727b.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            LuckyTranslationMachineActivity.this.f25725a.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        this.f25735f = (AudioManager) getSystemService("audio");
        this.f25735f.requestAudioFocus(new C4144d(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void back() {
        if (this.f25742l2) {
            finish();
            return;
        }
        DialogRecordStopFragment dialogRecordStopFragment = new DialogRecordStopFragment();
        showDialogFragment(dialogRecordStopFragment);
        dialogRecordStopFragment.setOnEventDialog(new C4142b());
    }

    public static long calculateDuration(long fileSizeInBytes, int sampleRate, int bitsPerSample, int channels) {
        return ((fileSizeInBytes / ((long) ((bitsPerSample / 8) * channels))) / ((long) sampleRate)) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptVoice() {
        showGptVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: bq9
            @Override // java.lang.Runnable
            public final void run() {
                this.f14489a.lambda$hideVoiceView$0();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25733e = mediaPlayer;
        mediaPlayer.reset();
    }

    private void initRv() {
        ((C9243mb) this.binding).f60385a2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((C9243mb) this.binding).f60387b2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25725a = new kgh(this, ((C9243mb) this.binding).f60385a2, this.f25729c, false);
        this.f25727b = new kgh(this, ((C9243mb) this.binding).f60387b2, this.f25729c, true);
        this.f25729c.getLatestTen();
        showEmptyView();
        ((C9243mb) this.binding).f60385a2.scrollToPosition(this.f25725a.getItemCount() - 1);
        ((C9243mb) this.binding).f60385a2.setAdapter(this.f25725a);
        ((C9243mb) this.binding).f60385a2.setItemAnimator(null);
        ((C9243mb) this.binding).f60387b2.scrollToPosition(this.f25727b.getItemCount() - 1);
        ((C9243mb) this.binding).f60387b2.setAdapter(this.f25727b);
        ((C9243mb) this.binding).f60387b2.setItemAnimator(null);
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        initRv();
        ((C9243mb) this.binding).f60381Y.setOnClickListener(new ViewOnClickListenerC4147g());
        ((C9243mb) this.binding).f60390d.setOnClickListener(new ViewOnClickListenerC4148h());
        ((C9243mb) this.binding).f60377N.setOnClickListener(new ViewOnClickListenerC4149i());
        ((C9243mb) this.binding).f60396m.setOnClickListener(new ViewOnClickListenerC4150j());
        ((C9243mb) this.binding).f60388c.setOnClickListener(new ViewOnClickListenerC4151k());
        ((C9243mb) this.binding).f60392e.setOnClickListener(new ViewOnClickListenerC4152l());
        ((C9243mb) this.binding).f60382Z.setOnClickListener(new ViewOnClickListenerC4153m());
        ((C9243mb) this.binding).f60376M1.setOnClickListener(new ViewOnClickListenerC4154n());
        ((C9243mb) this.binding).f60386b.setOnEditClickListener(new C4155o());
        ((C9243mb) this.binding).f60374L.setOnClickListener(new ViewOnClickListenerC4141a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$0() {
        if (((C9243mb) this.binding).f60380X.getVisibility() == 0) {
            ((C9243mb) this.binding).f60380X.setVisibility(8);
        }
        if (!this.f25730c2) {
            ((C9243mb) this.binding).f60394f.setVisibility(0);
            ((C9243mb) this.binding).f60374L.setVisibility(0);
            ((C9243mb) this.binding).f60382Z.setVisibility(8);
            ((C9243mb) this.binding).f60376M1.setVisibility(8);
        }
        this.f25730c2 = false;
        this.f25743m = System.currentTimeMillis();
        kgh kghVar = this.f25725a;
        if (kghVar != null && kghVar.getItemCount() > 0) {
            ((C9243mb) this.binding).f60372F.setVisibility(0);
        } else {
            ((C9243mb) this.binding).f60372F.setVisibility(8);
            showEmptyView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$3(MediaPlayer mediaPlayer) {
        this.f25733e.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextGPTResult$1() {
        ((C9243mb) this.binding).f60385a2.scrollToPosition(this.f25725a.getItemCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextGPTResult$2() {
        ((C9243mb) this.binding).f60387b2.scrollToPosition(this.f25727b.getItemCount() - 1);
    }

    private void onFlipCompleted() {
        ((C9243mb) this.binding).f60387b2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveRecord() {
        dbh dbhVar;
        this.f25742l2 = true;
        this.f25743m = System.currentTimeMillis();
        voiceViewGone();
        ((C9243mb) this.binding).f60394f.setVisibility(0);
        ((C9243mb) this.binding).f60374L.setVisibility(0);
        ((C9243mb) this.binding).f60382Z.setVisibility(8);
        ((C9243mb) this.binding).f60376M1.setVisibility(8);
        this.f25717M1 = false;
        ((C9243mb) this.binding).f60382Z.setImageResource(C4035R.drawable.ic_volume_pause);
        this.f25720V1 = 0L;
        if (!this.f25741k2 && (dbhVar = this.f25713F) != null) {
            this.f25736f2.add(dbhVar);
        }
        this.f25732d2.setMessageList(this.f25736f2);
        this.f25732d2.setSourcePcmPath(this.f25734e2);
        File file = new File(this.f25734e2);
        if (file.exists()) {
            this.f25732d2.setDuration(calculateDuration(file.length(), this.f25737g2, this.f25738h2, this.f25739i2));
        }
        this.f25729c.insert(this.f25732d2);
        String mP3Path = ct5.getMP3Path(this, d1h.formatLongToYMDHMSS(this.f25732d2.getTime()), this.f25732d2.getName());
        File file2 = new File(mP3Path);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                Intent intent = new Intent(this, (Class<?>) ConvertIntentService.class);
                intent.putExtra("key_time", this.f25732d2.getTime());
                intent.putExtra("key_pcm_path", this.f25734e2);
                intent.putExtra(ConvertIntentService.f25694d, mP3Path);
                startService(intent);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.f25727b.clearData();
        this.f25725a.clearData();
        this.f25736f2.clear();
        this.f25734e2 = "";
        this.f25732d2 = null;
        this.f25713F = null;
        this.f25714H = -1;
        this.f25715L = -1;
        this.f25745n2 = false;
        showEmptyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            this.f25733e.reset();
            this.f25733e.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25733e.setDataSource(this, Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f25733e.prepareAsync();
            sendPauseKeyEvent(this.f25735f);
            this.f25733e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: cq9
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f27076a.lambda$setupMediaPlayer$3(mediaPlayer);
                }
            });
            this.f25733e.setOnCompletionListener(new C4145e());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 2, new C4143c()).show();
    }

    private void showEmptyView() {
        ((C9243mb) this.binding).f60373H.setVisibility(0);
        ((C9243mb) this.binding).f60391d2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGptVoice() {
        this.type = this.phoneType;
        this.f25725a.setBeginning(true);
        this.f25727b.setBeginning(true);
        ((C9243mb) this.binding).f60380X.setVisibility(0);
        ((C9243mb) this.binding).f60372F.setVisibility(0);
        if (!isDestroyed() && !isFinishing()) {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.ic_volume_lucky)).diskCacheStrategy(ne4.f64120d).into(((C9243mb) this.binding).f60380X);
        }
        ((C9243mb) this.binding).f60373H.setVisibility(8);
        startAsrVad(this.f25734e2);
    }

    private void showTextGPTResult(String sourLangeuage, String text, String translateString, String mp3Filepath, String startTimeId, boolean isFinalResult) {
        this.f25741k2 = isFinalResult;
        if (this.f25742l2 || TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("text-------------------- ");
        sb.append(text);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("translateString-------------------- ");
        sb2.append(translateString);
        if (this.f25713F == null) {
            dbh dbhVar = new dbh();
            this.f25713F = dbhVar;
            dbhVar.setMessageTime(System.currentTimeMillis());
            this.f25713F.setPause(false);
            this.f25725a.addData(this.f25713F);
            this.f25727b.addData(this.f25713F);
            this.f25714H = this.f25725a.getItemCount() - 1;
            this.f25715L = this.f25727b.getItemCount() - 1;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("sourLangeuage-------------------- ");
        sb3.append(sourLangeuage);
        sb3.append("fromLanguageData.getIatLanguage() =");
        sb3.append(this.fromLanguageData.getIatLanguage());
        this.f25713F.setResult(text);
        this.f25713F.setTransResult(translateString);
        if (this.fromLanguageData.getIatLanguage().contains(sourLangeuage)) {
            this.f25713F.setSourceLanguage(((C9243mb) this.binding).f60390d.getText().toString());
            this.f25713F.setTransLanguage(((C9243mb) this.binding).f60396m.getText().toString());
        } else {
            this.f25713F.setSourceLanguage(((C9243mb) this.binding).f60396m.getText().toString());
            this.f25713F.setTransLanguage(((C9243mb) this.binding).f60390d.getText().toString());
        }
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            this.f25713F.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            this.f25713F.setIsGptOrXF(3);
        } else {
            this.f25713F.setIsGptOrXF(1);
        }
        this.f25713F.setType(this.type);
        if (this.f25745n2) {
            this.f25713F.setLanguageChange(true);
        } else {
            this.f25713F.setLanguageChange(false);
        }
        if (isFinalResult) {
            this.f25745n2 = false;
        }
        this.f25713F.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        this.f25725a.notifyItemChanged(this.f25714H);
        this.f25727b.notifyItemChanged(this.f25715L);
        ((C9243mb) this.binding).f60385a2.post(new Runnable() { // from class: dq9
            @Override // java.lang.Runnable
            public final void run() {
                this.f30392a.lambda$showTextGPTResult$1();
            }
        });
        ((C9243mb) this.binding).f60387b2.post(new Runnable() { // from class: eq9
            @Override // java.lang.Runnable
            public final void run() {
                this.f33839a.lambda$showTextGPTResult$2();
            }
        });
        ((C9243mb) this.binding).f60385a2.setItemAnimator(null);
        ((C9243mb) this.binding).f60387b2.setItemAnimator(null);
        if (isFinalResult) {
            if (!TextUtils.isEmpty(mp3Filepath)) {
                this.f25713F.setVoicePath(mp3Filepath);
            }
            this.f25729c.insert(this.f25713F);
            if (!this.f25742l2) {
                this.f25736f2.add(this.f25713F);
            }
            this.f25713F = null;
            this.f25714H = -1;
            this.f25715L = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTitleDialog() {
        if (this.f25717M1) {
            this.f25730c2 = true;
            this.f25717M1 = false;
            ((C9243mb) this.binding).f60382Z.setImageResource(C4035R.drawable.ic_volume_start);
            stopAsr();
            hideVoiceView();
        }
        if (this.f25748q2 == null) {
            this.f25748q2 = new eud(this, new C4146f());
        }
        if (this.f25748q2.isShowing()) {
            return;
        }
        this.f25748q2.show();
    }

    private void stopRecognizerAndRecord() {
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleRecyclerViewFlip() {
        RecyclerView recyclerView = ((C9243mb) this.binding).f60387b2;
        float f = this.f25728b2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(recyclerView, dq8.f30369i, f, f - 180.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
        this.f25728b2 -= 180.0f;
    }

    private void voiceViewGone() {
        hideVoiceView();
        stopAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public TransMachineDatabase getDatabase() {
        return TransMachineDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C9243mb getViewBinding() {
        return C9243mb.inflate(getLayoutInflater());
    }

    public String getDefaultRecordName() {
        int todayRecordCount = this.f25729c.getTodayRecordCount() + 1;
        return d1h.formatLongToDay(System.currentTimeMillis()) + C2473f.f17566z + getResources().getString(C4201R.string.simultaneous_interpretation_transcript) + todayRecordCount;
    }

    public String getPcmPath(long startTime) {
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.US).format(new Date(startTime));
        File file = new File(getExternalFilesDir(null), st5.f82815c);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator + str + ".pcm";
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90931V;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90929U;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C9243mb) this.binding).f60390d.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C9243mb) this.binding).f60396m.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25729c = ((TransMachineDatabase) this.database).messageDao();
        this.f25723Z = getIntent().getBooleanExtra(f25711s2, true);
        initUI();
        startAsrSocket();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        playFile(responseData);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10001 && resultCode == -1) {
            boolean booleanExtra = data.getBooleanExtra(SelectTransActivity.KEY_LANGUAGE_CHANGE, false);
            if (this.f25742l2 || !booleanExtra) {
                return;
            }
            this.f25745n2 = true;
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onAsrResultOnce(String sourLangeuage, String result, String transText, String mp3Filepath, String startTimeId, boolean isFinal) {
        super.onAsrResultOnce(sourLangeuage, result, transText, mp3Filepath, startTimeId, isFinal);
        showTextGPTResult(sourLangeuage, result, transText, mp3Filepath, startTimeId, isFinal);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopRecognizerAndRecord();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        back();
        return true;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            stopAsrSocket();
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, android.app.Activity
    public void onRestart() {
        super.onRestart();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f25744m2) {
            this.f25744m2 = false;
            if (!ubb.isNetworkAvailable(this) || TextUtils.isEmpty(this.f25734e2)) {
                return;
            }
            startAsrVad(this.f25734e2);
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f25744m2 = true;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onStopAsrView() {
        super.onStopAsrView();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onTtsFile(File file) {
        super.onTtsFile(file);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onWebSocketOpen() {
        if (!checkAndRequestPermissions() || this.f25742l2 || TextUtils.isEmpty(this.f25734e2)) {
            return;
        }
        startAsrVad(this.f25734e2);
    }

    public void playFile(File file) {
        MediaPlayer mediaPlayer = this.f25733e;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        if (isAsring()) {
            return;
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f25735f, file, 3);
    }

    public void startAsrVad(String pcmPath) {
        AudioPlayerManager.getInstance().stopAudio();
        if (this.type == this.phoneType) {
            TranslateWebSocketManager.getInstance().startNormalAsrVad(this.fromLanguageData.getIatLanguage(), this.toLanguageData.getIatLanguage(), 300000L, pcmPath, true);
        } else {
            TranslateWebSocketManager.getInstance().startNormalAsrVad(this.toLanguageData.getIatLanguage(), this.fromLanguageData.getIatLanguage(), 300000L, pcmPath, true);
        }
    }

    public void stopPlayback() {
        MediaPlayer mediaPlayer = this.f25733e;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25733e = null;
        }
    }
}
