package com.watchfun.transcommon.selectlau;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.watchfun.base.BaseActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.databinding.ActivityAiSelectTarnsBinding;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.selectlau.SelectTransLauAdapter;
import com.watchfun.transcommon.utils.AiLangUtil;
import java.util.ArrayList;
import java.util.List;
import p000.kq7;
import p000.vfe;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class SelectTransActivity extends BaseActivity<ActivityAiSelectTarnsBinding> {
    public static final String KEY_ACTION_TYPE = "key_action_type";
    public static final String KEY_LANGUAGE_CHANGE = "key_language_change";
    public static final String KEY_OTHER_TITLE = "key_other_title";
    public static final String KEY_TITLE = "key_title";
    public static final String KEY_TYPE = "key_type";
    public static final int REQUSET_LANGUAGE_CHANGE_CODE = 10001;
    private static final String TAG = "SelectTransActivity";
    public static final int TYPE_FROM = 1;
    public static final int TYPE_TO = 2;
    private static boolean theme;
    private static kq7 themeDelegate;
    private SelectTransLauAdapter adapter;
    private String keyName;
    private int mActionType;
    private String mTransOtherTxt;
    private String mTransTxt;
    private int mType;

    /* JADX INFO: renamed from: com.watchfun.transcommon.selectlau.SelectTransActivity$3 */
    public static /* synthetic */ class C42283 {
        static final /* synthetic */ int[] $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode;

        static {
            int[] iArr = new int[TransActionEnumMode.values().length];
            $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode = iArr;
            try {
                iArr[TransActionEnumMode.TRANSLATOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.PHONE_HEADSET_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.DUAL_EAR_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.DUAL_FREEDOM_TALK_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.CHAT_GPT_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.VOICE_NOTES_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.VIDEO_AUDIO_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.DUAL_SINGLE_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$watchfun$transcommon$enunmode$TransActionEnumMode[TransActionEnumMode.AUDIO_SCREEN_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filter(String str, List<TransLanguageData> list) {
        ArrayList arrayList = new ArrayList();
        for (TransLanguageData transLanguageData : list) {
            String value = AiLangUtil.getValue(this, transLanguageData.getKeyName());
            if (transLanguageData.getDefaultName().contains(str) || value.contains(str)) {
                arrayList.add(transLanguageData);
            }
        }
        this.adapter.setData(arrayList, this.mTransTxt, this.mType);
        this.adapter.notifyDataSetChanged();
        ((ActivityAiSelectTarnsBinding) this.binding).tvNum.setText(getString(C4201R.string.string_language_num, arrayList.size() + ""));
        ((ActivityAiSelectTarnsBinding) this.binding).tvNum.setTextColor(getColor(C4201R.color.text_important_color));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TransLanguageData getTransLanguageData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (TransLanguageData) new Gson().fromJson(str, TransLanguageData.class);
    }

    private void initUI() {
        final List<TransLanguageData> languageChatGptData;
        ((ActivityAiSelectTarnsBinding) this.binding).tvTitle.setText(getString(C4201R.string.text_select_language));
        ((ActivityAiSelectTarnsBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: xve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99490a.lambda$initUI$0(view);
            }
        });
        ((ActivityAiSelectTarnsBinding) this.binding).selectTransRc.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.adapter = new SelectTransLauAdapter(this);
        int i = this.mActionType;
        if (i != 5 && i != 6) {
            languageChatGptData = AiLangUtil.parseLanguageData(this);
        } else if (i != 5 || (languageChatGptData = AiLangUtil.parseAiChatLanguageData(this)) == null) {
            languageChatGptData = AiLangUtil.parseLanguageChatGptData(this);
        }
        this.adapter.setData(languageChatGptData, this.mTransTxt, this.mType);
        ((ActivityAiSelectTarnsBinding) this.binding).selectTransRc.setAdapter(this.adapter);
        ((ActivityAiSelectTarnsBinding) this.binding).tvNum.setTextColor(getColor(C4201R.color.text_important_color));
        ((ActivityAiSelectTarnsBinding) this.binding).tvNum.setText(getString(C4201R.string.string_language_num, languageChatGptData.size() + ""));
        ((ActivityAiSelectTarnsBinding) this.binding).searchEdit.addTextChangedListener(new TextWatcher() { // from class: com.watchfun.transcommon.selectlau.SelectTransActivity.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SelectTransActivity.this.filter(charSequence.toString(), languageChatGptData);
            }
        });
        ((ActivityAiSelectTarnsBinding) this.binding).searchEdit.setOnTouchListener(new View.OnTouchListener() { // from class: yve
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f103157a.lambda$initUI$1(languageChatGptData, view, motionEvent);
            }
        });
        this.adapter.setOnItemClickListener(new SelectTransLauAdapter.OnItemClickListener() { // from class: com.watchfun.transcommon.selectlau.SelectTransActivity.2
            /* JADX WARN: Removed duplicated region for block: B:17:0x00da A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
            @Override // com.watchfun.transcommon.selectlau.SelectTransLauAdapter.OnItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void click(int r5, com.watchfun.transcommon.bean.TransLanguageData r6) {
                /*
                    Method dump skipped, instruction units count: 354
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.watchfun.transcommon.selectlau.SelectTransActivity.C42272.click(int, com.watchfun.transcommon.bean.TransLanguageData):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initUI$1(List list, View view, MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() != 1 || (drawable = ((ActivityAiSelectTarnsBinding) this.binding).searchEdit.getCompoundDrawables()[2]) == null) {
            return false;
        }
        if (motionEvent.getX() < (((ActivityAiSelectTarnsBinding) this.binding).searchEdit.getWidth() - ((ActivityAiSelectTarnsBinding) this.binding).searchEdit.getCompoundDrawablePadding()) - drawable.getIntrinsicWidth()) {
            return false;
        }
        ((ActivityAiSelectTarnsBinding) this.binding).searchEdit.setText("");
        filter("", list);
        return true;
    }

    public static SelectTransActivity newInstance() {
        return new SelectTransActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(TransLanguageData transLanguageData) {
        TransActionEnumMode transActionEnumMode = TransActionEnumMode.TRANSLATOR_TYPE;
        yi9.m26090d(TAG, "mActionType" + this.mActionType);
        transActionEnumMode.handleTransLanguage(this.mType, transLanguageData, this.mActionType);
        Intent intent = new Intent();
        if (this.mTransTxt.equals(AiLangUtil.getValue(this, transLanguageData.getKeyName()))) {
            intent.putExtra(KEY_LANGUAGE_CHANGE, false);
        } else {
            intent.putExtra(KEY_LANGUAGE_CHANGE, true);
        }
        setResult(-1, intent);
        finish();
    }

    public static void setThemeDelegate(kq7 kq7Var, boolean z) {
        themeDelegate = kq7Var;
        theme = vfe.getInstance().getBoolean("THEME_DARK", false);
    }

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public String getPageName() {
        return "select";
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.mTransTxt = intent.getStringExtra(KEY_TITLE);
        this.mTransOtherTxt = intent.getStringExtra(KEY_OTHER_TITLE);
        this.mType = intent.getIntExtra(KEY_TYPE, 0);
        this.mActionType = intent.getIntExtra(KEY_ACTION_TYPE, 0);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        kq7 kq7Var = themeDelegate;
        if (kq7Var != null) {
            kq7Var.initTheme(this);
            themeDelegate.setStatusBarDark(this, theme, false, false);
        }
        initUI();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        kq7 kq7Var = themeDelegate;
        if (kq7Var != null) {
            kq7Var.initTheme(this);
            themeDelegate.setStatusBarDark(this, theme, false, false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        kq7 kq7Var = themeDelegate;
        if (kq7Var != null) {
            kq7Var.initTheme(this);
            themeDelegate.setStatusBarDark(this, theme, false, false);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public ActivityAiSelectTarnsBinding getViewBinding() {
        return ActivityAiSelectTarnsBinding.inflate(getLayoutInflater());
    }
}
