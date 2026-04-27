package com.eyevue.glassapp.view.sound;

import android.widget.SeekBar;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.watchfun.base.BaseActivity;
import p000.C10867pa;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueQuickVolumeActivity extends BaseActivity<C10867pa> {

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.sound.EyevueQuickVolumeActivity$a */
    public class C2918a implements ModBleResponse.OnVolumeListener {
        public C2918a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVolume$0(int i, int i2, int i3) {
            if (((BaseActivity) EyevueQuickVolumeActivity.this).binding == null) {
                return;
            }
            ((C10867pa) ((BaseActivity) EyevueQuickVolumeActivity.this).binding).f70142m.setProgress(i);
            ((C10867pa) ((BaseActivity) EyevueQuickVolumeActivity.this).binding).f70141f.setProgress(i2);
            ((C10867pa) ((BaseActivity) EyevueQuickVolumeActivity.this).binding).f70140e.setProgress(i3);
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnVolumeListener
        public void onVolume(final int systemVolume, final int mediaVolume, final int callVolume) {
            EyevueQuickVolumeActivity.this.runOnUiThread(new Runnable() { // from class: un5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88545a.lambda$onVolume$0(systemVolume, mediaVolume, callVolume);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.sound.EyevueQuickVolumeActivity$b */
    public class C2919b implements SeekBar.OnSeekBarChangeListener {
        public C2919b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ModUtils.sendViaBle().setVolume(Command.Param.SOUND_SYSTEM, seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.sound.EyevueQuickVolumeActivity$c */
    public class C2920c implements SeekBar.OnSeekBarChangeListener {
        public C2920c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ModUtils.sendViaBle().setVolume(Command.Param.SOUND_MEDIA, seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.sound.EyevueQuickVolumeActivity$d */
    public class C2921d implements SeekBar.OnSeekBarChangeListener {
        public C2921d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ModUtils.sendViaBle().setVolume(Command.Param.SOUND_CALL, seekBar.getProgress());
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C10867pa getViewBinding() {
        return C10867pa.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ((C10867pa) this.binding).f70135C.setTitle(getString(C2531R.string.string_main_sound));
        ModUtils.sendViaBle().getVolume();
        ModUtils.modBleResponse().setOnVolumeListener(new C2918a());
        ((C10867pa) this.binding).f70142m.setOnSeekBarChangeListener(new C2919b());
        ((C10867pa) this.binding).f70141f.setOnSeekBarChangeListener(new C2920c());
        ((C10867pa) this.binding).f70140e.setOnSeekBarChangeListener(new C2921d());
    }
}
